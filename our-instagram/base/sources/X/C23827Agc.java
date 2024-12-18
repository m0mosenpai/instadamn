package X;

import android.app.Dialog;

/* renamed from: X.Agc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23827Agc implements InterfaceC25207BDf {
    public final /* synthetic */ C8LZ A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC25207BDf
    public final void onStart() {
    }

    public C23827Agc(C8LZ c8lz, boolean z) {
        this.A00 = c8lz;
        this.A01 = z;
    }

    @Override // X.InterfaceC25207BDf
    public final void DFi(Exception exc) {
        C9GR.A0A(this.A00.A0A, "photo_to_video_conversion_failed");
        C006802i.A0p.markerEnd(18948745, (short) 3);
    }

    @Override // X.InterfaceC25207BDf
    public final void DqC(String str) {
        C9GR.A08(this.A00.A0A, 2131976733, 0);
        C006802i.A0p.markerEnd(18948745, (short) 2);
    }

    @Override // X.InterfaceC25207BDf
    public final void onFinish() {
        C197208nr c197208nr;
        if (this.A01 && (c197208nr = this.A00.A0N.A02) != null) {
            c197208nr.A09 = true;
            C197268nx c197268nx = c197208nr.A0K;
            c197268nx.A04 = false;
            if (c197268nx.A03) {
                c197268nx.A02.A00(c197268nx.A01);
            }
        }
        ((Dialog) this.A00.A0l.getValue()).dismiss();
    }
}
