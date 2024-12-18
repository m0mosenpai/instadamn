package X;

import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class BKG {
    public final java.util.Set A00;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (X.C14360o3.A0K(r1, "friend_su_in_reels") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(X.C120985dq r6) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            boolean r0 = r6.A0H()
            if (r0 == 0) goto L2a
            X.Gz2 r3 = r6.A02()
            r1 = 0
            if (r3 == 0) goto L28
            java.lang.String r2 = r3.A0B
        L13:
            java.lang.String r0 = "creators_in_reels"
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto L27
            if (r3 == 0) goto L1f
            java.lang.String r1 = r3.A0B
        L1f:
            java.lang.String r0 = "friend_su_in_reels"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
        L27:
            return r4
        L28:
            r2 = r1
            goto L13
        L2a:
            X.5t1 r1 = r6.A01
            X.5t1 r0 = X.EnumC129395t1.A0K
            if (r1 == r0) goto L27
            X.5t1 r0 = X.EnumC129395t1.A07
            if (r1 == r0) goto L27
            X.5t1 r0 = X.EnumC129395t1.A06
            if (r1 == r0) goto L27
            java.util.Set r0 = r5.A00
            boolean r4 = r0.contains(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKG.A00(X.5dq):boolean");
    }

    public BKG() {
        EnumC129395t1[] enumC129395t1Arr = {EnumC129395t1.A0G, EnumC129395t1.A08, EnumC129395t1.A09, EnumC129395t1.A0J, EnumC129395t1.A0I, EnumC129395t1.A0H, EnumC129395t1.A0B, EnumC129395t1.A0C, EnumC129395t1.A0F, EnumC129395t1.A05, EnumC129395t1.A02, EnumC129395t1.A03, EnumC129395t1.A0A, EnumC129395t1.A0M, EnumC129395t1.A04};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            EnumC129395t1 enumC129395t1 = enumC129395t1Arr[i];
            if (enumC129395t1 != null) {
                linkedHashSet.add(enumC129395t1);
            }
            i++;
        } while (i < 15);
        this.A00 = linkedHashSet;
    }
}
