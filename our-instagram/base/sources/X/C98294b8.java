package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98294b8 extends AbstractC98304b9 {
    public final long A00;
    public final List A01;
    public final List A02;

    public final C98294b8 A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C98294b8 c98294b8 = (C98294b8) list.get(i2);
            if (((AbstractC98304b9) c98294b8).A00 == i) {
                return c98294b8;
            }
        }
        return null;
    }

    public final C98314bA A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C98314bA c98314bA = (C98314bA) list.get(i2);
            if (((AbstractC98304b9) c98314bA).A00 == i) {
                return c98314bA;
            }
        }
        return null;
    }

    @Override // X.AbstractC98304b9
    public final String toString() {
        return AnonymousClass001.A11(AbstractC98304b9.A00(super.A00), AbstractC111324zv.A00(1387), Arrays.toString(this.A02.toArray()), AbstractC111324zv.A00(1386), Arrays.toString(this.A01.toArray()));
    }

    public C98294b8(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }
}
