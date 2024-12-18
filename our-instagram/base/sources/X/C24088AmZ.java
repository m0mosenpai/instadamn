package X;

import android.widget.ImageView;

/* renamed from: X.AmZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24088AmZ implements InterfaceC125355lh {
    public final int A00;
    public final Object A01;

    public C24088AmZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        switch (this.A00) {
            case 0:
                C24150AnZ c24150AnZ = (C24150AnZ) this.A01;
                InterfaceC09390do interfaceC09390do = c24150AnZ.A0B;
                AbstractC167007dF.A0L(interfaceC09390do).setVisibility(8);
                ((ImageView) AbstractC166987dD.A17(interfaceC09390do)).setImageDrawable(null);
                c24150AnZ.A00 = null;
                return;
            case 1:
                C24150AnZ c24150AnZ2 = (C24150AnZ) this.A01;
                AbstractC167007dF.A0L(c24150AnZ2.A0C).setVisibility(8);
                AbstractC167017dG.A1W(c24150AnZ2.A0E, 8);
                AbstractC167017dG.A1W(c24150AnZ2.A09, 8);
                return;
            case 2:
                AbstractC166987dD.A1Y(this.A01);
                return;
            default:
                C42793IwV c42793IwV = ((C38928HCb) this.A01).A07;
                if (c42793IwV == null) {
                    C14360o3.A0F("trackCoverReelHolder");
                    throw C00O.createAndThrow();
                }
                c42793IwV.A02.A05();
                return;
        }
    }
}
