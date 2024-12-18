package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ihx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41904Ihx implements View.OnClickListener {
    public final /* synthetic */ C3Py A00;
    public final /* synthetic */ C685736u A01;

    public ViewOnClickListenerC41904Ihx(C3Py c3Py, C685736u c685736u) {
        this.A01 = c685736u;
        this.A00 = c3Py;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1561322555);
        C685736u c685736u = this.A01;
        C3Py c3Py = this.A00;
        Context requireContext = c685736u.A0O.requireContext();
        UserSession userSession = c685736u.A0J;
        InterfaceC60442pS interfaceC60442pS = c685736u.A0K;
        String obj = c3Py.B5n().toString();
        H3G h3g = (H3G) c3Py.A00;
        AbstractC35190Ffi.A02(requireContext, interfaceC60442pS, userSession, obj, h3g.A0B, h3g.A08, c3Py.getId(), c3Py.CAR(), true);
        C0f9.A0C(263120300, A05);
    }
}
