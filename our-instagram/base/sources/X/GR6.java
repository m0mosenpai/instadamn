package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class GR6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ G3O A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ WeakReference A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    public GR6(G3O g3o, String str, String str2, String str3, WeakReference weakReference, List list, List list2, int i) {
        this.A07 = list;
        this.A05 = weakReference;
        this.A06 = list2;
        this.A01 = g3o;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A02 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Long l;
        Object obj;
        Integer num;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List<C45123Jxs> list = this.A07;
        List list2 = this.A06;
        String str = this.A02;
        G3O g3o = this.A01;
        for (C45123Jxs c45123Jxs : list) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((C160787Im) obj).A0e.A0i(), c45123Jxs.A03)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C160787Im c160787Im = (C160787Im) obj;
            if (c160787Im != null) {
                String str2 = c45123Jxs.A02;
                if (C14360o3.A0K(str2, "RATE_LIMIT_EXCEEDED")) {
                    num = C05F.A00;
                } else if (str2 == null) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0N;
                }
                C83403nh c83403nh = c160787Im.A0e;
                c83403nh.A1I(c45123Jxs.A05);
                c83403nh.A1H(str);
                g3o.A01.BT6().EZ9(num, c45123Jxs.A03, false);
                if (str2 != null) {
                    Object obj2 = A1I.get(str2);
                    if (obj2 == null) {
                        obj2 = 0;
                        A1I.put(str2, obj2);
                    }
                    A1I.put(str2, Integer.valueOf(AbstractC166987dD.A0H(obj2) + 1));
                }
                Number number = (Number) c45123Jxs.A01;
                if (number != null && number.intValue() == 0) {
                    Object obj3 = A1I.get("ZERO_CONFIDENCE_SCORE");
                    if (obj3 == null) {
                        obj3 = 0;
                        A1I.put("ZERO_CONFIDENCE_SCORE", obj3);
                    }
                    A1I.put("ZERO_CONFIDENCE_SCORE", Integer.valueOf(AbstractC166987dD.A0H(obj3) + 1));
                }
            }
        }
        if (!A1I.isEmpty()) {
            Object obj4 = A1I.get("RATE_LIMIT_EXCEEDED");
            if (obj4 == null) {
                obj4 = 0;
            }
            if (AbstractC166987dD.A0H(obj4) > 0) {
                C9GR.A01((Context) this.A05.get(), "TranslationError", 2131958851, 0);
            }
            Object obj5 = A1I.get("UNSUPPORTED_LANG_PAIR");
            if (obj5 == null) {
                obj5 = 0;
            }
            int A0H = AbstractC166987dD.A0H(obj5);
            Object obj6 = A1I.get("SOURCE_AND_TARGET_LANG_SAME");
            if (obj6 == null) {
                obj6 = 0;
            }
            int A0H2 = AbstractC166987dD.A0H(obj6);
            Object obj7 = A1I.get("ZERO_CONFIDENCE_SCORE");
            if (obj7 == null) {
                obj7 = 0;
            }
            int A0H3 = AbstractC166987dD.A0H(obj7);
            if (list2.size() >= 3 && A0H + A0H2 + A0H3 >= list2.size()) {
                C33092Eiu c33092Eiu = g3o.A02;
                String str3 = this.A03;
                C14360o3.A0B(str3, 0);
                AbstractC166987dD.A1Z(new PXZ(c33092Eiu, str3, null, 6, false), ((C4A7) c33092Eiu).A01);
            }
        }
        C142846ck A0d = AbstractC31172DnG.A0d(g3o.A03);
        int i = this.A00;
        List A0a = AbstractC001800i.A0a(A1I.keySet());
        String str4 = this.A03;
        String str5 = this.A04;
        C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A0d);
            AbstractC31174DnI.A1J(A0I, "channel_translation_request_success");
            A0I.A0o("channel_translation");
            AbstractC31178DnM.A1H(A0I, "thread_view", i);
            A0I.A0r(str4);
            String str6 = null;
            if (str5 != null) {
                l = AbstractC166997dE.A0j(str5);
            } else {
                l = null;
            }
            AbstractC31174DnI.A1H(A0I, A0d, l);
            if (AbstractC166987dD.A1b(A0a)) {
                str6 = A0a.toString();
            }
            AbstractC31178DnM.A1G(A0I, AbstractC58317Pt9.A00(773), str6);
        }
        C006802i c006802i = ((C34495FIh) g3o.A05.getValue()).A00;
        c006802i.markerPoint(25631742, "Translation_Request_Success");
        c006802i.markerEnd(25631742, (short) 2);
    }
}
