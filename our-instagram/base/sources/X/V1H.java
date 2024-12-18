package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public final class V1H extends AbstractC59962oe implements InterfaceC189488aT, InterfaceC37155GYs {
    public static final String __redex_internal_original_name = "ClickToMessagingOnFeedBottomSheetFragment";
    public int A00;
    public IGCTMessagingAdsInfoDict A01;
    public OnFeedMessagesIntf A02;
    public ImageUrl A03;
    public C35209Fg1 A04;
    public C68981VfJ A05;
    public C65886Tvq A06;
    public C69257VkQ A07;
    public CharSequence A08;
    public String A09;
    public String A0A;
    public String A0B;
    public XNX A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public final InterfaceC09390do A0J = AbstractC60492pY.A02(this);
    public int A0C = -1;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r2 == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r14, X.V1H r15, java.lang.String r16, boolean r17) {
        /*
            r0 = r15
            X.0do r4 = r15.A0J
            X.1DX r2 = X.AbstractC31176DnK.A0Z(r4)
            java.lang.String r1 = r15.A0A
            X.1qM r2 = r2.A02(r1)
            if (r2 == 0) goto L2d
            java.lang.Object r1 = r4.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            boolean r1 = X.C87153uY.A03(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r4.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.user.model.User r1 = X.C87153uY.A01(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.String r1 = r1.getId()
            r15.A0H = r1
        L2d:
            java.lang.String r5 = r15.A0E
            if (r5 == 0) goto L51
            X.XNX r2 = r15.A0D
            X.XNX r1 = X.XNX.PAGE_MOBILE_STORY
            r10 = r16
            if (r2 != r1) goto L6a
            X.VkQ r1 = r15.A07
            if (r1 == 0) goto L51
            X.6jg r5 = r1.A03
            X.1vS r6 = r1.A00
            r9 = 0
            X.LG8 r8 = new X.LG8
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.1w4 r7 = r1.A01
            r10 = 0
            r5.A01(r6, r7, r8, r9, r10)
        L51:
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r0.A02
            boolean r1 = X.AbstractC76663cE.A02(r1)
            if (r1 == 0) goto L60
            X.Fg1 r1 = r0.A04
            if (r1 == 0) goto L60
            r1.A03()
        L60:
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.AbstractC167017dG.A0y(r0, r1)
            return
        L6a:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r1 = r15.A01
            if (r1 == 0) goto Lae
            com.instagram.api.schemas.PrivacyDisclosureInfo r1 = r1.A01
            if (r1 == 0) goto Lae
            java.lang.String r1 = r1.B4W()
        L76:
            r3 = 1
            if (r1 == 0) goto L80
            int r2 = r1.length()
            r1 = 0
            if (r2 != 0) goto L81
        L80:
            r1 = 1
        L81:
            r16 = r1 ^ 1
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r15.A02
            if (r1 == 0) goto Lac
            java.lang.Boolean r1 = r1.BvT()
            boolean r15 = X.AbstractC166997dE.A1Z(r1, r3)
        L8f:
            java.lang.Object r4 = r4.getValue()
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r6 = r0.getModuleName()
            java.lang.String r7 = r0.A0A
            java.lang.String r8 = r0.A0F
            java.lang.String r9 = r0.A0G
            java.lang.String r11 = r0.A09
            int r13 = r0.A0C
            java.lang.String r12 = r0.A0H
            r3 = r14
            r14 = r17
            X.F7W.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L51
        Lac:
            r15 = 0
            goto L8f
        Lae:
            r1 = 0
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1H.A00(android.content.Context, X.V1H, java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.95f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 0.95f;
    }

    @Override // X.InterfaceC37155GYs
    public final void D6m() {
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC37155GYs
    public final boolean DkY(String str, boolean z) {
        C65886Tvq c65886Tvq;
        String str2;
        C14360o3.A0B(str, 0);
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = this.A01;
        if (iGCTMessagingAdsInfoDict != null && (c65886Tvq = this.A06) != null) {
            String str3 = this.A09;
            if (str3 == null) {
                str3 = "-1";
            }
            long A00 = VTE.A00(iGCTMessagingAdsInfoDict);
            OnFeedMessagesIntf BUJ = iGCTMessagingAdsInfoDict.BUJ();
            if (BUJ != null) {
                str2 = AbstractC76663cE.A00(BUJ);
            } else {
                str2 = "";
            }
            c65886Tvq.A07(str3, A00, str2);
        }
        A00(requireContext(), this, str, z);
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x049c, code lost:
    
        if (r0.isEmpty() != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0177, code lost:
    
        if (r12 == 4) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, android.widget.RadioGroup, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View, android.view.ViewGroup] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1H.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (AbstractC76663cE.A02(this.A02)) {
            return AbstractC111324zv.A00(884);
        }
        return "click_to_messaging_on_feed_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0J.getValue();
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        C65886Tvq c65886Tvq;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = this.A01;
        if (iGCTMessagingAdsInfoDict != null && (c65886Tvq = this.A06) != null) {
            String str = this.A09;
            if (str == null) {
                str = "-1";
            }
            long A00 = VTE.A00(iGCTMessagingAdsInfoDict);
            C18920wW c18920wW = c65886Tvq.A01;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "on_feed_messages_dismiss");
            if (A002.isSampled()) {
                C65886Tvq.A01(A002, c65886Tvq, str, A00);
                A002.Cht();
            }
        }
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.95f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        int A02 = C0f9.A02(-768118580);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) bundle2.getParcelable(AbstractC111324zv.A00(2052));
            this.A01 = iGCTMessagingAdsInfoDict;
            if (iGCTMessagingAdsInfoDict != null) {
                onFeedMessagesIntf = iGCTMessagingAdsInfoDict.BUJ();
            } else {
                onFeedMessagesIntf = null;
            }
            this.A02 = onFeedMessagesIntf;
            this.A0B = bundle2.getString(AbstractC111324zv.A00(2851));
            this.A03 = (ImageUrl) bundle2.getParcelable(AbstractC111324zv.A00(2852));
            this.A09 = bundle2.getString("ad_id");
            this.A0A = bundle2.getString("media_id");
            this.A0F = bundle2.getString("reel_id");
            this.A0G = bundle2.getString(AbstractC111324zv.A00(2971));
            this.A0E = bundle2.getString(AbstractC111324zv.A00(2256));
            XNX xnx = (XNX) bundle2.getSerializable(AbstractC111324zv.A00(247));
            this.A0D = xnx;
            if (xnx != null) {
                this.A06 = new C65886Tvq(xnx, this, (UserSession) this.A0J.getValue());
            }
            C65886Tvq c65886Tvq = this.A06;
            if (c65886Tvq != null) {
                this.A05 = new C68981VfJ(c65886Tvq);
            }
            this.A0I = C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A0J.getValue(), 36326653000955929L);
            this.A04 = new C35209Fg1(requireContext(), this, this.A0I);
            this.A0C = bundle2.getInt("carousel_index");
        }
        C0f9.A09(692131683, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1350952583);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.on_feed_container_view, viewGroup, false);
        C0f9.A09(709607731, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C35209Fg1 c35209Fg1;
        int A02 = C0f9.A02(-1685920131);
        super.onPause();
        if (AbstractC76663cE.A02(this.A02) && (c35209Fg1 = this.A04) != null) {
            c35209Fg1.A03();
        }
        C69257VkQ c69257VkQ = this.A07;
        if (c69257VkQ != null) {
            c69257VkQ.A02.EJJ();
        }
        C0f9.A09(-346158735, A02);
    }
}
