package X;

import android.media.AudioAttributes;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.5nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126285nP {
    public final AudioAttributes A00;

    public C126285nP(C4UX c4ux) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(c4ux.A01);
        int i = Util.A00;
        if (i >= 29) {
            AbstractC126295nQ.A00(usage);
            if (i >= 32) {
                AbstractC126305nR.A00(usage);
            }
        }
        this.A00 = usage.build();
    }
}
