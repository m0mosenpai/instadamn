package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualLinkCtaType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hm2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39854Hm2 {
    public static Map A00(JMR jmr) {
        ArrayList arrayList;
        TreeUpdaterJNI F7o;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (jmr.Aqs() != null) {
            InterfaceC84133oz Aqs = jmr.Aqs();
            if (Aqs != null) {
                treeUpdaterJNI2 = Aqs.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("content_appreciation_info", treeUpdaterJNI2);
        }
        if (jmr.Ara() != null) {
            ContextualLinkCtaType Ara = jmr.Ara();
            C14360o3.A0B(Ara, 0);
            A1I.put("contextual_link_type", Ara.A00);
        }
        if (jmr.BPh() != null) {
            InterfaceC84163p3 BPh = jmr.BPh();
            if (BPh != null) {
                treeUpdaterJNI = BPh.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("mashup_info", treeUpdaterJNI);
        }
        if (jmr.Bij() != null) {
            List<InterfaceC109364wL> Bij = jmr.Bij();
            if (Bij != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (InterfaceC109364wL interfaceC109364wL : Bij) {
                    if (interfaceC109364wL != null) {
                        arrayList2.add(interfaceC109364wL.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("prompt_stickers_info", arrayList2);
        }
        if (jmr.Bp8() != null) {
            List<InterfaceC93104Fm> Bp8 = jmr.Bp8();
            if (Bp8 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC93104Fm interfaceC93104Fm : Bp8) {
                    if (interfaceC93104Fm != null && (F7o = interfaceC93104Fm.F7o()) != null) {
                        arrayList.add(F7o);
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("reusable_text_info", arrayList);
        }
        if (jmr.C5g() != null) {
            InterfaceC110214xq C5g = jmr.C5g();
            if (C5g != null) {
                treeUpdaterJNI3 = C5g.F7o();
            }
            A1I.put("template_info", treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
