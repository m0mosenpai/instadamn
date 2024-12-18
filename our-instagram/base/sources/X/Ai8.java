package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;

/* loaded from: classes4.dex */
public final class Ai8 implements C8DK {
    public View A00;
    public View A01;
    public final Context A02;
    public final View A03;
    public final ViewStub A04;
    public final UserSession A05;
    public final OpenCarouselCaptureConfig A06;
    public final C22877A6x A07;

    @Override // X.C8DK
    public final void Ede(boolean z) {
        View[] viewArr = {this.A03};
        if (z) {
            AbstractC125325le.A04(null, viewArr, true);
        } else {
            AbstractC125325le.A05(viewArr, true);
        }
    }

    @Override // X.C8DK
    public final void EQs(boolean z) {
        View[] viewArr = new View[1];
        View view = this.A00;
        if (z) {
            if (view != null) {
                viewArr[0] = view;
                AbstractC125325le.A04(null, viewArr, true);
                return;
            }
        } else if (view != null) {
            viewArr[0] = view;
            AbstractC125325le.A05(viewArr, true);
            return;
        }
        C14360o3.A0F("cameraHeader");
        throw C00O.createAndThrow();
    }

    public Ai8(Context context, View view, ViewStub viewStub, UserSession userSession, OpenCarouselCaptureConfig openCarouselCaptureConfig, C22877A6x c22877A6x) {
        String str;
        AbstractC167027dH.A13(viewStub, view, openCarouselCaptureConfig);
        AbstractC167017dG.A1T(userSession, context);
        this.A04 = viewStub;
        this.A03 = view;
        this.A06 = openCarouselCaptureConfig;
        this.A07 = c22877A6x;
        this.A05 = userSession;
        this.A02 = context;
        String str2 = openCarouselCaptureConfig.A02;
        if (str2 != null) {
            View inflate = viewStub.inflate();
            this.A00 = inflate;
            str = "cameraHeader";
            if (inflate != null) {
                AbstractC167007dF.A0N(inflate, R.id.header_title).setText(AbstractC166997dE.A0r(inflate.getResources(), str2, 2131969127));
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        View requireViewById = this.A03.requireViewById(R.id.open_carousel_send_button);
        this.A01 = requireViewById;
        if (requireViewById == null) {
            str = "sendButton";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        ViewOnClickListenerC23249ASk.A00(requireViewById, 47, this);
    }
}
