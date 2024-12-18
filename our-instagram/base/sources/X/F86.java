package X;

import androidx.fragment.app.Fragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes6.dex */
public abstract class F86 {
    public static final C189478aR A00(C3DN c3dn) {
        if (c3dn != null && (c3dn.A09() instanceof BottomSheetFragment)) {
            Fragment A09 = c3dn.A09();
            C14360o3.A0C(A09, AbstractC111324zv.A00(1142));
            C189478aR c189478aR = ((BottomSheetFragment) A09).A02;
            if (c189478aR != null) {
                return c189478aR;
            }
        }
        return null;
    }
}
