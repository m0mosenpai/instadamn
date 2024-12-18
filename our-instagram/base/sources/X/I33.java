package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I33 {
    public static Map A00(InterfaceC38061pq interfaceC38061pq) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (interfaceC38061pq.AhX() != null) {
            JLG AhX = interfaceC38061pq.AhX();
            if (AhX != null) {
                treeUpdaterJNI4 = AhX.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("bottom_cta", treeUpdaterJNI4);
        }
        if (interfaceC38061pq.Awr() != null) {
            JLG Awr = interfaceC38061pq.Awr();
            if (Awr != null) {
                treeUpdaterJNI3 = Awr.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("description_header", treeUpdaterJNI3);
        }
        if (interfaceC38061pq.Aws() != null) {
            JLG Aws = interfaceC38061pq.Aws();
            if (Aws != null) {
                treeUpdaterJNI2 = Aws.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("description_text", treeUpdaterJNI2);
        }
        if (interfaceC38061pq.Azg() != null) {
            A1I.put("duration", interfaceC38061pq.Azg());
        }
        if (interfaceC38061pq.BEh() != null) {
            ShoppingNetegoInStoryIconType BEh = interfaceC38061pq.BEh();
            if (BEh != null) {
                str3 = BEh.A00;
            } else {
                str3 = null;
            }
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str3);
        }
        if (interfaceC38061pq.BF7() != null) {
            AbstractC37300Gc1.A12(interfaceC38061pq.BF7(), A1I);
        }
        if (interfaceC38061pq.Cf0() != null) {
            A1I.put("is_unit_dismissable", interfaceC38061pq.Cf0());
        }
        if (interfaceC38061pq.BWd() != null) {
            ShoppingNetegoType BWd = interfaceC38061pq.BWd();
            if (BWd != null) {
                str2 = BWd.A00;
            } else {
                str2 = null;
            }
            A1I.put("netego_type", str2);
        }
        if (interfaceC38061pq.BhR() != null) {
            List<JMP> BhR = interfaceC38061pq.BhR();
            if (BhR != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (JMP jmp : BhR) {
                    if (jmp != null) {
                        arrayList2.add(jmp.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("products", arrayList2);
        }
        if (interfaceC38061pq.Bup() != null) {
            List<JMG> Bup = interfaceC38061pq.Bup();
            if (Bup != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JMG jmg : Bup) {
                    if (jmg != null) {
                        arrayList.add(jmg.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("shops", arrayList);
        }
        if (interfaceC38061pq.C3d() != null) {
            JLG C3d = interfaceC38061pq.C3d();
            if (C3d != null) {
                treeUpdaterJNI = C3d.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subtitle", treeUpdaterJNI);
        }
        if (interfaceC38061pq.C3w() != null) {
            ShoppingNetegoInStorySuggestionType C3w = interfaceC38061pq.C3w();
            if (C3w != null) {
                str = C3w.A00;
            } else {
                str = null;
            }
            A1I.put("suggestion_type", str);
        }
        if (interfaceC38061pq.C8s() != null) {
            JLG C8s = interfaceC38061pq.C8s();
            if (C8s != null) {
                treeUpdaterJNI5 = C8s.F7o();
            }
            AbstractC37300Gc1.A17(treeUpdaterJNI5, A1I);
        }
        if (interfaceC38061pq.CAR() != null) {
            A1I.put("tracking_token", interfaceC38061pq.CAR());
        }
        if (interfaceC38061pq.CCG() != null) {
            A1I.put("ui_variant", interfaceC38061pq.CCG());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
