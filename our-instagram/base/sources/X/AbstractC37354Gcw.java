package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gcw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37354Gcw {
    public static Map A00(InterfaceC38941rT interfaceC38941rT) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC38941rT.AYj() != null) {
            linkedHashMap.put("action_type", interfaceC38941rT.AYj());
        }
        interfaceC38941rT.getShouldHaveInformTreatment();
        linkedHashMap.put("should_have_inform_treatment", Boolean.valueOf(interfaceC38941rT.getShouldHaveInformTreatment()));
        if (interfaceC38941rT.getText() != null) {
            linkedHashMap.put("text", interfaceC38941rT.getText());
        }
        if (interfaceC38941rT.getUrl() != null) {
            linkedHashMap.put("url", interfaceC38941rT.getUrl());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
