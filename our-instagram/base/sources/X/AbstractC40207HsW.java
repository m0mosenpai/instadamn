package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.LocationDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HsW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40207HsW {
    public static Map A00(InterfaceC38481qc interfaceC38481qc) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38481qc.Amu() != null) {
            A1I.put("challenge_id", interfaceC38481qc.Amu());
        }
        if (interfaceC38481qc.BM8() != null) {
            A1I.put("lat", AbstractC166997dE.A0f(interfaceC38481qc.BM8()));
        }
        if (interfaceC38481qc.BO9() != null) {
            A1I.put("lng", AbstractC166997dE.A0f(interfaceC38481qc.BO9()));
        }
        String str2 = null;
        if (interfaceC38481qc.BON() != null) {
            LocationDictIntf BON = interfaceC38481qc.BON();
            if (BON != null) {
                treeUpdaterJNI = BON.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("location_dict", treeUpdaterJNI);
        }
        if (interfaceC38481qc.getName() != null) {
            AbstractC37300Gc1.A14(interfaceC38481qc.getName(), A1I);
        }
        if (interfaceC38481qc.getPk() != null) {
            A1I.put("pk", interfaceC38481qc.getPk());
        }
        if (interfaceC38481qc.Bhu() != null) {
            ImageUrl Bhu = interfaceC38481qc.Bhu();
            if (Bhu != null) {
                str = Bhu.getUrl();
            } else {
                str = null;
            }
            A1I.put("profile_pic_url", str);
        }
        if (interfaceC38481qc.Bhw() != null) {
            A1I.put("profile_pic_username", interfaceC38481qc.Bhw());
        }
        if (interfaceC38481qc.getShortName() != null) {
            A1I.put("short_name", interfaceC38481qc.getShortName());
        }
        if (interfaceC38481qc.CBY() != null) {
            MultiAuthorStoryType CBY = interfaceC38481qc.CBY();
            if (CBY != null) {
                str2 = CBY.A00;
            }
            AbstractC37300Gc1.A16(str2, A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
