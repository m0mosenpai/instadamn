package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Oys, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56281Oys implements InterfaceC58114Ppd {
    public final /* synthetic */ NI5 A00;

    public C56281Oys(NI5 ni5) {
        this.A00 = ni5;
    }

    @Override // X.InterfaceC58114Ppd
    public final void Cpx(int i, int i2) {
        C51161Mj4 c51161Mj4 = this.A00.A0D;
        ArrayList A0U = AbstractC001800i.A0U(c51161Mj4.A02);
        A0U.add(i2, A0U.remove(i));
        c51161Mj4.A02 = A0U;
        c51161Mj4.notifyItemMoved(i, i2);
    }

    @Override // X.InterfaceC58114Ppd
    public final void DTw(int i, int i2) {
        C50868Mdz c50868Mdz = this.A00.A0K;
        if (i >= 0 && i2 >= 0 && i != i2) {
            int i3 = (i2 / 2) - 1;
            int i4 = (i / 2) - 1;
            C141796aw A00 = AbstractC141776au.A00(c50868Mdz);
            C57151PYd c57151PYd = new C57151PYd(c50868Mdz, (InterfaceC23621Ds) null, i4, i3, 1);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            AbstractC23641Du.A05(anonymousClass191, c57151PYd, A00);
            ClipsCreationViewModel clipsCreationViewModel = c50868Mdz.A0E;
            clipsCreationViewModel.A0S(i4, i3);
            AbstractC23641Du.A05(anonymousClass191, new C57151PYd(c50868Mdz, (InterfaceC23621Ds) null, i4, i3, 2), AbstractC141776au.A00(c50868Mdz));
            C84B A0N = MSY.A0N(clipsCreationViewModel);
            if (A0N != null) {
                c50868Mdz.A0K.A06(A0N.A01(i3));
            }
            AnonymousClass229.A01(c50868Mdz.A0C).A0q(i4, i3);
        }
        MSX.A1M(c50868Mdz.A0F, false);
    }

    @Override // X.InterfaceC58114Ppd
    public final void DTx(int i) {
        C50868Mdz c50868Mdz = this.A00.A0K;
        MSX.A1M(c50868Mdz.A0F, true);
        List list = c50868Mdz.A0M;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) instanceof C52424NHu) {
                Object obj = list.get(i2);
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsStackedTimelineVideoTrackItemModel.ReorderThumbnailItem");
                list.set(i2, new C52424NHu(((C52424NHu) obj).A00, AbstractC167007dF.A1P(i, i2), false));
            }
        }
        AbstractC25231BEo.A1H(c50868Mdz, AbstractC141776au.A00(c50868Mdz), 2);
    }
}
