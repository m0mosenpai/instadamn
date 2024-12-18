package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hk6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39736Hk6 {
    public static Map A00(C5FS c5fs) {
        String str;
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5fs.AyP() != null) {
            A1I.put(AbstractC111324zv.A00(2286), c5fs.AyP());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (c5fs.Bjh() != null) {
            List<InterfaceC106374qr> Bjh = c5fs.Bjh();
            if (Bjh != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC106374qr interfaceC106374qr : Bjh) {
                    if (interfaceC106374qr != null) {
                        arrayList.add(interfaceC106374qr.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("questions", arrayList);
        }
        if (c5fs.Bme() != null) {
            REPETITION_UI_TYPE Bme = c5fs.Bme();
            if (Bme != null) {
                str = Bme.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(3013), str);
        }
        if (c5fs.Bmy() != null) {
            A1I.put(AbstractC111324zv.A00(3014), c5fs.Bmy());
        }
        if (c5fs.CCS() != null) {
            InterfaceC106354qp CCS = c5fs.CCS();
            if (CCS != null) {
                treeUpdaterJNI = CCS.F7o();
            }
            A1I.put("undo_button", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
