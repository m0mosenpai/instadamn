package X;

import android.app.Activity;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.FQb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34690FQb {
    public final Handler A00;
    public final Fragment A01;
    public final AvatarStore A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final L68 A05;
    public final C163867Va A06;
    public final C28501Zl A07;
    public final C36302Fzx A08;
    public final WeakReference A09;
    public final WeakReference A0A;

    public /* synthetic */ C34690FQb(Fragment fragment, FragmentActivity fragmentActivity, RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C163867Va c163867Va) {
        C28501Zl c28501Zl = C28531Zo.A04.A02;
        C36302Fzx c36302Fzx = new C36302Fzx(userSession);
        L68 l68 = new L68(userSession);
        AvatarStore A00 = C20Y.A00(userSession);
        Handler A0J = AbstractC167007dF.A0J();
        C14360o3.A0B(interfaceC11380iw, 2);
        AbstractC167017dG.A1T(recyclerView, c28501Zl);
        C14360o3.A0B(A00, 10);
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A01 = fragment;
        this.A07 = c28501Zl;
        this.A08 = c36302Fzx;
        this.A06 = c163867Va;
        this.A05 = l68;
        this.A02 = A00;
        this.A00 = A0J;
        this.A09 = AbstractC25225BEi.A16(fragmentActivity);
        this.A0A = AbstractC25225BEi.A16(recyclerView);
    }

    public final void A00(boolean z) {
        C3DN A0r;
        Activity activity = (Activity) this.A09.get();
        if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null && A0r.A09() != null) {
            if (z) {
                ((C3DP) A0r).A0H = new GH6(this, 2);
            }
            A0r.A0B();
        } else {
            if (!z) {
                return;
            }
            this.A00.postDelayed(new GL4(this), 100L);
        }
    }
}
