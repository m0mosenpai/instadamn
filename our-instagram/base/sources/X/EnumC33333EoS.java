package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33333EoS {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33333EoS[] A01;
    public static final EnumC33333EoS A02;
    public static final EnumC33333EoS A03;
    public static final EnumC33333EoS A04;

    static {
        EnumC33333EoS enumC33333EoS = new EnumC33333EoS(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = enumC33333EoS;
        EnumC33333EoS enumC33333EoS2 = new EnumC33333EoS("AI_HOME", 1);
        A02 = enumC33333EoS2;
        EnumC33333EoS enumC33333EoS3 = new EnumC33333EoS("AI_THREAD", 2);
        A03 = enumC33333EoS3;
        EnumC33333EoS[] enumC33333EoSArr = {enumC33333EoS, enumC33333EoS2, enumC33333EoS3};
        A01 = enumC33333EoSArr;
        A00 = AbstractC12190kN.A00(enumC33333EoSArr);
    }

    public static EnumC33333EoS valueOf(String str) {
        return (EnumC33333EoS) Enum.valueOf(EnumC33333EoS.class, str);
    }

    public static EnumC33333EoS[] values() {
        return (EnumC33333EoS[]) A01.clone();
    }

    public EnumC33333EoS(String str, int i) {
    }
}
