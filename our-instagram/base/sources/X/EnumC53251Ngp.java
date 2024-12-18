package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53251Ngp {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53251Ngp[] A03;
    public static final EnumC53251Ngp A04;
    public static final EnumC53251Ngp A05;
    public static final EnumC53251Ngp A06;
    public final int A00;
    public final LeadGenEntryPoint A01;

    public static EnumC53251Ngp valueOf(String str) {
        return (EnumC53251Ngp) Enum.valueOf(EnumC53251Ngp.class, str);
    }

    public static EnumC53251Ngp[] values() {
        return (EnumC53251Ngp[]) A03.clone();
    }

    static {
        EnumC53251Ngp enumC53251Ngp = new EnumC53251Ngp(LeadGenEntryPoint.A05, "PROFILE", 0, 2131964874);
        A05 = enumC53251Ngp;
        EnumC53251Ngp enumC53251Ngp2 = new EnumC53251Ngp(LeadGenEntryPoint.A07, "STICKER", 1, 2131965031);
        A06 = enumC53251Ngp2;
        EnumC53251Ngp enumC53251Ngp3 = new EnumC53251Ngp(LeadGenEntryPoint.A04, "FLAGGED_FORM", 2, 2131964874);
        A04 = enumC53251Ngp3;
        EnumC53251Ngp[] enumC53251NgpArr = {enumC53251Ngp, enumC53251Ngp2, enumC53251Ngp3};
        A03 = enumC53251NgpArr;
        A02 = AbstractC12190kN.A00(enumC53251NgpArr);
    }

    public EnumC53251Ngp(LeadGenEntryPoint leadGenEntryPoint, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = leadGenEntryPoint;
    }
}
