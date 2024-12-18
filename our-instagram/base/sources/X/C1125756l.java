package X;

import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.56l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1125756l {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C1125456i A03;
    public final File A04;
    public final java.net.URL A05;

    public final boolean equals(Object obj) {
        File file;
        java.net.URL url;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1125756l c1125756l = (C1125756l) obj;
            if (this.A02 == c1125756l.A02 && this.A01 == c1125756l.A01 && this.A00 == c1125756l.A00) {
                File file2 = this.A04;
                if ((file2 == null && c1125756l.A04 == null) || file2 == (file = c1125756l.A04) || (file2 != null && file2.equals(file))) {
                    java.net.URL url2 = this.A05;
                    if (((url2 != null || c1125756l.A05 != null) && url2 != (url = c1125756l.A05) && (url2 == null || !url2.equals(url))) || !this.A03.equals(c1125756l.A03)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        File file = this.A04;
        if (file != null) {
            jSONObject.put("mSourceFile", file.getPath());
        }
        java.net.URL url = this.A05;
        if (url != null) {
            jSONObject.put("mUrl", url.toString());
        }
        jSONObject.put("mSourceTimeRange", this.A03.A04());
        jSONObject.put("mPhotoDurationUs", this.A02);
        jSONObject.put("mMediaOriginalDurationMs", this.A01);
        jSONObject.put("mOutputFps", this.A00);
        return jSONObject;
    }

    public final boolean A01(boolean z) {
        File file = this.A04;
        if (file != null) {
            if (this.A02 >= 0 || AbstractC50672MYq.A00(file.getPath(), "video/mp4", z).contains("image")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, this.A03, Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00)});
    }

    public C1125756l(C1125656k c1125656k) {
        this.A04 = c1125656k.A04;
        C1125456i c1125456i = c1125656k.A03;
        c1125456i.getClass();
        this.A03 = c1125456i;
        this.A02 = c1125656k.A02;
        this.A01 = c1125656k.A01;
        this.A00 = c1125656k.A00;
        this.A05 = c1125656k.A05;
    }

    public final String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
