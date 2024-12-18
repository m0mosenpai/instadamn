package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Idv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41724Idv {
    public static final C41664Ibw A0B = new Object();
    public final String A00;
    public final Map A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16660sJ A03;
    public final boolean A04;
    public final ProductCardSubtitleType A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final HCI A08;
    public final C05A A09;
    public final boolean A0A;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C42337Ioz A02(X.C38688GzT r7, X.EnumC39623HeX r8) {
        /*
            r6 = this;
            r2 = 0
            r4 = 1
            java.lang.Object r0 = r7.A00
            X.GzQ r0 = (X.C38685GzQ) r0
            if (r0 == 0) goto Lf
            boolean r1 = X.C41664Ibw.A01(r0)
            r0 = 1
            if (r1 == r4) goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r3 = "_title_row"
            if (r0 == 0) goto L53
            java.lang.Object r0 = r7.A03
            X.GzQ r0 = (X.C38685GzQ) r0
            boolean r0 = X.C41664Ibw.A01(r0)
            if (r0 == 0) goto L53
            X.HeX r0 = X.EnumC39623HeX.A06
            if (r8 == r0) goto L53
            boolean r0 = r6.A04
            if (r0 != 0) goto L53
            X.HeX r1 = X.EnumC39623HeX.A04
            X.HeX r0 = X.EnumC39623HeX.A07
            java.lang.String r0 = r0.A00(r3)
            java.lang.String r5 = r1.A00(r0)
            r4 = 0
            r1 = 2131974011(0x7f13577b, float:1.9585074E38)
        L36:
            X.Vuj r0 = X.AbstractC37301Gc2.A0C(r1)
            X.Ioz r3 = new X.Ioz
            r3.<init>(r0, r4, r5)
        L3f:
            X.05A r2 = r6.A09
            java.lang.Object r1 = r2.getValue()
            java.util.Map r1 = (java.util.Map) r1
            X.0e4 r0 = X.AbstractC166987dD.A1L(r5, r3)
            java.util.Map r0 = X.AbstractC06930Yk.A0C(r1, r0)
            r2.Egh(r0)
            return r3
        L53:
            int r1 = r8.ordinal()
            if (r1 == r2) goto La5
            r2 = 0
            if (r1 == r4) goto L6a
            r0 = 2
            if (r1 == r0) goto L87
            X.HeX r0 = X.EnumC39623HeX.A05
            java.lang.String r5 = r0.A00(r3)
            r4 = 0
            r1 = 2131974019(0x7f135783, float:1.958509E38)
            goto L36
        L6a:
            X.HeX r0 = X.EnumC39623HeX.A07
            java.lang.String r5 = r0.A00(r3)
            boolean r0 = r6.A04
            r4 = 0
            r1 = 2131972790(0x7f1352b6, float:1.9582598E38)
            if (r0 != 0) goto L36
            r0 = 2131974023(0x7f135787, float:1.9585098E38)
            X.Vuj r1 = X.AbstractC37301Gc2.A0C(r0)
            boolean r0 = r6.A0A
            if (r0 == 0) goto L9f
            r0 = 2131974024(0x7f135788, float:1.95851E38)
            goto L9b
        L87:
            X.HeX r0 = X.EnumC39623HeX.A06
            java.lang.String r5 = r0.A00(r3)
            r0 = 2131974021(0x7f135785, float:1.9585094E38)
            X.Vuj r1 = X.AbstractC37301Gc2.A0C(r0)
            boolean r0 = r6.A0A
            if (r0 == 0) goto L9f
            r0 = 2131974020(0x7f135784, float:1.9585092E38)
        L9b:
            X.Vuj r2 = X.AbstractC37301Gc2.A0C(r0)
        L9f:
            X.Ioz r3 = new X.Ioz
            r3.<init>(r1, r2, r5)
            goto L3f
        La5:
            X.HeX r0 = X.EnumC39623HeX.A04
            java.lang.String r5 = r0.A00(r3)
            r4 = 0
            r1 = 2131973957(0x7f135745, float:1.9584964E38)
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41724Idv.A02(X.GzT, X.HeX):X.Ioz");
    }

    public static final List A00(C38685GzQ c38685GzQ, C41724Idv c41724Idv, EnumC39623HeX enumC39623HeX, java.util.Set set) {
        EnumC39622HeW enumC39622HeW;
        List list = (List) c38685GzQ.A02;
        C17u A0C = C17s.A0C(0, (int) Math.ceil(list.size() / 2.0d));
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0C.iterator();
        while (it.hasNext()) {
            int A00 = ((AbstractC16880sg) it).A00();
            C153126ug c153126ug = new C153126ug(list, A00 * 2, 2);
            if (c153126ug.A01() == 2 || (c38685GzQ.A01 instanceof C39335HZa)) {
                int ordinal = enumC39623HeX.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        enumC39622HeW = EnumC39622HeW.A0O;
                    } else {
                        enumC39622HeW = EnumC39622HeW.A0P;
                    }
                } else {
                    enumC39622HeW = EnumC39622HeW.A04;
                }
                String name = enumC39623HeX.name();
                Locale locale = Locale.ENGLISH;
                C14360o3.A08(locale);
                String str = null;
                C38670GzB c38670GzB = new C38670GzB(null, null, AbstractC31172DnG.A16(locale, name), null, null);
                int ceil = (int) Math.ceil(list.size() / 2.0d);
                C153336v2 c153336v2 = new C153336v2();
                boolean z = true;
                if (A00 != ceil - 1) {
                    z = false;
                }
                c153336v2.A00(A00, z);
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                Iterator it2 = c153126ug.iterator();
                while (it2.hasNext()) {
                    ProductFeedItem productFeedItem = (ProductFeedItem) it2.next();
                    String A0j = AbstractC37301Gc2.A0j(productFeedItem);
                    Map map = c41724Idv.A01;
                    String A0R = AnonymousClass001.A0R(enumC39623HeX.A01, AbstractC37301Gc2.A0j(productFeedItem));
                    Object obj = map.get(A0R);
                    if (obj == null) {
                        obj = new Object();
                        map.put(A0R, obj);
                    }
                    A1I.put(A0j, obj);
                }
                A1E.add(new C42335Iox(c41724Idv.A05, enumC39622HeW, new C41690IdJ(c153336v2, A1I), c38670GzB, c153126ug, str, str, set, A00, 130560));
            }
        }
        return A1E;
    }

    public static final List A01(C38685GzQ c38685GzQ, C41724Idv c41724Idv, EnumC39623HeX enumC39623HeX, java.util.Set set) {
        EnumC39622HeW enumC39622HeW;
        List list = (List) c38685GzQ.A02;
        UserSession userSession = c41724Idv.A07;
        InterfaceC11380iw interfaceC11380iw = c41724Idv.A06;
        HCI hci = c41724Idv.A08;
        String name = enumC39623HeX.name();
        Locale locale = Locale.ENGLISH;
        C14360o3.A08(locale);
        String A16 = AbstractC31172DnG.A16(locale, name);
        Integer num = C05F.A1F;
        int ordinal = enumC39623HeX.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                enumC39622HeW = EnumC39622HeW.A0C;
            } else {
                enumC39622HeW = EnumC39622HeW.A0O;
            }
        } else {
            enumC39622HeW = EnumC39622HeW.A0P;
        }
        return I7O.A00(interfaceC11380iw, userSession, enumC39622HeW, hci, hci, num, A16, null, list, set);
    }

    public C41724Idv(InterfaceC11380iw interfaceC11380iw, UserSession userSession, HCI hci, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        ProductCardSubtitleType productCardSubtitleType;
        this.A00 = str;
        this.A0A = z;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A08 = hci;
        this.A03 = interfaceC16660sJ;
        this.A02 = interfaceC16820sZ;
        this.A04 = z2;
        if (str == null) {
            productCardSubtitleType = ProductCardSubtitleType.A07;
        } else {
            productCardSubtitleType = ProductCardSubtitleType.A0E;
        }
        this.A05 = productCardSubtitleType;
        this.A01 = AbstractC166987dD.A1I();
        this.A09 = C10E.A00(AbstractC06930Yk.A0E());
    }
}
