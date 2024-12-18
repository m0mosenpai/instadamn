package X;

import com.facebook.R;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NhF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53277NhF {
    public static final /* synthetic */ EnumEntries A07;
    public static final /* synthetic */ EnumC53277NhF[] A08;
    public static final EnumC53277NhF A09;
    public static final EnumC53277NhF A0A;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final Map A06;

    public static EnumC53277NhF valueOf(String str) {
        return (EnumC53277NhF) Enum.valueOf(EnumC53277NhF.class, str);
    }

    public static EnumC53277NhF[] values() {
        return (EnumC53277NhF[]) A08.clone();
    }

    static {
        C09530e4 A0o = AbstractC167007dF.A0o(EnumC53185Nfh.A09, R.color.purple_2);
        C09530e4 A0o2 = AbstractC167007dF.A0o(EnumC53185Nfh.A04, R.color.pink_2);
        C09530e4 A0o3 = AbstractC167007dF.A0o(EnumC53185Nfh.A08, R.color.fds_white_alpha80);
        EnumC53185Nfh enumC53185Nfh = EnumC53185Nfh.A07;
        Integer valueOf = Integer.valueOf(R.color.lavender_2);
        A0A = new EnumC53277NhF(null, "CLIPS_TIMED_ELEMENT_STYLE", AbstractC06930Yk.A06(A0o, A0o2, A0o3, AbstractC166987dD.A1L(enumC53185Nfh, valueOf), AbstractC166987dD.A1L(EnumC53185Nfh.A03, valueOf), AbstractC166987dD.A1L(EnumC53185Nfh.A05, valueOf)), 0, R.layout.layout_stacked_track_textview, R.color.fds_white_alpha80, R.color.clips_gradient_redesign_color_4, R.color.pink_8, 12);
        EnumC53277NhF enumC53277NhF = new EnumC53277NhF(2131953763, "BASEL_TIMED_ELEMENT_STYLE", AbstractC06930Yk.A0E(), 1, R.layout.layout_basel_stacked_track_textview, R.color.design_dark_default_color_on_background, R.color.orange_6, R.color.pink_6, 16);
        A09 = enumC53277NhF;
        EnumC53277NhF[] enumC53277NhFArr = {A0A, enumC53277NhF};
        A08 = enumC53277NhFArr;
        A07 = AbstractC12190kN.A00(enumC53277NhFArr);
    }

    public EnumC53277NhF(Integer num, String str, Map map, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A04 = i2;
        this.A06 = map;
        this.A00 = i3;
        this.A03 = i4;
        this.A02 = i5;
        this.A05 = num;
        this.A01 = i6;
    }
}
