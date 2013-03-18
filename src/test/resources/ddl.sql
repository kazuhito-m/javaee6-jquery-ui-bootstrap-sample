-- DDL

CREATE TABLE SEQUENCE (
	SEQ_NAME VARCHAR(50) PRIMARY KEY,
	SEQ_COUNT DECIMAL(15,0)
);

COMMENT ON TABLE SEQUENCE IS '論理共通シーケンス';
COMMENT ON COLUMN SEQUENCE.SEQ_NAME IS 'シーケンス名';
COMMENT ON COLUMN SEQUENCE.SEQ_COUNT IS '現在番号';

CREATE TABLE STUDYMEETING (
    ID INTEGER PRIMARY KEY,
    TITLE VARCHAR(128) NOT NULL,
    SUBTITLE VARCHAR(128) NOT NULL,
    CONTEXT VARCHAR(1024) NOT NULL,
    EXHIBITIONDATE DATE NOT NULL,
    PARTICIPANTCOUNT INTEGER 
);

COMMENT ON TABLE STUDYMEETING IS '勉強会';
COMMENT ON COLUMN STUDYMEETING.ID IS 'ID';
COMMENT ON COLUMN STUDYMEETING.TITLE IS 'タイトル';
COMMENT ON COLUMN STUDYMEETING.SUBTITLE IS 'サブタイトル';
COMMENT ON COLUMN STUDYMEETING.CONTEXT IS '内容';
COMMENT ON COLUMN STUDYMEETING.EXHIBITIONDATE IS '開催日';
COMMENT ON COLUMN STUDYMEETING.PARTICIPANTCOUNT IS '参加者数';

CREATE TABLE TOTALOFSTUDYMEETING (
	ID INTEGER PRIMARY KEY,
	TITLE VARCHAR(128) NOT NULL ,
	FROMDATE DATE NOT NULL,
	TODATE DATE NOT NULL,
	TIMES INTEGER NOT NULL,
	TOTALPARTICIPANTCOUNT INTEGER NOT NULL
);

COMMENT ON TABLE TOTALOFSTUDYMEETING IS '勉強会集計';
COMMENT ON COLUMN TOTALOFSTUDYMEETING.ID IS 'ID';
COMMENT ON COLUMN TOTALOFSTUDYMEETING.TITLE IS 'タイトル';
COMMENT ON COLUMN TOTALOFSTUDYMEETING.FROMDATE IS '集計開始日';
COMMENT ON COLUMN TOTALOFSTUDYMEETING.TODATE IS '集計終了日';
COMMENT ON COLUMN TOTALOFSTUDYMEETING.TIMES IS '開催回数';
COMMENT ON COLUMN TOTALOFSTUDYMEETING.TOTALPARTICIPANTCOUNT IS 'のべ参加者数';

