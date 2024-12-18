package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.SYy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62956SYy {
    public Context A00;
    public InterfaceC65562Tmi A01;
    public String A02;
    public final SDS A03;
    public final InterfaceC172717mh A04;

    public static void A00(C62956SYy c62956SYy) {
        InterfaceC172717mh interfaceC172717mh = c62956SYy.A04;
        QF6 C9a = interfaceC172717mh.C9a();
        C9a.getClass();
        C9a.A0b = false;
        ((SystemWebView) interfaceC172717mh.C9a()).A04.setImportantForAccessibility(0);
    }

    public final void A01() {
        InterfaceC172717mh interfaceC172717mh = this.A04;
        AbstractC10360h2 childFragmentManager = interfaceC172717mh.getChildFragmentManager();
        childFragmentManager.getClass();
        childFragmentManager.A0b();
        interfaceC172717mh.Eg2(0);
        QF6 C9a = interfaceC172717mh.C9a();
        C9a.getClass();
        if (!C9a.A0H() && !interfaceC172717mh.DJx(true)) {
            interfaceC172717mh.AIE(2, this.A02);
        }
        A00(this);
    }

    public C62956SYy(Context context, SDS sds, InterfaceC172717mh interfaceC172717mh, String str, boolean z) {
        this.A04 = interfaceC172717mh;
        this.A03 = sds;
        this.A00 = context;
        this.A02 = str;
        if (z) {
            Intent intent = interfaceC172717mh.getIntent();
            intent.getClass();
            this.A01 = AbstractC61736Rsr.A00(intent);
        }
    }
}
