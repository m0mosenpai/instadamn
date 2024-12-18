package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;

/* renamed from: X.VfG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68978VfG {
    public InterfaceC71953XCf A00;
    public final ViewGroup A01;

    public C68978VfG(View view, UserSession userSession, LocationDetailFragment locationDetailFragment, MediaMapFragment mediaMapFragment, MediaMapFragment mediaMapFragment2, MediaMapPin mediaMapPin, boolean z) {
        InterfaceC71953XCf c70893Wjm;
        C14360o3.A0B(view, 4);
        ViewStub A0M = AbstractC167007dF.A0M(view, R.id.layout_location_detail_action_bar);
        A0M.setLayoutResource(z ? R.layout.layout_sheet_location_detail_action_bar : R.layout.layout_sheet_action_bar);
        View inflate = A0M.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.A01 = viewGroup;
        C14360o3.A0A(userSession);
        C14360o3.A0A(mediaMapPin);
        C14360o3.A0A(mediaMapFragment);
        if (z) {
            C14360o3.A0A(mediaMapFragment2);
            c70893Wjm = new C70894Wjn(viewGroup, userSession, locationDetailFragment, mediaMapFragment, mediaMapFragment2, mediaMapPin);
        } else {
            C14360o3.A0A(mediaMapFragment2);
            c70893Wjm = new C70893Wjm(viewGroup, userSession, locationDetailFragment, mediaMapFragment, mediaMapFragment2, mediaMapPin);
        }
        this.A00 = c70893Wjm;
    }
}
