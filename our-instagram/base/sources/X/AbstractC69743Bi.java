package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import java.util.HashSet;

/* renamed from: X.3Bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC69743Bi {
    public static final HashSet A04 = new HashSet();
    public final Context A00;
    public final C69753Bj A01;
    public final C69763Bk A02;
    public final UserSession A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3Bk] */
    public /* synthetic */ AbstractC69743Bi(Context context, UserSession userSession) {
        C69753Bj c69753Bj = new C69753Bj(userSession);
        ?? obj = new Object();
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = c69753Bj;
        this.A02 = obj;
    }

    public final XCH A00(C67846UzR c67846UzR, C38321qM c38321qM) {
        if (this instanceof C69733Bh) {
            C69733Bh c69733Bh = (C69733Bh) this;
            Fragment fragment = c69733Bh.A00;
            FragmentActivity requireActivity = fragment.requireActivity();
            boolean z = false;
            if (c67846UzR.A02 == VDL.A04) {
                z = true;
            }
            ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel = new ClipsCelebrationReshareViewModel(c67846UzR.A08, z);
            return new C23567AcL(requireActivity, fragment, c69733Bh.A01, c69733Bh.A02, clipsCelebrationReshareViewModel, c38321qM);
        }
        C69773Bl c69773Bl = (C69773Bl) this;
        Fragment fragment2 = c69773Bl.A00;
        FragmentActivity requireActivity2 = fragment2.requireActivity();
        boolean z2 = false;
        if (c67846UzR.A02 == VDL.A04) {
            z2 = true;
        }
        return new C35913FtX(requireActivity2, fragment2, c69773Bl.A01, new ClipsCelebrationReshareViewModel(c67846UzR.A08, z2), c38321qM);
    }

    public final boolean A01() {
        if (this instanceof C69733Bh) {
            return true;
        }
        return false;
    }
}
