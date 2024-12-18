package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3hG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC79653hG {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC79653hG[] A03;
    public static final EnumC79653hG A04;
    public static final EnumC79653hG A05;
    public static final EnumC79653hG A06;
    public static final EnumC79653hG A07;
    public final int A00;

    static {
        EnumC79653hG enumC79653hG = new EnumC79653hG(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A07 = enumC79653hG;
        EnumC79653hG enumC79653hG2 = new EnumC79653hG("BOTTOM_GRADIENT", 1, 1);
        A05 = enumC79653hG2;
        EnumC79653hG enumC79653hG3 = new EnumC79653hG("BOTTOM_BUTTON", 2, 2);
        A04 = enumC79653hG3;
        EnumC79653hG enumC79653hG4 = new EnumC79653hG("CORNER_BUTTON", 3, 3);
        A06 = enumC79653hG4;
        EnumC79653hG[] enumC79653hGArr = {enumC79653hG, enumC79653hG2, enumC79653hG3, enumC79653hG4};
        A03 = enumC79653hGArr;
        A02 = AbstractC12190kN.A00(enumC79653hGArr);
        EnumC79653hG[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC79653hG enumC79653hG5 : values) {
            linkedHashMap.put(Integer.valueOf(enumC79653hG5.A00), enumC79653hG5);
        }
        A01 = linkedHashMap;
    }

    public static EnumC79653hG valueOf(String str) {
        return (EnumC79653hG) Enum.valueOf(EnumC79653hG.class, str);
    }

    public static EnumC79653hG[] values() {
        return (EnumC79653hG[]) A03.clone();
    }

    public EnumC79653hG(String str, int i, int i2) {
        this.A00 = i2;
    }
}
