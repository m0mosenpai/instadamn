package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.N6j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52157N6j extends AbstractC59962oe implements InterfaceC58117Ppg, InterfaceC85403rV, InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitHeaderFragment";
    public TextWatcher A00;
    public View A01;
    public View A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public CircularImageView A06;
    public InterfaceC56392iX A07;
    public IgCaptureVideoPreviewView A08;
    public FixedAspectRatioVideoLayout A09;
    public IgImageButton A0A;
    public IgdsMediaButton A0B;
    public SlideInAndOutIconView A0C;
    public final InterfaceC09390do A0G = C57546PgK.A01(this, 26);
    public final InterfaceC09390do A0E = AbstractC25225BEi.A0a(new C57546PgK(this, 27), new C57546PgK(this, 28), C57535Pg9.A00(null, this, 32), AbstractC25225BEi.A1D(C51053Mh7.class));
    public final InterfaceC09390do A0F = C57546PgK.A01(this, 29);
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC58117Ppg
    public final void ABQ(C30R c30r, int i) {
        C14360o3.A0B(c30r, 1);
        Resources A09 = AbstractC31177DnL.A09(this);
        SlideInAndOutIconView slideInAndOutIconView = this.A0C;
        if (slideInAndOutIconView == null) {
            C14360o3.A0F("audioIcon");
            throw C00O.createAndThrow();
        }
        int lineHeight = slideInAndOutIconView.A0C.getLineHeight() + (A09.getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
        int lineHeight2 = (slideInAndOutIconView.A0C.getLineHeight() - A09.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        slideInAndOutIconView.A03(requireContext().getDrawable(i), lineHeight, lineHeight);
        slideInAndOutIconView.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
        slideInAndOutIconView.setIconColor(AbstractC166997dE.A01(requireContext()));
        slideInAndOutIconView.setIconScale(0.5f);
        slideInAndOutIconView.A03 = C3WD.END;
        slideInAndOutIconView.A02 = C30Q.SLIDE_OUT;
        C4ZF c4zf = new C4ZF();
        c4zf.A07.add(AbstractC25225BEi.A16(slideInAndOutIconView));
        c4zf.A02(c30r);
    }

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        C14360o3.A0B(str, 1);
        AbstractC55033OXz.A01(this, C05F.A0d);
        UserSession A0r = AbstractC166987dD.A0r(this.A0D);
        C14360o3.A0B(A0r, 1);
        C31368DqX.A02(AbstractC31175DnJ.A0C(this, A0r), A0r, AbstractC31364DqT.A02(), AbstractC31402Dr6.A02(A0r, str, "media_kit", getModuleName()));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.mk_header_content);
        this.A02 = view.requireViewById(R.id.mk_header_shimmer);
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = (FixedAspectRatioVideoLayout) view.requireViewById(R.id.mk_header_media_frame);
        fixedAspectRatioVideoLayout.A00 = 0.75f;
        this.A09 = fixedAspectRatioVideoLayout;
        IgImageButton igImageButton = (IgImageButton) view.requireViewById(R.id.mk_header_media_preview);
        igImageButton.setEnableTouchOverlay(false);
        ((IgImageView) igImageButton).A0A = new C80673iw();
        ((ConstrainedImageView) igImageButton).A00 = 0.75f;
        this.A0A = igImageButton;
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.mk_edit_header_cover_button);
        ViewOnClickListenerC55456OkA.A00(igdsMediaButton, 6, this);
        this.A0B = igdsMediaButton;
        this.A06 = AbstractC31173DnH.A0T(view, R.id.mk_owner_profile_image);
        this.A04 = AbstractC166997dE.A0T(view, R.id.mk_owner_profile_name);
        EditText editText = (EditText) view.requireViewById(R.id.mk_header_title_edit_text);
        AbstractC50523MSb.A0n(editText, AbstractC25225BEi.A07(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0D, 0), 36597742747257820L));
        editText.setOnFocusChangeListener(new LQ3(new C57546PgK(this, 25), 6));
        this.A03 = editText;
        this.A05 = AbstractC166997dE.A0T(view, R.id.mk_header_title_text_view);
        InterfaceC56392iX A0U = AbstractC31173DnH.A0U(view, R.id.mk_header_audio_icon_view_stub);
        this.A07 = A0U;
        if (A0U == null) {
            C14360o3.A0F("audioStubHolder");
            throw C00O.createAndThrow();
        }
        this.A0C = (SlideInAndOutIconView) A0U.getView().requireViewById(R.id.indicator);
        IgCaptureVideoPreviewView igCaptureVideoPreviewView = (IgCaptureVideoPreviewView) view.requireViewById(R.id.mk_local_video_preview);
        C0fQ.A00(new ViewOnClickListenerC48073LPy(igCaptureVideoPreviewView, 8), igCaptureVideoPreviewView);
        igCaptureVideoPreviewView.A00 = 0.75f;
        igCaptureVideoPreviewView.setAspectRatio(0.75f);
        this.A08 = igCaptureVideoPreviewView;
        Object value = this.A0E.getValue();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, value, c07s, this, null, 2), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(C52157N6j c52157N6j) {
        IgdsMediaButton igdsMediaButton = c52157N6j.A0B;
        if (igdsMediaButton == null) {
            C14360o3.A0F("editButton");
            throw C00O.createAndThrow();
        }
        InterfaceC09390do interfaceC09390do = c52157N6j.A0E;
        EnumC53120NeX enumC53120NeX = (EnumC53120NeX) MSW.A0l(interfaceC09390do).A0H.getValue();
        C14360o3.A0B(enumC53120NeX, 0);
        boolean A1X = AbstractC167007dF.A1X(enumC53120NeX, EnumC53120NeX.A02);
        int i = 0;
        if (!A1X || !MSW.A0l(interfaceC09390do).A05.A01) {
            i = 8;
        }
        igdsMediaButton.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r1 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C52157N6j r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52157N6j.A01(X.N6j):void");
    }

    public static final void A02(C52157N6j c52157N6j, InterfaceC57837Pl3 interfaceC57837Pl3) {
        String str;
        View view = c52157N6j.A01;
        if (view == null) {
            str = "content";
        } else {
            int i = 0;
            view.setVisibility(AbstractC167007dF.A05(interfaceC57837Pl3 instanceof P5I ? 1 : 0));
            View view2 = c52157N6j.A02;
            if (view2 == null) {
                str = "shimmer";
            } else {
                if (!(interfaceC57837Pl3 instanceof P5H)) {
                    i = 8;
                }
                view2.setVisibility(i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A03() {
        String str;
        IgImageButton igImageButton = this.A0A;
        if (igImageButton == null) {
            str = "imagePreview";
        } else {
            FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = this.A09;
            if (fixedAspectRatioVideoLayout == null) {
                str = "videoLayout";
            } else {
                int childCount = fixedAspectRatioVideoLayout.getChildCount();
                int i = 0;
                if (childCount != 2) {
                    i = 8;
                }
                igImageButton.setVisibility(i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58117Ppg
    public final IgImageButton BGn() {
        IgImageButton igImageButton = this.A0A;
        if (igImageButton == null) {
            C14360o3.A0F("imagePreview");
            throw C00O.createAndThrow();
        }
        return igImageButton;
    }

    @Override // X.InterfaceC58117Ppg
    public final FixedAspectRatioVideoLayout BMQ() {
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = this.A09;
        if (fixedAspectRatioVideoLayout == null) {
            C14360o3.A0F("videoLayout");
            throw C00O.createAndThrow();
        }
        return fixedAspectRatioVideoLayout;
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A0G.getValue();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(813471369);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_header_fragment, false);
        C0f9.A09(-722078010, A02);
        return A0R;
    }
}
