package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46190KcS {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46190KcS[] A03;
    public static final EnumC46190KcS A04;
    public static final EnumC46190KcS A05;
    public final int A00;

    static {
        EnumC46190KcS enumC46190KcS = new EnumC46190KcS("FEED_POST", 0, 1);
        A05 = enumC46190KcS;
        EnumC46190KcS enumC46190KcS2 = new EnumC46190KcS("CLIPS", 1, 2);
        A04 = enumC46190KcS2;
        EnumC46190KcS[] enumC46190KcSArr = {enumC46190KcS, enumC46190KcS2};
        A03 = enumC46190KcSArr;
        A02 = AbstractC12190kN.A00(enumC46190KcSArr);
        EnumC46190KcS[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46190KcS enumC46190KcS3 : values) {
            AbstractC25227BEk.A1O(enumC46190KcS3, A18, enumC46190KcS3.A00);
        }
        A01 = A18;
    }

    public static EnumC46190KcS valueOf(String str) {
        return (EnumC46190KcS) Enum.valueOf(EnumC46190KcS.class, str);
    }

    public static EnumC46190KcS[] values() {
        return (EnumC46190KcS[]) A03.clone();
    }

    public EnumC46190KcS(String str, int i, int i2) {
        this.A00 = i2;
    }
}
