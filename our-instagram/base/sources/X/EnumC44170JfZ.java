package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.JfZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44170JfZ {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC44170JfZ[] A03;
    public static final EnumC44170JfZ A04;
    public static final EnumC44170JfZ A05;
    public static final EnumC44170JfZ A06;
    public static final EnumC44170JfZ A07;
    public static final EnumC44170JfZ A08;
    public final String A00;

    static {
        Locale locale = Locale.ROOT;
        A08 = new EnumC44170JfZ("UNDEFINED", 0, AbstractC31172DnG.A16(locale, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"));
        A04 = new EnumC44170JfZ("TRIGGER_CAMERA", 1, AbstractC31172DnG.A16(locale, "TRIGGER_CAMERA"));
        A06 = new EnumC44170JfZ("TRIGGER_OPEN_THREAD_LIST", 2, AbstractC31172DnG.A16(locale, "TRIGGER_OPEN_THREAD_LIST"));
        A07 = new EnumC44170JfZ("TRIGGER_OPEN_THREAD_VIEW", 3, AbstractC31172DnG.A16(locale, "TRIGGER_OPEN_THREAD_VIEW"));
        EnumC44170JfZ enumC44170JfZ = new EnumC44170JfZ("TRIGGER_MEDIA_GALLERY", 4, AbstractC31172DnG.A16(locale, "TRIGGER_MEDIA_GALLERY"));
        A05 = enumC44170JfZ;
        EnumC44170JfZ[] enumC44170JfZArr = {A08, A04, A06, A07, enumC44170JfZ};
        A03 = enumC44170JfZArr;
        C020508b A00 = AbstractC12190kN.A00(enumC44170JfZArr);
        A02 = A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            A18.put(((EnumC44170JfZ) obj).A00, obj);
        }
        A01 = AbstractC09990gB.A0J(A18, C44173Jfc.A00);
    }

    public static EnumC44170JfZ valueOf(String str) {
        return (EnumC44170JfZ) Enum.valueOf(EnumC44170JfZ.class, str);
    }

    public static EnumC44170JfZ[] values() {
        return (EnumC44170JfZ[]) A03.clone();
    }

    public EnumC44170JfZ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
