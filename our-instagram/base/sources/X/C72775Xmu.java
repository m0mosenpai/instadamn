package X;

import android.media.AudioTrack;
import java.lang.reflect.Method;

/* renamed from: X.Xmu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72775Xmu {
    public YQ7 A00;
    public Method A01;
    public final YMK A02;
    public final long[] A03;

    public C72775Xmu(YMK ymk) {
        this.A02 = ymk;
        try {
            this.A01 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.A03 = new long[10];
        this.A00 = YQ7.A00;
    }
}
