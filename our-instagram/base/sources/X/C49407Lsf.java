package X;

import android.view.View;
import com.facebook.R;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.Lsf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49407Lsf implements InterfaceC80653iu {
    public final int A00;
    public final Object A01;

    public C49407Lsf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC80653iu
    public final /* synthetic */ void DFp() {
    }

    @Override // X.InterfaceC80653iu
    public final void DPX(C73083Pj c73083Pj) {
        switch (this.A00) {
            case 0:
                ((ViewOnKeyListenerC67975V4q) this.A01).A03();
                return;
            case 1:
                ViewOnKeyListenerC67971V4l viewOnKeyListenerC67971V4l = ((ViewOnKeyListenerC67976V4r) this.A01).A06;
                if (viewOnKeyListenerC67971V4l == null) {
                    C14360o3.A0F("videoModule");
                    throw C00O.createAndThrow();
                }
                viewOnKeyListenerC67971V4l.A03.sendEmptyMessage(0);
                return;
            case 2:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                L5Y l5y = directVisualMessageViewerController.contentHolder;
                if (l5y != null) {
                    l5y.A0J.A06(R.id.direct_visual_message_viewer_fragment_image_view_id);
                    View view = directVisualMessageViewerController.contentView;
                    if (view != null) {
                        AbstractC13880nE.A0q(view, new RunnableC49885M1e(directVisualMessageViewerController));
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166997dE.A0g();
            case 3:
                C14360o3.A0B(c73083Pj, 0);
                ((View) this.A01).setTag(R.id.id_for_thumbnail_media_loaded_data_tag, c73083Pj.A04);
                return;
            default:
                return;
        }
    }
}
