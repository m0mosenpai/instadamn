package X;

/* renamed from: X.9Fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207439Fw extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                C14360o3.A0B(str, 0);
                ((InterfaceC132365yF) this.A02).CrX(C2Fb.A2r, str, this.A03, null, this.A01);
                break;
            case 1:
                String str2 = (String) obj;
                C14360o3.A0B(str2, 0);
                C2ZE.A00(new C5Q5(str2, Long.valueOf(this.A01), this.A03));
                break;
            default:
                String str3 = (String) obj;
                C14360o3.A0B(str3, 0);
                C2ZE.A00(new C3DR(str3, this.A03, null, this.A01));
                break;
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207439Fw(Object obj, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = j;
    }
}
