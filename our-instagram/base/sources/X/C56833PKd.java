package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.PKd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56833PKd implements FilenameFilter {
    public static final C56833PKd A00 = new C56833PKd();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C14360o3.A0B(str, 1);
        if (!AbstractC002300n.A0h(str, "preview_audio_", false) || !AbstractC002300n.A0f(str, ".wav", false)) {
            return false;
        }
        return true;
    }
}
