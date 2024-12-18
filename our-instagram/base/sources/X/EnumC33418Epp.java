package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33418Epp {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC33418Epp[] A04;
    public static final EnumC33418Epp A05;
    public static final EnumC33418Epp A06;
    public final int A00;
    public final int A01;
    public final int A02;

    public static EnumC33418Epp valueOf(String str) {
        return (EnumC33418Epp) Enum.valueOf(EnumC33418Epp.class, str);
    }

    public static EnumC33418Epp[] values() {
        return (EnumC33418Epp[]) A04.clone();
    }

    static {
        EnumC33418Epp enumC33418Epp = new EnumC33418Epp("DEFAULT", 0, R.attr.igds_color_primary_icon, R.attr.igds_color_primary_text, R.attr.igds_color_secondary_text);
        A05 = enumC33418Epp;
        EnumC33418Epp enumC33418Epp2 = new EnumC33418Epp("ON_MEDIA", 1, R.attr.igds_color_icon_on_media, R.attr.igds_color_primary_text_on_media, R.attr.igds_color_primary_text_on_media);
        A06 = enumC33418Epp2;
        EnumC33418Epp[] enumC33418EppArr = {enumC33418Epp, enumC33418Epp2};
        A04 = enumC33418EppArr;
        A03 = AbstractC12190kN.A00(enumC33418EppArr);
    }

    public EnumC33418Epp(String str, int i, int i2, int i3, int i4) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
    }
}
