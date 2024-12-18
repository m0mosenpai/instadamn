package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.util.List;

/* renamed from: X.Wuh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71481Wuh implements Runnable {
    public final /* synthetic */ WEY A00;
    public final /* synthetic */ List A01;

    public RunnableC71481Wuh(WEY wey, List list) {
        this.A01 = list;
        this.A00 = wey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (Bitmap bitmap : AbstractC001800i.A0X(this.A01)) {
            AnonymousClass811 anonymousClass811 = new AnonymousClass811("Poses");
            anonymousClass811.A05 = bitmap;
            anonymousClass811.A07 = false;
            AnonymousClass810 anonymousClass810 = new AnonymousClass810(anonymousClass811);
            try {
                WEY wey = this.A00;
                C200688uB c200688uB = new C200688uB(wey.A07, wey.A06);
                GLES20.glBindFramebuffer(36160, c200688uB.A00);
                GLES20.glViewport(0, 0, c200688uB.A02, c200688uB.A01);
                C70190WFt c70190WFt = wey.A02;
                if (c70190WFt != null) {
                    C201278vB c201278vB = wey.A0A;
                    c201278vB.A01(anonymousClass810, null, 0L);
                    C70190WFt.A04(c201278vB, c70190WFt);
                    C9K4 A01 = C70190WFt.A01(c70190WFt, C05F.A00);
                    A01.A03("sTexture", c201278vB.A00());
                    c70190WFt.A05(A01, c201278vB);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glBindTexture(3553, 0);
                    anonymousClass810.A01();
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    GLES20.glFinish();
                    wey.A0C.add(c200688uB);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } catch (RuntimeException unused) {
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glBindTexture(3553, 0);
                anonymousClass810.A01();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.A00.A0C.clear();
                return;
            }
        }
        WEY.A01(this.A00);
    }
}
