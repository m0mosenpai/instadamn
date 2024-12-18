package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.9Ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC206079Ao {
    public static final EnumC206089Ap A00(String str) {
        C14360o3.A0B(str, 0);
        for (EnumC206089Ap enumC206089Ap : EnumC206089Ap.values()) {
            if (C14360o3.A0K(enumC206089Ap.A02, str)) {
                return enumC206089Ap;
            }
        }
        return null;
    }

    public static final EnumC206089Ap A01(Calendar calendar) {
        for (EnumC206089Ap enumC206089Ap : EnumC206089Ap.values()) {
            if (enumC206089Ap.A00 == calendar.get(7)) {
                return enumC206089Ap;
            }
        }
        return null;
    }

    public static final List A02() {
        EnumC206089Ap[] values = EnumC206089Ap.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC206089Ap enumC206089Ap : values) {
            arrayList.add(enumC206089Ap.A02);
        }
        return arrayList;
    }
}
