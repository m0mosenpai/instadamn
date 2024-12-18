package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.3pO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84313pO implements FilenameFilter {
    public static final C84313pO A00 = new C84313pO();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str != null && AbstractC002300n.A0f(str, "mp4", false);
    }
}
