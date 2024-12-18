package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.9LA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9LA {
    public float A00 = 1.0f;
    public ImageView A01;
    public BC1 A02;
    public final ViewGroup A03;
    public final AnonymousClass693 A04;
    public final Context A05;

    public C9LA(Context context, ViewGroup viewGroup) {
        this.A05 = context;
        this.A03 = viewGroup;
        this.A04 = C68U.A00(context, R.raw.smart_capture_hand_indicator);
        if (viewGroup.findViewById(R.id.hand_indicator_keyframe_view) == null) {
            AbstractC167007dF.A0M(viewGroup, R.id.pre_capture_camera_hand_indicator_container_stub).inflate();
        }
    }
}
