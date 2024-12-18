package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61113RfT {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61113RfT[] A01;
    public static final EnumC61113RfT A02;
    public static final EnumC61113RfT A03;
    public static final EnumC61113RfT A04;

    public static EnumC61113RfT valueOf(String str) {
        return (EnumC61113RfT) Enum.valueOf(EnumC61113RfT.class, str);
    }

    public static EnumC61113RfT[] values() {
        return (EnumC61113RfT[]) A01.clone();
    }

    static {
        EnumC61113RfT enumC61113RfT = new EnumC61113RfT("DOWNLOAD_IN_PROGRESS", 0);
        A04 = enumC61113RfT;
        EnumC61113RfT enumC61113RfT2 = new EnumC61113RfT("DOWNLOAD_FAILED", 1);
        A03 = enumC61113RfT2;
        EnumC61113RfT enumC61113RfT3 = new EnumC61113RfT(MessageAvailabilityResponseId$Companion.AVAILABLE, 2);
        A02 = enumC61113RfT3;
        EnumC61113RfT[] enumC61113RfTArr = {enumC61113RfT, enumC61113RfT2, enumC61113RfT3};
        A01 = enumC61113RfTArr;
        A00 = AbstractC12190kN.A00(enumC61113RfTArr);
    }

    public EnumC61113RfT(String str, int i) {
    }
}
