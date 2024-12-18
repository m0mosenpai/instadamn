package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.Pzl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58672Pzl implements InterfaceC215913l {
    public static final java.util.Set A00;
    public static final java.util.Set A01;

    static {
        String[] strArr = AbstractC03340Dz.A02;
        HashSet A1H = AbstractC166987dD.A1H();
        boolean z = false;
        for (int i = 0; i < 44; i++) {
            String str = strArr[i];
            if (!"en".equals(str)) {
                A1H.add(str);
            } else {
                z = true;
            }
        }
        A00 = Collections.unmodifiableSet(A1H);
        HashSet A0k = AbstractC31171DnF.A0k(A1H);
        if (z) {
            A0k.add("en");
        }
        A01 = Collections.unmodifiableSet(A0k);
    }

    @Override // X.InterfaceC215913l
    public final java.util.Set AXW() {
        return A01;
    }
}
