package X;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sax, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63027Sax {
    public HashSet A00;
    public LinkedHashMap A01;
    public LinkedHashMap A02;
    public LinkedList A03;
    public LinkedList A04;
    public LinkedList A05;
    public LinkedList A06;
    public LinkedList A07;
    public LinkedList A08;
    public LinkedList A09;
    public boolean A0A;
    public final C44W A0B;
    public final AbstractC910944l A0C;
    public final C45T A0D;
    public final SN9 A0E;
    public final AnonymousClass454 A0F;
    public final C45M A0G;
    public final boolean A0H;
    public final boolean A0I;

    public static final boolean A00(RBQ rbq, List list) {
        if (list != null) {
            String str = rbq.A05.A02;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((RBQ) list.get(i)).A05.A02.equals(str)) {
                    list.set(i, rbq);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A03(TIB tib, RBL rbl) {
        if (tib != null) {
            Object obj = tib.A01;
            LinkedHashMap linkedHashMap = this.A01;
            if (linkedHashMap == null) {
                linkedHashMap = AbstractC166987dD.A1I();
                this.A01 = linkedHashMap;
            }
            Object put = linkedHashMap.put(obj, rbl);
            if (put != null && put.getClass() == rbl.getClass()) {
                String A0h = MSY.A0h(obj);
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Duplicate injectable value with id '");
                A1C.append(obj);
                A1C.append("' (of type ");
                A1C.append(A0h);
                throw AbstractC58320PtC.A0m(")", A1C);
            }
        }
    }

    public final void A04(RBI rbi, Map map) {
        boolean z;
        EnumC61114RfU A03;
        RBQ A01;
        C44W c44w = this.A0B;
        C913945y A0D = c44w.A0D(rbi);
        if (A0D != null) {
            z = true;
            if (!A0D.A02()) {
                if ("".isEmpty()) {
                    String str = A0D.A02;
                    A01 = (RBQ) map.get(str);
                    if (A01 == null) {
                        A01 = new RBQ(c44w, A0D, A0D, this.A0D, this.A0H);
                        map.put(str, A01);
                    }
                    A01.A00 = new SQA(A0D, A01.A00, rbi, z, true, false);
                    this.A07.add(A01);
                }
                A01 = A01("", map);
                A01.A00 = new SQA(A0D, A01.A00, rbi, z, true, false);
                this.A07.add(A01);
            }
        }
        z = false;
        if ("".isEmpty() || (A03 = c44w.A03(rbi.A02)) == null || A03 == EnumC61114RfU.DISABLED) {
            return;
        }
        A0D = C913945y.A00("");
        A01 = A01("", map);
        A01.A00 = new SQA(A0D, A01.A00, rbi, z, true, false);
        this.A07.add(A01);
    }

    public final void A05(String str) {
        if (!this.A0H && str != null) {
            HashSet hashSet = this.A00;
            if (hashSet == null) {
                hashSet = AbstractC166987dD.A1H();
                this.A00 = hashSet;
            }
            hashSet.add(str);
        }
    }

    public C63027Sax(AbstractC910944l abstractC910944l, C45T c45t, SN9 sn9, AnonymousClass454 anonymousClass454, boolean z) {
        C44W c44w;
        this.A0D = c45t;
        this.A0H = z;
        this.A0C = abstractC910944l;
        this.A0F = anonymousClass454;
        if (c45t.A06()) {
            this.A0I = true;
            c44w = c45t.A00();
        } else {
            c44w = C60580R8v.A00;
        }
        this.A0B = c44w;
        this.A0G = c45t.A03(anonymousClass454, abstractC910944l.A00);
        this.A0E = sn9;
    }

    public final RBQ A01(String str, Map map) {
        RBQ rbq = (RBQ) map.get(str);
        if (rbq == null) {
            C45T c45t = this.A0D;
            C44W c44w = this.A0B;
            boolean z = this.A0H;
            C913945y A00 = C913945y.A00(str);
            RBQ rbq2 = new RBQ(c44w, A00, A00, c45t, z);
            map.put(str, rbq2);
            return rbq2;
        }
        return rbq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x020d, code lost:
    
        if (r6 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03d4, code lost:
    
        if (r5 != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x04cf, code lost:
    
        if (r5 != r7) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r22.A0D.A08(X.C45Y.A08) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0648, code lost:
    
        if (r5 != null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x06d8, code lost:
    
        if (r6.A02 == null) goto L417;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x03df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x07b5 A[LOOP:26: B:598:0x07af->B:600:0x07b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0899 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            Method dump skipped, instructions count: 2223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63027Sax.A02():void");
    }

    public final void A06(String str, Object... objArr) {
        String format = String.format(str, objArr);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Problem with definition of ");
        A1C.append(this.A0F);
        throw AbstractC166987dD.A12(MSZ.A0u(": ", format, A1C));
    }
}
