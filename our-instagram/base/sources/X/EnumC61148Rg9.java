package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rg9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61148Rg9 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61148Rg9[] A02;
    public static final EnumC61148Rg9 A03;
    public static final EnumC61148Rg9 A04;
    public final String[] A00;

    static {
        EnumC61148Rg9 enumC61148Rg9 = new EnumC61148Rg9(0, "ALL", "Litho.Resolve.ComponentRendered", "RenderCore.RenderUnit.Mounted", "Litho.ComponentTree.Resolve", "Litho.ComponentTree.Layout");
        A03 = enumC61148Rg9;
        EnumC61148Rg9 enumC61148Rg92 = new EnumC61148Rg9(1, "MIN", "Litho.ComponentTree.Resolve", "Litho.ComponentTree.Layout");
        A04 = enumC61148Rg92;
        EnumC61148Rg9[] enumC61148Rg9Arr = {enumC61148Rg9, enumC61148Rg92, new EnumC61148Rg9(2, "OFF", new String[0])};
        A02 = enumC61148Rg9Arr;
        A01 = AbstractC12190kN.A00(enumC61148Rg9Arr);
    }

    public static EnumC61148Rg9 valueOf(String str) {
        return (EnumC61148Rg9) Enum.valueOf(EnumC61148Rg9.class, str);
    }

    public static EnumC61148Rg9[] values() {
        return (EnumC61148Rg9[]) A02.clone();
    }

    public EnumC61148Rg9(int i, String str, String... strArr) {
        this.A00 = strArr;
    }
}
