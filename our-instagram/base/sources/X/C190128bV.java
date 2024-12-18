package X;

/* renamed from: X.8bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C190128bV extends C03E implements InterfaceC16610sE {
    public static final C190128bV A00 = new C190128bV();

    public C190128bV() {
        super(3, C190118bU.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        final C190118bU c190118bU = (C190118bU) obj;
        final C2QS c2qs = (C2QS) obj2;
        long j = c190118bU.A00;
        if (j <= 0) {
            c2qs.A01 = C0eB.A00;
        } else {
            Runnable runnable = new Runnable() { // from class: X.8bW
                @Override // java.lang.Runnable
                public final void run() {
                    C2QS.A00(c190118bU, C0eB.A00, c2qs);
                }
            };
            C14360o3.A0C(c2qs, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C12W c12w = c2qs.A04;
            c2qs.A00 = AbstractC89993zf.A04(c12w).CPF(runnable, c12w, j);
        }
        return C0eB.A00;
    }
}
