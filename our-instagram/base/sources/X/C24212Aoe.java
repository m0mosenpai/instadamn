package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Aoe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24212Aoe implements BCI {
    public final String A00;
    public final String A01;
    public final boolean A02;

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        String str;
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                if (bundle.containsKey("timestampMs")) {
                    bundle.getLong("timestampMs");
                    str = "roi";
                } else {
                    return null;
                }
            } else {
                if (i != 1 || !bundle.containsKey("timestampMs")) {
                    return null;
                }
                bundle.getLong("timestampMs");
                str = "boxes";
            }
            bundle.getFloatArray(str);
            return null;
        }
        return null;
    }

    public C24212Aoe(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }
}
