# 미션 - 워들

## 🔍 진행 방식

- 미션은 **기능 요구 사항, 프로그래밍 요구 사항, 과제 진행 요구 사항** 세 가지로 구성되어 있다.
- 세 개의 요구 사항을 만족하기 위해 노력한다. 특히 기능을 구현하기 전에 기능 목록을 만들고, 기능 단위로 커밋 하는 방식으로 진행한다.
- 기능 요구 사항에 기재되지 않은 내용은 스스로 판단하여 구현한다.

---

## 🚀 기능 요구 사항

선풍적인 인기를 끌었던 영어 단어 맞추기 게임이다.

- 6x5 격자를 통해서 5글자 단어를 6번 만에 추측한다.
- 플레이어가 답안을 제출하면 프로그램이 정답과 제출된 단어의 각 알파벳 종류와 위치를 비교해 판별한다.
- 판별 결과는 흰색의 타일이 세 가지 색(초록색/노란색/회색) 중 하나로 바뀌면서 표현된다.
   - 맞는 글자는 초록색, 위치가 틀리면 노란색, 없으면 회색
   - 두 개의 동일한 문자를 입력하고 그중 하나가 회색으로 표시되면 해당 문자 중 하나만 최종 단어에 나타난다.
- 정답과 답안은 `words.txt`에 존재하는 단어여야 한다.
- 정답은 매일 바뀌며 ((현재 날짜 - 2021년 6월 19일) % 배열의 크기) 번째의 단어이다.

### 입출력 요구 사항

#### 실행 결과 예시

```
WORDLE을 6번 만에 맞춰 보세요.
시도의 결과는 타일의 색 변화로 나타납니다.
정답을 입력해 주세요.
hello

⬜⬜🟨🟩⬜

정답을 입력해 주세요.
label

⬜⬜🟨🟩⬜
🟨⬜⬜⬜🟩

정답을 입력해 주세요.
spell

⬜⬜🟨🟩⬜
🟨⬜⬜⬜🟩
🟩🟩⬜🟩🟩

정답을 입력해 주세요.
spill

4/6

⬜⬜🟨🟩⬜
🟨⬜⬜⬜🟩
🟩🟩⬜🟩🟩
🟩🟩🟩🟩🟩
```
  
## 요구사항  
- [X] 하나의 Tile이 있다. => (Tile)
  - [X] Tile에는 문자가 들어간다.
    - [X] 알파벳만 입력이 가능하다.
  - [X] Tile과 Tile은 비교할 수 있다.
- [X] 여러개의 Tile을 묶는다. => (Tiles) (입력되어서 생성된 Tiles)
  - [X] Tiles는 5글자를 받는다.
  - [X] Tiles는 5개의 Tile로 구성이 되어있다.
- [X] 정답이 있다. => (Answer)
  - [X] Answer는 5글자를 받는다.
  - [X] Answer는 5개의 Tile로 구성이 되어있다.
  - [X] 정답과 비교하여 같은 위치에 있으면 GREEN이다
  - [X] 정답에는 있지만 위치가 다르면 노란색
  - [X] 아예 없으면 회색
  - [X] 정답에 있는 타일은 n개이지만, 입력한 타일은 n + 1개 이상인 경우 초록 -> 노란색 -> 회색순으로 우선순위를 가진다
- [X] 게임이 있다 => (Game)
  - [X] 기회는 총 6번을 입력할 수 있다.
  - [X] 정답을 적으면 게임이 끝난다.
  - [X] 정답과 답안은 정답 저장소에 존재하는 단어여야 한다.
  - [X] 결과를 전달할 수 있다.

### PRESENTATION
- [ ] DefaultOutput
  - [ ] 새로운 문자를 적으면 과거에 있던 결과도 같이 표출된다.
  - [ ] 지금까지 입력한 Tiles를 가지고 있는다.
- [ ] DefaultWordsRepository
  - [ ] 정답과 답안은 `words.txt`에 존재하는 단어여야 한다.
  - [ ] 정답은 매일 바뀌며 ((현재 날짜 - 2021년 6월 19일) % 배열의 크기) 번째의 단어이다.