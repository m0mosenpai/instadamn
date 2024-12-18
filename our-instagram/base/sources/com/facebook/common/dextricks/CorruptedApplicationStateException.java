package com.facebook.common.dextricks;

/* loaded from: classes.dex */
public class CorruptedApplicationStateException extends RuntimeException {
    public final Remedy mRemedy;

    /* loaded from: classes.dex */
    public enum Remedy {
        REINSTALL,
        REBOOT,
        UNKNOWN
    }

    /* renamed from: com.facebook.common.dextricks.CorruptedApplicationStateException$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$common$dextricks$CorruptedApplicationStateException$Remedy;

        static {
            int[] iArr = new int[Remedy.values().length];
            $SwitchMap$com$facebook$common$dextricks$CorruptedApplicationStateException$Remedy = iArr;
            try {
                iArr[Remedy.REBOOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Remedy.REINSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CorruptedApplicationStateException(Throwable th) {
        this(th, Remedy.UNKNOWN);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Application is in corrupt state. ");
        Remedy remedy = this.mRemedy;
        int ordinal = remedy.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                str = "Reinstall application.";
            }
            sb.append("[ mRemedy = ");
            sb.append(remedy);
            sb.append(" ]");
            return sb.toString();
        }
        str = "Reboot device. ";
        sb.append(str);
        sb.append("[ mRemedy = ");
        sb.append(remedy);
        sb.append(" ]");
        return sb.toString();
    }

    public Remedy getRemedy() {
        return this.mRemedy;
    }

    public CorruptedApplicationStateException(Throwable th, Remedy remedy) {
        super(th);
        this.mRemedy = remedy;
    }
}
