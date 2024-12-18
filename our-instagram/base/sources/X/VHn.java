package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VHn implements X8X {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VHn[] A01;
    public static final VHn A02;
    public static final VHn A03;
    public static final VHn A04;
    public static final VHn A05;
    public static final VHn A06;
    public static final VHn A07;
    public static final VHn A08;
    public static final VHn A09;
    public static final VHn A0A;

    static {
        VHn vHn = new VHn("ENTRY_POINT", 0);
        A06 = vHn;
        VHn vHn2 = new VHn("LOAD_USER", 1);
        A07 = vHn2;
        VHn vHn3 = new VHn("ADD_PROFILE_PICTURE", 2);
        A04 = vHn3;
        VHn vHn4 = new VHn("ADD_NAME", 3);
        A03 = vHn4;
        VHn vHn5 = new VHn("ADD_BIO", 4);
        A02 = vHn5;
        VHn vHn6 = new VHn("SHOW_LOADER", 5);
        A0A = vHn6;
        VHn vHn7 = new VHn("SAVE_NAME_AND_BIO", 6);
        A08 = vHn7;
        VHn vHn8 = new VHn("SAVE_PROFILE_PICTURE", 7);
        A09 = vHn8;
        VHn vHn9 = new VHn("BROADCAST_USER_UPDATES", 8);
        A05 = vHn9;
        VHn[] vHnArr = {vHn, vHn2, vHn3, vHn4, vHn5, vHn6, vHn7, vHn8, vHn9};
        A01 = vHnArr;
        A00 = AbstractC12190kN.A00(vHnArr);
    }

    public static VHn valueOf(String str) {
        return (VHn) Enum.valueOf(VHn.class, str);
    }

    public static VHn[] values() {
        return (VHn[]) A01.clone();
    }

    public VHn(String str, int i) {
    }
}
