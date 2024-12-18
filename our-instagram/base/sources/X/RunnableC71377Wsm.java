package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wsm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71377Wsm implements Runnable {
    public final /* synthetic */ V0V A00;

    public RunnableC71377Wsm(V0V v0v) {
        this.A00 = v0v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        V0V v0v = this.A00;
        AbstractC44094JeJ abstractC44094JeJ = v0v.A0D;
        if (abstractC44094JeJ == null) {
            str = "tabbedFragmentController";
        } else {
            View A01 = abstractC44094JeJ.A01(v0v.A00);
            if (A01 != null && v0v.mView != null) {
                C5SU A0f = AbstractC167017dG.A0f(v0v.requireActivity(), AbstractC166997dE.A0N(v0v).getString(2131953305));
                A0f.A04(A01, 0, AbstractC167017dG.A0B(v0v.requireContext()), true);
                A0f.A01();
                A0f.A00().A07((UserSession) v0v.A0Z.getValue());
                C23031Ai c23031Ai = v0v.A06;
                if (c23031Ai == null) {
                    str = "userPreferences";
                } else {
                    AbstractC167017dG.A0g(c23031Ai.A01, "audio_global_search_tab_nux_count").apply();
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
