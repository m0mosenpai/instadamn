package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27368C5x {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27368C5x[] A01;
    public static final EnumC27368C5x A02;
    public static final EnumC27368C5x A03;

    static {
        EnumC27368C5x enumC27368C5x = new EnumC27368C5x(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC27368C5x;
        EnumC27368C5x enumC27368C5x2 = new EnumC27368C5x("DISMISS_AND_SHOW_SEND_SNACKBAR", 1);
        A02 = enumC27368C5x2;
        EnumC27368C5x[] enumC27368C5xArr = {enumC27368C5x, enumC27368C5x2};
        A01 = enumC27368C5xArr;
        A00 = AbstractC12190kN.A00(enumC27368C5xArr);
    }

    public static EnumC27368C5x valueOf(String str) {
        return (EnumC27368C5x) Enum.valueOf(EnumC27368C5x.class, str);
    }

    public static EnumC27368C5x[] values() {
        return (EnumC27368C5x[]) A01.clone();
    }

    public EnumC27368C5x(String str, int i) {
    }
}
