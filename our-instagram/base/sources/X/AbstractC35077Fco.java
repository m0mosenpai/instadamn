package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.model.direct.threadkey.util.ThreadIdParcelable;

/* renamed from: X.Fco, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35077Fco {
    public static final void A02(Bundle bundle, InterfaceC83733oI interfaceC83733oI, String str) {
        C14360o3.A0B(interfaceC83733oI, 2);
        bundle.putParcelable(str, new ThreadIdParcelable(interfaceC83733oI));
    }

    public static void A01(Bundle bundle, Parcelable parcelable, InterfaceC83733oI interfaceC83733oI) {
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", parcelable);
        A02(bundle, interfaceC83733oI, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
    }

    public static final InterfaceC83733oI A00(Bundle bundle, String str) {
        ThreadIdParcelable threadIdParcelable = (ThreadIdParcelable) bundle.getParcelable(str);
        if (threadIdParcelable != null) {
            return threadIdParcelable.A00;
        }
        return null;
    }
}
