package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class N6L extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, JGA, InterfaceC64632wM {
    public static final String __redex_internal_original_name = "SuspectedBrandedContentReviewFragment";
    public RectF A00;
    public N3D A01;
    public Reel A02;
    public SpinnerImageView A03;
    public String A05;
    public String A06;
    public ViewGroup A07;
    public IgFrameLayout A08;
    public String A09;
    public String A0A;
    public String A04 = "feed";
    public final InterfaceC41501vz A0C = C56035Ou7.A00(this, 13);
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC64652wO
    public final void DSV(C69393Vmd c69393Vmd, C5GM c5gm) {
        Integer num;
        InterfaceC09390do interfaceC09390do;
        C140966Yy A0j;
        C102184io c102184io;
        List list;
        boolean z;
        String str = c69393Vmd.A01;
        int hashCode = str.hashCode();
        String str2 = "notifSource";
        String str3 = null;
        if (hashCode != 1671672458) {
            if (hashCode == 2082785123 && str.equals("branded_content_violation_edit")) {
                interfaceC09390do = this.A0B;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                Integer num2 = C05F.A0m;
                String str4 = this.A05;
                if (str4 != null) {
                    LinkedHashMap A0p = AbstractC25233BEq.A0p("media_type", this.A04, AbstractC166987dD.A1L("notif_source", str4));
                    N3D n3d = this.A01;
                    if (n3d != null) {
                        str3 = n3d.A04;
                    }
                    LL0.A03(this, A0r, num2, null, null, null, null, str3, null, A0p);
                    num = C05F.A0M;
                    if (AbstractC172137li.A04(AbstractC166987dD.A0r(interfaceC09390do))) {
                        N3D n3d2 = this.A01;
                        if (n3d2 != null) {
                            c102184io = n3d2.A00;
                        } else {
                            c102184io = null;
                        }
                        boolean A03 = C4A4.A03(AbstractC31175DnJ.A0K(interfaceC09390do, 0), 36316104561922028L);
                        A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
                        FT2.A01();
                        if (A03 && c102184io != null) {
                            User user = c102184io.A00;
                            boolean A1T = AbstractC167007dF.A1T(c102184io.A02);
                            Boolean bool = c102184io.A01;
                            if (bool != null) {
                                z = bool.booleanValue();
                            } else {
                                z = true;
                            }
                            list = AbstractC166987dD.A1J(new BrandedContentTag(user, A1T, z));
                        } else {
                            list = C16930sl.A00;
                        }
                        String str5 = this.A04;
                        String str6 = this.A06;
                        if (str6 == null) {
                            str2 = "violationMediaId";
                        } else {
                            A0j.A0B(null, AbstractC55149OdC.A03(null, str5, str6, list, false, true, A03, false, false));
                        }
                    } else {
                        A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
                        FT2.A01();
                        C32301EKo c32301EKo = new C32301EKo();
                        c32301EKo.setArguments(AbstractC166987dD.A0b());
                        A0j.A0B(null, c32301EKo);
                    }
                    A0j.A0A = "brandedcontent_violation";
                    A0j.A04();
                    AbstractC34898FZk.A00(AbstractC166987dD.A0r(interfaceC09390do), c5gm, num, C05F.A15);
                    return;
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            return;
        }
        if (str.equals("dismiss")) {
            num = C05F.A0C;
            interfaceC09390do = this.A0B;
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            Integer num3 = C05F.A0n;
            String str7 = this.A05;
            if (str7 != null) {
                LinkedHashMap A0p2 = AbstractC25233BEq.A0p("media_type", this.A04, AbstractC166987dD.A1L("notif_source", str7));
                N3D n3d3 = this.A01;
                if (n3d3 != null) {
                    str3 = n3d3.A04;
                }
                LL0.A03(this, A0r2, num3, null, null, null, null, str3, null, A0p2);
                String str8 = this.A09;
                if (str8 != null) {
                    C1ON A00 = AbstractC31425DrV.A00(AbstractC166987dD.A0r(interfaceC09390do), "hide", str8, this.A0A, null);
                    C50689MZh.A00(A00, this, 3);
                    C1GJ.A03(A00);
                } else {
                    onBackPressed();
                }
                AbstractC34898FZk.A00(AbstractC166987dD.A0r(interfaceC09390do), c5gm, num, C05F.A15);
                return;
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC64642wN
    public final void DSW(C5GM c5gm) {
    }

    @Override // X.InterfaceC64642wN
    public final void DSX(C5GM c5gm) {
    }

    @Override // X.JGA
    public final void Ddy(C42800Iwc c42800Iwc, Reel reel, List list) {
        String str;
        C37771pE c37771pE;
        List list2;
        C38321qM c38321qM;
        N3D n3d = this.A01;
        if (n3d != null && (c37771pE = n3d.A03) != null && (list2 = c37771pE.A1k) != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(list2, 0)) != null) {
            str = c38321qM.getId();
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add(valueOf);
        this.A00 = AbstractC13880nE.A0G(c42800Iwc.A06);
        C3M4 A06 = C1OU.A06(requireActivity(), AbstractC166987dD.A0r(this.A0B));
        RectF rectF = this.A00;
        if (rectF != null) {
            A06.A0V(null, rectF, this, reel, C3G2.A0L, new C36678GEy(1, this, reel, A1H), null, null, -1, true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969330);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "brandedcontent_violation";
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.N6L r18) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6L.A00(X.N6L):void");
    }

    public static final void A01(N6L n6l) {
        String str;
        SpinnerImageView spinnerImageView = n6l.A03;
        if (spinnerImageView == null) {
            str = "spinner";
        } else {
            AbstractC31171DnF.A1M(spinnerImageView);
            AbstractC12990ll A0o = AbstractC166987dD.A0o(n6l.A0B);
            String str2 = n6l.A06;
            if (str2 == null) {
                str = "violationMediaId";
            } else {
                C25621Ms A0D = AbstractC31179DnN.A0D(A0o);
                A0D.A0B(MSX.A0k("business/branded_content/bc_policy_violation/", C3YV.A02(str2)));
                C1ON A0e = AbstractC25227BEk.A0e(A0D, N3D.class, OO7.class);
                C50689MZh.A00(A0e, n6l, 2);
                n6l.schedule(A0e);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (isAdded()) {
            AbstractC25226BEj.A1P(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-820194015);
        super.onCreate(bundle);
        this.A06 = requireArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_VIOLATION_MEDIA_ID", "");
        this.A05 = requireArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_SOURCE", "");
        this.A09 = requireArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_ID", null);
        this.A0A = requireArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_TUUID", null);
        AbstractC31176DnK.A0Q(this.A0B).A01(this.A0C, C56021Ots.class);
        C0f9.A09(-369349547, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1666807704);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.violation_alert_fragment, viewGroup, false);
        this.A07 = (ViewGroup) inflate.findViewById(R.id.branded_content_violation_alert_list);
        this.A08 = (IgFrameLayout) inflate.findViewById(R.id.branded_content_preview);
        SpinnerImageView spinnerImageView = (SpinnerImageView) inflate.findViewById(R.id.preview_image_spinner);
        this.A03 = spinnerImageView;
        if (this.A01 == null) {
            A01(this);
        } else {
            if (spinnerImageView == null) {
                C14360o3.A0F("spinner");
                throw C00O.createAndThrow();
            }
            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
            A00(this);
        }
        C0f9.A09(-407527416, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1104911829);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A0B).A02(this.A0C, C56021Ots.class);
        C0f9.A09(-1059074310, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1926945658);
        super.onPause();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null) {
            A05.A0T();
        }
        C0f9.A09(-909248502, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        ViewTreeObserver viewTreeObserver;
        int A02 = C0f9.A02(1955058591);
        super.onResume();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a() && (view = this.mView) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC55502Okv.A00(viewTreeObserver, A05, this, 1);
        }
        C0f9.A09(2053579386, A02);
    }
}
