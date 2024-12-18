package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53254Ngs {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53254Ngs[] A03;
    public static final EnumC53254Ngs A04;
    public static final EnumC53254Ngs A05;
    public static final EnumC53254Ngs A06;
    public static final EnumC53254Ngs A07;
    public final int A00;
    public final LeadGenInfoFieldTypes A01;

    public static EnumC53254Ngs valueOf(String str) {
        return (EnumC53254Ngs) Enum.valueOf(EnumC53254Ngs.class, str);
    }

    public static EnumC53254Ngs[] values() {
        return (EnumC53254Ngs[]) A03.clone();
    }

    static {
        EnumC53254Ngs enumC53254Ngs = new EnumC53254Ngs(LeadGenInfoFieldTypes.A0D, "NAME", 0, 2131964927);
        A05 = enumC53254Ngs;
        EnumC53254Ngs enumC53254Ngs2 = new EnumC53254Ngs(LeadGenInfoFieldTypes.A0P, "PHONE", 1, 2131964928);
        A06 = enumC53254Ngs2;
        EnumC53254Ngs enumC53254Ngs3 = new EnumC53254Ngs(LeadGenInfoFieldTypes.A0A, PaymentDetailChangeTypes$Companion.EMAIL, 2, 2131964926);
        A04 = enumC53254Ngs3;
        EnumC53254Ngs enumC53254Ngs4 = new EnumC53254Ngs(LeadGenInfoFieldTypes.A0a, "ZIP", 3, 2131964933);
        A07 = enumC53254Ngs4;
        EnumC53254Ngs[] enumC53254NgsArr = {enumC53254Ngs, enumC53254Ngs2, enumC53254Ngs3, enumC53254Ngs4, new EnumC53254Ngs(LeadGenInfoFieldTypes.A07, "DEFAULT_SHORT_ANSWER", 4, 2131965018)};
        A03 = enumC53254NgsArr;
        A02 = AbstractC12190kN.A00(enumC53254NgsArr);
    }

    public EnumC53254Ngs(LeadGenInfoFieldTypes leadGenInfoFieldTypes, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = leadGenInfoFieldTypes;
    }
}
