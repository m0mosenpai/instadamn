package X;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class OW0 {
    public final View A00;
    public final UserSession A01;
    public final C54396O2c A02;
    public final C54524O7b A03;
    public final ArrayList A04;
    public final ArrayList A05;
    public final LinkedHashMap A06;
    public final RecyclerView A07;
    public final C51136Mif A08;
    public final ArrayList A09;

    public OW0(View view, UserSession userSession, C54396O2c c54396O2c, C54524O7b c54524O7b) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = view;
        this.A02 = c54396O2c;
        this.A03 = c54524O7b;
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.suggested_items_recyclerview);
        this.A07 = recyclerView;
        C51136Mif c51136Mif = new C51136Mif(c54396O2c, c54524O7b);
        this.A08 = c51136Mif;
        this.A06 = AbstractC166987dD.A1I();
        this.A04 = AbstractC166987dD.A1E();
        this.A05 = AbstractC166987dD.A1E();
        this.A09 = AbstractC166987dD.A1E();
        AbstractC31174DnI.A17(view.getContext(), recyclerView, false);
        recyclerView.setAdapter(c51136Mif);
        Resources resources = view.getResources();
        AbstractC37304Gc5.A0z(recyclerView, AbstractC166997dE.A05(resources), AbstractC166997dE.A08(resources));
        C1ON A00 = AbstractC54283Nz3.A00(this.A01);
        C50689MZh.A00(A00, this, 9);
        C1GJ.A03(A00);
    }

    public final void A01(List list) {
        C14360o3.A0B(list, 0);
        LinkedHashMap linkedHashMap = this.A06;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC43571JMf interfaceC43571JMf = (InterfaceC43571JMf) it.next();
            String AnD = interfaceC43571JMf.AnD();
            if (AnD == null) {
                AnD = AnonymousClass001.A0D(interfaceC43571JMf.getFundraiserId(), '!');
            }
            linkedHashMap.put(AnD, interfaceC43571JMf);
        }
        A00(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.OW0 r9) {
        /*
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r1 = r9.A04
            java.util.ArrayList r0 = r9.A05
            r6 = 1
            java.util.ArrayList[] r0 = new java.util.ArrayList[]{r1, r0}
            java.util.List r0 = X.AbstractC16960so.A1Q(r0)
            X.0eN r5 = X.AbstractC001800i.A0o(r0)
            X.PjV r2 = X.C57742PjV.A00
            X.JEY r0 = X.JEY.A00
            X.M9O r1 = new X.M9O
            r1.<init>(r0, r2, r5)
            r7 = 8
            X.Pjc r0 = new X.Pjc
            r0.<init>(r9, r7)
            X.17n r2 = X.AbstractC224517h.A04(r0, r1)
            r1 = 10
            X.MUt r0 = new X.MUt
            r0.<init>(r1)
            X.9Hj r1 = new X.9Hj
            r1.<init>(r0, r2)
            r0 = 5
            X.PV3 r2 = new X.PV3
            r2.<init>(r1, r0)
            r1 = 33
            X.DRc r0 = new X.DRc
            r0.<init>(r1, r3, r4, r9)
            X.17m r0 = X.AbstractC224517h.A09(r0, r2)
            X.AbstractC224517h.A02(r0)
            boolean r0 = X.AbstractC166987dD.A1b(r3)
            r5 = 0
            if (r0 == 0) goto La1
            com.instagram.common.session.UserSession r8 = r9.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317959987140319(0x8106fe000016df, double:3.030962364329756E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            if (r0 == 0) goto La1
            java.util.ArrayList r1 = r9.A09
            boolean r0 = X.C14360o3.A0K(r1, r4)
            if (r0 != 0) goto L91
            r1.clear()
            r1.addAll(r4)
            X.O7b r0 = r9.A03
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.String r1 = "VIDEO_COMPOSER"
            X.0iw r0 = r0.A00
            X.AbstractC55215Oed.A09(r0, r2, r1, r4)
            X.Mif r2 = r9.A08
            java.util.ArrayList r1 = r2.A03
            boolean r0 = X.C14360o3.A0K(r1, r3)
            if (r0 != 0) goto L8e
            r2.A00 = r5
            r1.clear()
            r1.addAll(r3)
        L8e:
            r2.notifyDataSetChanged()
        L91:
            androidx.recyclerview.widget.RecyclerView r1 = r9.A07
            X.Mif r0 = r9.A08
            int r0 = r0.getItemCount()
            if (r0 != 0) goto L9d
            r5 = 8
        L9d:
            r1.setVisibility(r5)
            return
        La1:
            java.util.ArrayList r1 = r9.A09
            boolean r0 = X.AbstractC25226BEj.A1b(r1)
            if (r0 == 0) goto Lbf
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lbf
            r1.clear()
            X.O7b r0 = r9.A03
            com.instagram.common.session.UserSession r3 = r0.A01
            java.lang.String r2 = "VIDEO_COMPOSER"
            X.0sl r1 = X.C16930sl.A00
            X.0iw r0 = r0.A00
            X.AbstractC55215Oed.A09(r0, r3, r2, r1)
        Lbf:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.LinkedHashMap r0 = r9.A06
            java.util.Iterator r3 = X.AbstractC167007dF.A0k(r0)
        Lc9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Le6
            java.lang.Object r0 = X.AbstractC166997dE.A0l(r3)
            X.JMf r0 = (X.InterfaceC43571JMf) r0
            java.lang.String r2 = r0.getFundraiserTitle()
            X.OkK r1 = X.ViewOnClickListenerC55465OkK.A00(r0, r9, r7)
            X.O7a r0 = new X.O7a
            r0.<init>(r2, r1)
            r4.add(r0)
            goto Lc9
        Le6:
            X.Mif r2 = r9.A08
            java.util.ArrayList r1 = r2.A03
            boolean r0 = X.C14360o3.A0K(r1, r4)
            if (r0 != 0) goto L8e
            r2.A00 = r6
            r1.clear()
            r1.addAll(r4)
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OW0.A00(X.OW0):void");
    }
}
