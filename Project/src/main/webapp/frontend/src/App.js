
import './App.css';

import axios from 'axios'
import { useState } from 'react'

function App() {
  const [id, setId] = useState();
  const [pw, setPw] = useState();


  function tryLogin(){
     
      // axios.get(  
      //     'http://localhost:8083/controller/login',
      // // get방식으로 데이터를 보낼때는 params 라는 키값으로 묶어서 보낼것
      // //http://localhost:8083/controller/login?id=&pw=pw

      //    { params : {id:id, 
      //     pw:pw}}
      // )
      // .then((res)=>{
      //     console.log(res)
      //     console.log(res.data)

      //     if(res.data==1){
      //       // 로그인 성공시 이동페이지
      //     }

      // })

      axios.post(
          'http://localhost:8083/controller/login',
          {id:id, 
          pw:pw}
      )
      .then((res)=>{
          console.log(res)
      })
  }
  return (
    <div className="App">
 
        <h1>Login</h1>
        <h1>살려줘</h1>
        <h1>살려줘2</h1>
         ID : <input onChange={(e)=>setId(e.target.value)}></input>
         <br></br>
         PW : <input onChange={(e)=>setPw(e.target.value)}></input>
         <br></br>
         <button onClick={tryLogin}>로그인 시도중</button>
  
    </div>
  );
}

export default App;
