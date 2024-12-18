package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eor, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33358Eor {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33358Eor[] A01;
    public static final EnumC33358Eor A02;
    public static final EnumC33358Eor A03;
    public static final EnumC33358Eor A04;
    public static final EnumC33358Eor A05;
    public static final EnumC33358Eor A06;

    static {
        EnumC33358Eor enumC33358Eor = new EnumC33358Eor("EXCEED_MAX_COUNT", 0);
        A02 = enumC33358Eor;
        EnumC33358Eor enumC33358Eor2 = new EnumC33358Eor("GROUP_INCLUDED", 1);
        A03 = enumC33358Eor2;
        EnumC33358Eor enumC33358Eor3 = new EnumC33358Eor("THREAD_TOO_OLD", 2);
        A06 = enumC33358Eor3;
        EnumC33358Eor enumC33358Eor4 = new EnumC33358Eor("MESSAGE_REQUEST_INCLUDED", 3);
        A04 = enumC33358Eor4;
        EnumC33358Eor enumC33358Eor5 = new EnumC33358Eor(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4);
        A05 = enumC33358Eor5;
        EnumC33358Eor[] enumC33358EorArr = {enumC33358Eor, enumC33358Eor2, enumC33358Eor3, enumC33358Eor4, enumC33358Eor5};
        A01 = enumC33358EorArr;
        A00 = AbstractC12190kN.A00(enumC33358EorArr);
    }

    public static EnumC33358Eor valueOf(String str) {
        return (EnumC33358Eor) Enum.valueOf(EnumC33358Eor.class, str);
    }

    public static EnumC33358Eor[] values() {
        return (EnumC33358Eor[]) A01.clone();
    }

    public EnumC33358Eor(String str, int i) {
    }
}
