package X;

import android.content.Context;
import android.view.View;
import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.Rd5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60977Rd5 extends AnonymousClass522 {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60977Rd5(int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        android.net.Uri A00;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                C62956SYy c62956SYy = C31783Dy2.A02;
                if (c62956SYy == null) {
                    C14360o3.A0F("warningListener");
                    throw C00O.createAndThrow();
                }
                String A002 = MSV.A00(1242);
                AbstractC10360h2 childFragmentManager = c62956SYy.A04.getChildFragmentManager();
                childFragmentManager.getClass();
                childFragmentManager.A0b();
                SDS sds = c62956SYy.A03;
                ((SystemWebView) sds.A01).A04.loadUrl(A002);
                sds.A00.A00 = true;
                InterfaceC65562Tmi interfaceC65562Tmi = c62956SYy.A01;
                if (interfaceC65562Tmi != null) {
                    interfaceC65562Tmi.CmX(c62956SYy.A02);
                }
                C62956SYy.A00(c62956SYy);
                return;
            case 1:
            case 2:
                C14360o3.A0B(view, 0);
                Context context = view.getContext();
                android.net.Uri A01 = AbstractC08820cl.A01(AbstractC63260SgI.A00, MSV.A00(31));
                if (A01 == null || (A00 = AbstractC63260SgI.A00(context, A01)) == null) {
                    return;
                }
                C12260kU.A0G(context, A00);
                return;
            default:
                super.onClick(view);
                return;
        }
    }
}
