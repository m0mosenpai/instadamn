package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.5je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124245je {
    public final Map A00;
    public final InterfaceC09390do A01;
    public final C18920wW A02;
    public final String A03;

    public final void A00(EnumC124255jf enumC124255jf, Integer num, List list) {
        java.util.Set set;
        long j;
        Long A0k;
        if (((Boolean) this.A01.getValue()).booleanValue()) {
            C18920wW c18920wW = this.A02;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_client_cache_remove_media");
            ArrayList<C38321qM> arrayList = new ArrayList();
            for (Object obj : list) {
                C38321qM c38321qM = (C38321qM) obj;
                Iterable iterable = (Iterable) this.A00.get(enumC124255jf);
                if (iterable == null || !AbstractC001800i.A0u(iterable, c38321qM.A38())) {
                    arrayList.add(obj);
                }
            }
            arrayList.size();
            if (!arrayList.isEmpty() && A00.isSampled()) {
                A00.AAP("cache_type", enumC124255jf.A00);
                A00.AAP("viewer_session_id", this.A03);
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                for (C38321qM c38321qM2 : arrayList) {
                    C0Zx c0Zx = new C0Zx();
                    String A38 = c38321qM2.A38();
                    if (A38 != null && (A0k = AbstractC003100w.A0k(10, A38)) != null) {
                        j = A0k.longValue();
                    } else {
                        j = -1;
                    }
                    c0Zx.A05("ig_media_id", Long.valueOf(j));
                    arrayList2.add(c0Zx);
                }
                A00.AAk("medias", arrayList2);
                A00.AAP("reason", "SEEN");
                A00.Cht();
                if (num == C05F.A00 && (set = (java.util.Set) this.A00.get(enumC124255jf)) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String A382 = ((C38321qM) it.next()).A38();
                        if (A382 != null) {
                            arrayList3.add(A382);
                        }
                    }
                    set.addAll(arrayList3);
                }
            }
        }
    }

    public final void A01(EnumC124255jf enumC124255jf, List list) {
        long j;
        Long A0k;
        if (((Boolean) this.A01.getValue()).booleanValue()) {
            C18920wW c18920wW = this.A02;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_client_cache_add_media");
            if (A00.isSampled()) {
                A00.AAP("cache_type", enumC124255jf.A00);
                A00.AAP("viewer_session_id", this.A03);
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C38321qM c38321qM = (C38321qM) it.next();
                    C0Zx c0Zx = new C0Zx();
                    String A38 = c38321qM.A38();
                    if (A38 != null && (A0k = AbstractC003100w.A0k(10, A38)) != null) {
                        j = A0k.longValue();
                    } else {
                        j = -1;
                    }
                    c0Zx.A05("ig_media_id", Long.valueOf(j));
                    arrayList.add(c0Zx);
                }
                A00.AAk("medias", arrayList);
                A00.Cht();
            }
        }
    }

    public C124245je(UserSession userSession) {
        this.A02 = AbstractC12220kQ.A02(userSession);
        this.A03 = AbstractC37497GfF.A00(userSession).A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC124255jf.A03, new LinkedHashSet());
        linkedHashMap.put(EnumC124255jf.A04, new LinkedHashSet());
        this.A00 = linkedHashMap;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C206829Dn(userSession, 11));
    }
}
