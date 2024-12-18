package X;

import android.app.Activity;
import android.graphics.RectF;
import android.widget.ListView;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class NSC extends NSD {
    public final /* synthetic */ ArchiveReelFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSC(Activity activity, ListView listView, ArchiveReelFragment archiveReelFragment, InterfaceC69543Ao interfaceC69543Ao, InterfaceC63982vJ interfaceC63982vJ) {
        super(activity, listView, interfaceC69543Ao, interfaceC63982vJ);
        this.A00 = archiveReelFragment;
    }

    @Override // X.NSD, X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        Ow3 ow3 = this.A00.A01;
        if (ow3.A00) {
            RectF rectF = (RectF) ow3.A02.get(c41181vS.A0j);
            if (rectF != null) {
                return C6PN.A03(rectF);
            }
            return C6PN.A02();
        }
        return super.A07(reel, c41181vS);
    }

    @Override // X.NSD, X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        super.A0A(reel, c41181vS);
        this.A00.A01.A01(c41181vS.A0j, C05F.A01);
    }

    @Override // X.NSD, X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
        super.A0B(reel, c41181vS);
        if (c41181vS.A12()) {
            this.A00.A01.A02(c41181vS.A0j, C05F.A01);
        }
    }
}
