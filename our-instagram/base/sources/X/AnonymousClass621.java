package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.621, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass621 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ AnonymousClass621[] A02;
    public static final AnonymousClass621 A03;
    public static final AnonymousClass621 A04;
    public static final AnonymousClass621 A05;
    public static final AnonymousClass621 A06;
    public final String A00;

    static {
        AnonymousClass621 anonymousClass621 = new AnonymousClass621("M4A", 0, "com.facebook.orca");
        A06 = anonymousClass621;
        AnonymousClass621 anonymousClass6212 = new AnonymousClass621("FB_BLUE", 1, "com.facebook.katana");
        A03 = anonymousClass6212;
        AnonymousClass621 anonymousClass6213 = new AnonymousClass621("FB_BLUE_DEBUG", 2, "com.facebook.wakizashi");
        A04 = anonymousClass6213;
        AnonymousClass621 anonymousClass6214 = new AnonymousClass621("FB_LITE", 3, "com.facebook.lite");
        A05 = anonymousClass6214;
        AnonymousClass621[] anonymousClass621Arr = {anonymousClass621, anonymousClass6212, anonymousClass6213, anonymousClass6214};
        A02 = anonymousClass621Arr;
        A01 = AbstractC12190kN.A00(anonymousClass621Arr);
    }

    public static AnonymousClass621 valueOf(String str) {
        return (AnonymousClass621) Enum.valueOf(AnonymousClass621.class, str);
    }

    public static AnonymousClass621[] values() {
        return (AnonymousClass621[]) A02.clone();
    }

    public AnonymousClass621(String str, int i, String str2) {
        this.A00 = str2;
    }
}
