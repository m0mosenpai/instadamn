package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25211Lb implements InterfaceC25221Lc {
    public final void A00(C6FG c6fg, String str, Throwable th, boolean z) {
        String str2;
        Object by7;
        Integer num;
        String str3;
        String[] strArr;
        C14360o3.A0B(str, 2);
        if (th instanceof InterfaceC1338662u) {
            by7 = th;
        } else {
            if (c6fg == null) {
                str2 = null;
            } else {
                str2 = (String) c6fg.A01.get(R.id.bk_context_key_logging_id);
            }
            by7 = new BY7(str, str2, th);
        }
        InterfaceC1338662u interfaceC1338662u = (InterfaceC1338662u) by7;
        if (th instanceof C1338562t) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        C14360o3.A0B(interfaceC1338662u, 0);
        String BOp = interfaceC1338662u.BOp();
        int i = 36702256;
        if (num == C05F.A00) {
            i = 36705544;
        }
        if (BOp == null) {
            str3 = "unknown_callsite";
        } else {
            str3 = BOp;
        }
        C0f5 AEp = new C1KE(C006802i.A0p, new Random(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS).AEp(str3, i);
        List Agc = interfaceC1338662u.Agc();
        if (Agc != null) {
            strArr = (String[]) Agc.toArray(new String[0]);
        } else {
            strArr = null;
        }
        String B2q = interfaceC1338662u.B2q();
        if (B2q == null) {
            B2q = "";
        }
        AEp.ABW("exception_message", B2q);
        if (BOp != null) {
            AEp.ABW("bloks_logging_id", BOp);
        }
        if (strArr != null) {
            AEp.ABY("bloks_raw_stack_trace", strArr);
        }
        Throwable BWA = interfaceC1338662u.BWA();
        if (BWA != null) {
            AEp.ERI(BWA);
        }
        AEp.report();
        if (!z && c6fg != null && C17280tP.A4E.A00().A0g()) {
            List Agc2 = interfaceC1338662u.Agc();
            String B2q2 = interfaceC1338662u.B2q();
            if (Agc2 != null && B2q2 != null) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                BitSet bitSet = new BitSet(2);
                hashMap.put(DialogModule.KEY_MESSAGE, B2q2);
                bitSet.set(1);
                if (!Agc2.isEmpty()) {
                    hashMap.put("bloks_raw_stack_trace", Agc2);
                    bitSet.set(0);
                }
                Context context = c6fg.A00;
                InterfaceC62872tQ interfaceC62872tQ = c6fg.A02;
                C36020FvI c36020FvI = new C36020FvI();
                if (bitSet.nextClearBit(0) >= 2) {
                    C69618VsL A01 = FTe.A01("com.bloks.www.bloks.error.report_to_sandbox");
                    A01.A04 = AbstractC191768eY.A01(hashMap);
                    A01.A03 = hashMap2;
                    A01.A02 = c36020FvI;
                    A01.A00(context, interfaceC62872tQ);
                    return;
                }
                throw new IllegalStateException("Missing Required Props");
            }
        }
    }

    @Override // X.InterfaceC25221Lc
    public final void EHF(EnumC50702Ur enumC50702Ur, String str, String str2, Throwable th, Map map, int i) {
        C14360o3.A0B(enumC50702Ur, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        A00(null, str2, th, false);
    }
}
