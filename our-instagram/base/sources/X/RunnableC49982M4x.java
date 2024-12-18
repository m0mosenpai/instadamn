package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.M4x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49982M4x implements Runnable {
    public final /* synthetic */ C47957LGt A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public RunnableC49982M4x(C47957LGt c47957LGt, String str, boolean z) {
        this.A00 = c47957LGt;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47957LGt c47957LGt = this.A00;
        AbstractC59962oe abstractC59962oe = c47957LGt.A08;
        UserSession userSession = c47957LGt.A09;
        String str = this.A01;
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("nametag/nametag_lookup_by_name/{user_name}/");
        A0N.A9s("user_name", str);
        C1ON A0S = AbstractC31172DnG.A0S(A0N, K8N.class, LB0.class);
        A0S.A00 = new C45549KEo(c47957LGt, str, this.A02);
        abstractC59962oe.schedule(A0S);
    }
}
