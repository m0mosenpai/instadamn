package X;

import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125635m9 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.instagram.model.rixu.RIXUChainingBehaviorDefinition] */
    public static final RIXUChainingBehaviorDefinition A00(C206309Bn c206309Bn) {
        RIXUCoverChainingType rIXUCoverChainingType = (RIXUCoverChainingType) c206309Bn.A01;
        RIXUChainingSourceType rIXUChainingSourceType = (RIXUChainingSourceType) c206309Bn.A02;
        Boolean bool = (Boolean) c206309Bn.A05;
        Integer num = (Integer) c206309Bn.A07;
        Boolean bool2 = (Boolean) c206309Bn.A03;
        List list = (List) c206309Bn.A06;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C120985dq.A0d.A04(((C111034zF) it.next()).A00));
        }
        ?? obj = new Object();
        obj.A01 = rIXUCoverChainingType;
        obj.A00 = rIXUChainingSourceType;
        obj.A03 = bool;
        obj.A04 = num;
        obj.A02 = bool2;
        obj.A05 = arrayList;
        return obj;
    }
}
