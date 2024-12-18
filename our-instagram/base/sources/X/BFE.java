package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFE {
    public static Map A00(InterfaceC84363pT interfaceC84363pT) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC84363pT.getItems() != null) {
            List<InterfaceC103524lS> items = interfaceC84363pT.getItems();
            ArrayList arrayList = null;
            if (items != null) {
                arrayList = new ArrayList();
                for (InterfaceC103524lS interfaceC103524lS : items) {
                    if (interfaceC103524lS != null) {
                        arrayList.add(interfaceC103524lS.F7o());
                    }
                }
            }
            linkedHashMap.put(DialogModule.KEY_ITEMS, arrayList);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
