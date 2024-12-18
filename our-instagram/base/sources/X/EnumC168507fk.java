package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC168507fk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC168507fk[] A01;
    public static final EnumC168507fk A02;
    public static final EnumC168507fk A03;
    public static final EnumC168507fk A04;

    static {
        EnumC168507fk enumC168507fk = new EnumC168507fk("COVERED_COMMENT", 0);
        A02 = enumC168507fk;
        EnumC168507fk enumC168507fk2 = new EnumC168507fk("HIDDEN_COMMENT", 1);
        A03 = enumC168507fk2;
        EnumC168507fk enumC168507fk3 = new EnumC168507fk(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2);
        A04 = enumC168507fk3;
        EnumC168507fk[] enumC168507fkArr = {enumC168507fk, enumC168507fk2, enumC168507fk3};
        A01 = enumC168507fkArr;
        A00 = AbstractC12190kN.A00(enumC168507fkArr);
    }

    public static EnumC168507fk valueOf(String str) {
        return (EnumC168507fk) Enum.valueOf(EnumC168507fk.class, str);
    }

    public static EnumC168507fk[] values() {
        return (EnumC168507fk[]) A01.clone();
    }

    public EnumC168507fk(String str, int i) {
    }
}
