package X;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.2Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50782Uz extends C2V0 {
    @Override // X.AbstractC50712Us
    public final int A06(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // X.AbstractC50712Us
    public final long A08(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // X.AbstractC50712Us
    public final long A09(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // X.C2V0
    public final Random A0C() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C14360o3.A07(current);
        return current;
    }
}
