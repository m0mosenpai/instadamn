package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class J03 implements YQT {
    public boolean A00;
    public final long A01;
    public final long A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final C18920wW A0A;

    @Override // X.YQT
    public final void CjX(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_prefetch_fail");
        if (A0f.isSampled()) {
            A01(A0f, this);
            A0f.AAP("reason", str);
            A0f.Cht();
        }
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, J03 j03) {
        interfaceC02590Ai.A9K("ad_id", Long.valueOf(j03.A01));
        interfaceC02590Ai.AAP("client_session_id", j03.A05);
        interfaceC02590Ai.AAP("ranking_session_id", j03.A07);
        interfaceC02590Ai.AAP("container_module", j03.A06);
        interfaceC02590Ai.A8I("client_event_time", Double.valueOf(System.currentTimeMillis()));
        interfaceC02590Ai.AAP("radio_type", "");
        interfaceC02590Ai.A9K("audio_asset_id", Long.valueOf(j03.A02));
        interfaceC02590Ai.AAP("audio_render_mode", "showreel_not_synced");
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, J03 j03) {
        interfaceC02590Ai.A9K("ad_id", Long.valueOf(j03.A01));
        interfaceC02590Ai.AAP("client_session_id", j03.A05);
        interfaceC02590Ai.AAP("container_module", j03.A06);
        interfaceC02590Ai.A8I("client_event_time", Double.valueOf(System.currentTimeMillis()));
        interfaceC02590Ai.A9K("audio_asset_id", Long.valueOf(j03.A02));
        interfaceC02590Ai.AAP("audio_render_mode", "showreel_not_synced");
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, J03 j03) {
        interfaceC02590Ai.A7v("is_audio_enabled", Boolean.valueOf(j03.A00));
        interfaceC02590Ai.A7v("is_fast_start_url_existed", Boolean.valueOf(j03.A09));
        interfaceC02590Ai.A9K("duration", j03.A03);
        interfaceC02590Ai.A9K("starting_point", j03.A04);
        interfaceC02590Ai.AAk("beats", j03.A08);
        interfaceC02590Ai.Cht();
    }

    @Override // X.YQT
    public final void CjU() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_data_source_prepared");
        if (A0f.isSampled()) {
            A01(A0f, this);
            A0f.Cht();
        }
    }

    @Override // X.YQT
    public final void CjV() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_pause");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A02(A0f, this);
        }
    }

    @Override // X.YQT
    public final void CjW() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_player_release");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A0f.A9K("audio_repeat_count", AbstractC167007dF.A0d());
            A02(A0f, this);
        }
    }

    @Override // X.YQT
    public final void CjY() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_prefetch_start");
        if (A0f.isSampled()) {
            A01(A0f, this);
            A0f.Cht();
        }
    }

    @Override // X.YQT
    public final void CjZ() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_prefetch_success");
        if (A0f.isSampled()) {
            A01(A0f, this);
            A0f.Cht();
        }
    }

    @Override // X.YQT
    public final void Cja(double d, double d2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_progress_1_sec");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A0f.A8I("audio_progress", Double.valueOf(d));
            A0f.A8I("animation_progress", Double.valueOf(d2));
            A02(A0f, this);
        }
    }

    @Override // X.YQT
    public final void Cjb(double d, double d2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_progress_5_sec");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A0f.A8I("audio_progress", Double.valueOf(d));
            A0f.A8I("animation_progress", Double.valueOf(d2));
            A02(A0f, this);
        }
    }

    @Override // X.YQT
    public final void Cjc() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_resume");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A02(A0f, this);
        }
    }

    @Override // X.YQT
    public final void Cjd() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_start_init");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A02(A0f, this);
        }
    }

    @Override // X.YQT
    public final void Cje() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_start_play");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A02(A0f, this);
        }
    }

    @Override // X.YQT
    public final void Cjf() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_volume_down");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A0f.A9K("audio_repeat_count", AbstractC167007dF.A0d());
            A02(A0f, this);
        }
    }

    @Override // X.YQT
    public final void Cjg() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0A, "ig_ads_audio_volume_up");
        if (A0f.isSampled()) {
            A00(A0f, this);
            A0f.A9K("audio_repeat_count", AbstractC167007dF.A0d());
            A02(A0f, this);
        }
    }

    public J03(C18920wW c18920wW, Long l, Long l2, String str, String str2, String str3, List list, long j, long j2, boolean z) {
        this.A0A = c18920wW;
        this.A01 = j;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A02 = j2;
        this.A04 = l;
        this.A09 = z;
        this.A03 = l2;
        this.A08 = list;
    }

    @Override // X.YQT
    public final void EPx(boolean z) {
        this.A00 = z;
    }
}
