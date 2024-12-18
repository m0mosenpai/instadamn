package X;

import android.content.Context;
import android.os.Parcelable;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.user.model.User;

/* renamed from: X.8bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190368bu implements BBw, InterfaceC1810781j, C82M {
    public Integer A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C183688Ct A03;
    public final Context A04;
    public final C1810981l A05;
    public final InteractiveDrawableContainer A06;

    public C190368bu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C183688Ct c183688Ct, InteractiveDrawableContainer interactiveDrawableContainer) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(c1810981l, 4);
        C14360o3.A0B(interactiveDrawableContainer, 5);
        C14360o3.A0B(c183688Ct, 6);
        this.A04 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A05 = c1810981l;
        this.A06 = interactiveDrawableContainer;
        this.A03 = c183688Ct;
        this.A00 = C05F.A0C;
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    private final void A00(Integer num) {
        Context context = this.A04;
        ViewStub viewStub = new ViewStub(context);
        ViewStub viewStub2 = new ViewStub(context);
        ViewStub viewStub3 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        viewStub.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        viewStub2.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388693;
        viewStub3.setLayoutParams(layoutParams3);
        C57012jc c57012jc = new C57012jc(viewStub);
        C57012jc c57012jc2 = new C57012jc(viewStub2);
        C57012jc c57012jc3 = new C57012jc(viewStub3);
        Integer num2 = C05F.A00;
        if (num == num2) {
            viewStub.setLayoutResource(R.layout.alignment_guide_header_clips_action_bar);
            viewStub2.setLayoutResource(R.layout.layout_clips_viewer_media_info);
            viewStub3.setLayoutResource(R.layout.layout_clips_viewer_ufi_stack);
            c57012jc.A02 = new InterfaceC69513Al() { // from class: X.9LD
                @Override // X.InterfaceC69513Al
                public final void DLu(View view) {
                    AbstractC167007dF.A1C(view);
                    view.setVisibility(4);
                    AbstractC167007dF.A0N(view, R.id.title).setText(2131955577);
                    view.setBackground(view.getResources().getDrawable(R.drawable.clips_viewer_action_bar_gradient_background));
                }
            };
            c57012jc2.A02 = new InterfaceC69513Al() { // from class: X.9Kx
                @Override // X.InterfaceC69513Al
                public final void DLu(View view) {
                    C14360o3.A0A(view);
                    C190368bu c190368bu = C190368bu.this;
                    UserSession userSession = c190368bu.A02;
                    InterfaceC11380iw interfaceC11380iw = c190368bu.A01;
                    C14360o3.A0B(view, 0);
                    User A10 = AbstractC166987dD.A10(userSession);
                    view.setVisibility(4);
                    IgImageView A0T = AbstractC167007dF.A0T(view, R.id.profile_picture);
                    A0T.setUrl(A10.Bhu(), interfaceC11380iw);
                    A0T.setVisibility(0);
                    TextView A0N = AbstractC167007dF.A0N(view, R.id.username);
                    A0N.setText(A10.getUsername());
                    A0N.setVisibility(0);
                    AbstractC226349yr.A00(view);
                    View A0R = AbstractC166997dE.A0R(view, R.id.video_caption_container);
                    TextView A0N2 = AbstractC167007dF.A0N(view, R.id.video_caption);
                    C14360o3.A07(view.requireViewById(R.id.media_info_expanded_caption_background));
                    C14360o3.A0B(A0R, 0);
                    C14360o3.A0B(A0N2, 1);
                    A0R.setVisibility(0);
                    A0N2.setText(2131955781);
                    AbstractC166997dE.A0S(view, R.id.clips_cta).setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                }
            };
            c57012jc3.A02 = new InterfaceC69513Al() { // from class: X.9LE
                @Override // X.InterfaceC69513Al
                public final void DLu(View view) {
                    C14360o3.A0A(view);
                    C14360o3.A0B(view, 0);
                    view.setVisibility(4);
                    AbstractC226349yr.A00(view);
                    view.findViewById(R.id.music_button).setVisibility(0);
                }
            };
        } else {
            viewStub.setLayoutResource(R.layout.alignment_guide_header_profile_attribution);
            viewStub2.setLayoutResource(R.layout.alignment_guide_footer_message_composer);
            c57012jc.A02 = new InterfaceC69513Al() { // from class: X.8dJ
                @Override // X.InterfaceC69513Al
                public final void DLu(View view) {
                    C14360o3.A0A(view);
                    C08730cb c08730cb = C17060sy.A01;
                    C190368bu c190368bu = C190368bu.this;
                    User A01 = c08730cb.A01(c190368bu.A02);
                    InterfaceC11380iw interfaceC11380iw = c190368bu.A01;
                    C14360o3.A0B(view, 0);
                    View requireViewById = view.requireViewById(R.id.alignment_header_profile_picture);
                    C14360o3.A07(requireViewById);
                    ((IgImageView) requireViewById).setUrl(A01.Bhu(), interfaceC11380iw);
                    View requireViewById2 = view.requireViewById(R.id.alignment_header_title);
                    C14360o3.A07(requireViewById2);
                    ((TextView) requireViewById2).setText(A01.getUsername());
                    View requireViewById3 = view.requireViewById(R.id.reel_viewer_progress_bar);
                    C14360o3.A07(requireViewById3);
                    SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) requireViewById3;
                    segmentedProgressBar.setProgress(0.0f);
                    segmentedProgressBar.setSegments(1);
                }
            };
            c57012jc2.A02 = new InterfaceC69513Al() { // from class: X.8dK
                @Override // X.InterfaceC69513Al
                public final void DLu(View view) {
                    Spannable spannable;
                    C14360o3.A0A(view);
                    C190368bu c190368bu = C190368bu.this;
                    C183688Ct c183688Ct = c190368bu.A03;
                    if (c183688Ct.A0x.A08.A00 == C208509Kk.A00) {
                        spannable = ((C8NW) c183688Ct.A1h.get()).A11();
                    } else {
                        spannable = null;
                    }
                    boolean A06 = C18U.A06(C06090Tz.A05, c190368bu.A02, 36320180485300346L);
                    CharSequence charSequence = spannable;
                    C14360o3.A0B(view, 0);
                    TextView textView = (TextView) view.requireViewById(R.id.alignment_footer_caption_text);
                    if (!A06) {
                        textView.setVisibility(8);
                        return;
                    }
                    if (spannable == null || spannable.length() == 0) {
                        charSequence = textView.getContext().getText(2131974493);
                    }
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                }
            };
        }
        InteractiveDrawableContainer interactiveDrawableContainer = this.A06;
        if (num == num2) {
            interactiveDrawableContainer.setAlignmentGuideAlignTopMarginToHeader(false);
            interactiveDrawableContainer.setAlignmentGuideAlignBottomMarginToFooter(false);
            interactiveDrawableContainer.setAlignmentGuideUfiTower(c57012jc3);
        } else {
            interactiveDrawableContainer.setAlignmentGuideAlignTopMarginToHeader(true);
            interactiveDrawableContainer.setAlignmentGuideAlignBottomMarginToFooter(true);
        }
        interactiveDrawableContainer.setAlignmentGuideHeader(c57012jc);
        interactiveDrawableContainer.setAlignmentGuideFooter(c57012jc2);
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }

    @Override // X.BBw
    public final void D2U(boolean z) {
        Integer num;
        if (this.A05.A08.A00 instanceof C81V) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        Integer num2 = this.A00;
        if (num2 == C05F.A00 || num != num2) {
            A00(num);
        }
        this.A00 = num;
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        if (obj == EnumC1810181d.A07) {
            A00(this.A00);
        }
    }
}
