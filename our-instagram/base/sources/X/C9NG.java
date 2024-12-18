package X;

import java.io.IOException;

/* renamed from: X.9NG, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9NG {
    public static final String A00(android.net.Uri uri) {
        try {
            MYB AUI = new C66013Ty9(VYI.A00).AUI(uri);
            C14360o3.A07(AUI);
            return AUI.A0C;
        } catch (IOException e) {
            C0K8.A0F("MediaMetadataUtils", "exception occurred when reading video metadata", e);
            return null;
        }
    }
}
