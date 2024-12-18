package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46188KcQ {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46188KcQ[] A03;
    public static final EnumC46188KcQ A04;
    public final String A00;

    static {
        EnumC46188KcQ enumC46188KcQ = new EnumC46188KcQ("UNSUPPORTED", 0, "");
        A04 = enumC46188KcQ;
        EnumC46188KcQ[] enumC46188KcQArr = {enumC46188KcQ, new EnumC46188KcQ("PROACTIVE_WARNING", 1, "tam_thread_banner_proactive_warning_impression")};
        A03 = enumC46188KcQArr;
        A02 = AbstractC12190kN.A00(enumC46188KcQArr);
        EnumC46188KcQ[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46188KcQ enumC46188KcQ2 : values) {
            A18.put(enumC46188KcQ2.A00, enumC46188KcQ2);
        }
        A01 = AbstractC09990gB.A0J(A18, MKN.A00);
    }

    public static EnumC46188KcQ valueOf(String str) {
        return (EnumC46188KcQ) Enum.valueOf(EnumC46188KcQ.class, str);
    }

    public static EnumC46188KcQ[] values() {
        return (EnumC46188KcQ[]) A03.clone();
    }

    public EnumC46188KcQ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
