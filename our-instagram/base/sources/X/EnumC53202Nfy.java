package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53202Nfy {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53202Nfy[] A03;
    public static final EnumC53202Nfy A04;
    public final String A00;

    static {
        EnumC53202Nfy enumC53202Nfy = new EnumC53202Nfy("CAMERA", 0, "camera");
        A04 = enumC53202Nfy;
        EnumC53202Nfy[] enumC53202NfyArr = {enumC53202Nfy, new EnumC53202Nfy("CLOSE_FRIENDS_HOME", 1, "close_friends_home")};
        A03 = enumC53202NfyArr;
        A02 = AbstractC12190kN.A00(enumC53202NfyArr);
        EnumC53202Nfy[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53202Nfy enumC53202Nfy2 : values) {
            A18.put(enumC53202Nfy2.A00, enumC53202Nfy2);
        }
        A01 = A18;
    }

    public static EnumC53202Nfy valueOf(String str) {
        return (EnumC53202Nfy) Enum.valueOf(EnumC53202Nfy.class, str);
    }

    public static EnumC53202Nfy[] values() {
        return (EnumC53202Nfy[]) A03.clone();
    }

    public EnumC53202Nfy(String str, int i, String str2) {
        this.A00 = str2;
    }
}
