package X;

import kotlin.Deprecated;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.47k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC915447k {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC915447k[] A01;
    public static final EnumC915447k A02;
    public static final EnumC915447k A03;
    public static final EnumC915447k A04;

    @Deprecated(message = "")
    public static final EnumC915447k A05;

    @Deprecated(message = "")
    public static final EnumC915447k A06;
    public static final EnumC915447k A07;
    public static final EnumC915447k A08;
    public static final EnumC915447k A09;

    @Deprecated(message = "")
    public static final EnumC915447k A0A;
    public static final EnumC915447k A0B;

    public static EnumC915447k valueOf(String str) {
        return (EnumC915447k) Enum.valueOf(EnumC915447k.class, str);
    }

    public static EnumC915447k[] values() {
        return (EnumC915447k[]) A01.clone();
    }

    static {
        EnumC915447k enumC915447k = new EnumC915447k("UNINITIALIZED", 0);
        A08 = enumC915447k;
        EnumC915447k enumC915447k2 = new EnumC915447k("DRAFT", 1);
        A06 = enumC915447k2;
        EnumC915447k enumC915447k3 = new EnumC915447k("NOT_UPLOADED", 2);
        A07 = enumC915447k3;
        EnumC915447k enumC915447k4 = new EnumC915447k("CREATED_MEDIA", 3);
        A05 = enumC915447k4;
        EnumC915447k enumC915447k5 = new EnumC915447k("UPLOADED_DECOR_IMAGE", 4);
        A0A = enumC915447k5;
        EnumC915447k enumC915447k6 = new EnumC915447k("UPLOADED_VIDEO", 5);
        A0B = enumC915447k6;
        EnumC915447k enumC915447k7 = new EnumC915447k("UPLOADED", 6);
        A09 = enumC915447k7;
        EnumC915447k enumC915447k8 = new EnumC915447k("CONFIGURING_MULTIPLE_TARGETS", 7);
        A04 = enumC915447k8;
        EnumC915447k enumC915447k9 = new EnumC915447k("CONFIGURED", 8);
        A02 = enumC915447k9;
        EnumC915447k enumC915447k10 = new EnumC915447k("CONFIGURED_CLOUD_DRAFT", 9);
        A03 = enumC915447k10;
        EnumC915447k[] enumC915447kArr = {enumC915447k, enumC915447k2, enumC915447k3, enumC915447k4, enumC915447k5, enumC915447k6, enumC915447k7, enumC915447k8, enumC915447k9, enumC915447k10};
        A01 = enumC915447kArr;
        A00 = AbstractC12190kN.A00(enumC915447kArr);
    }

    public final boolean A00(EnumC915447k enumC915447k) {
        if (enumC915447k != null && ordinal() < enumC915447k.ordinal()) {
            return true;
        }
        return false;
    }

    public EnumC915447k(String str, int i) {
    }
}
