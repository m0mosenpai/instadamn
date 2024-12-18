package X;

import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public final class KLB extends AbstractC48552Ldp {
    public final int A00;
    public final Object A01;

    public KLB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC48552Ldp, X.InterfaceC58181Pql
    public final void DFu(String str) {
        MN6 mn6;
        if (this.A00 == 0 && (mn6 = ((GalleryPreviewMultiselectPager) this.A01).A00) != null) {
            GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = ((C48603Lef) mn6).A00;
            gestureDetectorOnGestureListenerC43829JZs.A0a(C05F.A0C, true);
            AbstractC44261Jh7.A00(false, MediaStreamTrack.VIDEO_TRACK_KIND);
            MX1.A01(gestureDetectorOnGestureListenerC43829JZs.A0z).A09(AnonymousClass001.A0R("Failed to load from pager: ", str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.instagram.common.ui.widget.videopreviewview.VideoPreviewView] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.instagram.common.ui.widget.videopreviewview.VideoPreviewView] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView, com.instagram.common.ui.widget.videopreviewview.VideoPreviewView] */
    @Override // X.InterfaceC58181Pql
    public final void DPY(VideoPreviewView videoPreviewView, int i, int i2) {
        C45752KNf c45752KNf;
        if (this.A00 != 0) {
            videoPreviewView = ((C52157N6j) this.A01).A08;
            if (videoPreviewView == 0) {
                C14360o3.A0F("videoPreview");
                throw C00O.createAndThrow();
            }
            videoPreviewView.setAspectRatio(0.75f);
            if (!videoPreviewView.A08()) {
                return;
            }
        } else {
            GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = (GalleryPreviewMultiselectPager) this.A01;
            MN6 mn6 = galleryPreviewMultiselectPager.A00;
            if (mn6 != null) {
                ((C48603Lef) mn6).A00.A0a(C05F.A01, false);
            }
            int childCount = galleryPreviewMultiselectPager.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                Object tag = galleryPreviewMultiselectPager.getChildAt(i3).getTag();
                if ((tag instanceof C45752KNf) && (c45752KNf = (C45752KNf) tag) != null) {
                    c45752KNf.A04.A04();
                }
            }
            if (videoPreviewView == 0) {
                return;
            }
        }
        videoPreviewView.A06();
    }

    @Override // X.AbstractC48552Ldp, X.InterfaceC58181Pql
    public final void DYw(VideoPreviewView videoPreviewView) {
        MN6 mn6;
        if (this.A00 == 0 && (mn6 = ((GalleryPreviewMultiselectPager) this.A01).A00) != null) {
            GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = ((C48603Lef) mn6).A00;
            gestureDetectorOnGestureListenerC43829JZs.A0a(C05F.A0C, true);
            AbstractC44261Jh7.A00(true, MediaStreamTrack.VIDEO_TRACK_KIND);
            MYZ A01 = MX1.A01(gestureDetectorOnGestureListenerC43829JZs.A0z);
            A01.A04 = A01.A0B.A02(288429634, A01.A04);
        }
    }

    @Override // X.AbstractC48552Ldp, X.InterfaceC58181Pql
    public final void Dac(VideoPreviewView videoPreviewView, float f) {
        if (1 - this.A00 == 0) {
            IgCaptureVideoPreviewView igCaptureVideoPreviewView = ((C52157N6j) this.A01).A08;
            if (igCaptureVideoPreviewView == null) {
                C14360o3.A0F("videoPreview");
                throw C00O.createAndThrow();
            }
            igCaptureVideoPreviewView.setAspectRatio(0.75f);
        }
    }
}
