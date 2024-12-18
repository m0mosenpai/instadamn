package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IdS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41699IdS {
    public C47H A00;
    public IG2 A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final InterfaceC11380iw A0B;
    public final UserSession A0C;
    public final C41002IDx A0D;
    public final FragmentActivity A0E;

    public final void A02(String str) {
        if (AbstractC001900j.A0a(str, this.A02, false)) {
            this.A08 = true;
            if (this.A03 && !this.A05) {
                C37540Gfw c37540Gfw = this.A0D.A00.A09;
                if (c37540Gfw == null) {
                    C14360o3.A0F("clipsViewerFragmentViewModel");
                    throw C00O.createAndThrow();
                }
                c37540Gfw.A1K.A0S(null, "fragment_paused", false, true);
                this.A05 = true;
            }
        }
    }

    public static final void A01(C47H c47h, C41699IdS c41699IdS) {
        Object obj = new Object();
        C146106i8 A0K = AbstractC31171DnF.A0K();
        Context context = c41699IdS.A0A;
        A0K.A0D = AbstractC167007dF.A0f(context, c47h.CDj().getUsername(), 2131955526);
        A0K.A09 = c47h.CDj().Bhu();
        A0K.A0B(EnumC142006bJ.A03);
        AbstractC31175DnJ.A0l(context, A0K, 2131955527);
        A0K.A06();
        A0K.A0A(new C42695Iuq(5, obj, c41699IdS, c47h));
        A0K.A0L = true;
        AbstractC31178DnM.A1S(A0K);
        c41699IdS.A04 = true;
        if (c41699IdS.A09) {
            c41699IdS.A09 = false;
        }
    }

    public C41699IdS(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41002IDx c41002IDx) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A0C = userSession;
        this.A0B = interfaceC11380iw;
        this.A0A = context;
        this.A0E = fragmentActivity;
        this.A0D = c41002IDx;
        this.A02 = "";
    }

    public static final void A00(C47H c47h, UserSession userSession, C41699IdS c41699IdS) {
        C28431Ze A02 = AbstractC31364DqT.A02();
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, c47h.CDj().getId(), "clips_follow_prompt", c41699IdS.A0B.getModuleName());
        A01.A0i = true;
        AbstractC31178DnM.A0y(C31368DqX.A00(userSession, A02, A01), c41699IdS.A0E, userSession);
    }
}
