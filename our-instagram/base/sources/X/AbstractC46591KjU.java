package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KjU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC46591KjU {
    public static Map A00(InterfaceC99374d7 interfaceC99374d7) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC99374d7.Ayf() != null) {
            A1I.put("display_url", interfaceC99374d7.Ayf());
        }
        String str2 = null;
        if (interfaceC99374d7.B4T() != null) {
            ImageUrl B4T = interfaceC99374d7.B4T();
            if (B4T != null) {
                str = B4T.getUrl();
            } else {
                str = null;
            }
            A1I.put("favicon_url", str);
        }
        if (interfaceC99374d7.BGt() != null) {
            ImageUrl BGt = interfaceC99374d7.BGt();
            if (BGt != null) {
                str2 = BGt.getUrl();
            }
            A1I.put("image_url", str2);
        }
        if (interfaceC99374d7.BkY() != null) {
            A1I.put("raw_url", interfaceC99374d7.BkY());
        }
        if (interfaceC99374d7.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, interfaceC99374d7.getTitle());
        }
        if (interfaceC99374d7.getUrl() != null) {
            A1I.put("url", interfaceC99374d7.getUrl());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
