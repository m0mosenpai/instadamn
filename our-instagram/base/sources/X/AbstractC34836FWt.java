package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;
import java.util.Collections;

/* renamed from: X.FWt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34836FWt {
    public static void A01(Activity activity, Fragment fragment, UserSession userSession, C38321qM c38321qM, String str, String str2, boolean z) {
        MusicOverlayStickerModel A03 = AbstractC101614hW.A03(null, c38321qM, null);
        GF7 gf7 = new GF7(activity, fragment, userSession, c38321qM, str, str2, z);
        boolean z2 = true;
        if (A03 != null) {
            if (A03.A0t) {
                z2 = false;
            }
            boolean A1M = AbstractC167007dF.A1M(Boolean.TRUE.equals(A03.A0E) ? 1 : 0);
            if (!z2) {
                F9E.A00(activity, new DialogInterfaceOnClickListenerC35312Fhn(gf7), A1M);
                return;
            }
        }
        gf7.DlA(Collections.singletonList(AbstractC166997dE.A0b()));
    }

    public static void A00(Activity activity, Fragment fragment, UserSession userSession, C38321qM c38321qM, File file, String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(1754), str);
        A0b.putString(AbstractC111324zv.A00(1756), c38321qM.getId());
        A0b.putString(AbstractC111324zv.A00(1755), file.getAbsolutePath());
        A0b.putString(AbstractC111324zv.A00(1753), str2);
        Bundle requireArguments = fragment.requireArguments();
        String string = requireArguments.getString("follower_id");
        String A00 = AbstractC111324zv.A00(2396);
        String string2 = requireArguments.getString(A00);
        A0b.putString("follower_id", string);
        A0b.putString(A00, string2);
        AbstractC63248Sg4.A01(fragment.mFragmentManager);
        if (fragment.getContext() != null && !fragment.mDetached && !fragment.mRemoving) {
            C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5176)).A0D(fragment, 401);
        }
    }
}
