package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.48s, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48s implements FilenameFilter {
    public static final C48s A00 = new C48s();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C14360o3.A0A(str);
        if (!AbstractC002300n.A0h(str, "tmp_photo_", false) || !AbstractC002300n.A0f(str, ".jpg", false)) {
            return false;
        }
        return true;
    }
}
