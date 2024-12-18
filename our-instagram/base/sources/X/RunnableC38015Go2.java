package X;

/* renamed from: X.Go2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38015Go2 implements Runnable {
    public final /* synthetic */ C37661Ghu A00;

    public RunnableC38015Go2(C37661Ghu c37661Ghu) {
        this.A00 = c37661Ghu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37661Ghu c37661Ghu = this.A00;
        c37661Ghu.A07 = false;
        c37661Ghu.A02 = null;
        InterfaceC19630xq interfaceC19630xq = c37661Ghu.A0E;
        if (AbstractC37300Gc1.A00(interfaceC19630xq.getLong("KEY_LAST_SEEN_TIMESTAMP_MS", 0L)) > 86400000 && C37546Gg2.A01(c37661Ghu.A0J) > 1 && !c37661Ghu.A08) {
            if (c37661Ghu.A0K) {
                C43754JWs c43754JWs = c37661Ghu.A0G;
                InterfaceC16820sZ interfaceC16820sZ = c37661Ghu.A0I;
                if (c43754JWs.A01(AbstractC25226BEj.A17(interfaceC16820sZ).A03()) != null) {
                    boolean A1W = AbstractC167007dF.A1W(c43754JWs.A01(AbstractC25226BEj.A17(interfaceC16820sZ).A03() + 1));
                    boolean z = interfaceC19630xq.getBoolean("KEY_HAS_SEEN_DIRECT_SWIPE_UP_NUX", false);
                    if (A1W && !z) {
                        c37661Ghu.A02 = true;
                        c37661Ghu.A07 = true;
                        C37661Ghu.A02(c37661Ghu);
                    }
                }
            }
            if (!(!interfaceC19630xq.getBoolean("KEY_HAS_SUCCESSFULLY_SWIPED", false))) {
                boolean A1O = AbstractC167007dF.A1O((AbstractC37300Gc1.A00(interfaceC19630xq.getLong("KEY_LAST_SWIPED_TIMESTAMP_MS", 0L)) > 259200000L ? 1 : (AbstractC37300Gc1.A00(interfaceC19630xq.getLong("KEY_LAST_SWIPED_TIMESTAMP_MS", 0L)) == 259200000L ? 0 : -1)));
                boolean z2 = !interfaceC19630xq.getBoolean("KEY_SCROLLED_ON_LAST_VIEW", false);
                if (!A1O || !z2) {
                    return;
                }
            }
            C37661Ghu.A02(c37661Ghu);
        }
    }
}
