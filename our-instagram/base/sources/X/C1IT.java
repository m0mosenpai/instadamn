package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1IT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IT {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C1IT[] A02;
    public static final C1IT A03;
    public static final C1IT A04;
    public static final C1IT A05;
    public static final C1IT A06;
    public static final C1IT A07;
    public static final C1IT A08;
    public final int A00;

    static {
        C1IT c1it = new C1IT("INITIALIZED", 0, 0);
        A04 = c1it;
        C1IT c1it2 = new C1IT("STARTED", 1, 1);
        A07 = c1it2;
        C1IT c1it3 = new C1IT("SUCCEEDED", 2, 2);
        A08 = c1it3;
        C1IT c1it4 = new C1IT("SKIPPED", 3, 3);
        A06 = c1it4;
        C1IT c1it5 = new C1IT("FAILED", 4, 4);
        A03 = c1it5;
        C1IT c1it6 = new C1IT("NO_STATE", 5, 5);
        A05 = c1it6;
        C1IT[] c1itArr = {c1it, c1it2, c1it3, c1it4, c1it5, c1it6};
        A02 = c1itArr;
        A01 = AbstractC12190kN.A00(c1itArr);
    }

    public static C1IT valueOf(String str) {
        return (C1IT) Enum.valueOf(C1IT.class, str);
    }

    public static C1IT[] values() {
        return (C1IT[]) A02.clone();
    }

    public C1IT(String str, int i, int i2) {
        this.A00 = i2;
    }
}
