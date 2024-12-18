package X;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class G60 implements GZ1 {
    public final /* synthetic */ C35010Fbh A00;
    public final /* synthetic */ C35003Fba A01;

    @Override // X.GZ1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        EQN eqn = this.A00.A06.A04;
        if (eqn != null) {
            eqn.A02.A01 = true;
            eqn.notifyDataSetChanged();
        }
    }

    public G60(C35010Fbh c35010Fbh, C35003Fba c35003Fba) {
        this.A00 = c35010Fbh;
        this.A01 = c35003Fba;
    }

    @Override // X.GZ1
    public final void onSuccess() {
        C35010Fbh c35010Fbh = this.A00;
        ENA ena = c35010Fbh.A06;
        EQN eqn = ena.A04;
        if (eqn != null) {
            eqn.A02.A01 = false;
            eqn.notifyDataSetChanged();
        }
        java.util.Set set = c35010Fbh.A07;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.A01.A00(AbstractC25226BEj.A15(it));
        }
        set.clear();
        C35010Fbh.A00(c35010Fbh);
        ena.A02();
    }
}
