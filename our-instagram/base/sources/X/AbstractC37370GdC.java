package X;

import com.instagram.api.schemas.UserTagInfoDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GdC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37370GdC {
    public static Map A00(InterfaceC84523py interfaceC84523py) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC84523py.CIr() != null) {
            List<UserTagInfoDictIntf> CIr = interfaceC84523py.CIr();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (UserTagInfoDictIntf userTagInfoDictIntf : CIr) {
                if (userTagInfoDictIntf != null) {
                    A1E.add(userTagInfoDictIntf.F7o());
                }
            }
            A1I.put("in", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
