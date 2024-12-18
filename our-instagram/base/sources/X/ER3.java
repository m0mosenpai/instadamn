package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ER3 extends AbstractC65632xz {
    public Context A00;
    public final EQ7 A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C32189ECk c32189ECk = (C32189ECk) obj;
        if (c32189ECk.A01.equals(EnumC33415Epm.A07.A01) && c32189ECk.A00 == null) {
            return;
        }
        anonymousClass306.A7a(0);
    }

    public ER3(Context context, EQ7 eq7) {
        this.A01 = eq7;
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        C111184zg c111184zg;
        int A03 = C0f9.A03(42254090);
        C32189ECk c32189ECk = (C32189ECk) obj;
        boolean A1W = AbstractC167007dF.A1W(c32189ECk.A00);
        FKA fka = (FKA) AbstractC31172DnG.A0x(view);
        Context context = this.A00;
        boolean A1a = AbstractC166987dD.A1a(obj2);
        EQ7 eq7 = this.A01;
        AbstractC167017dG.A1O(fka, context);
        C14360o3.A0B(eq7, 5);
        TextView textView = fka.A02;
        if (!C14360o3.A0K(c32189ECk.A01, EnumC33415Epm.A07.A01) || (c111184zg = c32189ECk.A00) == null || (str = c111184zg.A05) == null) {
            str = c32189ECk.A02;
            C14360o3.A07(str);
        }
        textView.setText(str);
        CheckBox checkBox = fka.A01;
        checkBox.setChecked(A1a);
        checkBox.setEnabled(A1W);
        View view2 = fka.A00;
        view2.setEnabled(A1W);
        if (A1W) {
            ViewOnClickListenerC35683FpI.A00(view2, 12, eq7, c32189ECk);
            ViewOnClickListenerC35683FpI.A00(checkBox, 13, eq7, c32189ECk);
        } else {
            AbstractC31177DnL.A0y(textView, context);
        }
        C0f9.A0A(1900094233, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1225710440);
        View A07 = AbstractC31175DnJ.A07(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.row_service_partner_type, false);
        A07.setTag(new FKA(A07));
        C0f9.A0A(1903304620, A03);
        return A07;
    }
}
