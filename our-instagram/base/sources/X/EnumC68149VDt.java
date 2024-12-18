package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68149VDt {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68149VDt[] A03;
    public static final EnumC68149VDt A04;
    public static final EnumC68149VDt A05;
    public static final EnumC68149VDt A06;
    public static final EnumC68149VDt A07;
    public static final EnumC68149VDt A08;
    public final int A00;

    public static EnumC68149VDt valueOf(String str) {
        return (EnumC68149VDt) Enum.valueOf(EnumC68149VDt.class, str);
    }

    public static EnumC68149VDt[] values() {
        return (EnumC68149VDt[]) A03.clone();
    }

    static {
        EnumC68149VDt enumC68149VDt = new EnumC68149VDt("BIAS", 0, 0);
        A05 = enumC68149VDt;
        EnumC68149VDt enumC68149VDt2 = new EnumC68149VDt("NORMALIZED_CENTER", 1, 1);
        A07 = enumC68149VDt2;
        EnumC68149VDt enumC68149VDt3 = new EnumC68149VDt("GRAVITY", 2, 2);
        A06 = enumC68149VDt3;
        EnumC68149VDt enumC68149VDt4 = new EnumC68149VDt("ABSOLUTE", 3, 3);
        A04 = enumC68149VDt4;
        EnumC68149VDt enumC68149VDt5 = new EnumC68149VDt("NO_OVERLAP", 4, 4);
        A08 = enumC68149VDt5;
        EnumC68149VDt[] enumC68149VDtArr = {enumC68149VDt, enumC68149VDt2, enumC68149VDt3, enumC68149VDt4, enumC68149VDt5};
        A03 = enumC68149VDtArr;
        A02 = AbstractC12190kN.A00(enumC68149VDtArr);
        EnumC68149VDt[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68149VDt enumC68149VDt6 : values) {
            AbstractC25227BEk.A1O(enumC68149VDt6, linkedHashMap, enumC68149VDt6.A00);
        }
        A01 = linkedHashMap;
    }

    public EnumC68149VDt(String str, int i, int i2) {
        this.A00 = i2;
    }
}
