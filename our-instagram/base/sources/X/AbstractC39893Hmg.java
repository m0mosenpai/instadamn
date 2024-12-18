package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hmg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39893Hmg {
    public static Map A00(InterfaceC1118152j interfaceC1118152j) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC1118152j.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC1118152j.getId(), A1I);
        }
        if (interfaceC1118152j.BGg() != null) {
            A1I.put("image_height", interfaceC1118152j.BGg());
        }
        if (interfaceC1118152j.BGz() != null) {
            A1I.put("image_width", interfaceC1118152j.BGz());
        }
        interfaceC1118152j.CcL();
        A1I.put(AbstractC111324zv.A00(1062), Boolean.valueOf(interfaceC1118152j.CcL()));
        if (interfaceC1118152j.CcM() != null) {
            A1I.put("is_saved", interfaceC1118152j.CcM());
        }
        if (interfaceC1118152j.Cep() != null) {
            A1I.put("is_trending", interfaceC1118152j.Cep());
        }
        if (interfaceC1118152j.BS0() != null) {
            A1I.put("media_url", interfaceC1118152j.BS0());
        }
        if (interfaceC1118152j.Byk() != null) {
            A1I.put("source_media_id", interfaceC1118152j.Byk());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC1118152j.Bym() != null) {
            InterfaceC1118052h Bym = interfaceC1118152j.Bym();
            if (Bym != null) {
                treeUpdaterJNI = Bym.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("source_media_owner", treeUpdaterJNI);
        }
        if (interfaceC1118152j.Byp() != null) {
            A1I.put("source_media_username", interfaceC1118152j.Byp());
        }
        if (interfaceC1118152j.C0V() != null) {
            InterfaceC1118052h C0V = interfaceC1118152j.C0V();
            if (C0V != null) {
                treeUpdaterJNI2 = C0V.F7o();
            }
            A1I.put(AbstractC111324zv.A00(1276), treeUpdaterJNI2);
        }
        if (interfaceC1118152j.C0W() != null) {
            A1I.put(AbstractC111324zv.A00(1277), interfaceC1118152j.C0W());
        }
        if (interfaceC1118152j.C0Z() != null) {
            A1I.put(AbstractC111324zv.A00(531), AbstractC166997dE.A0f(interfaceC1118152j.C0Z()));
        }
        if (interfaceC1118152j.C0o() != null) {
            A1I.put("sticker_type", interfaceC1118152j.C0o());
        }
        if (interfaceC1118152j.getStrongId() != null) {
            A1I.put("strong_id__", interfaceC1118152j.getStrongId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
