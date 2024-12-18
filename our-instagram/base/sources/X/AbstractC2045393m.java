package X;

import java.util.HashSet;

/* renamed from: X.93m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2045393m {
    public static final HashSet A00(boolean z, boolean z2) {
        EnumC2045493n enumC2045493n;
        EnumC2045493n enumC2045493n2;
        HashSet hashSet = new HashSet();
        hashSet.add(EnumC2045493n.A0C);
        hashSet.add(EnumC2045493n.A0E);
        if (z) {
            enumC2045493n = EnumC2045493n.A09;
        } else {
            enumC2045493n = EnumC2045493n.A0B;
        }
        hashSet.add(enumC2045493n);
        if (z2) {
            enumC2045493n2 = EnumC2045493n.A0A;
        } else {
            enumC2045493n2 = EnumC2045493n.A0D;
        }
        hashSet.add(enumC2045493n2);
        return hashSet;
    }
}
