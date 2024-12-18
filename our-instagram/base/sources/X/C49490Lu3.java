package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.Lu3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49490Lu3 implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;

    public C49490Lu3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        Activity A00;
        Bundle A0B;
        String str;
        C189478aR A002;
        Activity A003;
        Fragment c45815KPu;
        KCM kcm;
        String str2;
        String str3;
        InterfaceC83733oI interfaceC83733oI;
        switch (this.A00) {
            case 1:
                LinkedHashMap A06 = AbstractC06930Yk.A06(AbstractC166987dD.A1L("media_id", "0"), AbstractC166987dD.A1L("module", ""));
                C48592LeU c48592LeU = (C48592LeU) this.A01;
                AbstractC192798gL A05 = C192108fB.A05(c48592LeU.A06, "com.instagram.sensitivity.see_why_sheets.news_sheet_action", A06);
                A05.A00(new C45530KDv(c48592LeU, 1));
                C1GJ.A03(A05);
                return;
            case 2:
                return;
            case 3:
                C159437De c159437De = (C159437De) this.A01;
                InterfaceC16820sZ interfaceC16820sZ = c159437De.A0L;
                User user = (User) AbstractC001800i.A0J(((C7TT) interfaceC16820sZ.invoke()).A0b);
                if (user == null) {
                    return;
                }
                String id = user.getId();
                c159437De.A0D.A01(id, true);
                InterfaceC09390do interfaceC09390do = c159437De.A0H;
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
                C141796aw A004 = AbstractC141776au.A00(A0Z);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9DZ(A0Z, id, null, 4), A004);
                C7F3 c7f3 = c159437De.A09;
                String A005 = ((C7UD) interfaceC09390do.getValue()).A00();
                C7TT c7tt = (C7TT) interfaceC16820sZ.invoke();
                if (c7tt != null && (interfaceC83733oI = c7tt.A0P) != null) {
                    str3 = AbstractC1345466e.A07(interfaceC83733oI);
                } else {
                    str3 = null;
                }
                c7f3.A0D(A005, str3, true);
                return;
            case 4:
                C14360o3.A0B(view, 0);
                KCM kcm2 = (KCM) this.A01;
                Context A0L = AbstractC166997dE.A0L(view);
                A00 = AbstractC13330mJ.A00(A0L);
                EnumC46149Kbn A006 = LLQ.A00(kcm2);
                A0B = AbstractC31177DnL.A0B(kcm2);
                if (A006 == EnumC46149Kbn.A02) {
                    C189448aO A0y = AbstractC25225BEi.A0y(AbstractC166987dD.A0r(kcm2.A00));
                    A0y.A1I = true;
                    A0y.A11 = true;
                    C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
                    c189458aP.A02 = R.drawable.instagram_x_pano_outline_24;
                    c189458aP.A05 = new ViewOnClickListenerC48071LPw(A00, 63);
                    c189458aP.A07 = AbstractC166997dE.A0q(A00.getResources(), 2131954754);
                    A0y.A0Q = c189458aP.A00();
                    A0y.A1C = false;
                    A002 = A0y.A00();
                    A003 = AbstractC13330mJ.A00(A0L);
                    c45815KPu = new C45815KPu();
                    c45815KPu.setArguments(A0B);
                    A002.A02(A003, c45815KPu);
                    return;
                }
                str = "RESTORE_WITH_PIN";
                kcm = kcm2;
                A0B.putString("BUNDLE_SCREEN", str);
                C6XJ A03 = C6XJ.A03(A00, A0B, AbstractC166987dD.A0r(kcm.A00), ModalActivity.class, "encrypted_backups_screen");
                A03.A07();
                A03.A07 = true;
                A03.A0C(A00);
                return;
            case 5:
                C14360o3.A0B(view, 0);
                C45817KPw c45817KPw = (C45817KPw) this.A01;
                Context A0L2 = AbstractC166997dE.A0L(view);
                A00 = AbstractC13330mJ.A00(A0L2);
                EnumC46149Kbn A007 = LLQ.A00(c45817KPw);
                A0B = AbstractC31177DnL.A0B(c45817KPw);
                A0B.putString("BUNDLE_ENTRY_POINT", "RETRY_PIN");
                KPI kpi = ((C44464JlW) c45817KPw.A08.getValue()).A08;
                kpi.A07("ENTRY_POINT", "RETRY_PIN");
                kpi.A07("SETUP_TYPE", "PIN_CODE");
                if (A007 == EnumC46149Kbn.A02) {
                    C189448aO A0y2 = AbstractC25225BEi.A0y(AbstractC166987dD.A0r(((KCM) c45817KPw).A00));
                    A0y2.A1I = true;
                    A0y2.A11 = true;
                    C189458aP c189458aP2 = new C189458aP(null, null, "", 0, 0);
                    c189458aP2.A02 = R.drawable.instagram_x_pano_outline_24;
                    c189458aP2.A05 = new ViewOnClickListenerC48071LPw(A00, 68);
                    c189458aP2.A07 = AbstractC166997dE.A0q(A00.getResources(), 2131954754);
                    A0y2.A0Q = c189458aP2.A00();
                    Context context = c45817KPw.getContext();
                    if (context != null) {
                        str2 = context.getString(2131969661);
                    } else {
                        str2 = null;
                    }
                    A0y2.A0d = str2;
                    A002 = A0y2.A00();
                    A003 = AbstractC13330mJ.A00(A0L2);
                    c45815KPu = new C45817KPw();
                    c45815KPu.setArguments(A0B);
                    A002.A02(A003, c45815KPu);
                    return;
                }
                str = "CREATE_PIN";
                kcm = c45817KPw;
                A0B.putString("BUNDLE_SCREEN", str);
                C6XJ A032 = C6XJ.A03(A00, A0B, AbstractC166987dD.A0r(kcm.A00), ModalActivity.class, "encrypted_backups_screen");
                A032.A07();
                A032.A07 = true;
                A032.A0C(A00);
                return;
            case 6:
                C47929LEy.A00((C47929LEy) this.A01);
                return;
            case 7:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 8:
                C45466KBb.A02((C45466KBb) this.A01).A04();
                return;
            case 9:
                MRK mrk = ((LLB) this.A01).A0S;
                if (mrk == null) {
                    return;
                }
                mrk.Cqq();
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        switch (this.A00) {
            case 1:
                C08730cb c08730cb = C17060sy.A01;
                C48592LeU c48592LeU = (C48592LeU) this.A01;
                UserSession userSession = c48592LeU.A06;
                ((C47738L6a) c48592LeU.A09.getValue()).A00(AbstractC25231BEo.A0j(0, userSession.userId), AbstractC167007dF.A0d(), "genpop_story_link_error_impression", AbstractC167007dF.A1T(c08730cb.A01(userSession).A03.Cbk()));
                return;
            case 2:
                ((CreatorAIAgentCreationRepository) this.A01).A03.A03(C8p.A0V);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
