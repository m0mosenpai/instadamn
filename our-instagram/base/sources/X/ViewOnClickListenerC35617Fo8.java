package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fo8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35617Fo8 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public ViewOnClickListenerC35617Fo8(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String B9e;
        String str;
        C65886Tvq c65886Tvq;
        int length;
        FragmentActivity requireActivity;
        EnumC906041v enumC906041v;
        UserSession A0r;
        int i2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1155557751);
                IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) this.A01;
                if (iGCTMessagingAdsInfoDict != null) {
                    if (!this.A05 && (i2 = ((V1H) this.A04).A00) != Integer.MAX_VALUE) {
                        OnFeedMessagesIntf BUJ = iGCTMessagingAdsInfoDict.BUJ();
                        if (BUJ != null) {
                            B9e = ((IceBreakerMessageIntf) AbstractC76673cF.A01(BUJ).get(i2)).getActionUrl();
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        OnFeedMessagesIntf BUJ2 = iGCTMessagingAdsInfoDict.BUJ();
                        if (BUJ2 != null) {
                            B9e = BUJ2.B9e();
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    OnFeedMessagesIntf onFeedMessagesIntf = (OnFeedMessagesIntf) this.A03;
                    if (onFeedMessagesIntf != null) {
                        str = AbstractC76663cE.A00(onFeedMessagesIntf);
                    } else {
                        str = "";
                    }
                    if (B9e != null && (length = B9e.length()) != 0) {
                        boolean equals = str.equals("WHATSAPP");
                        V1H v1h = (V1H) this.A04;
                        if (equals) {
                            A0r = AbstractC166987dD.A0r(v1h.A0J);
                            requireActivity = v1h.requireActivity();
                            if (length > 0) {
                                enumC906041v = EnumC906041v.AD_DESTINATION_DEEPLINK;
                            }
                        } else {
                            requireActivity = v1h.requireActivity();
                            enumC906041v = EnumC906041v.AD_DESTINATION_DEEPLINK;
                            A0r = AbstractC166987dD.A0r(v1h.A0J);
                        }
                        AbstractC41776Ies.A06(requireActivity, A0r, enumC906041v, null, B9e, null, null);
                    }
                    if (onFeedMessagesIntf != null && (c65886Tvq = (C65886Tvq) this.A02) != null) {
                        String str2 = ((V1H) this.A04).A09;
                        if (str2 == null) {
                            str2 = "-1";
                        }
                        c65886Tvq.A06(null, str2, null, str, VTE.A00(iGCTMessagingAdsInfoDict));
                    }
                }
                i = 1883769365;
                break;
            case 1:
                A05 = C0f9.A05(-1576120712);
                C3B1 c3b1 = (C3B1) this.A04;
                C69453Af c69453Af = c3b1.A08;
                c69453Af.A08(true);
                c3b1.A07.A03(c69453Af.A03.A04, AbstractC111324zv.A00(994));
                ViewGroup viewGroup = (ViewGroup) this.A01;
                View view2 = (View) this.A02;
                view2.setOnClickListener(null);
                viewGroup.removeView(view2);
                ((View) this.A03).setTranslationX(0.0f);
                if (this.A05) {
                    InterfaceC19610xo A0e = AbstractC31176DnK.A0e(c3b1.A06);
                    A0e.E77("has_seen_group_stories_peek_nux", true);
                    A0e.apply();
                }
                i = -907117592;
                break;
            default:
                boolean z = this.A05;
                Fragment fragment = (Fragment) this.A01;
                EnumC33445EqI enumC33445EqI = (EnumC33445EqI) this.A02;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                EnumC31713DwI enumC31713DwI = (EnumC31713DwI) this.A04;
                if (z) {
                    AbstractC25227BEk.A1B(fragment);
                    return;
                }
                C35231FgO.A03.A05(view.getContext());
                AbstractC35259Fgt.A04(fragment.mArguments, fragment.mFragmentManager);
                if (enumC33445EqI != null) {
                    FDC.A00(abstractC12990ll, enumC33445EqI, enumC31713DwI.A01);
                }
                C34907FZt.A00 = null;
                C35146Fen.A02(fragment.requireContext());
                return;
        }
        C0f9.A0C(i, A05);
    }
}
