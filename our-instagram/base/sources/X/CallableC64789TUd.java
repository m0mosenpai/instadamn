package X;

import android.graphics.Rect;
import java.util.concurrent.Callable;

/* renamed from: X.TUd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC64789TUd implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static Rect A00(int i, int i2, int i3, int i4) {
        int min = Math.min((int) ((i - i2) * 0.2f), (int) (0.2f * (i3 - i4)));
        return new Rect(Math.max(i2 - min, 0), Math.max(i4 - min, 0), i + min, i3 + min);
    }

    public CallableC64789TUd(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[Catch: FileNotFoundException | IOException -> 0x02a4, TRY_LEAVE, TryCatch #1 {FileNotFoundException | IOException -> 0x02a4, blocks: (B:40:0x0073, B:42:0x0089, B:44:0x00c9, B:44:0x00c9, B:46:0x00d3, B:46:0x00d3, B:47:0x00d5, B:47:0x00d5, B:49:0x011c, B:49:0x011c, B:50:0x0120, B:50:0x0120, B:52:0x0128, B:52:0x0128, B:64:0x0149, B:64:0x0149, B:66:0x015c, B:66:0x015c, B:68:0x017f, B:68:0x017f, B:69:0x029d, B:69:0x029d, B:70:0x02a3, B:70:0x02a3, B:72:0x019a, B:72:0x019a, B:75:0x01a8, B:75:0x01a8, B:80:0x01c1, B:80:0x01c1, B:82:0x01e2, B:82:0x01e2, B:85:0x01ed, B:85:0x01ed, B:87:0x022c, B:87:0x022c, B:88:0x0236, B:88:0x0236, B:90:0x0242, B:90:0x0242, B:91:0x0248, B:91:0x0248, B:93:0x025e, B:93:0x025e, B:95:0x0285, B:95:0x0285, B:96:0x0289, B:96:0x0289, B:101:0x027b, B:101:0x027b, B:108:0x0299, B:108:0x0299, B:111:0x0131, B:111:0x0131), top: B:39:0x0073 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC64789TUd.call():java.lang.Object");
    }
}
