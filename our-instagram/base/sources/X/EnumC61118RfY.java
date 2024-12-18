package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61118RfY {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61118RfY[] A01;
    public static final EnumC61118RfY A02;
    public static final EnumC61118RfY A03;
    public static final EnumC61118RfY A04;

    static {
        EnumC61118RfY enumC61118RfY = new EnumC61118RfY(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC61118RfY;
        EnumC61118RfY enumC61118RfY2 = new EnumC61118RfY("DRAW", 1);
        A02 = enumC61118RfY2;
        EnumC61118RfY enumC61118RfY3 = new EnumC61118RfY("REDACT", 2);
        A04 = enumC61118RfY3;
        EnumC61118RfY[] enumC61118RfYArr = {enumC61118RfY, enumC61118RfY2, enumC61118RfY3};
        A01 = enumC61118RfYArr;
        A00 = AbstractC12190kN.A00(enumC61118RfYArr);
    }

    public static EnumC61118RfY valueOf(String str) {
        return (EnumC61118RfY) Enum.valueOf(EnumC61118RfY.class, str);
    }

    public static EnumC61118RfY[] values() {
        return (EnumC61118RfY[]) A01.clone();
    }

    public EnumC61118RfY(String str, int i) {
    }
}
