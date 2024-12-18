package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class KJX extends AbstractC66422zJ {
    public final Activity A00;
    public final Object A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        List list;
        FragmentActivity fragmentActivity;
        AbstractC10360h2 supportFragmentManager;
        AnonymousClass764 anonymousClass764 = (AnonymousClass764) interfaceC66482zP;
        C14360o3.A0B(anonymousClass764, 0);
        Activity activity = this.A00;
        if (AbstractC72723Nt.A00(activity)) {
            list = AbstractC47196KtV.A00;
        } else {
            list = AbstractC47196KtV.A01;
        }
        String str = anonymousClass764.A00;
        KBL kbl = new KBL();
        kbl.A05 = list;
        kbl.A04 = str;
        if ((activity instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) activity) != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            AbstractC43593JPy.A1D(kbl, new C14240no(supportFragmentManager));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AnonymousClass764.class;
    }

    public KJX(Activity activity, Object obj) {
        this.A01 = obj;
        this.A00 = activity;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44776Jrx(AbstractC31176DnK.A0A(layoutInflater, viewGroup, R.layout.direct_thread_null_state_container));
    }
}
