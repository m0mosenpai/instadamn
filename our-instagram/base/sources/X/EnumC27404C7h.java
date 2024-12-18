package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C7h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27404C7h {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC27404C7h[] A05;
    public static final EnumC27404C7h A06;
    public static final EnumC27404C7h A07;
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    static {
        EnumC27404C7h enumC27404C7h = new EnumC27404C7h(null, null, "MUTUAL_FOLLOWERS", 0, 2131969876, R.drawable.instagram_users_pano_outline_24);
        A07 = enumC27404C7h;
        EnumC27404C7h enumC27404C7h2 = new EnumC27404C7h(Integer.valueOf(R.plurals.potato_close_friends_audience_count), Integer.valueOf(R.color.close_friends_color), "CLOSE_FRIENDS", 1, 2131969874, R.drawable.instagram_circle_star_pano_filled_24);
        A06 = enumC27404C7h2;
        EnumC27404C7h[] enumC27404C7hArr = {enumC27404C7h, enumC27404C7h2};
        A05 = enumC27404C7hArr;
        A04 = AbstractC12190kN.A00(enumC27404C7hArr);
    }

    public static EnumC27404C7h valueOf(String str) {
        return (EnumC27404C7h) Enum.valueOf(EnumC27404C7h.class, str);
    }

    public static EnumC27404C7h[] values() {
        return (EnumC27404C7h[]) A05.clone();
    }

    public EnumC27404C7h(Integer num, Integer num2, String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = num;
        this.A02 = num2;
    }
}
