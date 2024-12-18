package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDN {
    public static Map A00(InterfaceC107114sH interfaceC107114sH) {
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI;
        String str4;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str5 = null;
        if (interfaceC107114sH.AaE() != null) {
            AdsRatingInfoIntf AaE = interfaceC107114sH.AaE();
            if (AaE != null) {
                treeUpdaterJNI2 = AaE.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put(AbstractC111324zv.A00(3856), treeUpdaterJNI2);
        }
        if (interfaceC107114sH.Atk() != null) {
            MoreInfoStickerCTAType Atk = interfaceC107114sH.Atk();
            if (Atk != null) {
                str4 = Atk.A00;
            } else {
                str4 = null;
            }
            A1I.put("cta_sticker_style", str4);
        }
        if (interfaceC107114sH.Aya() != null) {
            A1I.put(AbstractC111324zv.A00(900), interfaceC107114sH.Aya());
        }
        if (interfaceC107114sH.B44() != null) {
            InterfaceC107094sC B44 = interfaceC107114sH.B44();
            if (B44 != null) {
                treeUpdaterJNI = B44.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("facepile", treeUpdaterJNI);
        }
        if (interfaceC107114sH.BDp() != null) {
            A1I.put("hide_sug", interfaceC107114sH.BDp());
        }
        if (interfaceC107114sH.CWn() != null) {
            A1I.put(AbstractC58317Pt9.A00(843), interfaceC107114sH.CWn());
        }
        if (interfaceC107114sH.BUy() != null) {
            MoreInfoType BUy = interfaceC107114sH.BUy();
            if (BUy != null) {
                str3 = BUy.A00;
            } else {
                str3 = null;
            }
            A1I.put("more_info_type", str3);
        }
        if (interfaceC107114sH.BhL() != null) {
            MoreInfoProductTagType BhL = interfaceC107114sH.BhL();
            if (BhL != null) {
                str2 = BhL.A00;
            } else {
                str2 = null;
            }
            A1I.put("product_tag_type", str2);
        }
        if (interfaceC107114sH.C3I() != null) {
            List<InterfaceC31123Dm6> C3I = interfaceC107114sH.C3I();
            if (C3I != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC31123Dm6 interfaceC31123Dm6 : C3I) {
                    if (interfaceC31123Dm6 != null) {
                        arrayList.add(interfaceC31123Dm6.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("subitems", arrayList);
        }
        if (interfaceC107114sH.C3n() != null) {
            MoreInfoSUGPositionType C3n = interfaceC107114sH.C3n();
            if (C3n != null) {
                str = C3n.A00;
            } else {
                str = null;
            }
            A1I.put("sug_position", str);
        }
        if (interfaceC107114sH.C6o() != null) {
            MoreInfoTextStyle C6o = interfaceC107114sH.C6o();
            if (C6o != null) {
                str5 = C6o.A00;
            }
            A1I.put("text_style", str5);
        }
        if (interfaceC107114sH.CED() != null) {
            A1I.put(AbstractC43591JPw.A00(220), interfaceC107114sH.CED());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
