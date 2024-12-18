package X;

/* loaded from: classes11.dex */
public final class X69 extends C0YY implements InterfaceC16620sF {
    public static final X69 A00 = new X69();

    public X69() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        if (str.length() == 0) {
            return obj2.toString();
        }
        return AbstractC167017dG.A0n(obj2, ", ", AbstractC166997dE.A11(str));
    }
}
