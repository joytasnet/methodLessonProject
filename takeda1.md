#武田作　メソッド問題1

## 問題文

いくつかの盆栽を置き、盆栽と盆栽の間には苔玉を配置しよう。  
盆栽を円状に配置するか、直線状に配置するかを決め、  
苔玉がいくつ必要になるかを求めるメソッドを作成せよ。  
なお、使用するメソッドは  
static boolean circleOrLine(int bonsaiNum,boolean isRound)  
とする。

## 実行例

```
どうする？1...円状に配置する 0...直線状に配置する
>1
盆栽の数を入力してください>8
円状に8個配置する時、必要な苔玉は8個です。
```

# 先生より
数を返すメソッドにしたほうがよいです。
static int circleOrLine(int bonsaiNum,boolean isRound)

