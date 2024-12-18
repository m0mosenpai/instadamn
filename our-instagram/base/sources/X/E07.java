package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class E07 extends C2UU implements View.OnClickListener {
    public final List A00;
    public final InterfaceC37139GYa A01;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        FLX flx = (FLX) this.A00.get(i);
        E2C e2c = (E2C) c3oo;
        e2c.A01.setText(flx.A02);
        e2c.A00.setChecked(flx.A00);
        e2c.itemView.setTag(Integer.valueOf(i));
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.follow_list_sorting_option_row, viewGroup, false);
        C0fQ.A00(this, inflate);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new E2C(inflate);
    }

    public E07(InterfaceC37139GYa interfaceC37139GYa, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A00 = A1E;
        A1E.addAll(list);
        this.A01 = interfaceC37139GYa;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1647721792);
        int size = this.A00.size();
        C0f9.A0A(-480925291, A03);
        return size;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1937355865);
        C14360o3.A0B(view, 0);
        Object tag = view.getTag();
        if (tag != null) {
            int A0H = AbstractC166987dD.A0H(tag);
            List list = this.A00;
            EnumC33389EpM enumC33389EpM = ((FLX) list.get(A0H)).A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                FLX flx = (FLX) list.get(i);
                boolean A1X = AbstractC167007dF.A1X(flx.A01, enumC33389EpM);
                if (flx.A00 != A1X) {
                    flx.A00 = A1X;
                    notifyItemChanged(i);
                }
            }
            this.A01.DnL(enumC33389EpM);
            C0f9.A0C(1247213403, A05);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0C(117089192, A05);
        throw A0g;
    }
}
