package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Tyk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66047Tyk {
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00a4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00a4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00b4, code lost:
    
        if (r1 != 59) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0192, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0254, code lost:
    
        throw new java.io.IOException(X.AnonymousClass001.A0S("Unknown block header [", java.lang.Integer.toHexString(r1), ']'));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ("image/gif".equals(X.AbstractC50672MYq.A00(r6.getPath(), "video/mp4", false)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A02(X.InterfaceC58019Po5 r14, X.C1125756l r15) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66047Tyk.A02(X.Po5, X.56l):long");
    }

    public static boolean A03(MYB myb, MediaComposition mediaComposition, int[] iArr) {
        if (myb != null) {
            int i = iArr[0];
            if (mediaComposition == null) {
                if (myb.A02 == i) {
                    return true;
                }
            } else {
                HashMap hashMap = myb.A0J;
                if (hashMap != null) {
                    EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
                    if (hashMap.get(enumC1125356h) != null) {
                        Iterator A0k = AbstractC167007dF.A0k((AbstractMap) hashMap.get(enumC1125356h));
                        while (A0k.hasNext()) {
                            Iterator A1J = AbstractC25226BEj.A1J(A0k.next());
                            while (A1J.hasNext()) {
                                if (((MYB) A1J.next()).A02 != i) {
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean A04(EnumC1125356h enumC1125356h, MediaComposition mediaComposition) {
        if (mediaComposition != null) {
            Iterator A14 = AbstractC166997dE.A14(mediaComposition.A06(enumC1125356h));
            while (A14.hasNext()) {
                Iterator A1J = AbstractC25226BEj.A1J(AbstractC31176DnK.A0j(A14));
                while (A1J.hasNext()) {
                    if (((C69688VtY) A1J.next()).A01.CSs()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r7.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A01(X.InterfaceC58019Po5 r18, X.C1125956n r19) {
        /*
            r2 = r19
            java.util.List r0 = r2.A07
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.List r0 = r2.A06
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L1d
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L1e
        L1d:
            r1 = 1
        L1e:
            java.lang.String r0 = "only timelinespeed or pts mutator may be populated."
            X.AbstractC1126356r.A07(r1, r0)
            java.util.List r1 = r2.A04
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r2 = r0.iterator()
            r16 = 0
            r14 = 0
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r2.next()
            X.56l r0 = (X.C1125756l) r0
            r1 = r18
            long r0 = A02(r1, r0)
            long r14 = r14 + r0
            goto L32
        L46:
            java.util.Iterator r13 = r8.iterator()
            r11 = 0
            r9 = 0
        L4e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r2 = r13.next()
            X.5JJ r2 = (X.C5JJ) r2
            X.56i r1 = r2.A01
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r5 = r1.A03(r0)
            long r3 = r1.A02(r0)
            float r2 = r2.A00
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 >= 0) goto L6e
            r5 = 0
        L6e:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L73
            r3 = r14
        L73:
            long r3 = r3 - r5
            long r11 = r11 + r3
            float r1 = (float) r3
            float r0 = java.lang.Math.abs(r2)
            float r1 = r1 / r0
            long r0 = (long) r1
            long r9 = r9 + r0
            goto L4e
        L7e:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L87
            long r14 = r14 - r11
            long r14 = r14 + r9
        L86:
            return r14
        L87:
            java.util.Iterator r1 = r7.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L86
            r1.next()
            r0 = 4508(0x119c, float:6.317E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66047Tyk.A01(X.Po5, X.56n):long");
    }

    public static boolean A05(MediaComposition mediaComposition) {
        EnumC1125356h enumC1125356h = EnumC1125356h.AUDIO;
        if (!mediaComposition.A06(enumC1125356h).isEmpty() || (mediaComposition.A07(enumC1125356h) != null && mediaComposition.A07(enumC1125356h).size() > 1)) {
            return true;
        }
        return false;
    }

    public static long A00(InterfaceC58019Po5 interfaceC58019Po5, EnumC1125356h enumC1125356h, MediaComposition mediaComposition) {
        int size;
        HashMap A07 = mediaComposition.A07(enumC1125356h);
        if (A07 == null) {
            size = 0;
        } else {
            size = A07.size();
        }
        long j = -1;
        for (int i = 0; i < size; i++) {
            C1125956n A04 = mediaComposition.A04(enumC1125356h, i);
            if (A04 != null) {
                C1125956n A042 = mediaComposition.A04(enumC1125356h, i);
                A042.getClass();
                j = Math.max(j, A04.A00 + A01(interfaceC58019Po5, A042));
            } else {
                throw MSY.A0X("No track available for ", enumC1125356h.name());
            }
        }
        return j;
    }
}
