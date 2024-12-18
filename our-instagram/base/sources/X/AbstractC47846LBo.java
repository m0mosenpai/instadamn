package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import java.util.List;

/* renamed from: X.LBo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47846LBo {
    public static final C45203Jzj A00(C45104JxY c45104JxY, DirectStoreSticker directStoreSticker, Integer num, boolean z) {
        C14360o3.A0B(directStoreSticker, 1);
        if (AbstractC43592JPx.A0w(directStoreSticker.A00.A00).length() == 0) {
            return null;
        }
        return new C45203Jzj(new C51751Mta(Boolean.valueOf(z), num, 4, c45104JxY.A01()), directStoreSticker);
    }

    public static final C09530e4 A01(InterfaceC66482zP interfaceC66482zP, InterfaceC66482zP interfaceC66482zP2, C45104JxY c45104JxY, List list, int i) {
        C09530e4 A1L;
        if (i != -1 && list.size() > i) {
            A1L = AbstractC166987dD.A1L(interfaceC66482zP2, AbstractC001800i.A0d(list, i));
        } else {
            A1L = AbstractC166987dD.A1L(interfaceC66482zP, list);
        }
        if (c45104JxY.A01()) {
            return AbstractC166987dD.A1L(null, A1L.A01);
        }
        return A1L;
    }
}
