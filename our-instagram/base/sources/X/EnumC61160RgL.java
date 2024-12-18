package X;

import java.util.Arrays;
import java.util.List;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61160RgL {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61160RgL[] A02;
    public static final EnumC61160RgL A04;
    public List A00;
    public static final EnumC61160RgL A05 = new EnumC61160RgL(0, "PUBLISH_AS_SELF", "publish_actions");
    public static final EnumC61160RgL A03 = new EnumC61160RgL(1, "EMAIL_READ_ONLY", "email");
    public static final EnumC61160RgL A07 = new EnumC61160RgL(2, "READ_ONLY", new String[0]);
    public static final EnumC61160RgL A06 = new EnumC61160RgL(3, "PUBLISH_AS_SELF_OR_MANAGED_PAGE", "manage_pages", "publish_actions", "publish_pages");

    static {
        EnumC61160RgL enumC61160RgL = new EnumC61160RgL(4, "FXCAL", "manage_pages", "publish_actions", "publish_pages", "email");
        A04 = enumC61160RgL;
        EnumC61160RgL[] enumC61160RgLArr = {A05, A03, A07, A06, enumC61160RgL};
        A02 = enumC61160RgLArr;
        A01 = AbstractC12190kN.A00(enumC61160RgLArr);
    }

    public static EnumC61160RgL valueOf(String str) {
        return (EnumC61160RgL) Enum.valueOf(EnumC61160RgL.class, str);
    }

    public static EnumC61160RgL[] values() {
        return (EnumC61160RgL[]) A02.clone();
    }

    public EnumC61160RgL(int i, String str, String... strArr) {
        this.A00 = AbstractC16960so.A1Q(Arrays.copyOf(strArr, strArr.length));
    }
}
