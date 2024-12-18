package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7OQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7OQ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7OQ[] A01;
    public static final C7OQ A02;
    public static final C7OQ A03;
    public static final C7OQ A04;
    public static final C7OQ A05;
    public static final C7OQ A06;

    static {
        C7OQ c7oq = new C7OQ("MENTION_ONLY", 0);
        A06 = c7oq;
        C7OQ c7oq2 = new C7OQ("HASHTAG_ONLY", 1);
        A04 = c7oq2;
        C7OQ c7oq3 = new C7OQ("COMMANDS_ONLY", 2);
        A03 = c7oq3;
        C7OQ c7oq4 = new C7OQ("MENTION_AND_HASHTAG", 3);
        A05 = c7oq4;
        C7OQ c7oq5 = new C7OQ("ALL", 4);
        A02 = c7oq5;
        C7OQ[] c7oqArr = {c7oq, c7oq2, c7oq3, c7oq4, c7oq5};
        A01 = c7oqArr;
        A00 = AbstractC12190kN.A00(c7oqArr);
    }

    public static C7OQ valueOf(String str) {
        return (C7OQ) Enum.valueOf(C7OQ.class, str);
    }

    public static C7OQ[] values() {
        return (C7OQ[]) A01.clone();
    }

    public C7OQ(String str, int i) {
    }
}
