package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WTj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70381WTj implements InterfaceC71890X8x {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70381WTj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC71890X8x
    public final void DQz(LatLng latLng) {
        if (this.A00 != 0) {
            C68813VcU c68813VcU = (C68813VcU) this.A01;
            C132815z4 c132815z4 = (C132815z4) this.A02;
            V1R v1r = c68813VcU.A00;
            Hashtag hashtag = V1R.A01(v1r).A01;
            if (hashtag.getId() != null && hashtag.getName() != null) {
                FragmentActivity requireActivity = v1r.requireActivity();
                UserSession A00 = V1R.A00(v1r);
                String str = v1r.A0g;
                W6l.A01(null, requireActivity, A00, MapEntryPoint.A08, VEZ.A03, str, hashtag.getId(), hashtag.getName(), c132815z4.A01, null);
                return;
            }
            return;
        }
        ((C69680VtQ) this.A01).A00((C69727VuM) this.A02);
    }
}
