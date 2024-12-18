package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.76A, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C76A {
    public static final C09530e4 A00(Context context, AnonymousClass988 anonymousClass988, boolean z) {
        Integer num;
        String str;
        if (z) {
            return new C09530e4("H,0.62857143:1", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size)));
        }
        if (((Boolean) anonymousClass988.A0W.getValue()).booleanValue()) {
            num = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.clips_midcard_three_clips_adjacent_video_height_new_design));
        } else {
            if (((Boolean) anonymousClass988.A0Z.getValue()).booleanValue()) {
                if (((Boolean) anonymousClass988.A0X.getValue()).booleanValue()) {
                    str = "H,0.66666667:1";
                } else {
                    str = "H,0.555555:1";
                }
                return new C09530e4(str, Integer.valueOf(AbstractC13690mv.A01(context, (int) ((Number) anonymousClass988.A09.getValue()).longValue())));
            }
            num = null;
        }
        return new C09530e4("H,0.640625:1", num);
    }
}
