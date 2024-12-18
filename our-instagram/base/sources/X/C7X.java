package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7X {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C7X[] A03;
    public static final C7X A04;
    public static final C7X A05;
    public static final C7X A06;
    public static final C7X A07;
    public final int A00;

    static {
        C7X c7x = new C7X(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A05 = c7x;
        C7X c7x2 = new C7X("PRIMARY", 1, 1);
        A06 = c7x2;
        C7X c7x3 = new C7X("SECONDARY", 2, 2);
        A07 = c7x3;
        C7X c7x4 = new C7X("CHEVRON", 3, 3);
        A04 = c7x4;
        C7X[] c7xArr = {c7x, c7x2, c7x3, c7x4, new C7X("DISABLED", 4, 4)};
        A03 = c7xArr;
        A02 = AbstractC12190kN.A00(c7xArr);
        C7X[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (C7X c7x5 : values) {
            AbstractC25227BEk.A1O(c7x5, A18, c7x5.A00);
        }
        A01 = AbstractC09990gB.A0J(A18, DO0.A00);
    }

    public static C7X valueOf(String str) {
        return (C7X) Enum.valueOf(C7X.class, str);
    }

    public static C7X[] values() {
        return (C7X[]) A03.clone();
    }

    public C7X(String str, int i, int i2) {
        this.A00 = i2;
    }
}
