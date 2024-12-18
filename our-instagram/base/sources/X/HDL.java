package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.feed.opencarousel.reviewpage.viewmodel.OpenCarouselReviewPageViewModel$fetchSubmission$2;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Collection;

/* loaded from: classes7.dex */
public final class HDL extends AbstractC60672pq implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "OpenCarouselReviewPageGridViewFragment";
    public C55101ObE A00;
    public IgdsButton A01;
    public IgdsButton A02;
    public IgdsButton A03;
    public View A04;
    public IgView A05;
    public IgView A06;
    public C65953Twy A07;
    public C154796xU A08;
    public C26830Bss A09;
    public final InterfaceC62612t0 A0A;
    public final InterfaceC09390do A0D;
    public final J1F A0E;
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public final String A0B = AbstractC111324zv.A00(2828);

    private final void A01(IgView igView, IgdsButton igdsButton, String str) {
        if (igdsButton != null) {
            igdsButton.setEnabled(false);
        }
        if (igView != null) {
            igView.setVisibility(0);
            C0fQ.A00(new ViewOnClickListenerC41920IiD(str, this, 0), igView);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969182);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = view.findViewById(R.id.bottom_button_container);
        IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.delete_button);
        if (igdsButton != null) {
            ViewOnClickListenerC42032Ik1.A01(igdsButton, 23, this);
        } else {
            igdsButton = null;
        }
        this.A03 = igdsButton;
        IgdsButton igdsButton2 = (IgdsButton) view.findViewById(R.id.accept_button);
        if (igdsButton2 != null) {
            C0fQ.A00(new ViewOnClickListenerC42034Ik3(18, igdsButton2, this), igdsButton2);
        } else {
            igdsButton2 = null;
        }
        this.A01 = igdsButton2;
        this.A05 = (IgView) view.findViewById(R.id.accept_button_click_overlay);
        this.A06 = (IgView) view.findViewById(R.id.remove_button_click_overlay);
        A03(this);
        ((HEM) getAdapter()).A0C();
        C3FQ scrollingViewProxy = getScrollingViewProxy();
        C65953Twy c65953Twy = this.A07;
        if (c65953Twy == null) {
            C14360o3.A0F("autoLoadMoreHelper");
            throw C00O.createAndThrow();
        }
        scrollingViewProxy.AAJ(c65953Twy);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 38), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(IgView igView, IgdsButton igdsButton) {
        if (igdsButton != null) {
            igdsButton.setEnabled(true);
        }
        if (igView != null) {
            igView.setVisibility(8);
            igView.setOnClickListener(null);
        }
    }

    public static final void A02(HDL hdl) {
        IgdsButton igdsButton;
        String A0r;
        int A04 = ((C38333GtS) hdl.A0D.getValue()).A04();
        if (A04 == 0) {
            IgdsButton igdsButton2 = hdl.A03;
            if (igdsButton2 != null) {
                igdsButton2.setText(AbstractC166997dE.A0N(hdl).getString(2131969154));
            }
            igdsButton = hdl.A01;
            if (igdsButton != null) {
                A0r = AbstractC166997dE.A0N(hdl).getString(2131969150);
                igdsButton.setText(A0r);
            }
        } else {
            IgdsButton igdsButton3 = hdl.A03;
            if (igdsButton3 != null) {
                igdsButton3.setText(AbstractC166997dE.A0r(AbstractC166997dE.A0N(hdl), Integer.valueOf(A04), 2131969151));
            }
            igdsButton = hdl.A01;
            if (igdsButton != null) {
                A0r = AbstractC166997dE.A0r(AbstractC166997dE.A0N(hdl), Integer.valueOf(A04), 2131969149);
                igdsButton.setText(A0r);
            }
        }
        A03(hdl);
        ((HEM) hdl.getAdapter()).A0C();
    }

    public static final void A03(HDL hdl) {
        IgdsButton igdsButton;
        IgView igView;
        int i;
        InterfaceC09390do interfaceC09390do = hdl.A0C;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(A0o), A0o, 36601719889269074L);
        InterfaceC09390do interfaceC09390do2 = hdl.A0D;
        if (((C38333GtS) interfaceC09390do2.getValue()).A04() == 0) {
            i = 2131969164;
            hdl.A01(hdl.A06, hdl.A03, AbstractC25227BEk.A0v(hdl, 2131969164));
            igdsButton = hdl.A01;
            igView = hdl.A05;
        } else {
            if (((C38333GtS) interfaceC09390do2.getValue()).A04() > A07) {
                A00(hdl.A06, hdl.A03);
                IgdsButton igdsButton2 = hdl.A01;
                IgView igView2 = hdl.A05;
                String string = hdl.getString(2131969126, AbstractC25228BEl.A1Y(A07));
                C14360o3.A07(string);
                hdl.A01(igView2, igdsButton2, string);
                return;
            }
            int A04 = ((C38333GtS) interfaceC09390do2.getValue()).A00 + ((C38333GtS) interfaceC09390do2.getValue()).A04();
            int A00 = C41754IeU.A00(AbstractC166987dD.A0r(interfaceC09390do));
            A00(hdl.A06, hdl.A03);
            igdsButton = hdl.A01;
            igView = hdl.A05;
            if (A04 > A00) {
                i = 2131969125;
            } else {
                A00(igView, igdsButton);
                return;
            }
        }
        hdl.A01(igView, igdsButton, AbstractC25227BEk.A0v(hdl, i));
    }

    public static final void A04(HDL hdl) {
        C38333GtS c38333GtS = (C38333GtS) hdl.A0D.getValue();
        if (c38333GtS.A05() == EnumC46210Kcm.A04 && c38333GtS.A08() && !AbstractC166987dD.A1b(((AbstractC65332xV) ((HEM) hdl.getAdapter()).A01).A01)) {
            AbstractC25226BEj.A1Q(hdl);
        }
    }

    public static final void A06(HDL hdl, boolean z, boolean z2) {
        Object value;
        C37838Gks c37838Gks;
        InterfaceC09390do interfaceC09390do = hdl.A0D;
        Object A00 = C38333GtS.A00(interfaceC09390do);
        Integer num = C05F.A01;
        if (A00 != num) {
            if (!z2 && ((C38333GtS) interfaceC09390do.getValue()).A08()) {
                return;
            }
            C38333GtS c38333GtS = (C38333GtS) interfaceC09390do.getValue();
            C154796xU c154796xU = hdl.A08;
            if (c154796xU == null) {
                AbstractC37300Gc1.A0b();
                throw C00O.createAndThrow();
            }
            C05A c05a = c38333GtS.A04;
            do {
                value = c05a.getValue();
                c37838Gks = (C37838Gks) value;
            } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, null, null, num, AbstractC001800i.A0T(C42561Isf.A00, (Collection) c37838Gks.A02), null, null, null, 93)));
            AbstractC166987dD.A1Z(new OpenCarouselReviewPageViewModel$fetchSubmission$2(c154796xU, c38333GtS, null, z2, z), AbstractC141776au.A00(c38333GtS));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public HDL() {
        J7S j7s = new J7S(this, 17);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7S(new J7S(this, 14), 15));
        this.A0D = AbstractC25225BEi.A0a(new J7S(A00, 16), j7s, new D8M(24, null, A00), AbstractC25225BEi.A1D(C38333GtS.class));
        this.A0E = new J1F(this, 1);
        this.A0A = new C42508Irn(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r5 < X.AbstractC25225BEi.A07(X.AbstractC166997dE.A0U(r3), r3, 36601719889203537L)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.HDL r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            androidx.fragment.app.FragmentActivity r4 = r9.getActivity()
            if (r4 == 0) goto L5f
            X.Fc1 r6 = X.C35028Fc1.A00(r10)
            java.lang.String r0 = r9.A0B
            r6.A0E = r0
            r8 = 1
            r6.A0N = r8
            r6.A07 = r11
            if (r12 == 0) goto L48
            r6.A0L = r8
            X.0do r1 = r9.A0D
            java.lang.Object r0 = r1.getValue()
            X.GtS r0 = (X.C38333GtS) r0
            boolean r7 = r0.A09(r10)
            if (r7 != 0) goto L44
            java.lang.Object r0 = r1.getValue()
            X.GtS r0 = (X.C38333GtS) r0
            int r5 = r0.A04()
            X.0do r0 = r9.A0C
            X.0ll r3 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36601719889203537(0x820912002a1151, double:3.2104132690039485E-306)
            int r0 = X.AbstractC25225BEi.A07(r2, r3, r0)
            if (r5 >= r0) goto L48
        L44:
            r6.A0R = r8
            r6.A0Q = r7
        L48:
            X.0do r0 = r9.A0C
            X.0ll r3 = X.AbstractC166987dD.A0o(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = r6.A01()
            java.lang.String r0 = "single_media_feed"
            X.6XJ r1 = X.AbstractC31174DnI.A0a(r4, r1, r3, r2, r0)
            r0 = 15583(0x3cdf, float:2.1836E-41)
            r1.A0A(r4, r0)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDL.A05(X.HDL, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String string;
        super.onActivityResult(i, i2, intent);
        if (i == 15583 && i2 == -1) {
            boolean z = true;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null || !extras.getBoolean(AbstractC111324zv.A00(2371))) {
                    z = false;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString(AbstractC111324zv.A00(2372))) != null) {
                    InterfaceC09390do interfaceC09390do = this.A0D;
                    if (z != ((C38333GtS) interfaceC09390do.getValue()).A09(string)) {
                        C155946zO c155946zO = ((HEM) getAdapter()).A01;
                        Number A0Q = AbstractC37300Gc1.A0Q(string, ((AbstractC65332xV) c155946zO).A03);
                        if (A0Q != null) {
                            C38321qM c38321qM = (C38321qM) ((AbstractC65332xV) c155946zO).A01.get(A0Q.intValue());
                            if (c38321qM != null) {
                                C55101ObE c55101ObE = this.A00;
                                if (c55101ObE != null) {
                                    c55101ObE.A05(EnumC39652Hih.A0i, c38321qM.A2u());
                                }
                                ((C38333GtS) interfaceC09390do.getValue()).A06(AbstractC166987dD.A0r(this.A0C), c38321qM);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(1191440736);
        super.onCreate(bundle);
        Context context = getContext();
        if (context == null) {
            i = 424320304;
        } else {
            InterfaceC09390do interfaceC09390do = this.A0C;
            C55101ObE c55101ObE = new C55101ObE(AbstractC166987dD.A0r(interfaceC09390do), context);
            c55101ObE.A00 = requireArguments().getString("viewer_session_id");
            this.A00 = c55101ObE;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            J1F j1f = this.A0E;
            setAdapter(new HEM(context, this, A0r, (C38333GtS) this.A0D.getValue(), this.A00, C38U.A00, j1f, new C38247Grq(this, 1)));
            this.A08 = AbstractC37302Gc3.A0L(context, this, AbstractC166987dD.A0r(interfaceC09390do));
            int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            this.A07 = new C65953Twy(AbstractC166987dD.A0r(interfaceC09390do), this.A0A, C05F.A01, 6);
            A06(this, true, false);
            i = 1329439300;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1816830650);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.open_carousel_grid_review_page_layout, viewGroup, false);
        IgdsButton igdsButton = (IgdsButton) inflate.requireViewById(R.id.filter_button);
        igdsButton.A02(EnumC99774dy.A02, R.drawable.instagram_chevron_down_pano_filled_12);
        igdsButton.setIconPadding(igdsButton.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        C0fQ.A00(new ViewOnClickListenerC48074LPz(this, 48), igdsButton);
        this.A02 = igdsButton;
        C26830Bss c26830Bss = new C26830Bss();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, AbstractC166987dD.A0r(this.A0C));
        c26830Bss.setArguments(A0b);
        this.A09 = c26830Bss;
        C14240no c14240no = new C14240no(getChildFragmentManager());
        c14240no.A09(c26830Bss, R.id.header_container);
        c14240no.A0K();
        C0f9.A09(26665132, A02);
        return inflate;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-408040842);
        super.onDestroyView();
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A05 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        C0f9.A09(85183150, A02);
    }
}
