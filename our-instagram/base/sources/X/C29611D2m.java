package X;

import java.util.Comparator;

/* renamed from: X.D2m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29611D2m implements Comparator {
    public static final C29611D2m A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C58Z c58z = (C58Z) obj;
        C58Z c58z2 = (C58Z) obj2;
        boolean A03 = BJZ.A03(c58z);
        int i = 0;
        boolean A032 = BJZ.A03(c58z2);
        if (A03) {
            if (!A032) {
                return -1;
            }
            AnonymousClass599 A02 = AbstractC114335Dx.A02(c58z);
            AnonymousClass599 A022 = AbstractC114335Dx.A02(c58z2);
            if (!C14360o3.A0K(A02, A022)) {
                C57S c57s = new C57S(new AnonymousClass599[16]);
                while (A02 != null) {
                    c57s.A04(0, A02);
                    A02 = A02.A0B();
                }
                C57S c57s2 = new C57S(new AnonymousClass599[16]);
                while (A022 != null) {
                    c57s2.A04(0, A022);
                    A022 = A022.A0B();
                }
                int min = Math.min(c57s.A00 - 1, c57s2.A00 - 1);
                if (min >= 0) {
                    while (C14360o3.A0K(c57s.A02[i], c57s2.A02[i])) {
                        if (i != min) {
                            i++;
                        }
                    }
                    return C14360o3.A00(((AnonymousClass599) c57s.A02[i]).A0U.A0J.A03, ((AnonymousClass599) c57s2.A02[i]).A0U.A0J.A03);
                }
                throw AbstractC166987dD.A14("Could not find a common ancestor between the two FocusModifiers.");
            }
            return 0;
        }
        if (A032) {
            return 1;
        }
        return 0;
    }
}
