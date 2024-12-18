package X;

import android.opengl.GLES20;
import java.util.Map;

/* renamed from: X.810, reason: invalid class name */
/* loaded from: classes4.dex */
public class AnonymousClass810 {
    public final int A00;
    public final int A01;
    public final AnonymousClass812 A02;
    public final boolean A03;
    public final Map A04;
    public volatile boolean A05 = false;

    public boolean A01() {
        C178937x5 C6u;
        synchronized (this) {
            if (this.A05) {
                return false;
            }
            this.A05 = true;
            if (!this.A03) {
                GLES20.glDeleteTextures(1, new int[]{this.A00}, 0);
                InterfaceC178897x1 A02 = C178917x3.A02();
                if (A02 != null && (C6u = A02.C6u()) != null) {
                    synchronized (C6u) {
                        C6u.A01.remove(this.A02);
                    }
                }
                C178937x5 c178937x5 = C180247zE.A02.A00;
                synchronized (c178937x5) {
                    c178937x5.A01.remove(this.A02);
                }
            }
            return this.A05;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00af, code lost:
    
        if ((r5 % 2) == 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140 A[Catch: all -> 0x0153, TRY_ENTER, TryCatch #1 {, blocks: (B:37:0x012c, B:42:0x0140, B:43:0x0145, B:46:0x014d, B:52:0x0151, B:53:0x0152, B:45:0x0146), top: B:36:0x012c, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass810(X.AnonymousClass811 r17) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass810.<init>(X.811):void");
    }

    public void A00(int i, int i2) {
        AnonymousClass812 anonymousClass812 = this.A02;
        anonymousClass812.A01 = i;
        anonymousClass812.A00 = i2;
    }
}
