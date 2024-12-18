package X;

import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85773s6 {
    public static final AtomicInteger A07 = new AtomicInteger();
    public C1ON A00;
    public C24531Hw A01;
    public C3G5 A02;
    public final int A03 = A07.incrementAndGet();
    public final String A04;
    public final Collection A05;
    public final UUID A06;

    public C85773s6(C3G5 c3g5, String str, Collection collection) {
        UUID randomUUID = UUID.randomUUID();
        C14360o3.A07(randomUUID);
        this.A06 = randomUUID;
        this.A04 = str;
        this.A05 = Collections.unmodifiableCollection(collection);
        this.A02 = c3g5;
    }

    public C85773s6() {
        UUID randomUUID = UUID.randomUUID();
        C14360o3.A07(randomUUID);
        this.A06 = randomUUID;
        this.A04 = "";
        this.A05 = C16930sl.A00;
    }
}
