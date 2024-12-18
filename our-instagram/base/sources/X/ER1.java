package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ER1 extends AbstractC65632xz {
    public final FragmentActivity A00;
    public final ELI A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ER1(FragmentActivity fragmentActivity, ELI eli) {
        this.A00 = fragmentActivity;
        this.A01 = eli;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1563886060);
        FragmentActivity fragmentActivity = this.A00;
        if (view != null && fragmentActivity != null && !fragmentActivity.isFinishing()) {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.account_missing_prompt_textview);
            A0N.setVisibility(0);
            AbstractC166987dD.A1P(fragmentActivity, A0N, 2131952085);
            A0N.setTypeface(A0N.getTypeface(), 1);
            Fp1.A00(A0N, 1, this);
        }
        C0f9.A0A(1623177106, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 672236167);
        View A07 = AbstractC31175DnJ.A07(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_login_more_account, false);
        C0f9.A0A(1677857068, A0G);
        return A07;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
