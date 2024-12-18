package X;

import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class FXU {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse, X.1um, X.1ul] */
    public static DataDownloadStatusCheckResponse parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("message_header".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("message_body".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("email_hint".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else {
                    if ("content_status".equals(A0s)) {
                        String A1Q = c16l.A1Q();
                        for (DataDownloadStatusCheckResponse.JobStatus jobStatus : DataDownloadStatusCheckResponse.JobStatus.values()) {
                            if (A1Q.equalsIgnoreCase(jobStatus.name())) {
                                c40791um.A00 = jobStatus;
                            }
                        }
                        throw new UnsupportedOperationException();
                    }
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
