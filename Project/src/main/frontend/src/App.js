
import './App.css';

import axios from 'axios'
import { useState } from 'react'

function App() {
	const [id, setId] = useState();
	const [pw, setPw] = useState();


	function tryLogin() {

		axios.get("http://localhost:8084/controller/login", {
			params: {
				id: id,
				pw: pw
			}
		})
			.then(res => {
				console.log(res.data);
				if (res.data === 1) {
					console.log("로그인 성공!");
				} else {
					console.log("로그인 실패!");
				}
			})
			.catch(err => {
				console.error("연결 실패:", err);
			});

		// axios.post(
		//     'http://localhost:8083/controller/login',
		//     {id:id, 
		//     pw:pw}
		// )
		// .then((res)=>{
		//     console.log(res)
		// })
	}
	return (
		<div className="App">

			<h1>Login</h1>
         ID : <input onChange={(e) => setId(e.target.value)}></input>
			<br></br>
         PW : <input onChange={(e) => setPw(e.target.value)}></input>
			<br></br>
			<button onClick={tryLogin}>로그인 시도중</button>

		</div>
	);
}

export default App;
