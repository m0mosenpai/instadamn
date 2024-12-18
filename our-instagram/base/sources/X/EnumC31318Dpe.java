package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dpe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31318Dpe {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC31318Dpe[] A02;
    public static final EnumC31318Dpe A03;
    public static final EnumC31318Dpe A04;
    public final EnumC31316Dpc A00;

    static {
        EnumC31318Dpe enumC31318Dpe = new EnumC31318Dpe(EnumC31316Dpc.SUGGESTED_REPLY, "SUGGESTED_REPLY", 0);
        A04 = enumC31318Dpe;
        EnumC31318Dpe enumC31318Dpe2 = new EnumC31318Dpe(EnumC31316Dpc.CONFIRM_ORDER, "CONFIRM_ORDER", 1);
        A03 = enumC31318Dpe2;
        EnumC31318Dpe[] enumC31318DpeArr = {enumC31318Dpe, enumC31318Dpe2};
        A02 = enumC31318DpeArr;
        A01 = AbstractC12190kN.A00(enumC31318DpeArr);
    }

    public static EnumC31318Dpe valueOf(String str) {
        return (EnumC31318Dpe) Enum.valueOf(EnumC31318Dpe.class, str);
    }

    public static EnumC31318Dpe[] values() {
        return (EnumC31318Dpe[]) A02.clone();
    }

    public EnumC31318Dpe(EnumC31316Dpc enumC31316Dpc, String str, int i) {
        this.A00 = enumC31316Dpc;
    }
}
