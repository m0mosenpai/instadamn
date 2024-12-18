package X;

/* renamed from: X.Orp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55901Orp implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "AnalyticsInfoUseCaseImpl$analyticsModule$1";
    public final /* synthetic */ C54624OAz A00;

    public C55901Orp(C54624OAz c54624OAz) {
        this.A00 = c54624OAz;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str;
        C51932MxF c51932MxF;
        C41181vS c41181vS;
        C54624OAz c54624OAz = this.A00;
        Object value = c54624OAz.A01.A02.getValue();
        if ((value instanceof C51932MxF) && (c51932MxF = (C51932MxF) value) != null && (c41181vS = c51932MxF.A01) != null) {
            if (c41181vS.A18()) {
                str = "live_";
            } else if (c41181vS.A0f != null) {
                str = AbstractC111324zv.A00(5408);
            }
            return AnonymousClass001.A0R(str, c54624OAz.A02);
        }
        str = "reel_";
        return AnonymousClass001.A0R(str, c54624OAz.A02);
    }
}
