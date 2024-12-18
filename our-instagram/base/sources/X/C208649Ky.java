package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9Ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208649Ky {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final ViewStub A02;
    public final ImageButton A03;
    public final TextView A04;
    public final BOM A05;
    public final TargetViewSizeProvider A06;

    public C208649Ky(ViewGroup viewGroup, TargetViewSizeProvider targetViewSizeProvider) {
        this.A00 = viewGroup;
        this.A06 = targetViewSizeProvider;
        this.A04 = AbstractC167007dF.A0N(viewGroup, R.id.clips_capture_recording_duration_timer);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC166997dE.A0R(viewGroup, R.id.clips_review_container);
        this.A01 = viewGroup2;
        this.A02 = AbstractC167007dF.A0M(viewGroup, R.id.clips_nux_stub);
        this.A03 = (ImageButton) AbstractC166997dE.A0R(viewGroup, R.id.discard_clips_button);
        Context context = viewGroup.getContext();
        int A01 = AbstractC166997dE.A01(context);
        Resources resources = context.getResources();
        View A0R = AbstractC166997dE.A0R(viewGroup2, R.id.video_review_trim_mode);
        View A0R2 = AbstractC166997dE.A0R(viewGroup2, R.id.clips_review_progress_bar);
        View A0S = AbstractC166997dE.A0S(viewGroup2, R.id.clips_edit_thumbnail_tray);
        View A0S2 = AbstractC166997dE.A0S(viewGroup2, R.id.clips_count);
        View A0S3 = AbstractC166997dE.A0S(viewGroup, R.id.discard_clips_button);
        View A0S4 = AbstractC166997dE.A0S(A0R, R.id.clips_review_filmstrip_view);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        AbstractC167007dF.A1E(A0R2, 2, A0S);
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        if (nineSixteenLayoutConfigImpl.A0N) {
            int i = nineSixteenLayoutConfigImpl.A07;
            AbstractC13880nE.A0f(A0R, i);
            int i2 = nineSixteenLayoutConfigImpl.A0I;
            AbstractC13880nE.A0U(A0R, i2);
            AbstractC13880nE.A0f(A0R2, i);
            AbstractC13880nE.A0U(A0S, i2);
            AbstractC13880nE.A0f(A0S2, i);
            AbstractC13880nE.A0f(A0S3, i);
        } else if (targetViewSizeProvider.CV5()) {
            AbstractC13880nE.A0U(A0S4, Math.max(0, (nineSixteenLayoutConfigImpl.A0A - dimensionPixelSize) / 2));
        }
        C14360o3.A0A(context);
        this.A05 = new BOM(context, null, resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding), resources.getDimensionPixelSize(R.dimen.clips_control_music_button_radius), resources.getDimensionPixelSize(R.dimen.clips_control_music_button_stroke_width), A01, AbstractC166997dE.A06(resources), 0, false);
    }
}
