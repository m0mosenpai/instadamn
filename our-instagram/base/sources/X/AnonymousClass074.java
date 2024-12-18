package X;

/* renamed from: X.074, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass074 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass074(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                if (obj == this.A01) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                C17v c17v = (C17v) obj;
                C14360o3.A0B(c17v, 0);
                return ((CharSequence) this.A01).subSequence(c17v.A00, c17v.A01 + 1).toString();
            default:
                AnonymousClass198 anonymousClass198 = (AnonymousClass198) this.A01;
                if (anonymousClass198.isActive()) {
                    anonymousClass198.AGH(new C10C(anonymousClass198));
                }
                return C0eB.A00;
        }
    }
}
