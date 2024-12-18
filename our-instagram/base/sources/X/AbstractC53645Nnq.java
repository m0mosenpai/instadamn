package X;

import java.io.File;

/* renamed from: X.Nnq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53645Nnq {
    public static final File A00(android.net.Uri uri) {
        if (C14360o3.A0K(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return AbstractC166987dD.A11(path);
            }
            throw AbstractC37303Gc4.A0M(uri, "Uri path is null: ", AbstractC166987dD.A1C());
        }
        throw AbstractC37303Gc4.A0M(uri, "Uri lacks 'file' scheme: ", AbstractC166987dD.A1C());
    }
}
