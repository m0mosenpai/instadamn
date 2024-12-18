package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5qI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127895qI {
    public static final C127895qI A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        if (r11 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e5, code lost:
    
        if (r10 == false) goto L75;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.5z6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.instagram.common.session.UserSession r20, X.C130505uv r21, X.C130455uq r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127895qI.A05(com.instagram.common.session.UserSession, X.5uv, X.5uq, boolean):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC127945qN A08(X.C127915qK r21, X.C125475lt r22, X.C130505uv r23, X.C130505uv r24, X.C130455uq r25, X.EnumC130465ur r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127895qI.A08(X.5qK, X.5lt, X.5uv, X.5uv, X.5uq, X.5ur, boolean):X.5qN");
    }

    private final C128005qU A00(C130505uv c130505uv, C130455uq c130455uq, int i, int i2) {
        String A0c;
        C130485ut c130485ut = c130455uq.A01;
        C14360o3.A0A(c130485ut);
        C130505uv c130505uv2 = c130485ut.A09;
        if (c130505uv2 == null) {
            A0c = "Cannot make TwoByTwoSection with null 2x2 item";
        } else {
            C130485ut c130485ut2 = c130455uq.A01;
            C14360o3.A0A(c130485ut2);
            List list = c130485ut2.A0D;
            if (list == null) {
                A0c = "Cannot make TwoByTwoSection with null fill items";
            } else if (list.size() != 2) {
                A0c = AnonymousClass001.A0c("Cannot make TwoByTwoSection with ", " fill_items", list.size());
            } else {
                C125475lt c125475lt = c130455uq.A00;
                C14360o3.A0A(c125475lt);
                AbstractC127945qN A08 = A08(AbstractC127905qJ.A02(2, 2), c125475lt, c130505uv2, c130505uv, null, c130455uq.A02, true);
                if (A08 != null) {
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC127945qN A03 = A03((C130505uv) list.get(i3), c130505uv, null);
                        if (A03 != null) {
                            C5qT c5qT = new C5qT(i3, i2);
                            arrayList.add(A03);
                            linkedHashMap.put(A03, c5qT);
                        }
                    }
                    C5qT c5qT2 = new C5qT(0, i);
                    arrayList.add(i, A08);
                    linkedHashMap.put(A08, c5qT2);
                    return new C128005qU(c130505uv, arrayList, linkedHashMap, 2);
                }
                return null;
            }
        }
        C0w9.A03("DiscoveryRecyclerSectionTransformer", A0c);
        return null;
    }

    private final C128005qU A01(C130505uv c130505uv, C130455uq c130455uq, C130455uq c130455uq2, int i, int i2) {
        String A0c;
        C130485ut c130485ut = c130455uq.A01;
        C14360o3.A0A(c130485ut);
        C130505uv c130505uv2 = c130485ut.A08;
        if (c130505uv2 == null) {
            A0c = "Cannot make TwoByTwoSection with null 2x2 item";
        } else {
            C130485ut c130485ut2 = c130455uq.A01;
            C14360o3.A0A(c130485ut2);
            List list = c130485ut2.A0D;
            if (list == null) {
                A0c = "Cannot make TwoByTwoSection with null fill items";
            } else if (list.size() != 2) {
                A0c = AnonymousClass001.A0c("Cannot make TwoByTwoSection with ", " fill_items", list.size());
            } else {
                C125475lt c125475lt = c130455uq.A00;
                C14360o3.A0A(c125475lt);
                AbstractC127945qN A08 = A08(AbstractC127905qJ.A02(2, 2), c125475lt, c130505uv2, c130505uv, c130455uq2, c130455uq.A02, true);
                if (A08 != null) {
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC127945qN A03 = A03((C130505uv) list.get(i3), c130505uv, null);
                        if (A03 != null) {
                            C5qT c5qT = new C5qT(i3, i2);
                            arrayList.add(A03);
                            linkedHashMap.put(A03, c5qT);
                        }
                    }
                    C5qT c5qT2 = new C5qT(0, i);
                    arrayList.add(i, A08);
                    linkedHashMap.put(A08, c5qT2);
                    return new C128005qU(c130505uv, arrayList, linkedHashMap, 2);
                }
                return null;
            }
        }
        C0w9.A03("DiscoveryRecyclerSectionTransformer", A0c);
        return null;
    }

    private final C128005qU A02(C130505uv c130505uv, C130455uq c130455uq, C130455uq c130455uq2, int i, boolean z) {
        C130505uv c130505uv2;
        C130505uv c130505uv3;
        C38321qM c38321qM;
        String A0c;
        C130485ut c130485ut = c130455uq.A01;
        C14360o3.A0A(c130485ut);
        C130505uv c130505uv4 = c130485ut.A04;
        if (c130505uv4 == null) {
            A0c = "Cannot make OneByTwoSection with null 1x2 item";
        } else {
            C130485ut c130485ut2 = c130455uq.A01;
            C14360o3.A0A(c130485ut2);
            List list = c130485ut2.A0D;
            if (list == null) {
                A0c = "Cannot make OneByTwoSection with null fill items";
            } else if (list.size() != 4) {
                A0c = AnonymousClass001.A0c("Cannot make OneByTwoSection with ", " fill_items", list.size());
            } else {
                C125475lt c125475lt = c130455uq.A00;
                C14360o3.A0A(c125475lt);
                AbstractC127945qN A08 = A08(AbstractC127905qJ.A02(2, 1), c125475lt, c130505uv4, c130505uv, c130455uq2, c130455uq.A02, true);
                if (A08 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C17u c17u = new C17u(0, 2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : c17u) {
                    if (((Number) obj).intValue() != i) {
                        arrayList2.add(obj);
                    }
                }
                C130485ut c130485ut3 = c130455uq.A01;
                C14360o3.A0A(c130485ut3);
                C9BH c9bh = c130485ut3.A00;
                if (c9bh != null && (c38321qM = (C38321qM) c9bh.A00) != null) {
                    c130505uv2 = new C130505uv(EnumC130515uw.A0H, null, null, c38321qM);
                    c130505uv2.A01();
                } else {
                    c130505uv2 = null;
                }
                C130485ut c130485ut4 = c130455uq.A01;
                C14360o3.A0A(c130485ut4);
                Integer num = c130485ut4.A0C;
                if (num != null) {
                    c130505uv3 = (C130505uv) AbstractC001800i.A0O(list, num.intValue());
                } else {
                    c130505uv3 = null;
                }
                ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            break;
                        }
                        C130505uv c130505uv5 = (C130505uv) next;
                        C130485ut c130485ut5 = c130455uq.A01;
                        C14360o3.A0A(c130485ut5);
                        Integer num2 = c130485ut5.A0C;
                        if (num2 != null && i2 == num2.intValue() && z && c130505uv2 != null) {
                            c130505uv5 = c130505uv2;
                        }
                        AbstractC127945qN A03 = A00.A03(c130505uv5, c130505uv, c130505uv3);
                        if (A03 == null) {
                            return null;
                        }
                        arrayList3.add(A03);
                        i2 = i3;
                    } else {
                        int i4 = 0;
                        for (Object obj2 : arrayList3) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                int i6 = 1;
                                if (i4 < 2) {
                                    i6 = 0;
                                }
                                C5qT c5qT = new C5qT(i6, ((Number) arrayList2.get(i4 % 2)).intValue());
                                C14360o3.A0B(obj2, 0);
                                arrayList.add(obj2);
                                linkedHashMap.put(obj2, c5qT);
                                i4 = i5;
                            }
                        }
                        C5qT c5qT2 = new C5qT(0, i);
                        arrayList.add(i, A08);
                        linkedHashMap.put(A08, c5qT2);
                        return new C128005qU(c130505uv, arrayList, linkedHashMap, 2);
                    }
                }
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
        }
        C0w9.A03("DiscoveryRecyclerSectionTransformer", A0c);
        return null;
    }

    private final AbstractC127945qN A03(C130505uv c130505uv, C130505uv c130505uv2, C130505uv c130505uv3) {
        AbstractC127945qN c127995qS;
        EnumC130515uw enumC130515uw = c130505uv.A00;
        int ordinal = enumC130515uw.ordinal();
        if (ordinal != 1) {
            if (ordinal != 32) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot make 1x1 item with type ");
                sb.append(enumC130515uw);
                C0w9.A03("DiscoveryRecyclerSectionTransformer", sb.toString());
                return null;
            }
            if (c130505uv3 == null) {
                A07("one by one grid ad fallback item is null");
            }
            C127915qK A02 = AbstractC127905qJ.A02(1, 1);
            Object obj = c130505uv.A0F;
            C14360o3.A0A(obj);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            C38321qM c38321qM = (C38321qM) obj;
            C14360o3.A0B(c38321qM, 2);
            c127995qS = new C37931GmT(A02, c130505uv2, c130505uv3, c38321qM);
        } else {
            C127915qK A022 = AbstractC127905qJ.A02(1, 1);
            Object obj2 = c130505uv.A0F;
            C14360o3.A0A(obj2);
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            c127995qS = new C127995qS(A022, c130505uv2, (C38321qM) obj2);
        }
        return c127995qS;
    }

    private final AbstractC127945qN A04(C130505uv c130505uv, C130505uv c130505uv2, C130505uv c130505uv3, float f, boolean z) {
        AbstractC127945qN c127995qS;
        EnumC130515uw enumC130515uw = c130505uv.A00;
        int ordinal = enumC130515uw.ordinal();
        if (ordinal != 1) {
            if (ordinal != 32) {
                if (ordinal != 25) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot make dynamic 1x1 item with type ");
                    sb.append(enumC130515uw);
                    C0w9.A03("DiscoveryRecyclerSectionTransformer", sb.toString());
                    return null;
                }
                C127915qK c127915qK = new C127915qK(1, 1, 1, 1, f);
                Object obj = c130505uv.A0F;
                C14360o3.A0A(obj);
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.discovery.clips.model.ClipsUnit");
                c127995qS = new C127935qM((C130535uy) obj, c127915qK, z);
            } else {
                if (c130505uv3 == null) {
                    A07("one by one grid ad fallback item is null");
                }
                C127915qK c127915qK2 = new C127915qK(1, 1, 1, 1, f);
                Object obj2 = c130505uv.A0F;
                C14360o3.A0A(obj2);
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.media.Media");
                C38321qM c38321qM = (C38321qM) obj2;
                C14360o3.A0B(c38321qM, 2);
                c127995qS = new C37931GmT(c127915qK2, c130505uv2, c130505uv3, c38321qM);
            }
        } else {
            C127915qK c127915qK3 = new C127915qK(1, 1, 1, 1, f);
            Object obj3 = c130505uv.A0F;
            C14360o3.A0A(obj3);
            C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            c127995qS = new C127995qS(c127915qK3, c130505uv2, (C38321qM) obj3);
        }
        return c127995qS;
    }

    public static final ArrayList A06(UserSession userSession, C130505uv c130505uv, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object A05 = A05(userSession, c130505uv, (C130455uq) it.next(), false);
                if (A05 != null) {
                    if (A05 instanceof Collection) {
                        for (Object obj : (Iterable) A05) {
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList.add(A05);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void A07(String str) {
        C18950wb.A01.AEp(str, 817903268).report();
    }
}
