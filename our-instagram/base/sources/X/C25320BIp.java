package X;

/* renamed from: X.BIp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25320BIp implements C5TO {
    public static final C25320BIp A00 = new Object();

    @Override // X.C5TO
    public final InterfaceC16820sZ COl(C5TM c5tm) {
        if (c5tm.isAttachedToWindow()) {
            C07X A002 = AbstractC55832hO.A00(c5tm);
            if (A002 != null) {
                return AbstractC25323BIs.A00(c5tm, A002.getLifecycle());
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("View tree for ");
            A1C.append(c5tm);
            AbstractC28290Cdc.A02(AbstractC166997dE.A0x(" has no ViewTreeLifecycleOwner", A1C));
            throw C00O.createAndThrow();
        }
        C15370ps A1F = AbstractC25225BEi.A1F();
        BJ6 bj6 = new BJ6(0, A1F, c5tm);
        c5tm.addOnAttachStateChangeListener(bj6);
        A1F.A00 = new DH1(21, bj6, c5tm);
        return new C57514Pfo(A1F, 3);
    }
}
