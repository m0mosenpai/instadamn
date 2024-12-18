package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class LOP implements View.OnClickListener {
    public final /* synthetic */ C148176ln A00;

    public LOP(C148176ln c148176ln) {
        this.A00 = c148176ln;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentActivity activity;
        C41181vS AuU;
        int A05 = C0f9.A05(-568191725);
        C148176ln c148176ln = this.A00;
        C145356gu c145356gu = c148176ln.A0O;
        Context context = c148176ln.A0A;
        C14360o3.A07(context);
        WeakReference weakReference = c145356gu.A0H;
        Fragment fragment = (Fragment) weakReference.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            InterfaceC1118853a interfaceC1118853a = c145356gu.A0F;
            C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
            if (c41551w4 != null && (AuU = interfaceC1118853a.AuU()) != null) {
                c145356gu.A0B = true;
                Object obj = new Object();
                interfaceC1118853a.CMc();
                UserSession userSession = c145356gu.A01;
                if (userSession == null) {
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
                AvatarStore A00 = C20Y.A00(userSession);
                C48241LWq c48241LWq = new C48241LWq(c148176ln, A00.A01.A00, A00, AuU, c41551w4, c145356gu);
                Fragment fragment2 = (Fragment) weakReference.get();
                if (fragment2 != null) {
                    AbstractC166987dD.A1Z(new JRM(c145356gu, activity, context, obj, c48241LWq, null, 3, true), AbstractC25229BEm.A0a(fragment2));
                }
            }
        }
        C0f9.A0C(1636562770, A05);
    }
}
