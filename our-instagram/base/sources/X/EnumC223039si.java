package X;

import android.provider.Settings;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223039si {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC223039si[] A03;
    public static final EnumC223039si A04;
    public static final EnumC223039si A05;
    public static final EnumC223039si A06;
    public static final EnumC223039si A07;
    public final EnumC47122Ee A00;
    public final android.net.Uri A01;

    static {
        EnumC223039si enumC223039si = new EnumC223039si(null, EnumC47122Ee.A0j, "DEFAULT", 0);
        A04 = enumC223039si;
        EnumC223039si enumC223039si2 = new EnumC223039si(null, EnumC47122Ee.A0k, "HEADS_UP", 1);
        A05 = enumC223039si2;
        EnumC223039si enumC223039si3 = new EnumC223039si(null, EnumC47122Ee.A0m, "HEADS_UP_AND_VIBRATIONS", 2);
        A06 = enumC223039si3;
        EnumC223039si enumC223039si4 = new EnumC223039si(Settings.System.DEFAULT_NOTIFICATION_URI, EnumC47122Ee.A0F, "HEADS_UP_SOUNDS_AND_VIBRATIONS", 3);
        A07 = enumC223039si4;
        EnumC223039si[] enumC223039siArr = {enumC223039si, enumC223039si2, enumC223039si3, enumC223039si4};
        A03 = enumC223039siArr;
        A02 = AbstractC12190kN.A00(enumC223039siArr);
    }

    public static EnumC223039si valueOf(String str) {
        return (EnumC223039si) Enum.valueOf(EnumC223039si.class, str);
    }

    public static EnumC223039si[] values() {
        return (EnumC223039si[]) A03.clone();
    }

    public EnumC223039si(android.net.Uri uri, EnumC47122Ee enumC47122Ee, String str, int i) {
        this.A00 = enumC47122Ee;
        this.A01 = uri;
    }
}
