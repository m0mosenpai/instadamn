package X;

import android.util.SparseArray;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2XY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XY {
    /* JADX WARN: Type inference failed for: r0v10, types: [X.3eB, java.lang.Object] */
    public static final C2WB A02(SparseArray sparseArray, AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2W1 c2w1, C2X5 c2x5, String str, Map map, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3;
        C50952Vr c50952Vr;
        C14360o3.A0B(c2xe, 3);
        C50952Vr c50952Vr2 = c2w1.A0M;
        boolean z5 = true;
        if (z4) {
            c50952Vr = c50952Vr2;
            i3 = 0;
        } else {
            i3 = 2;
            if (c50952Vr2 == null || c50952Vr2.A0B != 2) {
                i3 = 0;
            }
            c50952Vr = null;
        }
        if (z) {
            i3 |= 1;
        }
        if (z2) {
            i3 |= 16;
        }
        if (z3) {
            i3 |= 4;
        }
        if (c2w1.A04().A02.A01.A0Q) {
            i3 |= 8;
        }
        if (c50952Vr2 != null && (c50952Vr2.A0I != null || c50952Vr2.A0M != null || c50952Vr2.A0X != null || c50952Vr2.A0L != null)) {
            i3 |= 32;
        }
        C2YM c2ym = c2w1.A0R;
        if (c2ym != null && abstractC50812Vc.A0Q() == C05F.A0N) {
            C2YQ c2yq = c2ym.A01.A02;
            C14360o3.A0C(c2yq, "null cannot be cast to non-null type com.facebook.rendercore.primitives.PrimitiveRenderUnit<kotlin.Any>");
            C14360o3.A0B(c2yq, 6);
            return new C78883fu(sparseArray, abstractC50812Vc, c2xe, c50952Vr, c2yq, str, i3, i);
        }
        C78923fy c78923fy = new C78923fy(sparseArray, abstractC50812Vc, c2xe, c50952Vr, str, i3, i, i2, j);
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                c78923fy.A0D((C77843eC) it.next());
            }
        }
        C2V3 c2v3 = c2w1.A04().A02.A01;
        if (c2x5 != null) {
            boolean z6 = c2v3.A0A;
            if (j != 0) {
                z5 = false;
            }
            C77843eC A00 = AbstractC78283eu.A00(C78273et.A00, new C78263es(c2x5, c78923fy, z5, z6, c2v3.A0U));
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any?, kotlin.Any, kotlin.Any>");
            c78923fy.A0D(A00);
        }
        if (!c2v3.A0N || !(abstractC50812Vc instanceof C50902Vm)) {
            return c78923fy;
        }
        C77843eC A002 = AbstractC78283eu.A00(new Object(), null);
        C14360o3.A0C(A002, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any?, kotlin.Any, kotlin.Any>");
        c78923fy.A0D(A002);
        return c78923fy;
    }

    public static final C2X5 A04(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2W1 c2w1, int i) {
        C14360o3.A0B(c2xe, 0);
        C50952Vr c50952Vr = c2w1.A0M;
        boolean z = c2xe.A02.A01.A0Q;
        C2X5 c2x5 = new C2X5();
        c2x5.A0c = abstractC50812Vc instanceof C50902Vm;
        String A0H = abstractC50812Vc.A0H();
        C14360o3.A07(A0H);
        c2x5.A0S = A0H;
        c2x5.A08 = i;
        c2x5.A0Y = z;
        if (c50952Vr != null) {
            long j = c50952Vr.A0F;
            if ((j & 8) != 0) {
                c2x5.A0K = c50952Vr.A0I;
            }
            if ((j & 16) != 0) {
                c2x5.A0N = c50952Vr.A0M;
            }
            if ((j & 131072) != 0) {
                c2x5.A0L = c50952Vr.A0K;
            }
            if ((j & 32) != 0) {
                c2x5.A0O = c50952Vr.A0X;
            }
            if ((j & 262144) != 0) {
                c2x5.A0M = c50952Vr.A0L;
            }
            if ((j & 1) != 0) {
                c2x5.A0Q = c50952Vr.A0a;
            }
            if ((j & 8589934592L) != 0) {
                c2x5.A0T = c50952Vr.A0d;
            }
            if ((j & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED) != 0) {
                c2x5.A05 = c50952Vr.A05;
                c2x5.A07 |= 4096;
            }
            if ((j & 134217728) != 0) {
                c2x5.A06 = c50952Vr.A06;
                c2x5.A07 |= 8192;
            }
            if ((j & 268435456) != 0) {
                c2x5.A0B = c50952Vr.A07;
                c2x5.A07 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            if ((j & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                c2x5.A0J = c50952Vr.A0H;
            }
            if ((j & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) != 0) {
                c2x5.A0X = c50952Vr.A0g;
                c2x5.A07 |= 128;
            }
            if ((j & 8388608) != 0) {
                c2x5.A0W = c50952Vr.A0f;
                c2x5.A07 |= 64;
            }
            if ((j & 1073741824) != 0) {
                c2x5.A0D = c50952Vr.A08;
                c2x5.A07 |= Constants.LOAD_RESULT_PGO_ATTEMPTED;
            }
            Object obj = c50952Vr.A0b;
            if (obj != null) {
                c2x5.A0R = obj;
                c2x5.A07 |= Constants.LOAD_RESULT_PGO;
            }
            SparseArray sparseArray = c50952Vr.A0G;
            if (sparseArray != null) {
                SparseArray sparseArray2 = c2x5.A0I;
                if (sparseArray2 != null) {
                    sparseArray = AbstractC79783hT.A00(sparseArray2, sparseArray);
                }
                c2x5.A0I = sparseArray;
            }
            String str = c50952Vr.A0e;
            if (str != null) {
                c2x5.A0U = str;
            }
            int i2 = c50952Vr.A0C;
            boolean z2 = false;
            if (i2 != 0) {
                boolean z3 = false;
                if (i2 == 1) {
                    z3 = true;
                }
                c2x5.A0b = z3;
                c2x5.A07 |= 256;
            }
            int i3 = c50952Vr.A0A;
            if (i3 != 0) {
                boolean z4 = false;
                if (i3 == 1) {
                    z4 = true;
                }
                c2x5.A0Z = z4;
                c2x5.A07 |= 512;
            }
            int i4 = c50952Vr.A0B;
            if (i4 != 0) {
                boolean z5 = false;
                if (i4 == 1) {
                    z5 = true;
                }
                c2x5.A0a = z5;
                c2x5.A07 |= 1024;
            }
            int i5 = c50952Vr.A0E;
            if (i5 != 0) {
                boolean z6 = false;
                if (i5 == 1) {
                    z6 = true;
                }
                c2x5.A0e = z6;
                c2x5.A07 |= C3OO.FLAG_MOVED;
            }
            int i6 = c50952Vr.A0D;
            if (i6 != 0) {
                if (i6 == 1) {
                    z2 = true;
                }
                c2x5.A0d = z2;
                c2x5.A07 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            long j2 = c50952Vr.A0F;
            if ((j2 & 524288) != 0) {
                float f = c50952Vr.A04;
                c2x5.A04 = f;
                int i7 = c2x5.A07;
                int i8 = i7 | 2;
                if (f == 1.0f) {
                    i8 = i7 & (-3);
                }
                c2x5.A07 = i8;
            }
            if ((j2 & 1048576) != 0) {
                float f2 = c50952Vr.A00;
                c2x5.A00 = f2;
                int i9 = c2x5.A07;
                int i10 = i9 | 4;
                if (f2 == 1.0f) {
                    i10 = i9 & (-5);
                }
                c2x5.A07 = i10;
            }
            if ((j2 & 2097152) != 0) {
                float f3 = c50952Vr.A01;
                c2x5.A01 = f3;
                int i11 = c2x5.A07;
                int i12 = i11 | 8;
                if (f3 == 0.0f) {
                    i12 = i11 & (-9);
                }
                c2x5.A07 = i12;
            }
            if ((j2 & 33554432) != 0) {
                c2x5.A02 = c50952Vr.A02;
                c2x5.A07 |= 16;
            }
            if ((j2 & 67108864) != 0) {
                c2x5.A03 = c50952Vr.A03;
                c2x5.A07 |= 32;
            }
            if ((j2 & 17179869184L) != 0) {
                c2x5.A0P = c50952Vr.A0Y;
            }
        }
        if (z || !c2x5.A0c) {
            c2x5.A0G = c2w1.A0B;
            c2x5.A0H = c2w1.A0C;
        }
        c2x5.A0A = c2w1.A01();
        c2x5.A09 = c2w1.A04;
        c2x5.A0F = c2w1.A08;
        if ((c2w1.A06 & 1073741824) != 0) {
            c2x5.A0C = c2w1.A05;
        } else {
            c2x5.A0E = c2w1.A07;
        }
        c2x5.A0V = c2w1.A0e;
        return c2x5;
    }

    public static final SparseArray A00(List list, boolean z) {
        SparseArray sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C50932Vp c50932Vp = ((C2Y5) it.next()).A00;
            if (c50932Vp != null && (sparseArray = c50932Vp.A03) != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    Object obj = sparseArray.get(keyAt);
                    if (obj != null) {
                        sparseArray2.append(keyAt, obj);
                    }
                }
            }
        }
        if (sparseArray2.size() == 0 && !z) {
            return null;
        }
        return sparseArray2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2WB A01(final android.graphics.drawable.Drawable r18, X.C2WA r19, X.C2W1 r20, final int r21, final int r22, int r23) {
        /*
            r4 = r19
            r19 = 0
            r5 = 1
            r2 = r18
            X.C14360o3.A0B(r2, r5)
            X.2Vn r8 = new X.2Vn
            r1 = r21
            r0 = r22
            r8.<init>(r2, r1, r0)
            r10 = r20
            X.2XE r9 = r10.A05()
            java.lang.String r6 = r10.A0A()
            r14 = 2
            r7 = 0
            r3 = r23
            if (r4 == 0) goto L57
            java.lang.String r2 = " not supported"
            java.lang.String r1 = "OutputUnitType "
            if (r3 == r5) goto L3a
            if (r3 == r14) goto L35
            r0 = 3
            if (r3 == r0) goto L4d
            X.2W9 r4 = (X.C2W9) r4
            X.2WB r1 = r4.A05
        L32:
            if (r1 == 0) goto L58
            goto L3f
        L35:
            X.2W9 r4 = (X.C2W9) r4
            X.2WB r1 = r4.A07
            goto L32
        L3a:
            X.2W9 r4 = (X.C2W9) r4
            X.2WB r1 = r4.A04
            goto L32
        L3f:
            X.2Vc r0 = r1.A03     // Catch: java.lang.Exception -> L48
            boolean r0 = r8.A0N(r0, r8, r7, r7)     // Catch: java.lang.Exception -> L48
            r4 = r0 ^ 1
            goto Lba
        L48:
            r0 = move-exception
            X.C51372Xk.A01(r8, r9, r0)
            goto L58
        L4d:
            java.lang.String r0 = X.AnonymousClass001.A0c(r1, r2, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L57:
            r1 = r7
        L58:
            r4 = 0
            if (r1 != 0) goto Lba
            r0 = -1
        L5d:
            X.3ab r2 = r9.A02
            X.2XK r2 = r2.A00
            if (r2 == 0) goto Lbd
            long r16 = r2.A00(r6, r3)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto Lb5
            r15 = 0
        L6c:
            boolean r2 = r10.A0m
            boolean r20 = r10.A0H()
            java.lang.String r4 = r10.A0A()
            if (r3 == r5) goto Laa
            if (r3 == r14) goto L9f
            r0 = 3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r3 == r0) goto L99
            r1.append(r4)
            java.lang.String r0 = "$border"
        L87:
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r11 = r7
            r13 = r7
            r18 = r2
            r21 = r19
            X.2WB r0 = A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21)
            return r0
        L99:
            r1.append(r4)
            java.lang.String r0 = "$host"
            goto L87
        L9f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "$foreground"
            goto L87
        Laa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "$background"
            goto L87
        Lb5:
            r15 = 2
            if (r4 == 0) goto L6c
            r15 = 1
            goto L6c
        Lba:
            long r0 = r1.A01
            goto L5d
        Lbd:
            java.lang.String r0 = "Cannot generate IDs with a null renderUnitIdGenerator"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2XY.A01(android.graphics.drawable.Drawable, X.2WA, X.2W1, int, int, int):X.2WB");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r7.length() == 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C51272Xa A03(X.C2W1 r8) {
        /*
            if (r8 != 0) goto L4
            r1 = 0
        L3:
            return r1
        L4:
            java.lang.String r7 = r8.A0b
            X.3cd r6 = r8.A0N
            java.lang.String r5 = r8.A0c
            java.lang.String r4 = r8.A0A()
            r3 = 1
            r2 = 0
            if (r7 == 0) goto L19
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L1a
        L19:
            r0 = 1
        L1a:
            r1 = 0
            if (r0 != 0) goto L30
            if (r6 == 0) goto L34
            int r0 = r6.ordinal()
            if (r0 == r2) goto L32
            if (r0 != r3) goto L34
            r3 = 2
        L28:
            if (r7 == 0) goto L3
            X.2Xa r1 = new X.2Xa
            r1.<init>(r3, r7, r5)
            return r1
        L30:
            r3 = 3
            r7 = r4
        L32:
            r5 = r1
            goto L28
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unhandled transition key type "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2XY.A03(X.2W1):X.2Xa");
    }
}
