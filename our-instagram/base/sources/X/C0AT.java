package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0AT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0AT {
    public static Integer[] A00;
    public static final long[] A01 = new long[C05F.A00(39).length];
    public static final String[] A02 = new String[C05F.A00(39).length];

    static {
        String str;
        Integer[] A002 = C05F.A00(39);
        int length = A002.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Integer num = A002[i];
            String[] strArr = A02;
            int i3 = i2 + 1;
            switch (num.intValue()) {
                case 1:
                    str = "MemFree:";
                    break;
                case 2:
                    str = "Buffers:";
                    break;
                case 3:
                    str = "Cached:";
                    break;
                case 4:
                    str = "Dirty:";
                    break;
                case 5:
                    str = "Writeback:";
                    break;
                case 6:
                    str = "AnonPages:";
                    break;
                case 7:
                case 26:
                    str = "Shmem:";
                    break;
                case 8:
                    str = "Slab:";
                    break;
                case 9:
                    str = "KernelStack:";
                    break;
                case 10:
                    str = "PageTables:";
                    break;
                case 11:
                    str = "Bounce:";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "WritebackTmp:";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = "MemAvailable:";
                    break;
                case 14:
                    str = "SwapCached:";
                    break;
                case Process.SIGTERM /* 15 */:
                    str = "Active:";
                    break;
                case 16:
                    str = "Inactive:";
                    break;
                case 17:
                    str = "Active(anon):";
                    break;
                case 18:
                    str = "Inactive(anon):";
                    break;
                case Process.SIGSTOP /* 19 */:
                    str = "Active(file):";
                    break;
                case 20:
                    str = "Inactive(file):";
                    break;
                case 21:
                    str = "Unevictable:";
                    break;
                case 22:
                    str = "Mlocked:";
                    break;
                case 23:
                    str = "SwapTotal:";
                    break;
                case 24:
                    str = "SwapFree:";
                    break;
                case 25:
                    str = "Mapped:";
                    break;
                case 27:
                    str = "SReclaimable:";
                    break;
                case 28:
                    str = "SUnreclaim:";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    str = "NFS_Unstable:";
                    break;
                case 30:
                    str = "ION_heap:";
                    break;
                case 31:
                    str = "ION_page_pool:";
                    break;
                case 32:
                    str = "CommitLimit:";
                    break;
                case 33:
                    str = "Committed_AS:";
                    break;
                case 34:
                    str = "VmallocTotal:";
                    break;
                case 35:
                    str = "VmallocUsed:";
                    break;
                case 36:
                    str = "VmallocChunk:";
                    break;
                case 37:
                    str = "CmaTotal:";
                    break;
                case 38:
                    str = "CmaFree:";
                    break;
                default:
                    str = "MemTotal:";
                    break;
            }
            strArr[i2] = str;
            i++;
            i2 = i3;
        }
        Integer[] numArr = new Integer[39];
        System.arraycopy(new Integer[]{C05F.A07, C05F.A09, C05F.A0B, C05F.A0u, C05F.A05, C05F.A03, C05F.A0C, C05F.A0N, C05F.A0W, C05F.A0V, C05F.A0Q, C05F.A0R, C05F.A0Y, C05F.A01, C05F.A08, C05F.A0A, C05F.A0D, C05F.A0O, C05F.A0P, C05F.A1I, C05F.A0I, C05F.A0F, C05F.A0M, C05F.A02, C05F.A15, C05F.A0J, C05F.A1F}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{C05F.A0K, C05F.A0L, C05F.A06, C05F.A0H, C05F.A0G, C05F.A00, C05F.A0E, C05F.A0U, C05F.A0S, C05F.A0T, C05F.A0j, C05F.A04}, 0, numArr, 27, 12);
        A00 = numArr;
    }

    public static void A00() {
        C0JC.A02("/proc/meminfo", A01, A02);
    }
}
