package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Jhs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44301Jhs implements InterfaceC58181Pql {
    public final /* synthetic */ GestureDetectorOnGestureListenerC43829JZs A00;

    @Override // X.InterfaceC58181Pql
    public final void DFu(String str) {
        C14360o3.A0B(str, 0);
        MX1.A01(this.A00.A0z).A09(str);
    }

    @Override // X.InterfaceC58181Pql
    public final void Dbw(int i, int i2) {
    }

    @Override // X.InterfaceC58181Pql
    public final void DoM(MXU mxu) {
        ViewPropertyAnimator animate;
        float f;
        ViewPropertyAnimator duration;
        View view;
        C14360o3.A0B(mxu, 0);
        MXU mxu2 = MXU.PAUSED;
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A00;
        if (mxu == mxu2) {
            if (gestureDetectorOnGestureListenerC43829JZs.A0K == C05F.A0C && (view = gestureDetectorOnGestureListenerC43829JZs.A08) != null) {
                view.setVisibility(0);
                animate = view.animate();
                if (animate != null) {
                    f = 1.0f;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            View view2 = gestureDetectorOnGestureListenerC43829JZs.A08;
            if (view2 == null) {
                return;
            }
            view2.setVisibility(4);
            animate = view2.animate();
            if (animate == null) {
                return;
            } else {
                f = 0.0f;
            }
        }
        ViewPropertyAnimator alpha = animate.alpha(f);
        if (alpha != null && (duration = alpha.setDuration(300L)) != null) {
            duration.start();
        }
    }

    public C44301Jhs(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        this.A00 = gestureDetectorOnGestureListenerC43829JZs;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    @Override // X.InterfaceC58181Pql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DPY(com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r6, int r7, int r8) {
        /*
            r5 = this;
            X.JZs r3 = r5.A00
            r4 = 1
            r2 = 0
            boolean r0 = X.AbstractC167007dF.A1P(r7, r8)
            r3.A0T = r0
            com.instagram.creation.capture.gallery.ui.CropTypeToggleButton r1 = r3.A13
            boolean r0 = X.GestureDetectorOnGestureListenerC43829JZs.A0P(r3)
            int r0 = X.AbstractC167007dF.A05(r0)
            r1.setVisibility(r0)
            boolean r0 = r3.A0T
            if (r0 != 0) goto La3
            X.Jaa r0 = r3.A12
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto La3
            int r0 = r3.getSelectedMediaCount()
            if (r0 > r4) goto L87
            boolean r0 = X.GestureDetectorOnGestureListenerC43829JZs.A0T(r3)
            if (r0 == 0) goto L94
            float r1 = (float) r7
            float r0 = (float) r8
            float r1 = r1 / r0
            X.5L6 r0 = X.AbstractC53886NsI.A00(r1)
        L36:
            X.GestureDetectorOnGestureListenerC43829JZs.A0D(r0, r3, r4)
        L39:
            java.lang.Integer r0 = X.C05F.A01
            r3.A0a(r0, r2)
            X.841 r2 = r3.A19
            X.3Ch r1 = r2.AGq()
            X.3Ch r0 = X.EnumC69983Ch.A05
            if (r1 == r0) goto L50
            X.3Ch r1 = r2.AGq()
            X.3Ch r0 = X.EnumC69983Ch.A03
            if (r1 != r0) goto L7c
        L50:
            android.view.ViewGroup r1 = r3.A0n
            r0 = 2131438923(0x7f0b2d4b, float:1.8499787E38)
            android.view.ViewStub r0 = X.AbstractC31171DnF.A07(r1, r0)
            if (r0 != 0) goto L7d
            r0 = 2131438924(0x7f0b2d4c, float:1.8499789E38)
            android.view.View r2 = X.AbstractC166997dE.A0R(r1, r0)
        L62:
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r2 = (com.instagram.common.ui.widget.imageview.PunchedOverlayView) r2
            android.content.Context r1 = r3.getContext()
            r0 = 2130969194(0x7f04026a, float:1.7547063E38)
            int r1 = X.AbstractC167007dF.A09(r1, r0)
            r0 = -872415232(0xffffffffcc000000, float:-3.3554432E7)
            r1 = r1 | r0
            r2.A01 = r1
            X.M06 r0 = new X.M06
            r0.<init>(r2)
            r2.post(r0)
        L7c:
            return
        L7d:
            android.view.View r2 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.PunchedOverlayView"
            X.C14360o3.A0C(r2, r0)
            goto L62
        L87:
            X.JZt r0 = r3.A14
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L97
            if (r8 > r7) goto L94
            X.5L6 r0 = X.C5L6.A0E
            goto L36
        L94:
            X.5L6 r0 = X.C5L6.A08
            goto L36
        L97:
            X.841 r0 = r3.A19
            X.MX5 r0 = (X.MX5) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            X.5L6 r0 = r0.A06
            r0.getClass()
            goto La5
        La3:
            X.5L6 r0 = X.C5L6.A0E
        La5:
            X.GestureDetectorOnGestureListenerC43829JZs.A0D(r0, r3, r2)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44301Jhs.DPY(com.instagram.common.ui.widget.videopreviewview.VideoPreviewView, int, int):void");
    }

    @Override // X.InterfaceC58181Pql
    public final void DYw(VideoPreviewView videoPreviewView) {
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A00;
        gestureDetectorOnGestureListenerC43829JZs.A0a(C05F.A0C, true);
        AbstractC44261Jh7.A00(true, MediaStreamTrack.VIDEO_TRACK_KIND);
        MYZ A01 = MX1.A01(gestureDetectorOnGestureListenerC43829JZs.A0z);
        A01.A04 = A01.A0B.A02(288429634, A01.A04);
    }

    @Override // X.InterfaceC58181Pql
    public final void DYx(VideoPreviewView videoPreviewView) {
        this.A00.A0a(C05F.A0C, true);
        AbstractC44261Jh7.A00(false, MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    @Override // X.InterfaceC58181Pql
    public final void Dac(VideoPreviewView videoPreviewView, float f) {
        float A00;
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A00;
        IgCaptureVideoPreviewView igCaptureVideoPreviewView = gestureDetectorOnGestureListenerC43829JZs.A0J;
        if (igCaptureVideoPreviewView != null && igCaptureVideoPreviewView.A08()) {
            C43870Jaa c43870Jaa = gestureDetectorOnGestureListenerC43829JZs.A12;
            if (c43870Jaa.A03 == C05F.A0C) {
                A00 = f;
            } else {
                A00 = c43870Jaa.A00();
            }
            gestureDetectorOnGestureListenerC43829JZs.A04 = A00;
            if (f >= 0.5525f && f <= 1.92f) {
                return;
            }
            AbstractC12120kG.A0A("GalleryPickerView", AnonymousClass001.A0N("Invalid aspect ratio: ", f), null);
        }
    }
}
