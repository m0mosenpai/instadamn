package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hla, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39826Hla {
    public static Map A00(InterfaceC110104xf interfaceC110104xf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC110104xf.BGx() != null) {
            ImageInfo BGx = interfaceC110104xf.BGx();
            if (BGx != null) {
                treeUpdaterJNI = BGx.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("image_versions2", treeUpdaterJNI);
        }
        if (interfaceC110104xf.getOwnerUsername() != null) {
            A1I.put("owner_username", interfaceC110104xf.getOwnerUsername());
        }
        if (interfaceC110104xf.getTemplateMediaId() != null) {
            A1I.put(AbstractC111324zv.A00(5472), interfaceC110104xf.getTemplateMediaId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
