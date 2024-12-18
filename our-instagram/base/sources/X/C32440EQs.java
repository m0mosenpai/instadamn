package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EQs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32440EQs extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32440EQs(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1632894223);
        C31981E3j c31981E3j = (C31981E3j) AbstractC31172DnG.A0x(view);
        C36731GHa c36731GHa = (C36731GHa) obj;
        AbstractC167017dG.A1N(c31981E3j, c36731GHa);
        FC1.A00((C34957Fah) obj2, c31981E3j, null, c36731GHa);
        C0f9.A0A(1152304681, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1016398208);
        Context context = this.A00;
        AbstractC167007dF.A1K(context, viewGroup);
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_switch_item, false);
        C31981E3j c31981E3j = new C31981E3j(A0C);
        A0C.setTag(c31981E3j);
        F89.A00(A0C, c31981E3j.A06);
        C0f9.A0A(-1261371611, A03);
        return A0C;
    }
}
