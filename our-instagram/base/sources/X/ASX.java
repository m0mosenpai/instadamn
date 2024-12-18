package X;

import android.view.View;
import com.instagram.model.reels.Reel;

/* loaded from: classes4.dex */
public final class ASX implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC75453aC A01;
    public final /* synthetic */ C77903eI A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ C23031Ai A04;
    public final /* synthetic */ C3Ow A05;

    public ASX(InterfaceC75453aC interfaceC75453aC, C77903eI c77903eI, Reel reel, C23031Ai c23031Ai, C3Ow c3Ow, int i) {
        this.A04 = c23031Ai;
        this.A00 = i;
        this.A01 = interfaceC75453aC;
        this.A03 = reel;
        this.A02 = c77903eI;
        this.A05 = c3Ow;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(189956313);
        this.A04.A0c(this.A00 + 1);
        InterfaceC75453aC interfaceC75453aC = this.A01;
        Reel reel = this.A03;
        C77903eI c77903eI = this.A02;
        interfaceC75453aC.D4L(c77903eI.A00, c77903eI.A02, reel, this.A05);
        C0f9.A0C(-633194265, A05);
    }
}
