package X;

import android.graphics.PointF;
import android.graphics.RectF;
import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;

/* renamed from: X.Crw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29069Crw implements InterfaceC31031DkU {
    public final /* synthetic */ C129975u2 A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C41551w4 A02;
    public final /* synthetic */ InterfaceC145446h3 A03;
    public final /* synthetic */ C6RZ A04;
    public final /* synthetic */ IgShowreelNativeProgressView A05;

    @Override // X.InterfaceC31031DkU
    public final /* synthetic */ void D3j(CUB cub) {
    }

    @Override // X.InterfaceC31031DkU
    public final /* synthetic */ void DQU(CUB cub) {
    }

    public C29069Crw(C129975u2 c129975u2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC145446h3 interfaceC145446h3, C6RZ c6rz, IgShowreelNativeProgressView igShowreelNativeProgressView) {
        this.A00 = c129975u2;
        this.A01 = c41181vS;
        this.A03 = interfaceC145446h3;
        this.A02 = c41551w4;
        this.A04 = c6rz;
        this.A05 = igShowreelNativeProgressView;
    }

    @Override // X.InterfaceC31031DkU
    public final void D3M(CUB cub) {
        C129975u2 c129975u2 = this.A00;
        if (c129975u2 != null) {
            C66190U3f c66190U3f = new C66190U3f(cub.A03, cub.A04);
            PointF pointF = cub.A00;
            RectF rectF = cub.A01;
            C41181vS c41181vS = this.A01;
            c129975u2.A00(pointF, rectF, cub.A02, new C29073Cs0(c41181vS, this.A02, this.A03, this.A04, this.A05), c66190U3f, c41181vS);
        }
    }
}
