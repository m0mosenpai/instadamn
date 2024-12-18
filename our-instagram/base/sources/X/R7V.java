package X;

import android.R;
import android.content.Context;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.secure.webkit.WebView;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class R7V extends WebView implements InterfaceC65201Tfj {
    public final /* synthetic */ SystemWebView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7V(Context context, SystemWebView systemWebView) {
        super(context, null, R.attr.webViewStyle);
        this.A00 = systemWebView;
    }

    public static void A01(Q4Z q4z, R7V r7v) {
        super.onProvideAutofillVirtualStructure(q4z, 0);
    }

    public static SystemWebView A00(Object obj) {
        return ((R7V) ((InterfaceC65201Tfj) obj)).A00;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void autofill(SparseArray sparseArray) {
        SDP sdp = this.A00.A0F;
        if (sdp != null) {
            C5G6 c5g6 = sdp.A00.A0Y;
            C43031yW c43031yW = c5g6.A04;
            C62620SJd c62620SJd = c5g6.A00;
            EnumC61119RfZ enumC61119RfZ = EnumC61119RfZ.A02;
            AbstractC167027dH.A12(c43031yW, c62620SJd, enumC61119RfZ);
            if (AbstractC61728Rsj.A00(c62620SJd, c43031yW)) {
                C51760Mtj c51760Mtj = c62620SJd.A04;
                c51760Mtj.A02 = AbstractC001800i.A0S(AbstractC166987dD.A1J(enumC61119RfZ), (Collection) c51760Mtj.A02);
            }
        }
        super.autofill((SparseArray<AutofillValue>) sparseArray);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C58883QEt c58883QEt;
        C63380Siu c63380Siu;
        C58883QEt c58883QEt2;
        C63380Siu c63380Siu2;
        SystemWebView systemWebView = this.A00;
        if (systemWebView.A0N) {
            SDP sdp = systemWebView.A0F;
            if (sdp != null && systemWebView.A0O && (c63380Siu2 = (c58883QEt2 = sdp.A00).A05) != null) {
                QF6 qf6 = sdp.A01;
                c63380Siu2.A0F((AutofillSharedJSBridgeProxy) c58883QEt2.A0g.get(qf6), qf6);
            }
            if (!systemWebView.A0O) {
                return;
            }
        } else if (systemWebView.A0O && !(viewStructure instanceof Q4Z)) {
            SDP sdp2 = systemWebView.A0F;
            if (sdp2 != null && (c63380Siu = (c58883QEt = sdp2.A00).A05) != null) {
                QF6 qf62 = sdp2.A01;
                c63380Siu.A0F((AutofillSharedJSBridgeProxy) c58883QEt.A0g.get(qf62), qf62);
            }
        } else {
            super.onProvideAutofillVirtualStructure(viewStructure, i);
        }
        SDP sdp3 = systemWebView.A0F;
        if (sdp3 == null) {
            return;
        }
        C5G6 c5g6 = sdp3.A00.A0Y;
        if (!AbstractC61728Rsj.A00(c5g6.A00, c5g6.A04)) {
            return;
        }
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    @Override // android.webkit.WebView, android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.webkit.WebView, android.view.View
    public final int computeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1506898220);
        super.onAttachedToWindow();
        Pattern pattern = SUV.A01;
        C0f9.A0D(1476421381, A06);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C62413SAn c62413SAn = this.A00.A0C;
        if (c62413SAn != null) {
            Iterator it = c62413SAn.A00.A0p.iterator();
            while (it.hasNext()) {
                ((InterfaceC65639Tq2) it.next()).onScrollChanged(i, i2, i3, i4);
            }
        }
    }
}
