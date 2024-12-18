package X;

import com.facebook.common.dextricks.DexStore;

/* renamed from: X.LpI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49201LpI implements InterfaceC1352169w {
    public C1351969u A00;
    public final C6Eh A01 = new LVO(this, 3);

    @Override // X.InterfaceC1352169w
    public final /* bridge */ /* synthetic */ void EgM(Object obj) {
        C1351969u c1351969u = (C1351969u) obj;
        C14360o3.A0B(c1351969u, 0);
        C42201xA c42201xA = C1334460n.A06;
        this.A00 = c1351969u;
        C218914p.A08();
        if (!C218914p.A08()) {
            AbstractC46868KoB.A00(c1351969u.A01);
        } else {
            C14270nr.A00().A01(new KLW(c1351969u), 30000L);
        }
        c1351969u.A01.getAccountSession().getSessionedNotificationCenter().addObserver(this.A01, "MEMOfflineHandlingCompletionNotification", 1, null);
    }

    @Override // X.InterfaceC1352169w
    public final void Epz() {
        C42201xA c42201xA = C1334460n.A06;
        C1351969u c1351969u = this.A00;
        if (c1351969u == null) {
            C14360o3.A0F(DexStore.DEPS_FILENAME);
            throw C00O.createAndThrow();
        }
        c1351969u.A01.getAccountSession().getSessionedNotificationCenter().removeObserver(this.A01, "MEMOfflineHandlingCompletionNotification", null);
    }
}
