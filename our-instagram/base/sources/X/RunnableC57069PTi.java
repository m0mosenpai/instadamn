package X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: X.PTi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57069PTi implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ C183298Bb A03;
    public final /* synthetic */ String A04;

    public RunnableC57069PTi(Bitmap bitmap, C183298Bb c183298Bb, String str, int i, int i2) {
        this.A02 = bitmap;
        this.A00 = i;
        this.A04 = str;
        this.A03 = c183298Bb;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Bitmap[] A01;
        Bitmap bitmap = this.A02;
        int i2 = this.A00;
        String str = this.A04;
        C183298Bb c183298Bb = this.A03;
        int i3 = this.A01;
        if (c183298Bb.A00 == i3) {
            C2GS c2gs = c183298Bb.A06;
            C51683MsE c51683MsE = (C51683MsE) c2gs.A02();
            if (c51683MsE != null && (A01 = c51683MsE.A01()) != null) {
                i = A01.length;
            } else {
                i = 0;
            }
            if (i2 >= i) {
                C0w9.A03("BitmapTimelineHelper", AbstractC166997dE.A0z("Invalid index for bitmaps. Length = %d, index = %d, Session ID = %d, Playback Surface: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, 4)));
                return;
            }
            C51683MsE c51683MsE2 = (C51683MsE) c2gs.A02();
            if (c51683MsE2 == null) {
                return;
            }
            c51683MsE2.A00(i2, bitmap);
            c2gs.A0A(c51683MsE2);
        }
    }
}
