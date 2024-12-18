package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.NqX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53781NqX {
    public static Map A00(InterfaceC109764x3 interfaceC109764x3) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC109764x3.AjA() != null) {
            A1I.put("button_title", interfaceC109764x3.AjA());
        }
        if (interfaceC109764x3.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, interfaceC109764x3.getDescription());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
