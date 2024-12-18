package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DottedAlignmentView;
import com.facebook.smartcapture.components.RectDetectionVisualizerView;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.ui.PhotoRequirementsView;
import com.facebook.smartcapture.ui.TextTipView;
import java.util.Map;

/* loaded from: classes8.dex */
public final class K5D extends K5I {
    public ObjectAnimator A00;
    public View A01;
    public Button A02;
    public ImageButton A03;
    public ImageView A04;
    public LinearLayout A05;
    public ProgressBar A06;
    public ProgressBar A07;
    public ProgressBar A08;
    public TextView A09;
    public ContourView A0A;
    public RectDetectionVisualizerView A0B;
    public PhotoRequirementsView A0C;
    public TextTipView A0D;
    public final View.OnClickListener A0F = LQ0.A01(this, 3);
    public final Animator.AnimatorListener A0E = new LLs(this, 1);

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A04 = AbstractC47961LGz.A01(view, R.id.iv_back_button);
        this.A0A = (ContourView) AbstractC47961LGz.A00(view, R.id.contour_view);
        this.A0D = (TextTipView) AbstractC47961LGz.A00(view, R.id.text_tip_view);
        this.A0B = (RectDetectionVisualizerView) AbstractC47961LGz.A00(view, R.id.rect_detection_visualizer_view);
        this.A03 = (ImageButton) AbstractC47961LGz.A00(view, R.id.btn_shutter);
        this.A06 = (ProgressBar) AbstractC47961LGz.A00(view, R.id.pb_downloading);
        this.A07 = (ProgressBar) AbstractC47961LGz.A00(view, R.id.pb_shutter_loading);
        this.A08 = (ProgressBar) AbstractC47961LGz.A00(view, R.id.pb_shutter_motion_sensor_guidance);
        this.A01 = AbstractC47961LGz.A00(view, R.id.help_button);
        this.A05 = (LinearLayout) AbstractC47961LGz.A00(view, R.id.ll_download_failed_container);
        this.A02 = (Button) AbstractC47961LGz.A00(view, R.id.btn_download_retry);
        this.A09 = AbstractC47961LGz.A02(view, R.id.tv_credit_card_results);
        PhotoRequirementsView photoRequirementsView = (PhotoRequirementsView) AbstractC47961LGz.A00(view, R.id.photo_requirements_view);
        this.A0C = photoRequirementsView;
        MRQ mrq = ((AbstractC44444JlB) this).A00;
        if (mrq != null && photoRequirementsView != null) {
            boolean z = super.A04;
            Context context = photoRequirementsView.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            View inflate = from.inflate(R.layout.photo_requirements_view, (ViewGroup) photoRequirementsView, false);
            photoRequirementsView.A00 = inflate;
            C14360o3.A0A(inflate);
            ViewGroup viewGroup = (ViewGroup) AbstractC47961LGz.A00(inflate, R.id.photo_requirements_item_container);
            C008102v c008102v = new C008102v(context, new C44406Jjj(photoRequirementsView, 2));
            View view2 = photoRequirementsView.A00;
            if (view2 != null) {
                ViewOnTouchListenerC48084LQj.A01(view2, 1, c008102v);
            }
            Integer valueOf = Integer.valueOf(R.string.res_0x7f130094_name_removed);
            int i = R.string.res_0x7f13008f_name_removed;
            if (z) {
                i = R.string.res_0x7f130090_name_removed;
            }
            Integer valueOf2 = Integer.valueOf(i);
            C14360o3.A07(context);
            C51u c51u = new C51u(valueOf, valueOf2, mrq.Bcu(context));
            C51u c51u2 = new C51u(Integer.valueOf(R.string.res_0x7f130095_name_removed), Integer.valueOf(R.string.res_0x7f130091_name_removed), mrq.Bct(context));
            int i2 = R.string.res_0x7f130096_name_removed;
            if (z) {
                i2 = R.string.res_0x7f130097_name_removed;
            }
            Integer valueOf3 = Integer.valueOf(i2);
            int i3 = R.string.res_0x7f130092_name_removed;
            if (z) {
                i3 = R.string.res_0x7f130093_name_removed;
            }
            for (C51u c51u3 : AbstractC16960so.A1Q(c51u, c51u2, new C51u(valueOf3, Integer.valueOf(i3), mrq.Bcv(context)))) {
                int A0H = AbstractC166987dD.A0H(c51u3.A00);
                int A0H2 = AbstractC166987dD.A0H(c51u3.A01);
                Drawable drawable = (Drawable) c51u3.A02;
                View A07 = AbstractC31175DnJ.A07(from, viewGroup, R.layout.photo_requirements_item, false);
                C14360o3.A0B(A07, 3);
                ImageView A01 = AbstractC47961LGz.A01(A07, R.id.iv_photo_requirements_item_icon);
                TextView A02 = AbstractC47961LGz.A02(A07, R.id.tv_photo_requirements_item_title);
                TextView A022 = AbstractC47961LGz.A02(A07, R.id.tv_photo_requirements_item_subtext);
                if (drawable != null) {
                    A01.setImageDrawable(drawable);
                } else {
                    A01.setVisibility(8);
                }
                A02.setText(A0H);
                A022.setText(A0H2);
                viewGroup.addView(A07);
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC47961LGz.A00(view, R.id.cl_bottom_actions_container);
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(constraintLayout);
        if (AbstractC166997dE.A0N(this).getDisplayMetrics().density < 2.0f) {
            C110964z8.A02(c110964z8, R.id.help_button).A03.A0u = AbstractC31171DnF.A02(AbstractC166997dE.A0N(this), R.dimen.ad_not_delivering_thumbnail_height);
        }
        c110964z8.A0G(constraintLayout);
        ImageView imageView = this.A04;
        C14360o3.A0A(imageView);
        LQ0.A02(imageView, 4, this);
        View view3 = this.A01;
        if (view3 == null) {
            C14360o3.A0F("helpButton");
            throw C00O.createAndThrow();
        }
        C0fQ.A00(this.A0F, view3);
        ImageButton imageButton = this.A03;
        C14360o3.A0A(imageButton);
        LQ0.A02(imageButton, 5, this);
        Button button = this.A02;
        C14360o3.A0A(button);
        C0fQ.A00(new ViewOnClickListenerC63508Sob(this, 23), button);
        ProgressBar progressBar = this.A08;
        C14360o3.A0A(progressBar);
        progressBar.setProgress(0);
        ProgressBar progressBar2 = this.A08;
        C14360o3.A0A(progressBar2);
        progressBar2.setMax(100);
        ProgressBar progressBar3 = this.A08;
        C14360o3.A0C(progressBar3, "null cannot be cast to non-null type android.widget.ProgressBar");
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar3, ReactProgressBarViewManager.PROP_PROGRESS, 0, 100);
        this.A00 = ofInt;
        C14360o3.A0A(ofInt);
        ofInt.setStartDelay(500L);
        ObjectAnimator objectAnimator = this.A00;
        C14360o3.A0A(objectAnimator);
        objectAnimator.setDuration(2000L);
        RectDetectionVisualizerView rectDetectionVisualizerView = this.A0B;
        C14360o3.A0A(rectDetectionVisualizerView);
        rectDetectionVisualizerView.setVisibility(8);
        TextTipView textTipView = this.A0D;
        C14360o3.A0A(textTipView);
        textTipView.setVisibility(8);
        if (super.A04) {
            ImageButton imageButton2 = this.A03;
            C14360o3.A0A(imageButton2);
            imageButton2.setVisibility(8);
            ProgressBar progressBar4 = this.A07;
            C14360o3.A0A(progressBar4);
            progressBar4.setVisibility(8);
            ProgressBar progressBar5 = this.A08;
            C14360o3.A0A(progressBar5);
            progressBar5.setVisibility(8);
        }
        TextTipView textTipView2 = this.A0D;
        if (textTipView2 != null) {
            MRQ mrq2 = ((AbstractC44444JlB) this).A00;
            C14360o3.A0A(mrq2);
            IdCaptureLogger idCaptureLogger = super.A01;
            C14360o3.A0B(mrq2, 0);
            textTipView2.A00 = idCaptureLogger;
            ImageView imageView2 = textTipView2.A01;
            Context A0L = AbstractC166997dE.A0L(textTipView2);
            imageView2.setImageDrawable(mrq2.Bct(A0L));
            C14360o3.A0A(A0L);
            AbstractC47994LKy.A01(A0L, R.attr.sc_accent);
            Map map = textTipView2.A05;
            A00(CaptureState.MANUAL_CAPTURE, map);
            A00(CaptureState.ID_TYPE_DETECTION, map);
            AbstractC47994LKy.A01(A0L, R.attr.sc_warning);
            A00(CaptureState.ID_FOUND, map);
            AbstractC47994LKy.A01(A0L, R.attr.sc_positive);
            A00(CaptureState.HOLDING_STEADY, map);
            CaptureState captureState = CaptureState.CAPTURING_AUTOMATIC;
            A00(captureState, map);
            map.put(Integer.valueOf(CaptureState.CAPTURING_MANUAL.ordinal()), AbstractC166997dE.A0m(map, captureState.ordinal()));
        }
        Context requireContext = requireContext();
        ProgressBar progressBar6 = this.A06;
        C14360o3.A0A(progressBar6);
        AbstractC47994LKy.A03(requireContext, progressBar6, R.attr.sc_always_white);
        Context requireContext2 = requireContext();
        ProgressBar progressBar7 = this.A07;
        C14360o3.A0A(progressBar7);
        AbstractC47994LKy.A03(requireContext2, progressBar7, R.attr.sc_accent);
    }

    public static void A00(Enum r1, Map map) {
        map.put(Integer.valueOf(r1.ordinal()), new Object());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(753185334);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.default_capture_overlay_fragment, false);
        FrameLayout frameLayout = new FrameLayout(requireContext(), null);
        frameLayout.setId(R.id.photo_requirements_view);
        C56302iJ c56302iJ = new C56302iJ(-1, -1);
        C14360o3.A0C(A0R, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ((ViewGroup) A0R).addView(frameLayout, c56302iJ);
        C0f9.A09(36369608, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1078982505);
        super.onPause();
        ContourView contourView = this.A0A;
        C14360o3.A0A(contourView);
        DottedAlignmentView dottedAlignmentView = contourView.A0C;
        dottedAlignmentView.post(new RunnableC49815LzM(dottedAlignmentView));
        C0f9.A09(-282832122, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2052897385);
        super.onResume();
        RectDetectionVisualizerView rectDetectionVisualizerView = this.A0B;
        C14360o3.A0A(rectDetectionVisualizerView);
        rectDetectionVisualizerView.postInvalidate();
        C0f9.A09(-2008896361, A02);
    }
}
