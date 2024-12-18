package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.textview.UpdatableButton;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class E00 extends C2UU {
    public String A00;
    public ArrayList A01;
    public java.util.Set A02;
    public final UserSession A03;
    public final C65092x7 A04;
    public final Context A05;

    public E00(Context context, UserSession userSession, C65092x7 c65092x7) {
        C14360o3.A0B(context, 2);
        this.A03 = userSession;
        this.A05 = context;
        this.A04 = c65092x7;
        this.A00 = "";
        this.A02 = C16910sj.A00;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        ArrayList arrayList;
        InterfaceC37253Gb6 interfaceC37253Gb6;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof E3Z) && (arrayList = this.A01) != null && (interfaceC37253Gb6 = (InterfaceC37253Gb6) arrayList.get(i)) != null) {
            E3Z e3z = (E3Z) c3oo;
            E8D e8d = (E8D) interfaceC37253Gb6;
            e3z.A04.setUrl(AbstractC25225BEi.A0t(e8d.A03), this.A04.A02);
            e3z.A03.setText(e8d.A07);
            Context context = this.A05;
            boolean z = false;
            String A01 = AbstractC31437Drh.A01(AbstractC166997dE.A0M(context), Integer.valueOf(e8d.A00), false);
            if (A01 == null) {
                A01 = "";
            }
            IgTextView igTextView = e3z.A02;
            igTextView.setText(e8d.A05);
            Boolean bool = e8d.A01;
            if (bool != null) {
                z = bool.booleanValue();
            }
            C85963sQ.A0C(igTextView, z);
            e3z.A01.setText(A01);
            boolean contains = this.A02.contains(e8d.A06);
            UpdatableButton updatableButton = e3z.A05;
            int i2 = 2131974877;
            if (contains) {
                i2 = 2131974880;
            }
            AbstractC31173DnH.A12(context, updatableButton, i2);
            updatableButton.setIsBlueButton(!contains);
            ViewOnClickListenerC35688FpN.A00(updatableButton, interfaceC37253Gb6, this, i, 10);
            ViewOnClickListenerC35688FpN.A00(e3z.A00, interfaceC37253Gb6, this, i, 11);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E3Z(AbstractC25226BEj.A0R(LayoutInflater.from(this.A05), viewGroup, R.layout.suggested_channels_card, false));
    }

    public final void A00() {
        this.A02 = ((C2DU) AbstractC28761aE.A00(this.A04.A03)).A0C.A0D(C4I1.A00);
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(-572866522);
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        C0f9.A0A(-1761580533, A03);
        return i;
    }
}
