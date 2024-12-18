package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.DpR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31305DpR {
    public static InterfaceC16820sZ A03;
    public final UserSession A00;
    public final C23031Ai A01;
    public final C25671My A02;

    public C31305DpR(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC23021Ah.A00(userSession);
        this.A02 = AbstractC25651Mw.A00(userSession);
    }

    public final void A01(Context context, String str, boolean z) {
        C14360o3.A0B(context, 1);
        String A00 = A00(str);
        if (A00.length() != 0) {
            String A0d = AbstractC31179DnN.A0d(this.A01, "ads_event_sharing_notice_content", str);
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(context, A0K, 2131952516);
            A0K.A0I = A0d;
            A0K.A0L = true;
            AbstractC31175DnJ.A0l(context, A0K, 2131952515);
            A0K.A0A = new C42703Iuy(this, z);
            AbstractC25233BEq.A1F(A0K);
            UserSession userSession = this.A00;
            AbstractC34058F1l.A00(userSession).A01(userSession.userId, A00);
            A02(str);
        }
    }

    public final String A00(String str) {
        return AbstractC31179DnN.A0d(this.A01, "ads_event_sharing_notice_type", str);
    }

    public final void A02(String str) {
        C23031Ai c23031Ai = this.A01;
        c23031Ai.A0q(AnonymousClass001.A0R("ads_event_sharing_notice_type", str));
        c23031Ai.A0q(AnonymousClass001.A0R("ads_event_sharing_notice_content", str));
        c23031Ai.A0q(AnonymousClass001.A0R("ads_event_sharing_notice_ui_type", str));
        InterfaceC16820sZ interfaceC16820sZ = A03;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    public final void A03(String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1Q(str2, str4);
        if (A00(str4).length() > 0) {
            A02(str4);
        }
        C23031Ai c23031Ai = this.A01;
        c23031Ai.A12(AnonymousClass001.A0R("ads_event_sharing_notice_type", str4), str);
        c23031Ai.A12(AnonymousClass001.A0R("ads_event_sharing_notice_content", str4), str2);
        c23031Ai.A12(AnonymousClass001.A0R("ads_event_sharing_notice_ui_type", str4), str3);
        this.A02.E4s(new C36085FwL(str4));
    }
}
