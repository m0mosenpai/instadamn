package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes6.dex */
public abstract class FAQ {
    public static final void A00(Fragment fragment, UserSession userSession) {
        int i;
        Bundle A0E = AbstractC31174DnI.A0E(userSession, 1);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A4h;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 521)) {
            A0E.putInt("quick_snap_viewer_request_code_key", 13377);
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            AbstractC167007dF.A1L(A002, A002.A4h, c0yrArr, 521, true);
            i = 2943;
        } else {
            i = 509;
        }
        AbstractC31173DnH.A0Z(fragment.requireActivity(), A0E, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(i)).A0D(fragment, 13377);
    }
}
