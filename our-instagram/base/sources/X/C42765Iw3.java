package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iw3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42765Iw3 implements JIA {
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
        C14360o3.A0B(str2, 1);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0L("usertags/%s/feed/", str2);
        A0M.A0R(C39139HKs.class, C41330IRa.class);
        AbstractC2044893h.A06(A0M, str);
        c154796xU.A03(A0M.A0N(), abstractC154286wd);
    }

    @Override // X.JIA
    public final void CpI(C1P1 c1p1, Integer num, String str, java.util.Set set) {
        C61972ry c61972ry;
        C1ON A00;
        boolean A1R = AbstractC167007dF.A1R(0, num, set);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == A1R) {
                c61972ry = this.A00;
                A00 = IRZ.A01(this.A01, "feed_photos_of_you", set);
            } else {
                return;
            }
        } else {
            c61972ry = this.A00;
            A00 = IRZ.A00(this.A01, "remove", "feed_photos_of_you", set);
        }
        A00.A00 = c1p1;
        c61972ry.schedule(A00);
    }

    @Override // X.JIA
    public final String getNextMaxId() {
        return this.A02.A03.A07;
    }

    @Override // X.JIA
    public final boolean isLoading() {
        return AbstractC37303Gc4.A1a(this.A02);
    }

    public C42765Iw3(Context context, AbstractC018607g abstractC018607g, C61972ry c61972ry, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c61972ry;
        this.A02 = new C154796xU(context, abstractC018607g, userSession);
    }
}
