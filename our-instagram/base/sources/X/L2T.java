package X;

import android.view.View;
import com.facebook.R;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class L2T {
    public ConstrainedTextureView A00;
    public C9KJ A01;
    public final C23105AGr A02;
    public final MediaFrameLayout A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.AGr] */
    public L2T(View view) {
        WeakReference weakReference;
        ?? obj = new Object();
        obj.A01(view.findViewById(R.id.play_button));
        obj.A01 = view.findViewById(R.id.seek_frame_indicator);
        SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) view.findViewById(R.id.media_indicator);
        obj.A05 = slideInAndOutIconView;
        C4ZF c4zf = new C4ZF();
        obj.A04 = c4zf;
        if (slideInAndOutIconView != null) {
            weakReference = AbstractC25225BEi.A16(slideInAndOutIconView);
        } else {
            weakReference = null;
        }
        java.util.Set set = c4zf.A07;
        set.clear();
        if (weakReference != null) {
            set.add(weakReference);
        }
        this.A02 = obj;
        this.A03 = (MediaFrameLayout) view.requireViewById(R.id.creation_image_container);
    }
}
