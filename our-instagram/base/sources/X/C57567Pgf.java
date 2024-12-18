package X;

import com.facebook.rsys.videorender.gen.VideoRenderApi;

/* renamed from: X.Pgf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57567Pgf extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57567Pgf(int i, int i2, String str, int i3) {
        super(1);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                K3U k3u = (K3U) obj;
                C14360o3.A0B(k3u, 0);
                return C42221xC.A06(new C48456Lc9(k3u, this.A03, this.A02, this.A01));
            case 1:
                VideoRenderApi videoRenderApi = MSX.A0T(obj).A01.A0D.A00;
                C0J8.A03(videoRenderApi, "VideoRenderProxy setApi must be called");
                videoRenderApi.setDisplayResolution(this.A03, 1, this.A02, this.A01);
                return C0eB.A00;
            default:
                C51759Mti c51759Mti = (C51759Mti) obj;
                C14360o3.A0B(c51759Mti, 0);
                C54739OFq c54739OFq = (C54739OFq) c51759Mti.A00;
                String str = this.A03;
                C14360o3.A07(c54739OFq.A0A.startLiveSwapCopyId(str, this.A02, this.A01, "ig_rsys_live_swap", new C52002Myu(c54739OFq, new C50361MLn(str, 49))));
                return C0eB.A00;
        }
    }
}
