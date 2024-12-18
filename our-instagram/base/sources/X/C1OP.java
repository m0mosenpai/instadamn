package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1OP, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1OP {
    public static final AtomicInteger A09 = new AtomicInteger();
    public C1OL A00;
    public final int A01 = A09.incrementAndGet();
    public final long A02 = System.currentTimeMillis();
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final boolean A00() {
        int intValue = this.A04.intValue();
        if (intValue == 5 || intValue == 4 || intValue == 11 || intValue == 3) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A06.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0l("Request{mReason=", AbstractC25631Mt.A00(this.A04), ", mInstanceNumber=", '}', this.A01);
    }

    public C1OP(Integer num, Integer num2, Integer num3, String str, String str2, List list) {
        this.A06 = str;
        this.A07 = str2;
        this.A03 = num;
        this.A04 = num2;
        this.A05 = num3;
        this.A08 = list;
    }
}
