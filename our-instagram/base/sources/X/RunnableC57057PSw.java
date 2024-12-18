package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.PSw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57057PSw implements Runnable {
    public final /* synthetic */ LiveStreamingError A00;
    public final /* synthetic */ BroadcastFailureType A01;
    public final /* synthetic */ C53021Nct A02;

    public RunnableC57057PSw(LiveStreamingError liveStreamingError, BroadcastFailureType broadcastFailureType, C53021Nct c53021Nct) {
        this.A02 = c53021Nct;
        this.A01 = broadcastFailureType;
        this.A00 = liveStreamingError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i;
        Integer num;
        String str;
        C19260xA c19260xA;
        PJC pjc = this.A02.A0E;
        if (pjc != null) {
            BroadcastFailureType broadcastFailureType = this.A01;
            LiveStreamingError liveStreamingError = this.A00;
            C14360o3.A0B(broadcastFailureType, 0);
            C14360o3.A0B(liveStreamingError, 1);
            ((C006802i) AbstractC166987dD.A17(((O93) pjc.A0V.A01.getValue()).A01)).markerEnd(29241390, (short) 3);
            N3J n3j = pjc.A04;
            if (n3j != null && n3j.A0K) {
                C55085Oah c55085Oah = pjc.A0U;
                String str2 = liveStreamingError.description;
                if (c55085Oah.A06 != null) {
                    c55085Oah.A01 = C05F.A15;
                    if (str2 != null) {
                        c19260xA = new C19260xA();
                        C19260xA.A00(c19260xA, str2, "e");
                        str = "ERROR";
                    } else {
                        str = "INFO";
                        c19260xA = null;
                    }
                    C55085Oah.A00(c19260xA, c55085Oah, "END", str, "BROADCASTER");
                    c55085Oah.A06 = null;
                }
            }
            boolean z = true;
            try {
                int ordinal = broadcastFailureType.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 6) {
                        num = C05F.A0u;
                    } else {
                        num = C05F.A1F;
                    }
                } else {
                    num = C05F.A15;
                }
                pjc.A02(num, liveStreamingError.reason, pjc.A05.A00());
            } catch (RuntimeException e) {
                OQX.A01(pjc.A0P, pjc.A0R).A00();
                OQW.A00(e);
            }
            EnumC53324Ni1 enumC53324Ni1 = pjc.A05;
            if (enumC53324Ni1.A00() || enumC53324Ni1 == EnumC53324Ni1.A0D || enumC53324Ni1 == EnumC53324Ni1.A0C) {
                z = false;
            }
            C56806PIx c56806PIx = pjc.A08;
            if (c56806PIx != null) {
                String str3 = liveStreamingError.reason;
                C14360o3.A0B(str3, 1);
                if (z) {
                    int ordinal2 = broadcastFailureType.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            context = c56806PIx.A04;
                            i = 2131965388;
                            if (ordinal2 != 6) {
                                i = 2131965359;
                            }
                        } else {
                            context = c56806PIx.A04;
                            i = 2131965402;
                        }
                        str3 = AbstractC166997dE.A0p(context, i);
                    }
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("IgLive.error_message", str3);
                    c56806PIx.A0I.invoke(false, A0b);
                }
            }
        }
    }
}
