package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68153VDx {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68153VDx[] A03;
    public static final EnumC68153VDx A04;
    public static final EnumC68153VDx A05;
    public static final EnumC68153VDx A06;
    public static final EnumC68153VDx A07;
    public static final EnumC68153VDx A08;
    public static final EnumC68153VDx A09;
    public final String A00;

    static {
        EnumC68153VDx enumC68153VDx = new EnumC68153VDx("UNSTYLED", 0, "UNSTYLED");
        A09 = enumC68153VDx;
        EnumC68153VDx enumC68153VDx2 = new EnumC68153VDx("BODY", 1, "BODY");
        A05 = enumC68153VDx2;
        EnumC68153VDx enumC68153VDx3 = new EnumC68153VDx("PULL_QUOTE", 2, "PULL_QUOTE");
        A08 = enumC68153VDx3;
        EnumC68153VDx enumC68153VDx4 = new EnumC68153VDx("BLOCK_QUOTE", 3, "BLOCK_QUOTE");
        A04 = enumC68153VDx4;
        EnumC68153VDx enumC68153VDx5 = new EnumC68153VDx("CODE", 4, "CODE");
        A06 = enumC68153VDx5;
        EnumC68153VDx enumC68153VDx6 = new EnumC68153VDx("HEADER_ONE", 5, "HEADER_ONE");
        A07 = enumC68153VDx6;
        EnumC68153VDx[] enumC68153VDxArr = {enumC68153VDx, enumC68153VDx2, enumC68153VDx3, enumC68153VDx4, enumC68153VDx5, enumC68153VDx6, new EnumC68153VDx("HEADER_TWO", 6, "HEADER_TWO")};
        A03 = enumC68153VDxArr;
        A02 = AbstractC12190kN.A00(enumC68153VDxArr);
        A01 = new HashMap();
        for (EnumC68153VDx enumC68153VDx7 : values()) {
            A01.put(enumC68153VDx7.A00, enumC68153VDx7);
        }
    }

    public static EnumC68153VDx valueOf(String str) {
        return (EnumC68153VDx) Enum.valueOf(EnumC68153VDx.class, str);
    }

    public static EnumC68153VDx[] values() {
        return (EnumC68153VDx[]) A03.clone();
    }

    public EnumC68153VDx(String str, int i, String str2) {
        this.A00 = str2;
    }
}
