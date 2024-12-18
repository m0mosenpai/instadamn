package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDW {
    public static Map A00(InterfaceC87833vr interfaceC87833vr) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC87833vr.C3G();
        A1I.put("subitem_count", Integer.valueOf(interfaceC87833vr.C3G()));
        if (interfaceC87833vr.C3H() != null) {
            A1I.put("subitem_str", interfaceC87833vr.C3H());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
