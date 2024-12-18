package X;

import com.instagram.mainfeed.afi.ui.AfiSecondaryLinkButton;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;

/* renamed from: X.J5j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43146J5j implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42659IuG A01;
    public final /* synthetic */ IKH A02;
    public final /* synthetic */ AfiSecondaryLinkButton A03;

    public RunnableC43146J5j(C42659IuG c42659IuG, IKH ikh, AfiSecondaryLinkButton afiSecondaryLinkButton, int i) {
        this.A02 = ikh;
        this.A00 = i;
        this.A03 = afiSecondaryLinkButton;
        this.A01 = c42659IuG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HorizontalFlowLayout horizontalFlowLayout = this.A02.A07;
        horizontalFlowLayout.A00 = this.A00;
        int[] A00 = HorizontalFlowLayout.A00(horizontalFlowLayout, horizontalFlowLayout.getWidth(), false);
        AbstractC125325le A01 = AbstractC125325le.A01(horizontalFlowLayout, 0);
        A01.A0G();
        AbstractC125325le A0F = A01.A0F(true);
        A0F.A0N(horizontalFlowLayout.getHeight(), A00[1]);
        A0F.A0H();
        this.A03.setVisibility(8);
        this.A01.A01 = C05F.A01;
    }
}
