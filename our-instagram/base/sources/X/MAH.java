package X;

/* loaded from: classes8.dex */
public final class MAH extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0211  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAH(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    public static void A00(Object obj, MAH mah) {
        mah.A02 = obj;
        mah.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MAH) && ((MAH) obj).A03 == i) {
            return true;
        }
        return false;
    }
}
