package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.9Kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208659Kz {
    public final ViewGroup A00;
    public final InterfaceC56392iX A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final LoadingSpinnerView A04;

    public C208659Kz(ViewGroup viewGroup) {
        this.A00 = (ViewGroup) AbstractC166997dE.A0R(viewGroup, R.id.loading_track_spinner_container);
        this.A03 = AbstractC166997dE.A0X(viewGroup, R.id.spinner_for_processing_video_stub);
        this.A04 = (LoadingSpinnerView) AbstractC166997dE.A0R(viewGroup, R.id.loading_track_spinner);
        this.A02 = AbstractC166997dE.A0X(viewGroup, R.id.preview_filter_processing_audio_overlay_stub);
        this.A01 = AbstractC166997dE.A0X(viewGroup, R.id.full_filter_processing_audio_overlay_stub);
    }
}
