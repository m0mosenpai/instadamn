package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class JRJ {
    public static Map A00(InterfaceC223316m interfaceC223316m) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC223316m.AeP() != null) {
            linkedHashMap.put("available_theme_colors", interfaceC223316m.AeP());
        }
        String str2 = null;
        if (interfaceC223316m.Aez() != null) {
            ImageUrl Aez = interfaceC223316m.Aez();
            if (Aez != null) {
                str = Aez.getUrl();
            } else {
                str = null;
            }
            linkedHashMap.put("background_image_url", str);
        }
        if (interfaceC223316m.getEmoji() != null) {
            linkedHashMap.put("emoji", interfaceC223316m.getEmoji());
        }
        if (interfaceC223316m.B1G() != null) {
            linkedHashMap.put("emoji_color", interfaceC223316m.B1G());
        }
        if (interfaceC223316m.BAD() != null) {
            linkedHashMap.put("gradient", interfaceC223316m.BAD());
        }
        if (interfaceC223316m.CQS() != null) {
            linkedHashMap.put("is_background_image_blurred", interfaceC223316m.CQS());
        }
        if (interfaceC223316m.BUH() != null) {
            linkedHashMap.put(DatePickerDialogModule.ARG_MODE, interfaceC223316m.BUH());
        }
        if (interfaceC223316m.Bsp() != null) {
            linkedHashMap.put("selected_theme_color", interfaceC223316m.Bsp());
        }
        if (interfaceC223316m.Bt1() != null) {
            linkedHashMap.put("selfie_sticker", interfaceC223316m.Bt1());
        }
        if (interfaceC223316m.Bt2() != null) {
            ImageUrl Bt2 = interfaceC223316m.Bt2();
            if (Bt2 != null) {
                str2 = Bt2.getUrl();
            }
            linkedHashMap.put("selfie_url", str2);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
