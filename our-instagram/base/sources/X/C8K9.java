package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8K9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8K9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8K9[] A01;
    public static final C8K9 A02;
    public static final C8K9 A03;
    public static final C8K9 A04;
    public static final C8K9 A05;
    public static final C8K9 A06;
    public static final C8K9 A07;
    public static final C8K9 A08;

    static {
        C8K9 c8k9 = new C8K9("CAMERA_IDLE", 0);
        A03 = c8k9;
        C8K9 c8k92 = new C8K9("COUNTDOWN_ACTIVE", 1);
        A05 = c8k92;
        C8K9 c8k93 = new C8K9("RECORDING", 2);
        A07 = c8k93;
        C8K9 c8k94 = new C8K9("SELECTING_MUSIC", 3);
        A08 = c8k94;
        C8K9 c8k95 = new C8K9("CLIPS_REVIEW", 4);
        A04 = c8k95;
        C8K9 c8k96 = new C8K9("NUX_SHOWING", 5);
        A06 = c8k96;
        C8K9 c8k97 = new C8K9("BLOCKED_TOAST", 6);
        A02 = c8k97;
        C8K9[] c8k9Arr = {c8k9, c8k92, c8k93, c8k94, c8k95, c8k96, c8k97};
        A01 = c8k9Arr;
        A00 = AbstractC12190kN.A00(c8k9Arr);
    }

    public static C8K9 valueOf(String str) {
        return (C8K9) Enum.valueOf(C8K9.class, str);
    }

    public static C8K9[] values() {
        return (C8K9[]) A01.clone();
    }

    public C8K9(String str, int i) {
    }
}
