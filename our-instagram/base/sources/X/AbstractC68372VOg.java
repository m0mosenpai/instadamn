package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NativeInfoCardCommentLayout;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68372VOg {
    public static Map A00(XG9 xg9) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (xg9.Apj() != null) {
            InterfaceC43559JLt Apj = xg9.Apj();
            if (Apj != null) {
                treeUpdaterJNI3 = Apj.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("comment_text", treeUpdaterJNI3);
        }
        if (xg9.BEv() != null) {
            XGA BEv = xg9.BEv();
            if (BEv != null) {
                treeUpdaterJNI2 = BEv.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("icon_text", treeUpdaterJNI2);
        }
        if (xg9.BMO() != null) {
            NativeInfoCardCommentLayout BMO = xg9.BMO();
            if (BMO != null) {
                str = BMO.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("layout", str);
        }
        if (xg9.CDx() != null) {
            InterfaceC43559JLt CDx = xg9.CDx();
            if (CDx != null) {
                treeUpdaterJNI = CDx.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("user_name", treeUpdaterJNI);
        }
        if (xg9.CE1() != null) {
            InterfaceC72036XFy CE1 = xg9.CE1();
            if (CE1 != null) {
                treeUpdaterJNI4 = CE1.F7o();
            }
            linkedHashMap.put("user_profile_pic", treeUpdaterJNI4);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
