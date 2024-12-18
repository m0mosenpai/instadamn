package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC77553df {
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ EnumC77553df[] A06;
    public static final EnumC77553df A07;
    public static final EnumC77553df A08;
    public static final EnumC77553df A09;
    public static final EnumC77553df A0A;
    public static final EnumC77553df A0B;
    public static final EnumC77553df A0C;
    public static final EnumC77553df A0D;
    public static final EnumC77553df A0E;
    public static final EnumC77553df A0F;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public static EnumC77553df valueOf(String str) {
        return (EnumC77553df) Enum.valueOf(EnumC77553df.class, str);
    }

    public static EnumC77553df[] values() {
        return (EnumC77553df[]) A06.clone();
    }

    static {
        EnumC77553df enumC77553df = new EnumC77553df("SMALL", 0, R.drawable.following_avatar, R.drawable.follow_avatar, R.drawable.requested_avatar, R.drawable.follow_avatar, false);
        A0E = enumC77553df;
        EnumC77553df enumC77553df2 = new EnumC77553df("MEDIUM", 1, R.drawable.following_icon, 0, R.drawable.requested_icon, 0, true);
        A0C = enumC77553df2;
        EnumC77553df enumC77553df3 = new EnumC77553df("LARGE", 2, R.drawable.following_icon, 0, R.drawable.requested_icon, R.drawable.follow_icon, true);
        A0B = enumC77553df3;
        EnumC77553df enumC77553df4 = new EnumC77553df("ACTIONABLE_TEXT", 3, R.drawable.actionable_chevron_down, 0, 0, 0, true);
        A07 = enumC77553df4;
        EnumC77553df enumC77553df5 = new EnumC77553df("ACTIONBARICON", 4, R.drawable.following_avatar, R.drawable.follow_avatar, R.drawable.requested_avatar, R.drawable.follow_avatar, false);
        A08 = enumC77553df5;
        EnumC77553df enumC77553df6 = new EnumC77553df("INLINE_ICON", 5, R.drawable.instagram_user_following_pano_filled_24, R.drawable.instagram_user_follow_pano_outline_24, R.drawable.instagram_user_requested_pano_filled_24, R.drawable.instagram_user_follow_pano_outline_24, false);
        A0A = enumC77553df6;
        EnumC77553df enumC77553df7 = new EnumC77553df("COLLABORATOR_TEXT", 6, R.drawable.collaborator_chevron_down, 0, 0, R.drawable.collaborator_chevron_down, true);
        A09 = enumC77553df7;
        EnumC77553df enumC77553df8 = new EnumC77553df("MESSAGE_OPTION", 7, 0, 0, 0, 0, true);
        A0D = enumC77553df8;
        EnumC77553df enumC77553df9 = new EnumC77553df("TEXT_ONLY", 8, R.drawable.following_icon, 0, R.drawable.requested_icon, R.drawable.follow_icon, true);
        A0F = enumC77553df9;
        EnumC77553df[] enumC77553dfArr = {enumC77553df, enumC77553df2, enumC77553df3, enumC77553df4, enumC77553df5, enumC77553df6, enumC77553df7, enumC77553df8, enumC77553df9};
        A06 = enumC77553dfArr;
        A05 = AbstractC12190kN.A00(enumC77553dfArr);
    }

    public EnumC77553df(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A04 = z;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i5;
    }
}
