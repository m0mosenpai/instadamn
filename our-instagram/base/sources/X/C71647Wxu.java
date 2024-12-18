package X;

import com.facebook.mediastreaming.opt.source.video.AndroidExternalVideoSource;
import java.lang.Thread;

/* renamed from: X.Wxu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71647Wxu implements Thread.UncaughtExceptionHandler {
    public final int A00;
    public final Object A01;

    public C71647Wxu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.A00) {
            case 0:
                String str = "Failed to handle frame";
                AndroidExternalVideoSource androidExternalVideoSource = ((WWm) this.A01).A06.A00;
                if ("Failed to handle frame".length() == 0) {
                    str = "";
                }
                androidExternalVideoSource.fireError(EnumC53246Ngk.VideoSourceError, str, th);
                return;
            case 1:
                WG8.A03((WG8) this.A01, th);
                return;
            default:
                WZF.A0B((WZF) this.A01, th);
                return;
        }
    }
}
