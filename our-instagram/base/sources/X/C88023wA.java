package X;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3wA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88023wA extends C88033wB {
    public static C88023wA A0F;
    public int A01;
    public long A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Thread A09;
    public List A0A;
    public final C100344ew A0D;
    public final short[] A0E;
    public int A02 = 0;
    public int A00 = 0;
    public long A04 = -1;
    public long A03 = -1;
    public boolean A0C = false;
    public boolean A0B = false;

    public C88023wA(C100344ew c100344ew) {
        Integer num = C05F.A00;
        this.A06 = num;
        this.A07 = num;
        this.A01 = 0;
        this.A0E = new short[3];
        this.A08 = num;
        this.A0D = c100344ew;
    }

    public final String A07() {
        if (super.A0A) {
            return "nativePollOnce";
        }
        Class cls = super.A07;
        if (cls != null) {
            return cls.getName();
        }
        Class cls2 = super.A09;
        if (cls2 != null) {
            String A0b = AnonymousClass001.A0b(cls2.getName(), "/", super.A00);
            Class cls3 = super.A08;
            if (cls3 == null) {
                return A0b;
            }
            return AnonymousClass001.A0g(A0b, "/", cls3.getName());
        }
        return "unknown";
    }

    public final void A08() {
        int i = this.A01 - 1;
        this.A01 = i;
        if (i <= 0) {
            A03();
            this.A04 = -1L;
            this.A03 = -1L;
            this.A00 = 0;
            this.A02 = 0;
            this.A01 = 0;
            this.A05 = -1L;
            this.A09 = null;
            this.A0B = false;
            this.A0C = false;
            Integer num = C05F.A00;
            this.A06 = num;
            this.A07 = num;
            List list = this.A0A;
            if (list != null) {
                list.clear();
            }
            this.A08 = num;
            C100344ew c100344ew = this.A0D;
            if (c100344ew != null) {
                AtomicInteger atomicInteger = c100344ew.A02;
                if (atomicInteger.get() < C100344ew.A03) {
                    LinkedList linkedList = c100344ew.A01;
                    synchronized (linkedList) {
                        linkedList.addLast(this);
                        atomicInteger.set(linkedList.size());
                    }
                }
            }
        }
    }

    public final void A09(Integer num) {
        Integer num2;
        Integer num3;
        Integer num4 = C05F.A0N;
        if (num != num4 && num != (num2 = C05F.A0C) && num != (num3 = C05F.A0Y)) {
            Integer num5 = this.A08;
            if (num5 == num4 || num5 == num2 || num5 == num3) {
                A08();
            }
        } else if (this.A08 == C05F.A00) {
            this.A01++;
        }
        this.A08 = num;
    }

    public C88023wA() {
        Integer num = C05F.A00;
        this.A06 = num;
        this.A07 = num;
        this.A01 = 0;
        this.A0E = new short[3];
        this.A08 = num;
        this.A0D = null;
    }
}
