package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.95s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2050395s {
    public static final HashSet A06 = new HashSet(Arrays.asList(1, 2));
    public InterfaceC219914z A00 = null;
    public AnonymousClass153 A01 = null;
    public java.util.Set A02 = null;
    public final int A03;
    public final int A04;
    public final C15P A05;

    public static String A00(int i) {
        switch (i) {
            case 1:
                return "cpuBoost";
            case 2:
                return "gpuBoost";
            case 3:
                return "delayedGC";
            case 4:
                return "layoutPreinflation";
            case 5:
                return "threadAffinity";
            case 6:
                return "renderThreadBoost";
            case 7:
                return "classPreloading";
            case 8:
                return "uiThreadBoost";
            case 9:
                return "lithoLayoutThreadBoost";
            case 10:
                return "delayedAnalytics";
            case 11:
                return "deepDataCollection";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "memoryManagerTrim";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "softKeyboard";
            case 14:
                return "jitSampleOnly";
            case Process.SIGTERM /* 15 */:
                return "blockIdleJob";
            case 16:
                return "activityThread";
            case 17:
                return "uiThreadPeriodic";
            case 18:
                return "ioThreadPeriodic";
            case Process.SIGSTOP /* 19 */:
                return "graphQLExecutor";
            case 20:
                return "binder";
            case 21:
                return "smartFsync";
            case 22:
                return "mlock";
            case 23:
                return "threadBoostByName";
            case 24:
                return "displayCache";
            case 25:
                return "ditto";
            case 26:
                return "msysThreadsBoost";
            case 27:
                return "noOp";
            case 28:
                return "perfHintManagerBoost";
            default:
                return "";
        }
    }

    public static int[] A01() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
    }

    public C2050395s(C15P c15p, int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = c15p;
        if (c15p != null) {
            c15p.A01 = i;
        }
    }
}
