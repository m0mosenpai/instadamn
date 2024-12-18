package X;

import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sfn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63235Sfn {
    public static void A02(Map map, Map map2) {
        if (map != null && map2 != null && !map2.isEmpty()) {
            Iterator A12 = AbstractC43593JPy.A12(map2);
            while (A12.hasNext()) {
                Object next = A12.next();
                Object obj = map2.get(next);
                Object obj2 = map.get(next);
                if (obj2 != null && (obj instanceof Map) && (obj2 instanceof Map)) {
                    if (!(obj2 instanceof HashMap)) {
                        obj2 = AbstractC58318PtA.A10((Map) obj2);
                        map.replace(next, obj2);
                    }
                    A02((Map) obj2, (Map) obj);
                } else {
                    map.put(next, obj);
                }
            }
        }
    }

    public static HashMap A00(ViewManager viewManager, Map map, Map map2) {
        HashMap A1G = AbstractC166987dD.A1G();
        Map exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            C73408YBu c73408YBu = C62856SUd.A00;
            if (c73408YBu.enableFabricRenderer() && c73408YBu.useFabricInterop()) {
                exportedCustomBubblingEventTypeConstants = A01(exportedCustomBubblingEventTypeConstants);
            }
            A02(map, exportedCustomBubblingEventTypeConstants);
            A1G.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        }
        Map exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            C73408YBu c73408YBu2 = C62856SUd.A00;
            if (c73408YBu2.enableFabricRenderer() && c73408YBu2.useFabricInterop()) {
                exportedCustomDirectEventTypeConstants = A01(exportedCustomDirectEventTypeConstants);
            }
            A02(map2, exportedCustomDirectEventTypeConstants);
            A1G.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        }
        Map exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            A1G.put("Constants", exportedViewConstants);
        }
        Map commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            A1G.put("Commands", commandsMap);
        }
        Map nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            A1G.put("NativeProps", nativeProps);
        }
        return A1G;
    }

    public static Map A01(Map map) {
        String A0R;
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            Object next = A12.next();
            if (next instanceof String) {
                String str = (String) next;
                if (!str.startsWith("top")) {
                    A1H.add(str);
                }
            }
        }
        if (!(map instanceof HashMap)) {
            map = AbstractC58318PtA.A10(map);
        }
        Iterator it = A1H.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            Object obj = map.get(A1B);
            if (A1B.startsWith("on")) {
                A0R = A1B.substring(2);
            } else {
                A0R = AnonymousClass001.A0R(A1B.substring(0, 1).toUpperCase(), A1B.substring(1));
            }
            map.put(AnonymousClass001.A0R("top", A0R), obj);
        }
        return map;
    }
}
