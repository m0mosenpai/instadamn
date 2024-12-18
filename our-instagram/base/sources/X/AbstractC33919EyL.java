package X;

import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.Map;

/* renamed from: X.EyL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33919EyL {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2;
        String str3;
        String str4;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, AbstractC58317Pt9.A00(1));
        Map map = (Map) A01;
        Object obj = map.get("tag_id");
        if (obj != null) {
            str = C6BQ.A0G(obj);
        } else {
            str = null;
        }
        Object obj2 = map.get("destination_id");
        if (obj2 != null) {
            str2 = C6BQ.A0G(obj2);
        } else {
            str2 = null;
        }
        Object obj3 = map.get(DialogModule.KEY_TITLE);
        if (obj3 != null) {
            str3 = C6BQ.A0G(obj3);
        } else {
            str3 = null;
        }
        Object obj4 = map.get("subtitle");
        if (obj4 != null) {
            str4 = C6BQ.A0G(obj4);
        } else {
            str4 = null;
        }
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            C34726FRp A07 = C28531Zo.A04.A02.A07(C6BQ.A08(c6fq), AbstractC31172DnG.A0W(c6fq), C2EY.A0g);
            Bundle bundle = A07.A07;
            bundle.putString("DirectShareSheetConstants.tag_id", str);
            bundle.putString("DirectShareSheetConstants.destination_id", str2);
            bundle.putString("DirectShareSheetConstants.title", str3);
            bundle.putString("DirectShareSheetConstants.subtitle", str4);
            C3DN A00 = C3DN.A00.A00(C6BQ.A04(c6fq));
            if (A00 != null) {
                A00.A0K(A07.A00());
            }
        }
        return null;
    }
}
