package X;

import java.util.Comparator;

/* renamed from: X.M7a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50037M7a implements Comparator {
    public static final C50037M7a A00 = new C50037M7a();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C47Z c47z = (C47Z) obj;
        C47Z c47z2 = (C47Z) obj2;
        AbstractC167017dG.A1N(c47z, c47z2);
        long j = c47z.A0g;
        long j2 = c47z2.A0g;
        if (j > j2) {
            return -1;
        }
        return AbstractC25230BEn.A1Q((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
    }
}
