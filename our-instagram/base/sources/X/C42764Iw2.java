package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iw2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42764Iw2 implements JIA {
    public final UserSession A00;
    public final C154796xU A01;
    public final C61972ry tagActionsLoaderScheduler;

    @Override // X.JIA
    public final void AD5(AbstractC154286wd abstractC154286wd) {
        if (this.A01.A06()) {
            Cmo(abstractC154286wd, false);
        }
    }

    @Override // X.JIA
    public final boolean CLJ() {
        return this.A01.A05();
    }

    @Override // X.JIA
    public final boolean CUG() {
        return AbstractC37303Gc4.A1b(this.A01);
    }

    @Override // X.JIA
    public final void Cmo(AbstractC154286wd abstractC154286wd, boolean z) {
        String str;
        C154796xU c154796xU = this.A01;
        UserSession userSession = this.A00;
        String str2 = userSession.userId;
        if (z) {
            str = null;
        } else {
            str = c154796xU.A03.A07;
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0L("usertags/%s/potential_spam_review/", str2);
        A0M.A0S(C39139HKs.class, C41330IRa.class);
        AbstractC2044893h.A06(A0M, str);
        c154796xU.A03(A0M.A0N(), abstractC154286wd);
    }

    @Override // X.JIA
    public final void CpI(C1P1 c1p1, Integer num, String str, java.util.Set set) {
        C61972ry c61972ry;
        C1ON A00;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(set, 1);
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue != 1) {
                if (intValue == 3) {
                    c61972ry = this.tagActionsLoaderScheduler;
                    C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
                    A0c.A0B("usertags/remove_all_spam_tags/");
                    AbstractC31173DnH.A1N(A0c);
                    A00 = AbstractC31172DnG.A0T(A0c, "container_module", "feed_photos_of_you");
                } else {
                    return;
                }
            } else {
                c61972ry = this.tagActionsLoaderScheduler;
                A00 = IRZ.A01(this.A00, "feed_photos_of_you", set);
            }
        } else {
            c61972ry = this.tagActionsLoaderScheduler;
            A00 = IRZ.A00(this.A00, "approve", "feed_photos_of_you", set);
        }
        A00.A00 = c1p1;
        c61972ry.schedule(A00);
    }

    @Override // X.JIA
    public final String getNextMaxId() {
        return this.A01.A03.A07;
    }

    @Override // X.JIA
    public final boolean isLoading() {
        return AbstractC37303Gc4.A1a(this.A01);
    }

    public C42764Iw2(Context context, AbstractC018607g abstractC018607g, C61972ry c61972ry, UserSession userSession) {
        this.A00 = userSession;
        this.tagActionsLoaderScheduler = c61972ry;
        this.A01 = new C154796xU(context, abstractC018607g, userSession);
    }
}
