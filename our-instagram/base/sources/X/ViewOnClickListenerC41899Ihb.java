package X;

import android.content.Context;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Ihb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41899Ihb implements View.OnClickListener {
    public final /* synthetic */ C60662pp A00;

    public ViewOnClickListenerC41899Ihb(C60662pp c60662pp) {
        this.A00 = c60662pp;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-802002238);
        C81063jb c81063jb = this.A00.A0A;
        if (c81063jb != null) {
            C81063jb.A00(c81063jb, C05F.A01, "unknown");
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c81063jb.A0I);
            Context context = c81063jb.A0H;
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            HashMap A1G3 = AbstractC166987dD.A1G();
            new BitSet(0);
            C66277U6x A02 = C66277U6x.A02(AbstractC111324zv.A00(810), AbstractC191768eY.A01(A1G), A1G2);
            AbstractC31178DnM.A1M(A02, -1);
            A02.A03 = null;
            A02.A02 = null;
            A02.A04 = null;
            A02.A08(A1G3);
            A02.A05(context, A0C);
            c81063jb.A0J.A00();
        }
        C0f9.A0C(1088108755, A05);
    }
}
