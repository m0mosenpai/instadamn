package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61109RfP {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61109RfP[] A01;
    public static final EnumC61109RfP A02;
    public static final EnumC61109RfP A03;
    public static final EnumC61109RfP A04;

    static {
        EnumC61109RfP enumC61109RfP = new EnumC61109RfP("WIFI", 0);
        A04 = enumC61109RfP;
        EnumC61109RfP enumC61109RfP2 = new EnumC61109RfP("OTHER", 1);
        A03 = enumC61109RfP2;
        EnumC61109RfP enumC61109RfP3 = new EnumC61109RfP(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2);
        A02 = enumC61109RfP3;
        EnumC61109RfP[] enumC61109RfPArr = {enumC61109RfP, enumC61109RfP2, enumC61109RfP3};
        A01 = enumC61109RfPArr;
        A00 = AbstractC12190kN.A00(enumC61109RfPArr);
    }

    public static EnumC61109RfP valueOf(String str) {
        return (EnumC61109RfP) Enum.valueOf(EnumC61109RfP.class, str);
    }

    public static EnumC61109RfP[] values() {
        return (EnumC61109RfP[]) A01.clone();
    }

    public EnumC61109RfP(String str, int i) {
    }
}
