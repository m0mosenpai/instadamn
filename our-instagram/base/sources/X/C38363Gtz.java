package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.discovery.refinement.model.Refinement;
import java.util.List;

/* renamed from: X.Gtz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38363Gtz extends C2UU {
    public C51755Mte A00;
    public final InterfaceC43408JFy A01;
    public final IEU A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        List list;
        Refinement refinement;
        C14360o3.A0B(c3oo, 0);
        getItemViewType(i);
        C38410Gul c38410Gul = (C38410Gul) c3oo;
        C51755Mte c51755Mte = this.A00;
        if (c51755Mte != null && (list = (List) c51755Mte.A00) != null && (refinement = (Refinement) list.get(i)) != null) {
            String str = refinement.A01;
            C14360o3.A07(str);
            c38410Gul.A00.setText(str);
            IEU ieu = this.A02;
            View view = c38410Gul.itemView;
            C59072n8 A00 = C59062n7.A00(refinement, Integer.valueOf(i), refinement.A00());
            A00.A00(ieu.A01);
            ieu.A00.A05(view, A00.A01());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.refinement_item, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(3));
        TextView textView = (TextView) inflate;
        AbstractC31173DnH.A0z(textView.getContext(), textView, R.drawable.secondary_button_selector_panavision_soft_update);
        if (i == 0) {
            C38410Gul c38410Gul = new C38410Gul(textView);
            ViewOnClickListenerC42034Ik3.A00(textView, 14, c38410Gul, this);
            return c38410Gul;
        }
        throw AbstractC31175DnJ.A0U("Invalid viewType ", i);
    }

    public C38363Gtz(InterfaceC43408JFy interfaceC43408JFy, IEU ieu) {
        this.A01 = interfaceC43408JFy;
        this.A02 = ieu;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        List list;
        int A03 = C0f9.A03(1442127659);
        C51755Mte c51755Mte = this.A00;
        if (c51755Mte != null && (list = (List) c51755Mte.A00) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C0f9.A0A(543238395, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(40327909, C0f9.A03(1032773489));
        return 0;
    }
}
