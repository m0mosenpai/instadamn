package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.StickerPackResponseItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LgJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48689LgJ implements InterfaceC50514MRr {
    public final StickerPackResponseItem A00;
    public final List A01;

    @Override // X.InterfaceC50514MRr
    public final C09530e4 Brh(C45104JxY c45104JxY) {
        C14360o3.A0B(c45104JxY, 0);
        List list = this.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C45203Jzj A00 = AbstractC47846LBo.A00(c45104JxY, (DirectStoreSticker) it.next(), C05F.A0j, false);
            if (A00 != null) {
                A1E.add(A00);
            }
        }
        return AbstractC166987dD.A1L(new C45185JzR(this.A00.A03), A1E);
    }

    @Override // X.InterfaceC50514MRr
    public final boolean Ei7(C45104JxY c45104JxY) {
        C14360o3.A0B(c45104JxY, 0);
        if ((!this.A01.isEmpty()) && AbstractC167007dF.A1X(c45104JxY.A00, C05F.A00)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50514MRr
    public final C51753Mtc BEM(int i) {
        StickerPackResponseItem stickerPackResponseItem = this.A00;
        String str = stickerPackResponseItem.A00;
        if (str == null || stickerPackResponseItem.A01 == null) {
            return null;
        }
        return new C51753Mtc(new KQA(new MUW(C05F.A01, (Integer) null, "sticker", stickerPackResponseItem.A02, 8), stickerPackResponseItem.A03, str), i, 9);
    }

    public C48689LgJ(StickerPackResponseItem stickerPackResponseItem, List list) {
        AbstractC167017dG.A1P(stickerPackResponseItem, list);
        this.A00 = stickerPackResponseItem;
        this.A01 = list;
    }
}
