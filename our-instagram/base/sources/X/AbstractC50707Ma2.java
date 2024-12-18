package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.List;

/* renamed from: X.Ma2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC50707Ma2 {
    public static boolean A00(C47Z c47z) {
        return AbstractC167007dF.A1W(AbstractC50710Ma7.A00.A02(c47z.A4b));
    }

    public static boolean A01(C47Z c47z) {
        boolean z;
        List list;
        String str = c47z.A2k;
        if (str != null) {
            z = MSY.A1Z(str);
        } else {
            z = false;
        }
        if (!z && ((list = c47z.A4a) == null || list.size() <= 0)) {
            return false;
        }
        return true;
    }

    public static boolean A02(C47Z c47z) {
        if (c47z.A1N != ClipInfo.A0Q.getValue() && c47z.A1N.A0H) {
            return true;
        }
        return false;
    }

    public static boolean A03(C47Z c47z) {
        MusicOverlayStickerModel A02 = AbstractC50710Ma7.A00.A02(c47z.A4b);
        if (A02 != null) {
            MusicProduct musicProduct = A02.A02;
            if (musicProduct != null && musicProduct != MusicProduct.A06 && !AbstractC65993Txo.A01(musicProduct)) {
                return true;
            }
            if (c47z.A0D() != ShareType.A08 && c47z.A5j) {
                return true;
            }
            return false;
        }
        return false;
    }
}
