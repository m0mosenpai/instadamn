package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hv2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40357Hv2 {
    public static Map A00(InterfaceC43577JMl interfaceC43577JMl) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43577JMl.AdC() != null) {
            A1I.put("attribution", interfaceC43577JMl.AdC());
        }
        if (interfaceC43577JMl.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC43577JMl.B29(), A1I);
        }
        if (interfaceC43577JMl.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC43577JMl.BDR(), A1I);
        }
        if (interfaceC43577JMl.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC43577JMl.CUY());
        }
        if (interfaceC43577JMl.CVk() != null) {
            A1I.put("is_hidden", interfaceC43577JMl.CVk());
        }
        if (interfaceC43577JMl.CaJ() != null) {
            A1I.put("is_pinned", interfaceC43577JMl.CaJ());
        }
        if (interfaceC43577JMl.Cdh() != null) {
            A1I.put("is_sticker", interfaceC43577JMl.Cdh());
        }
        if (interfaceC43577JMl.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC43577JMl.Bpa(), A1I);
        }
        if (interfaceC43577JMl.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC43577JMl.Bzq(), A1I);
        }
        if (interfaceC43577JMl.CHa() != null) {
            InterfaceC43493JJf CHa = interfaceC43577JMl.CHa();
            if (CHa != null) {
                treeUpdaterJNI = CHa.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("whatsapp_sticker", treeUpdaterJNI);
        }
        if (interfaceC43577JMl.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC43577JMl.CHf(), A1I);
        }
        if (interfaceC43577JMl.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC43577JMl.CI1(), A1I);
        }
        if (interfaceC43577JMl.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC43577JMl.CIa(), A1I);
        }
        if (interfaceC43577JMl.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC43577JMl.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
