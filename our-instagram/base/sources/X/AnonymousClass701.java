package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.701, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass701 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass701[] A01;
    public static final AnonymousClass701 A02;
    public static final AnonymousClass701 A03;
    public static final AnonymousClass701 A04;
    public static final AnonymousClass701 A05;

    static {
        AnonymousClass701 anonymousClass701 = new AnonymousClass701("LegacyApi", 0);
        A05 = anonymousClass701;
        AnonymousClass701 anonymousClass7012 = new AnonymousClass701("ApiStreaming", 1);
        A02 = anonymousClass7012;
        AnonymousClass701 anonymousClass7013 = new AnonymousClass701("GraphQL", 2);
        A03 = anonymousClass7013;
        AnonymousClass701 anonymousClass7014 = new AnonymousClass701("GraphQLWithDefer", 3);
        A04 = anonymousClass7014;
        AnonymousClass701[] anonymousClass701Arr = {anonymousClass701, anonymousClass7012, anonymousClass7013, anonymousClass7014};
        A01 = anonymousClass701Arr;
        A00 = AbstractC12190kN.A00(anonymousClass701Arr);
    }

    public static AnonymousClass701 valueOf(String str) {
        return (AnonymousClass701) Enum.valueOf(AnonymousClass701.class, str);
    }

    public static AnonymousClass701[] values() {
        return (AnonymousClass701[]) A01.clone();
    }

    public AnonymousClass701(String str, int i) {
    }
}
