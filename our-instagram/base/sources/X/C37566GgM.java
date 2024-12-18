package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GgM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37566GgM {
    public boolean A00;
    public boolean A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C37568GgO A04;
    public final Context A05;
    public final C37567GgN concurrentPlayerManager;

    public final void A00() {
        C5TA c5ta;
        this.A00 = false;
        if (this.A01) {
            C37568GgO c37568GgO = this.A04;
            J28 j28 = c37568GgO.A03;
            if (j28 != null && (c5ta = j28.A01) != null) {
                c5ta.A09("paused_for_replay");
            }
            J28 j282 = c37568GgO.A03;
            if (j282 != null) {
                j282.A01();
            }
            c37568GgO.A03 = null;
            c37568GgO.A02 = null;
            c37568GgO.A04.clear();
            c37568GgO.A00 = -1;
        } else {
            this.concurrentPlayerManager.A00();
        }
        AbstractC37302Gc3.A1P(this.A03);
    }

    public C37566GgM(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1R(userSession, interfaceC11380iw);
        this.A05 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.concurrentPlayerManager = new C37567GgN(context, interfaceC11380iw, userSession);
        this.A04 = new C37568GgO(context, interfaceC11380iw, userSession);
    }
}
