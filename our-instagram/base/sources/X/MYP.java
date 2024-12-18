package X;

/* loaded from: classes9.dex */
public final class MYP extends C0YY implements InterfaceC16620sF {
    public static final MYP A00 = new MYP();

    public MYP() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf((((Number) obj).longValue() > ((Number) obj2).longValue() ? 1 : (((Number) obj).longValue() == ((Number) obj2).longValue() ? 0 : -1)));
    }
}
