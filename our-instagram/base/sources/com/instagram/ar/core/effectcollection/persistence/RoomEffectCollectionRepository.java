package com.instagram.ar.core.effectcollection.persistence;

import X.AbstractC12290kX;
import X.AbstractC142276bn;
import X.AbstractC28241Yh;
import X.C13920nI;
import X.C142266bm;
import X.C142456c7;
import X.C14360o3;
import X.C1YZ;
import X.C1Yc;
import X.C1Ye;
import android.content.Context;
import com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionDatabase;
import com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionDatabase_Impl;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes3.dex */
public final class RoomEffectCollectionRepository {
    public final C142456c7 A00;
    public final C13920nI A01;

    public /* synthetic */ RoomEffectCollectionRepository(UserSession userSession) {
        C142456c7 c142456c7;
        C142266bm c142266bm = EffectCollectionDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(EffectCollectionDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c142266bm) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(EffectCollectionDatabase.class);
                if (igRoomDatabase == null) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    C1Ye A00 = C1Yc.A00(context, EffectCollectionDatabase.class, C1YZ.A00(userSession, c142266bm));
                    AbstractC28241Yh.A00(A00, 474693601, 141850174, false);
                    A00.A03(AbstractC142276bn.A08, AbstractC142276bn.A09, AbstractC142276bn.A0A, AbstractC142276bn.A0B, AbstractC142276bn.A0C, AbstractC142276bn.A0D, AbstractC142276bn.A0E, AbstractC142276bn.A0F, AbstractC142276bn.A0G, AbstractC142276bn.A00, AbstractC142276bn.A01, AbstractC142276bn.A02, AbstractC142276bn.A03, AbstractC142276bn.A04, AbstractC142276bn.A05, AbstractC142276bn.A06, AbstractC142276bn.A07);
                    A00.A05 = true;
                    A00.A03 = true;
                    igRoomDatabase = (IgRoomDatabase) A00.A00();
                    userSession.A04(EffectCollectionDatabase.class, igRoomDatabase);
                }
            }
        }
        EffectCollectionDatabase_Impl effectCollectionDatabase_Impl = (EffectCollectionDatabase_Impl) ((EffectCollectionDatabase) igRoomDatabase);
        if (effectCollectionDatabase_Impl.A00 != null) {
            c142456c7 = effectCollectionDatabase_Impl.A00;
        } else {
            synchronized (effectCollectionDatabase_Impl) {
                if (effectCollectionDatabase_Impl.A00 == null) {
                    effectCollectionDatabase_Impl.A00 = new C142456c7(effectCollectionDatabase_Impl);
                }
                c142456c7 = effectCollectionDatabase_Impl.A00;
            }
        }
        C13920nI c13920nI = C13920nI.A00;
        C14360o3.A0B(c142456c7, 2);
        C14360o3.A0B(c13920nI, 3);
        this.A00 = c142456c7;
        this.A01 = c13920nI;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(3:18|19|(1:21))|14|15|16))|24|6|7|(0)(0)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        X.C0w9.A05("RoomEffectCollectionRepository", "exception when inserting effect into collection", 1, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C191258dU r10, com.instagram.camera.effect.models.CameraAREffect r11, X.InterfaceC23621Ds r12) {
        /*
            r9 = this;
            r3 = 14
            boolean r0 = X.MAR.A03(r12, r3)
            if (r0 == 0) goto L22
            r7 = r12
            X.MAR r7 = (X.MAR) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A01
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L36
            if (r0 != r6) goto L2e
            goto L2a
        L22:
            r0 = 42
            X.MAR r7 = new X.MAR
            r7.<init>(r9, r12, r3, r0)
            goto L16
        L2a:
            X.AbstractC09560e7.A00(r1)     // Catch: android.database.sqlite.SQLiteException -> L59
            goto L61
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r1)
            long r1 = java.lang.System.currentTimeMillis()
            X.6c7 r5 = r9.A00     // Catch: android.database.sqlite.SQLiteException -> L59
            X.7nE r4 = X.AbstractC173127nQ.A00(r11, r1)     // Catch: android.database.sqlite.SQLiteException -> L59
            r3 = 0
            r0 = 0
            X.7n7 r2 = X.AbstractC173127nQ.A01(r10, r3, r1, r0)     // Catch: android.database.sqlite.SQLiteException -> L59
            r7.A00 = r6     // Catch: android.database.sqlite.SQLiteException -> L59
            X.1YP r1 = r5.A07     // Catch: android.database.sqlite.SQLiteException -> L59
            X.M9E r0 = new X.M9E     // Catch: android.database.sqlite.SQLiteException -> L59
            r0.<init>()     // Catch: android.database.sqlite.SQLiteException -> L59
            java.lang.Object r0 = X.C4HQ.A00(r1, r7, r0)     // Catch: android.database.sqlite.SQLiteException -> L59
            if (r0 != r8) goto L61
            return r8
        L59:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting effect into collection"
            X.C0w9.A05(r1, r0, r6, r2)
        L61:
            X.0eB r8 = X.C0eB.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A00(X.8dU, com.instagram.camera.effect.models.CameraAREffect, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C191258dU r12, java.lang.Integer r13, X.InterfaceC23621Ds r14, long r15) {
        /*
            r11 = this;
            r4 = 10
            boolean r0 = X.C9CW.A00(r14, r4)
            if (r0 == 0) goto L56
            r2 = r14
            X.9CW r2 = (X.C9CW) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L56
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r1 = r2.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 != r5) goto L60
            X.AbstractC09560e7.A00(r1)
        L24:
            X.7nP r1 = (X.C173117nP) r1
            if (r1 == 0) goto L5e
            X.7nk r4 = X.AbstractC173127nQ.A03(r1)
            return r4
        L2d:
            X.AbstractC09560e7.A00(r1)
            X.6c7 r6 = r11.A00
            java.lang.String r3 = r12.A02
            java.lang.String r1 = r12.A01
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            r0 = 95
            java.lang.String r8 = X.AnonymousClass001.A0T(r3, r1, r0)
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r15
            r2.A00 = r5
            X.1YP r0 = r6.A07
            X.7n5 r5 = new X.7n5
            r7 = r13
            r5.<init>(r6, r7, r8, r9)
            java.lang.Object r1 = X.C4HQ.A00(r0, r2, r5)
            if (r1 != r4) goto L24
            return r4
        L56:
            r0 = 42
            X.9CW r2 = new X.9CW
            r2.<init>(r11, r14, r4, r0)
            goto L16
        L5e:
            r4 = 0
            return r4
        L60:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A01(X.8dU, java.lang.Integer, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (r2 == r6) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.1JX] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C191258dU r12, java.util.List r13, X.InterfaceC23621Ds r14, long r15) {
        /*
            r11 = this;
            r5 = 10
            boolean r0 = X.C9CY.A00(r14, r5)
            if (r0 == 0) goto Ld1
            r4 = r14
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld1
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A02
            X.1JX r6 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L51
            if (r1 != r0) goto Ld8
            java.lang.Object r12 = r4.A01
            X.8dU r12 = (X.C191258dU) r12
            X.AbstractC09560e7.A00(r2)
        L28:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r0 = X.AbstractC06950Ym.A1E(r2, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld0
            java.lang.Object r1 = r2.next()
            X.7nE r1 = (X.C173007nE) r1
            if (r12 == 0) goto L4f
            java.lang.String r0 = r12.A01
        L47:
            com.instagram.camera.effect.models.CameraAREffect r0 = X.AbstractC173127nQ.A02(r1, r0)
            r6.add(r0)
            goto L37
        L4f:
            r0 = 0
            goto L47
        L51:
            X.AbstractC09560e7.A00(r2)
            X.6c7 r7 = r11.A00
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r15
            r4.A01 = r12
            r4.A00 = r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "\n"
            r3.append(r9)
            java.lang.String r0 = "    SELECT * FROM effects "
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "    WHERE effectId IN("
            r3.append(r0)
            int r8 = r13.size()
            X.AbstractC73723Sa.A00(r3, r8)
            java.lang.String r0 = ")"
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "    AND syncedAt>="
            r3.append(r0)
            java.lang.String r0 = "?"
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "  "
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            int r10 = r8 + 1
            java.util.TreeMap r0 = X.C37581ov.A08
            X.1ov r9 = X.AbstractC37591ow.A00(r3, r10)
            java.util.Iterator r8 = r13.iterator()
            r3 = 1
        La8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r9.ADp(r3, r0)
            int r3 = r3 + 1
            goto La8
        Lba:
            r9.ADi(r10, r1)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.1YP r2 = r7.A07
            X.9Mc r1 = new X.9Mc
            r1.<init>()
            r0 = 0
            java.lang.Object r2 = X.C2Q9.A00(r3, r2, r1, r4, r0)
            if (r2 != r6) goto L28
        Ld0:
            return r6
        Ld1:
            X.9CY r4 = new X.9CY
            r4.<init>(r11, r14, r5)
            goto L16
        Ld8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A02(X.8dU, java.util.List, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(8:20|21|(2:24|22)|25|26|(1:28)|29|(1:31))|14|(2:16|17)|19))|34|6|7|(0)(0)|14|(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        X.C0w9.A05("RoomEffectCollectionRepository", "exception when inserting collection", 1, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[Catch: SQLiteException -> 0x009c, TryCatch #0 {SQLiteException -> 0x009c, blocks: (B:13:0x0090, B:14:0x0093, B:16:0x0097, B:21:0x0036, B:22:0x0063, B:24:0x0069, B:26:0x0077, B:29:0x0080), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.C173327nk r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            r12 = this;
            r3 = 8
            boolean r0 = X.C9CW.A00(r14, r3)
            if (r0 == 0) goto L23
            r6 = r14
            X.9CW r6 = (X.C9CW) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r0 = r6.A01
            X.1JX r7 = X.C1JX.A02
            int r1 = r6.A00
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L33
            if (r1 != r5) goto L2b
            goto L90
        L23:
            r0 = 42
            X.9CW r6 = new X.9CW
            r6.<init>(r12, r14, r3, r0)
            goto L16
        L2b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L33:
            X.AbstractC09560e7.A00(r0)
            X.6c7 r8 = r12.A00     // Catch: android.database.sqlite.SQLiteException -> L9c
            long r0 = java.lang.System.currentTimeMillis()     // Catch: android.database.sqlite.SQLiteException -> L9c
            r2 = 0
            X.C14360o3.A0B(r13, r2)     // Catch: android.database.sqlite.SQLiteException -> L9c
            java.lang.Object r11 = r13.A00     // Catch: android.database.sqlite.SQLiteException -> L9c
            X.9Bj r11 = (X.C206269Bj) r11     // Catch: android.database.sqlite.SQLiteException -> L9c
            java.lang.Object r9 = r11.A01     // Catch: android.database.sqlite.SQLiteException -> L9c
            X.8dU r9 = (X.C191258dU) r9     // Catch: android.database.sqlite.SQLiteException -> L9c
            java.lang.String r4 = r13.A01     // Catch: android.database.sqlite.SQLiteException -> L9c
            boolean r2 = r13.A02     // Catch: android.database.sqlite.SQLiteException -> L9c
            X.7n7 r10 = X.AbstractC173127nQ.A01(r9, r4, r0, r2)     // Catch: android.database.sqlite.SQLiteException -> L9c
            java.lang.Object r4 = r11.A02     // Catch: android.database.sqlite.SQLiteException -> L9c
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L9c
            r2 = 10
            int r2 = X.AbstractC06950Ym.A1E(r4, r2)     // Catch: android.database.sqlite.SQLiteException -> L9c
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L9c
            r9.<init>(r2)     // Catch: android.database.sqlite.SQLiteException -> L9c
            java.util.Iterator r4 = r4.iterator()     // Catch: android.database.sqlite.SQLiteException -> L9c
        L63:
            boolean r2 = r4.hasNext()     // Catch: android.database.sqlite.SQLiteException -> L9c
            if (r2 == 0) goto L77
            java.lang.Object r2 = r4.next()     // Catch: android.database.sqlite.SQLiteException -> L9c
            com.instagram.camera.effect.models.CameraAREffect r2 = (com.instagram.camera.effect.models.CameraAREffect) r2     // Catch: android.database.sqlite.SQLiteException -> L9c
            X.7nE r2 = X.AbstractC173127nQ.A00(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> L9c
            r9.add(r2)     // Catch: android.database.sqlite.SQLiteException -> L9c
            goto L63
        L77:
            X.7nP r4 = new X.7nP     // Catch: android.database.sqlite.SQLiteException -> L9c
            r4.<init>(r10, r9)     // Catch: android.database.sqlite.SQLiteException -> L9c
            r2 = 0
            if (r15 == 0) goto L80
            r2 = 1
        L80:
            r6.A00 = r5     // Catch: android.database.sqlite.SQLiteException -> L9c
            X.1YP r1 = r8.A07     // Catch: android.database.sqlite.SQLiteException -> L9c
            X.7pK r0 = new X.7pK     // Catch: android.database.sqlite.SQLiteException -> L9c
            r0.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9c
            java.lang.Object r0 = X.C4HQ.A00(r1, r6, r0)     // Catch: android.database.sqlite.SQLiteException -> L9c
            if (r0 != r7) goto L93
            return r7
        L90:
            X.AbstractC09560e7.A00(r0)     // Catch: android.database.sqlite.SQLiteException -> L9c
        L93:
            X.7nP r0 = (X.C173117nP) r0     // Catch: android.database.sqlite.SQLiteException -> L9c
            if (r0 == 0) goto La4
            X.7nk r3 = X.AbstractC173127nQ.A03(r0)     // Catch: android.database.sqlite.SQLiteException -> L9c
            return r3
        L9c:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting collection"
            X.C0w9.A05(r1, r0, r5, r2)
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A03(X.7nk, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:13)(2:10|11))(6:16|17|(2:20|18)|21|22|(1:24))|14|15))|27|6|7|(0)(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        X.C0w9.A05("RoomEffectCollectionRepository", "exception when inserting effects", 1, r2);
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.util.List r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 9
            boolean r0 = X.C9CW.A00(r11, r3)
            if (r0 == 0) goto L22
            r7 = r11
            X.9CW r7 = (X.C9CW) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L36
            if (r0 != r5) goto L2e
            goto L2a
        L22:
            r0 = 42
            X.9CW r7 = new X.9CW
            r7.<init>(r9, r11, r3, r0)
            goto L16
        L2a:
            X.AbstractC09560e7.A00(r1)     // Catch: android.database.sqlite.SQLiteException -> L72
            goto L7b
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r1)
            X.6c7 r8 = r9.A00     // Catch: android.database.sqlite.SQLiteException -> L72
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r10, r0)     // Catch: android.database.sqlite.SQLiteException -> L72
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L72
            r4.<init>(r0)     // Catch: android.database.sqlite.SQLiteException -> L72
            java.util.Iterator r3 = r10.iterator()     // Catch: android.database.sqlite.SQLiteException -> L72
        L4a:
            boolean r0 = r3.hasNext()     // Catch: android.database.sqlite.SQLiteException -> L72
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()     // Catch: android.database.sqlite.SQLiteException -> L72
            com.instagram.camera.effect.models.CameraAREffect r2 = (com.instagram.camera.effect.models.CameraAREffect) r2     // Catch: android.database.sqlite.SQLiteException -> L72
            long r0 = java.lang.System.currentTimeMillis()     // Catch: android.database.sqlite.SQLiteException -> L72
            X.7nE r0 = X.AbstractC173127nQ.A00(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> L72
            r4.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L72
            goto L4a
        L62:
            r7.A00 = r5     // Catch: android.database.sqlite.SQLiteException -> L72
            X.1YP r1 = r8.A07     // Catch: android.database.sqlite.SQLiteException -> L72
            X.7pO r0 = new X.7pO     // Catch: android.database.sqlite.SQLiteException -> L72
            r0.<init>(r8, r4)     // Catch: android.database.sqlite.SQLiteException -> L72
            java.lang.Object r0 = X.C2Q9.A01(r1, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> L72
            if (r0 != r6) goto L7b
            return r6
        L72:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting effects"
            X.C0w9.A05(r1, r0, r5, r2)
            r5 = 0
        L7b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A04(java.util.List, X.1Ds):java.lang.Object");
    }
}
