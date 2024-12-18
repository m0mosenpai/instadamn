package androidx.datastore.migrations;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.C14360o3;
import X.C57258Pbg;
import X.InterfaceC09390do;
import X.InterfaceC16610sE;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC50413MNp;
import X.JQL;
import android.content.Context;
import java.util.Set;

/* loaded from: classes8.dex */
public final class SharedPreferencesMigration implements InterfaceC50413MNp {
    public final Context A00;
    public final String A01;
    public final Set A02;
    public final InterfaceC09390do A03;
    public final InterfaceC16620sF A04;
    public final InterfaceC16610sE A05;

    public SharedPreferencesMigration(Context context, String str, Set set, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE) {
        Set A0j;
        C14360o3.A0B(set, 3);
        C57258Pbg c57258Pbg = new C57258Pbg(str, context, 0);
        this.A04 = interfaceC16620sF;
        this.A05 = interfaceC16610sE;
        this.A00 = context;
        this.A01 = str;
        this.A03 = AbstractC09440dt.A01(c57258Pbg);
        if (set == JQL.A00) {
            A0j = null;
        } else {
            A0j = AbstractC001800i.A0j(set);
        }
        this.A02 = A0j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC50413MNp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Eiz(java.lang.Object r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 12
            boolean r0 = X.MAN.A02(r8, r3)
            if (r0 == 0) goto L80
            r5 = r8
            X.MAN r5 = (X.MAN) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L6f
            if (r0 != r3) goto L86
            java.lang.Object r2 = r5.A01
            androidx.datastore.migrations.SharedPreferencesMigration r2 = (androidx.datastore.migrations.SharedPreferencesMigration) r2
            X.AbstractC09560e7.A00(r4)
        L28:
            boolean r0 = X.AbstractC166987dD.A1a(r4)
            if (r0 == 0) goto L56
            java.util.Set r1 = r2.A02
            X.0do r0 = r2.A03
            java.lang.Object r2 = r0.getValue()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            if (r1 != 0) goto L4c
            java.util.Map r0 = r2.getAll()
            X.C14360o3.A07(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L56
        L47:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        L4b:
            return r1
        L4c:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L58
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L58
        L56:
            r3 = 0
            goto L47
        L58:
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L5c
            goto L47
        L6f:
            X.AbstractC09560e7.A00(r4)
            X.0sF r0 = r6.A04
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r4 = r0.invoke(r7, r5)
            if (r4 == r1) goto L4b
            r2 = r6
            goto L28
        L80:
            X.MAN r5 = new X.MAN
            r5.<init>(r6, r8, r3)
            goto L16
        L86:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.Eiz(java.lang.Object, X.1Ds):java.lang.Object");
    }

    public SharedPreferencesMigration(Set set, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE) {
        Set A0j;
        this.A04 = interfaceC16620sF;
        this.A05 = interfaceC16610sE;
        this.A00 = null;
        this.A01 = null;
        this.A03 = AbstractC09440dt.A01(interfaceC16820sZ);
        if (set == JQL.A00) {
            A0j = null;
        } else {
            A0j = AbstractC001800i.A0j(set);
        }
        this.A02 = A0j;
    }
}
