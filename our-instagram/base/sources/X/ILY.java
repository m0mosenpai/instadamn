package X;

import android.os.Bundle;
import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.UnlockableStickerStatus;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class ILY {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C145176gc A01;

    public ILY(AbstractC59962oe abstractC59962oe, C145176gc c145176gc) {
        this.A00 = abstractC59962oe;
        this.A01 = c145176gc;
    }

    public final void A00(StoryUnlockableStickerData storyUnlockableStickerData) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC43591JPw.A00(486), storyUnlockableStickerData.getId());
        A0b.putSerializable(AbstractC43591JPw.A00(487), EnumC46137Kbb.A03);
        AbstractC59962oe abstractC59962oe = this.A00;
        C145176gc c145176gc = this.A01;
        InterfaceC1119353f interfaceC1119353f = c145176gc.A17;
        UserSession userSession = c145176gc.A09;
        if (userSession != null) {
            AbstractC47126KsL.A00(null, A0b, abstractC59962oe, userSession, interfaceC1119353f);
            String id = storyUnlockableStickerData.getId();
            if (id != null) {
                UserSession userSession2 = c145176gc.A09;
                if (userSession2 != null) {
                    Object obj = C70809WhP.A00(userSession2).A00.get(id);
                    if (obj == null) {
                        obj = UnlockableStickerStatus.A04;
                    }
                    UnlockableStickerStatus unlockableStickerStatus = UnlockableStickerStatus.A05;
                    if (obj != unlockableStickerStatus) {
                        UserSession userSession3 = c145176gc.A09;
                        if (userSession3 != null) {
                            C70809WhP.A00(userSession3).A00.put(id, unlockableStickerStatus);
                            UserSession userSession4 = c145176gc.A09;
                            if (userSession4 != null) {
                                C6C0.A01(new C37360Gd2(2), userSession4, id);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }
}
