package X;

/* loaded from: classes11.dex */
public final class X6C extends C0YY implements InterfaceC16620sF {
    public static final X6C A00 = new X6C();

    public X6C() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AbstractC167017dG.A1N(str, obj2);
        if (str.length() == 0) {
            return obj2.toString();
        }
        return AbstractC167017dG.A0n(obj2, ", ", AbstractC166997dE.A11(str));
    }
}
