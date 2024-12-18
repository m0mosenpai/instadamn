package X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes9.dex */
public final class P6q implements InterfaceC57972PnI {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C52167N6w A02;

    public P6q(Context context, Reel reel, C52167N6w c52167N6w) {
        this.A02 = c52167N6w;
        this.A01 = reel;
        this.A00 = context;
    }

    @Override // X.InterfaceC57972PnI
    public final void DqF(List list) {
        C32061E6n c32061E6n;
        if (list != null && (c32061E6n = (C32061E6n) AbstractC001800i.A0J(list)) != null) {
            C52167N6w c52167N6w = this.A02;
            Reel reel = this.A01;
            Context context = this.A00;
            Reel A0F = C1OU.A04(AbstractC166987dD.A0r(c52167N6w.A0C)).A0F(c32061E6n);
            if (A0F != null) {
                reel = A0F;
            }
            C52167N6w.A00(reel, c52167N6w, c32061E6n.A01, true);
            C9GR.A07(context, 2131963587);
        }
    }
}
