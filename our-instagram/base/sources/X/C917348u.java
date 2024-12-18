package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.48u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C917348u implements FilenameFilter {
    public static final C917348u A00 = new C917348u();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C14360o3.A0A(str);
        return AbstractC002300n.A0h(str, "direct_share_content_", false);
    }
}
