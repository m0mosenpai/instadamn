package X;

import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VWQ {
    public static final EnumC33416Epn A00(String str) {
        String str2;
        Map map = EnumC33416Epn.A02;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Object obj = map.get(str2);
        if (obj == null) {
            C0w9.A03("SavedCollectionType", AnonymousClass001.A0R("Can't parse type ", str));
            obj = EnumC33416Epn.A0A;
        }
        return (EnumC33416Epn) obj;
    }
}
