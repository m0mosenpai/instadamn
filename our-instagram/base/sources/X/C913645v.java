package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.45v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C913645v extends AbstractC913745w implements Serializable {
    public static final Class[] A01 = {Throwable.class};
    public static final C913645v A00 = new AbstractC913745w(new AnonymousClass461());

    public final RBV A0G(AnonymousClass469 anonymousClass469, AbstractC910944l abstractC910944l, C45B c45b, AbstractC63037SbC abstractC63037SbC) {
        RBV r9i;
        RBL A0H = abstractC63037SbC.A0H();
        if (A0H == null && (A0H = abstractC63037SbC.A0E()) == null) {
            anonymousClass469.A0Z(c45b, abstractC63037SbC, "No non-constructor mutator available", new Object[0]);
            throw C00O.createAndThrow();
        }
        AbstractC910944l A09 = A09(anonymousClass469, abstractC910944l, A0H);
        AbstractC63020Sal abstractC63020Sal = (AbstractC63020Sal) A09.A01;
        boolean z = A0H instanceof RBK;
        C45A c45a = c45b.A07.A04;
        if (z) {
            r9i = new R9j(A09, (RBK) A0H, abstractC63037SbC, abstractC63020Sal, c45a);
        } else {
            r9i = new R9i(A09, (RBJ) A0H, abstractC63037SbC, abstractC63020Sal, c45a);
        }
        JsonDeserializer A02 = AbstractC913745w.A02(anonymousClass469, A0H);
        if (A02 != null || (A02 = (JsonDeserializer) A09.A02) != null) {
            r9i = r9i.A04(anonymousClass469.A0C(r9i, A09, A02));
        }
        C62494SDw A092 = abstractC63037SbC.A09();
        if (A092 != null && A092.A00 == C05F.A00) {
            r9i.A01 = A092.A01;
        }
        SZ3 A0J = abstractC63037SbC.A0J();
        if (A0J != null) {
            r9i.A00 = A0J;
        }
        return r9i;
    }

    public static final void A00(AnonymousClass469 anonymousClass469, SQ5 sq5, C45B c45b) {
        AbstractC910944l abstractC910944l;
        RBV rbv;
        TI2 A02;
        SZ3 sz3 = c45b.A00;
        if (sz3 != null) {
            Class cls = sz3.A01;
            InterfaceC65236TgS interfaceC65236TgS = (InterfaceC65236TgS) C914045z.A03(sz3.A02, anonymousClass469.A03().A05());
            if (cls == AbstractC60563R8d.class) {
                C913945y c913945y = sz3.A00;
                Map map = sq5.A0D;
                String str = c913945y.A02;
                rbv = (RBV) map.get(str);
                if (rbv != null) {
                    abstractC910944l = rbv.A04;
                    A02 = new AbstractC60564R8e(sz3.A03);
                } else {
                    throw new IllegalArgumentException(String.format(AbstractC58317Pt9.A00(186), C914045z.A04(c45b.A05), C914045z.A08(str)));
                }
            } else {
                abstractC910944l = C910844k.A03(anonymousClass469.A0A(cls), TI2.class)[0];
                rbv = null;
                A02 = anonymousClass469.A02(sz3);
            }
            sq5.A03 = new C64520THn(A02, interfaceC65236TgS, abstractC910944l, anonymousClass469.A0E(abstractC910944l), sz3.A00, rbv);
        }
    }

    public static final void A01(SQ5 sq5, C45B c45b) {
        Map emptyMap;
        C63027Sax c63027Sax = c45b.A08;
        if (c63027Sax != null) {
            if (!c63027Sax.A0A) {
                c63027Sax.A02();
            }
            emptyMap = c63027Sax.A01;
        } else {
            emptyMap = Collections.emptyMap();
        }
        if (emptyMap != null) {
            for (Map.Entry entry : emptyMap.entrySet()) {
                RBL rbl = (RBL) entry.getValue();
                C913945y A002 = C913945y.A00(rbl.A05());
                AbstractC910944l A03 = rbl.A03();
                Object key = entry.getKey();
                if (sq5.A08 == null) {
                    sq5.A08 = new ArrayList();
                }
                C912845h c912845h = sq5.A0A;
                if (c912845h.A05()) {
                    try {
                        rbl.A0D(c912845h.A07());
                    } catch (IllegalArgumentException e) {
                        sq5.A03(e);
                        throw C00O.createAndThrow();
                    }
                }
                sq5.A08.add(new C60581R8w(A03, A002, rbl, key));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x032f, code lost:
    
        if (X.C63242Sfw.A02(r2.A0L(), r30.A06, r30.A07) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0342, code lost:
    
        r11 = r2.A0G();
        r10 = A09(r29, r11.A03(), r11);
        r1 = new X.R9h(r10, r11, r2, (X.AbstractC63020Sal) r10.A01, r0.A04);
        r0 = X.AbstractC913745w.A02(r29, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x036b, code lost:
    
        if (r0 != null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x036d, code lost:
    
        r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r10.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0371, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0373, code lost:
    
        r1 = r1.A04(r29.A0C(r1, r10, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0340, code lost:
    
        if (r2.A0B().A06 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x01af, code lost:
    
        if (r0 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dd, code lost:
    
        if (r3.A08(X.C45Y.A0C) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0251, code lost:
    
        if (r0 != null) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(X.AnonymousClass469 r29, X.SQ5 r30, X.C45B r31) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C913645v.A0I(X.469, X.SQ5, X.45B):void");
    }

    public final void A0H(AnonymousClass469 anonymousClass469, SQ5 sq5, C45B c45b) {
        String str;
        String A08;
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (AbstractC63037SbC abstractC63037SbC : c45b.A03()) {
            C62494SDw A09 = abstractC63037SbC.A09();
            if (A09 != null && A09.A00 == C05F.A01) {
                String str2 = A09.A01;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(str2);
                } else if (!hashSet.add(str2)) {
                    AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
                    if (str2 == null) {
                        A08 = "[null]";
                    } else {
                        A08 = C914045z.A08(str2);
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0R("Multiple back-reference properties with name ", A08));
                }
                arrayList.add(abstractC63037SbC);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC63037SbC abstractC63037SbC2 = (AbstractC63037SbC) it.next();
                C62494SDw A092 = abstractC63037SbC2.A09();
                if (A092 == null) {
                    str = null;
                } else {
                    str = A092.A01;
                }
                RBV A0G = A0G(anonymousClass469, abstractC63037SbC2.A0A(), c45b, abstractC63037SbC2);
                if (sq5.A05 == null) {
                    sq5.A05 = new HashMap(4);
                }
                C912845h c912845h = sq5.A0A;
                if (c912845h.A05()) {
                    try {
                        A0G.A0J(c912845h);
                    } catch (IllegalArgumentException e) {
                        sq5.A03(e);
                        throw C00O.createAndThrow();
                    }
                }
                sq5.A05.put(str, A0G);
            }
        }
    }
}
