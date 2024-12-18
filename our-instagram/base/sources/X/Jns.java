package X;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jns extends C2UU {
    public InterfaceC193828i3 A00;
    public final C51737MtK A01;
    public final UserSession A02;
    public final L65 A03;
    public final ArrayList A04;

    public Jns(C51737MtK c51737MtK, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = c51737MtK;
        this.A04 = AbstractC166987dD.A1E();
        this.A03 = new L65();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO c45749KNc;
        C14360o3.A0B(viewGroup, 0);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        c45749KNc = new C45748KNb(viewGroup, this.A00);
                    } else {
                        throw new IllegalAccessException("This data type is not defined");
                    }
                } else {
                    c45749KNc = new C45747KNa(viewGroup);
                }
            } else {
                c45749KNc = new C45750KNd(viewGroup, this.A01, this.A02, this.A03, this.A00);
            }
        } else {
            c45749KNc = new C45749KNc(viewGroup, this.A03, this.A00);
        }
        return c45749KNc;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C44321JiD c44321JiD;
        AbstractC44608JpE abstractC44608JpE = (AbstractC44608JpE) c3oo;
        C14360o3.A0B(abstractC44608JpE, 0);
        Object A0i = AbstractC31173DnH.A0i(this.A04, i);
        if (abstractC44608JpE instanceof C45750KNd) {
            C45750KNd c45750KNd = (C45750KNd) abstractC44608JpE;
            KNZ knz = (KNZ) A0i;
            C14360o3.A0B(knz, 0);
            c45750KNd.A01 = knz;
            c45750KNd.A03.setText(C45750KNd.A00(c45750KNd, Integer.valueOf(knz.A00)));
            TextView textView = c45750KNd.A02;
            List list = knz.A02;
            textView.setVisibility(AbstractC167007dF.A05(AbstractC166987dD.A1b(list) ? 1 : 0));
            KKp.A01(AbstractC43592JPx.A0U(textView), c45750KNd, 9);
            int i2 = knz.A01;
            InterfaceC193828i3 interfaceC193828i3 = c45750KNd.A05;
            KNS kns = c45750KNd.A06;
            kns.A01 = interfaceC193828i3;
            kns.A01(list);
            if (c45750KNd.A00 != i2) {
                c45750KNd.A00 = i2;
                RecyclerView recyclerView = c45750KNd.A04;
                recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i2, 0, false));
                recyclerView.A0m(0);
                Resources A0M = AbstractC25228BEl.A0M(c45750KNd.itemView);
                recyclerView.A10(new JoJ(0, c45750KNd.A00, A0M.getDimensionPixelOffset(R.dimen.abc_dialog_padding_material), A0M.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material)));
            }
            L65 l65 = ((AbstractC44608JpE) c45750KNd).A00;
            if (l65 != null) {
                c44321JiD = l65.A00(c45750KNd.A04, c45750KNd, knz);
            } else {
                c44321JiD = null;
            }
            kns.A00 = c44321JiD;
            return;
        }
        if (abstractC44608JpE instanceof C45749KNc) {
            C45749KNc c45749KNc = (C45749KNc) abstractC44608JpE;
            KNX knx = (KNX) A0i;
            C14360o3.A0B(knx, 0);
            KNR knr = c45749KNc.A01;
            List list2 = knx.A00;
            C14360o3.A0B(list2, 0);
            ArrayList arrayList = knr.A01;
            MM9 mm9 = MM9.A00;
            MMA mma = MMA.A00;
            AbstractC25233BEq.A0v(0, arrayList, mm9, mma);
            C66582za A00 = AbstractC66552zX.A00(new C13410mR(arrayList, list2, mm9, mma));
            arrayList.clear();
            arrayList.addAll(list2);
            A00.A03(knr);
            L65 l652 = ((AbstractC44608JpE) c45749KNc).A00;
            if (l652 == null) {
                return;
            }
            l652.A00(c45749KNc.A00, c45749KNc, knx);
            return;
        }
        if (abstractC44608JpE instanceof C45747KNa) {
            C45747KNa c45747KNa = (C45747KNa) abstractC44608JpE;
            KNY kny = (KNY) A0i;
            C14360o3.A0B(kny, 0);
            TextView textView2 = c45747KNa.A00;
            int i3 = kny.A00;
            Resources A0M2 = AbstractC25228BEl.A0M(c45747KNa.itemView);
            if (i3 == 1) {
                str = AbstractC166997dE.A0q(A0M2, 2131964742);
            } else {
                str = "";
            }
            textView2.setText(str);
            return;
        }
        C45748KNb c45748KNb = (C45748KNb) abstractC44608JpE;
        KNW knw = (KNW) A0i;
        C14360o3.A0B(knw, 0);
        L8Z l8z = knw.A00;
        Integer num = l8z.A00;
        if (num == null) {
            TextView textView3 = c45748KNb.A03;
            C14360o3.A06(textView3);
            AbstractC13880nE.A0e(textView3, 0);
            c45748KNb.A01.setVisibility(8);
        } else {
            ImageView imageView = c45748KNb.A01;
            imageView.setVisibility(0);
            imageView.setImageResource(num.intValue());
        }
        TextView textView4 = c45748KNb.A03;
        textView4.setText(l8z.A01());
        c45748KNb.A02.setVisibility(8);
        ViewOnClickListenerC48066LPr.A00(AbstractC31171DnF.A06(c45748KNb), 26, knw, c45748KNb);
        if (c45748KNb.A00) {
            return;
        }
        c45748KNb.A00 = true;
        C57112jm A002 = AbstractC58982mw.A00(textView4);
        if (A002 == null) {
            return;
        }
        textView4.getId();
        C59072n8 A003 = C59062n7.A00(new Object(), new C51688MsJ(2), String.valueOf(textView4.getId()));
        A003.A00(new C44308Jhz(1, c45748KNb, knw));
        AbstractC25227BEk.A10(textView4, A003, A002);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1710503255);
        int size = this.A04.size();
        C0f9.A0A(152464276, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-154031614);
        int A00 = ((AbstractC46508Ki7) this.A04.get(i)).A00();
        C0f9.A0A(1212926331, A03);
        return A00;
    }
}
