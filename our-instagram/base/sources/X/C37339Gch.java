package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.Iterator;

/* renamed from: X.Gch, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37339Gch implements InterfaceC41501vz {
    public final /* synthetic */ C141956bE A00;

    public C37339Gch(C141956bE c141956bE) {
        this.A00 = c141956bE;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(73796702);
        C41131vM c41131vM = (C41131vM) obj;
        int A0N = AbstractC167017dG.A0N(c41131vM, 485772990);
        InterfaceC1118853a interfaceC1118853a = this.A00.A06;
        Reel reel = c41131vM.A00;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        if (reel.A0P == ReelType.A0W && reelViewerFragment.mViewPager != null) {
            Iterator it = ((C146226iL) reelViewerFragment.A1C).A0C.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C41551w4 c41551w4 = (C41551w4) it.next();
                String id = c41551w4.A0H.getId();
                C14360o3.A07(id);
                if (id.equals(reel.getId())) {
                    reelViewerFragment.A1C.Epc(reel, c41551w4);
                    reelViewerFragment.FAc(-1);
                    reelViewerFragment.A1C.notifyDataSetChanged();
                    break;
                }
            }
        }
        C0f9.A0A(1409234518, A0N);
        C0f9.A0A(538384394, A03);
    }
}
