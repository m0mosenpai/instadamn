package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBTagType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hn3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39915Hn3 {
    public static Map A00(InterfaceC43556JLq interfaceC43556JLq) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43556JLq.AbJ() != null) {
            A1I.put(MSV.A00(382), interfaceC43556JLq.AbJ());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC43556JLq.B52() != null) {
            FBTagType B52 = interfaceC43556JLq.B52();
            if (B52 != null) {
                str = B52.A00;
            } else {
                str = null;
            }
            A1I.put("fb_tag_type", str);
        }
        if (interfaceC43556JLq.B56() != null) {
            JM7 B56 = interfaceC43556JLq.B56();
            if (B56 != null) {
                treeUpdaterJNI = B56.F7o();
            }
            A1I.put("fb_user", treeUpdaterJNI);
        }
        if (interfaceC43556JLq.Bec() != null) {
            List Bec = interfaceC43556JLq.Bec();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = Bec.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1X(A1E, it);
            }
            A1I.put("position", A1E);
        }
        if (interfaceC43556JLq.C4z() != null) {
            A1I.put("tag_id", interfaceC43556JLq.C4z());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
