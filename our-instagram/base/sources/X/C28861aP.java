package X;

import android.database.Cursor;

/* renamed from: X.1aP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28861aP extends AbstractC28901aT {
    public C28381Yz A00;
    public final AbstractC28801aI A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28861aP(C28381Yz c28381Yz, AbstractC28801aI abstractC28801aI, String str, String str2) {
        super(abstractC28801aI.version);
        C14360o3.A0B(c28381Yz, 1);
        this.A00 = c28381Yz;
        this.A01 = abstractC28801aI;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.AbstractC28901aT
    public final void A02(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
    }

    @Override // X.AbstractC28901aT
    public final void A03(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        Cursor E7O = interfaceC37481ol.E7O("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        boolean z = true;
        try {
            if (!E7O.moveToFirst() || E7O.getInt(0) == 0) {
                z = false;
            }
            E7O.close();
            if (z) {
                String str = null;
                E7O = interfaceC37481ol.E7N(new C37491om("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", null));
                if (E7O.moveToFirst()) {
                    str = E7O.getString(0);
                }
                E7O.close();
                String str2 = this.A02;
                if (!C14360o3.A0K(str2, str) && !C14360o3.A0K(this.A03, str)) {
                    throw new IllegalStateException(AnonymousClass001.A0u("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str2, ", found: ", str));
                }
            } else {
                A6Q onValidateSchema = this.A01.onValidateSchema(interfaceC37481ol);
                if (onValidateSchema.A01) {
                    A00(interfaceC37481ol);
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0R("Pre-packaged database has an invalid schema: ", onValidateSchema.A00));
                }
            }
            this.A01.onOpen(interfaceC37481ol);
            this.A00 = null;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // X.AbstractC28901aT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.InterfaceC37481ol r5) {
        /*
            r4 = this;
            r1 = 0
            X.C14360o3.A0B(r5, r1)
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r3 = r5.E7O(r0)
            r2 = 1
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L18
            int r0 = r3.getInt(r1)     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            r3.close()
            X.1aI r1 = r4.A01
            r1.createAllTables(r5)
            if (r2 != 0) goto L39
            X.A6Q r2 = r1.onValidateSchema(r5)
            boolean r0 = r2.A01
            if (r0 != 0) goto L39
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.String r0 = r2.A00
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L39:
            r4.A00(r5)
            r1.onCreate(r5)
            return
        L40:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L42
        L42:
            r0 = move-exception
            X.C20I.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28861aP.A04(X.1ol):void");
    }

    @Override // X.AbstractC28901aT
    public final void A05(InterfaceC37481ol interfaceC37481ol, int i, int i2) {
        C14360o3.A0B(interfaceC37481ol, 0);
        A06(interfaceC37481ol, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2 A[EDGE_INSN: B:54:0x00a2->B:58:0x00a2 BREAK  A[LOOP:1: B:22:0x0031->B:40:0x0069], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0sl] */
    @Override // X.AbstractC28901aT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.InterfaceC37481ol r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            X.1Yz r0 = r9.A00
            if (r0 == 0) goto La2
            X.1Yf r6 = r0.A01
            r8 = r11
            if (r11 != r12) goto L28
            X.0sl r5 = X.C16930sl.A00
        Lf:
            X.1aI r2 = r9.A01
            X.C3EP.A01(r10)
            java.util.Iterator r1 = r5.iterator()
        L18:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r1.next()
            X.1Ym r0 = (X.C1Ym) r0
            r0.migrate(r10)
            goto L18
        L28:
            r7 = 0
            if (r12 <= r11) goto L2c
            r7 = 1
        L2c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L31:
            r4 = r8
            if (r7 == 0) goto L85
            if (r8 >= r12) goto Lf
        L36:
            java.util.Map r1 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r1.get(r0)
            java.util.TreeMap r3 = (java.util.TreeMap) r3
            if (r3 == 0) goto La2
            if (r7 == 0) goto L80
            java.util.NavigableSet r0 = r3.descendingKeySet()
        L4a:
            java.util.Iterator r2 = r0.iterator()
        L4e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r7 == 0) goto L74
            int r0 = r4 + 1
            X.C14360o3.A05(r1)
            int r8 = r1.intValue()
            if (r0 > r8) goto L4e
            if (r8 > r12) goto L4e
        L69:
            java.lang.Object r0 = r3.get(r1)
            X.C14360o3.A0A(r0)
            r5.add(r0)
            goto L31
        L74:
            X.C14360o3.A05(r1)
            int r8 = r1.intValue()
            if (r12 > r8) goto L4e
            if (r8 >= r4) goto L4e
            goto L69
        L80:
            java.util.Set r0 = r3.keySet()
            goto L4a
        L85:
            if (r8 <= r12) goto Lf
            goto L36
        L88:
            X.A6Q r2 = r2.onValidateSchema(r10)
            boolean r0 = r2.A01
            if (r0 == 0) goto L94
            r9.A00(r10)
            return
        L94:
            java.lang.String r1 = "Migration didn't properly handle: "
            java.lang.String r0 = r2.A00
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        La2:
            X.1Yz r1 = r9.A00
            if (r1 == 0) goto Lc5
            if (r11 <= r12) goto Lb5
            boolean r0 = r1.A0B
            if (r0 == 0) goto Lb5
        Lac:
            X.1aI r0 = r9.A01
            r0.dropAllTables(r10)
            r0.createAllTables(r10)
            return
        Lb5:
            boolean r0 = r1.A0D
            if (r0 == 0) goto Lac
            java.util.Set r1 = r1.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lac
        Lc5:
            java.lang.String r2 = "A migration from "
            java.lang.String r1 = " to "
            java.lang.String r0 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r1 = X.AnonymousClass001.A0n(r2, r1, r0, r11, r12)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28861aP.A06(X.1ol, int, int):void");
    }

    private final void A00(InterfaceC37481ol interfaceC37481ol) {
        interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        interfaceC37481ol.ATG(AnonymousClass001.A0g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", this.A02, "')"));
    }
}
