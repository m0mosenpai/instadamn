package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.NPi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52613NPi extends AbstractC51370MmV {
    public final Fragment A00;
    public final UserSession A01;
    public final IgLinearLayout A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52613NPi(View view, Fragment fragment, UserSession userSession, boolean z) {
        super(view);
        AbstractC167017dG.A1R(fragment, userSession);
        this.A00 = fragment;
        this.A01 = userSession;
        this.A03 = z;
        this.A02 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.mk_profiles_container);
    }
}
