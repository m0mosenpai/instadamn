package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: X.Pub, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58397Pub implements InterfaceC65588TnS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AbstractC58385PuP A04;
    public final InterfaceC65299ThX A05;
    public final InterfaceC65625Tpl A06;
    public final boolean A07;
    public final int[] A08;
    public final int[] A09;
    public final Object[] A0A;
    public final Rr4 A0B;
    public final InterfaceC65181TfP A0C;
    public final C62622SJf A0D;
    public final boolean A0E;
    public static final int[] A0G = new int[0];
    public static final Unsafe A0F = C58400Pue.A04();

    @Override // X.InterfaceC65588TnS
    public final boolean CWb(Object obj) {
        int i;
        boolean z;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00; i4++) {
            int i5 = this.A09[i4];
            int[] iArr = this.A08;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            boolean z2 = this.A07;
            if (!z2) {
                int i8 = iArr[i5 + 2];
                int i9 = 1048575 & i8;
                i = 1 << (i8 >>> 20);
                if (i9 != i2) {
                    i3 = A0F.getInt(obj, i9);
                    i2 = i9;
                }
            } else {
                i = 0;
            }
            if ((268435456 & i7) != 0) {
                if (z2) {
                    if (!A0C(obj, i5)) {
                    }
                } else if ((i3 & i) == 0) {
                }
                return false;
            }
            int A02 = AbstractC58318PtA.A02(i7);
            if (A02 != 9 && A02 != 17) {
                if (A02 != 27) {
                    if (A02 != 60 && A02 != 68) {
                        if (A02 != 49) {
                            if (A02 == 50) {
                                C58372PuC c58372PuC = (C58372PuC) A04(i7, obj);
                                if (!c58372PuC.isEmpty() && ((C58388PuS) this.A0A[(i5 / 3) * 2]).A00.A01.A01 == EnumC58394PuY.MESSAGE) {
                                    InterfaceC65588TnS interfaceC65588TnS = null;
                                    Iterator A16 = AbstractC166997dE.A16(c58372PuC);
                                    while (A16.hasNext()) {
                                        Object next = A16.next();
                                        if (interfaceC65588TnS == null) {
                                            interfaceC65588TnS = C58378PuI.A02.A00(next.getClass());
                                        }
                                        if (!interfaceC65588TnS.CWb(next)) {
                                            return false;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        z = A0D(obj, i6, i5);
                    }
                }
                List A06 = A06(i7, obj);
                if (A06.isEmpty()) {
                    continue;
                } else {
                    InterfaceC65588TnS A03 = A03(i5);
                    for (int i10 = 0; i10 < A06.size(); i10++) {
                        if (!A03.CWb(A06.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (z2) {
                z = A0C(obj, i5);
            } else {
                z = i3 & i;
            }
            if (z && !A03(i5).CWb(A04(i7, obj))) {
                return false;
            }
        }
        return true;
    }

    public static int A00(Object obj) {
        C62622SJf c62622SJf = AbstractC58382PuM.A02;
        return ((List) obj).size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x017b, code lost:
    
        if ((r11 & 1) == 1) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C58397Pub A02(X.Rr4 r43, X.AbstractC58385PuP r44, X.InterfaceC65299ThX r45, X.InterfaceC65180TfO r46, X.InterfaceC65181TfP r47, X.C62622SJf r48) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58397Pub.A02(X.Rr4, X.PuP, X.ThX, X.TfO, X.TfP, X.SJf):X.Pub");
    }

    private InterfaceC65588TnS A03(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A0A;
        InterfaceC65588TnS interfaceC65588TnS = (InterfaceC65588TnS) objArr[i2];
        if (interfaceC65588TnS == null) {
            InterfaceC65588TnS A00 = C58378PuI.A02.A00((Class) objArr[i2 + 1]);
            objArr[i2] = A00;
            return A00;
        }
        return interfaceC65588TnS;
    }

    public static List A07(Object obj, long j) {
        List list = (List) C58400Pue.A01.A07(obj, j);
        C62622SJf c62622SJf = AbstractC58382PuM.A02;
        return list;
    }

    private void A08(InterfaceC65598Tnk interfaceC65598Tnk, Object obj, int i) {
        long A0A;
        Object A0F2;
        if ((536870912 & i) != 0) {
            A0A = AbstractC58318PtA.A0A(i);
            C58408Pum c58408Pum = (C58408Pum) interfaceC65598Tnk;
            C58408Pum.A06(c58408Pum, 2);
            A0F2 = c58408Pum.A03.A0H();
        } else {
            boolean z = this.A0E;
            A0A = AbstractC58318PtA.A0A(i);
            C58408Pum c58408Pum2 = (C58408Pum) interfaceC65598Tnk;
            C58408Pum.A06(c58408Pum2, 2);
            AbstractC61610RqZ abstractC61610RqZ = c58408Pum2.A03;
            if (z) {
                A0F2 = abstractC61610RqZ.A0G();
            } else {
                A0F2 = abstractC61610RqZ.A0F();
            }
        }
        C58400Pue.A06(obj, A0A, A0F2);
    }

    public static void A09(InterfaceC65555Tma interfaceC65555Tma, Object obj, int i) {
        if (obj instanceof String) {
            Q7P q7p = ((C63603SqB) interfaceC65555Tma).A00;
            AbstractC63226Sfd.A08(q7p, i);
            q7p.A0B((String) obj);
        } else {
            Q7P q7p2 = ((C63603SqB) interfaceC65555Tma).A00;
            AbstractC63226Sfd.A08(q7p2, i);
            q7p2.A0A((AbstractC58387PuR) obj);
        }
    }

    private void A0A(InterfaceC65555Tma interfaceC65555Tma, Object obj, int i, int i2) {
        if (obj != null) {
            C58389PuT c58389PuT = ((C58388PuS) this.A0A[(i2 / 3) * 2]).A00;
            Q7P q7p = ((C63603SqB) interfaceC65555Tma).A00;
            Iterator A14 = AbstractC166997dE.A14((AbstractMap) obj);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                AbstractC63226Sfd.A08(q7p, i);
                Object key = A1K.getKey();
                Object value = A1K.getValue();
                EnumC58395PuZ enumC58395PuZ = c58389PuT.A00;
                int A00 = C63340Shu.A00(enumC58395PuZ, key, 1);
                EnumC58395PuZ enumC58395PuZ2 = c58389PuT.A01;
                q7p.A05(A00 + C63340Shu.A00(enumC58395PuZ2, value, 2));
                Object key2 = A1K.getKey();
                Object value2 = A1K.getValue();
                C63340Shu.A01(q7p, enumC58395PuZ, key2, 1);
                C63340Shu.A01(q7p, enumC58395PuZ2, value2, 2);
            }
        }
    }

    private void A0B(Object obj, int i) {
        if (!this.A07) {
            int i2 = this.A08[i + 2];
            int i3 = 1 << (i2 >>> 20);
            long A0A = AbstractC58318PtA.A0A(i2);
            C58400Pue.A05(obj, A0A, C58400Pue.A01.A05(obj, A0A) | i3);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0016. Please report as an issue. */
    private boolean A0C(Object obj, int i) {
        Object A00;
        AbstractC58387PuR abstractC58387PuR;
        boolean isEmpty;
        boolean z = this.A07;
        int[] iArr = this.A08;
        if (z) {
            int i2 = iArr[i + 1];
            long A0A = AbstractC58318PtA.A0A(i2);
            switch (AbstractC58318PtA.A02(i2)) {
                case 0:
                    if (C58400Pue.A01.A02(obj, A0A) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (C58400Pue.A01.A03(obj, A0A) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C58400Pue.A01.A06(obj, A0A) == 0) {
                        return false;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    if (C58400Pue.A01.A05(obj, A0A) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C58400Pue.A01.A0H(obj, A0A);
                case 8:
                    A00 = AbstractC58403Puh.A00(obj, A0A);
                    if (A00 instanceof String) {
                        isEmpty = ((String) A00).isEmpty();
                        return !isEmpty;
                    }
                    if (A00 instanceof AbstractC58387PuR) {
                        abstractC58387PuR = AbstractC58387PuR.A02;
                        isEmpty = abstractC58387PuR.equals(A00);
                        return !isEmpty;
                    }
                    throw AbstractC58318PtA.A0Y();
                case 9:
                case 17:
                    if (AbstractC58403Puh.A00(obj, A0A) == null) {
                        return false;
                    }
                    break;
                case 10:
                    abstractC58387PuR = AbstractC58387PuR.A02;
                    A00 = AbstractC58403Puh.A00(obj, A0A);
                    isEmpty = abstractC58387PuR.equals(A00);
                    return !isEmpty;
                default:
                    throw AbstractC58318PtA.A0Y();
            }
        } else {
            int i3 = iArr[i + 2];
            if ((A01(obj, i3) & (1 << (i3 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(Object obj, int i, int i2) {
        return AbstractC167007dF.A1P(A01(obj, this.A08[i2 + 2]), i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0016 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // X.InterfaceC65588TnS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AT0(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A08
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L5:
            if (r5 >= r6) goto Lcb
            int r0 = r5 + 1
            r2 = r7[r0]
            long r0 = X.AbstractC58318PtA.A0A(r2)
            int r2 = X.AbstractC58318PtA.A02(r2)
            switch(r2) {
                case 0: goto L19;
                case 1: goto L36;
                case 2: goto L53;
                case 3: goto L53;
                case 4: goto L6c;
                case 5: goto L53;
                case 6: goto L6c;
                case 7: goto L81;
                case 8: goto L99;
                case 9: goto L99;
                case 10: goto L99;
                case 11: goto L6c;
                case 12: goto L6c;
                case 13: goto L6c;
                case 14: goto L53;
                case 15: goto L6c;
                case 16: goto L53;
                case 17: goto L99;
                case 18: goto Lb3;
                case 19: goto Lb3;
                case 20: goto Lb3;
                case 21: goto Lb3;
                case 22: goto Lb3;
                case 23: goto Lb3;
                case 24: goto Lb3;
                case 25: goto Lb3;
                case 26: goto Lb3;
                case 27: goto Lb3;
                case 28: goto Lb3;
                case 29: goto Lb3;
                case 30: goto Lb3;
                case 31: goto Lb3;
                case 32: goto Lb3;
                case 33: goto Lb3;
                case 34: goto Lb3;
                case 35: goto Lb3;
                case 36: goto Lb3;
                case 37: goto Lb3;
                case 38: goto Lb3;
                case 39: goto Lb3;
                case 40: goto Lb3;
                case 41: goto Lb3;
                case 42: goto Lb3;
                case 43: goto Lb3;
                case 44: goto Lb3;
                case 45: goto Lb3;
                case 46: goto Lb3;
                case 47: goto Lb3;
                case 48: goto Lb3;
                case 49: goto Lb3;
                case 50: goto Lb3;
                case 51: goto La2;
                case 52: goto La2;
                case 53: goto La2;
                case 54: goto La2;
                case 55: goto La2;
                case 56: goto La2;
                case 57: goto La2;
                case 58: goto La2;
                case 59: goto La2;
                case 60: goto La2;
                case 61: goto La2;
                case 62: goto La2;
                case 63: goto La2;
                case 64: goto La2;
                case 65: goto La2;
                case 66: goto La2;
                case 67: goto La2;
                case 68: goto La2;
                default: goto L16;
            }
        L16:
            int r5 = r5 + 3
            goto L5
        L19:
            boolean r3 = r10.A0C(r11, r5)
            boolean r2 = r10.A0C(r12, r5)
            if (r3 != r2) goto Lda
            X.Puh r8 = X.C58400Pue.A01
            double r2 = r8.A02(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A02(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L67
        L36:
            boolean r3 = r10.A0C(r11, r5)
            boolean r2 = r10.A0C(r12, r5)
            if (r3 != r2) goto Lda
            X.Puh r4 = X.C58400Pue.A01
            float r2 = r4.A03(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A03(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L95
        L53:
            boolean r3 = r10.A0C(r11, r5)
            boolean r2 = r10.A0C(r12, r5)
            if (r3 != r2) goto Lda
            X.Puh r2 = X.C58400Pue.A01
            long r3 = r2.A06(r11, r0)
            long r1 = r2.A06(r12, r0)
        L67:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lda
            goto L16
        L6c:
            boolean r3 = r10.A0C(r11, r5)
            boolean r2 = r10.A0C(r12, r5)
            if (r3 != r2) goto Lda
            X.Puh r2 = X.C58400Pue.A01
            int r3 = r2.A05(r11, r0)
            int r0 = r2.A05(r12, r0)
            goto L95
        L81:
            boolean r3 = r10.A0C(r11, r5)
            boolean r2 = r10.A0C(r12, r5)
            if (r3 != r2) goto Lda
            X.Puh r2 = X.C58400Pue.A01
            boolean r3 = r2.A0H(r11, r0)
            boolean r0 = r2.A0H(r12, r0)
        L95:
            if (r3 != r0) goto Lda
            goto L16
        L99:
            boolean r8 = r10.A0C(r11, r5)
            boolean r2 = r10.A0C(r12, r5)
            goto Lb1
        La2:
            int r2 = X.AbstractC58319PtB.A03(r5, r7)
            long r2 = (long) r2
            X.Puh r4 = X.C58400Pue.A01
            int r8 = r4.A05(r11, r2)
            int r2 = r4.A05(r12, r2)
        Lb1:
            if (r8 != r2) goto Lda
        Lb3:
            X.Puh r3 = X.C58400Pue.A01
            java.lang.Object r2 = r3.A07(r11, r0)
            java.lang.Object r1 = r3.A07(r12, r0)
            X.SJf r0 = X.AbstractC58382PuM.A02
            if (r2 == r1) goto L16
            if (r2 == 0) goto Lda
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Lda
            goto L16
        Lcb:
            X.PuE r11 = (X.AbstractC58374PuE) r11
            X.PuD r1 = r11.unknownFields
            X.PuE r12 = (X.AbstractC58374PuE) r12
            X.PuD r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lda
            r9 = 1
        Lda:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58397Pub.AT0(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01dd, code lost:
    
        if (r1 >= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02f9, code lost:
    
        if (r1 >= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03c2, code lost:
    
        if (r1 >= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04b1, code lost:
    
        if (r1 >= 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x07f6, code lost:
    
        r2 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04ef, code lost:
    
        if (r1 >= 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x07f3, code lost:
    
        if (r1 < 0) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
    
        if (r1 >= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03cb, code lost:
    
        r1 = 10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:200:0x0472. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0020 A[SYNTHETIC] */
    @Override // X.InterfaceC65588TnS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int BtW(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 2454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58397Pub.BtW(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65588TnS
    public final int CME(Object obj) {
        int i;
        double A02;
        float A03;
        long A06;
        int A05;
        int i2;
        int[] iArr = this.A08;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int i5 = iArr[i4 + 1];
            int i6 = iArr[i4];
            long A0A = AbstractC58318PtA.A0A(i5);
            int i7 = 37;
            switch (AbstractC58318PtA.A02(i5)) {
                case 0:
                    i = i3 * 53;
                    A02 = C58400Pue.A01.A02(obj, A0A);
                    A06 = Double.doubleToLongBits(A02);
                    Charset charset = AbstractC58376PuG.A03;
                    A05 = AbstractC25228BEl.A03(A06);
                    i3 = i + A05;
                    break;
                case 1:
                    i = i3 * 53;
                    A03 = C58400Pue.A01.A03(obj, A0A);
                    A05 = Float.floatToIntBits(A03);
                    i3 = i + A05;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i3 * 53;
                    A06 = C58400Pue.A01.A06(obj, A0A);
                    Charset charset2 = AbstractC58376PuG.A03;
                    A05 = AbstractC25228BEl.A03(A06);
                    i3 = i + A05;
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    i = i3 * 53;
                    A05 = C58400Pue.A01.A05(obj, A0A);
                    i3 = i + A05;
                    break;
                case 7:
                    i = i3 * 53;
                    i2 = C58400Pue.A01.A0H(obj, A0A);
                    Charset charset3 = AbstractC58376PuG.A03;
                    A05 = AbstractC58322PtE.A02(i2);
                    i3 = i + A05;
                    break;
                case 8:
                    i = i3 * 53;
                    A05 = ((String) AbstractC58403Puh.A00(obj, A0A)).hashCode();
                    i3 = i + A05;
                    break;
                case 9:
                case 17:
                    Object A00 = AbstractC58403Puh.A00(obj, A0A);
                    if (A00 != null) {
                        i7 = A00.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                case 18:
                case Process.SIGSTOP /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case Seq.NULL_REFNUM /* 41 */:
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                case 43:
                case 44:
                case 45:
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                case 47:
                case 48:
                case 49:
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    i = i3 * 53;
                    A05 = AbstractC58403Puh.A00(obj, A0A).hashCode();
                    i3 = i + A05;
                    break;
                case 51:
                    if (A0D(obj, i6, i4)) {
                        i = i3 * 53;
                        A02 = MSW.A00(AbstractC58403Puh.A00(obj, A0A));
                        A06 = Double.doubleToLongBits(A02);
                        Charset charset22 = AbstractC58376PuG.A03;
                        A05 = AbstractC25228BEl.A03(A06);
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A0D(obj, i6, i4)) {
                        i = i3 * 53;
                        A03 = AbstractC166987dD.A09(AbstractC58403Puh.A00(obj, A0A));
                        A05 = Float.floatToIntBits(A03);
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 53:
                case 54:
                case 56:
                case 65:
                case 67:
                    if (A0D(obj, i6, i4)) {
                        i = i3 * 53;
                        A06 = AbstractC166987dD.A0N(AbstractC58403Puh.A00(obj, A0A));
                        Charset charset222 = AbstractC58376PuG.A03;
                        A05 = AbstractC25228BEl.A03(A06);
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 55:
                case 57:
                case 62:
                case StringTreeSet.PAYLOAD_MASK /* 63 */:
                case 64:
                case 66:
                    if (A0D(obj, i6, i4)) {
                        i = i3 * 53;
                        A05 = AbstractC166987dD.A0H(AbstractC58403Puh.A00(obj, A0A));
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A0D(obj, i6, i4)) {
                        i = i3 * 53;
                        i2 = AbstractC166987dD.A1a(AbstractC58403Puh.A00(obj, A0A));
                        Charset charset32 = AbstractC58376PuG.A03;
                        A05 = AbstractC58322PtE.A02(i2);
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!A0D(obj, i6, i4)) {
                        break;
                    }
                    i = i3 * 53;
                    A05 = ((String) AbstractC58403Puh.A00(obj, A0A)).hashCode();
                    i3 = i + A05;
                    break;
                case 60:
                case 61:
                case 68:
                    if (!A0D(obj, i6, i4)) {
                        break;
                    }
                    i = i3 * 53;
                    A05 = AbstractC58403Puh.A00(obj, A0A).hashCode();
                    i3 = i + A05;
                    break;
            }
        }
        return AbstractC166987dD.A0I(((AbstractC58374PuE) obj).unknownFields, i3 * 53);
    }

    @Override // X.InterfaceC65588TnS
    public final void Cmk(Object obj) {
        int i;
        Object unmodifiableList;
        int i2 = this.A00;
        while (true) {
            i = this.A03;
            if (i2 >= i) {
                break;
            }
            long j = this.A08[this.A09[i2] + 1] & 1048575;
            Object A07 = C58400Pue.A01.A07(obj, j);
            if (A07 != null) {
                ((C58372PuC) A07).A00 = false;
                C58400Pue.A06(obj, j, A07);
            }
            i2++;
        }
        int[] iArr = this.A09;
        int length = iArr.length;
        while (i < length) {
            AbstractC58385PuP abstractC58385PuP = this.A04;
            long j2 = iArr[i];
            boolean z = abstractC58385PuP instanceof Q7R;
            Object A00 = AbstractC58403Puh.A00(obj, j2);
            if (z) {
                ((TZ1) ((InterfaceC65688TsA) A00)).A00 = false;
            } else {
                List list = (List) A00;
                if (list instanceof InterfaceC65684Ts6) {
                    unmodifiableList = ((InterfaceC65684Ts6) list).CCm();
                } else if (!AbstractC58321PtD.A1W(C58384PuO.A00, list)) {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                C58400Pue.A06(obj, j2, unmodifiableList);
            }
            i++;
        }
        ((AbstractC58374PuE) obj).unknownFields.A02 = false;
    }

    @Override // X.InterfaceC65588TnS
    public final Object CsR() {
        return ((AbstractC58374PuE) this.A06).A03(C05F.A0N, null, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:270:0x04ef. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0019 A[SYNTHETIC] */
    @Override // X.InterfaceC65588TnS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FEq(X.InterfaceC65555Tma r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58397Pub.FEq(X.Tma, java.lang.Object):void");
    }

    public C58397Pub(Rr4 rr4, AbstractC58385PuP abstractC58385PuP, InterfaceC65299ThX interfaceC65299ThX, InterfaceC65625Tpl interfaceC65625Tpl, InterfaceC65181TfP interfaceC65181TfP, C62622SJf c62622SJf, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A08 = iArr;
        this.A0A = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0E = interfaceC65625Tpl instanceof AbstractC58374PuE;
        this.A07 = z;
        this.A09 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0C = interfaceC65181TfP;
        this.A04 = abstractC58385PuP;
        this.A0D = c62622SJf;
        this.A0B = rr4;
        this.A06 = interfaceC65625Tpl;
        this.A05 = interfaceC65299ThX;
    }

    public static int A01(Object obj, int i) {
        return C58400Pue.A01.A05(obj, i & 1048575);
    }

    public static Object A04(int i, Object obj) {
        return C58400Pue.A01.A07(obj, i & 1048575);
    }

    public static Field A05(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw AbstractC58321PtD.A0r(cls, str, declaredFields);
        }
    }

    public static List A06(int i, Object obj) {
        return (List) C58400Pue.A01.A07(obj, i & 1048575);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    @Override // X.InterfaceC65588TnS
    public final void CpL(Object obj, Object obj2) {
        int i;
        Object A07;
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.A08;
            if (i2 < iArr.length) {
                int i3 = iArr[i2 + 1];
                long A0A = AbstractC58318PtA.A0A(i3);
                int i4 = iArr[i2];
                switch (AbstractC58318PtA.A02(i3)) {
                    case 0:
                        if (!A0C(obj2, i2)) {
                            break;
                        } else {
                            AbstractC58403Puh abstractC58403Puh = C58400Pue.A01;
                            abstractC58403Puh.A0A(obj, A0A, abstractC58403Puh.A02(obj2, A0A));
                            A0B(obj, i2);
                            break;
                        }
                    case 1:
                        if (!A0C(obj2, i2)) {
                            break;
                        } else {
                            AbstractC58403Puh abstractC58403Puh2 = C58400Pue.A01;
                            abstractC58403Puh2.A0B(obj, A0A, abstractC58403Puh2.A03(obj2, A0A));
                            A0B(obj, i2);
                            break;
                        }
                    case 2:
                    case 3:
                    case 5:
                    case 14:
                    case 16:
                        if (!A0C(obj2, i2)) {
                            break;
                        } else {
                            AbstractC58403Puh abstractC58403Puh3 = C58400Pue.A01;
                            abstractC58403Puh3.A0D(obj, A0A, abstractC58403Puh3.A06(obj2, A0A));
                            A0B(obj, i2);
                            break;
                        }
                    case 4:
                    case 6:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case Process.SIGTERM /* 15 */:
                        if (!A0C(obj2, i2)) {
                            break;
                        } else {
                            C58400Pue.A05(obj, A0A, C58400Pue.A01.A05(obj2, A0A));
                            A0B(obj, i2);
                            break;
                        }
                    case 7:
                        if (!A0C(obj2, i2)) {
                            break;
                        } else {
                            AbstractC58403Puh abstractC58403Puh4 = C58400Pue.A01;
                            abstractC58403Puh4.A0F(obj, A0A, abstractC58403Puh4.A0H(obj2, A0A));
                            A0B(obj, i2);
                            break;
                        }
                    case 8:
                    case 10:
                        if (!A0C(obj2, i2)) {
                            break;
                        } else {
                            A07 = AbstractC58403Puh.A00(obj2, A0A);
                            C58400Pue.A06(obj, A0A, A07);
                            A0B(obj, i2);
                            break;
                        }
                    case 9:
                    case 17:
                        if (!A0C(obj2, i2)) {
                            break;
                        } else {
                            AbstractC58403Puh abstractC58403Puh5 = C58400Pue.A01;
                            Object A072 = abstractC58403Puh5.A07(obj, A0A);
                            A07 = abstractC58403Puh5.A07(obj2, A0A);
                            if (A072 != null) {
                                if (A07 == null) {
                                    break;
                                } else {
                                    A07 = AbstractC58376PuG.A00(A072, A07);
                                    C58400Pue.A06(obj, A0A, A07);
                                }
                            } else {
                                if (A07 == null) {
                                    break;
                                }
                                C58400Pue.A06(obj, A0A, A07);
                            }
                            A0B(obj, i2);
                            break;
                        }
                    case 18:
                    case Process.SIGSTOP /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case Seq.NULL_REFNUM /* 41 */:
                    case Seq.RefTracker.REF_OFFSET /* 42 */:
                    case 43:
                    case 44:
                    case 45:
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    case 47:
                    case 48:
                    case 49:
                        if (this.A04 instanceof Q7R) {
                            AbstractC58403Puh abstractC58403Puh6 = C58400Pue.A01;
                            InterfaceC65688TsA interfaceC65688TsA = (InterfaceC65688TsA) abstractC58403Puh6.A07(obj, A0A);
                            List list = (List) abstractC58403Puh6.A07(obj2, A0A);
                            int size = interfaceC65688TsA.size();
                            int size2 = list.size();
                            if (size > 0) {
                                if (size2 > 0) {
                                    if (!((TZ1) interfaceC65688TsA).A00) {
                                        interfaceC65688TsA = interfaceC65688TsA.Cq3(size2 + size);
                                    }
                                    interfaceC65688TsA.addAll(list);
                                }
                                list = interfaceC65688TsA;
                            }
                            C58400Pue.A06(obj, A0A, list);
                            break;
                        } else {
                            List list2 = (List) AbstractC58403Puh.A00(obj2, A0A);
                            List A00 = C58384PuO.A00(obj, list2.size(), A0A);
                            int size3 = A00.size();
                            int size4 = list2.size();
                            if (size3 > 0) {
                                if (size4 > 0) {
                                    A00.addAll(list2);
                                }
                                list2 = A00;
                            }
                            C58400Pue.A06(obj, A0A, list2);
                            break;
                        }
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                        C62622SJf c62622SJf = AbstractC58382PuM.A02;
                        AbstractC58403Puh abstractC58403Puh7 = C58400Pue.A01;
                        C58372PuC c58372PuC = (C58372PuC) abstractC58403Puh7.A07(obj, A0A);
                        AbstractMap abstractMap = (AbstractMap) abstractC58403Puh7.A07(obj2, A0A);
                        if (!abstractMap.isEmpty()) {
                            if (!c58372PuC.A00) {
                                c58372PuC = c58372PuC.A01();
                            }
                            C58372PuC.A00(c58372PuC);
                            if (!abstractMap.isEmpty()) {
                                c58372PuC.putAll(abstractMap);
                            }
                        }
                        C58400Pue.A06(obj, A0A, c58372PuC);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 61:
                    case 62:
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!A0D(obj2, i4, i2)) {
                            break;
                        } else {
                            C58400Pue.A06(obj, A0A, AbstractC58403Puh.A00(obj2, A0A));
                            i = AbstractC58319PtB.A03(i2, iArr);
                            C58400Pue.A05(obj, i, i4);
                            break;
                        }
                    case 60:
                    case 68:
                        if (!A0D(obj2, i4, i2)) {
                            break;
                        } else {
                            AbstractC58403Puh abstractC58403Puh8 = C58400Pue.A01;
                            Object A073 = abstractC58403Puh8.A07(obj, A0A);
                            Object A074 = abstractC58403Puh8.A07(obj2, A0A);
                            if (A073 != null) {
                                if (A074 == null) {
                                    break;
                                } else {
                                    A074 = AbstractC58376PuG.A00(A073, A074);
                                    C58400Pue.A06(obj, A0A, A074);
                                    i = iArr[i2 + 2] & 1048575;
                                }
                            } else {
                                if (A074 == null) {
                                    break;
                                }
                                C58400Pue.A06(obj, A0A, A074);
                                i = iArr[i2 + 2] & 1048575;
                            }
                            C58400Pue.A05(obj, i, i4);
                            break;
                        }
                }
                i2 += 3;
            } else {
                if (!this.A07) {
                    AbstractC58382PuM.A0Q(obj, obj2);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0123, code lost:
    
        r13.put(r9, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0126, code lost:
    
        r11 = (X.C58383PuN) r11;
        r11.A01 = r10;
        X.C58383PuN.A01(r11);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0046. Please report as an issue. */
    @Override // X.InterfaceC65588TnS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CpM(X.C58402Pug r20, X.InterfaceC65598Tnk r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 2516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58397Pub.CpM(X.Pug, X.Tnk, java.lang.Object):void");
    }
}
