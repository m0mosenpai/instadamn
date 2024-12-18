package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.UFu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66409UFu extends W46 {
    public final long A00;
    public final List A01;
    public final List A02;

    public final C66409UFu A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C66409UFu c66409UFu = (C66409UFu) list.get(i2);
            if (((W46) c66409UFu).A00 == i) {
                return c66409UFu;
            }
        }
        return null;
    }

    public final C66408UFt A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C66408UFt c66408UFt = (C66408UFt) list.get(i2);
            if (((W46) c66408UFt).A00 == i) {
                return c66408UFt;
            }
        }
        return null;
    }

    @Override // X.W46
    public final String toString() {
        return AnonymousClass001.A11(W46.A00(super.A00), AbstractC111324zv.A00(1387), Arrays.toString(this.A02.toArray()), AbstractC111324zv.A00(1386), Arrays.toString(this.A01.toArray()));
    }

    public C66409UFu(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }
}
