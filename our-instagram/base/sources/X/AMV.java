package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AMV {
    public static final C8FC A00() {
        return new C8FC((C8D0) new C183748Cz(0.5f, 0.78f), (C8FD) null, (C89G) null, C05F.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 7, false, false, true, true, false, false, true, true, true, true, true, true, false, false);
    }

    public static final C8FC A01() {
        return new C8FC((C8D0) new C183748Cz(0.5f, 0.7f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 0.67f, -1.0f, -1.0f, -3, false, false, true, false, false, false, true, true, true, true, true, true, false, false);
    }

    public static final C8FC A03(C89F c89f) {
        return new C8FC((C8D0) new C183748Cz(0.5f, 0.7f), (C8FD) null, (C89G) c89f, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 0.67f, -1.0f, -1.0f, -3, false, false, true, false, false, false, true, true, true, true, true, true, false, false);
    }

    public static final C195868lW A05(Context context, Medium medium, UserSession userSession) {
        C14360o3.A0B(context, 0);
        AbstractC167007dF.A1D(medium, 1, userSession);
        try {
            return new CallableC209459Oe(context, medium, userSession, false).call();
        } catch (Exception e) {
            AbstractC12120kG.A07("CanvasReshareMediaUtil", AbstractC166997dE.A0z("Error importing video of file path %s", AbstractC166997dE.A1b(medium.A0X, 1)), e);
            String str = medium.A0X;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return new C195868lW(medium, options.outWidth, options.outHeight, medium.A07);
        }
    }

    public static final C8FC A02(Context context, TargetViewSizeProvider targetViewSizeProvider, C38321qM c38321qM) {
        C38321qM c38321qM2 = c38321qM;
        AbstractC167007dF.A1D(context, 0, targetViewSizeProvider);
        if (c38321qM2.A5M() && (c38321qM2 = c38321qM2.A1e(0)) == null) {
            throw AbstractC166997dE.A0g();
        }
        int A0z = c38321qM2.A0z();
        int A0y = c38321qM2.A0y();
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int A0A = AbstractC166987dD.A0A(AbstractC166987dD.A0A(interfaceC1812882f.getWidth(), 0.8f) / A0z, A0y);
        int height = interfaceC1812882f.getHeight() - context.getResources().getDimensionPixelSize(R.dimen.canvas_media_safe_padding);
        Integer num = C05F.A00;
        float f = 1.0f;
        if (height > 0 && A0A > 0) {
            float f2 = A0A / height;
            if (f2 > 1.0f) {
                f = 1.0f / f2;
            }
        }
        return new C8FC((C8D0) new C183748Cz(0.5f, 0.5f), (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, f, -1.0f, -1.0f, 0, false, false, true, false, false, false, false, true, true, true, true, true, false, false);
    }

    public static final C8FC A04(TargetViewSizeProvider targetViewSizeProvider) {
        C14360o3.A0B(targetViewSizeProvider, 0);
        float f = 0.5f;
        if (((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getHeight() >= 1080) {
            f = 0.6f;
        }
        return new C8FC((C8D0) new C183748Cz(0.5f, 0.7f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, f, -1.0f, -1.0f, 0, false, false, true, false, false, false, true, true, true, true, true, true, false, false);
    }
}
