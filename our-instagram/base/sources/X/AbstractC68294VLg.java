package X;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: X.VLg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68294VLg {
    public static final Boolean A00(C6FQ c6fq) {
        ContentResolver contentResolver;
        boolean z = false;
        if (!ValueAnimator.areAnimatorsEnabled()) {
            return true;
        }
        C6FG c6fg = c6fq.A03;
        if (c6fg == null || (contentResolver = c6fg.A00.getContentResolver()) == null) {
            return false;
        }
        if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) == 0.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
