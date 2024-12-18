package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC130545uz {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC130545uz[] A03;
    public static final EnumC130545uz A04;
    public static final EnumC130545uz A05;
    public static final EnumC130545uz A06;
    public static final EnumC130545uz A07;
    public static final EnumC130545uz A08;
    public final String A00;

    static {
        EnumC130545uz enumC130545uz = new EnumC130545uz("DEFAULT", 0, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A05 = enumC130545uz;
        EnumC130545uz enumC130545uz2 = new EnumC130545uz("TRENDING", 1, "trending");
        A08 = enumC130545uz2;
        EnumC130545uz enumC130545uz3 = new EnumC130545uz("TEMPLATES", 2, "templates");
        A07 = enumC130545uz3;
        EnumC130545uz enumC130545uz4 = new EnumC130545uz("NEARBY", 3, "nearby");
        A06 = enumC130545uz4;
        EnumC130545uz enumC130545uz5 = new EnumC130545uz("CREATOR_INSPIRATION", 4, "creator_inspiration");
        A04 = enumC130545uz5;
        EnumC130545uz[] enumC130545uzArr = {enumC130545uz, enumC130545uz2, enumC130545uz3, enumC130545uz4, enumC130545uz5};
        A03 = enumC130545uzArr;
        A02 = AbstractC12190kN.A00(enumC130545uzArr);
        A01 = new HashMap();
        for (EnumC130545uz enumC130545uz6 : values()) {
            A01.put(enumC130545uz6.A00, enumC130545uz6);
        }
    }

    public static EnumC130545uz valueOf(String str) {
        return (EnumC130545uz) Enum.valueOf(EnumC130545uz.class, str);
    }

    public static EnumC130545uz[] values() {
        return (EnumC130545uz[]) A03.clone();
    }

    public EnumC130545uz(String str, int i, String str2) {
        this.A00 = str2;
    }
}
