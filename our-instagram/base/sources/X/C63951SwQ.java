package X;

import android.view.ViewStub;
import com.facebook.R;
import com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;

/* renamed from: X.SwQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63951SwQ implements InterfaceC65594Tnc {
    public BwPBrowserLiteChrome A00;
    public final ViewStub A01;
    public final InterfaceC172717mh A02;
    public final InterfaceC172727mi A03;

    @Override // X.InterfaceC65594Tnc
    public final /* synthetic */ void AJL(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC65594Tnc
    public final /* synthetic */ void Coq() {
    }

    @Override // X.InterfaceC65594Tnc
    public final void DxY(String str) {
    }

    @Override // X.InterfaceC65594Tnc
    public final void ETv(int i) {
    }

    @Override // X.InterfaceC65594Tnc
    public final boolean Ell() {
        return false;
    }

    @Override // X.InterfaceC65594Tnc
    public final int getHeightPx() {
        return 0;
    }

    @Override // X.InterfaceC65594Tnc
    public final void setProgressBarVisibility(int i) {
    }

    @Override // X.InterfaceC65594Tnc
    public final void CO4() {
        BrowserLiteProgressBar browserLiteProgressBar;
        BwPBrowserLiteChrome bwPBrowserLiteChrome = this.A00;
        if (bwPBrowserLiteChrome != null && (browserLiteProgressBar = bwPBrowserLiteChrome.A07) != null) {
            browserLiteProgressBar.setProgress(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    @Override // X.InterfaceC65594Tnc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EbW(android.content.Intent r16, java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63951SwQ.EbW(android.content.Intent, java.lang.String, int):void");
    }

    @Override // X.InterfaceC65594Tnc
    public final void setProgress(int i) {
        BwPBrowserLiteChrome bwPBrowserLiteChrome = this.A00;
        if (bwPBrowserLiteChrome != null) {
            bwPBrowserLiteChrome.setProgress(i);
        }
    }

    public C63951SwQ(ViewStub viewStub, InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi) {
        this.A02 = interfaceC172717mh;
        this.A03 = interfaceC172727mi;
        this.A01 = viewStub;
        EbW(null, null, R.layout.bwp_browser_header_stub);
    }
}
