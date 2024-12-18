package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.OjB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55400OjB implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3OO A01;
    public final /* synthetic */ C69523Am A02;

    public ViewOnClickListenerC55400OjB(C3OO c3oo, C69523Am c69523Am, int i) {
        this.A02 = c69523Am;
        this.A01 = c3oo;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1271307379);
        C69523Am c69523Am = this.A02;
        Reel reel = ((AbstractC69533An) c69523Am).A00;
        if (reel != null) {
            InterfaceC64002vL interfaceC64002vL = c69523Am.A0C;
            C3OO c3oo = this.A01;
            List list = ((AbstractC69533An) c69523Am).A03;
            interfaceC64002vL.E1q(c3oo, reel, c69523Am.A07, c69523Am.A09, ((C3G4) ((AbstractC69533An) c69523Am).A04.get(this.A00)).A04.A00, list);
        }
        C0f9.A0C(-916563654, A05);
    }
}
