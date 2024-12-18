package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC77663dq {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC77663dq[] A02;
    public static final EnumC77663dq A03;
    public static final EnumC77663dq A04;
    public static final EnumC77663dq A05;
    public final EnumC77673dr A00;

    static {
        EnumC77663dq enumC77663dq = new EnumC77663dq(EnumC77673dr.A0T, "MEDIA_HEADER_TITLE", 0);
        A05 = enumC77663dq;
        EnumC77663dq enumC77663dq2 = new EnumC77663dq(EnumC77673dr.A0S, "MEDIA_HEADER_SPONSORED_LABEL", 1);
        A04 = enumC77663dq2;
        EnumC77663dq enumC77663dq3 = new EnumC77663dq(EnumC77673dr.A0Q, "MEDIA_HEADER_PROFILE_PIC", 2);
        A03 = enumC77663dq3;
        EnumC77663dq[] enumC77663dqArr = {enumC77663dq, enumC77663dq2, enumC77663dq3};
        A02 = enumC77663dqArr;
        A01 = AbstractC12190kN.A00(enumC77663dqArr);
    }

    public static EnumC77663dq valueOf(String str) {
        return (EnumC77663dq) Enum.valueOf(EnumC77663dq.class, str);
    }

    public static EnumC77663dq[] values() {
        return (EnumC77663dq[]) A02.clone();
    }

    public EnumC77663dq(EnumC77673dr enumC77673dr, String str, int i) {
        this.A00 = enumC77673dr;
    }
}
