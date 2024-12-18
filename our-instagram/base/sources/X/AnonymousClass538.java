package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.538, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass538 {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AnonymousClass538[] A03;
    public static final AnonymousClass538 A04;
    public static final AnonymousClass538 A05;
    public static final AnonymousClass538 A06;
    public final String A00;

    static {
        AnonymousClass538 anonymousClass538 = new AnonymousClass538("FACEBOOK", 0, "FACEBOOK");
        A04 = anonymousClass538;
        AnonymousClass538 anonymousClass5382 = new AnonymousClass538("INSTAGRAM", 1, "INSTAGRAM");
        A05 = anonymousClass5382;
        AnonymousClass538 anonymousClass5383 = new AnonymousClass538("THREADS", 2, "THREADS");
        A06 = anonymousClass5383;
        AnonymousClass538[] anonymousClass538Arr = {anonymousClass538, anonymousClass5382, anonymousClass5383, new AnonymousClass538("FRL", 3, "FRL")};
        A03 = anonymousClass538Arr;
        A02 = AbstractC12190kN.A00(anonymousClass538Arr);
        A01 = AbstractC09440dt.A01(AnonymousClass539.A00);
    }

    public static AnonymousClass538 valueOf(String str) {
        return (AnonymousClass538) Enum.valueOf(AnonymousClass538.class, str);
    }

    public static AnonymousClass538[] values() {
        return (AnonymousClass538[]) A03.clone();
    }

    public AnonymousClass538(String str, int i, String str2) {
        this.A00 = str2;
    }
}
