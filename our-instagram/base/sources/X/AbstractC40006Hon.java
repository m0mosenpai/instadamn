package X;

import com.instagram.api.schemas.IGNativeSmartTextOverlayBackgroundShape;
import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hon, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40006Hon {
    public static Map A00(InterfaceC43572JMg interfaceC43572JMg) {
        String str;
        String str2;
        String str3;
        String str4;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str5 = null;
        if (interfaceC43572JMg.Aas() != null) {
            IGNativeSmartTextOverlayStylingAlignment Aas = interfaceC43572JMg.Aas();
            if (Aas != null) {
                str4 = Aas.A00;
            } else {
                str4 = null;
            }
            A1I.put("alignment", str4);
        }
        if (interfaceC43572JMg.getBackgroundColor() != null) {
            A1I.put("background_color", interfaceC43572JMg.getBackgroundColor());
        }
        if (interfaceC43572JMg.Af4() != null) {
            IGNativeSmartTextOverlayBackgroundShape Af4 = interfaceC43572JMg.Af4();
            if (Af4 != null) {
                str3 = Af4.A00;
            } else {
                str3 = null;
            }
            A1I.put("background_shape", str3);
        }
        if (interfaceC43572JMg.B7c() != null) {
            A1I.put("font_color", interfaceC43572JMg.B7c());
        }
        if (interfaceC43572JMg.B7h() != null) {
            A1I.put("font_size", interfaceC43572JMg.B7h());
        }
        if (interfaceC43572JMg.B7i() != null) {
            IGNativeSmartTextOverlayStylingFontStyle B7i = interfaceC43572JMg.B7i();
            if (B7i != null) {
                str2 = B7i.A00;
            } else {
                str2 = null;
            }
            A1I.put("font_style", str2);
        }
        if (interfaceC43572JMg.BNK() != null) {
            A1I.put(AbstractC111324zv.A00(1078), AbstractC166997dE.A0f(interfaceC43572JMg.BNK()));
        }
        if (interfaceC43572JMg.BPn() != null) {
            A1I.put("max_font_size", interfaceC43572JMg.BPn());
        }
        if (interfaceC43572JMg.BPs() != null) {
            A1I.put("max_line_height", AbstractC166997dE.A0f(interfaceC43572JMg.BPs()));
        }
        if (interfaceC43572JMg.BPy() != null) {
            A1I.put("max_number_of_lines", interfaceC43572JMg.BPy());
        }
        if (interfaceC43572JMg.C5x() != null) {
            IGNativeSmartTextOverlayTextAlignmentEnum C5x = interfaceC43572JMg.C5x();
            if (C5x != null) {
                str = C5x.A00;
            } else {
                str = null;
            }
            A1I.put("text_alignment", str);
        }
        if (interfaceC43572JMg.C6G() != null) {
            IGNativeSmartTextOverlayFontStyleEnum C6G = interfaceC43572JMg.C6G();
            if (C6G != null) {
                str5 = C6G.A00;
            }
            A1I.put("text_font_style", str5);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
