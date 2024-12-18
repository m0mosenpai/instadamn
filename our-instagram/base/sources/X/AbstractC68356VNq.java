package X;

import java.io.File;

/* renamed from: X.VNq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68356VNq {
    public static final void A00(C19260xA c19260xA, File file, String str) {
        long j;
        C19260xA c19260xA2 = new C19260xA();
        long j2 = 0;
        if (file != null) {
            j = file.getFreeSpace();
        } else {
            j = 0;
        }
        C19260xA.A00(c19260xA2, Long.valueOf(j), "free");
        if (file != null) {
            j2 = file.getTotalSpace();
        }
        C19260xA.A00(c19260xA2, Long.valueOf(j2), "total");
        C19260xA.A00(c19260xA, c19260xA2, str);
    }
}
