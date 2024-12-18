package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hda, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39564Hda {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39564Hda[] A03;
    public static final EnumC39564Hda A04;
    public static final EnumC39564Hda A05;
    public static final EnumC39564Hda A06;
    public final int A00;

    static {
        EnumC39564Hda enumC39564Hda = new EnumC39564Hda(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A04 = enumC39564Hda;
        EnumC39564Hda enumC39564Hda2 = new EnumC39564Hda("PERSISTENT", 1, 1);
        A06 = enumC39564Hda2;
        EnumC39564Hda enumC39564Hda3 = new EnumC39564Hda("PAUSED_ONLY", 2, 2);
        A05 = enumC39564Hda3;
        EnumC39564Hda[] enumC39564HdaArr = {enumC39564Hda, enumC39564Hda2, enumC39564Hda3, new EnumC39564Hda("MUTE_ON_PAUSE_ONLY", 3, 3)};
        A03 = enumC39564HdaArr;
        A02 = AbstractC12190kN.A00(enumC39564HdaArr);
        EnumC39564Hda[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39564Hda enumC39564Hda4 : values) {
            AbstractC25227BEk.A1O(enumC39564Hda4, A18, enumC39564Hda4.A00);
        }
        A01 = A18;
    }

    public static EnumC39564Hda valueOf(String str) {
        return (EnumC39564Hda) Enum.valueOf(EnumC39564Hda.class, str);
    }

    public static EnumC39564Hda[] values() {
        return (EnumC39564Hda[]) A03.clone();
    }

    public EnumC39564Hda(String str, int i, int i2) {
        this.A00 = i2;
    }
}
