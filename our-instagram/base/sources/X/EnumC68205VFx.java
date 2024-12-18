package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VFx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68205VFx {
    public static final EnumC68205VFx[] A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68205VFx[] A03;
    public static final EnumC68205VFx A04;
    public static final EnumC68205VFx A05;
    public static final EnumC68205VFx A06;
    public static final EnumC68205VFx A07;
    public static final EnumC68205VFx A08;
    public final String A00;

    public static EnumC68205VFx valueOf(String str) {
        return (EnumC68205VFx) Enum.valueOf(EnumC68205VFx.class, str);
    }

    public static EnumC68205VFx[] values() {
        return (EnumC68205VFx[]) A03.clone();
    }

    static {
        EnumC68205VFx enumC68205VFx = new EnumC68205VFx("STATIC", 0, "static");
        A08 = enumC68205VFx;
        EnumC68205VFx enumC68205VFx2 = new EnumC68205VFx("ANIMATED", 1, "animated");
        A04 = enumC68205VFx2;
        EnumC68205VFx enumC68205VFx3 = new EnumC68205VFx("ANIMATED_WHILE_LOADING", 2, "animated_while_loading");
        A06 = enumC68205VFx3;
        EnumC68205VFx enumC68205VFx4 = new EnumC68205VFx("ANIMATED_WHILE_LOADED", 3, "animated_while_loaded");
        A05 = enumC68205VFx4;
        EnumC68205VFx enumC68205VFx5 = new EnumC68205VFx("DISABLED", 4, "disabled");
        A07 = enumC68205VFx5;
        EnumC68205VFx[] enumC68205VFxArr = {enumC68205VFx, enumC68205VFx2, enumC68205VFx3, enumC68205VFx4, enumC68205VFx5};
        A03 = enumC68205VFxArr;
        C020508b A00 = AbstractC12190kN.A00(enumC68205VFxArr);
        A02 = A00;
        A01 = (EnumC68205VFx[]) A00.toArray(new EnumC68205VFx[0]);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68205VFx(String str, int i, String str2) {
        this.A00 = str2;
    }
}
