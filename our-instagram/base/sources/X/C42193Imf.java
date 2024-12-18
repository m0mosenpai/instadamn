package X;

import android.content.Context;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.Imf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42193Imf implements InterfaceC116905Qw {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ C42775IwD A02;
    public final /* synthetic */ INH A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C14360o3.A0B(c37818GkY, 0);
        InterfaceC88553xD A01 = ((C38959HDl) c37818GkY.A01).A01();
        if (A01 != null) {
            MusicAttributionConfig Cq1 = A01.Cq1(this.A00);
            INH inh = this.A03;
            String str = this.A04;
            inh.A0G = str;
            inh.A08 = Cq1;
            if (this.A06) {
                EnumC185548Kw A00 = AbstractC41770Iem.A00(this.A02.A01, str, this.A05);
                EnumC185548Kw enumC185548Kw = EnumC185548Kw.A02;
                if (A00 == enumC185548Kw) {
                    C14360o3.A0B(enumC185548Kw, 0);
                    inh.A01 = enumC185548Kw;
                }
            }
        }
        C42775IwD.A00(this.A01, this.A02, this.A03);
    }

    public C42193Imf(Context context, C22P c22p, C42775IwD c42775IwD, INH inh, String str, String str2, boolean z) {
        this.A00 = context;
        this.A03 = inh;
        this.A04 = str;
        this.A06 = z;
        this.A02 = c42775IwD;
        this.A05 = str2;
        this.A01 = c22p;
    }

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        C42775IwD.A00(this.A01, this.A02, this.A03);
    }
}
