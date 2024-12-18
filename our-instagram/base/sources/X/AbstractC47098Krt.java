package X;

import android.view.View;
import android.widget.VideoView;
import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Krt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47098Krt {
    public static final void A00(View.OnTouchListener onTouchListener, VideoView videoView, InterfaceC11380iw interfaceC11380iw, IgImageView igImageView, String str, String str2) {
        if (str != null && AbstractC31174DnI.A1a(MetaGalleryNetegoInStoryMediaType.A06, str2)) {
            AbstractC167007dF.A0x(igImageView);
            if (videoView != null) {
                videoView.setVisibility(0);
                videoView.setVideoURI(AbstractC08820cl.A03(str));
                videoView.setOnPreparedListener(LNG.A00);
                videoView.setOnTouchListener(onTouchListener);
                videoView.start();
                return;
            }
            return;
        }
        if (igImageView == null) {
            return;
        }
        AbstractC25235BEs.A1I(interfaceC11380iw, igImageView, str);
    }
}
