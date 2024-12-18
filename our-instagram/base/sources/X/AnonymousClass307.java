package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.307, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass307 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass307[] A01;
    public static final AnonymousClass307 A02;
    public static final AnonymousClass307 A03;
    public static final AnonymousClass307 A04;

    static {
        AnonymousClass307 anonymousClass307 = new AnonymousClass307("IDLE", 0);
        A04 = anonymousClass307;
        AnonymousClass307 anonymousClass3072 = new AnonymousClass307("CREATE_GROUP", 1);
        A03 = anonymousClass3072;
        AnonymousClass307 anonymousClass3073 = new AnonymousClass307("ADD_STORY", 2);
        A02 = anonymousClass3073;
        AnonymousClass307[] anonymousClass307Arr = {anonymousClass307, anonymousClass3072, anonymousClass3073};
        A01 = anonymousClass307Arr;
        A00 = AbstractC12190kN.A00(anonymousClass307Arr);
    }

    public static AnonymousClass307 valueOf(String str) {
        return (AnonymousClass307) Enum.valueOf(AnonymousClass307.class, str);
    }

    public static AnonymousClass307[] values() {
        return (AnonymousClass307[]) A01.clone();
    }

    public AnonymousClass307(String str, int i) {
    }
}
