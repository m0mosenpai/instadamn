package X;

import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55153OdH {
    public static final void A04(Context context, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, int i, int i2) {
        C8KO c8ko = new C8KO(context, userSession, new C189848b3(), 0);
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null) {
            c8ko.A04(musicAssetModel, new C56484P5y(audioOverlayTrack, 0), str, i, i2, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final int A00(ACRType aCRType, String str, int i) {
        if (aCRType == null) {
            if (str != null) {
                if (!AbstractC002300n.A0h(str, "highlight:", false)) {
                    if (!AbstractC002300n.A0h(str, "smartReel:", false)) {
                        if (AbstractC002300n.A0h(str, "carousel:", false)) {
                            return 40;
                        }
                        return i;
                    }
                    return 30;
                }
            } else {
                return i;
            }
        } else {
            switch (aCRType.ordinal()) {
                case -1:
                case 0:
                case 6:
                    return i;
                case 1:
                    return 52;
                case 2:
                    return 51;
                case 3:
                    return 40;
                case 4:
                    break;
                case 5:
                    return 30;
                default:
                    throw B4Z.A00();
            }
        }
        return 29;
    }

    public static final Integer A01(List list) {
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OLX olx = (OLX) it.next();
                AbstractC166997dE.A1W(A0q, olx.A00 - olx.A01);
            }
            return Integer.valueOf(AbstractC001800i.A02(A0q));
        }
        return null;
    }

    public static final String A02(String str, String str2) {
        StringBuilder A1C;
        String str3;
        if (AbstractC002300n.A0h(str, "highlight_reel:", false)) {
            A1C = AbstractC166987dD.A1C();
            str3 = "highlight:";
        } else {
            if (!AbstractC002300n.A0h(str, "smart_reel:", false)) {
                return str;
            }
            A1C = AbstractC166987dD.A1C();
            str3 = "smartReel:";
        }
        return MSZ.A0u(str3, str2, A1C);
    }

    public static final ArrayList A03(C51797Mv1 c51797Mv1) {
        List<InterfaceC43512JJy> list;
        if (c51797Mv1 != null && (list = c51797Mv1.A02) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (InterfaceC43512JJy interfaceC43512JJy : list) {
                A0q.add(new OLX(interfaceC43512JJy.Bzp(), interfaceC43512JJy.B28()));
            }
            return AbstractC001800i.A0U(A0q);
        }
        return null;
    }
}
