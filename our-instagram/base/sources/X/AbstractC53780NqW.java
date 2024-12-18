package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.NqW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53780NqW {
    public static Map A00(InterfaceC109794x6 interfaceC109794x6) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC109794x6.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, interfaceC109794x6.getDescription());
        }
        if (interfaceC109794x6.BgZ() != null) {
            A1I.put("privacy_disclaimer", interfaceC109794x6.BgZ());
        }
        if (interfaceC109794x6.Bga() != null) {
            A1I.put("privacy_disclaimer_link", interfaceC109794x6.Bga());
        }
        if (interfaceC109794x6.Bgb() != null) {
            A1I.put("privacy_disclaimer_link_text", interfaceC109794x6.Bgb());
        }
        if (interfaceC109794x6.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, interfaceC109794x6.getTitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
