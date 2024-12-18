package X;

import com.instagram.api.schemas.LinkWithTextIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ev0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33712Ev0 {
    public static Map A00(LinkWithTextIntf linkWithTextIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (linkWithTextIntf.getText() != null) {
            A1I.put("text", linkWithTextIntf.getText());
        }
        if (linkWithTextIntf.getUrl() != null) {
            A1I.put("url", linkWithTextIntf.getUrl());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
