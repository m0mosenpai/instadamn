package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8gS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC192868gS {
    public static final /* synthetic */ EnumEntries A06;
    public static final /* synthetic */ EnumC192868gS[] A07;
    public static final EnumC192868gS A08;
    public static final EnumC192868gS A09;
    public static final EnumC192868gS A0A;
    public static final EnumC192868gS A0B;
    public MediaEffect A00;
    public C23501AbH A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public static EnumC192868gS valueOf(String str) {
        return (EnumC192868gS) Enum.valueOf(EnumC192868gS.class, str);
    }

    public static EnumC192868gS[] values() {
        return (EnumC192868gS[]) A07.clone();
    }

    public final C23501AbH A00(Context context) {
        C23501AbH c23501AbH = this.A01;
        if (c23501AbH == null) {
            C23501AbH A00 = AbstractC226929zo.A00(context, this.A05);
            this.A01 = A00;
            return A00;
        }
        return c23501AbH;
    }

    static {
        EnumC192868gS enumC192868gS = new EnumC192868gS("Helium", "helium", "fba/effect_graphs/helium.json", 0, 2131956231, R.drawable.instagram_spark_helium_outline_32);
        A0A = enumC192868gS;
        EnumC192868gS enumC192868gS2 = new EnumC192868gS("Giant", "giant", "fba/effect_graphs/the_giant.json", 1, 2131956230, R.drawable.instagram_spark_giant_outline_32);
        A09 = enumC192868gS2;
        EnumC192868gS enumC192868gS3 = new EnumC192868gS("Vocalist", "vocalist", "fba/effect_graphs/vocalist.json", 2, 2131956233, R.drawable.instagram_spark_vocalist_outline_32);
        A0B = enumC192868gS3;
        EnumC192868gS enumC192868gS4 = new EnumC192868gS("Announcer", "announcer", "fba/effect_graphs/the_announcer.json", 3, 2131956229, R.drawable.instagram_spark_announcer_outline_32);
        A08 = enumC192868gS4;
        EnumC192868gS[] enumC192868gSArr = {enumC192868gS, enumC192868gS2, enumC192868gS3, enumC192868gS4, new EnumC192868gS("Robot", "robot", "fba/effect_graphs/robot.json", 4, 2131956232, R.drawable.instagram_spark_robot_outline_32)};
        A07 = enumC192868gSArr;
        A06 = AbstractC12190kN.A00(enumC192868gSArr);
    }

    public EnumC192868gS(String str, String str2, String str3, int i, int i2, int i3) {
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = i2;
        this.A02 = i3;
    }
}
