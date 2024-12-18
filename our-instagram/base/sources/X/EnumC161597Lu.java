package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC161597Lu {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC161597Lu[] A02;
    public static final EnumC161597Lu A03;
    public static final EnumC161597Lu A04;
    public final InterfaceC16660sJ A00;

    static {
        EnumC161597Lu enumC161597Lu = new EnumC161597Lu("THREAD_VIEW_ENTRY", C161607Lv.A00, 0);
        A04 = enumC161597Lu;
        EnumC161597Lu enumC161597Lu2 = new EnumC161597Lu("THREAD_METADATA_UPDATE", C161617Lw.A00, 1);
        A03 = enumC161597Lu2;
        EnumC161597Lu[] enumC161597LuArr = {enumC161597Lu, enumC161597Lu2};
        A02 = enumC161597LuArr;
        A01 = AbstractC12190kN.A00(enumC161597LuArr);
    }

    public static EnumC161597Lu valueOf(String str) {
        return (EnumC161597Lu) Enum.valueOf(EnumC161597Lu.class, str);
    }

    public static EnumC161597Lu[] values() {
        return (EnumC161597Lu[]) A02.clone();
    }

    public EnumC161597Lu(String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A00 = interfaceC16660sJ;
    }
}
