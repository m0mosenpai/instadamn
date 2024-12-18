package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.0TM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TM {
    public static final /* synthetic */ C0TM[] A02;
    public static final C0TM A03;
    public static final C0TM A04;
    public static final C0TM A05;
    public static final C0TM A06;
    public static final C0TM A07;
    public static final C0TM A08;
    public Integer A00;
    public String A01;

    static {
        Integer num = C05F.A00;
        C0TM c0tm = new C0TM(num, "TRIM_MEMORY_SYSTEM_RUNNING_CRITICAL", "system_running_critical", 0);
        A05 = c0tm;
        C0TM c0tm2 = new C0TM(num, "TRIM_MEMORY_SYSTEM_RUNNING_MODERATE", "system_running_moderate", 1);
        A08 = c0tm2;
        C0TM c0tm3 = new C0TM(num, "TRIM_MEMORY_SYSTEM_RUNNING_LOW", "system_running_low", 2);
        A06 = c0tm3;
        C0TM c0tm4 = new C0TM(num, "TRIM_MEMORY_SYSTEM_RUNNING_LOW_BACKGROUND", "system_running_low_bg", 3);
        A07 = c0tm4;
        C0TM c0tm5 = new C0TM(num, "TRIM_MEMORY_JAVA_HEAP_ALMOST_FULL", "java_heap_almost_full", 4);
        A03 = c0tm5;
        C0TM c0tm6 = new C0TM(num, "TRIM_MEMORY_ON_BACKGROUND", "on_app_backgrounded", 5);
        A04 = c0tm6;
        A02 = new C0TM[]{c0tm, c0tm2, c0tm3, c0tm4, c0tm5, c0tm6};
    }

    public static C0TM valueOf(String str) {
        return (C0TM) Enum.valueOf(C0TM.class, str);
    }

    public static C0TM[] values() {
        return (C0TM[]) A02.clone();
    }

    public C0TM(Integer num, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = num;
    }
}
