def func1(arg1, arg2):
    var10 = func2(arg1, arg2)
    var11 = func5()
    var15 = func6(var10, var11)
    var27 = var18(var11, var10)
    var28 = var11 ^ var15
    var29 = var27 ^ arg2 & var28 | var27
    var30 = (var11 | var15 | var10) | -317208230
    var31 = arg1 ^ var29 | var11
    if arg1 < var29:
        var32 = var30 - var29
    else:
        var32 = var11 | var15
    var33 = (var11 ^ var27) + var11 & -627541465
    var34 = arg1 & var10
    var35 = (var30 - arg2 | var34) & var15
    var36 = (var11 ^ arg1 ^ var15) | -1032548319
    var37 = var15 & 50 + var33 | arg1
    if var31 < var31:
        var38 = var29 & var30 + var33 & var30
    else:
        var38 = var31 ^ -107 - var15
    var39 = var35 - var10 + var11 & var28
    var40 = var30 - var10
    var41 = var28 - var29 | var29 + var11
    var42 = var41 ^ var29 & var11 - 666
    var43 = (var35 & -1449294689) - var35 - arg2
    var44 = var34 ^ (var34 | 1267082656 | var42)
    var45 = var11 | var42
    result = (var31 ^ ((var15 | arg1) - var40 | var37) & (var31 & arg1 + var29) ^ var43) - var30 | arg1 ^ var35
    return result
def func10(arg19, arg20):
    var21 = func13()
    var22 = arg19 ^ 312616123
    var23 = var22 + var21 | (arg20 | -469 | var21) | var21
    var24 = var21 ^ var22
    var25 = var22 | var23 & (var21 - var23) & (arg20 & var22) & 279
    var26 = -79374644 ^ arg20
    result = arg20 - 532801510 + arg20 ^ (var22 - (104 & var25))
    return result
def func13():
    func11()
    result = len(xrange(24))
    func12()
    return result
def func12():
    global len
    del len
def func11():
    global len
    len = lambda x : 8
def func9():
    closure = [-5]
    def func8(arg16, arg17):
        closure[0] += func10(arg16, arg17)
        return closure[0]
    func = func8
    return func
var18 = func9()
def func5():
    func3()
    result = len(range(15))
    func4()
    return result
def func4():
    global len
    del len
def func3():
    global len
    len = lambda x : 2
def func2(arg3, arg4):
    var5 = -58444406 ^ ((arg4 + -411) ^ 163148162)
    var6 = (var5 - (-963596503 ^ (arg3 & arg4))) + -161
    var7 = (((arg4 & arg3 - ((arg4 - ((var5 - (var6 - arg3) ^ ((-536 ^ -3487704) & (242573507 & var6) + 892) - (1237435849 & 1101025836)) - arg4 | var6 + arg4) ^ var6) & var6)) | arg3) + 928640652 + var5) & var6
    if var6 < var5:
        var8 = var7 ^ arg4 & 457
    else:
        var8 = var7 + var7
    var9 = (arg3 & var5 - arg3) & (arg4 - (944 + var5) ^ var5 + var7 + ((arg3 ^ (1296990466 | arg3) - 895 | (((var7 ^ -2120963634) + arg3) | var6) ^ var5) | arg4) ^ var7 + var5 - -405) ^ var6
    result = (arg3 & arg3 ^ (-82 + 509 - var5)) + (-115 - var9 + -742385132 - var6 + var9 + var9)
    return result
def func6(arg12, arg13):
    def func7(acc, rest):
        var14 = -4 + (-4 - -4)
        if acc == 0:
            return var14
        else:
            result = func7(acc - 1, var14)
            return result
    result = func7(10, 0)
    return result
if __name__ == "__main__":
    print 'prog_size: 5'
    print 'func_number: 14'
    print 'arg_number: 46'
    for i in xrange(25000):
        x = 5
        x = func1(x, i)
        print x,
