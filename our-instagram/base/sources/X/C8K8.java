package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8K8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8K8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8K8[] A01;
    public static final C8K8 A02;
    public static final C8K8 A03;
    public static final C8K8 A04;

    static {
        C8K8 c8k8 = new C8K8("EMPTY", 0);
        A03 = c8k8;
        C8K8 c8k82 = new C8K8("PARTIAL", 1);
        A04 = c8k82;
        C8K8 c8k83 = new C8K8("COMPLETE", 2);
        A02 = c8k83;
        C8K8[] c8k8Arr = {c8k8, c8k82, c8k83};
        A01 = c8k8Arr;
        A00 = AbstractC12190kN.A00(c8k8Arr);
    }

    public static C8K8 valueOf(String str) {
        return (C8K8) Enum.valueOf(C8K8.class, str);
    }

    public static C8K8[] values() {
        return (C8K8[]) A01.clone();
    }

    public C8K8(String str, int i) {
    }
}
