package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HpC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40026HpC {
    public static Map A00(IceBreakerMessageIntf iceBreakerMessageIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iceBreakerMessageIntf.getActionUrl() != null) {
            A1I.put("actionUrl", iceBreakerMessageIntf.getActionUrl());
        }
        if (iceBreakerMessageIntf.getMessage() != null) {
            A1I.put(DialogModule.KEY_MESSAGE, iceBreakerMessageIntf.getMessage());
        }
        if (iceBreakerMessageIntf.BSz() != null) {
            A1I.put("messageKey", iceBreakerMessageIntf.BSz());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
