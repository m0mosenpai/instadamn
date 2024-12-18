package X;

import android.media.AudioAttributes;
import androidx.media3.common.util.Util;

/* renamed from: X.Xkb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72660Xkb {
    public final AudioAttributes A00;

    public C72660Xkb() {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Util.A01;
        if (i >= 29) {
            AbstractC72517XfW.A00(usage);
            if (i >= 32) {
                AbstractC72518XfX.A00(usage);
            }
        }
        this.A00 = usage.build();
    }
}
