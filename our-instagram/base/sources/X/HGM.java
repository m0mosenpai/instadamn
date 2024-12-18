package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes7.dex */
public final class HGM extends C1P1 {
    public final /* synthetic */ C1CI A00;

    public HGM(C1CI c1ci) {
        this.A00 = c1ci;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1842830835);
        super.onFail(abstractC115105If);
        C226218q.A01(AbstractC12960li.A00).A0E();
        C0f9.A0A(944698855, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(981079222);
        super.onFinish();
        C0f9.A0A(55169176, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1654414737);
        super.onStart();
        C1CI c1ci = this.A00;
        c1ci.A00 = System.currentTimeMillis();
        C1CI.A02(c1ci, false);
        C0f9.A0A(-134674502, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-82709473);
        C74283Vj c74283Vj = (C74283Vj) obj;
        int A0N = AbstractC167017dG.A0N(c74283Vj, -353525099);
        super.onSuccessInBackground(c74283Vj);
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s A01 = C226218q.A01(c18720vz);
        if (!c74283Vj.mFromDiskCache) {
            if (!c74283Vj.A0O) {
                A01.A0F();
                C1CI.A01();
            } else {
                A01.A0P(A01.A02, "SHELL_RESPONSE_PARSED");
                A01.A0P(A01.A02, "SHELL_RESPONSE_SUCCESS");
            }
        } else {
            C226218q.A01(c18720vz).A0E();
            A01.A0Q(A01.A02, "CACHED_FEED_START", AwakeTimeSinceBootClock.INSTANCE.now());
            C226418s.A0B(A01, new J72(A01.A0G.getValue(), 1), new C57246PbU(A01, 11));
        }
        if (c74283Vj.A0J != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A00.A06);
            C14360o3.A0B(A00, 1);
            String A002 = AbstractC93184Fu.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, c74283Vj.A0J);
            C14360o3.A07(A002);
            A00.A0Q.Egi(A00, A002, C23031Ai.A8c[47]);
        }
        this.A00.A05(c74283Vj);
        C0f9.A0A(-109248043, A0N);
        C0f9.A0A(164490470, A03);
    }
}
