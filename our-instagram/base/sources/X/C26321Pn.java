package X;

import java.security.SecureRandom;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.1Pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26321Pn {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final AbstractC26311Pm A04;
    public final java.util.Set A05;
    public final SecureRandom A06;

    public C26321Pn(AbstractC26311Pm abstractC26311Pm, SecureRandom secureRandom) {
        C14360o3.A0B(secureRandom, 2);
        this.A04 = abstractC26311Pm;
        this.A06 = secureRandom;
        this.A01 = Integer.MAX_VALUE;
        this.A05 = new LinkedHashSet();
        this.A02 = Integer.MAX_VALUE;
    }

    public static final boolean A00(C26321Pn c26321Pn, List list) {
        if (c26321Pn.A03 >= c26321Pn.A01) {
            list.add(EnumC39596He6.A05.toString());
            return true;
        }
        return false;
    }
}
