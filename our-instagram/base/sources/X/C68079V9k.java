package X;

import com.google.common.collect.ImmutableList;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.ArrayList;

/* renamed from: X.V9k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68079V9k extends C4A7 {
    public final O2I A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static final DirectThreadThemeInfo A00(C66940Udb c66940Udb, C66940Udb c66940Udb2, String str) {
        String str2;
        C2JS optionalTreeField;
        C2JS optionalTreeField2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Integer num = C05F.A00;
        Integer num2 = C05F.A01;
        String A09 = c66940Udb.A09("accessibility_label");
        String A0A = c66940Udb.A0A("fallback_color");
        String A0A2 = c66940Udb2.A0A("fallback_color");
        ImmutableList requiredCompactedStringListField = c66940Udb.getRequiredCompactedStringListField(4, "gradient_colors");
        ImmutableList requiredCompactedStringListField2 = c66940Udb2.getRequiredCompactedStringListField(4, "gradient_colors");
        arrayList.clear();
        if (requiredCompactedStringListField != null) {
            arrayList.addAll(requiredCompactedStringListField);
        }
        arrayList2.clear();
        if (requiredCompactedStringListField2 != null) {
            arrayList2.addAll(requiredCompactedStringListField2);
        }
        C2JS optionalTreeField3 = c66940Udb.getOptionalTreeField(19, "background_asset", C66939Uda.class, -1313231216);
        String str3 = null;
        if (optionalTreeField3 != null && (optionalTreeField2 = optionalTreeField3.getOptionalTreeField(0, "image(height:1280,width:1280)", C66938UdZ.class, 1661460164)) != null) {
            str2 = optionalTreeField2.getOptionalStringField(0, "uri");
        } else {
            str2 = null;
        }
        C2JS optionalTreeField4 = c66940Udb2.getOptionalTreeField(19, "background_asset", C66939Uda.class, -1313231216);
        if (optionalTreeField4 != null && (optionalTreeField = optionalTreeField4.getOptionalTreeField(0, "image(height:1280,width:1280)", C66938UdZ.class, 1661460164)) != null) {
            str3 = optionalTreeField.getOptionalStringField(0, "uri");
        }
        ImmutableList requiredCompactedStringListField3 = c66940Udb.getRequiredCompactedStringListField(7, "inbound_message_gradient_colors");
        C14360o3.A07(requiredCompactedStringListField3);
        String str4 = (String) requiredCompactedStringListField3.get(0);
        ImmutableList requiredCompactedStringListField4 = c66940Udb2.getRequiredCompactedStringListField(7, "inbound_message_gradient_colors");
        C14360o3.A07(requiredCompactedStringListField4);
        String str5 = (String) requiredCompactedStringListField4.get(0);
        String optionalStringField = c66940Udb.getOptionalStringField(12, "navigation_bar_color");
        String optionalStringField2 = c66940Udb2.getOptionalStringField(12, "navigation_bar_color");
        String optionalStringField3 = c66940Udb.getOptionalStringField(13, "bottom_gradient_color");
        String optionalStringField4 = c66940Udb2.getOptionalStringField(13, "bottom_gradient_color");
        String optionalStringField5 = c66940Udb.getOptionalStringField(14, "composer_input_background_color");
        return new DirectThreadThemeInfo(num2, num, A09, null, null, str3, optionalStringField4, null, null, null, c66940Udb2.getOptionalStringField(15, "message_text_color"), null, c66940Udb2.getOptionalStringField(20, "ai_generated_background_uri"), null, null, c66940Udb2.getOptionalStringField(15, "message_text_color"), null, c66940Udb2.getOptionalStringField(14, "composer_input_background_color"), A0A2, str5, optionalStringField2, null, null, c66940Udb.getOptionalStringField(20, "ai_generated_background_uri"), null, str2, optionalStringField3, null, null, null, c66940Udb.getOptionalStringField(15, "message_text_color"), null, null, null, c66940Udb.getOptionalStringField(15, "message_text_color"), null, optionalStringField5, A0A, str4, optionalStringField, null, str, arrayList4, arrayList2, arrayList3, arrayList, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public C68079V9k(O2I o2i) {
        super("AiThemes", C4A8.A00(1971697375));
        this.A00 = o2i;
    }
}
