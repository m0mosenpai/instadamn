package X;

/* renamed from: X.06Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C06Q extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ CharSequence A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Q(CharSequence charSequence) {
        super(1);
        this.A00 = charSequence;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C17v c17v = (C17v) obj;
        C14360o3.A0B(c17v, 0);
        return this.A00.subSequence(c17v.A00, c17v.A01 + 1).toString();
    }
}
