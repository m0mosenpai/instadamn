package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C7b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27398C7b {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC27398C7b[] A02;
    public static final EnumC27398C7b A03;
    public static final EnumC27398C7b A04;
    public static final EnumC27398C7b A05;
    public static final EnumC27398C7b A06;
    public static final EnumC27398C7b A07;
    public static final EnumC27398C7b A08;
    public static final EnumC27398C7b A09;
    public final String A00;

    static {
        EnumC27398C7b enumC27398C7b = new EnumC27398C7b("HEADLINE_CAPTION", 0, "headline");
        A05 = enumC27398C7b;
        EnumC27398C7b enumC27398C7b2 = new EnumC27398C7b("DETACHED_HEADLINE_CAPTION", 1, "detached_headline");
        A03 = enumC27398C7b2;
        EnumC27398C7b enumC27398C7b3 = new EnumC27398C7b("DETACHED_HEADLINE_WITH_PROFILE", 2, "detached_headline_with_profile");
        A04 = enumC27398C7b3;
        EnumC27398C7b enumC27398C7b4 = new EnumC27398C7b("HEADLINE_CAPTION_WITH_BOOST", 3, "booster_headline");
        A06 = enumC27398C7b4;
        EnumC27398C7b enumC27398C7b5 = new EnumC27398C7b("LIKED_BY", 4, "liked_by");
        A07 = enumC27398C7b5;
        EnumC27398C7b enumC27398C7b6 = new EnumC27398C7b("LIKED_BY_STACKED", 5, "liked_by_stacked");
        A08 = enumC27398C7b6;
        EnumC27398C7b enumC27398C7b7 = new EnumC27398C7b(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 6, "");
        A09 = enumC27398C7b7;
        EnumC27398C7b[] enumC27398C7bArr = {enumC27398C7b, enumC27398C7b2, enumC27398C7b3, enumC27398C7b4, enumC27398C7b5, enumC27398C7b6, enumC27398C7b7};
        A02 = enumC27398C7bArr;
        A01 = AbstractC12190kN.A00(enumC27398C7bArr);
    }

    public static EnumC27398C7b valueOf(String str) {
        return (EnumC27398C7b) Enum.valueOf(EnumC27398C7b.class, str);
    }

    public static EnumC27398C7b[] values() {
        return (EnumC27398C7b[]) A02.clone();
    }

    public EnumC27398C7b(String str, int i, String str2) {
        this.A00 = str2;
    }
}
