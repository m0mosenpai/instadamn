package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xbu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72358Xbu {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC72358Xbu[] A01;
    public static final EnumC72358Xbu A02;
    public static final EnumC72358Xbu A03;

    static {
        EnumC72358Xbu enumC72358Xbu = new EnumC72358Xbu("REEL_SPONSORED_CONTENT", 0);
        A03 = enumC72358Xbu;
        EnumC72358Xbu enumC72358Xbu2 = new EnumC72358Xbu("FEED_SPONSORED_CONTENT_SHOWREEL", 1);
        A02 = enumC72358Xbu2;
        EnumC72358Xbu[] enumC72358XbuArr = {enumC72358Xbu, enumC72358Xbu2};
        A01 = enumC72358XbuArr;
        A00 = AbstractC12190kN.A00(enumC72358XbuArr);
    }

    public static EnumC72358Xbu valueOf(String str) {
        return (EnumC72358Xbu) Enum.valueOf(EnumC72358Xbu.class, str);
    }

    public static EnumC72358Xbu[] values() {
        return (EnumC72358Xbu[]) A01.clone();
    }

    public EnumC72358Xbu(String str, int i) {
    }
}
