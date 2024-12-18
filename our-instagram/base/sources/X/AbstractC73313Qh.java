package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73313Qh {
    /* JADX WARN: Multi-variable type inference failed */
    public static C3NQ A00(C3W0 c3w0, IGUserHighlightsTrayType iGUserHighlightsTrayType, InterfaceC114865Gw interfaceC114865Gw, C3NM c3nm, InterfaceC37791pH interfaceC37791pH, C3NQ c3nq, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, List list, List list2, List list3, List list4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        ArrayList arrayList3;
        ArrayList arrayList4 = null;
        new C1DY((C1DV) new C37761pD(null), 6, false);
        if (c3nq instanceof C73323Qi) {
            if (list != null) {
                arrayList3 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC37961pd interfaceC37961pd = (InterfaceC37961pd) it.next();
                    if (interfaceC37961pd != null) {
                        arrayList3.add(interfaceC37961pd.F7o());
                    }
                }
            } else {
                arrayList3 = null;
            }
            C09530e4 c09530e4 = new C09530e4("broadcasts", arrayList3);
            C09530e4 c09530e42 = new C09530e4(AbstractC58317Pt9.A00(235), str);
            C09530e4 c09530e43 = new C09530e4("client_hints", c3w0 != null ? c3w0.F7o() : null);
            C09530e4 c09530e44 = new C09530e4("cursor", str2);
            C09530e4 c09530e45 = new C09530e4(AbstractC58317Pt9.A00(286), bool);
            C09530e4 c09530e46 = new C09530e4("highlights_tray_type", iGUserHighlightsTrayType != null ? iGUserHighlightsTrayType.A00 : null);
            C09530e4 c09530e47 = new C09530e4(AbstractC58317Pt9.A00(302), bool2);
            C09530e4 c09530e48 = new C09530e4(AbstractC58317Pt9.A00(310), num);
            C09530e4 c09530e49 = new C09530e4(AbstractC58317Pt9.A00(311), num2);
            C09530e4 c09530e410 = new C09530e4("my_week_enabled", bool3);
            C09530e4 c09530e411 = new C09530e4(AbstractC58317Pt9.A00(315), num3);
            C09530e4 c09530e412 = new C09530e4(AbstractC58317Pt9.A00(338), c3nm != null ? c3nm.F7o() : null);
            C09530e4 c09530e413 = new C09530e4(AbstractC58317Pt9.A00(351), num4);
            C09530e4 c09530e414 = new C09530e4(AbstractC111324zv.A00(516), list2);
            C09530e4 c09530e415 = new C09530e4(AbstractC111324zv.A00(3025), list3);
            C09530e4 c09530e416 = new C09530e4(AbstractC111324zv.A00(3065), interfaceC37791pH != null ? interfaceC37791pH.F7o() : null);
            C09530e4 c09530e417 = new C09530e4(AbstractC111324zv.A00(3079), interfaceC114865Gw != null ? interfaceC114865Gw.F7o() : null);
            C09530e4 c09530e418 = new C09530e4(AbstractC58317Pt9.A00(372), bool4);
            C09530e4 c09530e419 = new C09530e4("story_ranking_token", str3);
            if (list4 != null) {
                arrayList4 = new ArrayList();
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    InterfaceC37791pH interfaceC37791pH2 = (InterfaceC37791pH) it2.next();
                    if (interfaceC37791pH2 != null) {
                        arrayList4.add(interfaceC37791pH2.F7o());
                    }
                }
            }
            TreeJNI treeJNI = (TreeJNI) c3nq;
            Object applyToTree = new TreeUpdaterJNI(AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, c09530e49, c09530e410, c09530e411, c09530e412, c09530e413, c09530e414, c09530e415, c09530e416, c09530e417, c09530e418, c09530e419, new C09530e4("tray", arrayList4)), treeJNI).applyToTree(treeJNI);
            C14360o3.A07(applyToTree);
            obj = applyToTree;
        } else {
            C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
            if (list != null) {
                arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((InterfaceC37961pd) it3.next()).ErP(c1dy));
                }
            } else {
                arrayList = null;
            }
            C74433Vz Ero = c3w0 != null ? c3w0.Ero(c1dy) : null;
            C3NK Exv = c3nm != null ? c3nm.Exv() : null;
            C37771pE F5R = interfaceC37791pH != null ? interfaceC37791pH.F5R(c1dy) : null;
            C114855Gv Exu = interfaceC114865Gw != null ? interfaceC114865Gw.Exu(c1dy) : null;
            if (list4 != null) {
                arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((InterfaceC37791pH) it4.next()).F5R(c1dy));
                }
            } else {
                arrayList2 = null;
            }
            obj = new C3NO(Ero, iGUserHighlightsTrayType, Exu, Exv, F5R, bool, bool2, bool3, bool4, num, num2, num3, num4, str, str2, str3, arrayList, list2, list3, arrayList2);
        }
        return (C3NQ) obj;
    }
}
