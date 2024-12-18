package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.forker.Process;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.react.bridge.BaseJavaModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7i6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169917i6 {
    public static volatile Looper A0L;
    public int A00;
    public AbstractC169857hz A01;
    public AbstractC169857hz A02;
    public AbstractC169857hz A03;
    public C169967iB A04;
    public C28170CbH A05;
    public List A06;
    public boolean A07;
    public final C169947i9 A09;
    public final C169977iC A0A;
    public final C169977iC A0B;
    public final C2VY A0C;
    public final String A0D;
    public final AtomicBoolean A0E;
    public final boolean A0F;
    public final C169937i8 A0H;
    public final C169927i7 A0I;
    public final C169827hw A0J;
    public final Map A0K = new HashMap();
    public final C2XL A0G = new C2XL();
    public final C2XM A08 = new Object();

    private C22861A6h A00(AbstractC169857hz abstractC169857hz, String str, int i) {
        if (abstractC169857hz != null) {
            if (str.equals(abstractC169857hz.A03)) {
                return new C22861A6h(abstractC169857hz, i);
            }
            List list = abstractC169857hz.A05;
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC169857hz abstractC169857hz2 = (AbstractC169857hz) list.get(i3);
                    C22861A6h A00 = A00(abstractC169857hz2, str, i + i2);
                    if (A00 != null) {
                        return A00;
                    }
                    i2 += abstractC169857hz2.A00;
                }
            }
        }
        return null;
    }

    public static RuntimeException A03(AbstractC169857hz abstractC169857hz, C169917i6 c169917i6, IndexOutOfBoundsException indexOutOfBoundsException) {
        Integer num;
        String str;
        Integer num2;
        String obj;
        RuntimeException A02 = A02(null, abstractC169857hz, indexOutOfBoundsException);
        if (A02 == indexOutOfBoundsException) {
            synchronized (c169917i6) {
                StringBuilder sb = new StringBuilder();
                sb.append("tag: ");
                sb.append(c169917i6.A0D);
                sb.append(", currentSection.size: ");
                AbstractC169857hz abstractC169857hz2 = c169917i6.A02;
                if (abstractC169857hz2 != null) {
                    num = Integer.valueOf(abstractC169857hz2.A00);
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(", currentSection.name: ");
                AbstractC169857hz abstractC169857hz3 = c169917i6.A02;
                if (abstractC169857hz3 != null) {
                    str = abstractC169857hz3.A09;
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append(", nextSection.size: ");
                AbstractC169857hz abstractC169857hz4 = c169917i6.A03;
                if (abstractC169857hz4 != null) {
                    num2 = Integer.valueOf(abstractC169857hz4.A00);
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(", nextSection.name: ");
                AbstractC169857hz abstractC169857hz5 = c169917i6.A03;
                sb.append(abstractC169857hz5 != null ? abstractC169857hz5.A09 : null);
                sb.append(", pendingChangeSets.size: ");
                sb.append(c169917i6.A06.size());
                sb.append(", pendingStateUpdates.size: ");
                C169967iB c169967iB = c169917i6.A04;
                sb.append(c169967iB.A00.size());
                sb.append(", pendingNonLazyStateUpdates.size: ");
                sb.append(c169967iB.A01.size());
                sb.append("\n");
                obj = sb.toString();
            }
            return new RuntimeException(AnonymousClass001.A0g("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception for more information. Debug info: ", obj, indexOutOfBoundsException.getMessage()), indexOutOfBoundsException);
        }
        return A02;
    }

    public static synchronized void A05(C125975mo c125975mo, C169917i6 c169917i6, String str, boolean z) {
        AbstractC169857hz A04;
        synchronized (c169917i6) {
            if (c169917i6.A02 == null && c169917i6.A03 == null) {
                throw new IllegalStateException("State set with no attached Section");
            }
            C169967iB c169967iB = c169917i6.A04;
            Map map = c169967iB.A00;
            List list = (List) map.get(str);
            if (list == null) {
                list = new ArrayList();
                map.put(str, list);
            }
            list.add(c125975mo);
            if (!z) {
                Map map2 = c169967iB.A01;
                List list2 = (List) map2.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                    map2.put(str, list2);
                }
                list2.add(c125975mo);
                if (c169917i6.A07) {
                    int i = c169917i6.A00 + 1;
                    c169917i6.A00 = i;
                    if (i == 50) {
                        C2YE.A00("SectionTree:StateUpdatesFromInsideChangeSetCalculateExceedsThreshold", C05F.A0C, "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
                    }
                }
                AbstractC169857hz abstractC169857hz = c169917i6.A03;
                if (abstractC169857hz == null) {
                    AbstractC169857hz abstractC169857hz2 = c169917i6.A02;
                    if (abstractC169857hz2 != null) {
                        A04 = abstractC169857hz2.A04(false);
                    } else {
                        A04 = null;
                    }
                } else {
                    A04 = abstractC169857hz.A04(false);
                }
                c169917i6.A03 = A04;
            }
        }
    }

    private synchronized void A0B(AbstractC169857hz abstractC169857hz) {
        List list = abstractC169857hz.A05;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A0B((AbstractC169857hz) list.get(i));
            }
        }
    }

    public final void A0H() {
        AbstractC169857hz abstractC169857hz;
        synchronized (this) {
            abstractC169857hz = this.A02;
        }
        if (abstractC169857hz != null) {
            A09(abstractC169857hz);
        }
    }

    public final void A0I(final AbstractC169857hz abstractC169857hz) {
        AbstractC169857hz abstractC169857hz2;
        AbstractC169857hz abstractC169857hz3;
        synchronized (this) {
            AbstractC169857hz abstractC169857hz4 = this.A02;
            if ((abstractC169857hz4 == null || abstractC169857hz4.A08 != abstractC169857hz.A08) && ((abstractC169857hz2 = this.A03) == null || abstractC169857hz2.A08 != abstractC169857hz.A08)) {
                if (abstractC169857hz == null) {
                    abstractC169857hz3 = null;
                } else {
                    abstractC169857hz3 = abstractC169857hz.A04(false);
                }
                this.A03 = abstractC169857hz3;
                Integer A01 = AbstractC50692Uq.A01("Section.SetRoot");
                if (A01 != null) {
                    AbstractC50692Uq.A06("Section.SetRoot", "-1", new InterfaceC16660sJ() { // from class: X.B3i
                        @Override // X.InterfaceC16660sJ
                        public final Object invoke(Object obj) {
                            String str;
                            C169917i6 c169917i6 = this;
                            AbstractC169857hz abstractC169857hz5 = abstractC169857hz;
                            Map map = (Map) obj;
                            map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.valueOf(c169917i6.hashCode()));
                            if (abstractC169857hz5 != null) {
                                str = abstractC169857hz5.A09;
                            } else {
                                str = "null";
                            }
                            map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                            map.put(BaseJavaModule.METHOD_TYPE_ASYNC, AbstractC166997dE.A0a());
                            return C0eB.A00;
                        }
                    }, A01.intValue());
                }
                try {
                    A0G(this, null, 0);
                } finally {
                    if (A01 != null) {
                        AbstractC50692Uq.A02(A01.intValue());
                    }
                }
            }
        }
    }

    public static C22861A6h A01(C169917i6 c169917i6, String str) {
        AbstractC169857hz abstractC169857hz = c169917i6.A01;
        if (abstractC169857hz != null) {
            C22861A6h A00 = c169917i6.A00(abstractC169857hz, str, 0);
            if (A00 != null) {
                return A00;
            }
            throw new RuntimeException(AnonymousClass001.A11("Did not find section with key '", str, "'! Currently bound section's global key is '", c169917i6.A01.A03, "'"));
        }
        throw new IllegalStateException("You cannot call requestFocus methods before dataBound() is called!");
    }

    public static RuntimeException A02(AbstractC169857hz abstractC169857hz, AbstractC169857hz abstractC169857hz2, IndexOutOfBoundsException indexOutOfBoundsException) {
        List list;
        String str;
        String str2;
        if (abstractC169857hz2 != null) {
            C169827hw c169827hw = abstractC169857hz2.A02;
            if ((abstractC169857hz2 instanceof C170027iH) && (list = ((C170027iH) abstractC169857hz2).A04) != null) {
                C170097iO c170097iO = new C170097iO(c169827hw, null, list);
                if (c169827hw.A0E() != null) {
                    str = c169827hw.A0E().A09;
                } else {
                    str = "null";
                }
                String A00 = AbstractC61785Rtf.A00(c170097iO, str, list);
                if (A00 != null) {
                    if (abstractC169857hz != null) {
                        str2 = abstractC169857hz.A09;
                    } else {
                        str2 = abstractC169857hz2.A09;
                    }
                    RuntimeException runtimeException = new RuntimeException(AnonymousClass001.A11("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception for more information. Debug info: ", A00, " in the [", str2, "]."), indexOutOfBoundsException);
                    runtimeException.setStackTrace(new StackTraceElement[0]);
                    return runtimeException;
                }
            }
            List list2 = abstractC169857hz2.A05;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    RuntimeException A02 = A02(abstractC169857hz2, (AbstractC169857hz) it.next(), indexOutOfBoundsException);
                    if (A02 != indexOutOfBoundsException) {
                        return A02;
                    }
                }
            }
        }
        return indexOutOfBoundsException;
    }

    public static void A06(C170247id c170247id, AbstractC169857hz abstractC169857hz, C169917i6 c169917i6, int i, long j, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4 = i;
        if (!(abstractC169857hz instanceof C170027iH)) {
            C169727hm c169727hm = (C169727hm) c169917i6.A0K.get(abstractC169857hz.A03);
            if (c169727hm != null) {
                i2 = c169727hm.A01;
                i3 = c169727hm.A03;
            } else {
                i2 = -1;
                i3 = -1;
            }
            C169827hw c169827hw = abstractC169857hz.A02;
            if (abstractC169857hz instanceof C169847hy) {
                C0s9 c0s9 = ((C169847hy) abstractC169857hz).A03;
                C14360o3.A0B(c169827hw, 0);
                C14360o3.A0B(c170247id, 6);
                if (c0s9 != null) {
                    c0s9.invoke(Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), c170247id, Integer.valueOf(i4));
                }
            }
            List list = abstractC169857hz.A05;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                AbstractC169857hz abstractC169857hz2 = (AbstractC169857hz) list.get(i5);
                A06(c170247id, abstractC169857hz2, c169917i6, i4, j, z, z2);
                i4 += abstractC169857hz2.A00;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x014a, code lost:
    
        if (r1 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x014c, code lost:
    
        r0 = X.AbstractC40161tk.A04(r1, r3.A2L(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0154, code lost:
    
        if (r0 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0156, code lost:
    
        r12.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x015e, code lost:
    
        if (r12.isEmpty() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0168, code lost:
    
        if (r12.size() != r2.A03()) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x016a, code lost:
    
        r4 = new X.C170037iI();
        r3 = new X.C170027iH();
        r1 = new java.util.BitSet(1);
        r1.clear();
        r3.A04 = r12;
        r1.set(0);
        r3.A02 = X.AbstractC169867i0.A02(r6, 1463818325);
        r3.A01 = X.AbstractC169867i0.A02(r6, 947264300);
        r3.A00 = X.AbstractC169867i0.A02(r6, 851046848);
        r0 = r4.A00;
        X.AbstractC169877i1.A00(r1, new java.lang.String[]{"data"}, 1);
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ac, code lost:
    
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00a4, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r20 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if ((r20 instanceof X.C170027iH) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        r8 = X.AbstractC169857hz.A00(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        r7 = r22.A07;
        r22.A07 = r7;
        r6 = r21.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if ((r21 instanceof X.C169847hy) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        r1 = ((X.C169847hy) r21).A01;
        X.C14360o3.A0B(r6, 0);
        X.C14360o3.A0B(r1, 1);
        r4 = ((X.C169077gg) r1.invoke(r6)).A00;
        X.C14360o3.A07(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        r6 = r4.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        r21.A05 = r6;
        r5 = r6.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b3, code lost:
    
        if (r4 >= r5) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b5, code lost:
    
        r3 = (X.AbstractC169857hz) r6.get(r4);
        r3.A01 = r21;
        r1 = r3.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c3, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c5, code lost:
    
        r14 = X.AnonymousClass001.A0R(r21.A03, r1);
        r13 = r21.A02;
        r1 = r13.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d1, code lost:
    
        if (r1 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01dd, code lost:
    
        if (r1.A02.A04.A00.contains(r14) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01df, code lost:
    
        r12 = r3.A09;
        r0 = r1.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e3, code lost:
    
        if (r0 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e5, code lost:
    
        r0 = new java.util.HashMap();
        r1.A06 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f0, code lost:
    
        if (r0.containsKey(r12) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f2, code lost:
    
        r2 = ((java.lang.Integer) r1.A06.get(r12)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01fe, code lost:
    
        r1.A06.put(r12, java.lang.Integer.valueOf(r2 + 1));
        r14 = X.AnonymousClass001.A0O(r14, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0217, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x020d, code lost:
    
        r3.A03 = r14;
        r13.A04.A00.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0219, code lost:
    
        if (r8 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x021f, code lost:
    
        r0 = (android.util.Pair) r8.get(r3.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0227, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0229, code lost:
    
        r0 = (X.AbstractC169857hz) r0.first;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x022d, code lost:
    
        A07(r19, r0, r3, r22, r23, r24);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x021c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        throw new java.lang.IllegalStateException(X.AnonymousClass001.A0g("Your Section ", r3.A09, " has an empty key. Please specify a key."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024b, code lost:
    
        if (r22.A07 == r7) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x024d, code lost:
    
        r22.A07 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00de, code lost:
    
        if ((r21 instanceof X.C9QO) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        r2 = ((X.C9QO) r21).A03;
        X.C14360o3.A0B(r6, 0);
        X.C14360o3.A0B(r2, 1);
        r1 = r2.A02();
        r0 = r6.A0C;
        X.C14360o3.A07(r0);
        r4 = X.AbstractC13690mv.A01(r0, r1);
        r3 = r2.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fc, code lost:
    
        if (r3 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fe, code lost:
    
        r12 = new java.util.ArrayList();
        r15 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010b, code lost:
    
        if (r15.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010d, code lost:
    
        r14 = (X.C38321qM) r15.next();
        r1 = r14.A0C.AmQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0119, code lost:
    
        if (r1 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011b, code lost:
    
        r0 = X.AbstractC40161tk.A04(r1, r14.A2L(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0123, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0125, code lost:
    
        r12.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x012d, code lost:
    
        if (r12.isEmpty() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x012f, code lost:
    
        r12 = new java.util.ArrayList();
        r14 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013c, code lost:
    
        if (r14.hasNext() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013e, code lost:
    
        r3 = (X.C38321qM) r14.next();
        r1 = r3.A0C.BGx();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.C169927i7 r19, X.AbstractC169857hz r20, final X.AbstractC169857hz r21, final X.C169827hw r22, java.lang.String r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169917i6.A07(X.7i7, X.7hz, X.7hz, X.7hw, java.lang.String, java.util.Map):void");
    }

    private void A08(AbstractC169857hz abstractC169857hz) {
        this.A0G.A01(abstractC169857hz.A02, abstractC169857hz, abstractC169857hz.A03);
        if (!(abstractC169857hz instanceof C170027iH)) {
            List list = abstractC169857hz.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A08((AbstractC169857hz) list.get(i));
            }
        }
    }

    private void A09(AbstractC169857hz abstractC169857hz) {
        if (!(abstractC169857hz instanceof C170027iH)) {
            List list = abstractC169857hz.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A09((AbstractC169857hz) list.get(i));
            }
        }
    }

    private void A0A(AbstractC169857hz abstractC169857hz) {
        if (!(abstractC169857hz instanceof C170027iH)) {
            List list = abstractC169857hz.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A0A((AbstractC169857hz) list.get(i));
            }
        }
    }

    public static void A0C(AbstractC169857hz abstractC169857hz, C169917i6 c169917i6) {
        InterfaceC16820sZ interfaceC16820sZ;
        if ((abstractC169857hz instanceof C169847hy) && (interfaceC16820sZ = ((C169847hy) abstractC169857hz).A00) != null) {
            interfaceC16820sZ.invoke();
        }
        if (!(abstractC169857hz instanceof C170027iH)) {
            List list = abstractC169857hz.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A0C((AbstractC169857hz) list.get(i), c169917i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0D(AbstractC169857hz abstractC169857hz, C169917i6 c169917i6, int i, int i2, int i3, int i4, int i5) {
        C169727hm c169727hm;
        int i6;
        int i7;
        int i8;
        InterfaceC16590sC interfaceC16590sC;
        Map map = c169917i6.A0K;
        C169727hm c169727hm2 = (C169727hm) map.get(abstractC169857hz.A03);
        int i9 = abstractC169857hz.A00;
        if (c169727hm2 == null) {
            Object obj = new Object();
            map.put(abstractC169857hz.A03, obj);
            c169727hm = obj;
        } else {
            int i10 = c169727hm2.A01;
            c169727hm = c169727hm2;
            if (i10 == i) {
                int i11 = c169727hm2.A03;
                c169727hm = c169727hm2;
                if (i11 == i2) {
                    int i12 = c169727hm2.A00;
                    c169727hm = c169727hm2;
                    if (i12 == i3) {
                        int i13 = c169727hm2.A02;
                        c169727hm = c169727hm2;
                        if (i13 == i4) {
                            int i14 = c169727hm2.A04;
                            c169727hm = c169727hm2;
                            c169727hm = c169727hm2;
                            if (i14 == i9 && i5 != 1) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        c169727hm.A03 = i2;
        c169727hm.A01 = i;
        c169727hm.A00 = i3;
        c169727hm.A02 = i4;
        c169727hm.A04 = i9;
        if ((abstractC169857hz instanceof C169847hy) && (interfaceC16590sC = ((C169847hy) abstractC169857hz).A02) != null) {
            interfaceC16590sC.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i9), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        if (!(abstractC169857hz instanceof C170027iH)) {
            List list = abstractC169857hz.A05;
            int size = list.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size; i16++) {
                AbstractC169857hz abstractC169857hz2 = (AbstractC169857hz) list.get(i16);
                int i17 = i - i15;
                int i18 = i2 - i15;
                int i19 = i3 - i15;
                int i20 = i4 - i15;
                int i21 = -1;
                if (i17 < abstractC169857hz2.A00 && i18 >= 0) {
                    i6 = Math.max(i17, 0);
                    i7 = Math.min(i18, abstractC169857hz2.A00 - 1);
                } else {
                    i6 = -1;
                    i7 = -1;
                }
                if (i19 < abstractC169857hz2.A00 && i20 >= 0) {
                    i8 = Math.max(i19, 0);
                    i21 = Math.min(i20, abstractC169857hz2.A00 - 1);
                } else {
                    i8 = -1;
                }
                i15 += abstractC169857hz2.A00;
                A0D(abstractC169857hz2, c169917i6, i6, i7, i8, i21, i5);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [X.7id] */
    private void A0E(final AbstractC169857hz abstractC169857hz, List list) {
        final boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("applyChangeSetToTarget");
        }
        final ArrayList arrayList = new ArrayList();
        try {
            Integer A01 = AbstractC50692Uq.A01("Section.ApplyChangeSet");
            if (A01 != null) {
                AbstractC50692Uq.A06("Section.ApplyChangeSet", String.valueOf(-1), C25102B8y.A00, A01.intValue());
            }
            try {
                int size = list.size();
                final boolean z = false;
                for (int i = 0; i < size; i++) {
                    C170057iK c170057iK = (C170057iK) list.get(i);
                    if (c170057iK.A03.size() > 0) {
                        int size2 = c170057iK.A03.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            C170167iV c170167iV = (C170167iV) c170057iK.A03.get(i2);
                            switch (c170167iV.A03) {
                                case Process.SD_BLACK_HOLE /* -3 */:
                                    this.A0H.AOj(c170167iV.A01, c170167iV.A00);
                                    break;
                                case -2:
                                    this.A0H.FBw(c170167iV.A07, c170167iV.A01, c170167iV.A00);
                                    break;
                                case -1:
                                    this.A0H.COg(c170167iV.A07, c170167iV.A01, c170167iV.A00);
                                    break;
                                case 0:
                                    this.A0H.Cps(c170167iV.A01, c170167iV.A02);
                                    break;
                                case 1:
                                    this.A0H.COb(c170167iV.A04, c170167iV.A01);
                                    break;
                                case 2:
                                    this.A0H.FA8(c170167iV.A04, c170167iV.A01);
                                    break;
                                case 3:
                                    this.A0H.AOY(c170167iV.A01);
                                    break;
                            }
                            z = true;
                        }
                        this.A0H.A01();
                    }
                    arrayList.addAll(c170057iK.A03);
                }
                final ?? r11 = new Object(arrayList) { // from class: X.7id
                    public final List A00;

                    {
                        this.A00 = Collections.unmodifiableList(arrayList);
                    }
                };
                this.A0H.Ct3(new InterfaceC170847jb() { // from class: X.7ie
                    @Override // X.InterfaceC170847jb
                    public final void D9D() {
                        C169917i6 c169917i6 = this;
                        if (z) {
                            boolean z2 = isTracing;
                            if (z2) {
                                ComponentsSystrace.A02("dataBound");
                            }
                            try {
                                AbstractC169857hz abstractC169857hz2 = abstractC169857hz;
                                C2XV.A00();
                                if (abstractC169857hz2 != null) {
                                    c169917i6.A01 = abstractC169857hz2;
                                    C169917i6.A0C(abstractC169857hz2, c169917i6);
                                }
                            } finally {
                                if (z2) {
                                    ComponentsSystrace.A01();
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC170847jb
                    public final void D9I(boolean z2, long j) {
                        C169917i6 c169917i6 = this;
                        AbstractC169857hz abstractC169857hz2 = abstractC169857hz;
                        boolean z3 = z;
                        C170247id c170247id = r11;
                        C2XV.A00();
                        if (abstractC169857hz2 != null) {
                            C169917i6.A06(c170247id, abstractC169857hz2, c169917i6, 0, j, z3, z2);
                        }
                    }
                }, z);
            } finally {
                if (A01 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("section", abstractC169857hz.A09);
                    hashMap.put("size", Integer.valueOf(arrayList.size()));
                    AbstractC50692Uq.A03(A01.intValue(), hashMap);
                }
            }
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x016c, code lost:
    
        if (r12 != r7) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ce A[Catch: all -> 0x02a3, TryCatch #2 {all -> 0x02a3, blocks: (B:103:0x014d, B:108:0x0157, B:111:0x0163, B:113:0x0167, B:120:0x017d, B:122:0x0191, B:123:0x0199, B:125:0x019f, B:127:0x01ad, B:130:0x01b6, B:133:0x01c2, B:134:0x01c5, B:135:0x01c8, B:137:0x01ce, B:138:0x01d2, B:206:0x029b, B:207:0x02a2), top: B:102:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0G(final X.C169917i6 r28, java.lang.String r29, final int r30) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169917i6.A0G(X.7i6, java.lang.String, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.2XM] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.2VY, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.7i7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2VY, android.os.Handler] */
    public C169917i6(C169827hw c169827hw, InterfaceC169907i5 interfaceC169907i5, String str) {
        Looper looper;
        Looper mainLooper = Looper.getMainLooper();
        C14360o3.A0B(mainLooper, 1);
        ?? handler = new Handler(mainLooper);
        this.A0C = handler;
        ?? obj = new Object();
        obj.A00 = new HashSet();
        this.A0I = obj;
        this.A0D = str;
        C169937i8 c169937i8 = new C169937i8(obj, interfaceC169907i5);
        this.A0H = c169937i8;
        this.A0F = c169937i8.A05.EpQ();
        this.A09 = new C169947i9(c169937i8);
        C14360o3.A0B(c169827hw, 0);
        C169827hw c169827hw2 = new C169827hw(c169827hw);
        c169827hw2.A02 = this;
        c169827hw2.A00 = new C2V9(this) { // from class: X.7iA
            public final WeakReference A00;

            {
                super(new C2VE(null, null), -1);
                this.A00 = new WeakReference(this);
            }

            @Override // X.C2V9
            public final /* bridge */ /* synthetic */ Object A00(Object obj2) {
                if (this.A00.get() == null) {
                    return null;
                }
                throw new NullPointerException("loadingState");
            }
        };
        this.A0J = c169827hw2;
        this.A06 = new ArrayList();
        this.A04 = new C169967iB();
        synchronized (C169917i6.class) {
            if (A0L == null) {
                HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
                AbstractC09770fa.A00(handlerThread);
                handlerThread.start();
                A0L = handlerThread.getLooper();
            }
            looper = A0L;
        }
        C14360o3.A0B(looper, 1);
        this.A0B = new C169977iC(this, new Handler(looper));
        this.A0A = new C169977iC(this, handler);
        this.A0E = new AtomicBoolean(false);
    }

    public static void A04() {
        if (C2XV.A01()) {
        } else {
            throw new RuntimeException(AnonymousClass001.A0g("Focus request not called from Main Thread (Current Thread:", Thread.currentThread().getName(), ")"));
        }
    }

    public static void A0F(C169917i6 c169917i6) {
        ArrayList arrayList;
        AbstractC169857hz abstractC169857hz;
        C2XV.A00();
        if (!c169917i6.A0F) {
            boolean isTracing = ComponentsSystrace.A00.isTracing();
            if (isTracing) {
                ComponentsSystrace.A02("applyChangeSetsToTargetUIThreadOnly");
            }
            try {
                synchronized (c169917i6) {
                    List list = c169917i6.A06;
                    arrayList = new ArrayList(list);
                    list.clear();
                    abstractC169857hz = c169917i6.A02;
                }
                c169917i6.A0E(abstractC169857hz, arrayList);
                if (isTracing) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
            }
        }
        throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
    }
}
