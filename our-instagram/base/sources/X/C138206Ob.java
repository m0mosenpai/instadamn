package X;

/* renamed from: X.6Ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138206Ob extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C2ZH A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138206Ob(C2ZH c2zh, String str, double d) {
        super(1);
        this.A01 = c2zh;
        this.A02 = str;
        this.A00 = d;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        C2ZE.A00(new C5Q5(str, Double.valueOf(this.A00), this.A02));
        return C0eB.A00;
    }
}
