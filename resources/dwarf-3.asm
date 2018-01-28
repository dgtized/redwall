;redcode-94
;name Dwarf
;author A.K. Dewdney
;strategy Bombs the core at regular intervals.
;(slightly modified by Ilmari Karonen)
;assert CORESIZE % 4 == 0

        org     loop

loop:   add.ab  #4, bomb
        mov.i   bomb, @bomb
        jmp     loop
bomb:   dat     #0, #0

        end
