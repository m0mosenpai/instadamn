package X;

import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;

/* renamed from: X.KNf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45752KNf extends AbstractC44757Jre {
    public final int A00;
    public final View A01;
    public final InterfaceC58181Pql A02;
    public final C48553Ldq A03;
    public final IgCaptureVideoPreviewView A04;

    public C45752KNf(View view, InterfaceC58181Pql interfaceC58181Pql) {
        super(view);
        this.A02 = interfaceC58181Pql;
        this.A00 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        IgCaptureVideoPreviewView igCaptureVideoPreviewView = (IgCaptureVideoPreviewView) AbstractC166997dE.A0R(view, R.id.video_preview_item_view);
        this.A04 = igCaptureVideoPreviewView;
        this.A01 = AbstractC166997dE.A0S(view, R.id.video_preview_item_play_btn);
        igCaptureVideoPreviewView.A00 = 0.5625f;
        igCaptureVideoPreviewView.A02 = EnumC95184Qe.A03;
        ViewOnClickListenerC48063LPo.A00(this.itemView, 11, this);
        A00(true);
        this.A03 = new C48553Ldq(this);
    }

    @Override // X.AbstractC44757Jre
    public final void A00(boolean z) {
        this.A04.setVisibility(AbstractC167007dF.A05(!z ? 1 : 0));
        super.A00(z);
    }
}
