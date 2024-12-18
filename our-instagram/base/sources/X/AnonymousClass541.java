package X;

import java.util.EnumSet;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.541, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass541 {
    public static final AnonymousClass542 A03;
    public static final java.util.Set A04;
    public static final InterfaceC09390do A05;
    public static final java.util.Set A06;
    public static final java.util.Set A07;
    public static final /* synthetic */ EnumEntries A08;
    public static final /* synthetic */ AnonymousClass541[] A09;
    public static final AnonymousClass541 A0A;
    public static final AnonymousClass541 A0B;
    public static final AnonymousClass541 A0C;
    public static final AnonymousClass541 A0D;
    public static final AnonymousClass541 A0E;
    public static final AnonymousClass541 A0F;
    public static final AnonymousClass541 A0G;
    public static final AnonymousClass541 A0H;
    public static final AnonymousClass541 A0I;
    public static final AnonymousClass541 A0J;
    public static final AnonymousClass541 A0K;
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.542, java.lang.Object] */
    static {
        AnonymousClass541 anonymousClass541 = new AnonymousClass541("None", 0, 0, false, true);
        A0J = anonymousClass541;
        AnonymousClass541 anonymousClass5412 = new AnonymousClass541("Love", 1, 1, false, true);
        A0I = anonymousClass5412;
        AnonymousClass541 anonymousClass5413 = new AnonymousClass541("GiftWrap", 2, 2, false, true);
        A0G = anonymousClass5413;
        AnonymousClass541 anonymousClass5414 = new AnonymousClass541("Celebration", 3, 3, false, true);
        A0E = anonymousClass5414;
        AnonymousClass541 anonymousClass5415 = new AnonymousClass541("Fire", 4, 4, false, true);
        A0F = anonymousClass5415;
        AnonymousClass541 anonymousClass5416 = new AnonymousClass541("Halloween", 5, 5, false, false);
        A0H = anonymousClass5416;
        AnonymousClass541 anonymousClass5417 = new AnonymousClass541("AvatarHeart", 6, 1000, true, true);
        A0C = anonymousClass5417;
        AnonymousClass541 anonymousClass5418 = new AnonymousClass541("AvatarAngry", 7, 1001, true, true);
        A0A = anonymousClass5418;
        AnonymousClass541 anonymousClass5419 = new AnonymousClass541("AvatarLaugh", 8, 1002, true, true);
        A0D = anonymousClass5419;
        AnonymousClass541 anonymousClass54110 = new AnonymousClass541("AvatarCry", 9, 1003, true, true);
        A0B = anonymousClass54110;
        AnonymousClass541 anonymousClass54111 = new AnonymousClass541("Unsupported", 10, -1, false, true);
        A0K = anonymousClass54111;
        AnonymousClass541[] anonymousClass541Arr = {anonymousClass541, anonymousClass5412, anonymousClass5413, anonymousClass5414, anonymousClass5415, anonymousClass5416, anonymousClass5417, anonymousClass5418, anonymousClass5419, anonymousClass54110, anonymousClass54111};
        A09 = anonymousClass541Arr;
        A08 = AbstractC12190kN.A00(anonymousClass541Arr);
        A03 = new Object();
        A07 = AbstractC16830sb.A07(anonymousClass5412, anonymousClass5413, anonymousClass5414, anonymousClass5415, anonymousClass5416);
        A06 = AbstractC16830sb.A07(anonymousClass5417, anonymousClass5418, anonymousClass5419, anonymousClass54110);
        A05 = AbstractC09440dt.A00(EnumC09460dv.A02, AnonymousClass543.A00);
        EnumSet of = EnumSet.of(anonymousClass5412, anonymousClass5414, anonymousClass5413, anonymousClass5415, anonymousClass5416);
        C14360o3.A07(of);
        A04 = of;
    }

    public static AnonymousClass541 valueOf(String str) {
        return (AnonymousClass541) Enum.valueOf(AnonymousClass541.class, str);
    }

    public static AnonymousClass541[] values() {
        return (AnonymousClass541[]) A09.clone();
    }

    public AnonymousClass541(String str, int i, int i2, boolean z, boolean z2) {
        this.A00 = i2;
        this.A02 = z;
        this.A01 = z2;
    }
}
