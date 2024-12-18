package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.He0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39590He0 {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39590He0[] A03;
    public static final EnumC39590He0 A04;
    public static final EnumC39590He0 A05;
    public final Class A00;
    public final String A01;

    static {
        EnumC39590He0 enumC39590He0 = new EnumC39590He0(C42294IoI.class, "PRODUCT_COLLECTION", "product_collection_view_model_key", 0);
        A05 = enumC39590He0;
        EnumC39590He0 enumC39590He02 = new EnumC39590He0(null, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "", 1);
        A04 = enumC39590He02;
        EnumC39590He0[] enumC39590He0Arr = {enumC39590He0, enumC39590He02};
        A03 = enumC39590He0Arr;
        A02 = AbstractC12190kN.A00(enumC39590He0Arr);
    }

    public static EnumC39590He0 valueOf(String str) {
        return (EnumC39590He0) Enum.valueOf(EnumC39590He0.class, str);
    }

    public static EnumC39590He0[] values() {
        return (EnumC39590He0[]) A03.clone();
    }

    public EnumC39590He0(Class cls, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = cls;
    }
}
