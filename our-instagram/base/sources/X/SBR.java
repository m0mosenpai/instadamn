package X;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes10.dex */
public final class SBR {
    public final C62617SIz A00;

    public SBR(Context context, ReadableMap readableMap) {
        C14360o3.A0B(context, 2);
        C62617SIz c62617SIz = null;
        if (readableMap != null) {
            try {
                c62617SIz = new C62617SIz(context, readableMap);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.A00 = c62617SIz;
    }
}
