package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iw1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42763Iw1 implements JIA {
    public final C61972ry A00;
    public final UserSession A01;
    public final C154796xU A02;

    @Override // X.JIA
    public final void AD5(AbstractC154286wd abstractC154286wd) {
        if (this.A02.A06()) {
            Cmo(abstractC154286wd, false);
        }
    }

    @Override // X.JIA
    public final boolean CLJ() {
        return this.A02.A05();
    }

    @Override // X.JIA
    public final boolean CUG() {
        return AbstractC37303Gc4.A1b(this.A02);
    }

    @Override // X.JIA
    public final void Cmo(AbstractC154286wd abstractC154286wd, boolean z) {
        String str;
        C154796xU c154796xU = this.A02;
        UserSession userSession = this.A01;
        String str2 = userSession.userId;
        if (z) {
            str = null;
        } else {
            str = c154796xU.A03.A07;
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0L(AbstractC111324zv.A00(5549), str2);
        A0M.A0S(C39139HKs.class, C41330IRa.class);
        AbstractC2044893h.A06(A0M, str);
        c154796xU.A03(A0M.A0N(), abstractC154286wd);
    }

    @Override // X.JIA
    public final void CpI(C1P1 c1p1, Integer num, String str, java.util.Set set) {
        C61972ry c61972ry;
        UserSession userSession;
        String str2;
        C1ON c1on;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(set, 1);
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue != 1) {
                if (intValue == 0) {
                    c61972ry = this.A00;
                    userSession = this.A01;
                    str2 = "remove";
                } else {
                    return;
                }
            } else {
                c61972ry = this.A00;
                c1on = IRZ.A01(this.A01, "feed_photos_of_you", set);
                c1on.A00 = c1p1;
                c61972ry.schedule(c1on);
            }
        } else {
            c61972ry = this.A00;
            userSession = this.A01;
            str2 = "approve";
        }
        c1on = IRZ.A00(userSession, str2, "feed_photos_of_you", set);
        c1on.A00 = c1p1;
        c61972ry.schedule(c1on);
    }

    @Override // X.JIA
    public final String getNextMaxId() {
        return this.A02.A03.A07;
    }

    @Override // X.JIA
    public final boolean isLoading() {
        return AbstractC37303Gc4.A1a(this.A02);
    }

    public C42763Iw1(Context context, AbstractC018607g abstractC018607g, C61972ry c61972ry, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c61972ry;
        this.A02 = new C154796xU(context, abstractC018607g, userSession);
    }
}
