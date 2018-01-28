;redcode-94
;name Sleepy
;author John Q. Smith
;strategy bombing core
        org sleepy
sleepy: ADD #10, -1
        MOV 2, @-1
        JMP -2
        DAT #33, #33
end
