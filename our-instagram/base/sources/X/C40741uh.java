package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40741uh extends C40781ul {
    public C74433Vz A00;
    public Integer A02;
    public Integer A04;
    public Integer A05;
    public String A06;
    public HashMap A07;
    public HashMap A08;
    public UUID A09;
    public EnumC37671p4 A01 = EnumC37671p4.A04;
    public Integer A03 = C05F.A0Y;
    public final Integer A0B = C05F.A00;
    public boolean A0A = false;

    public final Integer A00() {
        int i;
        Integer num = this.A02;
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        return Integer.valueOf(i);
    }

    public final Integer A01(int i) {
        int i2;
        Integer num = this.A04;
        if (num != null) {
            i2 = this.A01.A00(num.intValue(), i);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return Integer.valueOf(i2);
    }

    public final Integer A02(int i) {
        int i2;
        Integer num = this.A05;
        if (num != null) {
            i2 = this.A01.A00(num.intValue(), i);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return Integer.valueOf(i2);
    }

    public final HashMap A03(UserSession userSession) {
        if (this.A0A) {
            return this.A08;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A08.entrySet()) {
            Object key = entry.getKey();
            C37771pE c37771pE = (C37771pE) entry.getValue();
            if (!AbstractC37741pB.A07(userSession, c37771pE) || (c37771pE = AbstractC37741pB.A00(userSession, c37771pE)) != null) {
                hashMap.put(key, c37771pE);
            }
        }
        this.A08 = hashMap;
        this.A0A = true;
        return hashMap;
    }

    public final void A04(String str, int i, int i2) {
        if (this.A03 == C05F.A0C) {
            this.A02 = 2;
            this.A04 = Integer.valueOf(i + 1 + i2);
            this.A06 = str;
            this.A01 = EnumC37671p4.A04;
        }
    }
}
