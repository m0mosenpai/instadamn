package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61132Rfm {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61132Rfm[] A01;
    public static final EnumC61132Rfm A02;
    public static final EnumC61132Rfm A03;
    public static final EnumC61132Rfm A04;
    public static final EnumC61132Rfm A05;
    public static final EnumC61132Rfm A06;

    static {
        EnumC61132Rfm enumC61132Rfm = new EnumC61132Rfm("ICON", 0);
        A02 = enumC61132Rfm;
        EnumC61132Rfm enumC61132Rfm2 = new EnumC61132Rfm("IMAGE", 1);
        A03 = enumC61132Rfm2;
        EnumC61132Rfm enumC61132Rfm3 = new EnumC61132Rfm("VIDEO", 2);
        A05 = enumC61132Rfm3;
        EnumC61132Rfm enumC61132Rfm4 = new EnumC61132Rfm("VIDEO_AUTOPLAY", 3);
        A06 = enumC61132Rfm4;
        EnumC61132Rfm enumC61132Rfm5 = new EnumC61132Rfm(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4);
        A04 = enumC61132Rfm5;
        EnumC61132Rfm[] enumC61132RfmArr = {enumC61132Rfm, enumC61132Rfm2, enumC61132Rfm3, enumC61132Rfm4, enumC61132Rfm5};
        A01 = enumC61132RfmArr;
        A00 = AbstractC12190kN.A00(enumC61132RfmArr);
    }

    public static EnumC61132Rfm valueOf(String str) {
        return (EnumC61132Rfm) Enum.valueOf(EnumC61132Rfm.class, str);
    }

    public static EnumC61132Rfm[] values() {
        return (EnumC61132Rfm[]) A01.clone();
    }

    public EnumC61132Rfm(String str, int i) {
    }
}
