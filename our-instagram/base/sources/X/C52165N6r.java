package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.N6r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52165N6r extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou, InterfaceC58119Ppi {
    public static final String __redex_internal_original_name = "IGTVUploadEditFeedPreviewCropFragment";
    public float A00;
    public int A01;
    public RectF A02;
    public ImageView A03;
    public SeekBar A04;
    public TextView A05;
    public IgTextView A06;
    public PunchedOverlayView A07;
    public VideoPreviewView A08;
    public GridLinesView A09;
    public boolean A0A;
    public LinearLayout A0B;
    public C56062Ouf A0C;
    public final InterfaceC09390do A0E = C57538PgC.A00(this, C57538PgC.A01(this, 36), new C57251PbZ(29, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 37);
    public final AbstractC48552Ldp A0F = new NG2(this, 0);
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(getString(2131964188));
        AbstractC31176DnK.A1B(ViewOnClickListenerC55455Ok9.A00(this, 25), OPJ.A00(this, interfaceC56362iU), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_edit_feed_crop_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        GridLinesView gridLinesView = (GridLinesView) view.findViewById(R.id.grid_overlay);
        gridLinesView.A02 = false;
        this.A09 = gridLinesView;
        PunchedOverlayView punchedOverlayView = (PunchedOverlayView) view.findViewById(R.id.punched_overlay_view);
        punchedOverlayView.A01 = AbstractC167007dF.A09(requireContext, R.attr.backgroundColorSecondary);
        ViewOnLayoutChangeListenerC55476OkV.A00(punchedOverlayView, 5, this);
        this.A07 = punchedOverlayView;
        VideoPreviewView videoPreviewView = (VideoPreviewView) view.findViewById(R.id.video_preview);
        videoPreviewView.setVideoPath(NNE.A01(this.A0E).A1N.A0F, this.A0F);
        ViewOnTouchListenerC50553MTk.A00(videoPreviewView, 8, this);
        this.A08 = videoPreviewView;
        int A07 = AbstractC13880nE.A07(requireContext) - (AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.account_group_management_clickable_width) * 2);
        int A02 = MSW.A02(A07, 0.5625f);
        VideoPreviewView videoPreviewView2 = this.A08;
        if (videoPreviewView2 == null) {
            C14360o3.A0F("videoPreviewView");
            throw C00O.createAndThrow();
        }
        ViewGroup.LayoutParams layoutParams = videoPreviewView2.getLayoutParams();
        layoutParams.width = A07;
        layoutParams.height = A02;
        videoPreviewView2.setLayoutParams(layoutParams);
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.edit_feed_preview_crop_helper_text);
        int i = this.A01;
        if (i != 60000) {
            AbstractC31177DnL.A10(A0Y, this, Integer.valueOf(i / 1000), 2131964268);
        }
        float A0A = AbstractC13880nE.A0A(requireContext);
        Resources resources = A0Y.getResources();
        AbstractC13880nE.A0W(A0Y, C1H4.A01(((AbstractC13880nE.A09(requireContext) / 2.0f) - (((A0A - (AbstractC13880nE.A00(requireContext, resources.getDimension(R.dimen.account_group_management_clickable_width)) * 2.0f)) / 0.8f) / 2.0f)) - AbstractC13880nE.A00(requireContext, resources.getDimension(R.dimen.account_group_management_clickable_width))));
        this.A06 = A0Y;
        int A0C = AbstractC166987dD.A0C(requireContext, 11);
        C210339Rw c210339Rw = new C210339Rw(A0C, A0C, AbstractC31173DnH.A03(getContext(), requireContext, R.attr.glyphColorPrimary), AbstractC166987dD.A0C(requireContext, 1));
        c210339Rw.setAlpha(255);
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.scrubber);
        seekBar.setThumb(c210339Rw);
        seekBar.setMax(this.A01);
        seekBar.setProgressDrawable(seekBar.getResources().getDrawable(AbstractC53242c7.A0H(requireContext, R.attr.videoScrubberProgressBarDrawable)));
        seekBar.setOnSeekBarChangeListener(new C55531OlP(this, 2));
        this.A04 = seekBar;
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.pause_button);
        AbstractC31173DnH.A11(requireContext, A08, AbstractC53242c7.A08(requireContext));
        ViewOnClickListenerC55455Ok9.A01(A08, 26, this);
        this.A03 = A08;
        TextView A0e = AbstractC166987dD.A0e(view, R.id.timer);
        AbstractC166987dD.A1O(requireContext, A0e, AbstractC53242c7.A08(requireContext));
        this.A05 = A0e;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_controls_container);
        linearLayout.setBackgroundColor(AbstractC53242c7.A00(linearLayout.getContext()));
        this.A0B = linearLayout;
    }

    public static final void A00(C52165N6r c52165N6r) {
        String str;
        VideoPreviewView videoPreviewView = c52165N6r.A08;
        if (videoPreviewView == null) {
            str = "videoPreviewView";
        } else {
            videoPreviewView.A06();
            ImageView imageView = c52165N6r.A03;
            if (imageView == null) {
                str = "scrubberButton";
            } else {
                imageView.setImageResource(R.drawable.pause);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58119Ppi
    public final boolean BCs() {
        return this.A0A;
    }

    @Override // X.InterfaceC58119Ppi
    public final void Cyw() {
        OPI.A01(this, this.A0E);
    }

    @Override // X.InterfaceC58119Ppi
    public final void DAV() {
        MSW.A0b(this.A0E).A04(this, NN6.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C56062Ouf c56062Ouf = this.A0C;
        if (c56062Ouf == null) {
            C14360o3.A0F("backHandlerDelegate");
            throw C00O.createAndThrow();
        }
        return c56062Ouf.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1960208330);
        super.onCreate(bundle);
        this.A0C = new C56062Ouf(requireContext(), this);
        this.A0D.getValue();
        this.A01 = 60000;
        C0f9.A09(-27574740, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1152446759);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.upload_edit_feed_preview_crop_fragment, false);
        C0f9.A09(-897375254, A02);
        return A0R;
    }
}
