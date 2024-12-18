package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class HCB extends AbstractC59962oe implements InterfaceC60072op, InterfaceC43441JHf, JHL, JHM, JGX, JGQ, JPj, JPk, JPl {
    public static final String __redex_internal_original_name = "LightboxFragment";
    public int A00;
    public long A01;
    public C38309Gsv A02;
    public String A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC60442pS A09 = new Object();
    public final InterfaceC09390do A0A = A01(this, 18);
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;

    @Override // X.JHL
    public final void DRF(C39350HZp c39350HZp) {
        int i;
        String string;
        C41728Idz A0L = AbstractC37304Gc5.A0L(this);
        C38321qM c38321qM = c39350HZp.A00;
        String str = c39350HZp.A02;
        String str2 = c39350HZp.A03;
        int indexOf = this.A04.indexOf(c39350HZp);
        int size = this.A04.size();
        boolean A05 = A05(this, c39350HZp);
        boolean z = this.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0L.A02, "instagram_shopping_lightbox_media_attribution_permalink_click");
        if (A0f.isSampled()) {
            String id = c38321qM.getId();
            if (id != null) {
                A0f.AAP("item_media_id", id);
                UserSession userSession = A0L.A03;
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    A0f.AAP("item_media_owner_id", A2E.getId());
                    Product product = A0L.A05;
                    AbstractC37303Gc4.A0j(A0f, product);
                    String A0j = AbstractC37304Gc5.A0j(product);
                    if (A0j == null) {
                        A0j = "";
                    }
                    A0f.AAP("merchant_id", A0j);
                    AbstractC37302Gc3.A10(A0f, product);
                    AbstractC37304Gc5.A17(A0f, str, str2, indexOf);
                    C41728Idz.A02(A0f, A0L, size, A05, z);
                    C38321qM c38321qM2 = A0L.A04;
                    if (c38321qM2 != null && c38321qM2.A2E(userSession) != null) {
                        A0f.AAP("media_owner_id", AbstractC37304Gc5.A0e(A0f, userSession, c38321qM2));
                    }
                    A0f.Cht();
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C38321qM c38321qM3 = c39350HZp.A01;
        if (!AbstractC82403m3.A09(c38321qM3)) {
            FragmentActivity requireActivity = requireActivity();
            InterfaceC09390do interfaceC09390do = this.A0G;
            C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do);
            A0c.A08();
            IgFragmentFactoryImpl.A00();
            String id2 = c38321qM3.getId();
            if (id2 != null) {
                C35028Fc1 c35028Fc1 = new C35028Fc1();
                c35028Fc1.A0B = id2;
                c35028Fc1.A00 = c38321qM.A16(AbstractC166987dD.A0r(interfaceC09390do));
                A0c.A0D(c35028Fc1.A02());
                A0c.A04();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C1XJ c1xj = C1XJ.A00;
        InterfaceC09390do interfaceC09390do2 = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
        FragmentActivity requireActivity2 = requireActivity();
        EnumC39540HdC enumC39540HdC = EnumC39540HdC.A02;
        String str3 = AbstractC37300Gc1.A0H(this.A0A).A0E;
        int ordinal = c38321qM3.BRp().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 4) {
                    string = "";
                    String id3 = c38321qM3.getId();
                    Integer A0c2 = AbstractC37301Gc2.A0c(AbstractC166987dD.A0r(interfaceC09390do2), c38321qM);
                    Bundle A0b = AbstractC166987dD.A0b();
                    AbstractC37301Gc2.A0u(A0b, c38321qM);
                    A0b.putString("parent_media_id", c38321qM3.getId());
                    c1xj.A0i(A0b, requireActivity2, A0r, enumC39540HdC, A0c2, str3, string, id3, null, null, null);
                }
                i = 2131969835;
            } else {
                i = 2131976620;
            }
        } else {
            i = 2131969575;
        }
        string = getString(i);
        String id32 = c38321qM3.getId();
        Integer A0c22 = AbstractC37301Gc2.A0c(AbstractC166987dD.A0r(interfaceC09390do2), c38321qM);
        Bundle A0b2 = AbstractC166987dD.A0b();
        AbstractC37301Gc2.A0u(A0b2, c38321qM);
        A0b2.putString("parent_media_id", c38321qM3.getId());
        c1xj.A0i(A0b2, requireActivity2, A0r, enumC39540HdC, A0c22, str3, string, id32, null, null, null);
    }

    @Override // X.JHN
    public final void DpH(InterfaceC58290Psi interfaceC58290Psi, C39352HZr c39352HZr) {
        Reel reel = c39352HZr.A01;
        C38E c38e = (C38E) this.A0E.getValue();
        InterfaceC09390do interfaceC09390do = this.A0A;
        c38e.A0C = AbstractC37300Gc1.A0H(interfaceC09390do).A0E;
        c38e.A05 = new C31559Dtj(requireActivity(), interfaceC58290Psi.Ahl(), new C42788IwQ(3), C05F.A01);
        c38e.A0B = AbstractC37300Gc1.A0H(interfaceC09390do).A0E;
        c38e.A07(reel, C3G2.A1B, interfaceC58290Psi, AbstractC166987dD.A1J(reel), AbstractC166987dD.A1J(reel), 0);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC56402iY.A06(requireActivity(), true);
        View A0c = AbstractC166987dD.A0c(view, R.id.primary_close_button);
        View A0c2 = AbstractC166987dD.A0c(view, R.id.white_close_button);
        InterfaceC09390do interfaceC09390do = this.A0L;
        if (interfaceC09390do.getValue() instanceof C7ET) {
            InterfaceC677033k interfaceC677033k = (InterfaceC677033k) interfaceC09390do.getValue();
            C14360o3.A0C(interfaceC677033k, "null cannot be cast to non-null type com.instagram.ui.zoom.MultiGestureZoomableViewController");
            ((C7ET) interfaceC677033k).A0C = new J1W(this);
        }
        this.A02 = new C38309Gsv(this.A09, AbstractC166987dD.A0r(this.A0G), (INQ) this.A0I.getValue(), this, (C41045IFo) this.A0J.getValue(), (C4ZF) this.A0D.getValue());
        ReboundViewPager reboundViewPager = (ReboundViewPager) AbstractC166987dD.A0c(view, R.id.view_pager);
        reboundViewPager.setAdapter(this.A02);
        reboundViewPager.A0R(true, this.A00);
        reboundViewPager.A0P(new HJE(A0c, A0c2, reboundViewPager, this));
        ViewOnClickListenerC42033Ik2 viewOnClickListenerC42033Ik2 = new ViewOnClickListenerC42033Ik2(this, 55);
        C0fQ.A00(viewOnClickListenerC42033Ik2, A0c);
        C0fQ.A00(viewOnClickListenerC42033Ik2, A0c2);
        A02(A0c, A0c2, this);
        AbstractC37301Gc2.A0v(reboundViewPager, (C57112jm) this.A0K.getValue(), this);
        C38309Gsv c38309Gsv = this.A02;
        if (c38309Gsv != null) {
            List list = this.A04;
            C14360o3.A0B(list, 0);
            c38309Gsv.A02 = list;
            C0fA.A00(c38309Gsv, 612254867);
        }
        IJ6 ij6 = new IJ6(AbstractC166997dE.A0S(view, R.id.cta_container));
        InterfaceC09390do interfaceC09390do2 = this.A0B;
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C38332GtR) interfaceC09390do2.getValue()).A02, new C57751Pje(5, ij6, this), 11);
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new C43171J6q(this, null, 33), ((C38332GtR) interfaceC09390do2.getValue()).A0E));
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new C43206J8d(obj, i));
    }

    public static final void A02(View view, View view2, HCB hcb) {
        IN1 in1 = (IN1) hcb.A04.get(hcb.A00);
        int A0A = AbstractC13880nE.A0A(hcb.requireContext());
        int A09 = AbstractC13880nE.A09(hcb.requireContext());
        int i = (int) ((1.0f / in1.A00) * A0A);
        int i2 = 0;
        boolean z = false;
        int i3 = 8;
        if (i < A09) {
            z = true;
            i3 = 0;
        }
        view.setVisibility(i3);
        if (!(!z)) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.HCB r4) {
        /*
            X.0do r3 = r4.A0I
            java.lang.Object r1 = r3.getValue()
            X.INQ r1 = (X.INQ) r1
            java.lang.String r0 = "scroll"
            r1.A03(r0)
            java.util.List r1 = r4.A04
            int r0 = r4.A00
            java.lang.Object r2 = r1.get(r0)
            X.IN1 r2 = (X.IN1) r2
            java.lang.Integer r0 = r2.A02
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L67
            r0 = 4
            if (r1 == r0) goto L5c
            r0 = 5
            if (r1 != r0) goto L4a
            X.HZr r2 = (X.C39352HZr) r2
            X.1qM r2 = r2.A00
        L2a:
            boolean r0 = r2.Cff()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r3.getValue()
            X.INQ r0 = (X.INQ) r0
        L36:
            r0.A00(r2)
            X.Gsv r1 = r4.A02
            if (r1 == 0) goto L49
            X.HdD r0 = X.EnumC39541HdD.A04
            r1.A01 = r0
            r1.A00 = r2
            r0 = 1818280790(0x6c60c356, float:1.0868873E27)
            X.C0fA.A00(r1, r0)
        L49:
            return
        L4a:
            X.Gsv r2 = r4.A02
            if (r2 == 0) goto L49
            X.HdD r1 = X.EnumC39541HdD.A02
            r0 = 0
            r2.A01 = r1
            r2.A00 = r0
            r0 = 1818280790(0x6c60c356, float:1.0868873E27)
            X.C0fA.A00(r2, r0)
            return
        L5c:
            X.HZo r2 = (X.C39349HZo) r2
            java.lang.Object r0 = r3.getValue()
            X.INQ r0 = (X.INQ) r0
            X.1qM r2 = r2.A00
            goto L36
        L67:
            X.HZp r2 = (X.C39350HZp) r2
            X.1qM r2 = r2.A00
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCB.A03(X.HCB):void");
    }

    public static final boolean A05(HCB hcb, IN1 in1) {
        C38321qM c38321qM;
        UserSession A0r = AbstractC166987dD.A0r(hcb.A0G);
        String A0d = AbstractC37302Gc3.A0d(AbstractC37300Gc1.A0H(hcb.A0A).A01);
        C14360o3.A0A(A0d);
        AbstractC167007dF.A1D(A0r, 0, A0d);
        Integer num = in1.A02;
        if (num == C05F.A01) {
            c38321qM = ((C39350HZp) in1).A01;
        } else {
            if (num != C05F.A0j) {
                return false;
            }
            c38321qM = ((C39352HZr) in1).A00;
        }
        User A2E = c38321qM.A2E(A0r);
        if (A2E == null) {
            return false;
        }
        String id = A2E.getId();
        if (AbstractC82403m3.A03(c38321qM) != null || C14360o3.A0K(id, A0d)) {
            return false;
        }
        return true;
    }

    public final void A06(View view, boolean z) {
        if (!this.A06) {
            int i = 0;
            if (z) {
                i = 4;
            }
            AbstractC31176DnK.A1E(view, R.id.username_attribution, i);
            AbstractC31176DnK.A1E(view, R.id.delimiter_attribution, i);
            AbstractC31176DnK.A1E(view, R.id.view_media_attribution, i);
            View view2 = this.mView;
            if (view2 != null) {
                View A0c = AbstractC166987dD.A0c(view2, R.id.primary_close_button);
                View A0c2 = AbstractC166987dD.A0c(view2, R.id.white_close_button);
                if (i == 4) {
                    A0c.setVisibility(i);
                    A0c2.setVisibility(i);
                } else {
                    A02(A0c, A0c2, this);
                }
                View A0c3 = AbstractC166987dD.A0c(view2, R.id.cta_container);
                if (A0c3.getVisibility() != i) {
                    if (A0c3.getVisibility() == 0) {
                        this.A08 = true;
                        A0c3.setVisibility(4);
                    } else {
                        if (!this.A08) {
                            return;
                        }
                        A0c3.setVisibility(0);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC43441JHf
    public final void Cve() {
        ((C38332GtR) this.A0B.getValue()).A04(true);
    }

    @Override // X.InterfaceC43441JHf
    public final void D13() {
        ((C38332GtR) this.A0B.getValue()).A05(true);
    }

    @Override // X.JGQ
    public final void Dyl() {
        ((C4ZF) this.A0D.getValue()).A02(C30R.A0B);
        C5TA c5ta = ((INQ) this.A0I.getValue()).A01;
        if (c5ta != null) {
            c5ta.A03(-1);
        }
        C38309Gsv c38309Gsv = this.A02;
        if (c38309Gsv != null) {
            C0fA.A00(c38309Gsv, -1582815345);
        }
    }

    @Override // X.JGX
    public final void E04(C38321qM c38321qM, C105824pt c105824pt) {
        View view = this.mView;
        if (view != null) {
            view.post(new RunnableC43133J4w(c38321qM, this));
        }
    }

    @Override // X.InterfaceC43441JHf
    public final void E0f() {
        String str;
        InterfaceC09390do interfaceC09390do = this.A0A;
        User user = AbstractC37300Gc1.A0H(interfaceC09390do).A01.A0B;
        String str2 = null;
        if (user != null) {
            str = AbstractC76433bn.A00(user);
        } else {
            str = null;
        }
        String str3 = AbstractC37300Gc1.A0H(interfaceC09390do).A07;
        if (str3 != null) {
            str2 = AbstractC41071vF.A0I(AbstractC166987dD.A0r(this.A0G), str3);
        }
        if (str != null) {
            C1XJ.A00.A0m(requireActivity(), EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, AbstractC166987dD.A0r(this.A0G), null, str, AbstractC37300Gc1.A0H(interfaceC09390do).A0E, this.A09.getModuleName(), "view_in_cart_cta", null, str2, null, null, AbstractC37300Gc1.A0H(interfaceC09390do).A03, AbstractC37300Gc1.A0H(interfaceC09390do).A01.A0H, AbstractC37300Gc1.A0H(interfaceC09390do).A07, AbstractC37300Gc1.A0H(interfaceC09390do).A02, null, null, false);
            return;
        }
        C1XJ.A00.A0p(requireActivity(), EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, AbstractC166987dD.A0r(this.A0G), AbstractC37300Gc1.A0H(interfaceC09390do).A0E, this.A09.getModuleName(), "view_in_cart_cta", str2, AbstractC37300Gc1.A0H(interfaceC09390do).A07, AbstractC37300Gc1.A0H(interfaceC09390do).A02, false);
    }

    @Override // X.JHM
    public final void F7v(View view, InterfaceC73933Tf interfaceC73933Tf, IN1 in1, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        boolean z = !this.A07;
        this.A07 = z;
        A06(view, z);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A09.getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2pS, java.lang.Object] */
    public HCB() {
        C43206J8d c43206J8d = new C43206J8d(this, 19);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43206J8d(new C43206J8d(this, 23), 24));
        this.A0B = AbstractC25225BEi.A0a(new C43206J8d(A00, 25), c43206J8d, C43208J8f.A00(null, A00, 4), AbstractC25225BEi.A1D(C38332GtR.class));
        this.A0C = A01(this, 20);
        this.A0D = C1XM.A00(J8C.A00);
        this.A0E = A01(this, 21);
        this.A0F = A01(this, 22);
        this.A0H = A01(this, 26);
        this.A0I = A01(this, 27);
        this.A0J = A01(this, 28);
        this.A0K = C1XM.A00(J8D.A00);
        this.A0L = A01(this, 29);
        this.A03 = "back_button";
        this.A04 = AbstractC166987dD.A1E();
        this.A0G = AbstractC60492pY.A02(this);
    }

    public static final List A00(List list) {
        InterfaceC43546JLg A03;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            IN1 in1 = (IN1) obj;
            Integer num = in1.A02;
            if (num != C05F.A00) {
                if (num == C05F.A01 && (in1 instanceof C39350HZp) && (A03 = AbstractC82403m3.A03(((C39350HZp) in1).A00)) != null) {
                    JLH BcS = A03.BcS();
                    if (BcS != null) {
                        featuredProductPermissionStatus = BcS.C0K();
                    } else {
                        featuredProductPermissionStatus = null;
                    }
                    if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.A04) {
                    }
                }
                A1E.add(obj);
            }
        }
        return A1E;
    }

    private final void A04(String str) {
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A0G;
        C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do);
        A0c.A08();
        C28431Ze A02 = AbstractC31364DqT.A02();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), str, "shopping_lightbox", this.A09.getModuleName());
        A01.A0L = AbstractC37300Gc1.A0H(this.A0A).A0E;
        C31368DqX.A02(A0c, A0r, A02, A01);
    }

    @Override // X.JHL
    public final void DRE(C39350HZp c39350HZp) {
        C41728Idz A0L = AbstractC37304Gc5.A0L(this);
        C38321qM c38321qM = c39350HZp.A00;
        A0L.A04(c38321qM, c39350HZp.A02, c39350HZp.A03, this.A04.indexOf(c39350HZp), this.A04.size(), A05(this, c39350HZp), this.A05);
        User A2E = c38321qM.A2E(AbstractC166987dD.A0r(this.A0G));
        if (A2E != null) {
            A04(A2E.getId());
        }
    }

    @Override // X.JHN
    public final void DpG(C39352HZr c39352HZr) {
        C41728Idz A0L = AbstractC37304Gc5.A0L(this);
        C38321qM c38321qM = c39352HZr.A00;
        A0L.A04(c38321qM, c39352HZr.A02, c39352HZr.A03, this.A04.indexOf(c39352HZr), this.A04.size(), A05(this, c39352HZr), this.A05);
        User A2E = c38321qM.A2E(AbstractC166987dD.A0r(this.A0G));
        if (A2E != null) {
            A04(A2E.getId());
        }
    }

    @Override // X.JHM
    public final void E2C(View view, InterfaceC73933Tf interfaceC73933Tf, IN1 in1, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        AbstractC167017dG.A1N(in1, interfaceC73933Tf);
        InterfaceC09390do interfaceC09390do = this.A0L;
        if (((InterfaceC677033k) interfaceC09390do.getValue()).isIdle()) {
            C41728Idz A0L = AbstractC37304Gc5.A0L(this);
            String A01 = in1.A01();
            String str = in1.A03;
            int indexOf = this.A04.indexOf(in1);
            int size = this.A04.size();
            boolean A05 = A05(this, in1);
            boolean z = this.A05;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0L.A02, "instagram_shopping_lightbox_item_zoom");
            if (A0f.isSampled()) {
                Product product = A0L.A05;
                AbstractC37303Gc4.A0j(A0f, product);
                String A0j = AbstractC37304Gc5.A0j(product);
                if (A0j == null) {
                    A0j = "";
                }
                A0f.AAP("merchant_id", A0j);
                AbstractC37302Gc3.A10(A0f, product);
                AbstractC37304Gc5.A17(A0f, A01, str, indexOf);
                C41728Idz.A02(A0f, A0L, size, A05, z);
                C38321qM c38321qM = A0L.A04;
                if (c38321qM != null) {
                    UserSession userSession = A0L.A03;
                    if (c38321qM.A2E(userSession) != null) {
                        A0f.AAP("media_owner_id", AbstractC37304Gc5.A0e(A0f, userSession, c38321qM));
                    }
                }
                A0f.Cht();
            }
            ((InterfaceC677033k) interfaceC09390do.getValue()).EoL(view, interfaceC73933Tf, scaleGestureDetectorOnScaleGestureListenerC81153jk);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C41728Idz A0L = AbstractC37304Gc5.A0L(this);
        String str = this.A03;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0L.A02, "instagram_shopping_lightbox_dismiss");
        if (A0f.isSampled()) {
            A0f.AAP(CacheBehaviorLogger.SOURCE, str);
            Product product = A0L.A05;
            AbstractC37303Gc4.A0j(A0f, product);
            String A0j = AbstractC37304Gc5.A0j(product);
            if (A0j == null) {
                A0j = "";
            }
            A0f.AAP("merchant_id", A0j);
            AbstractC37302Gc3.A10(A0f, product);
            C41728Idz.A01(A0f, A0L);
            C38321qM c38321qM = A0L.A04;
            if (c38321qM != null) {
                UserSession userSession = A0L.A03;
                if (c38321qM.A2E(userSession) != null) {
                    A0f.AAP("media_owner_id", AbstractC37304Gc5.A0e(A0f, userSession, c38321qM));
                }
            }
            A0f.Cht();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IN1 c39354HZt;
        List A0O;
        int A02 = C0f9.A02(-622141391);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A0A;
        Parcelable[] parcelableArr = AbstractC37300Gc1.A0H(interfaceC09390do2).A0K;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Parcelable parcelable : parcelableArr) {
            HeroCarouselItemConverter$ParcelableHeroCarouselItemModel heroCarouselItemConverter$ParcelableHeroCarouselItemModel = (HeroCarouselItemConverter$ParcelableHeroCarouselItemModel) parcelable;
            C1DX A00 = C1DW.A00(A0r);
            int intValue = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A02.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue == 5) {
                                String str = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A07;
                                str.getClass();
                                Reel A0M = C1OU.A04(A0r).A0M(str);
                                if (A0M != null && (A0O = A0M.A0O(A0r)) != null && !A0O.isEmpty()) {
                                    String str2 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05;
                                    C38321qM c38321qM = ((C41181vS) A0O.get(0)).A0b;
                                    c38321qM.getClass();
                                    c39354HZt = new C39352HZr(c38321qM, A0M, str2);
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            String str3 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A09;
                            str3.getClass();
                            String str4 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05;
                            C38321qM A022 = A00.A02(str3);
                            A022.getClass();
                            c39354HZt = new C39349HZo(A022, str4);
                        }
                    } else {
                        ImageInfo imageInfo = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A00;
                        imageInfo.getClass();
                        c39354HZt = new C39351HZq(imageInfo, heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05, heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A06);
                    }
                } else {
                    String str5 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A09;
                    str5.getClass();
                    String str6 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A08;
                    str6.getClass();
                    C38321qM A023 = A00.A02(str5);
                    C38321qM A024 = A00.A02(str6);
                    if (A023 != null && A024 != null) {
                        c39354HZt = new C39350HZp(A023, A024, heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05);
                    }
                }
            } else {
                String str7 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A04;
                str7.getClass();
                String str8 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A03;
                str8.getClass();
                ProductArEffectMetadata productArEffectMetadata = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A01;
                productArEffectMetadata.getClass();
                ImageInfo imageInfo2 = heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A00;
                imageInfo2.getClass();
                c39354HZt = new C39354HZt(imageInfo2, productArEffectMetadata, null, heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A05, str7, str8, heroCarouselItemConverter$ParcelableHeroCarouselItemModel.A06, null);
            }
            A1E.add(c39354HZt);
        }
        List A002 = A00(A1E);
        this.A04 = A002;
        int i = 0;
        int size = A002.size();
        while (true) {
            if (i >= size) {
                break;
            }
            if (C14360o3.A0K(((IN1) this.A04.get(i)).A01(), AbstractC37300Gc1.A0H(interfaceC09390do2).A06)) {
                this.A00 = i;
                break;
            }
            i++;
        }
        InterfaceC09390do interfaceC09390do3 = this.A0C;
        C41728Idz c41728Idz = (C41728Idz) interfaceC09390do3.getValue();
        int size2 = this.A04.size();
        int i2 = this.A00;
        boolean z = AbstractC37300Gc1.A0H(interfaceC09390do2).A0J;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41728Idz.A02, "instagram_shopping_lightbox_entry");
        if (A0f.isSampled()) {
            AbstractC37304Gc5.A11(A0f, size2);
            A0f.A7v("is_loading", AbstractC37300Gc1.A0P(A0f, AbstractC31171DnF.A0V(i2), "initial_index", z));
            Product product = c41728Idz.A05;
            AbstractC37303Gc4.A0j(A0f, product);
            String A0j = AbstractC37304Gc5.A0j(product);
            if (A0j == null) {
                A0j = "";
            }
            A0f.AAP("merchant_id", A0j);
            AbstractC37302Gc3.A10(A0f, product);
            C41728Idz.A01(A0f, c41728Idz);
            C38321qM c38321qM2 = c41728Idz.A04;
            if (c38321qM2 != null) {
                UserSession userSession = c41728Idz.A03;
                if (c38321qM2.A2E(userSession) != null) {
                    A0f.AAP("media_owner_id", AbstractC37304Gc5.A0e(A0f, userSession, c38321qM2));
                }
            }
            A0f.Cht();
        }
        if (AbstractC37300Gc1.A0H(interfaceC09390do2).A0J) {
            this.A05 = true;
            this.A01 = System.currentTimeMillis();
            Product product2 = AbstractC37300Gc1.A0H(interfaceC09390do2).A01;
            String str9 = AbstractC37300Gc1.A0H(interfaceC09390do2).A09;
            Context requireContext = requireContext();
            C08790ch A003 = AbstractC018607g.A00(this);
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            String A0d = AbstractC37302Gc3.A0d(product2);
            C14360o3.A0A(A0d);
            AbstractC40799I6b.A00(requireContext, A003, A0r2, new C42860Ixa(this), product2, str9, A0d, null, AbstractC37300Gc1.A0H(interfaceC09390do2).A0A, AbstractC37300Gc1.A0H(interfaceC09390do2).A0I);
        } else {
            ((C41728Idz) interfaceC09390do3.getValue()).A03(this.A04.size(), this.A00, 0L);
        }
        C0f9.A09(1183226702, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(76114054);
        C14360o3.A0B(layoutInflater, 0);
        ((InterfaceC677033k) this.A0L.getValue()).start();
        View inflate = layoutInflater.inflate(R.layout.lightbox, viewGroup, false);
        C0f9.A09(1408344446, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1524319473);
        super.onDestroyView();
        ((InterfaceC677033k) this.A0L.getValue()).stop();
        this.A02 = null;
        C0f9.A09(-467673420, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2030758713);
        super.onPause();
        ((INQ) this.A0I.getValue()).A02("fragment_paused");
        C0f9.A09(-613425966, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2089401267);
        super.onResume();
        C38332GtR c38332GtR = (C38332GtR) this.A0B.getValue();
        IMV imv = c38332GtR.A06;
        AbstractC166997dE.A1Y(imv.A03, imv.A01.A08(C38332GtR.A01(c38332GtR)));
        A03(this);
        C0f9.A09(-1871946908, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-309585566);
        super.onStop();
        C41082IGz c41082IGz = (C41082IGz) this.A0F.getValue();
        C64022vN c64022vN = c41082IGz.A01;
        if (!c64022vN.A07()) {
            ((C57652ke) c41082IGz.A02.getValue()).A0L(c64022vN.A04());
            c64022vN.A05();
        }
        C0f9.A09(1105877074, A02);
    }
}
