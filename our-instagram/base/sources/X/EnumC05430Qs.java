package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A0B' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.0Qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC05430Qs implements IVerboseDebuggable {
    public static int A04 = -1;
    public static final C03720In A05;
    public static final /* synthetic */ EnumC05430Qs[] A06;
    public static final EnumC05430Qs A08;
    public static final EnumC05430Qs A09;
    public static final EnumC05430Qs A0A;
    public static final EnumC05430Qs A0B;
    public static final EnumC05430Qs A0D;
    public static final EnumC05430Qs A0F;
    public final EnumC05400Qo A00;
    public final C11100iR A01;
    public final C10950iB A02;
    public final String A03;
    public static final EnumC05430Qs A0E = new EnumC05430Qs(EnumC05400Qo.PRE_ON_CREATE, "PRE_ON_CREATE", "before on create", 0);
    public static final EnumC05430Qs A07 = new EnumC05430Qs(EnumC05400Qo.ON_CREATE, "ON_CREATE", "on create", 1);
    public static final EnumC05430Qs A0C = new EnumC05430Qs(EnumC05400Qo.ON_START, "ON_START", "on start", 2);

    public EnumC05430Qs(EnumC05400Qo enumC05400Qo, String str, String str2, int i) {
        this(enumC05400Qo, null, null, str, str2, i);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Qv, X.0iV] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0Qu, X.0iB] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0Qu, X.0iR] */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0Qu, X.0iB] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0Qv, X.0iC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Qv, X.0iV] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0Qv, X.0iV] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Qv, X.0iV] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0Qv, X.0iC] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0Qv, X.0iC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0Qu, X.0iR] */
    static {
        EnumC05400Qo enumC05400Qo = EnumC05400Qo.ON_RESUME;
        C10960iC c10960iC = C10960iC.A00;
        ?? abstractC05450Qu = new AbstractC05450Qu("what", c10960iC, new AbstractC05460Qv("What", "RESUME_ACTIVITY", null, 107, false));
        C11140iV c11140iV = C11140iV.A02;
        A0B = new EnumC05430Qs(enumC05400Qo, new AbstractC05450Qu("binder", c11140iV, new AbstractC05460Qv("Binder", "SCHEDULE_RESUME_ACTIVITY_TRANSACTION", null, 5, false), new AbstractC05460Qv("Binder", "TRANSACTION_scheduleResumeActivity", null, -19842, false)), abstractC05450Qu, "ON_RESUME", "on resume", 3);
        A09 = new EnumC05430Qs(EnumC05400Qo.ON_PAUSE, new AbstractC05450Qu("binder", c11140iV, new AbstractC05460Qv("Binder", "SCHEDULE_PAUSE_ACTIVITY_TRANSACTION", null, 1, false), new AbstractC05460Qv("Binder", "TRANSACTION_schedulePauseActivity", null, 1, false)), new AbstractC05450Qu("what", c10960iC, new AbstractC05460Qv("What", "PAUSE_ACTIVITY", null, 101, false), new AbstractC05460Qv("What", "PAUSE_ACTIVITY_FINISHING", null, 102, false)), "ON_PAUSE", "on pause", 4);
        A0D = new EnumC05430Qs(EnumC05400Qo.ON_STOP, "ON_STOP", "on stop", 5);
        A08 = new EnumC05430Qs(EnumC05400Qo.ON_DESTROY, "ON_DESTROY", "on destroy", 6);
        A0A = new EnumC05430Qs(EnumC05400Qo.ON_RESTART, "ON_RESTART", "on restart", 7);
        EnumC05430Qs enumC05430Qs = new EnumC05430Qs(EnumC05400Qo.UNDEFINED, "UNDEFINED", "undefined", 8);
        A0F = enumC05430Qs;
        A06 = new EnumC05430Qs[]{A0E, A07, A0C, A0B, A09, A0D, A08, A0A, enumC05430Qs};
        A05 = new C03720In("ActivityLifecycleState");
    }

    public static EnumC05430Qs valueOf(String str) {
        return (EnumC05430Qs) Enum.valueOf(EnumC05430Qs.class, str);
    }

    public static EnumC05430Qs[] values() {
        return (EnumC05430Qs[]) A06.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("[ActivityLifecycleState ");
        sb.append(AbstractC03770Is.A01(name()));
        sb.append(" - ");
        sb.append(this.A03);
        sb.append("\n LifeCycle: \n");
        EnumC05400Qo enumC05400Qo = this.A00;
        if (enumC05400Qo != null) {
            if (enumC05400Qo.A01) {
                str2 = Integer.toString(enumC05400Qo.A00);
            } else {
                str2 = "not yet inited";
            }
            str = AnonymousClass001.A11("Lifecycle ", enumC05400Qo.name(), "(", str2, ")");
        } else {
            str = "<N/A>";
        }
        sb.append(str);
        sb.append("\n What Codes [Maybe ");
        C10950iB c10950iB = this.A02;
        sb.append(c10950iB.A04.length);
        sb.append(" items]: [ \n");
        c10950iB.A00(sb);
        sb.append("\n Binder Codes [Maybe ");
        C11100iR c11100iR = this.A01;
        sb.append(c11100iR.A04.length);
        sb.append(" items]: [ \n");
        c11100iR.A00(sb);
        sb.append(" \n ]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Qu] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0Qu] */
    public EnumC05430Qs(EnumC05400Qo enumC05400Qo, C11100iR c11100iR, C10950iB c10950iB, String str, String str2, int i) {
        this.A03 = str2;
        this.A00 = enumC05400Qo;
        C10950iB abstractC05450Qu = c10950iB == null ? new AbstractC05450Qu("what", new C10960iC[0]) : c10950iB;
        this.A02 = abstractC05450Qu;
        C11100iR abstractC05450Qu2 = c11100iR == null ? new AbstractC05450Qu("binder", new C11140iV[0]) : c11100iR;
        this.A01 = abstractC05450Qu2;
        abstractC05450Qu.A00 = this;
        abstractC05450Qu2.A00 = this;
    }
}
