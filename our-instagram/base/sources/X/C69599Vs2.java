package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.Vs2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69599Vs2 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final List A03;
    public final byte[] A04;

    public final int A00() {
        int i = this.A00;
        if (i != 2) {
            if (i == 3) {
                return 512;
            }
            return 0;
        }
        return C3OO.FLAG_MOVED;
    }

    public C69599Vs2(String str, List list, byte[] bArr, int i, int i2) {
        List unmodifiableList;
        this.A01 = i;
        this.A02 = str;
        this.A00 = i2;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A03 = unmodifiableList;
        this.A04 = bArr;
    }
}
