package X;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.Collection;

/* loaded from: classes10.dex */
public final class Q4a extends AutofillManager.AutofillCallback {
    public final /* synthetic */ SystemWebView A00;

    public Q4a(SystemWebView systemWebView) {
        this.A00 = systemWebView;
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i, int i2) {
        EnumC61119RfZ enumC61119RfZ;
        SDP sdp = this.A00.A0F;
        if (sdp != null) {
            C5G6 c5g6 = sdp.A00.A0Y;
            C43031yW c43031yW = c5g6.A04;
            C62620SJd c62620SJd = c5g6.A00;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        enumC61119RfZ = EnumC61119RfZ.A05;
                    } else {
                        throw AbstractC25230BEn.A0n("SystemAutofillEventType - Unknown type: ", i2);
                    }
                } else {
                    enumC61119RfZ = EnumC61119RfZ.A03;
                }
            } else {
                enumC61119RfZ = EnumC61119RfZ.A04;
            }
            AbstractC167027dH.A12(c43031yW, c62620SJd, enumC61119RfZ);
            if (AbstractC61728Rsj.A00(c62620SJd, c43031yW)) {
                C51760Mtj c51760Mtj = c62620SJd.A04;
                c51760Mtj.A02 = AbstractC001800i.A0S(AbstractC166987dD.A1J(enumC61119RfZ), (Collection) c51760Mtj.A02);
            }
        }
    }
}
