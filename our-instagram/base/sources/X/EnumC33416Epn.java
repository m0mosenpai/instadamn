package X;

import com.facebook.location.platform.api.Location;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33416Epn {
    public static final Map A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC33416Epn[] A04;
    public static final EnumC33416Epn A05;
    public static final EnumC33416Epn A06;
    public static final EnumC33416Epn A07;
    public static final EnumC33416Epn A08;
    public static final EnumC33416Epn A09;
    public static final EnumC33416Epn A0A;
    public static final EnumC33416Epn A0B;
    public static final EnumC33416Epn A0C;
    public static final EnumC33416Epn A0D;
    public final String A00;
    public final String A01;

    static {
        EnumC33416Epn enumC33416Epn = new EnumC33416Epn("ALL_MEDIA_AUTO_COLLECTION", "ALL_MEDIA_AUTO_COLLECTION", "All Posts", 0);
        A05 = enumC33416Epn;
        EnumC33416Epn enumC33416Epn2 = new EnumC33416Epn("PRODUCT_AUTO_COLLECTION", "PRODUCT_AUTO_COLLECTION", "Shopping", 1);
        A0C = enumC33416Epn2;
        EnumC33416Epn enumC33416Epn3 = new EnumC33416Epn("EMPTY_PRODUCT_AUTO_COLLECTION", "EMPTY_PRODUCT_AUTO_COLLECTION", "Empty Wishlist", 2);
        A07 = enumC33416Epn3;
        EnumC33416Epn enumC33416Epn4 = new EnumC33416Epn("MEDIA", "MEDIA", "Media", 3);
        A0A = enumC33416Epn4;
        EnumC33416Epn enumC33416Epn5 = new EnumC33416Epn("AUDIO_AUTO_COLLECTION", "AUDIO_AUTO_COLLECTION", "Audio", 4);
        A06 = enumC33416Epn5;
        EnumC33416Epn enumC33416Epn6 = new EnumC33416Epn("LOCATIONS_AUTO_COLLECTION", "LOCATIONS_AUTO_COLLECTION", Location.TAG, 5);
        A09 = enumC33416Epn6;
        EnumC33416Epn enumC33416Epn7 = new EnumC33416Epn("NEW_COLLECTION", "NEW_COLLECTION", "New", 6);
        A0B = enumC33416Epn7;
        EnumC33416Epn enumC33416Epn8 = new EnumC33416Epn("LIKED_COLLECTIONS", "LIKED_COLLECTIONS", "Liked collections", 7);
        A08 = enumC33416Epn8;
        EnumC33416Epn enumC33416Epn9 = new EnumC33416Epn("SAVED_ENTRYPOINT_COLLECTION", "SAVED_ENTRYPOINT_COLLECTION", "Saved", 8);
        A0D = enumC33416Epn9;
        EnumC33416Epn[] enumC33416EpnArr = {enumC33416Epn, enumC33416Epn2, enumC33416Epn3, enumC33416Epn4, enumC33416Epn5, enumC33416Epn6, enumC33416Epn7, enumC33416Epn8, enumC33416Epn9};
        A04 = enumC33416EpnArr;
        A03 = AbstractC12190kN.A00(enumC33416EpnArr);
        EnumC33416Epn[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33416Epn enumC33416Epn10 : values) {
            A18.put(enumC33416Epn10.A01, enumC33416Epn10);
        }
        A02 = A18;
    }

    public static EnumC33416Epn valueOf(String str) {
        return (EnumC33416Epn) Enum.valueOf(EnumC33416Epn.class, str);
    }

    public static EnumC33416Epn[] values() {
        return (EnumC33416Epn[]) A04.clone();
    }

    public EnumC33416Epn(String str, String str2, String str3, int i) {
        this.A01 = str2;
        this.A00 = str3;
    }
}
