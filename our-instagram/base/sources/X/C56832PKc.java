package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.PKc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56832PKc implements FilenameFilter {
    public static final C56832PKc A00 = new C56832PKc();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C14360o3.A0B(str, 1);
        return AbstractC002300n.A0h(str, "media_accuracy_tags_", false);
    }
}
