package X;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.JavascriptInterface;
import android.widget.LinearLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.trustly.android.sdk.views.TrustlyView;

/* loaded from: classes10.dex */
public final class SNR {
    public final TrustlyView A00;

    @JavascriptInterface
    public void postMessage(String str) {
        String[] split;
        int length;
        String str2;
        String str3;
        if (str != null && !str.trim().isEmpty() && (length = (split = str.split("\\|")).length) != 0 && (str2 = split[0]) != null && !str2.trim().isEmpty() && str2.equalsIgnoreCase("PayWithMyBank.event")) {
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            A1G2.put(2, "page");
            A1G2.put(3, AbstractC43591JPw.A00(485));
            A1G2.put(4, "merchantReference");
            A1G2.put(5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            A1G2.put(6, "data");
            A1G2.put(7, "transfer");
            Iterator A14 = AbstractC166997dE.A14(A1G2);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                int A0H = AbstractC166987dD.A0H(A1K.getKey());
                Object value = A1K.getValue();
                if (value != null && A0H < length && (str3 = split[A0H]) != null) {
                    String trim = str3.trim();
                    if (!trim.isEmpty() && !trim.equalsIgnoreCase("null")) {
                        A1G.put(value, str3);
                    }
                }
            }
        }
    }

    public SNR(TrustlyView trustlyView) {
        this.A00 = trustlyView;
    }

    @JavascriptInterface
    public void resize(final float f, final float f2) {
        AbstractC167007dF.A0J().post(new Runnable() { // from class: X.TQN
            @Override // java.lang.Runnable
            public final void run() {
                SNR snr = SNR.this;
                float f3 = f;
                float f4 = f2;
                TrustlyView trustlyView = snr.A00;
                DisplayMetrics A0K = AbstractC167007dF.A0K(trustlyView.getContext());
                trustlyView.setLayoutParams(new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, f3, A0K), (int) TypedValue.applyDimension(1, f4, A0K)));
            }
        });
    }
}
