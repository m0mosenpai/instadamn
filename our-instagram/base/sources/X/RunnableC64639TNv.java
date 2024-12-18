package X;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.webview.ReactWebViewManager;

/* renamed from: X.TNv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64639TNv implements Runnable {
    public final /* synthetic */ SLE A00;
    public final /* synthetic */ String A01;

    public RunnableC64639TNv(SLE sle, String str) {
        this.A00 = sle;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SLE sle = this.A00;
        String parseOrigin = ReactWebViewManager.parseOrigin(sle.A01.getUrl());
        Q4m q4m = sle.A00;
        ReactWebViewManager.dispatchEvent(q4m, new R6B(UIManagerHelper.A01(q4m), q4m.getId(), this.A01, parseOrigin));
    }
}
