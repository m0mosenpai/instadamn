package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7S {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C7S[] A03;
    public static final C7S A04;
    public static final C7S A05;
    public final String A00;

    static {
        C7S c7s = new C7S(0, "INTERESTED", "interested");
        A05 = c7s;
        C7S c7s2 = new C7S(1, "BLOCKED", "blocked");
        A04 = c7s2;
        C7S[] c7sArr = {c7s, c7s2, new C7S(2, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, NetInfoModule.CONNECTION_TYPE_NONE)};
        A03 = c7sArr;
        A02 = AbstractC12190kN.A00(c7sArr);
        C7S[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (C7S c7s3 : values) {
            A18.put(c7s3.A00, c7s3);
        }
        A01 = A18;
    }

    public static C7S valueOf(String str) {
        return (C7S) Enum.valueOf(C7S.class, str);
    }

    public static C7S[] values() {
        return (C7S[]) A03.clone();
    }

    public C7S(int i, String str, String str2) {
        this.A00 = str2;
    }
}
