package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes5.dex */
public final class BOH {
    public View A00;
    public IgSimpleImageView A01;
    public final Context A02;
    public final InterfaceC56392iX A03;

    public final void A00(UserSession userSession, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        ViewGroup A01 = AbstractC124845kp.A01(this.A03.getView());
        View view = this.A00;
        if (view == null) {
            C14360o3.A0F("stickerContainerView");
            throw C00O.createAndThrow();
        }
        C138436Oz.A04(view, c84823qW, interfaceC41201vU.Ack(userSession), A01.getWidth(), A01.getHeight(), true);
    }

    public BOH(Context context, InterfaceC56392iX interfaceC56392iX) {
        this.A02 = context;
        this.A03 = interfaceC56392iX;
    }
}
