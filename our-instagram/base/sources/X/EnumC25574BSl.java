package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.BSl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC25574BSl {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC25574BSl[] A02;
    public static final EnumC25574BSl A03;
    public final C3LX A00;

    static {
        EnumC25574BSl enumC25574BSl = new EnumC25574BSl(AbstractC25575BSm.A00);
        A03 = enumC25574BSl;
        EnumC25574BSl[] enumC25574BSlArr = {enumC25574BSl};
        A02 = enumC25574BSlArr;
        A01 = AbstractC12190kN.A00(enumC25574BSlArr);
    }

    public EnumC25574BSl(C3LX c3lx) {
        this.A00 = c3lx;
    }

    public static EnumC25574BSl valueOf(String str) {
        return (EnumC25574BSl) Enum.valueOf(EnumC25574BSl.class, str);
    }

    public static EnumC25574BSl[] values() {
        return (EnumC25574BSl[]) A02.clone();
    }
}
