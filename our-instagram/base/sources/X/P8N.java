package X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P8N implements InterfaceC114885Gz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public P8N(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    @Override // X.InterfaceC114885Gz
    public final void onFinish() {
        if (this.A00 != 0) {
            List list = (List) this.A02;
            java.util.Set set = ((C51039Mgp) this.A03).A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                set.remove(it.next());
            }
            C19L c19l = (C19L) this.A01;
            AbstractC166987dD.A1Z(new MBq(c19l, null, 8), c19l);
            return;
        }
        C55173Odc c55173Odc = (C55173Odc) this.A03;
        AbstractC63248Sg4.A01(c55173Odc.A03.getParentFragmentManager());
        Reel reel = (Reel) this.A02;
        if (reel.A0O(c55173Odc.A05).isEmpty()) {
            Context context = c55173Odc.A02;
            C9GR.A03(context, context.getString(2131976159), "ReelMediaPreloader_unknown_error_occured", 0);
        } else {
            C55173Odc.A02(((C54379O1l) this.A01).A00, reel);
        }
    }
}
