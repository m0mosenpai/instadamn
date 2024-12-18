package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6Z6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Z6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6Z6[] A01;
    public static final C6Z6 A02;
    public static final C6Z6 A03;
    public static final C6Z6 A04;

    static {
        C6Z6 c6z6 = new C6Z6("DIRECT", 0);
        A02 = c6z6;
        C6Z6 c6z62 = new C6Z6("STORIES", 1);
        A04 = c6z62;
        C6Z6 c6z63 = new C6Z6("OTHER", 2);
        A03 = c6z63;
        C6Z6[] c6z6Arr = {c6z6, c6z62, c6z63};
        A01 = c6z6Arr;
        A00 = AbstractC12190kN.A00(c6z6Arr);
    }

    public static C6Z6 valueOf(String str) {
        return (C6Z6) Enum.valueOf(C6Z6.class, str);
    }

    public static C6Z6[] values() {
        return (C6Z6[]) A01.clone();
    }

    public C6Z6(String str, int i) {
    }
}
