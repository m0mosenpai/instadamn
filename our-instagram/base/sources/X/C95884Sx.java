package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95884Sx implements InterfaceC95894Sy {
    public final C95874Sw A00;
    public final InterfaceC02550Ad A01;

    @Override // X.InterfaceC95894Sy
    public final void EIb(List list, long j, long j2) {
        String str;
        C0Zx c0Zx;
        C4T2 c4t2;
        C14360o3.A0B(list, 0);
        C95874Sw c95874Sw = this.A00;
        InterfaceC02550Ad interfaceC02550Ad = this.A01;
        if (!list.isEmpty()) {
            C95554Rp.A00(interfaceC02550Ad, c95874Sw.A00, c95874Sw.A02, "client_compound_event_on_send", c95874Sw.A01.A01(c95874Sw.A00, j));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4T9 c4t9 = (C4T9) it.next();
                if (c4t9 != null) {
                    String str2 = c4t9.A0A;
                    c0Zx = new C0Zx();
                    c0Zx.A05("client_time_ms", Long.valueOf(c4t9.A00));
                    c0Zx.A06("event_name", str2);
                    c0Zx.A05("media_time_ms", Long.valueOf(c4t9.A02));
                    if (str2 == "paused" || str2 == "completed" || str2 == "started_playing" || str2 == "reset") {
                        c0Zx.A05("video_client_duration", Long.valueOf(c4t9.A01));
                    }
                    if (str2 == "completed" || str2 == "started_playing") {
                        c0Zx.A03("is_looping", Boolean.valueOf(c4t9.A0E));
                    }
                    Long l = c4t9.A08;
                    if (l != null) {
                        c0Zx.A05("player_instance_id", l);
                    }
                    String str3 = c4t9.A0B;
                    if (str3 != null) {
                        c0Zx.A06("player_instance_key", str3);
                    }
                    if (str2 == "tags_changed" && (c4t2 = c4t9.A04) != null) {
                        c0Zx.A02(c4t2, "tag_metadata");
                    }
                    c0Zx.A06("session_validation_token", c4t9.A0C);
                    String str4 = c4t9.A0D;
                    if (str4 != null) {
                        c0Zx.A06("start_state", str4);
                    }
                    String str5 = c4t9.A09;
                    if (str5 != null) {
                        c0Zx.A06("callsite_context", str5);
                    }
                    C123205hv c123205hv = c4t9.A03;
                    if (c123205hv != null) {
                        c0Zx.A02(c123205hv, "error_metadata");
                    }
                    Boolean bool = c4t9.A05;
                    if (bool != null) {
                        c0Zx.A03("is_audio_stalling", bool);
                    }
                    Boolean bool2 = c4t9.A06;
                    if (bool2 != null) {
                        c0Zx.A03("is_stalling", bool2);
                    }
                    Long l2 = c4t9.A07;
                    if (l2 != null) {
                        c0Zx.A05("buffer_end_to_live_head_delta_ms", l2);
                    }
                } else {
                    c0Zx = null;
                }
                arrayList.add(c0Zx);
            }
            C95804So c95804So = c95874Sw.A00;
            C3N6 c3n6 = c95874Sw.A03;
            if (c3n6 == null || (str = c3n6.Ary()) == null) {
                str = "";
            }
            C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
            C12180kM c12180kM = c18920wW.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c12180kM, "media_playback_compound");
            C0Zx c0Zx2 = new C0Zx();
            c0Zx2.A06("correlation_id", str);
            if (A00.isSampled() && c95804So != null) {
                A00.AAQ(c95804So, "required_metadata");
                A00.AAk("events", arrayList);
                C0Zx c0Zx3 = new C0Zx();
                c0Zx3.A05("sequence", 1L);
                A00.AAQ(c0Zx3, "operational_metadata");
                A00.AAQ(c0Zx2, "dsp_correlation_metadata");
                A00.A9K("client_high_res_packaging_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
                A00.Cht();
            }
            if (c95874Sw.A02.A0A) {
                InterfaceC02590Ai A002 = c18920wW.A00(c12180kM, "media_playback_compound_fast");
                C0Zx c0Zx4 = new C0Zx();
                c0Zx4.A06("correlation_id", str);
                if (A002.isSampled() && c95804So != null) {
                    A002.AAQ(c95804So, "required_metadata");
                    A002.AAk("events", arrayList);
                    C0Zx c0Zx5 = new C0Zx();
                    c0Zx5.A05("sequence", 1L);
                    A002.AAQ(c0Zx5, "operational_metadata");
                    A002.AAQ(c0Zx4, "dsp_correlation_metadata");
                    A002.A9K("client_high_res_packaging_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
                    A002.Cht();
                }
            }
        }
    }

    public C95884Sx(InterfaceC02550Ad interfaceC02550Ad, C95874Sw c95874Sw) {
        this.A00 = c95874Sw;
        this.A01 = interfaceC02550Ad;
    }
}
