package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IfG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41800IfG implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnClickListenerC41800IfG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubmittedSubPostManageType submittedSubPostManageType;
        FragmentActivity fragmentActivity;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A02;
                String A04 = C18U.A04(C06090Tz.A06, userSession, 36888580752474934L);
                C2Fb c2Fb = C2Fb.A15;
                if (A04.length() == 0) {
                    return;
                }
                new C63397SjR(context, userSession, c2Fb, A04, false).A0A();
                return;
            case 1:
                UserSession userSession2 = (UserSession) this.A01;
                C38321qM c38321qM = (C38321qM) this.A02;
                CallerContext callerContext = C42089Ikw.A00;
                AbstractC40629Hzn.A00(AbstractC43591JPw.A00(133), userSession2, c38321qM);
                return;
            case 2:
                C38333GtS c38333GtS = (C38333GtS) this.A02;
                List list = (List) ((C37838Gks) c38333GtS.A04.getValue()).A06;
                C38333GtS.A01((C55101ObE) this.A01, list, C38333GtS.A02(c38333GtS), false);
                C42342Ip4 c42342Ip4 = c38333GtS.A02;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A2u = AbstractC31172DnG.A0i(it).A2u();
                    if (A2u != null) {
                        A1E.add(A2u);
                    }
                }
                C32545EUv c32545EUv = new C32545EUv(6, list, c38333GtS, false);
                C41627IbI c41627IbI = c42342Ip4.A03;
                String str2 = c42342Ip4.A04;
                if (A1E.size() > 1) {
                    submittedSubPostManageType = SubmittedSubPostManageType.A06;
                } else {
                    submittedSubPostManageType = SubmittedSubPostManageType.A07;
                }
                c41627IbI.A01(submittedSubPostManageType, c32545EUv, str2, null, A1E);
                return;
            case 3:
                HDJ hdj = (HDJ) this.A01;
                Context context2 = (Context) this.A02;
                try {
                    String str3 = hdj.A0C;
                    str3.getClass();
                    JIA jia = hdj.A08;
                    Integer num = C05F.A0N;
                    jia.CpI(new HGF(hdj, num, str3, Collections.emptySet(), 0), num, "feed_photos_of_you", Collections.emptySet());
                    hdj.A05.A00(hdj.A06, C05F.A01, "confirm_delete_all", Collections.emptyList());
                    return;
                } catch (IOException unused) {
                    C9GR.A0F(context2, "media_action_io_exception", 2131969611);
                    return;
                }
            case 4:
                C14360o3.A0B(dialogInterface, 0);
                SimpleWebViewActivity.A02.A02(AbstractC31172DnG.A07(this.A01), (AbstractC12990ll) this.A02, new SimpleWebViewConfig("https://help.instagram.com/667697642215070", (String) null, (String) null, (String) null, false, false, false, false, true, true, false, true, false, false, false, false));
                dialogInterface.dismiss();
                return;
            case 5:
                C42813Iwp c42813Iwp = (C42813Iwp) this.A01;
                HHH hhh = (HHH) c42813Iwp.A01;
                AbstractC35260Fgu.A01(hhh.A03.requireContext(), hhh.A04, hhh.A05, hhh.A0E, (SavedCollection) this.A02, null, (List) c42813Iwp.A02);
                hhh.A02();
                return;
            case 6:
                C41749IeN c41749IeN = (C41749IeN) this.A02;
                C25621Ms A0q = AbstractC25228BEl.A0q(c41749IeN.A0Q);
                C38321qM c38321qM2 = c41749IeN.A03;
                if (c38321qM2 != null) {
                    AbstractC31173DnH.A1Q(A0q, "commerce/story/%s/remove_storefront_sticker/", new Object[]{c38321qM2.A38()});
                    A0q.A05();
                    C1ON A0e = AbstractC25227BEk.A0e(A0q, N3N.class, C41349IRu.class);
                    IE8 ie8 = (IE8) this.A01;
                    C39030HGg.A00(A0e, ie8, 26);
                    FragmentActivity fragmentActivity2 = c41749IeN.A0P;
                    C1GJ.A00(fragmentActivity2, AbstractC018607g.A00(fragmentActivity2), A0e);
                    ie8.A00.A02.EJJ();
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 7:
            case 9:
            default:
                ((UserFlowLoggerImpl) this.A02).flowEndCancel(658062002L, CancelReason.USER_CANCELLED);
                ((C37609Gh4) this.A01).A05.A00();
                return;
            case 8:
                C120985dq c120985dq = (C120985dq) this.A01;
                C38321qM c38321qM3 = c120985dq.A02;
                C37609Gh4 c37609Gh4 = (C37609Gh4) this.A02;
                if (c38321qM3 != null) {
                    AbstractC59962oe abstractC59962oe = c37609Gh4.A02;
                    UserSession userSession3 = c37609Gh4.A03;
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession3);
                    AbstractC31173DnH.A1Q(A0c, MSV.A00(511), new Object[]{c38321qM3.getId()});
                    A0c.A9s("media_id", c38321qM3.getId());
                    AbstractC31173DnH.A1N(A0c);
                    C1ON A0U = AbstractC31172DnG.A0U(A0c, true);
                    A0U.A00 = new HGG(c37609Gh4.A01, c120985dq, userSession3, c37609Gh4.A04, 2131957731);
                    abstractC59962oe.schedule(A0U);
                    return;
                }
                fragmentActivity = c37609Gh4.A01;
                i2 = 2131955412;
                str = "clips_delete_failed";
                break;
            case 10:
                C120985dq c120985dq2 = (C120985dq) this.A01;
                C38321qM c38321qM4 = c120985dq2.A02;
                C37609Gh4 c37609Gh42 = (C37609Gh4) this.A02;
                if (c38321qM4 != null) {
                    AbstractC59962oe abstractC59962oe2 = c37609Gh42.A02;
                    UserSession userSession4 = c37609Gh42.A03;
                    C25621Ms A0c2 = AbstractC167017dG.A0c(userSession4);
                    AbstractC31173DnH.A1Q(A0c2, MSV.A00(510), new Object[]{c38321qM4.getId()});
                    A0c2.A9s("media_id", c38321qM4.getId());
                    AbstractC31173DnH.A1N(A0c2);
                    C1ON A0U2 = AbstractC31172DnG.A0U(A0c2, true);
                    A0U2.A00 = new HGG(c37609Gh42.A01, c120985dq2, userSession4, c37609Gh42.A04, 2131976310);
                    abstractC59962oe2.schedule(A0U2);
                    return;
                }
                fragmentActivity = c37609Gh42.A01;
                i2 = 2131955755;
                str = "clips_recover_failed";
                break;
            case 11:
                C41699IdS c41699IdS = (C41699IdS) this.A02;
                C41699IdS.A00((C47H) this.A01, c41699IdS.A0C, c41699IdS);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C37608Gh3 c37608Gh3 = (C37608Gh3) this.A02;
                C38321qM c38321qM5 = c37608Gh3.A02;
                if (c38321qM5 == null) {
                    C14360o3.A0F("media");
                    throw C00O.createAndThrow();
                }
                UserSession userSession5 = c37608Gh3.A0B;
                FragmentActivity fragmentActivity3 = c37608Gh3.A04;
                AbstractC59962oe abstractC59962oe3 = c37608Gh3.A05;
                String moduleName = abstractC59962oe3.getModuleName();
                AbstractC172137li.A03(fragmentActivity3, userSession5, c38321qM5, AbstractC166987dD.A10(userSession5), abstractC59962oe3.getClass(), moduleName);
                ((DialogInterface.OnDismissListener) this.A01).onDismiss(dialogInterface);
                return;
        }
        C9GR.A0F(fragmentActivity, str, i2);
    }
}
