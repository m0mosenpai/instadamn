package X;

import android.graphics.RectF;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class G8G implements InterfaceC199918sv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ C31446Drq A02;
    public final /* synthetic */ C31659DvP A03;
    public final /* synthetic */ InterfaceC37158GYv A04;
    public final /* synthetic */ AbstractC46972Dl A05;
    public final /* synthetic */ C2EC A06;
    public final /* synthetic */ DirectShareTarget A07;
    public final /* synthetic */ C3o9 A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public G8G(RectF rectF, C31446Drq c31446Drq, C31659DvP c31659DvP, InterfaceC37158GYv interfaceC37158GYv, AbstractC46972Dl abstractC46972Dl, C2EC c2ec, DirectShareTarget directShareTarget, C3o9 c3o9, int i, boolean z, boolean z2) {
        this.A03 = c31659DvP;
        this.A00 = i;
        this.A06 = c2ec;
        this.A08 = c3o9;
        this.A07 = directShareTarget;
        this.A0A = z;
        this.A01 = rectF;
        this.A02 = c31446Drq;
        this.A09 = z2;
        this.A05 = abstractC46972Dl;
        this.A04 = interfaceC37158GYv;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        C31659DvP c31659DvP = this.A03;
        int i = this.A00;
        C2EC c2ec = this.A06;
        C3o9 c3o9 = this.A08;
        DirectShareTarget directShareTarget = this.A07;
        boolean z = this.A0A;
        RectF rectF = this.A01;
        C31446Drq c31446Drq = this.A02;
        boolean z2 = this.A09;
        c31659DvP.A02(rectF, c31446Drq, this.A04, this.A05, c2ec, directShareTarget, c3o9, i, z, z2);
    }
}
