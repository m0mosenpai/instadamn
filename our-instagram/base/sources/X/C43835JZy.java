package X;

import android.content.Context;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.JZy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43835JZy implements InterfaceC189068Yw, InterfaceC195548ku, InterfaceC195558kv {
    public int A00;
    public int A01;
    public GalleryItem A02;
    public List A03;
    public Map A04;
    public Map A05;
    public InterfaceC16660sJ A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public List A0C;
    public Map A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final C2GT A0J;
    public final C2GT A0K;
    public final C2GT A0L;
    public final C25671My A0M;
    public final UserSession A0N;
    public final C43838Ja1 A0O;
    public final MQK A0P;
    public final Comparator A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final List A0V;
    public final boolean A0W;
    public final C43888Jav A0X;
    public final C43838Ja1 A0Y;
    public final C43857JaN A0Z;
    public final C195448kk A0a;
    public final InterfaceC19390xP A0b;
    public final InterfaceC19390xP A0c;
    public final C05A A0d;
    public final boolean A0e;

    public static final boolean A03(GalleryItem galleryItem, boolean z) {
        Draft draft;
        C14360o3.A0B(galleryItem, 0);
        if (galleryItem.A09 == C05F.A01 && (((draft = galleryItem.A02) == null || !draft.A08) && z && galleryItem.A06())) {
            return false;
        }
        return true;
    }

    public final void A07() {
        long j;
        int size;
        C43837Ja0 c43837Ja0 = new C43837Ja0(null, null, null, 3);
        AtomicInteger atomicInteger = new AtomicInteger();
        if (this.A0B) {
            A01(new LZI(), c43837Ja0, atomicInteger);
        }
        List list = this.A0R;
        if (AbstractC166987dD.A1b(list)) {
            C43838Ja1 c43838Ja1 = this.A0O;
            A01(new LZG(c43838Ja1.A00), c43837Ja0, atomicInteger);
            C43836JZz c43836JZz = c43837Ja0.A00;
            AbstractC37301Gc2.A1T(Integer.valueOf(c43836JZz.A00), c43836JZz.A03, atomicInteger.get());
            if (c43838Ja1.A00.A02 != C05F.A0N && !this.A0A) {
                size = list.size();
                int i = this.A0F;
                if (size > i) {
                    size = i;
                }
            } else {
                size = list.size();
            }
            for (int i2 = 0; i2 < size; i2++) {
                A00((GalleryItem) list.get(i2), c43837Ja0, atomicInteger);
            }
            c43836JZz.A00++;
            A01(new LZG(this.A0Y.A00), c43837Ja0, atomicInteger);
        }
        List list2 = this.A0U;
        if (AbstractC166987dD.A1b(list2)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A00((GalleryItem) it.next(), c43837Ja0, atomicInteger);
            }
        }
        boolean A06 = C18U.A06(C06090Tz.A05, this.A0N, 36316645727670848L);
        List list3 = this.A0S;
        List list4 = this.A0T;
        Context context = this.A0I;
        if (A06) {
            C8l2 c8l2 = new C8l2(context);
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.addAll(list4);
            A1E.addAll(list3);
            C01T.A1D(A1E, this.A0Q);
            int size2 = A1E.size();
            int size3 = A1E.size();
            for (int i3 = 0; i3 < size3; i3++) {
                GalleryItem galleryItem = (GalleryItem) A1E.get(i3);
                A00(galleryItem, c43837Ja0, atomicInteger);
                int i4 = this.A0E;
                if (i3 % i4 == 0 || i4 + i3 >= size2) {
                    String A00 = c8l2.A00(new Date(LIK.A00.A01(galleryItem)));
                    C43836JZz c43836JZz2 = c43837Ja0.A00;
                    c43836JZz2.A01.add(A00);
                    c43836JZz2.A04.put(Integer.valueOf(c43836JZz2.A00), Integer.valueOf(r11.size() - 1));
                    c43836JZz2.A03.put(Integer.valueOf(c43836JZz2.A00), Integer.valueOf(atomicInteger.get()));
                    c43836JZz2.A00++;
                }
            }
        } else {
            C8l2 c8l22 = new C8l2(context);
            if (AbstractC166987dD.A1b(list4)) {
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    A00((GalleryItem) it2.next(), c43837Ja0, atomicInteger);
                }
            }
            int size4 = list3.size();
            int size5 = list3.size();
            for (int i5 = 0; i5 < size5; i5++) {
                GalleryItem galleryItem2 = (GalleryItem) list3.get(i5);
                A00(galleryItem2, c43837Ja0, atomicInteger);
                int i6 = this.A0E;
                if (i5 % i6 == 0 || i6 + i5 >= size4) {
                    Medium medium = galleryItem2.A00;
                    if (medium != null) {
                        j = medium.A0C * 1000;
                    } else {
                        j = 0;
                    }
                    String A002 = c8l22.A00(new Date(j));
                    C43836JZz c43836JZz3 = c43837Ja0.A00;
                    c43836JZz3.A01.add(A002);
                    c43836JZz3.A04.put(Integer.valueOf(c43836JZz3.A00), Integer.valueOf(r11.size() - 1));
                    c43836JZz3.A03.put(Integer.valueOf(c43836JZz3.A00), Integer.valueOf(atomicInteger.get()));
                    c43836JZz3.A00++;
                }
            }
        }
        if (this.A08) {
            A01(this.A0Z, c43837Ja0, atomicInteger);
        }
        if (this.A09) {
            A01(new LZH(), c43837Ja0, atomicInteger);
        }
        List list5 = c43837Ja0.A01;
        this.A03 = list5;
        C43836JZz c43836JZz4 = c43837Ja0.A00;
        this.A01 = c43836JZz4.A00;
        this.A0C = c43836JZz4.A01;
        this.A04 = c43836JZz4.A02;
        this.A05 = c43836JZz4.A03;
        this.A0D = c43836JZz4.A04;
        C43888Jav c43888Jav = this.A0X;
        C14360o3.A0B(list5, 0);
        ((C43830JZt) c43888Jav.A01).A0E.DoX(list5);
    }

    public final void A08(C24164Ann c24164Ann) {
        Integer num;
        if (c24164Ann != null) {
            num = Integer.valueOf(c24164Ann.A00);
        } else {
            num = null;
        }
        C24164Ann c24164Ann2 = (C24164Ann) this.A0J.A02();
        if (!C14360o3.A0K(num, c24164Ann2 != null ? Integer.valueOf(c24164Ann2.A00) : null)) {
            this.A0d.Egh(c24164Ann);
        }
    }

    public final void A09(String str, List list, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 2);
        List list2 = this.A0T;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(new GalleryItem((RemoteMedia) it.next()));
        }
        C43838Ja1 c43838Ja1 = this.A0Y;
        MX6 mx6 = c43838Ja1.A00;
        Integer num = (Integer) mx6.A01;
        String str2 = mx6.A04;
        Integer num2 = (Integer) mx6.A02;
        int i = mx6.A00;
        C14360o3.A0B(num, 0);
        AbstractC167027dH.A13(str2, str, num2);
        c43838Ja1.A00 = new MX6(num, num2, str2, str, i);
        c43838Ja1.A00(C05F.A00);
        this.A06 = interfaceC16660sJ;
        A07();
    }

    public final void A0A(List list, boolean z) {
        C14360o3.A0B(list, 0);
        this.A0A = z;
        List list2 = this.A0R;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Draft draft = (Draft) it.next();
            C14360o3.A0B(draft, 1);
            list2.add(new GalleryItem(draft, null, null, null, null, null, null, null, C05F.A01, draft.A04, -1));
        }
        C43838Ja1 c43838Ja1 = this.A0O;
        int size = list.size();
        MX6 mx6 = c43838Ja1.A00;
        Integer num = (Integer) mx6.A01;
        String str = mx6.A04;
        String str2 = mx6.A03;
        Integer num2 = (Integer) mx6.A02;
        C14360o3.A0B(num, 0);
        AbstractC167027dH.A13(str, str2, num2);
        c43838Ja1.A00 = new MX6(num, num2, str, str2, size);
        A02(this);
        A07();
    }

    @Override // X.InterfaceC189068Yw
    public final void EYj(List list, String str) {
        String str2 = str;
        C14360o3.A0B(list, 0);
        List list2 = this.A0S;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium medium = (Medium) it.next();
            String str3 = medium.A0X;
            C14360o3.A0B(str3, 0);
            C11L c11l = AbstractC195768lH.A00;
            String name = new File(str3).getName();
            C14360o3.A07(name);
            if (!c11l.A08(name)) {
                list2.add(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)));
            }
        }
        C43838Ja1 c43838Ja1 = this.A0Y;
        if (str == null) {
            str2 = "";
        }
        MX6 mx6 = c43838Ja1.A00;
        Integer num = (Integer) mx6.A01;
        String str4 = mx6.A04;
        Integer num2 = (Integer) mx6.A02;
        int i = mx6.A00;
        C14360o3.A0B(num, 0);
        AbstractC167027dH.A13(str4, str2, num2);
        c43838Ja1.A00 = new MX6(num, num2, str4, str2, i);
        c43838Ja1.A00(C05F.A00);
        A07();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (r19.A0V.indexOf(r20) <= (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(com.instagram.common.gallery.model.GalleryItem r20, X.C43837Ja0 r21, java.util.concurrent.atomic.AtomicInteger r22) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43835JZy.A00(com.instagram.common.gallery.model.GalleryItem, X.Ja0, java.util.concurrent.atomic.AtomicInteger):void");
    }

    private final void A01(InterfaceC66482zP interfaceC66482zP, C43837Ja0 c43837Ja0, AtomicInteger atomicInteger) {
        C43836JZz c43836JZz = c43837Ja0.A00;
        AbstractC37301Gc2.A1T(Integer.valueOf(c43836JZz.A00), c43836JZz.A03, atomicInteger.get());
        c43837Ja0.A01.add(interfaceC66482zP);
        AbstractC37301Gc2.A1T(Integer.valueOf(atomicInteger.get()), c43836JZz.A02, c43836JZz.A00);
        atomicInteger.incrementAndGet();
        c43836JZz.A00++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r2.A0R.size() <= r2.A0F) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r2.A0R.size() > r2.A0F) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r1 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = X.C05F.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C43835JZy r2) {
        /*
            boolean r0 = r2.A0e
            if (r0 == 0) goto L16
            java.util.List r0 = r2.A0R
            int r1 = r0.size()
            int r0 = r2.A0F
            if (r1 <= r0) goto L27
        Le:
            java.lang.Integer r1 = X.C05F.A0C
        L10:
            X.Ja1 r0 = r2.A0O
            r0.A00(r1)
            return
        L16:
            boolean r0 = r2.A07
            if (r0 != 0) goto L1d
            java.lang.Integer r1 = X.C05F.A01
            goto L10
        L1d:
            java.util.List r0 = r2.A0R
            int r1 = r0.size()
            int r0 = r2.A0F
            if (r1 > r0) goto Le
        L27:
            java.lang.Integer r1 = X.C05F.A00
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43835JZy.A02(X.JZy):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r1 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A04(com.instagram.common.gallery.model.GalleryItem r7) {
        /*
            r6 = this;
            java.util.List r3 = r6.A0R
            boolean r0 = X.AbstractC001800i.A0u(r3, r7)
            if (r0 != 0) goto L1a
            java.util.List r0 = r6.A0S
            boolean r0 = X.AbstractC001800i.A0u(r0, r7)
            if (r0 != 0) goto L1a
            java.util.List r0 = r6.A0T
            boolean r0 = X.AbstractC001800i.A0u(r0, r7)
            if (r0 != 0) goto L1a
            r2 = -1
            return r2
        L1a:
            java.lang.Integer r0 = r7.A09
            if (r0 == 0) goto L89
            int r1 = r0.intValue()
            r5 = 2
            r0 = 1
            if (r1 == r5) goto L2b
            if (r1 == r0) goto L82
            r0 = 0
            if (r1 != r0) goto L89
        L2b:
            boolean r0 = X.AbstractC166987dD.A1b(r3)
            if (r0 != 0) goto L32
            r5 = 0
        L32:
            com.instagram.common.session.UserSession r4 = r6.A0N
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316645727670848(0x8105cc00081240, double:3.0301312213491647E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L77
            java.util.List r2 = r6.A0S
            java.util.List r0 = r6.A0T
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            r1.addAll(r0)
            r1.addAll(r2)
            java.util.Comparator r0 = r6.A0Q
            X.C01T.A1D(r1, r0)
        L54:
            int r2 = r1.indexOf(r7)
            int r2 = r2 + r5
            X.Ja1 r0 = r6.A0O
            X.MX6 r0 = r0.A00
            java.lang.Object r1 = r0.A02
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto L72
            boolean r0 = r6.A0A
            if (r0 != 0) goto L72
            int r1 = r3.size()
            int r0 = r6.A0F
            if (r1 <= r0) goto L70
            r1 = r0
        L70:
            int r2 = r2 + r1
            return r2
        L72:
            int r1 = r3.size()
            goto L70
        L77:
            java.util.List r1 = r6.A0T
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L54
            java.util.List r1 = r6.A0S
            goto L54
        L82:
            int r0 = r3.indexOf(r7)
            int r2 = r0 + 1
            return r2
        L89:
            java.lang.String r0 = "Invalid view type"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43835JZy.A04(com.instagram.common.gallery.model.GalleryItem):int");
    }

    public final GalleryItem A05() {
        GalleryItem galleryItem = (GalleryItem) AbstractC001800i.A0J(this.A0S);
        GalleryItem A06 = A06();
        if (galleryItem != null && (A06 == null || this.A0Q.compare(galleryItem, A06) <= 0)) {
            return galleryItem;
        }
        return A06;
    }

    public final GalleryItem A06() {
        Object obj;
        Iterator it = this.A0T.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                GalleryItem galleryItem = (GalleryItem) obj;
                if (galleryItem.A04() && (!galleryItem.A06() || !WGT.A07(this.A0N, LIK.A00(galleryItem)))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (GalleryItem) obj;
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return AbstractC31172DnG.A19(this.A0V);
    }

    @Override // X.InterfaceC195558kv
    public final int BDU(int i) {
        return this.A0H;
    }

    @Override // X.InterfaceC195548ku
    public final int Brg(int i) {
        return AbstractC167017dG.A0K((Number) AbstractC166997dE.A0m(this.A0D, i));
    }

    @Override // X.InterfaceC195548ku
    public final List Brl() {
        return this.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A0N, 36319463225826764L) == false) goto L25;
     */
    @Override // X.InterfaceC189068Yw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EdU(com.instagram.common.gallery.model.GalleryItem r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L1f
            java.util.List r0 = r5.A0T
            boolean r0 = X.AbstractC001800i.A0u(r0, r6)
            if (r0 != 0) goto L20
            java.util.List r0 = r5.A0R
            boolean r0 = X.AbstractC001800i.A0u(r0, r6)
            if (r0 != 0) goto L20
            java.util.List r0 = r5.A0S
            boolean r0 = X.AbstractC001800i.A0u(r0, r6)
            if (r0 != 0) goto L20
            java.util.List r0 = r5.A0V
            r0.remove(r6)
        L1f:
            return
        L20:
            if (r7 == 0) goto L5a
            boolean r0 = r5.A07
            if (r0 != 0) goto L2b
            java.util.List r0 = r5.A0V
            r0.clear()
        L2b:
            java.util.List r4 = r5.A0V
            boolean r0 = r4.contains(r6)
            if (r0 != 0) goto L54
            int r1 = r4.size()
            int r0 = r5.A0G
            if (r1 < r0) goto L40
            boolean r0 = r5.A07
            if (r0 == 0) goto L40
            return
        L40:
            if (r8 != 0) goto L51
            com.instagram.common.session.UserSession r3 = r5.A0N
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319463225826764(0x81085c00021dcc, double:3.0319130185281204E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L54
        L51:
            r4.add(r6)
        L54:
            X.MQK r0 = r5.A0P
            r0.DSA(r6, r8)
            goto L77
        L5a:
            boolean r0 = r6.A05()
            if (r0 == 0) goto L77
            java.util.List r2 = r5.A0V
            int r1 = r2.indexOf(r6)
            r0 = -1
            if (r1 <= r0) goto L77
            r2.remove(r6)
            boolean r0 = X.AbstractC166987dD.A1b(r2)
            if (r0 == 0) goto L77
            X.MQK r0 = r5.A0P
            r0.DSB(r6, r8)
        L77:
            X.6WI r2 = X.C6WI.A01()
            java.util.List r0 = r5.A0V
            int r1 = r0.size()
            r2.A06 = r1
            int r0 = r2.A05
            int r0 = java.lang.Math.max(r0, r1)
            r2.A05 = r0
            java.lang.Integer r1 = r6.A09
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L94
            r0 = 1
            r2.A0K = r0
        L94:
            r5.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43835JZy.EdU(com.instagram.common.gallery.model.GalleryItem, boolean, boolean):void");
    }

    public C43835JZy(Context context, C43888Jav c43888Jav, UserSession userSession, MQK mqk, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A0N = userSession;
        this.A0I = context;
        this.A0X = c43888Jav;
        this.A0e = z;
        this.A0E = i;
        this.A0F = i2;
        this.A0G = i3;
        this.A0P = mqk;
        this.A0H = i4;
        this.A0W = z2;
        C16930sl c16930sl = C16930sl.A00;
        this.A03 = c16930sl;
        this.A04 = AbstractC06930Yk.A0E();
        this.A05 = AbstractC06930Yk.A0E();
        this.A0V = AbstractC166987dD.A1E();
        this.A0C = c16930sl;
        this.A0D = AbstractC06930Yk.A0E();
        Comparator reverseOrder = Collections.reverseOrder(C43881Jal.A00);
        C14360o3.A07(reverseOrder);
        this.A0Q = reverseOrder;
        this.A0S = AbstractC166987dD.A1E();
        this.A0U = AbstractC166987dD.A1E();
        this.A0T = AbstractC166987dD.A1E();
        this.A0R = AbstractC166987dD.A1E();
        this.A0Z = new C43857JaN();
        this.A0O = new C43838Ja1(C05F.A00);
        this.A0Y = new C43838Ja1(C05F.A0C);
        this.A0M = AbstractC25651Mw.A00(userSession);
        this.A06 = C43882Jam.A00;
        C195448kk A00 = AbstractC195438kj.A00(userSession);
        this.A0a = A00;
        C008002u A002 = C10E.A00(null);
        this.A0d = A002;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A0J = AbstractC58232lf.A00(anonymousClass191, A002);
        C0UO c0uo = A00.A05;
        C15150pV A16 = AbstractC43593JPy.A16(c0uo, A002, 10);
        this.A0c = A16;
        this.A0L = AbstractC58232lf.A00(anonymousClass191, A16);
        C15150pV A162 = AbstractC43593JPy.A16(c0uo, A002, 9);
        this.A0b = A162;
        this.A0K = AbstractC58232lf.A00(anonymousClass191, A162);
    }
}
