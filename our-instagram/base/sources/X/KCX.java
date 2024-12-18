package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes8.dex */
public final class KCX extends AbstractC59962oe implements InterfaceC60072op, InterfaceC189488aT, InterfaceC50436MOq, MRF {
    public static final C55942hf A0V = C55942hf.A00();
    public static final C55942hf A0W = C55942hf.A03(0.0d, 10.0d);
    public static final String __redex_internal_original_name = "OpenCarouselMediaPickerSheetFragment";
    public float A00;
    public int A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public TouchImageView A07;
    public C47809L9r A08;
    public L4M A09;
    public C54793OJl A0A;
    public IgdsBottomButtonLayout A0B;
    public C5TA A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public ViewGroup A0J;
    public Fragment A0K;
    public PunchedOverlayView A0L;
    public C7IK A0M;
    public C47765L7l A0N;
    public MediaFrameLayout A0O;
    public Integer A0P;
    public final MR9 A0T = new C49637LwU(this);
    public float A01 = 0.8f;
    public final AnonymousClass987 A0S = new AnonymousClass987();
    public final MPG A0U = new C49638LwV(this, 1);
    public final InterfaceC09390do A0R = AbstractC60492pY.A02(this);
    public final String A0Q = "open_carousel_media_picker_fragment";

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        C14360o3.A0B(c7ik, 0);
        this.A0M = c7ik;
        ViewGroup viewGroup = this.A0J;
        if (viewGroup != null) {
            Drawable background = viewGroup.getBackground();
            if (background != null) {
                int i = c7ik.A09;
                background.setColorFilter(i, PorterDuff.Mode.SRC);
                C30D.A04(requireActivity(), i);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        KCT A01 = A01(this);
        if (A01 != null) {
            A01.ADq(c7ik);
        }
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.MRF
    public final boolean DIy(View view, GalleryItem galleryItem) {
        return false;
    }

    @Override // X.MRF
    public final /* synthetic */ void DKF(boolean z) {
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, X.6C3] */
    @Override // X.MRF
    public final boolean DmO(Medium medium, String str) {
        Integer valueOf;
        float f;
        float f2;
        int i;
        L4M l4m = this.A09;
        if (l4m != null) {
            C55101ObE c55101ObE = new C55101ObE(l4m.A02, l4m.A00);
            int i2 = 1;
            if (medium.Cff()) {
                i2 = 2;
            }
            C449124v c449124v = AnonymousClass229.A01(c55101ObE.A07).A0A;
            EnumC193318hB enumC193318hB = EnumC193318hB.A08;
            int i3 = medium.A0B;
            int i4 = medium.A04;
            Long valueOf2 = Long.valueOf(medium.A01());
            String str2 = medium.A0X;
            Double A0S = AbstractC37302Gc3.A0S(medium.A03);
            EnumC223419tY enumC223419tY = EnumC223419tY.UNKNOWN;
            MediaUploadMetadata mediaUploadMetadata = medium.A0G;
            long j = medium.A0C;
            if (j <= 0) {
                j = medium.A0D;
            }
            C449124v.A05(enumC223419tY, enumC193318hB, null, mediaUploadMetadata, c449124v, false, null, A0S, Integer.valueOf(i3), Integer.valueOf(i4), valueOf2, null, str2, i2, i3, i4, j, false);
            Context context = l4m.A01;
            boolean z = l4m.A05;
            if (medium.Cff()) {
                if (medium.A03 > 61500) {
                    i = 2131969163;
                } else if (z) {
                    i = 2131969128;
                }
                IQU.A00(context, i);
            }
            Integer num = this.A0P;
            if (num != null) {
                if (num.intValue() == medium.A05) {
                    valueOf = null;
                    this.A0P = valueOf;
                    return false;
                }
            }
            InterfaceC09390do interfaceC09390do = this.A0R;
            C55101ObE c55101ObE2 = new C55101ObE(AbstractC166987dD.A0r(interfaceC09390do), requireContext());
            String str3 = this.A0E;
            UserSession userSession = c55101ObE2.A07;
            InterfaceC11380iw interfaceC11380iw = c55101ObE2.A05;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_open_carousel_tap");
            if (A0f.isSampled()) {
                A0f.A8R(EnumC39652Hih.A0o, "action_source");
                AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                AbstractC25225BEi.A1N(A0f, c55101ObE2.A08);
                A0f.A9K("media_id", C55101ObE.A00(str3));
                A0f.Cht();
            }
            this.A0H = false;
            boolean z2 = true;
            if (medium.A05()) {
                TouchImageView touchImageView = this.A07;
                if (touchImageView != null) {
                    touchImageView.setVisibility(0);
                }
                MediaFrameLayout mediaFrameLayout = this.A0O;
                if (mediaFrameLayout != null) {
                    mediaFrameLayout.setVisibility(4);
                }
                TouchImageView touchImageView2 = this.A07;
                if (touchImageView2 != null) {
                    String str4 = medium.A0X;
                    touchImageView2.setImageBitmap(C1NC.A0F(str4, medium.A0B, medium.A04, C1NC.A00(str4)));
                }
                TouchImageView touchImageView3 = this.A07;
                if (touchImageView3 != null) {
                    touchImageView3.A0G = true;
                }
            } else {
                if (medium.Cff()) {
                    TouchImageView touchImageView4 = this.A07;
                    if (touchImageView4 != null) {
                        touchImageView4.setVisibility(4);
                    }
                    MediaFrameLayout mediaFrameLayout2 = this.A0O;
                    if (mediaFrameLayout2 != null) {
                        mediaFrameLayout2.setVisibility(0);
                    }
                    Integer num2 = C05F.A1F;
                    String A0j = AbstractC167017dG.A0j();
                    String str5 = medium.A0X;
                    if (str5.length() <= 0) {
                        z2 = false;
                    }
                    C75363a3 c75363a3 = new C75363a3(null, null, null, null, null, num2, null, A0j, null, str5, null, null, null, null, null, null, null, null, null, -1, -1, -1L, false, false, false, true, false, false, z2, false);
                    if (this.A0C == null) {
                        C5TA c5ta = new C5TA(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), null, new Object(), this.A0Q);
                        this.A0C = c5ta;
                        c5ta.A05(EnumC95184Qe.A03);
                    }
                    C5TA c5ta2 = this.A0C;
                    C14360o3.A0C(c5ta2, "null cannot be cast to non-null type com.instagram.video.player.media.IgPlayerController<com.instagram.common.gallery.Medium>");
                    c5ta2.A08(this.A0O, c75363a3, new C4S7(medium, 0), medium.A0X, this.A0Q, 1.0f, -1, 0, true, true);
                }
                valueOf = Integer.valueOf(medium.A05);
                this.A0P = valueOf;
                return false;
            }
            ViewGroup viewGroup = this.A05;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                IgdsBottomButtonLayout igdsBottomButtonLayout = this.A0B;
                if (igdsBottomButtonLayout != null) {
                    C55942hf c55942hf = C150956qv.A02;
                    AbstractC125325le A0E = AbstractC43592JPx.A0o(igdsBottomButtonLayout, 0).A0E(A0V);
                    A0E.A0T(AbstractC13880nE.A06(AbstractC166997dE.A0L(igdsBottomButtonLayout)), 0.0f);
                    A0E.A04 = 0;
                    A0E.A0H();
                }
                View A00 = A00(this);
                if (A00 != null) {
                    A00.setImportantForAccessibility(4);
                }
                ViewGroup viewGroup2 = this.A05;
                if (viewGroup2 != null) {
                    C55942hf c55942hf2 = C150956qv.A02;
                    AbstractC125325le A0o = AbstractC43592JPx.A0o(viewGroup2, 0);
                    A0o.A04 = 0;
                    AbstractC125325le A0E2 = A0o.A0E(A0W);
                    View view = this.A03;
                    float f3 = 0.0f;
                    if (view != null) {
                        f = view.getY();
                    } else {
                        f = 0.0f;
                    }
                    View view2 = this.A03;
                    if (view2 != null) {
                        f2 = view2.getY();
                    } else {
                        f2 = 0.0f;
                    }
                    float A08 = f2 - AbstractC166987dD.A08(viewGroup2);
                    View view3 = this.A03;
                    if (view3 != null) {
                        f3 = AbstractC166987dD.A08(view3);
                    }
                    A0E2.A0T(f, A08 + f3);
                    A0E2.A0H();
                }
            }
            valueOf = Integer.valueOf(medium.A05);
            this.A0P = valueOf;
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        C7IK c7ik = this.A0M;
        if (c7ik != null) {
            KCT kct = (KCT) fragment;
            MR9 mr9 = this.A0T;
            C14360o3.A0B(mr9, 0);
            kct.A03 = mr9;
            C47958LGu c47958LGu = kct.A02;
            if (c47958LGu != null) {
                c47958LGu.A01 = mr9;
                c47958LGu.A09.A00 = mr9;
            }
            kct.ADq(c7ik);
            kct.A00 = this;
            MPG mpg = this.A0U;
            kct.A04 = mpg;
            C47958LGu c47958LGu2 = kct.A02;
            if (c47958LGu2 != null) {
                c47958LGu2.A02 = mpg;
            }
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0J = AbstractC31173DnH.A0F(view, R.id.direct_media_picker_root_container);
        this.A05 = AbstractC31173DnH.A0F(view, R.id.media_preview_container);
        this.A07 = (TouchImageView) view.requireViewById(R.id.image_media_preview);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view.requireViewById(R.id.video_media_preview);
        mediaFrameLayout.A00 = AbstractC166987dD.A07(mediaFrameLayout) / AbstractC166987dD.A08(mediaFrameLayout);
        this.A0O = mediaFrameLayout;
        this.A0L = (PunchedOverlayView) view.findViewById(R.id.punched_overlay_view);
        View requireViewById = view.requireViewById(R.id.drag_handle);
        this.A04 = requireViewById;
        if (this.mArguments != null && requireViewById != null) {
            requireViewById.setVisibility(0);
        }
        this.A03 = view.requireViewById(R.id.bottom_container);
        ViewGroup viewGroup = this.A0J;
        if (viewGroup != null) {
            AbstractC13880nE.A0s(viewGroup, new RunnableC49899M1s(viewGroup));
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.media_picker_preview_header);
        ViewOnClickListenerC48074LPz.A01(AbstractC166997dE.A0S(A0S, R.id.action_bar_button_back), 50, this);
        String str = this.A0F;
        if (str != null) {
            TextView A0T = AbstractC166997dE.A0T(A0S, R.id.media_picker_header_subtitle);
            A0T.setText(str);
            A0T.setVisibility(0);
        }
        MediaFrameLayout mediaFrameLayout2 = this.A0O;
        if (mediaFrameLayout2 != null) {
            mediaFrameLayout2.A00 = AbstractC166987dD.A07(mediaFrameLayout2) / AbstractC166987dD.A08(mediaFrameLayout2);
        }
        PunchedOverlayView punchedOverlayView = this.A0L;
        if (punchedOverlayView != null) {
            Context context = punchedOverlayView.getContext();
            punchedOverlayView.A01 = context.getColor(AbstractC53242c7.A02(context));
            punchedOverlayView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC55474OkT(1, this, punchedOverlayView));
        }
        TouchImageView touchImageView = this.A07;
        if (touchImageView != null) {
            touchImageView.A06 = new C48551Ldo(this.A00);
            touchImageView.A0F = false;
            ViewOnTouchListenerC48084LQj.A01(touchImageView, 20, this);
        }
        UserSession A0r = AbstractC166987dD.A0r(this.A0R);
        int i = this.A02;
        KCT A00 = AbstractC46748Km5.A00(A0r, null, null, null, this.A0F, null, this.A00, i, i, false, false, false, false, false);
        ViewOnClickListenerC48074LPz A002 = ViewOnClickListenerC48074LPz.A00(this, 49);
        String str2 = this.A0D;
        if (str2 == null) {
            str2 = AbstractC166997dE.A0N(this).getQuantityString(R.plurals.direct_media_composer_send_button_description, 1);
            C14360o3.A07(str2);
        }
        View view2 = this.A03;
        if (view2 != null && (igdsBottomButtonLayout = (IgdsBottomButtonLayout) view2.findViewById(R.id.send_bottom_button)) != null) {
            igdsBottomButtonLayout.setPrimaryActionText(str2);
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(A002);
        } else {
            igdsBottomButtonLayout = null;
        }
        this.A0B = igdsBottomButtonLayout;
        this.A06 = AbstractC31173DnH.A0F(view, R.id.overlay_container);
        AbstractC43593JPy.A1D(A00, AbstractC43593JPy.A0F(this));
        this.A0K = A00;
        C7IK c7ik = this.A0M;
        if (c7ik != null) {
            ADq(c7ik);
        }
        ViewGroup viewGroup2 = this.A0J;
        if (viewGroup2 != null) {
            this.A0N = new C47765L7l(requireContext(), viewGroup2);
        }
    }

    public static final View A00(KCX kcx) {
        Fragment fragment = kcx.A0K;
        if (fragment == null) {
            C14360o3.A0F("currentFragment");
            throw C00O.createAndThrow();
        }
        View view = fragment.mView;
        if (view == null) {
            return null;
        }
        return view.findViewById(R.id.gallery);
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.MRF
    public final EnumC188968Ym B9N() {
        L4M l4m = this.A09;
        if (l4m != null && l4m.A05) {
            return EnumC188968Ym.A04;
        }
        return EnumC188968Ym.A02;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return this.A01;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        ViewGroup viewGroup;
        InterfaceC08430c6 interfaceC08430c6 = this.A0K;
        if (interfaceC08430c6 == null) {
            C14360o3.A0F("currentFragment");
            throw C00O.createAndThrow();
        }
        if ((interfaceC08430c6 instanceof MQG) && ((MQG) interfaceC08430c6).CQn() && ((viewGroup = this.A05) == null || viewGroup.getVisibility() != 0)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return this.A01;
    }

    @Override // X.MRF
    public final void D2F() {
        L4M l4m = this.A09;
        if (l4m != null) {
            l4m.A04.A00 = true;
            Activity activity = l4m.A00;
            AbstractC167017dG.A0y(activity, C3DN.A00);
            UserSession userSession = l4m.A02;
            C6XJ A02 = C6XJ.A02(activity, AbstractC167017dG.A0T("open_carousel_submission_capture_config", l4m.A03, AbstractC166987dD.A1L(AbstractC111324zv.A00(16), C82R.A00(C128535rM.A00, new C81W[0]))), userSession, TransparentModalActivity.class, AbstractC111324zv.A00(2826));
            A02.A07();
            A02.A0C(activity);
            AnonymousClass229.A01(new C55101ObE(userSession, activity).A07).A0Y();
        }
    }

    @Override // X.MRF
    public final /* synthetic */ boolean EjX() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0Q;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0R);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        InterfaceC08430c6 interfaceC08430c6 = this.A0K;
        if (interfaceC08430c6 == null) {
            C14360o3.A0F("currentFragment");
            throw C00O.createAndThrow();
        }
        if (interfaceC08430c6 instanceof MQG) {
            return ((MQG) interfaceC08430c6).isScrolledToTop();
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC60072op interfaceC60072op;
        float f;
        KNU knu;
        if (!this.A0I) {
            C47809L9r c47809L9r = this.A08;
            if (c47809L9r != null && (knu = c47809L9r.A01) != null && knu.onBackPressed()) {
                return true;
            }
            ViewGroup viewGroup = this.A05;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                TouchImageView touchImageView = this.A07;
                if (touchImageView != null) {
                    touchImageView.A0G = false;
                    touchImageView.setImageBitmap(null);
                }
                C5TA c5ta = this.A0C;
                if (c5ta != null) {
                    c5ta.A0C("finished", false);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = this.A0B;
                if (igdsBottomButtonLayout != null) {
                    C55942hf c55942hf = C150956qv.A02;
                    AbstractC125325le A0E = AbstractC43592JPx.A0o(igdsBottomButtonLayout, 0).A0E(A0V);
                    A0E.A0K(AbstractC13880nE.A06(AbstractC166997dE.A0L(igdsBottomButtonLayout)));
                    A0E.A03 = 4;
                    A0E.A0H();
                }
                ViewGroup viewGroup2 = this.A05;
                if (viewGroup2 != null) {
                    C55942hf c55942hf2 = C150956qv.A02;
                    AbstractC125325le A0o = AbstractC43592JPx.A0o(viewGroup2, 0);
                    A0o.A03 = 8;
                    AbstractC125325le A0E2 = A0o.A0E(A0W);
                    View view = this.A03;
                    if (view != null) {
                        f = view.getY();
                    } else {
                        f = 0.0f;
                    }
                    A0E2.A0K(f);
                    C44065Jdq.A00(A0E2, this, 17);
                    return true;
                }
                throw AbstractC166997dE.A0g();
            }
            InterfaceC08430c6 interfaceC08430c6 = this.A0K;
            if (interfaceC08430c6 == null) {
                C14360o3.A0F("currentFragment");
                throw C00O.createAndThrow();
            }
            if ((interfaceC08430c6 instanceof InterfaceC60072op) && (interfaceC60072op = (InterfaceC60072op) interfaceC08430c6) != null && interfaceC60072op.onBackPressed()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        AbstractC43594JPz.A17(this.A03, i, i2);
        C47765L7l c47765L7l = this.A0N;
        if (c47765L7l == null) {
            C14360o3.A0F("roundedCornerHelper");
            throw C00O.createAndThrow();
        }
        c47765L7l.A00(i);
    }

    public static final KCT A01(KCX kcx) {
        if (!kcx.isResumed()) {
            return null;
        }
        Fragment A0O = kcx.getChildFragmentManager().A0O(R.id.fragment_container);
        if (!(A0O instanceof KCT)) {
            return null;
        }
        return (KCT) A0O;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C30D.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-880479499);
        super.onCreate(bundle);
        this.A00 = requireArguments().getFloat("BUNDLE_ASPECT_RATIO", 1.0f);
        C0f9.A09(859737205, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2115445340);
        C14360o3.A0B(layoutInflater, 0);
        this.A0S.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_open_carousel_media_picker, viewGroup, false);
        C0f9.A09(-1498612131, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Context context;
        int A02 = C0f9.A02(1692650146);
        this.A0B = null;
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        this.A07 = null;
        this.A0O = null;
        this.A0L = null;
        this.A0J = null;
        this.A06 = null;
        this.A0C = null;
        this.A0S.A01();
        if (this.A0G && (context = getContext()) != null) {
            C55101ObE c55101ObE = new C55101ObE(AbstractC166987dD.A0r(this.A0R), context);
            String str = this.A0E;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c55101ObE.A05, c55101ObE.A07), "ig_camera_ui_tool_click");
            if (A0f.isSampled()) {
                A0f.A8R(C81X.A0p, "tool_type");
                A0f.AAP("crop_action", "open_carousel_crop");
                A0f.A9K("media_id", C55101ObE.A00(str));
                A0f.Cht();
            }
        }
        super.onDestroyView();
        C0f9.A09(1044480370, A02);
    }
}
