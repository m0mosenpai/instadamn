package X;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TY5 extends Thread {
    public final /* synthetic */ Map A00;

    public TY5(Map map) {
        this.A00 = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String message;
        StringBuilder A15;
        String str;
        Map map = this.A00;
        Uri.Builder buildUpon = android.net.Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A12);
            buildUpon.appendQueryParameter(A1B, AbstractC166987dD.A1A(A1B, map));
        }
        String A0q = AbstractC58319PtB.A0q(buildUpon);
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) AbstractC58320PtC.A16(A0q);
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder A0q2 = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(A0q) + 65);
                        A0q2.append("Received non-success response code ");
                        A0q2.append(responseCode);
                        android.util.Log.w("HttpUrlPinger", MSZ.A0u(" from pinging URL: ", A0q, A0q2));
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException | RuntimeException e) {
                e = e;
                message = e.getMessage();
                A15 = AbstractC58320PtC.A15(message, AbstractC58319PtB.A05(A0q) + 27);
                str = "Error while pinging URL: ";
                AbstractC58323PtF.A1O(str, A0q, ". ", message, A15);
                android.util.Log.w("HttpUrlPinger", A15.toString(), e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            message = e.getMessage();
            A15 = AbstractC58320PtC.A15(message, AbstractC58319PtB.A05(A0q) + 32);
            str = "Error while parsing ping URL: ";
            AbstractC58323PtF.A1O(str, A0q, ". ", message, A15);
            android.util.Log.w("HttpUrlPinger", A15.toString(), e);
        }
    }
}
