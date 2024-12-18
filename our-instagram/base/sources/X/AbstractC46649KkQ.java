package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXDeviceItem;

/* renamed from: X.KkQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46649KkQ {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        if (c6fq.A03 != null) {
            Object A02 = c6fw.A02();
            String A00 = AbstractC111324zv.A00(12);
            C14360o3.A0C(A02, A00);
            List list = (List) A02;
            Object A002 = c6fw.A00();
            C14360o3.A0C(A002, A00);
            List list2 = (List) A002;
            AbstractC25225BEi.A1S(c6fw.A03(3));
            InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 5);
            InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 6);
            if (!list.isEmpty() && !list2.isEmpty()) {
                ArrayList A1E = AbstractC166987dD.A1E();
                ArrayList A1E2 = AbstractC166987dD.A1E();
                if (AbstractC001800i.A0I(list) instanceof String) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            A1E.add(EnumC200808uN.valueOf(AbstractC166987dD.A1B(it)));
                        } catch (IllegalArgumentException | NullPointerException unused) {
                        }
                    }
                    if (AbstractC001800i.A0I(list2) instanceof String) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            try {
                                A1E2.add(EnumC46133KbX.valueOf(AbstractC166987dD.A1B(it2)));
                            } catch (IllegalArgumentException | NullPointerException unused2) {
                            }
                        }
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        Iterator it3 = A1E.iterator();
                        while (it3.hasNext()) {
                            EnumC200808uN enumC200808uN = (EnumC200808uN) it3.next();
                            Iterator it4 = A1E2.iterator();
                            while (it4.hasNext()) {
                                AbstractC43593JPy.A1U(A1E3, enumC200808uN, (EnumC46133KbX) it4.next());
                            }
                        }
                        ArrayList A003 = A1F.A00(C6BQ.A0B(c6fq), "caa_access_library_fetch_device_id", "BKBloksFxActionFetchDeviceIDImpl", new FXAccessLibraryDeviceRequest(A1E3));
                        if (A003 != null && !A003.isEmpty()) {
                            ArrayList A1E4 = AbstractC166987dD.A1E();
                            Iterator it5 = A003.iterator();
                            while (it5.hasNext()) {
                                FXDeviceItem fXDeviceItem = (FXDeviceItem) it5.next();
                                EnumC200808uN enumC200808uN2 = fXDeviceItem.A00;
                                EnumC46133KbX enumC46133KbX = fXDeviceItem.A03;
                                String str = fXDeviceItem.A02;
                                if (enumC200808uN2 != null && enumC46133KbX != null && str != null) {
                                    HashMap A1G = AbstractC166987dD.A1G();
                                    A1G.put(AbstractC111324zv.A00(1923), enumC200808uN2.name());
                                    A1G.put("device_id_type", enumC46133KbX.name());
                                    A1G.put(AbstractC31581Du9.A02(0, 9, 107), str);
                                    A1E4.add(A1G);
                                }
                            }
                            AbstractC25227BEk.A1M(c6fq, AbstractC31179DnN.A0I(A1E4), A0I);
                            return null;
                        }
                        C131845xK.A00(c6fq, C6FW.A01, A0I2);
                    }
                }
            }
        }
        return null;
    }
}
