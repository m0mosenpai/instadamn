package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.PKa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56830PKa implements FileFilter {
    public static final C56830PKa A00 = new C56830PKa();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file.getName();
        C14360o3.A07(name);
        if (!AbstractC002300n.A0h(name, "cpu", false) || file.getName().length() < 4 || !Character.isDigit(file.getName().charAt(3))) {
            return false;
        }
        return true;
    }
}
