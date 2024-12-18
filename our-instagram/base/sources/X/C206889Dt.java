package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import go.Seq;

/* renamed from: X.9Dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206889Dt extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206889Dt(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.2FU, X.0cm, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        FlowingGridLayoutManager flowingGridLayoutManager;
        String str;
        Integer num;
        View view;
        int i;
        Resources resources;
        int i2;
        View view2;
        int i3;
        switch (this.A00) {
            case 0:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C38P) this.A01).getSession(), 36315881222966947L));
            case 1:
                C65823Tug c65823Tug = ((C38P) this.A01).A06;
                if (c65823Tug == null) {
                    str = "grid";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                DiscoveryRecyclerView discoveryRecyclerView = c65823Tug.A04;
                boolean z = true;
                if (discoveryRecyclerView != null && discoveryRecyclerView.getChildCount() != 0 && (flowingGridLayoutManager = c65823Tug.A02) != null && flowingGridLayoutManager.A1a() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                C38P c38p = (C38P) this.A01;
                C38P.A02(c38p);
                C38135Gq2 c38135Gq2 = c38p.A0J;
                if (c38135Gq2 == null) {
                    str = "viewController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C38135Gq2.A01(c38135Gq2, false, false, false);
                return C0eB.A00;
            case 3:
                ViewOnClickListenerC66108Tzj viewOnClickListenerC66108Tzj = (ViewOnClickListenerC66108Tzj) this.A01;
                SearchEditText searchEditText = viewOnClickListenerC66108Tzj.A01;
                if (searchEditText != null) {
                    searchEditText.A07(viewOnClickListenerC66108Tzj.A02, viewOnClickListenerC66108Tzj.A03, viewOnClickListenerC66108Tzj.A0H, 0L);
                }
                return C0eB.A00;
            case 4:
                int i4 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C38P c38p2 = (C38P) this.A01;
                Context requireContext = c38p2.requireContext();
                String moduleName = c38p2.getModuleName();
                UserSession session = c38p2.getSession();
                c38p2.getSession();
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                return new C61582rL(requireContext, c006802i, session, moduleName, 499005970);
            case 5:
                return new C93V((UserSession) this.A01);
            case 6:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                if (AbstractC54792fc.A06(abstractC12990ll)) {
                    num = C05F.A01;
                } else {
                    if (!AbstractC54782fb.A00(abstractC12990ll).booleanValue()) {
                        C18U.A06(C06090Tz.A05, abstractC12990ll, 36311285608415721L);
                    }
                    num = C05F.A00;
                }
                return new C58602mJ(num);
            case 7:
                return new C99694dm((UserSession) this.A01);
            case 8:
                C48092Iw c48092Iw = (C48092Iw) this.A01;
                C2J0 c2j0 = (C2J0) c48092Iw.A02.getValue();
                C2J1 c2j1 = (C2J1) c48092Iw.A04.getValue();
                C2J3 c2j3 = (C2J3) c48092Iw.A03.getValue();
                C14360o3.A0B(c2j0, 1);
                C14360o3.A0B(c2j1, 2);
                C14360o3.A0B(c2j3, 3);
                final InterfaceC08830cm A00 = C2FU.A00(c2j0);
                InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm(A00) { // from class: X.2J5
                    public final InterfaceC09390do A00;

                    @Override // X.InterfaceC08830cm
                    public final /* bridge */ /* synthetic */ Object get() {
                        return this.A00.getValue();
                    }

                    {
                        this.A00 = AbstractC09440dt.A01(new C206979Ec(A00, 37));
                    }
                };
                ?? obj = new Object();
                obj.A00 = interfaceC08830cm;
                obj.A01 = false;
                return new C2J6(obj, C2FU.A00(c2j1), C2FU.A00(c2j3));
            case 9:
                final UserSession userSession = ((C48092Iw) this.A01).A00;
                return new InterfaceC08830cm(userSession) { // from class: X.2J0
                    public final InterfaceC09390do A00;

                    @Override // X.InterfaceC08830cm
                    public final /* bridge */ /* synthetic */ Object get() {
                        return this.A00.getValue();
                    }

                    {
                        this.A00 = AbstractC09440dt.A01(new C206889Dt(userSession, 10));
                    }
                };
            case 10:
                UserSession userSession2 = (UserSession) this.A01;
                return new C62706SMu(new C64202T3r(userSession2), new C62655SKo(userSession2), new SCQ(userSession2), new IGPaymentMethodsAPI(userSession2, AbstractC58317Pt9.A00(183)));
            case 11:
                C47522Gc c47522Gc = (C47522Gc) this.A01;
                return C1AT.A01(c47522Gc.A02).A04(C1AV.A0K, c47522Gc.getClass());
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C2IJ((UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C80113i0(((C101024gI) this.A01).A00);
            case 14:
                return new C37317GcJ((C75113Zb) this.A01, 0);
            case Process.SIGTERM /* 15 */:
                return new C80213iA(((C101024gI) this.A01).A00);
            case 16:
                return new AnonymousClass422(((C101024gI) this.A01).A00);
            case 17:
                return new AnonymousClass424(((C101024gI) this.A01).A00);
            case 18:
                return new C906241x(((C101024gI) this.A01).A00);
            case Process.SIGSTOP /* 19 */:
                C41Q c41q = (C41Q) this.A01;
                return new C101024gI(c41q.A09, c41q.A0A.Am6(), c41q.A0C);
            case 20:
                return Float.valueOf(((View) ((C905641r) this.A01).A0F.getValue()).getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
            case 21:
                return ((View) ((C905641r) this.A01).A0F.getValue()).requireViewById(R.id.card);
            case 22:
                return ((View) ((C905641r) this.A01).A0F.getValue()).requireViewById(R.id.clickable_cta_button_overlay);
            case 23:
                return ((View) ((C905641r) this.A01).A0F.getValue()).requireViewById(R.id.cta_button);
            case 24:
                return ((View) ((C905641r) this.A01).A0F.getValue()).requireViewById(R.id.follow_button);
            case 25:
                view = (View) ((C905641r) this.A01).A0F.getValue();
                i = R.id.follow_text;
                return view.requireViewById(i);
            case 26:
                view = (View) ((C905641r) this.A01).A0F.getValue();
                i = R.id.how_it_works;
                return view.requireViewById(i);
            case 27:
                resources = ((View) ((C905641r) this.A01).A0F.getValue()).getResources();
                i2 = R.dimen.audience_lists_text_in_badge_horizontal_margin_right;
                return Integer.valueOf(resources.getDimensionPixelSize(i2));
            case 28:
                resources = ((View) ((C905641r) this.A01).A0F.getValue()).getResources();
                i2 = R.dimen.add_to_story_dual_destination_share_sheet_story_row_height;
                return Integer.valueOf(resources.getDimensionPixelSize(i2));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                resources = ((View) ((C905641r) this.A01).A0F.getValue()).getResources();
                i2 = R.dimen.action_bar_immersive_gradient_height;
                return Integer.valueOf(resources.getDimensionPixelSize(i2));
            case 30:
                return ((View) ((C905641r) this.A01).A0F.getValue()).requireViewById(R.id.profiles_pile);
            case 31:
                resources = ((View) ((C905641r) this.A01).A0F.getValue()).getResources();
                i2 = R.dimen.action_button_settings_height;
                return Integer.valueOf(resources.getDimensionPixelSize(i2));
            case 32:
                view = (View) ((C905641r) this.A01).A0F.getValue();
                i = R.id.sub_title;
                return view.requireViewById(i);
            case 33:
                view = (View) ((C905641r) this.A01).A0F.getValue();
                i = R.id.title;
                return view.requireViewById(i);
            case 34:
                return ((C905641r) this.A01).A00.getView();
            case 35:
                Object value = ((C905541q) this.A01).A02.getValue();
                C14360o3.A07(value);
                View requireViewById = ((View) value).requireViewById(R.id.grey_out_overlay);
                C14360o3.A07(requireViewById);
                return requireViewById;
            case 36:
                return ((C905541q) this.A01).A00.inflate();
            case 37:
                Object value2 = ((C905541q) this.A01).A02.getValue();
                C14360o3.A07(value2);
                View requireViewById2 = ((View) value2).requireViewById(R.id.row_feed_photo_profile_imageview);
                C14360o3.A07(requireViewById2);
                return requireViewById2;
            case 38:
                Object value3 = ((C905541q) this.A01).A02.getValue();
                C14360o3.A07(value3);
                view2 = (View) value3;
                i3 = R.id.row_feed_photo_profile_name;
                View requireViewById3 = view2.requireViewById(i3);
                C14360o3.A07(requireViewById3);
                return requireViewById3;
            case 39:
                Object value4 = ((C905541q) this.A01).A02.getValue();
                C14360o3.A07(value4);
                view2 = (View) value4;
                i3 = R.id.secondary_label;
                View requireViewById32 = view2.requireViewById(i3);
                C14360o3.A07(requireViewById32);
                return requireViewById32;
            case 40:
                Object value5 = ((C905541q) this.A01).A02.getValue();
                C14360o3.A07(value5);
                View requireViewById4 = ((View) value5).requireViewById(R.id.sub_media_header_container);
                C14360o3.A07(requireViewById4);
                return requireViewById4;
            case Seq.NULL_REFNUM /* 41 */:
                Object value6 = ((C905541q) this.A01).A02.getValue();
                C14360o3.A07(value6);
                view2 = (View) value6;
                i3 = R.id.timestamp_label;
                View requireViewById322 = view2.requireViewById(i3);
                C14360o3.A07(requireViewById322);
                return requireViewById322;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C41R c41r = (C41R) this.A01;
                UserSession userSession3 = c41r.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession3, 36330668795511767L)) {
                    float A01 = (float) C18U.A01(c06090Tz, userSession3, 36612143772473703L);
                    Context context = c41r.A00;
                    float A002 = AbstractC13690mv.A00(context, A01);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(A002);
                    gradientDrawable.setStroke(AbstractC13690mv.A01(context, 1), C3WR.A01(context, R.attr.igds_photo_border));
                    return gradientDrawable;
                }
                return null;
            case 43:
                return new C80113i0(((C105214ob) this.A01).A00);
            case 44:
                return new C86473tK(((C105214ob) this.A01).A00);
            case 45:
                return new AnonymousClass422(((C105214ob) this.A01).A00);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new AnonymousClass424(((C105214ob) this.A01).A00);
            case 47:
                return new C906241x(((C105214ob) this.A01).A00);
            case 48:
                return this.A01;
            default:
                return ((C89623z3) this.A01).A01;
        }
    }
}
