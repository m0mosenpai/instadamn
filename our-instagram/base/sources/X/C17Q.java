package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.17Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17Q {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C17Q[] A01;
    public static final C17Q A02;
    public static final C17Q A03;
    public static final C17Q A04;
    public static final C17Q A05;
    public static final C17Q A06;
    public static final C17Q A07;
    public static final C17Q A08;

    static {
        C17Q c17q = new C17Q("UNKNOWN", 0);
        A08 = c17q;
        C17Q c17q2 = new C17Q("FETCHING", 1);
        A04 = c17q2;
        C17Q c17q3 = new C17Q("NO_SUBSCRIPTION", 2);
        A05 = c17q3;
        C17Q c17q4 = new C17Q("ELIGIBLE_TO_SUBSCRIBE", 3);
        A03 = c17q4;
        C17Q c17q5 = new C17Q("SUBSCRIBED", 4);
        A06 = c17q5;
        C17Q c17q6 = new C17Q("SUBSCRIBE_IN_PROGRESS", 5);
        A07 = c17q6;
        C17Q c17q7 = new C17Q("DOES_NOT_EXIST", 6);
        A02 = c17q7;
        C17Q[] c17qArr = {c17q, c17q2, c17q3, c17q4, c17q5, c17q6, c17q7};
        A01 = c17qArr;
        A00 = AbstractC12190kN.A00(c17qArr);
    }

    public static C17Q valueOf(String str) {
        return (C17Q) Enum.valueOf(C17Q.class, str);
    }

    public static C17Q[] values() {
        return (C17Q[]) A01.clone();
    }

    public C17Q(String str, int i) {
    }
}
