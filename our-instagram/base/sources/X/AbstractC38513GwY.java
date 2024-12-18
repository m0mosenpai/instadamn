package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;

/* renamed from: X.GwY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38513GwY extends C3OO {
    public static void A00(Context context, Resources resources, ImageView imageView, int i) {
        imageView.setImageDrawable(new BOM(context, null, resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0, 0, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 1, false));
    }

    public void A02(Object obj) {
        if (this instanceof HMZ) {
            C37964Gn6 c37964Gn6 = (C37964Gn6) obj;
            C14360o3.A0B(c37964Gn6, 0);
            ((HMZ) this).A03(c37964Gn6.A00, c37964Gn6, C05F.A00, null, false, false);
            return;
        }
        if (this instanceof HMM) {
            C14360o3.A0B(null, 0);
            throw C00O.createAndThrow();
        }
        if (this instanceof HMO) {
            HMO hmo = (HMO) this;
            String A0Q = AbstractC167027dH.A0Q(obj);
            AbstractC31177DnL.A0r(AbstractC37301Gc2.A03(hmo), hmo.A00, A0Q, 2131973065);
            return;
        }
        if (this instanceof HMP) {
            HMP hmp = (HMP) this;
            String A0Q2 = AbstractC167027dH.A0Q(obj);
            hmp.A00.setText(A0Q2);
            C0fQ.A00(new ViewOnClickListenerC41920IiD(A0Q2, hmp, 1), hmp.itemView);
            return;
        }
        if (this instanceof HMU) {
            MusicSearchArtist musicSearchArtist = (MusicSearchArtist) obj;
            C14360o3.A0B(musicSearchArtist, 0);
            ((HMU) this).A03(musicSearchArtist, -1);
            return;
        }
        if (this instanceof C39172HMa) {
            InterfaceC43451JHp interfaceC43451JHp = (InterfaceC43451JHp) obj;
            C14360o3.A0B(interfaceC43451JHp, 0);
            ((C39172HMa) this).A03(null, interfaceC43451JHp, 0, false);
            return;
        }
        if (this instanceof HMY) {
            ((HMY) this).A03((C38635Gyc) obj);
            return;
        }
        if (this instanceof HMX) {
            HMX hmx = (HMX) this;
            InterfaceC43451JHp interfaceC43451JHp2 = (InterfaceC43451JHp) obj;
            C14360o3.A0B(interfaceC43451JHp2, 0);
            String title = interfaceC43451JHp2.getTitle();
            hmx.A01.setText(title);
            HJA hja = null;
            hmx.A03.A01(null, null, interfaceC43451JHp2.getId(), title, interfaceC43451JHp2.Bfr(), 0);
            if (C14360o3.A0K(interfaceC43451JHp2.getId(), "PLAYLIST_ID.IN_THIS_REEL")) {
                hmx.A02.setVisibility(8);
            } else {
                hmx.A02.setVisibility(0);
                hja = new HJA(2, interfaceC43451JHp2, hmx);
            }
            hmx.A00 = hja;
            return;
        }
        if (this instanceof HMS) {
            ((HMS) this).A03((MusicSearchPlaylist) obj);
            return;
        }
        if (this instanceof HMW) {
            MusicSearchPlaylist musicSearchPlaylist = (MusicSearchPlaylist) obj;
            C14360o3.A0B(musicSearchPlaylist, 0);
            ((HMW) this).A03(musicSearchPlaylist, false);
            return;
        }
        if (this instanceof HMT) {
            ((HMT) this).A03((MusicSearchPlaylist) obj);
            return;
        }
        if (this instanceof HMR) {
            ((HMR) this).A03((C38061Goo) obj);
            return;
        }
        if (this instanceof HMN) {
            InterfaceC62602sz interfaceC62602sz = (InterfaceC62602sz) obj;
            C14360o3.A0B(interfaceC62602sz, 0);
            ((HMN) this).A00.A04(interfaceC62602sz, null);
        } else if (this instanceof HMQ) {
            ((HMQ) this).A03((C38061Goo) obj);
        } else {
            ((HMV) this).A03((C39685HjH) obj);
        }
    }
}
