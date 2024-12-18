package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.CgG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28410CgG {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC16660sJ interfaceC16660sJ) {
        C2OW c2ow = ClipsDraftPreviewItemRepository.A09;
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        ClipsDraftPreviewItemRepository A00 = c2ow.A00(application, userSession);
        String id = c38321qM.getId();
        if (id != null) {
            A00.A03(id, new C30506Dbp(interfaceC16660sJ, 48));
        } else {
            AbstractC25227BEk.A1Q(interfaceC16660sJ, false);
        }
    }

    public static final void A02(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C447924j c447924j = AnonymousClass229.A01(userSession).A06;
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (AbstractC25226BEj.A1Z(A07)) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "SAVE_APPLIED");
            A00.A0R("composition_str_id", str);
            A00.A0a(c447924j.A0J());
            A00.A0b(C22P.A3X);
            A00.Cht();
        }
    }

    public static final void A03(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C447924j c447924j = AnonymousClass229.A01(userSession).A06;
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (AbstractC25226BEj.A1Z(A07)) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "SAVE_CLICK");
            A00.A0R("composition_str_id", str);
            A00.A0a(c447924j.A0J());
            A00.A0b(C22P.A3X);
            A00.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36325287201747944L) == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(android.content.Context r3, com.instagram.common.session.UserSession r4, boolean r5) {
        /*
            if (r5 != 0) goto L12
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325287201747944(0x810da8000633e8, double:3.0355961243519433E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
            r0 = 2131971982(0x7f134f8e, float:1.9580959E38)
            if (r1 != 0) goto L15
        L12:
            r0 = 2131971981(0x7f134f8d, float:1.9580957E38)
        L15:
            java.lang.String r2 = r3.getString(r0)
            java.lang.String r1 = "\n\n"
            r0 = 2131971983(0x7f134f8f, float:1.958096E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.AnonymousClass001.A0g(r2, r1, r0)
            X.C14360o3.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28410CgG.A00(android.content.Context, com.instagram.common.session.UserSession, boolean):java.lang.String");
    }
}
