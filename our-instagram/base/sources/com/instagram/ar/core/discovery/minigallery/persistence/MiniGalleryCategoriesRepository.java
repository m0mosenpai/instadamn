package com.instagram.ar.core.discovery.minigallery.persistence;

import X.AbstractC12290kX;
import X.AbstractC1823687a;
import X.AbstractC28241Yh;
import X.C13920nI;
import X.C14360o3;
import X.C1823987e;
import X.C1YZ;
import X.C1Yc;
import X.C1Ye;
import X.C87Z;
import android.content.Context;
import com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryDatabase;
import com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryDatabase_Impl;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class MiniGalleryCategoriesRepository {
    public final long A00;
    public final C1823987e A01;
    public final C13920nI A02;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[LOOP:0: B:11:0x003a->B:13:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.AnonymousClass859 r11, X.InterfaceC23621Ds r12, long r13) {
        /*
            r10 = this;
            r9 = 2
            boolean r0 = X.C206439Ca.A00(r12, r9)
            if (r0 == 0) goto L96
            r6 = r12
            X.9Ca r6 = (X.C206439Ca) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A03
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r8 = 1
            if (r0 == 0) goto L5f
            if (r0 != r8) goto L9d
            long r13 = r6.A01
            java.lang.Object r7 = r6.A02
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r7 = (com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository) r7
            X.AbstractC09560e7.A00(r1)
        L29:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L3a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r1 = r6.next()
            X.7nC r1 = (X.C172987nC) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.lang.String r4 = r1.A01
            java.lang.String r3 = r1.A02
            java.lang.String r0 = r1.A04
            X.859 r2 = X.AnonymousClass859.valueOf(r0)
            boolean r1 = r1.A05
            X.9CD r0 = new X.9CD
            r0.<init>(r2, r4, r3, r1)
            r5.add(r0)
            goto L3a
        L5f:
            X.AbstractC09560e7.A00(r1)
            X.87e r5 = r10.A01
            java.lang.String r4 = r11.name()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r13
            r6.A02 = r10
            r6.A01 = r13
            r6.A00 = r8
            java.lang.String r3 = "\n        SELECT * FROM mini_gallery_categories  \n        WHERE miniGallerySurface=? and syncedAt\n        AND syncedAt>=?\n  "
            java.util.TreeMap r0 = X.C37581ov.A08
            X.1ov r0 = X.AbstractC37591ow.A00(r3, r9)
            r0.ADp(r8, r4)
            r0.ADi(r9, r1)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.1YP r2 = r5.A01
            X.7mq r1 = new X.7mq
            r1.<init>()
            r0 = 0
            java.lang.Object r1 = X.C2Q9.A00(r3, r2, r1, r6, r0)
            if (r1 == r7) goto Lb2
            r7 = r10
            goto L29
        L96:
            X.9Ca r6 = new X.9Ca
            r6.<init>(r10, r12, r9)
            goto L15
        L9d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        La5:
            long r1 = r7.A00
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb3
            java.lang.Integer r0 = X.C05F.A0C
        Lad:
            X.7mr r7 = new X.7mr
            r7.<init>(r0, r5)
        Lb2:
            return r7
        Lb3:
            java.lang.Integer r0 = X.C05F.A01
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository.A00(X.859, X.1Ds, long):java.lang.Object");
    }

    public /* synthetic */ MiniGalleryCategoriesRepository(UserSession userSession) {
        C1823987e c1823987e;
        C87Z c87z = MiniGalleryDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(MiniGalleryDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c87z) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(MiniGalleryDatabase.class);
                if (igRoomDatabase == null) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    C1Ye A00 = C1Yc.A00(context, MiniGalleryDatabase.class, C1YZ.A00(userSession, c87z));
                    AbstractC28241Yh.A00(A00, 797293936, 2023115286, false);
                    A00.A03(AbstractC1823687a.A00);
                    A00.A05 = true;
                    A00.A03 = true;
                    igRoomDatabase = (IgRoomDatabase) A00.A00();
                    userSession.A04(MiniGalleryDatabase.class, igRoomDatabase);
                }
            }
        }
        MiniGalleryDatabase_Impl miniGalleryDatabase_Impl = (MiniGalleryDatabase_Impl) ((MiniGalleryDatabase) igRoomDatabase);
        if (miniGalleryDatabase_Impl.A00 != null) {
            c1823987e = miniGalleryDatabase_Impl.A00;
        } else {
            synchronized (miniGalleryDatabase_Impl) {
                if (miniGalleryDatabase_Impl.A00 == null) {
                    miniGalleryDatabase_Impl.A00 = new C1823987e(miniGalleryDatabase_Impl);
                }
                c1823987e = miniGalleryDatabase_Impl.A00;
            }
        }
        C13920nI c13920nI = C13920nI.A00;
        C14360o3.A0B(c1823987e, 2);
        C14360o3.A0B(c13920nI, 3);
        this.A01 = c1823987e;
        this.A02 = c13920nI;
        this.A00 = TimeUnit.DAYS.toMillis(90L);
    }
}
