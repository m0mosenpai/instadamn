package X;

import android.util.SparseArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.8qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198928qs {
    public int A00;
    public boolean A01 = true;
    public final SparseArray A02;
    public final C198938qt A03;
    public final List A04;
    public final Map A05;

    public static void A01(SparseArray sparseArray, SparseArray sparseArray2) {
        for (int i = 0; i < sparseArray2.size(); i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if ((r12 instanceof X.BE6) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r19, com.instagram.common.session.UserSession r20, X.C55U r21, X.C1816783z r22, X.C198928qs r23, X.C191038cz r24, com.instagram.music.common.model.MusicOverlayStickerModel r25, java.lang.String r26, int r27, int r28) {
        /*
            r0 = r24
            X.5NL r9 = r0.A02
            boolean r0 = r9 instanceof X.C8GD
            if (r0 == 0) goto L2a
            r5 = r25
            if (r25 == 0) goto L2a
            X.8GD r9 = (X.C8GD) r9
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            boolean r0 = r9 instanceof X.C24024AlG
            if (r0 == 0) goto La0
            X.AlG r9 = (X.C24024AlG) r9
            X.6Pl r2 = r9.A03
            int r1 = r9.A00
            X.Al0 r0 = r9.A02
            X.AlG r3 = new X.AlG
            r3.<init>(r5, r0, r2, r1)
            boolean r0 = r9.A04
            r3.A04 = r0
        L27:
            X.5NL r3 = (X.C5NL) r3
            r9 = r3
        L2a:
            if (r9 == 0) goto L9f
            r13 = 0
            r5 = r19
            X.C14360o3.A0B(r5, r13)
            r0 = 3
            r6 = r20
            X.C14360o3.A0B(r6, r0)
            r8 = 0
            r7 = r21
            r12 = r26
            r10 = r8
            r11 = r8
            android.graphics.drawable.Drawable r12 = X.AMH.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r20 = 1
            java.lang.String r19 = "TextOverlayController"
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r9
            r18 = r8
            r21 = r20
            X.8FC r2 = X.AMH.A03(r14, r15, r16, r17, r18, r19, r20, r21)
            X.8D0 r1 = r2.A06
            r1.getClass()
            java.util.List r0 = java.util.Collections.emptyList()
            r4 = r27
            r3 = r28
            r1.A02(r12, r0, r4, r3)
            r1 = r23
            int r0 = r1.A00
            int r14 = r0 + 1
            r1.A00 = r14
            boolean r15 = X.C138436Oz.A0A(r12)
            boolean r0 = r22.A0A()
            if (r0 == 0) goto L7d
            boolean r0 = r12 instanceof X.BE6
            r16 = 1
            if (r0 != 0) goto L7f
        L7d:
            r16 = 0
        L7f:
            X.C14360o3.A0B(r12, r13)
            X.9LJ r10 = new X.9LJ
            r11 = r5
            r13 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.AHh.A00(r2, r10)
            java.util.List r0 = r1.A04
            r0.getClass()
            r0.add(r10)
            android.util.SparseArray r2 = r1.A02
            int r1 = r10.A0f
            X.5NG r0 = r9.BlQ()
            r2.put(r1, r0)
        L9f:
            return
        La0:
            boolean r0 = r9 instanceof X.C24025AlH
            if (r0 == 0) goto Lc4
            X.AlH r9 = (X.C24025AlH) r9
            X.6Pl r7 = r9.BVp()
            X.Gom r4 = r9.A01
            if (r4 == 0) goto Lba
            int r0 = r9.A00
            X.Al0 r6 = r9.A03
            X.AlH r3 = new X.AlH
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L27
        Lba:
            java.lang.String r0 = "musicAssetLyrics"
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        Lc4:
            java.lang.String r0 = "Not a music sticker model"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198928qs.A00(android.content.Context, com.instagram.common.session.UserSession, X.55U, X.83z, X.8qs, X.8cz, com.instagram.music.common.model.MusicOverlayStickerModel, java.lang.String, int, int):void");
    }

    public static void A02(C198928qs c198928qs, C198928qs c198928qs2) {
        List list = c198928qs2.A04;
        if (!AnonymousClass483.A04(list)) {
            List list2 = c198928qs.A04;
            list2.getClass();
            list2.addAll(list);
        }
        A01(c198928qs.A02, c198928qs2.A02);
        Map map = c198928qs2.A05;
        if (map != null) {
            Map map2 = c198928qs.A05;
            map2.getClass();
            map2.putAll(map);
        }
        c198928qs.A00 = c198928qs2.A00;
    }

    public C198928qs(SparseArray sparseArray, C198938qt c198938qt, List list, Map map, int i) {
        this.A04 = list;
        this.A02 = sparseArray;
        this.A05 = map;
        this.A00 = i;
        this.A03 = c198938qt;
    }
}
