package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33348Eoh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33348Eoh[] A01;
    public static final EnumC33348Eoh A02;
    public static final EnumC33348Eoh A03;
    public static final EnumC33348Eoh A04;
    public static final EnumC33348Eoh A05;

    static {
        EnumC33348Eoh enumC33348Eoh = new EnumC33348Eoh(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC33348Eoh;
        EnumC33348Eoh enumC33348Eoh2 = new EnumC33348Eoh("VERIFICATION_ERROR", 1);
        A05 = enumC33348Eoh2;
        EnumC33348Eoh enumC33348Eoh3 = new EnumC33348Eoh("QUOTE_ERROR", 2);
        A04 = enumC33348Eoh3;
        EnumC33348Eoh enumC33348Eoh4 = new EnumC33348Eoh("HOLDOUT_ERROR", 3);
        A02 = enumC33348Eoh4;
        EnumC33348Eoh[] enumC33348EohArr = {enumC33348Eoh, enumC33348Eoh2, enumC33348Eoh3, enumC33348Eoh4, new EnumC33348Eoh("GRANT_DOGFOODING_ENTITLEMENT_CONFIRMATION", 4)};
        A01 = enumC33348EohArr;
        A00 = AbstractC12190kN.A00(enumC33348EohArr);
    }

    public static EnumC33348Eoh valueOf(String str) {
        return (EnumC33348Eoh) Enum.valueOf(EnumC33348Eoh.class, str);
    }

    public static EnumC33348Eoh[] values() {
        return (EnumC33348Eoh[]) A01.clone();
    }

    public EnumC33348Eoh(String str, int i) {
    }
}
