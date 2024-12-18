package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.New, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53143New {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53143New[] A01;
    public static final EnumC53143New A02;
    public static final EnumC53143New A03;
    public static final EnumC53143New A04;

    static {
        EnumC53143New enumC53143New = new EnumC53143New(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC53143New;
        EnumC53143New enumC53143New2 = new EnumC53143New("CONTACTING", 1);
        A02 = enumC53143New2;
        EnumC53143New enumC53143New3 = new EnumC53143New("RINGING_OUTGOING", 2);
        A04 = enumC53143New3;
        EnumC53143New[] enumC53143NewArr = {enumC53143New, enumC53143New2, enumC53143New3};
        A01 = enumC53143NewArr;
        A00 = AbstractC12190kN.A00(enumC53143NewArr);
    }

    public static EnumC53143New valueOf(String str) {
        return (EnumC53143New) Enum.valueOf(EnumC53143New.class, str);
    }

    public static EnumC53143New[] values() {
        return (EnumC53143New[]) A01.clone();
    }

    public EnumC53143New(String str, int i) {
    }
}
