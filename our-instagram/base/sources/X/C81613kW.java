package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3kW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81613kW {
    public static final long A07;
    public static final C81613kW A08 = new C81613kW();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C81623kX A04 = new Object();
    public boolean A05;
    public Long A06;

    public final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession) != 0;
    }

    static {
        EnumC81633kY[] values = EnumC81633kY.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC81633kY enumC81633kY : values) {
            arrayList.add(Long.valueOf(enumC81633kY.A00));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) it.next()).longValue() | ((Number) next).longValue());
            }
            A07 = ((Number) next).longValue();
            return;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final long A00(UserSession userSession) {
        Long l = this.A06;
        if (l == null) {
            int i = this.A01;
            long j = this.A03;
            boolean z = this.A05;
            if (i == 0 && z && C18U.A06(C06090Tz.A06, userSession, 36330166284206815L)) {
                j |= 1;
            }
            l = Long.valueOf(j);
            this.A06 = l;
            if (l == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return l.longValue();
    }

    public final boolean A01() {
        if (this.A01 == 0 && (this.A04.A00 & 42) != 42) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        int i = this.A01;
        if ((i & 4) != 4 && (i & 8) != 8) {
            return false;
        }
        return true;
    }
}
