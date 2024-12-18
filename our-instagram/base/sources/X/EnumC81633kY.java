package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC81633kY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC81633kY[] A02;
    public static final EnumC81633kY A03;
    public static final EnumC81633kY A04;
    public static final EnumC81633kY A05;
    public static final EnumC81633kY A06;
    public static final EnumC81633kY A07;
    public static final EnumC81633kY A08;
    public static final EnumC81633kY A09;
    public static final EnumC81633kY A0A;
    public static final EnumC81633kY A0B;
    public static final EnumC81633kY A0C;
    public static final EnumC81633kY A0D;
    public static final EnumC81633kY A0E;
    public static final EnumC81633kY A0F;
    public static final EnumC81633kY A0G;
    public static final EnumC81633kY A0H;
    public final long A00;

    static {
        EnumC81633kY enumC81633kY = new EnumC81633kY("TEXT", 0, 1L);
        A0G = enumC81633kY;
        EnumC81633kY enumC81633kY2 = new EnumC81633kY("CLIP", 1, 2L);
        A05 = enumC81633kY2;
        EnumC81633kY enumC81633kY3 = new EnumC81633kY("REEL_SHARE", 2, 4L);
        A0E = enumC81633kY3;
        EnumC81633kY enumC81633kY4 = new EnumC81633kY("MEDIA", 3, 8L);
        A09 = enumC81633kY4;
        EnumC81633kY enumC81633kY5 = new EnumC81633kY("STORY", 4, 16L);
        A0F = enumC81633kY5;
        EnumC81633kY enumC81633kY6 = new EnumC81633kY("LINK", 5, 32L);
        A08 = enumC81633kY6;
        EnumC81633kY enumC81633kY7 = new EnumC81633kY("GENERIC_XMA", 6, 64L);
        A06 = enumC81633kY7;
        EnumC81633kY enumC81633kY8 = new EnumC81633kY("PROFILE", 7, 128L);
        A0C = enumC81633kY8;
        EnumC81633kY enumC81633kY9 = new EnumC81633kY("PHOTO", 8, 256L);
        A0B = enumC81633kY9;
        EnumC81633kY enumC81633kY10 = new EnumC81633kY("VIDEO", 9, 512L);
        A0H = enumC81633kY10;
        EnumC81633kY enumC81633kY11 = new EnumC81633kY("AUDIO", 10, OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED);
        A03 = enumC81633kY11;
        EnumC81633kY enumC81633kY12 = new EnumC81633kY("GIF_STICKER", 11, OdexSchemeArtXdex.STATE_DEX2OAT_CLASSPATH_SET);
        A07 = enumC81633kY12;
        EnumC81633kY enumC81633kY13 = new EnumC81633kY("RAVEN", 12, OdexSchemeArtXdex.STATE_PGO_NEEDED);
        A0D = enumC81633kY13;
        EnumC81633kY enumC81633kY14 = new EnumC81633kY("MEDIA_LIST", 13, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A0A = enumC81633kY14;
        EnumC81633kY enumC81633kY15 = new EnumC81633kY("CALLING", 14, OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED);
        A04 = enumC81633kY15;
        EnumC81633kY[] enumC81633kYArr = {enumC81633kY, enumC81633kY2, enumC81633kY3, enumC81633kY4, enumC81633kY5, enumC81633kY6, enumC81633kY7, enumC81633kY8, enumC81633kY9, enumC81633kY10, enumC81633kY11, enumC81633kY12, enumC81633kY13, enumC81633kY14, enumC81633kY15};
        A02 = enumC81633kYArr;
        A01 = AbstractC12190kN.A00(enumC81633kYArr);
    }

    public static EnumC81633kY valueOf(String str) {
        return (EnumC81633kY) Enum.valueOf(EnumC81633kY.class, str);
    }

    public static EnumC81633kY[] values() {
        return (EnumC81633kY[]) A02.clone();
    }

    public EnumC81633kY(String str, int i, long j) {
        this.A00 = j;
    }
}
