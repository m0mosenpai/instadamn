package X;

import android.view.View;
import com.instagram.mainfeed.afi.ui.AfiSecondaryLinkButton;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IjH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41986IjH implements View.OnClickListener {
    public final /* synthetic */ JI9 A00;
    public final /* synthetic */ C42659IuG A01;
    public final /* synthetic */ IKH A02;
    public final /* synthetic */ AfiSecondaryLinkButton A03;
    public final /* synthetic */ Integer A04;

    public ViewOnClickListenerC41986IjH(JI9 ji9, C42659IuG c42659IuG, IKH ikh, AfiSecondaryLinkButton afiSecondaryLinkButton, Integer num) {
        this.A02 = ikh;
        this.A04 = num;
        this.A00 = ji9;
        this.A03 = afiSecondaryLinkButton;
        this.A01 = c42659IuG;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        long j;
        Long A0j;
        NFZ nfz;
        JMH jmh;
        int A05 = C0f9.A05(-1483584019);
        IKH ikh = this.A02;
        HorizontalFlowLayout horizontalFlowLayout = ikh.A07;
        int i2 = horizontalFlowLayout.A00;
        Integer num = this.A04;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 5;
        }
        C11T.A02(new RunnableC43146J5j(this.A01, ikh, this.A03, i));
        JI9 ji9 = this.A00;
        List<View> A01 = horizontalFlowLayout.A01(i2, i - 1);
        ArrayList<JMH> A1E = AbstractC166987dD.A1E();
        for (View view2 : A01) {
            if ((view2 instanceof NFZ) && (nfz = (NFZ) view2) != null && (jmh = nfz.A00) != null) {
                A1E.add(jmh);
            }
        }
        C42123IlX c42123IlX = (C42123IlX) ji9;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c42123IlX.A00, "instagram_ads_feedback_interface_expand_interests");
        if (A0f.isSampled()) {
            String str = c42123IlX.A04;
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            C42123IlX.A01(A0f, c42123IlX, j);
            String str2 = c42123IlX.A05;
            if (str2 == null) {
                str2 = "";
            }
            C42123IlX.A03(A0f, c42123IlX, str2);
            C42123IlX.A02(A0f, c42123IlX, C42123IlX.A00(A0f, c42123IlX, "question_id", "interests"));
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            for (JMH jmh2 : A1E) {
                C14360o3.A0B(jmh2, 0);
                C0Zx c0Zx = new C0Zx();
                String name = jmh2.getName();
                if (name != null) {
                    C42123IlX.A04(c0Zx, jmh2, AbstractC37305Gc6.A01(c0Zx, jmh2, name));
                    A0q.add(c0Zx);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A0f.AAk("interests", A0q);
            A0f.Cht();
        }
        C0f9.A0C(378774328, A05);
    }
}
