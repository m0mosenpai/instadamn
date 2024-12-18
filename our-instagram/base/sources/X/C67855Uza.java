package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Uza, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67855Uza extends AnonymousClass935 {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67855Uza(UserSession userSession, int i) {
        super(userSession);
        this.A00 = i;
    }

    @Override // X.AnonymousClass935
    public final void A01(UserSession userSession) {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1045015871);
                i = -1787752785;
                break;
            case 2:
                A03 = C0f9.A03(1920728188);
                i = 1502744282;
                break;
            default:
                super.A01(userSession);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1394526274);
                i = 1855188204;
                break;
            case 2:
                A03 = C0f9.A03(1060865643);
                i = -170470193;
                break;
            default:
                super.A02(userSession);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(832195819);
                AbstractC167017dG.A1N(userSession, abstractC115105If);
                super.A04(abstractC115105If, userSession);
                i = 634996676;
                break;
            case 1:
                A03 = C0f9.A03(1760381478);
                i = 1777419726;
                break;
            default:
                A03 = C0f9.A03(-1317390123);
                i = -669398458;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-719127213);
                C38862H9k c38862H9k = (C38862H9k) obj;
                int A032 = C0f9.A03(-658557624);
                AbstractC167017dG.A1N(userSession, c38862H9k);
                C18A A00 = AnonymousClass189.A00(userSession);
                User user = c38862H9k.A00;
                user.getClass();
                A00.A03(user);
                C0f9.A0A(1708953352, A032);
                i = 1812868370;
                break;
            case 1:
                A03 = C0f9.A03(1951893562);
                C1574875f c1574875f = (C1574875f) obj;
                int A033 = C0f9.A03(583632617);
                AbstractC167017dG.A1N(userSession, c1574875f);
                C43707JUs c43707JUs = c1574875f.A02;
                if (c43707JUs != null) {
                    AbstractC28761aE.A00(userSession).FBb(c43707JUs);
                }
                C0f9.A0A(1387108266, A033);
                i = -902069486;
                break;
            default:
                A03 = C0f9.A03(-523712715);
                C1574875f c1574875f2 = (C1574875f) obj;
                int A034 = C0f9.A03(-991765555);
                AbstractC167017dG.A1N(userSession, c1574875f2);
                C43707JUs c43707JUs2 = c1574875f2.A02;
                if (c43707JUs2 != null) {
                    AbstractC28761aE.A00(userSession).FBb(c43707JUs2);
                }
                C0f9.A0A(4619439, A034);
                i = 500511806;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
