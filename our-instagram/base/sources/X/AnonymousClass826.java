package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.826, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass826 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ AnonymousClass826[] A04;
    public static final AnonymousClass826 A05;
    public static final AnonymousClass826 A06;
    public static final AnonymousClass826 A07;
    public static final AnonymousClass826 A08;
    public static final AnonymousClass826 A09;
    public static final AnonymousClass826 A0A;
    public final int A00;
    public final int A01;
    public final int A02;

    public static AnonymousClass826 valueOf(String str) {
        return (AnonymousClass826) Enum.valueOf(AnonymousClass826.class, str);
    }

    public static AnonymousClass826[] values() {
        return (AnonymousClass826[]) A04.clone();
    }

    static {
        AnonymousClass826 anonymousClass826 = new AnonymousClass826("DURATION_15_SEC_IN_MS", 0, 15000, R.drawable.instagram_duration_15_outline_44, 2131961200);
        A05 = anonymousClass826;
        AnonymousClass826 anonymousClass8262 = new AnonymousClass826("DURATION_30_SEC_IN_MS", 1, 30000, R.drawable.instagram_duration_30_outline_44, 2131961201);
        A07 = anonymousClass8262;
        AnonymousClass826 anonymousClass8263 = new AnonymousClass826("DURATION_60_SEC_IN_MS", 2, 60000, R.drawable.instagram_duration_60_outline_44, 2131961203);
        A09 = anonymousClass8263;
        AnonymousClass826 anonymousClass8264 = new AnonymousClass826("DURATION_90_SEC_IN_MS", 3, 90000, R.drawable.instagram_duration_90_outline_44, 2131961204);
        A0A = anonymousClass8264;
        AnonymousClass826 anonymousClass8265 = new AnonymousClass826("DURATION_180_SEC_IN_MS", 4, 180000, R.drawable.instagram_duration_90_outline_44, 2131961202);
        A06 = anonymousClass8265;
        AnonymousClass826 anonymousClass8266 = new AnonymousClass826("DURATION_600_SEC_IN_MS", 5, 600000, R.drawable.instagram_duration_90_outline_44, 2131961199);
        A08 = anonymousClass8266;
        AnonymousClass826[] anonymousClass826Arr = {anonymousClass826, anonymousClass8262, anonymousClass8263, anonymousClass8264, anonymousClass8265, anonymousClass8266};
        A04 = anonymousClass826Arr;
        A03 = AbstractC12190kN.A00(anonymousClass826Arr);
    }

    public AnonymousClass826(String str, int i, int i2, int i3, int i4) {
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
