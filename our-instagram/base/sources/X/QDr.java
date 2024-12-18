package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import java.util.Map;

/* loaded from: classes10.dex */
public final class QDr extends SNF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDr(Bundle bundle, C63305ShB c63305ShB, Map map, int i) {
        super(c63305ShB);
        this.A00 = i;
        this.A01 = c63305ShB;
        this.A02 = map;
        this.A03 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDr(Bundle bundle, C63305ShB c63305ShB, long[] jArr) {
        super(c63305ShB);
        this.A00 = 0;
        this.A01 = c63305ShB;
        this.A02 = jArr;
        this.A03 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDr(Bundle bundle, C63305ShB c63305ShB, OnShopsLiteCallback onShopsLiteCallback) {
        super(c63305ShB);
        this.A00 = 3;
        this.A01 = c63305ShB;
        this.A02 = bundle;
        this.A03 = onShopsLiteCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDr(C63305ShB c63305ShB, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
        super(c63305ShB);
        this.A00 = 4;
        this.A01 = c63305ShB;
        this.A03 = browserLiteJSBridgeCall;
        this.A02 = browserLiteJSBridgeCallback;
    }
}
