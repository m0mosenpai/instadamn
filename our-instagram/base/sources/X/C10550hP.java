package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0hP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10550hP extends C0L1 {
    @Override // X.C0L1
    public final C024209q A00(C0M6 c0m6) {
        C024209q c024209q = new C024209q(null);
        c024209q.A03(C0LK.A4x, "anr");
        c024209q.A03(C0LK.A6w, AnonymousClass001.A0g("android_", c0m6.A00, "anr"));
        return c024209q;
    }

    @Override // X.C0L1
    public final C0OP A01() {
        return C0OP.A05;
    }

    @Override // X.C0L1
    public final Integer A02() {
        return C05F.A00;
    }

    @Override // X.C0L1
    public final void A03(C0M6 c0m6, File file, File file2) {
        if (file2 != null) {
            File file3 = new File(file2, "critical_anr_prop.txt");
            if (file3.exists()) {
                file3.renameTo(new File(file3.getParentFile(), "critical_suppl_anr_extra_prop.txt"));
            }
            File[] listFiles = file2.listFiles(new FileFilter() { // from class: X.0PL
                @Override // java.io.FileFilter
                public final boolean accept(File file4) {
                    if (file4.getName().startsWith("large_") && file4.getName().endsWith("_anr_prop.txt")) {
                        return true;
                    }
                    return false;
                }
            });
            if (listFiles != null) {
                int i = -1;
                File file4 = null;
                for (File file5 : listFiles) {
                    try {
                        int parseInt = Integer.parseInt(file5.getName().replace("large_", "").replace("_anr_prop.txt", ""));
                        if (parseInt > i) {
                            file4 = file5;
                            i = parseInt;
                        }
                    } catch (NumberFormatException e) {
                        C0K8.A0P("lacrima", "Invalid anr report name %s", file5.getName(), e);
                        C0PC.A00().DEh("InvalidAnrPropFileName", e, null);
                    }
                }
                if (file4 != null && file4.exists()) {
                    file4.renameTo(new File(file4.getParentFile(), "large_suppl_anr_extra_prop.txt"));
                }
            }
        }
        super.A03(c0m6, file, file2);
    }

    @Override // X.C0L1
    public final File[] A05(C0M6 c0m6, File file) {
        if (c0m6 == C0M6.LARGE_REPORT) {
            return new File[]{new File(file, "critical_anr_app_death_early_prop.txt")};
        }
        return null;
    }
}
