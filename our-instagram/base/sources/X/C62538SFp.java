package X;

import android.content.pm.PackageManager;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;

/* renamed from: X.SFp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62538SFp {
    public final PackageManager A00;
    public final ImmutableSet A01;
    public final ImmutableSetMultimap A02;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (((com.google.common.collect.ImmutableMultimap) r1).A01.isPartialView() == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C62538SFp(android.content.pm.PackageManager r3, X.InterfaceC917949d r4, java.util.Set r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A00 = r3
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r5)
            r2.A01 = r0
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L16
            com.google.common.collect.EmptyImmutableSetMultimap r1 = com.google.common.collect.EmptyImmutableSetMultimap.A00
        L13:
            r2.A02 = r1
            return
        L16:
            boolean r0 = r4 instanceof com.google.common.collect.ImmutableSetMultimap
            if (r0 == 0) goto L26
            r1 = r4
            com.google.common.collect.ImmutableSetMultimap r1 = (com.google.common.collect.ImmutableSetMultimap) r1
            com.google.common.collect.ImmutableMap r0 = r1.A01
            boolean r0 = r0.isPartialView()
            if (r0 != 0) goto L26
            goto L13
        L26:
            java.util.Map r0 = r4.ACe()
            java.util.Set r0 = r0.entrySet()
            com.google.common.collect.ImmutableSetMultimap r1 = com.google.common.collect.ImmutableSetMultimap.A00(r0)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62538SFp.<init>(android.content.pm.PackageManager, X.49d, java.util.Set):void");
    }
}
