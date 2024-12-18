package X;

/* renamed from: X.3e3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77783e3 extends C2V9 implements C2VC, C2VD {
    public final String A00;
    public final InterfaceC16660sJ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77783e3(String str, InterfaceC16660sJ interfaceC16660sJ) {
        super(new C2VE(null, null), -1);
        C14360o3.A0B(interfaceC16660sJ, 3);
        this.A01 = interfaceC16660sJ;
        this.A00 = str;
        super.A00.A01 = this;
    }

    @Override // X.C2V9
    public final Object A00(Object obj) {
        C14360o3.A0B(obj, 0);
        C206859Dq c206859Dq = new C206859Dq(this, 11);
        String str = this.A00;
        if (str != null && str.length() != 0) {
            c206859Dq.invoke();
        }
        Object invoke = this.A01.invoke(obj);
        if (str != null && str.length() != 0) {
            C1LN.A00();
        }
        return invoke;
    }

    @Override // X.C2VC
    public final Object APq(C2V9 c2v9, Object obj) {
        C14360o3.A0B(obj, 1);
        return this.A01.invoke(obj);
    }

    @Override // X.C2V9
    /* renamed from: A01 */
    public final boolean CTz(C2V9 c2v9) {
        if (this == c2v9) {
            return true;
        }
        if (c2v9 != null && C14360o3.A0K(getClass(), c2v9.getClass())) {
            return C14360o3.A0K(this.A01, ((C77783e3) c2v9).A01);
        }
        return false;
    }

    @Override // X.C2VD
    public final C2VC B2i() {
        return this;
    }
}
