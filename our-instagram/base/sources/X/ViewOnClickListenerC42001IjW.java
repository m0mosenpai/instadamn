package X;

import android.view.View;
import com.instagram.model.reels.Reel;

/* renamed from: X.IjW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42001IjW implements View.OnClickListener {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C41551w4 A02;
    public final /* synthetic */ C3G2 A03;
    public final /* synthetic */ InterfaceC144586fe A04;
    public final /* synthetic */ boolean A05;

    public ViewOnClickListenerC42001IjW(Reel reel, C41181vS c41181vS, C41551w4 c41551w4, C3G2 c3g2, InterfaceC144586fe interfaceC144586fe, boolean z) {
        this.A05 = z;
        this.A04 = interfaceC144586fe;
        this.A02 = c41551w4;
        this.A00 = reel;
        this.A01 = c41181vS;
        this.A03 = c3g2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1381083837);
        if (!this.A05) {
            this.A04.DeH(this.A00, this.A01, this.A02, AbstractC25229BEm.A1a(this.A03, C3G2.A1W));
        }
        C0f9.A0C(-582164336, A05);
    }
}
