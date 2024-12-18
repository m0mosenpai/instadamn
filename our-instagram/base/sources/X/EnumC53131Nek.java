package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nek, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53131Nek {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53131Nek[] A01;
    public static final EnumC53131Nek A02;
    public static final EnumC53131Nek A03;
    public static final EnumC53131Nek A04;

    static {
        EnumC53131Nek enumC53131Nek = new EnumC53131Nek(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC53131Nek;
        EnumC53131Nek enumC53131Nek2 = new EnumC53131Nek("LOADING", 1);
        A02 = enumC53131Nek2;
        EnumC53131Nek enumC53131Nek3 = new EnumC53131Nek("SHOWING", 2);
        A04 = enumC53131Nek3;
        EnumC53131Nek[] enumC53131NekArr = {enumC53131Nek, enumC53131Nek2, enumC53131Nek3, new EnumC53131Nek("ERROR", 3)};
        A01 = enumC53131NekArr;
        A00 = AbstractC12190kN.A00(enumC53131NekArr);
    }

    public static EnumC53131Nek valueOf(String str) {
        return (EnumC53131Nek) Enum.valueOf(EnumC53131Nek.class, str);
    }

    public static EnumC53131Nek[] values() {
        return (EnumC53131Nek[]) A01.clone();
    }

    public EnumC53131Nek(String str, int i) {
    }
}
