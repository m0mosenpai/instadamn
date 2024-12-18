package X;

/* loaded from: classes8.dex */
public final class MAR extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAR(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static Object A00(Object obj, MAR mar) {
        mar.A02 = obj;
        mar.A00 |= Integer.MIN_VALUE;
        return mar.A01;
    }

    public static MAR A01(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new MAR(obj, interfaceC23621Ds, i, 42);
    }

    public static void A02(Object obj, MAR mar) {
        mar.A01 = obj;
        mar.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof MAR) && ((MAR) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAR(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
