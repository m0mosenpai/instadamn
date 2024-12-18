package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6Q {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6Q[] A01;
    public static final C6Q A02;
    public static final C6Q A03;
    public static final C6Q A04;

    static {
        C6Q c6q = new C6Q("GENERATING", 0);
        A04 = c6q;
        C6Q c6q2 = new C6Q("ENTER_PROMPT", 1);
        A02 = c6q2;
        C6Q c6q3 = new C6Q("GENERATED_IMAGE_SELECTION", 2);
        A03 = c6q3;
        C6Q[] c6qArr = {c6q, c6q2, c6q3};
        A01 = c6qArr;
        A00 = AbstractC12190kN.A00(c6qArr);
    }

    public static C6Q valueOf(String str) {
        return (C6Q) Enum.valueOf(C6Q.class, str);
    }

    public static C6Q[] values() {
        return (C6Q[]) A01.clone();
    }

    public C6Q(String str, int i) {
    }
}
