package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: X.TRg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64724TRg implements Runnable {
    public static final C62679SLs A02 = new C62679SLs("RevokeAccessOperation", new String[0]);
    public final C60656RGi A00;
    public final String A01;

    @Override // java.lang.Runnable
    public final void run() {
        C62679SLs c62679SLs;
        String valueOf;
        String str;
        Status status = Status.A06;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) AbstractC58320PtC.A16(AnonymousClass001.A0R("https://accounts.google.com/o/oauth2/revoke?token=", this.A01));
            httpURLConnection.setRequestProperty("Content-Type", AbstractC111324zv.A00(729));
            if (httpURLConnection.getResponseCode() == 200) {
                status = Status.A08;
            } else {
                AbstractC58321PtD.A1Q(A02.A01, "Unable to revoke access!", "RevokeAccessOperation");
            }
        } catch (IOException e) {
            c62679SLs = A02;
            valueOf = String.valueOf(e.toString());
            str = "IOException when revoking access: ";
            AbstractC58321PtD.A1Q(c62679SLs.A01, str.concat(valueOf), "RevokeAccessOperation");
            this.A00.A06(status);
        } catch (Exception e2) {
            c62679SLs = A02;
            valueOf = String.valueOf(e2.toString());
            str = "Exception when revoking access: ";
            AbstractC58321PtD.A1Q(c62679SLs.A01, str.concat(valueOf), "RevokeAccessOperation");
            this.A00.A06(status);
        }
        this.A00.A06(status);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RGi, com.google.android.gms.common.api.internal.BasePendingResult] */
    public RunnableC64724TRg(String str) {
        C3U5.A04(str);
        this.A01 = str;
        this.A00 = new BasePendingResult(null);
    }
}
