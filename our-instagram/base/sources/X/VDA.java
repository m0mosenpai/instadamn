package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VDA[] A01;
    public static final VDA A02;
    public static final VDA A03;
    public static final VDA A04;
    public static final VDA A05;
    public static final VDA A06;
    public static final VDA A07;
    public static final VDA A08;

    static {
        VDA vda = new VDA("UNFOLLOW", 0);
        A07 = vda;
        VDA vda2 = new VDA("BLOCK", 1);
        A02 = vda2;
        VDA vda3 = new VDA("MUTE", 2);
        A03 = vda3;
        VDA vda4 = new VDA("REPORT_THIS_COMMENT", 3);
        A04 = vda4;
        VDA vda5 = new VDA("REPORT_THIS_HASHTAG", 4);
        A05 = vda5;
        VDA vda6 = new VDA("RESTRICT", 5);
        A06 = vda6;
        VDA vda7 = new VDA("UNRESTRICT", 6);
        A08 = vda7;
        VDA[] vdaArr = {vda, vda2, vda3, vda4, vda5, vda6, vda7};
        A01 = vdaArr;
        A00 = AbstractC12190kN.A00(vdaArr);
    }

    public static VDA valueOf(String str) {
        return (VDA) Enum.valueOf(VDA.class, str);
    }

    public static VDA[] values() {
        return (VDA[]) A01.clone();
    }

    public VDA(String str, int i) {
    }
}
