package X;

import java.util.Collections;

/* renamed from: X.5nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126485nj {
    public final AbstractC126175nE A00;
    public final java.util.Set A01;
    public final int[] A02;
    public final String[] A03;

    public C126485nj(AbstractC126175nE abstractC126175nE, int[] iArr, String[] strArr) {
        java.util.Set singleton;
        this.A00 = abstractC126175nE;
        this.A02 = iArr;
        this.A03 = strArr;
        int length = strArr.length;
        if (length == 0) {
            singleton = C16910sj.A00;
        } else {
            singleton = Collections.singleton(strArr[0]);
            C14360o3.A07(singleton);
        }
        this.A01 = singleton;
        if (iArr.length == length) {
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }
}
