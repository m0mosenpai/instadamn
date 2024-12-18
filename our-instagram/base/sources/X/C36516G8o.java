package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.G8o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36516G8o implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    public C36516G8o(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C28151Xt c28151Xt;
        switch (this.A00) {
            case 0:
                C1VE c1ve = C1VE.A02;
                if (c1ve == null) {
                    return;
                }
                UserSession userSession = (UserSession) this.A03;
                long A07 = AbstractC31174DnI.A07(userSession);
                Integer num = C05F.A0B;
                Long valueOf = Long.valueOf(A07);
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C461329x.A04(userSession, null, num, valueOf, c16920sk);
                AbstractC31177DnL.A0w(null, C1VE.A00(c1ve).A01(userSession, EnumC33408Epf.A0I), (FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                return;
            case 1:
                Activity activity = (Activity) this.A02;
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                C36881nl A01 = C36881nl.A01(activity, directShareSheetFragment, directShareSheetFragment.A0H, "direct_forwarding_toast");
                A01.A00 = directShareSheetFragment;
                String A08 = ((DirectShareTarget) this.A03).A08();
                A08.getClass();
                AbstractC31179DnN.A1R(A01, A08);
                AbstractC31174DnI.A1P(A01);
                return;
            case 2:
                Fragment fragment = (Fragment) this.A02;
                UserSession userSession2 = (UserSession) this.A03;
                Context context = (Context) this.A01;
                Bundle A0b = AbstractC166987dD.A0b();
                Resources resources = context.getResources();
                String A0q = AbstractC166997dE.A0q(resources, 2131963525);
                String A0q2 = AbstractC166997dE.A0q(resources, 2131965052);
                String A0r = AbstractC166997dE.A0r(resources, A0q2, 2131963522);
                C14360o3.A07(A0r);
                DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = new DirectWellBeingUpsellBottomSheetData(C2Fb.A1y, C05F.A00, A0q, A0r, A0q2, C18U.A04(C06090Tz.A06, userSession2, 36877010110513277L), AbstractC166997dE.A0q(resources, 2131963518), AbstractC166997dE.A0q(resources, 2131963519), R.drawable.ig_illustrations_qp_messages_refresh, true);
                A0b.putString("bottom_sheet_content_fragment", AbstractC111324zv.A00(2280));
                A0b.putParcelable(AbstractC111324zv.A00(611), directWellBeingUpsellBottomSheetData);
                AbstractC31171DnF.A0L((Activity) context, A0b, userSession2, TransparentModalActivity.class, "bottom_sheet").A0D(fragment, 1);
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                C54s c54s = new C54s(C913045j.A00);
                c54s.A0D("seen", A00.A01.getInt(AbstractC43591JPw.A00(1025), 0));
                FVE.A01(userSession2, C05F.A01, null, c54s.toString());
                FVE.A00(userSession2, C05F.A0N, C05F.A0C, null);
                return;
            case 3:
                C34724FRn A0P = AbstractC31174DnI.A0P();
                UserSession userSession3 = (UserSession) this.A03;
                AbstractC31177DnL.A0w(null, A0P.A03(userSession3, new LeadGenBaseFormList((XIGIGBoostCallToAction) this.A01, null, null, "", AbstractC166987dD.A1E(), false), MSV.A00(502)), (FragmentActivity) this.A02, userSession3);
                return;
            case 4:
                FQ4 fq4 = (FQ4) this.A01;
                UserSession userSession4 = (UserSession) this.A03;
                User user = (User) this.A02;
                UserDetailFragment userDetailFragment = fq4.A03;
                userDetailFragment.getClass();
                if (userDetailFragment.getActivity() == null) {
                    return;
                }
                AbstractC31178DnM.A1L(fq4.A02.A00, "unfollow_chaining_pill_tap", user.getId());
                fq4.A01();
                FQ4.A00(fq4.A03.requireActivity(), userSession4, user, EnumC31556Dtg.A0K);
                return;
            case 5:
                Activity activity2 = (Activity) this.A01;
                if (activity2 == null || (c28151Xt = C28151Xt.A02) == null || c28151Xt.A00.getValue() == null) {
                    return;
                }
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                Bundle A0D = AbstractC31174DnI.A0D(abstractC12990ll);
                EHj eHj = new EHj();
                C189448aO A0W = AbstractC31174DnI.A0W(A0D, eHj, abstractC12990ll);
                AbstractC25226BEj.A1M((Context) this.A02, A0W, 2131972540);
                AbstractC31173DnH.A0w(activity2, eHj, A0W);
                return;
            default:
                C1VE c1ve2 = C1VE.A02;
                if (c1ve2 != null) {
                    AbstractC31177DnL.A16(C1VE.A00(c1ve2).A01((UserSession) this.A03, EnumC33408Epf.A0I), (FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        switch (this.A00) {
            case 2:
                FVE.A01((UserSession) this.A03, C05F.A0C, null, null);
                C006802i.A0p.markerEnd(190449529, (short) 2);
                return;
            case 3:
            default:
                return;
            case 4:
                C31361DqQ c31361DqQ = ((FQ4) this.A01).A02;
                AbstractC31178DnM.A1L(c31361DqQ.A00, "unfollow_chaining_show_pill", AbstractC31171DnF.A0g(this.A02));
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
