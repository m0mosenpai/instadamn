package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HsF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40195HsF {
    public static Map A00(InterfaceC38731r5 interfaceC38731r5) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38731r5.AYe() != null) {
            A1I.put("action_text", interfaceC38731r5.AYe());
        }
        if (interfaceC38731r5.AvB() != null) {
            A1I.put("cursor", interfaceC38731r5.AvB());
        }
        if (interfaceC38731r5.BF7() != null) {
            AbstractC37300Gc1.A12(interfaceC38731r5.BF7(), A1I);
        }
        if (interfaceC38731r5.CdK() != null) {
            A1I.put("is_shuffle", interfaceC38731r5.CdK());
        }
        if (interfaceC38731r5.Cf0() != null) {
            A1I.put("is_unit_dismissable", interfaceC38731r5.Cf0());
        }
        if (interfaceC38731r5.BWb() != null) {
            A1I.put("netego_title", interfaceC38731r5.BWb());
        }
        if (interfaceC38731r5.BWe() != null) {
            A1I.put("netego_type", interfaceC38731r5.BWe());
        }
        if (interfaceC38731r5.CAR() != null) {
            A1I.put("tracking_token", interfaceC38731r5.CAR());
        }
        if (interfaceC38731r5.CAz() != null) {
            List<JMD> CAz = interfaceC38731r5.CAz();
            ArrayList arrayList = null;
            if (CAz != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JMD jmd : CAz) {
                    if (jmd != null) {
                        arrayList.add(jmd.F7o());
                    }
                }
            }
            A1I.put(AbstractC111324zv.A00(1350), arrayList);
        }
        if (interfaceC38731r5.CBm() != null) {
            AbstractC37300Gc1.A16(interfaceC38731r5.CBm(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
