package com.facebook.browser.lite;

import X.AbstractServiceC18470vY;
import X.C0f9;
import android.content.Intent;

/* loaded from: classes10.dex */
public class BrowserLiteIntentService extends AbstractServiceC18470vY {
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:20:0x00c8, B:22:0x00d0, B:24:0x00de, B:26:0x00e6, B:27:0x00ec, B:29:0x00f2, B:35:0x0100, B:36:0x0104, B:38:0x0109, B:40:0x0111, B:41:0x0132, B:43:0x014e, B:44:0x018f, B:45:0x0139, B:47:0x0141, B:48:0x0154, B:50:0x015c, B:51:0x0174, B:53:0x017c, B:54:0x0182, B:56:0x018a, B:57:0x0193, B:59:0x019b, B:63:0x01b1, B:64:0x01b8, B:66:0x01be, B:68:0x01c8, B:70:0x01ed, B:74:0x01dc, B:75:0x01e6, B:77:0x01d1, B:79:0x01f0), top: B:19:0x00c8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteIntentService.A00(android.content.Intent):void");
    }

    @Override // X.AnonymousClass028, android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(1294123826);
        super.onCreate();
        C0f9.A0B(695558224, A04);
    }

    @Override // X.AnonymousClass028
    public final void onHandleWork(Intent intent) {
        A00(intent);
    }

    @Override // X.AnonymousClass028, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(271823284);
        super.onStartCommand(intent, i, i2);
        if (intent != null && intent.getBooleanExtra("EXTRA_START_AS_SERVICE", false)) {
            A00(intent);
        }
        C0f9.A0B(1991039513, A04);
        return 3;
    }
}
