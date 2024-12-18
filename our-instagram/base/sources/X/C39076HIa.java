package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HIa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39076HIa extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC132405yL A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ?? r8;
        C39096HIu c39096HIu = (C39096HIu) interfaceC66482zP;
        C38428GvB c38428GvB = (C38428GvB) c3oo.itemView.getTag();
        if (c38428GvB != null) {
            ArrayList arrayList = c39096HIu.A07;
            List list = c39096HIu.A08;
            List list2 = c39096HIu.A09;
            String str = c39096HIu.A06;
            String str2 = c39096HIu.A05;
            int i = c39096HIu.A00;
            int i2 = c39096HIu.A01;
            int i3 = c39096HIu.A03;
            int i4 = c39096HIu.A02;
            InterfaceC132405yL interfaceC132405yL = this.A03;
            C38350Gtm c38350Gtm = (C38350Gtm) c38428GvB.A00.A0A;
            if (c38350Gtm != null) {
                c38350Gtm.A0A = str;
                c38350Gtm.A09 = str2;
                c38350Gtm.A07 = interfaceC132405yL;
                c38350Gtm.A0D = arrayList;
                c38350Gtm.A0B = list;
                C76403bk c76403bk = new C76403bk();
                c76403bk.A0H = "0";
                if (list != null) {
                    r8 = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C111034zF A00 = AbstractC128065qa.A00(AbstractC37300Gc1.A0A(it));
                        if (A00 != null) {
                            r8.add(A00);
                        }
                    }
                } else {
                    r8 = C16930sl.A00;
                }
                C14360o3.A0B(r8, 0);
                c76403bk.A0M = r8;
                C125905mf A002 = InterfaceC111084zP.A00.A00(AbstractC167007dF.A1W(c38350Gtm.A09));
                A002.A00 = c38350Gtm.A09;
                c76403bk.A04 = A002.A00();
                c76403bk.A03 = ClipsIFUType.A04;
                C60R c60r = new C60R();
                String str3 = c38350Gtm.A0A;
                C14360o3.A0B(str3, 0);
                c60r.A03 = str3;
                String str4 = c38350Gtm.A09;
                c60r.A02 = str4;
                C125595m5 c125595m5 = c38350Gtm.A08;
                if (c125595m5 == null) {
                    UserSession userSession = c38350Gtm.A06;
                    c38350Gtm.A08 = new C125595m5(null, new C65722yA(c38350Gtm.A05, userSession), userSession, c38350Gtm.A07, c76403bk, c60r, new C62812tK(userSession, c38350Gtm.A04));
                } else {
                    c125595m5.A00 = c76403bk;
                    C60R c60r2 = c125595m5.A02;
                    c60r2.A03 = str3;
                    c60r2.A02 = str4;
                }
                c38350Gtm.notifyDataSetChanged();
                c38350Gtm.A0C = list2;
                c38350Gtm.A00 = i;
                c38350Gtm.A01 = i2;
                c38350Gtm.A03 = i3;
                c38350Gtm.A02 = i4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.2UU, X.Gtm] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Context context = this.A00;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        View inflate = layoutInflater.inflate(R.layout.direct_inbox_search_reshared_content_layout, viewGroup, false);
        C38428GvB c38428GvB = new C38428GvB(inflate);
        RecyclerView recyclerView = c38428GvB.A00;
        AbstractC31174DnI.A17(context, recyclerView, false);
        ?? c2uu = new C2UU();
        c2uu.A04 = context;
        c2uu.A06 = userSession;
        c2uu.A05 = interfaceC11380iw;
        c2uu.A0A = "";
        recyclerView.setAdapter(c2uu);
        inflate.setTag(c38428GvB);
        return new C38428GvB(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39096HIu.class;
    }

    public C39076HIa(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC132405yL interfaceC132405yL) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = interfaceC132405yL;
        this.A01 = interfaceC11380iw;
    }
}
