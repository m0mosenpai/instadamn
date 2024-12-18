package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7B {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7B[] A01;
    public static final C7B A02;
    public static final C7B A03;
    public static final C7B A04;
    public static final C7B A05;
    public static final C7B A06;
    public static final C7B A07;
    public static final C7B A08;
    public static final C7B A09;

    static {
        C7B c7b = new C7B("UPLOADING", 0);
        A08 = c7b;
        C7B c7b2 = new C7B("PUBLISHING", 1);
        A05 = c7b2;
        C7B c7b3 = new C7B("PUBLISH_FAILED", 2);
        A06 = c7b3;
        C7B c7b4 = new C7B("PUBLISH_FAILED_CAN_RETRY", 3);
        A07 = c7b4;
        C7B c7b5 = new C7B("UPLOAD_FAILED", 4);
        A09 = c7b5;
        C7B c7b6 = new C7B("PUBLISHED", 5);
        A04 = c7b6;
        C7B c7b7 = new C7B("DELETING", 6);
        A02 = c7b7;
        C7B c7b8 = new C7B("IDLE", 7);
        A03 = c7b8;
        C7B[] c7bArr = {c7b, c7b2, c7b3, c7b4, c7b5, c7b6, c7b7, c7b8};
        A01 = c7bArr;
        A00 = AbstractC12190kN.A00(c7bArr);
    }

    public static C7B valueOf(String str) {
        return (C7B) Enum.valueOf(C7B.class, str);
    }

    public static C7B[] values() {
        return (C7B[]) A01.clone();
    }

    public C7B(String str, int i) {
    }
}
