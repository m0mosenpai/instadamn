package X;

import com.instagram.api.schemas.CreatorSegmentation;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class JRQ {
    public static Map A00(InterfaceC224116z interfaceC224116z) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC224116z.At2() != null) {
            CreatorSegmentation At2 = interfaceC224116z.At2();
            if (At2 != null) {
                str = At2.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("creator_segmentation", str);
        }
        if (interfaceC224116z.CRv() != null) {
            linkedHashMap.put("is_creator", interfaceC224116z.CRv());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
