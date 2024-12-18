package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2R2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2R2 implements C0TR {
    public static long A02;
    public Map A00;
    public final boolean A01;

    @Override // X.C0TR
    public final boolean shouldCollectMetrics(int i) {
        return (i & 2) != 0;
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean shouldCollectMetrics(int i, C0TG c0tg) {
        return C0TQ.A00(c0tg, this, i);
    }

    @Override // X.C0TR
    public final boolean supportsIndexedDataPoints() {
        return true;
    }

    public C2R2(boolean z) {
        this.A01 = z;
    }

    @Override // X.C0TR
    public final Collection getDataPoints() {
        return getIndexedDataPoints().values();
    }

    @Override // X.C0TR
    public final Map getIndexedDataPoints() {
        String str;
        C0AT.A00();
        HashMap hashMap = new HashMap();
        long[] jArr = C0AT.A01;
        long j = jArr[3] + jArr[2] + jArr[4] + jArr[5] + jArr[12] + jArr[1];
        long j2 = jArr[0];
        C0TP c0tp = C0TP.A11;
        hashMap.put(c0tp, new C0TJ(c0tp, j2, j2 - j));
        C0TP c0tp2 = C0TP.A0y;
        hashMap.put(c0tp2, new C0TJ(c0tp2, -1L, jArr[8] + jArr[9] + jArr[10] + jArr[11]));
        C0TP c0tp3 = C0TP.A12;
        hashMap.put(c0tp3, new C0TJ(c0tp3, -1L, jArr[7]));
        C0TP c0tp4 = C0TP.A0u;
        hashMap.put(c0tp4, new C0TJ(c0tp4, j2, jArr[6]));
        C0TP c0tp5 = C0TP.A0v;
        hashMap.put(c0tp5, new C0TJ(c0tp5, j2, jArr[13]));
        long j3 = jArr[30];
        long j4 = jArr[31];
        if (j3 > 0 || j4 > 0) {
            C0TP c0tp6 = C0TP.A0w;
            hashMap.put(c0tp6, new C0TJ(c0tp6, -1L, j3));
            C0TP c0tp7 = C0TP.A0x;
            hashMap.put(c0tp7, new C0TJ(c0tp7, -1L, j4));
            long j5 = A02;
            if (j5 > 0) {
                C0TP c0tp8 = C0TP.A0T;
                hashMap.put(c0tp8, new C0TJ(c0tp8, -1L, j3 - j5));
            }
        }
        if (this.A01) {
            if (this.A00 == null) {
                this.A00 = new HashMap();
            }
            int i = 0;
            while (true) {
                Integer[] numArr = C0AT.A00;
                if (i < 39) {
                    switch (numArr[i].intValue()) {
                        case 1:
                            str = "FREE";
                            break;
                        case 2:
                            str = "BUFFERS";
                            break;
                        case 3:
                            str = "CACHED";
                            break;
                        case 4:
                            str = "DIRTY";
                            break;
                        case 5:
                            str = "WRITEBACK";
                            break;
                        case 6:
                            str = "ANONYMOUS";
                            break;
                        case 7:
                            str = "SHARED";
                            break;
                        case 8:
                            str = "SLAB";
                            break;
                        case 9:
                            str = "KERNELSTACK";
                            break;
                        case 10:
                            str = "PAGETABLES";
                            break;
                        case 11:
                            str = "BOUNCE";
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            str = "WRITEBACKTMP";
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            str = MessageAvailabilityResponseId$Companion.AVAILABLE;
                            break;
                        case 14:
                            str = "SWAPCACHED";
                            break;
                        case Process.SIGTERM /* 15 */:
                            str = "ACTIVE";
                            break;
                        case 16:
                            str = "INACTIVE";
                            break;
                        case 17:
                            str = "ACTIVEANON";
                            break;
                        case 18:
                            str = "INACTIVEANON";
                            break;
                        case Process.SIGSTOP /* 19 */:
                            str = "ACTIVEFILE";
                            break;
                        case 20:
                            str = "INACTIVEFILE";
                            break;
                        case 21:
                            str = "UNEVICTABLE";
                            break;
                        case 22:
                            str = "MLOCKED";
                            break;
                        case 23:
                            str = "SWAPTOTAL";
                            break;
                        case 24:
                            str = "SWAPFREE";
                            break;
                        case 25:
                            str = "MAPPED";
                            break;
                        case 26:
                            str = "SHMEM";
                            break;
                        case 27:
                            str = "SRECLAIMABLE";
                            break;
                        case 28:
                            str = "SUNRECLAIMABLE";
                            break;
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                            str = "NFSUNSTABLE";
                            break;
                        case 30:
                            str = "IONHEAP";
                            break;
                        case 31:
                            str = "IONPAGEPOOL";
                            break;
                        case 32:
                            str = "COMMITLIMIT";
                            break;
                        case 33:
                            str = "COMMITTEDAS";
                            break;
                        case 34:
                            str = "VMALLOCTOTAL";
                            break;
                        case 35:
                            str = "VMALLOCUSED";
                            break;
                        case 36:
                            str = "VMALLOCCHUNK";
                            break;
                        case 37:
                            str = "CMATOTAL";
                            break;
                        case 38:
                            str = "CMAFREE";
                            break;
                        default:
                            str = PriceTableAnnotation$Companion.TOTAL;
                            break;
                    }
                    C0TP c0tp9 = (C0TP) this.A00.get(str);
                    if (c0tp9 == null) {
                        c0tp9 = new C0TP(str, C05F.A00);
                        this.A00.put(str, c0tp9);
                    }
                    hashMap.put(c0tp9, new C0TJ(c0tp9, -1L, jArr[numArr[i].intValue()]));
                    i++;
                }
            }
        }
        return hashMap;
    }

    public C2R2() {
        this.A01 = false;
    }
}
