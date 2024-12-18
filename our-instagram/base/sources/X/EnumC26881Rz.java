package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1Rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC26881Rz {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC26881Rz[] A03;
    public static final EnumC26881Rz A04;
    public static final EnumC26881Rz A05;
    public static final EnumC26881Rz A06;
    public static final EnumC26881Rz A07;
    public static final EnumC26881Rz A08;
    public static final EnumC26881Rz A09;
    public static final EnumC26881Rz A0A;
    public static final EnumC26881Rz A0B;
    public static final EnumC26881Rz A0C;
    public static final EnumC26881Rz A0D;
    public static final EnumC26881Rz A0E;
    public static final EnumC26881Rz A0F;
    public static final EnumC26881Rz A0G;
    public final int A00;

    static {
        EnumC26881Rz enumC26881Rz = new EnumC26881Rz("RESERVED", 0, 0);
        A0D = enumC26881Rz;
        EnumC26881Rz enumC26881Rz2 = new EnumC26881Rz("IMAGE", 1, 1);
        A09 = enumC26881Rz2;
        EnumC26881Rz enumC26881Rz3 = new EnumC26881Rz("VIDEO", 2, 2);
        A0E = enumC26881Rz3;
        EnumC26881Rz enumC26881Rz4 = new EnumC26881Rz("GRAPHQL", 3, 3);
        A08 = enumC26881Rz4;
        EnumC26881Rz enumC26881Rz5 = new EnumC26881Rz("API", 4, 4);
        A05 = enumC26881Rz5;
        EnumC26881Rz enumC26881Rz6 = new EnumC26881Rz("ANALYTICS", 5, 5);
        A04 = enumC26881Rz6;
        EnumC26881Rz enumC26881Rz7 = new EnumC26881Rz("DO_NOT_USE", 6, 6);
        A07 = enumC26881Rz7;
        EnumC26881Rz enumC26881Rz8 = new EnumC26881Rz("CRITICAL_API", 7, 7);
        A06 = enumC26881Rz8;
        EnumC26881Rz enumC26881Rz9 = new EnumC26881Rz("MEDIA_UPLOAD", 8, 8);
        A0B = enumC26881Rz9;
        EnumC26881Rz enumC26881Rz10 = new EnumC26881Rz("VIDEO_CALL", 9, 9);
        A0F = enumC26881Rz10;
        EnumC26881Rz enumC26881Rz11 = new EnumC26881Rz("IMAGE_THUMBNAIL", 10, 10);
        A0A = enumC26881Rz11;
        EnumC26881Rz enumC26881Rz12 = new EnumC26881Rz("VIDEO_COVER_IMAGE", 11, 11);
        A0G = enumC26881Rz12;
        EnumC26881Rz enumC26881Rz13 = new EnumC26881Rz("OTHER", 12, 255);
        A0C = enumC26881Rz13;
        EnumC26881Rz[] enumC26881RzArr = {enumC26881Rz, enumC26881Rz2, enumC26881Rz3, enumC26881Rz4, enumC26881Rz5, enumC26881Rz6, enumC26881Rz7, enumC26881Rz8, enumC26881Rz9, enumC26881Rz10, enumC26881Rz11, enumC26881Rz12, enumC26881Rz13};
        A03 = enumC26881RzArr;
        A02 = AbstractC12190kN.A00(enumC26881RzArr);
        A01 = new HashMap();
        for (EnumC26881Rz enumC26881Rz14 : values()) {
            A01.put(Integer.valueOf(enumC26881Rz14.A00), enumC26881Rz14);
        }
    }

    public static EnumC26881Rz valueOf(String str) {
        return (EnumC26881Rz) Enum.valueOf(EnumC26881Rz.class, str);
    }

    public static EnumC26881Rz[] values() {
        return (EnumC26881Rz[]) A03.clone();
    }

    public EnumC26881Rz(String str, int i, int i2) {
        this.A00 = i2;
    }
}
