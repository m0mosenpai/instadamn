package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* renamed from: X.0g6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0g6 extends AbstractC19070wo implements C0VR {
    public static final int A01;
    public Random A00 = new Random();

    @Override // X.AbstractC06400Vg
    public final boolean A03() {
        return true;
    }

    @Override // X.AbstractC06400Vg
    public final boolean A04(long j, Object obj, Object obj2, long j2) {
        return j == j2;
    }

    static {
        C0VT c0vt = TriggerRegistry.A00;
        A01 = c0vt.A02("qpl");
        c0vt.A02("sequence_qpl");
    }

    @Override // X.AbstractC06400Vg
    public final int A01(InterfaceC06330Uz interfaceC06330Uz, Object obj, long j) {
        C0VH c0vh = (C0VH) A06(interfaceC06330Uz);
        int binarySearch = Arrays.binarySearch(c0vh.A00, (int) j);
        if (binarySearch >= 0) {
            C0VG c0vg = c0vh.A01[binarySearch];
            int i = c0vg.A00;
            if (i != 1 && this.A00.nextInt(i) != 0) {
                return -101;
            }
            return c0vg.A02;
        }
        return -100;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0VG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0VH, java.lang.Object] */
    @Override // X.AbstractC19070wo
    public final /* bridge */ /* synthetic */ Object A05(InterfaceC06330Uz interfaceC06330Uz) {
        int[] traceConfigIdxs = interfaceC06330Uz.getTraceConfigIdxs("qpl", "start");
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(traceConfigIdxs.length);
        for (int i : traceConfigIdxs) {
            ?? obj2 = new Object();
            if (!interfaceC06330Uz.optTraceConfigParamBool(i, "trace_config.is_cold_start", false)) {
                obj2.A02 = i;
                obj2.A01 = interfaceC06330Uz.getTraceConfigTriggerParamInt(i, "qpl", "start", "trigger.qpl.marker");
                obj2.A00 = interfaceC06330Uz.getTraceConfigParamInt(i, "trace_config.coinflip_sample_rate");
                arrayList.add(obj2);
            }
        }
        int i2 = 0;
        C0VG[] c0vgArr = (C0VG[]) arrayList.toArray(new C0VG[0]);
        obj.A01 = c0vgArr;
        Arrays.sort(c0vgArr, C0VG.A03);
        C0VG[] c0vgArr2 = obj.A01;
        int length = c0vgArr2.length;
        int[] iArr = new int[length];
        obj.A00 = iArr;
        int i3 = 0;
        while (i2 < length) {
            iArr[i3] = c0vgArr2[i2].A01;
            i2++;
            i3++;
        }
        return obj;
    }
}
