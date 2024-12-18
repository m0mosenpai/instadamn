package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46147Kbl {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46147Kbl[] A01;
    public static final EnumC46147Kbl A02;
    public static final EnumC46147Kbl A03;
    public static final EnumC46147Kbl A04;

    static {
        EnumC46147Kbl enumC46147Kbl = new EnumC46147Kbl(MessageAvailabilityResponseId$Companion.NOT_AVAILABLE, 0);
        A03 = enumC46147Kbl;
        EnumC46147Kbl enumC46147Kbl2 = new EnumC46147Kbl("LOADED", 1);
        A02 = enumC46147Kbl2;
        EnumC46147Kbl enumC46147Kbl3 = new EnumC46147Kbl("PLAYING", 2);
        A04 = enumC46147Kbl3;
        EnumC46147Kbl[] enumC46147KblArr = {enumC46147Kbl, enumC46147Kbl2, enumC46147Kbl3};
        A01 = enumC46147KblArr;
        A00 = AbstractC12190kN.A00(enumC46147KblArr);
    }

    public static EnumC46147Kbl valueOf(String str) {
        return (EnumC46147Kbl) Enum.valueOf(EnumC46147Kbl.class, str);
    }

    public static EnumC46147Kbl[] values() {
        return (EnumC46147Kbl[]) A01.clone();
    }

    public EnumC46147Kbl(String str, int i) {
    }
}
