package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.stickersearch.AvatarStickerInteractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KM8 extends AbstractRunnableC14200nk {
    public final /* synthetic */ AvatarStickerInteractor A00;
    public final /* synthetic */ K8S A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM8(AvatarStickerInteractor avatarStickerInteractor, K8S k8s) {
        super(957285725, 3, false, false);
        this.A01 = k8s;
        this.A00 = avatarStickerInteractor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K8S k8s = this.A01;
        List list = k8s.A08;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ImageUrl imageUrl = AbstractC43592JPx.A0Y(it).A0H;
                C14360o3.A07(imageUrl);
                Long A00 = AbstractC47104Krz.A00(imageUrl);
                if (A00 != null) {
                    A1E.add(A00);
                }
            }
            Number number = (Number) AbstractC001800i.A06(A1E);
            if (number != null) {
                AvatarStickerInteractor avatarStickerInteractor = this.A00;
                long longValue = number.longValue();
                C150236pX c150236pX = avatarStickerInteractor.A03;
                String str = k8s.A07;
                if (str == null) {
                    str = "";
                }
                InterfaceC19610xo ARD = c150236pX.A01.A00.ARD();
                ARD.E7G(AnonymousClass001.A0R("KEY_AVATAR_CDN_EXPIRY", str), longValue);
                ARD.apply();
            }
        }
    }
}
