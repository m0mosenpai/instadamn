package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ERW extends AbstractC65632xz {
    public final Context A00;
    public final ENO A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERW(Context context, ENO eno) {
        this.A00 = context;
        this.A01 = eno;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        TextView textView;
        ViewOnClickListenerC35682FpH viewOnClickListenerC35682FpH;
        String string;
        int A03 = C0f9.A03(1385827782);
        Context context = this.A00;
        FK2 fk2 = (FK2) AbstractC31172DnG.A0x(view);
        EDI edi = (EDI) obj;
        ENO eno = this.A01;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A13(fk2, edi, eno);
        Integer num = edi.A03;
        C14360o3.A07(num);
        String str2 = edi.A08;
        if (str2 == null) {
            str2 = "";
        }
        if (edi.A04 != null) {
            str = C23831Eq.A01(r0.longValue());
        } else {
            str = null;
        }
        boolean z = edi.A0F;
        int intValue = num.intValue();
        if (intValue != 4) {
            if (intValue == 2) {
                FDU.A00(context, fk2, str2);
                textView = fk2.A01;
                viewOnClickListenerC35682FpH = ViewOnClickListenerC35682FpH.A00(eno, 62);
            } else {
                throw AbstractC166987dD.A14("OB reference ID should not be visible for CTRL type");
            }
        } else {
            if (z && str != null) {
                AbstractC31177DnL.A0r(context, fk2.A01, str, 2131974997);
            } else {
                FDU.A00(context, fk2, str2);
            }
            textView = fk2.A01;
            viewOnClickListenerC35682FpH = null;
        }
        C0fQ.A00(viewOnClickListenerC35682FpH, textView);
        if (intValue != 4) {
            if (intValue == 2) {
                if (z) {
                    string = AbstractC166997dE.A0p(context, 2131974998);
                } else {
                    string = "";
                }
            } else {
                throw AbstractC166987dD.A14("OB reference ID should not be visible for CTRL type");
            }
        } else if (!z && str != null) {
            string = AbstractC167007dF.A0f(context, str, 2131974995);
        } else {
            string = context.getString(2131974996);
        }
        fk2.A00.setText(string);
        C0f9.A0A(872623791, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1197382314);
        View A0C = AbstractC25227BEk.A0C(AbstractC31172DnG.A09(this.A00), R.layout.support_inbox_ob_reference_id_row);
        C14360o3.A07(A0C);
        A0C.setTag(new FK2(A0C));
        C0f9.A0A(-2144400451, A03);
        return A0C;
    }
}
