package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JVo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43729JVo implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "thread system folder is pending";
    }

    public C43729JVo(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        EnumC46982Dm enumC46982Dm;
        C2EF c2ef;
        C43732JVr c43732JVr = (C43732JVr) obj;
        AbstractC167017dG.A1N(c43732JVr, userSession);
        String str = c43732JVr.A06;
        if (str != null && (c2ef = (C2EF) this.A00.A02.invoke(userSession, str)) != null) {
            enumC46982Dm = c2ef.C4i();
        } else {
            enumC46982Dm = null;
        }
        if (enumC46982Dm == null || (enumC46982Dm != EnumC46982Dm.A06 && enumC46982Dm != EnumC46982Dm.A07)) {
            return true;
        }
        return false;
    }
}
