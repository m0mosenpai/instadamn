package X;

import com.instagram.business.fragment.SuggestBusinessFragment;
import java.util.List;

/* renamed from: X.Ftk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35926Ftk implements InterfaceC37146GYh {
    public final /* synthetic */ E0L A00;

    public C35926Ftk(E0L e0l) {
        this.A00 = e0l;
    }

    @Override // X.InterfaceC37146GYh
    public final void Dqb() {
        SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A00.A01;
        AbstractC31181DnP.A0t(suggestBusinessFragment);
        C67919V2j A00 = SuggestBusinessFragment.A00(suggestBusinessFragment);
        A00.A01.A00 = false;
        A00.notifyDataSetChanged();
    }

    @Override // X.InterfaceC37146GYh
    public final void Dqc(ECM ecm) {
        List list;
        SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A00.A01;
        SuggestBusinessFragment.A01(suggestBusinessFragment);
        List list2 = suggestBusinessFragment.A07;
        if (list2 != null && (list = ecm.A01) != null) {
            list2.addAll(list);
        }
        SuggestBusinessFragment.A02(suggestBusinessFragment);
        if (!suggestBusinessFragment.A03.A03) {
            C67919V2j A00 = SuggestBusinessFragment.A00(suggestBusinessFragment);
            A00.A01.A00 = false;
            A00.notifyDataSetChanged();
        }
    }
}
