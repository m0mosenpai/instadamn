package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.LIk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47974LIk {
    public C48599Leb A00;
    public IgdsInlineSearchBox A01;
    public Integer A02;
    public Integer A03;
    public C1I4 A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final C57312k6 A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final UserSession A0B;
    public final LJZ A0C;
    public final C47402Kwr A0D;
    public final C44539Jmj A0E;
    public final KNH A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final InterfaceC09390do A0J;
    public final boolean A0K;
    public final IgSegmentedTabLayout2 A0L;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x015e, code lost:
    
        if (r21.A06 == 29) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0160, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0161, code lost:
    
        if (r6 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0163, code lost:
    
        r1 = r21.A07;
        r0 = 2131959560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0168, code lost:
    
        r0 = r1.getString(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x016c, code lost:
    
        r3.setText(r0);
        r3.setVisibility(r2);
        X.AbstractC23641Du.A03(r4, X.AnonymousClass191.A00, new X.MCO(r21, (X.InterfaceC23621Ds) null, 31), r21.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0181, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0186, code lost:
    
        if (r21.A06 != 29) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0188, code lost:
    
        r1 = r21.A07;
        r0 = 2131959561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x018e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0195, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C47974LIk(android.content.Context r22, android.view.View r23, X.C57312k6 r24, X.InterfaceC11380iw r25, com.instagram.common.session.UserSession r26, X.C47402Kwr r27, X.C44539Jmj r28, com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2 r29, java.lang.String r30, java.lang.String r31, int r32, int r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47974LIk.<init>(android.content.Context, android.view.View, X.2k6, X.0iw, com.instagram.common.session.UserSession, X.Kwr, X.Jmj, com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2, java.lang.String, java.lang.String, int, int, boolean, boolean):void");
    }

    public static final List A00(C47974LIk c47974LIk, List list, List list2) {
        UserSession userSession = c47974LIk.A0B;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36326738900367423L) && AbstractC166987dD.A1b(list) && !C18U.A06(c06090Tz, userSession, 36328027390491696L)) {
            return AbstractC001800i.A0S(list2, AbstractC166987dD.A1J(new L0O(EnumC61184Rgk.A0A, list)));
        }
        return list2;
    }

    public static final void A01(C47974LIk c47974LIk, List list) {
        Drawable drawable;
        IgSegmentedTabLayout2 igSegmentedTabLayout2 = c47974LIk.A0L;
        if (igSegmentedTabLayout2 != null) {
            C44436Jks c44436Jks = igSegmentedTabLayout2.A04;
            c44436Jks.removeAllViews();
            c44436Jks.A02 = -1;
            c44436Jks.A00 = -1;
            C1I4 c1i4 = c47974LIk.A04;
            if (c1i4 != null) {
                c47974LIk.A0A.A15(c1i4);
            }
            if (list.size() >= 2) {
                igSegmentedTabLayout2.A00 = -1;
                igSegmentedTabLayout2.A06 = false;
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    L0O l0o = (L0O) obj;
                    Integer num = l0o.A00.A01;
                    if (num != null) {
                        Drawable drawable2 = c47974LIk.A07.getDrawable(num.intValue());
                        if (drawable2 != null) {
                            drawable = drawable2.mutate();
                        } else {
                            drawable = null;
                        }
                        igSegmentedTabLayout2.A01(new LPK(i, 3, igSegmentedTabLayout2, c47974LIk, l0o), new C47673L3g(drawable, null, null, -1, true));
                    }
                    i = i2;
                }
                igSegmentedTabLayout2.A00(0, true);
                UHO uho = new UHO(2, igSegmentedTabLayout2, list, c47974LIk);
                c47974LIk.A0A.A14(uho);
                c47974LIk.A04 = uho;
            }
        }
    }

    public final void A02() {
        Object A0j;
        Object A0l;
        java.util.Set A0l2;
        java.util.Set set;
        Integer num = C05F.A01;
        this.A03 = num;
        C44539Jmj c44539Jmj = this.A0E;
        String str = this.A0G;
        int i = this.A06;
        boolean z = this.A0K;
        C05A c05a = c44539Jmj.A07;
        if (z) {
            A0j = AbstractC31171DnF.A0l();
        } else {
            UserSession userSession = c44539Jmj.A01;
            List A02 = AbstractC47991LKc.A02(userSession);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                C148336m3 A05 = C148336m3.A04.A05(userSession, A1B);
                if (A05 == null || !C18U.A06(C06090Tz.A05, userSession, 36314863315716983L)) {
                    A05 = C168157fA.A01(A1B);
                }
                A1E.add(A05);
            }
            A0j = AbstractC001800i.A0j(A1E);
        }
        c05a.Egh(A0j);
        if (i == 29 && str != null) {
            KZ7 kz7 = c44539Jmj.A03;
            if (c44539Jmj.A00 == num) {
                A0l2 = AbstractC001800i.A0j(AbstractC31172DnG.A0w(c44539Jmj.A06));
            } else {
                A0l2 = AbstractC31171DnF.A0l();
            }
            synchronized (kz7) {
                List A12 = AbstractC43592JPx.A12(str, OT9.A01.A00);
                if (A12 != null) {
                    set = AbstractC001800i.A0j(A12);
                    ArrayList A0q = AbstractC167017dG.A0q(A0l2);
                    Iterator it2 = A0l2.iterator();
                    while (it2.hasNext()) {
                        A0q.add(((C148336m3) it2.next()).A02);
                    }
                    set.addAll(A0q);
                } else {
                    set = null;
                }
            }
            if (set != null) {
                C05A c05a2 = c44539Jmj.A06;
                ArrayList A0q2 = AbstractC167017dG.A0q(set);
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    A0q2.add(C168157fA.A01(AbstractC166987dD.A1B(it3)));
                }
                c05a2.Egh(AbstractC001800i.A0j(C44539Jmj.A00(A0q2)));
            }
        }
        LinkedHashSet A0l3 = AbstractC31171DnF.A0l();
        for (C148336m3 c148336m3 : AbstractC31172DnG.A0w(c44539Jmj.A06)) {
            C148336m3[] A022 = AbstractC170297ii.A02(c148336m3.A02, false);
            if (A022.length == 0) {
                A0l3.add(c148336m3);
            } else {
                AnonymousClass016.A18(A0l3, A022);
            }
        }
        C05A c05a3 = c44539Jmj.A08;
        if (!z) {
            if (!C18U.A06(C06090Tz.A05, c44539Jmj.A01, 36328027390491696L)) {
                ArrayList A023 = c44539Jmj.A04.A02();
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it4 = A023.iterator();
                while (it4.hasNext()) {
                    C148336m3 c148336m32 = ((C23726Aez) it4.next()).A04;
                    if (c148336m32 != null) {
                        A1E2.add(c148336m32);
                    }
                }
                ArrayList A1E3 = AbstractC166987dD.A1E();
                for (Object obj : A1E2) {
                    AbstractC25228BEl.A1Q(obj, A1E3, A0l3.contains(obj) ? 1 : 0);
                }
                A0l = AbstractC001800i.A0j(A1E3);
                c05a3.Egh(A0l);
                c44539Jmj.A01((java.util.Set) c44539Jmj.A09.getValue(), i);
            }
        }
        A0l = AbstractC31171DnF.A0l();
        c05a3.Egh(A0l);
        c44539Jmj.A01((java.util.Set) c44539Jmj.A09.getValue(), i);
    }
}
