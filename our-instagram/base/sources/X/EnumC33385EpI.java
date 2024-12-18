package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33385EpI {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33385EpI[] A03;
    public static final EnumC33385EpI A04;
    public static final EnumC33385EpI A05;
    public final String A00;

    static {
        EnumC33385EpI enumC33385EpI = new EnumC33385EpI("ACCOUNTS", 0, "accounts");
        A04 = enumC33385EpI;
        EnumC33385EpI enumC33385EpI2 = new EnumC33385EpI("HASHTAGS", 1, "hashtags");
        A05 = enumC33385EpI2;
        EnumC33385EpI[] enumC33385EpIArr = {enumC33385EpI, enumC33385EpI2, new EnumC33385EpI("INVALID", 2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)};
        A03 = enumC33385EpIArr;
        A02 = AbstractC12190kN.A00(enumC33385EpIArr);
        EnumC33385EpI[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33385EpI enumC33385EpI3 : values) {
            A18.put(enumC33385EpI3.A00, enumC33385EpI3);
        }
        A01 = A18;
    }

    public static EnumC33385EpI valueOf(String str) {
        return (EnumC33385EpI) Enum.valueOf(EnumC33385EpI.class, str);
    }

    public static EnumC33385EpI[] values() {
        return (EnumC33385EpI[]) A03.clone();
    }

    public EnumC33385EpI(String str, int i, String str2) {
        this.A00 = str2;
    }
}
