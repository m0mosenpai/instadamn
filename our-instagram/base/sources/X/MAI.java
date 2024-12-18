package X;

import androidx.paging.SingleRunner;
import com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl;
import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository;

/* loaded from: classes8.dex */
public final class MAI extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                return ((SingleRunner.Holder) A00(obj, this)).A01(this, null, 0);
            case 1:
                return ((AvatarStickerCacheImpl) A00(obj, this)).A03(null, null, null, this, 0);
            case 2:
                return ((WebPEncoderImpl) A00(obj, this)).A00(null, null, this, 0);
            case 3:
                return ((StickerTypeaheadImpl) A00(obj, this)).A01(this);
            case 4:
                return ((DirectCardGalleryRepository) A00(obj, this)).A06(null, null, null, this, null, 0);
            default:
                return ((EmuFlashRepository) A00(obj, this)).A00(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAI(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
    }

    public static Object A00(Object obj, MAI mai) {
        mai.A05 = obj;
        mai.A01 |= Integer.MIN_VALUE;
        return mai.A07;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MAI) && ((MAI) obj).A06 == i) {
            return true;
        }
        return false;
    }
}
