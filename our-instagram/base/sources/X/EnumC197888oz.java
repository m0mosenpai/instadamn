package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC197888oz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC197888oz[] A01;
    public static final EnumC197888oz A02;
    public static final EnumC197888oz A03;
    public static final EnumC197888oz A04;

    static {
        EnumC197888oz enumC197888oz = new EnumC197888oz(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = enumC197888oz;
        EnumC197888oz enumC197888oz2 = new EnumC197888oz("FIT", 1);
        A03 = enumC197888oz2;
        EnumC197888oz enumC197888oz3 = new EnumC197888oz("CROP", 2);
        A02 = enumC197888oz3;
        EnumC197888oz[] enumC197888ozArr = {enumC197888oz, enumC197888oz2, enumC197888oz3};
        A01 = enumC197888ozArr;
        A00 = AbstractC12190kN.A00(enumC197888ozArr);
    }

    public static EnumC197888oz valueOf(String str) {
        return (EnumC197888oz) Enum.valueOf(EnumC197888oz.class, str);
    }

    public static EnumC197888oz[] values() {
        return (EnumC197888oz[]) A01.clone();
    }

    public EnumC197888oz(String str, int i) {
    }
}
