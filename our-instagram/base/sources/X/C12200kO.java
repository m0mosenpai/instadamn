package X;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

/* renamed from: X.0kO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12200kO implements FileFilter {
    public final int A00;
    public final String A01;

    public C12200kO(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean endsWith;
        switch (this.A00) {
            case 0:
                String str = this.A01;
                List list = C0MV.A05;
                AbstractC05810Sj.A00(file);
                return file.getName().startsWith(str);
            case 1:
                String str2 = this.A01;
                if (file != null) {
                    endsWith = file.getName().endsWith(str2);
                    break;
                } else {
                    return false;
                }
            default:
                String str3 = this.A01;
                if (file != null && file.isDirectory()) {
                    if (!file.getName().startsWith(AnonymousClass001.A0g("session_", str3, "_"))) {
                        endsWith = file.getName().startsWith(AnonymousClass001.A0g("sess_", str3, "_"));
                        break;
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
        }
        if (endsWith) {
            return true;
        }
        return false;
    }
}
