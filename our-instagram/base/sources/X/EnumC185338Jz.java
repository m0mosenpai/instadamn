package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC185338Jz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC185338Jz[] A01;
    public static final EnumC185338Jz A02;
    public static final EnumC185338Jz A03;
    public static final EnumC185338Jz A04;
    public static final EnumC185338Jz A05;
    public static final EnumC185338Jz A06;

    static {
        EnumC185338Jz enumC185338Jz = new EnumC185338Jz("UNSET", 0);
        A06 = enumC185338Jz;
        EnumC185338Jz enumC185338Jz2 = new EnumC185338Jz("LOADING", 1);
        A03 = enumC185338Jz2;
        EnumC185338Jz enumC185338Jz3 = new EnumC185338Jz("FAILED", 2);
        A02 = enumC185338Jz3;
        EnumC185338Jz enumC185338Jz4 = new EnumC185338Jz(MessageAvailabilityResponseId$Companion.NOT_AVAILABLE, 3);
        A04 = enumC185338Jz4;
        EnumC185338Jz enumC185338Jz5 = new EnumC185338Jz("SUCCESS", 4);
        A05 = enumC185338Jz5;
        EnumC185338Jz[] enumC185338JzArr = {enumC185338Jz, enumC185338Jz2, enumC185338Jz3, enumC185338Jz4, enumC185338Jz5};
        A01 = enumC185338JzArr;
        A00 = AbstractC12190kN.A00(enumC185338JzArr);
    }

    public static EnumC185338Jz valueOf(String str) {
        return (EnumC185338Jz) Enum.valueOf(EnumC185338Jz.class, str);
    }

    public static EnumC185338Jz[] values() {
        return (EnumC185338Jz[]) A01.clone();
    }

    public EnumC185338Jz(String str, int i) {
    }
}
