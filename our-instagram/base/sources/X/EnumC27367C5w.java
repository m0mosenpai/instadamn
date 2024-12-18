package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27367C5w {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27367C5w[] A01;
    public static final EnumC27367C5w A02;
    public static final EnumC27367C5w A03;

    static {
        EnumC27367C5w enumC27367C5w = new EnumC27367C5w(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC27367C5w;
        EnumC27367C5w enumC27367C5w2 = new EnumC27367C5w("CLOSE_ON_DISMISS_KEYBOARD", 1);
        A02 = enumC27367C5w2;
        EnumC27367C5w[] enumC27367C5wArr = {enumC27367C5w, enumC27367C5w2};
        A01 = enumC27367C5wArr;
        A00 = AbstractC12190kN.A00(enumC27367C5wArr);
    }

    public static EnumC27367C5w valueOf(String str) {
        return (EnumC27367C5w) Enum.valueOf(EnumC27367C5w.class, str);
    }

    public static EnumC27367C5w[] values() {
        return (EnumC27367C5w[]) A01.clone();
    }

    public EnumC27367C5w(String str, int i) {
    }
}
