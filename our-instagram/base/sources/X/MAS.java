package X;

/* loaded from: classes8.dex */
public final class MAS extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0255  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAS(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = i;
    }

    public static MAS A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new MAS(obj, interfaceC23621Ds, i, 42);
    }

    public static void A01(Object obj, MAS mas) {
        mas.A02 = obj;
        mas.A00 |= Integer.MIN_VALUE;
    }

    public static void A02(Object obj, MAS mas) {
        mas.A01 = obj;
        mas.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof MAS) && ((MAS) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAS(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAS(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
