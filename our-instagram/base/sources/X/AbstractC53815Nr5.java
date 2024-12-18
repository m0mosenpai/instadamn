package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nr5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53815Nr5 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Fragment A02 = C6BQ.A02(c6fq);
        if (A02 != null && (A02 instanceof AbstractC59962oe)) {
            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) A02;
            C55752OpL c55752OpL = new C55752OpL(c6fq, AbstractC31175DnJ.A0I(c6fw, 0));
            C14360o3.A0B(abstractC59962oe, 0);
            C14360o3.A0B(A0W, 1);
            C54440O3u c54440O3u = new C54440O3u(c55752OpL);
            if (AbstractC53604NnB.A00 == null) {
                HandlerThread A0A = MSY.A0A("GPSLocationLibraryThread");
                A0A.start();
                Looper looper = A0A.getLooper();
                if (looper != null) {
                    FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                    AbstractC31171DnF.A1O(requireActivity);
                    AbstractC53604NnB.A00 = new HandlerC50756MbM(requireActivity, looper, abstractC59962oe, A0W);
                    Handler handler = AbstractC53604NnB.A00;
                    C14360o3.A0C(handler, "null cannot be cast to non-null type com.instagram.privacy.devicepermissionkit.location.InstagramGPSLibraryHelper.GPSLocationLibraryHandler");
                    handler.sendEmptyMessage(1);
                    AbstractC53604NnB.A02 = new C56401P2o(c54440O3u);
                    abstractC59962oe.registerLifecycleListener(new C56039OuB(abstractC59962oe, 1));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            Handler handler2 = AbstractC53604NnB.A00;
            C14360o3.A0C(handler2, "null cannot be cast to non-null type com.instagram.privacy.devicepermissionkit.location.InstagramGPSLibraryHelper.GPSLocationLibraryHandler");
            handler2.sendEmptyMessage(2);
        }
        return null;
    }
}
