package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

/* renamed from: X.Iuq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42695Iuq implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C42695Iuq(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        Context context;
        JI9 ji9;
        String str;
        C6XJ A0L;
        switch (this.A00) {
            case 0:
                context = (Context) this.A01;
                ji9 = (JI9) this.A02;
                str = "see_less";
                break;
            case 1:
                context = (Context) this.A01;
                ji9 = (JI9) this.A02;
                str = "see_more";
                break;
            case 2:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 3:
                C64972wv c64972wv = (C64972wv) this.A03;
                boolean z = c64972wv.A0D;
                C1XH A00 = FB6.A00();
                FragmentActivity fragmentActivity = c64972wv.A01;
                UserSession userSession = c64972wv.A02;
                String str2 = c64972wv.A0C;
                String moduleName = c64972wv.A03.getModuleName();
                if (z) {
                    if (C18U.A06(AbstractC25225BEi.A0j(moduleName, 3), userSession, 36312801731544324L)) {
                        HashMap A1G = AbstractC166987dD.A1G();
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        A1G.put("shopping_session_id", str2);
                        A1G.put("prior_module", moduleName);
                        A1G.put("collection_id", "");
                        if (!C18U.A06(C06090Tz.A06, userSession, 36314133171276258L)) {
                            str3 = new SMA(fragmentActivity).A00();
                        }
                        A1G.put("risk_features", str3);
                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
                        A0C.A0i = true;
                        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2094), A1G);
                        A01.A00 = 760101916;
                        A0L = AbstractC31171DnF.A0L(fragmentActivity, W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks");
                    } else {
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString("shopping_session_id", str2);
                        AbstractC37300Gc1.A0c(A0b, moduleName);
                        A0b.putInt("user_flow_id", 37367682);
                        A0L = AbstractC31171DnF.A0L(fragmentActivity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(5247));
                    }
                    A0L.A0C(fragmentActivity);
                    return;
                }
                A00.A07(fragmentActivity, userSession, str2, moduleName);
                return;
            case 4:
                C37675GiC c37675GiC = (C37675GiC) this.A03;
                C37675GiC.A09((MediaControlEventSourceEnum) this.A01, (C38321qM) this.A02, c37675GiC);
                return;
            default:
                ((C14510oO) this.A01).A00 = true;
                C41699IdS c41699IdS = (C41699IdS) this.A03;
                C41699IdS.A00((C47H) this.A02, c41699IdS.A0C, c41699IdS);
                IG2 ig2 = c41699IdS.A01;
                if (ig2 != null) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ig2.A01, "follow_prompt_clicked");
                    AbstractC31175DnJ.A14(A0f, ig2.A00);
                    AbstractC37303Gc4.A0o(A0f, "toast", null);
                    A0f.A8p("num_facepiles", null);
                    A0f.Cht();
                    return;
                }
                return;
        }
        C146106i8 A0H = AbstractC37304Gc5.A0H();
        AbstractC25226BEj.A1N(context, A0H, 2131976067);
        A0H.A0R = true;
        AbstractC31178DnM.A1S(A0H);
        ji9.CmG(str);
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        Integer num;
        switch (this.A00) {
            case 2:
                C52691NTc c52691NTc = (C52691NTc) this.A03;
                C55177Odh c55177Odh = c52691NTc.A0E;
                C51874MwI c51874MwI = c52691NTc.A04;
                if (c51874MwI == null || (num = c51874MwI.A02) == null) {
                    num = C05F.A00;
                }
                c55177Odh.A03(new PFW(num, false));
                return;
            case 3:
            case 4:
            default:
                return;
            case 5:
                C14510oO c14510oO = (C14510oO) this.A01;
                if (c14510oO.A00) {
                    c14510oO.A00 = false;
                    return;
                }
                IG2 ig2 = ((C41699IdS) this.A03).A01;
                if (ig2 == null) {
                    return;
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ig2.A01, "follow_prompt_denied");
                AbstractC31175DnJ.A14(A0f, ig2.A00);
                AbstractC37303Gc4.A0o(A0f, "toast", null);
                A0f.A8p("num_facepiles", null);
                A0f.Cht();
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        Integer num;
        switch (this.A00) {
            case 2:
                C52691NTc c52691NTc = (C52691NTc) this.A03;
                C55177Odh c55177Odh = c52691NTc.A0E;
                C51874MwI c51874MwI = c52691NTc.A04;
                if (c51874MwI == null || (num = c51874MwI.A02) == null) {
                    num = C05F.A00;
                }
                c55177Odh.A03(new PFW(num, true));
                AbstractC166987dD.A1Y(this.A02);
                return;
            case 3:
            case 4:
            default:
                return;
            case 5:
                IG2 ig2 = ((C41699IdS) this.A03).A01;
                if (ig2 == null) {
                    return;
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ig2.A01, "follow_prompt_impression");
                AbstractC31175DnJ.A14(A0f, ig2.A00);
                AbstractC37303Gc4.A0o(A0f, "toast", null);
                A0f.A8p("num_facepiles", null);
                A0f.Cht();
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
