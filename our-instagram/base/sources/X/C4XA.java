package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.4XA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XA implements InterfaceC96424Va {
    public C2BB A00 = null;
    public final long A01;
    public final C2B4 A02;
    public final EnumC91984Ae A03;
    public final C4SS A04;
    public final C92124As A05;
    public final AtomicBoolean A06;
    public final AtomicBoolean A07;
    public final /* synthetic */ C95924Tb A08;

    public C4XA(C2B4 c2b4, EnumC91984Ae enumC91984Ae, C4SS c4ss, C95924Tb c95924Tb, C92124As c92124As, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j) {
        this.A08 = c95924Tb;
        this.A01 = j;
        this.A04 = c4ss;
        this.A03 = enumC91984Ae;
        this.A02 = c2b4;
        this.A05 = c92124As;
        this.A07 = atomicBoolean;
        this.A06 = atomicBoolean2;
    }

    @Override // X.InterfaceC96424Va
    public final InterfaceC92354Bq ALy() {
        String str;
        InterfaceC92354Bq A04;
        InterfaceC92354Bq A00;
        C4SS c4ss = this.A04;
        InterfaceC96424Va interfaceC96424Va = c4ss.A0L;
        if (interfaceC96424Va != null) {
            A04 = interfaceC96424Va.ALy();
            C2BB c2bb = this.A00;
            if (c2bb != null) {
                A04.addTransferListener(c2bb);
            }
        } else {
            EnumC91984Ae enumC91984Ae = this.A03;
            EnumC91984Ae enumC91984Ae2 = EnumC91984Ae.PROGRESSIVE;
            if (enumC91984Ae == enumC91984Ae2 && AbstractC96324Uq.A00(c4ss.A0K.A05)) {
                C95924Tb c95924Tb = this.A08;
                A04 = new C58604PyX(c95924Tb.A00, c95924Tb.A05.A18);
                C2BB c2bb2 = this.A00;
                if (c2bb2 != null) {
                    A04.addTransferListener(c2bb2);
                }
            } else {
                if (enumC91984Ae == EnumC91984Ae.DASH_TEXT) {
                    C4AN c4an = c4ss.A0K;
                    boolean A002 = AbstractC96324Uq.A00(c4an.A04);
                    C95924Tb c95924Tb2 = this.A08;
                    if (A002) {
                        A00 = new C58604PyX(c95924Tb2.A00, c95924Tb2.A05.A18);
                        C2BB c2bb3 = this.A00;
                        if (c2bb3 != null) {
                            A00.addTransferListener(c2bb3);
                        }
                    } else {
                        String str2 = c95924Tb2.A05.A18;
                        A00 = C2Ai.A00.A00(new C92304Bk(c4ss.A04, c4an.A06, c4an.A0G, c4an.A0A, c4an.A0B, this.A07, c4ss.A0A), null, null, str2, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
                    }
                    return new C97864aR(A00);
                }
                C95924Tb c95924Tb3 = this.A08;
                C2BZ c2bz = c95924Tb3.A01;
                C4AN c4an2 = c4ss.A0K;
                String str3 = c4an2.A0G;
                String str4 = c4an2.A0A;
                String str5 = c4an2.A0B;
                AtomicBoolean atomicBoolean = this.A07;
                C92304Bk c92304Bk = new C92304Bk(c4ss.A04, c4an2.A06, str3, str4, str5, atomicBoolean, c4ss.A0A, c4ss.A0S);
                long j = this.A01;
                String str6 = c4ss.A06;
                boolean z = false;
                if (enumC91984Ae == enumC91984Ae2) {
                    z = true;
                }
                Map map = c4an2.A0J;
                C2B4 c2b4 = this.A02;
                C2BB c2bb4 = this.A00;
                ServiceEventCallbackImpl serviceEventCallbackImpl = c95924Tb3.A04;
                int A003 = C461429y.A00(c95924Tb3.A03, 0);
                boolean z2 = c4an2.A0M;
                boolean z3 = c4an2.A0N;
                InterfaceC460429o interfaceC460429o = c95924Tb3.A06;
                C92124As c92124As = this.A05;
                if (c92124As != null && c92124As.A0Q.size() > 0) {
                    str = ((C4BB) ((C4BF) c92124As.A02(0).A03.get(0)).A07.get(0)).A02.A0R;
                } else {
                    str = null;
                }
                String str7 = str;
                A04 = c2bz.A04(c2b4, serviceEventCallbackImpl, c2bb4, enumC91984Ae, c92304Bk, interfaceC460429o, str6, "", str7, c4ss.A07, map, atomicBoolean, this.A06, 0, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, A003, j, false, z, z2, z3, false, false, false, false);
            }
        }
        return new C97864aR(A04);
    }
}
