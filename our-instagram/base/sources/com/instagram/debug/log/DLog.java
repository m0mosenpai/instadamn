package com.instagram.debug.log;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C17280tP;
import X.C19700xy;
import X.InterfaceC41471vw;
import com.instagram.debug.log.tags.DLogTag;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class DLog {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final DLog INSTANCE = new Object();

    /* loaded from: classes8.dex */
    public final class NewLogEvent extends C0T6 implements InterfaceC41471vw {
        public final int logLevel;
        public final DLogTag logTag;
        public final String message;

        public static /* synthetic */ NewLogEvent copy$default(NewLogEvent newLogEvent, DLogTag dLogTag, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                dLogTag = newLogEvent.logTag;
            }
            if ((i2 & 2) != 0) {
                i = newLogEvent.logLevel;
            }
            if ((i2 & 4) != 0) {
                str = newLogEvent.message;
            }
            return newLogEvent.copy(dLogTag, i, str);
        }

        public final DLogTag component1() {
            return this.logTag;
        }

        public final int component2() {
            return this.logLevel;
        }

        public final String component3() {
            return this.message;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof NewLogEvent) {
                    NewLogEvent newLogEvent = (NewLogEvent) obj;
                    if (!C14360o3.A0K(this.logTag, newLogEvent.logTag) || this.logLevel != newLogEvent.logLevel || !C14360o3.A0K(this.message, newLogEvent.message)) {
                    }
                }
                return false;
            }
            return true;
        }

        public String toString() {
            return super.toString();
        }

        public final int getLogLevel() {
            return this.logLevel;
        }

        public final DLogTag getLogTag() {
            return this.logTag;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AbstractC25226BEj.A03(this.message, (AbstractC166987dD.A0G(this.logTag) + this.logLevel) * 31);
        }

        public NewLogEvent(DLogTag dLogTag, int i, String str) {
            AbstractC167017dG.A1Q(dLogTag, str);
            this.logTag = dLogTag;
            this.logLevel = i;
            this.message = str;
        }

        public final NewLogEvent copy(DLogTag dLogTag, int i, String str) {
            AbstractC167017dG.A1O(dLogTag, str);
            return new NewLogEvent(dLogTag, i, str);
        }
    }

    public static final void d(DLogTag dLogTag, String str, Object... objArr) {
        C14360o3.A0B(dLogTag, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(objArr, 2);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C14360o3.A07(String.format(str, Arrays.copyOf(copyOf, copyOf.length)));
        C19700xy c19700xy = C17280tP.A4E;
        c19700xy.A00();
        c19700xy.A00();
    }

    public static final void e(DLogTag dLogTag, String str, Object... objArr) {
        C14360o3.A0B(dLogTag, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(objArr, 2);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C14360o3.A07(String.format(str, Arrays.copyOf(copyOf, copyOf.length)));
        C19700xy c19700xy = C17280tP.A4E;
        c19700xy.A00();
        c19700xy.A00();
    }

    private final void sendLogLine(DLogTag dLogTag, int i, String str) {
        C19700xy c19700xy = C17280tP.A4E;
        c19700xy.A00();
        c19700xy.A00();
    }

    private final void sendLogLineToOverlay(NewLogEvent newLogEvent) {
        String str;
        try {
            Class<?> cls = Class.forName("com.instagram.debug.devoptions.DebugOverlayController");
            C14360o3.A07(cls);
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            if (newLogEvent.logLevel == 3) {
                str = "logDebugMessage";
            } else {
                str = "logErrorMessage";
            }
            cls.getMethod(str, DLogTag.class, String.class).invoke(invoke, newLogEvent.logTag, newLogEvent.message);
        } catch (Exception unused) {
        }
    }

    private final boolean shouldLogEvent(DLogTag dLogTag) {
        C17280tP.A4E.A00();
        return false;
    }
}
