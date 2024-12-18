package X;

import android.graphics.PointF;
import com.instagram.api.schemas.VisualSearchSuggestedProductContainer;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductAutoTagMetadata;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Oes, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55225Oes {
    public static final ArrayList A02(UserSession userSession, List list, List list2, boolean z) {
        User user;
        String A00;
        C14360o3.A0B(userSession, 0);
        if (z) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                Product A07 = ((MediaSuggestedProductTag) obj).A07();
                if (A07 != null && (user = A07.A0B) != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                    boolean contains = list2.contains(A00);
                    if (Boolean.valueOf(contains) != null && contains) {
                        A1E.add(obj);
                    }
                }
            }
            if (A1E.size() == list.size() || !C18U.A06(C06090Tz.A05, userSession, 36317801073350243L)) {
                return AbstractC166987dD.A1F(A1E);
            }
        }
        return AbstractC166987dD.A1F(list);
    }

    public static final ArrayList A03(ArrayList arrayList, List list) {
        String str;
        C14360o3.A0B(list, 1);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(MSZ.A0v(it));
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Product A07 = ((MediaSuggestedProductTag) next).A07();
            if (A07 != null && (str = A07.A0H) != null && !A0q.contains(str)) {
                A1E.add(next);
            }
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0028, code lost:
    
        if (r7 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A05(X.C38686GzR r7, java.util.List r8) {
        /*
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            if (r7 == 0) goto L26
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L26
            java.util.ArrayList r6 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            X.GzN r0 = (X.C38682GzN) r0
            java.lang.String r0 = r0.A05
            r6.add(r0)
            goto L14
        L26:
            X.0sl r6 = X.C16930sl.A00
            if (r7 == 0) goto L42
        L2a:
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L42
            java.util.ArrayList r5 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L38:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L44
            X.MSZ.A1S(r5, r1)
            goto L38
        L42:
            X.0sl r5 = X.C16930sl.A00
        L44:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r3 = r8.iterator()
        L4c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.tagging.api.model.MediaSuggestedProductTag r1 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r1
            com.instagram.user.model.Product r0 = r1.A07()
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.A0H
            if (r0 == 0) goto L4c
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = r1.A04()
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L4c
            r4.add(r2)
            goto L4c
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55225Oes.A05(X.GzR, java.util.List):java.util.List");
    }

    public static final C38686GzR A00(C38686GzR c38686GzR, C38686GzR c38686GzR2) {
        ArrayList arrayList;
        if (c38686GzR != null && c38686GzR2 != null) {
            List A04 = A04(c38686GzR);
            if (!A04.isEmpty()) {
                List<C38682GzN> list = (List) c38686GzR2.A01;
                if (list != null) {
                    arrayList = AbstractC167017dG.A0q(list);
                    for (C38682GzN c38682GzN : list) {
                        if (A04.contains(c38682GzN.A04)) {
                            c38682GzN.A01 = EnumC53230NgS.A05;
                        }
                        arrayList.add(c38682GzN);
                    }
                } else {
                    arrayList = null;
                }
                return new C38686GzR(c38686GzR2.A00, arrayList, c38686GzR2.A04, c38686GzR2.A03, c38686GzR2.A02, 4);
            }
        }
        return c38686GzR2;
    }

    public static final List A04(C38686GzR c38686GzR) {
        List list = (List) c38686GzR.A01;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((C38682GzN) obj).A01 == EnumC53230NgS.A05) {
                    A1E.add(obj);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                MSZ.A1S(A0q, it);
            }
            return A0q;
        }
        return C16930sl.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0024, code lost:
    
        if (r7 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A06(X.C38686GzR r7, java.util.List r8) {
        /*
            if (r7 == 0) goto L22
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L22
            java.util.ArrayList r6 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L10:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            X.GzN r0 = (X.C38682GzN) r0
            java.lang.String r0 = r0.A05
            r6.add(r0)
            goto L10
        L22:
            X.0sl r6 = X.C16930sl.A00
            if (r7 == 0) goto L3e
        L26:
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L3e
            java.util.ArrayList r5 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L34:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            X.MSZ.A1S(r5, r1)
            goto L34
        L3e:
            X.0sl r5 = X.C16930sl.A00
        L40:
            if (r8 == 0) goto L6f
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r3 = r8.iterator()
        L4a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.tagging.model.Tag r1 = (com.instagram.tagging.model.Tag) r1
            java.lang.String r0 = r1.getId()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L6b
            java.lang.String r0 = r1.A04()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L4a
        L6b:
            r4.add(r2)
            goto L4a
        L6f:
            X.0sl r4 = X.C16930sl.A00
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55225Oes.A06(X.GzR, java.util.List):java.util.List");
    }

    public static final List A07(List list) {
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((MediaSuggestedProductTag) obj).A01 == EnumC53230NgS.A04) {
                    A1E.add(obj);
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    public static final List A09(List list) {
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                EnumC53230NgS enumC53230NgS = ((MediaSuggestedProductTag) obj).A01;
                if (enumC53230NgS == EnumC53230NgS.A05 || enumC53230NgS == EnumC53230NgS.A04) {
                    A1E.add(obj);
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    public static final List A0A(List list) {
        User user;
        String A00;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Product A0e = MSZ.A0e(it);
                if (A0e != null && (user = A0e.A0B) != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                    String str = A0e.A0H;
                    C14360o3.A0B(str, 0);
                    A1E.add(new VisualSearchSuggestedProductContainer(MSZ.A0D(A00), AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str))));
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    public static final void A0B(InterfaceC11380iw interfaceC11380iw, UserSession userSession, MediaSuggestedProductTag mediaSuggestedProductTag, String str, String str2, boolean z, boolean z2) {
        String str3;
        String id = mediaSuggestedProductTag.getId();
        String id2 = mediaSuggestedProductTag.getId();
        Float A08 = mediaSuggestedProductTag.A08();
        PointF pointF = mediaSuggestedProductTag.A00;
        EnumC53230NgS enumC53230NgS = mediaSuggestedProductTag.A01;
        C14360o3.A07(enumC53230NgS);
        if (z2) {
            str3 = "opt";
        } else {
            str3 = "seller";
        }
        AbstractC55216Oef.A05(pointF, null, interfaceC11380iw, userSession, enumC53230NgS, A08, 0, str2, str, id, id2, null, "reels", str3, 0, z);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.instagram.model.shopping.ProductTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    public static final boolean A0C(C51415MnN c51415MnN, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47Z c47z, C53615NnM c53615NnM, String str, int i, boolean z) {
        AbstractC167017dG.A1N(c47z, c53615NnM);
        ArrayList arrayList = c47z.A41;
        ArrayList A0q = AbstractC167017dG.A0q(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0q.add(MSZ.A0v(it));
        }
        List list = c53615NnM.A02;
        C14360o3.A07(list);
        boolean z2 = false;
        for (MediaSuggestedProductTag mediaSuggestedProductTag : A08(list)) {
            if (!A0q.contains(MSW.A13(mediaSuggestedProductTag))) {
                ArrayList arrayList2 = c47z.A41;
                Product A07 = mediaSuggestedProductTag.A07();
                PointF pointF = mediaSuggestedProductTag.A00;
                ProductAutoTagMetadata productAutoTagMetadata = new ProductAutoTagMetadata(mediaSuggestedProductTag.A00, mediaSuggestedProductTag.A08());
                ?? obj = new Object();
                obj.A03 = null;
                obj.A01 = null;
                obj.A00 = pointF;
                C14360o3.A0B(A07, 0);
                obj.A02 = A07.A01;
                obj.A01 = productAutoTagMetadata;
                EnumC53230NgS enumC53230NgS = EnumC53230NgS.A05;
                obj.A03 = enumC53230NgS.A00;
                arrayList2.add(obj);
                String A13 = MSW.A13(mediaSuggestedProductTag);
                String A132 = MSW.A13(mediaSuggestedProductTag);
                AbstractC55216Oef.A05(mediaSuggestedProductTag.A00, c51415MnN, interfaceC11380iw, userSession, enumC53230NgS, mediaSuggestedProductTag.A08(), null, str, "add", A13, A132, null, "feed", "seller", i, z);
                z2 = true;
            }
        }
        return z2;
    }

    public static final ArrayList A01(UserSession userSession, AnonymousClass841 anonymousClass841, EnumC53230NgS enumC53230NgS) {
        ArrayList arrayList;
        String str;
        AbstractC167017dG.A1P(userSession, anonymousClass841);
        ArrayList A1E = AbstractC166987dD.A1E();
        List CpK = anonymousClass841.CpK();
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Iterator it = CpK.iterator();
        while (it.hasNext()) {
            C47Z A0b = AbstractC50522MSa.A0b(userSession, it);
            if (A0b != null && (arrayList = A0b.A43) != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it2.next();
                    Product A07 = mediaSuggestedProductTag.A07();
                    if (A07 != null && (str = A07.A0H) != null && mediaSuggestedProductTag.A01 == enumC53230NgS && !A0l.contains(str)) {
                        A1E.add(mediaSuggestedProductTag);
                        A0l.add(str);
                    }
                }
            }
        }
        return A1E;
    }

    public static final List A08(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (((MediaSuggestedProductTag) obj).A01 == EnumC53230NgS.A05) {
                A1E.add(obj);
            }
        }
        return A1E;
    }
}
