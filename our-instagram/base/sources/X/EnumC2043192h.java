package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.92h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2043192h {
    public static final EnumC2043192h[] A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC2043192h[] A04;
    public static final EnumC2043192h A05;
    public static final EnumC2043192h A06;
    public static final EnumC2043192h A07;
    public final int A00;
    public final EnumC2043292i A01;

    static {
        EnumC2043192h enumC2043192h = new EnumC2043192h(EnumC2043292i.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, MessageAvailabilityResponseId$Companion.NOT_SUPPORTED, 0, 0);
        A06 = enumC2043192h;
        EnumC2043192h enumC2043192h2 = new EnumC2043192h(EnumC2043292i.MUTED_WORDS, "MUTED_WORDS", 1, 1);
        A05 = enumC2043192h2;
        EnumC2043192h enumC2043192h3 = new EnumC2043192h(EnumC2043292i.PROACTIVE_WARNING_IIC, "PROACTIVE_WARNING_IIC", 2, 2);
        A07 = enumC2043192h3;
        EnumC2043192h[] enumC2043192hArr = {enumC2043192h, enumC2043192h2, enumC2043192h3};
        A04 = enumC2043192hArr;
        A03 = AbstractC12190kN.A00(enumC2043192hArr);
        A02 = values();
    }

    public static EnumC2043192h valueOf(String str) {
        return (EnumC2043192h) Enum.valueOf(EnumC2043192h.class, str);
    }

    public static EnumC2043192h[] values() {
        return (EnumC2043192h[]) A04.clone();
    }

    public EnumC2043192h(EnumC2043292i enumC2043292i, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = enumC2043292i;
    }
}
