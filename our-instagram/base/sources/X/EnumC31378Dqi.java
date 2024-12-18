package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dqi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31378Dqi {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC31378Dqi[] A01;
    public static final EnumC31378Dqi A02;
    public static final EnumC31378Dqi A03;

    static {
        EnumC31378Dqi enumC31378Dqi = new EnumC31378Dqi("TOOLTIP_HYPER_CARD", 0);
        A02 = enumC31378Dqi;
        EnumC31378Dqi enumC31378Dqi2 = new EnumC31378Dqi("TOOLTIP_TOP", 1);
        A03 = enumC31378Dqi2;
        EnumC31378Dqi[] enumC31378DqiArr = {enumC31378Dqi, enumC31378Dqi2};
        A01 = enumC31378DqiArr;
        A00 = AbstractC12190kN.A00(enumC31378DqiArr);
    }

    public static EnumC31378Dqi valueOf(String str) {
        return (EnumC31378Dqi) Enum.valueOf(EnumC31378Dqi.class, str);
    }

    public static EnumC31378Dqi[] values() {
        return (EnumC31378Dqi[]) A01.clone();
    }

    public EnumC31378Dqi(String str, int i) {
    }
}
