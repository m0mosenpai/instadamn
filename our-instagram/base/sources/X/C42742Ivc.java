package X;

/* renamed from: X.Ivc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42742Ivc implements InterfaceC61642rR {
    public final /* synthetic */ HY7 A00;

    public C42742Ivc(HY7 hy7) {
        this.A00 = hy7;
    }

    @Override // X.InterfaceC61642rR
    public final void AJs(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, Double d, String str, String str2, boolean z) {
        HY7 hy7 = this.A00;
        if ((AbstractC31178DnM.A1a(hy7.A03) && !z) || enumC37671p4 == null || anonymousClass320 == null) {
            ((C006802i) AbstractC166987dD.A17(hy7.A01)).markerEnd(424097382, (short) 3);
        } else {
            ((C006802i) AbstractC166987dD.A17(hy7.A01)).markerEnd(424097382, (short) 2);
            hy7.CoM(new C9C3(d, null, null, 5, false), anonymousClass320, enumC37671p4, str, str2, 1.0d, false);
        }
        hy7.A00 = false;
    }
}
