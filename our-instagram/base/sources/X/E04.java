package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class E04 extends C2UU {
    public int A00;
    public int A01;
    public HashMap A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final C57112jm A09;
    public final C32269EJe A0A;

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C31922E1c(AbstractC25227BEk.A0D(LayoutInflater.from(this.A08), viewGroup, R.layout.pill_container, false));
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [X.0oO, java.lang.Object] */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Long A0j;
        C14360o3.A0B(c3oo, 0);
        ViewGroup viewGroup = ((C31922E1c) c3oo).A00;
        viewGroup.removeAllViews();
        Context context = this.A08;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pill_container_row, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        List list = this.A03;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                InterfaceC37273GbQ interfaceC37273GbQ = (InterfaceC37273GbQ) obj;
                if (interfaceC37273GbQ.getName() != null && interfaceC37273GbQ.B6s() != null) {
                    A1E.add(obj);
                }
            }
            int size = A1E.size();
            int i2 = 0;
            while (true) {
                boolean z = true;
                while (i2 < size) {
                    InterfaceC37273GbQ interfaceC37273GbQ2 = (InterfaceC37273GbQ) A1E.get(i2);
                    if (interfaceC37273GbQ2 != null) {
                        boolean z2 = false;
                        View inflate2 = LayoutInflater.from(context).inflate(R.layout.subinterest_pill, viewGroup2, false);
                        C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                        TextView textView = (TextView) AbstractC166997dE.A0S(inflate2, R.id.pill_text);
                        textView.setText(interfaceC37273GbQ2.getName());
                        String B6s = interfaceC37273GbQ2.B6s();
                        if (B6s != null && (A0j = AbstractC166997dE.A0j(B6s)) != null) {
                            ?? obj2 = new Object();
                            Boolean bool = (Boolean) this.A02.get(A0j);
                            if (bool != null) {
                                z2 = bool.booleanValue();
                            }
                            obj2.A00 = z2;
                            int i3 = R.attr.igds_color_primary_text;
                            if (z2) {
                                i3 = R.attr.igds_color_selected_pill_text;
                            }
                            AbstractC31177DnL.A0q(context, textView, i3);
                            inflate2.setSelected(obj2.A00);
                            C0fQ.A00(new FoY(4, context, inflate2, textView, interfaceC37273GbQ2, this, A0j, obj2), inflate2);
                        }
                        if (z) {
                            ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
                            if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                marginLayoutParams.setMarginStart(0);
                            }
                        } else {
                            inflate2.measure(View.MeasureSpec.makeMeasureSpec(this.A01, Integer.MIN_VALUE), 0);
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(this.A01, Integer.MIN_VALUE), 0);
                            int measuredWidth = inflate2.getMeasuredWidth();
                            int measuredWidth2 = viewGroup2.getMeasuredWidth();
                            int marginStart = AbstractC31177DnL.A0H(inflate2).getMarginStart();
                            int i4 = this.A01;
                            if (measuredWidth + measuredWidth2 + marginStart > i4) {
                                if (!this.A06) {
                                    viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
                                    int measuredWidth3 = (i4 - viewGroup2.getMeasuredWidth()) / 2;
                                    AbstractC13880nE.A0a(viewGroup2, measuredWidth3);
                                    AbstractC13880nE.A0c(viewGroup2, measuredWidth3);
                                }
                                viewGroup.addView(viewGroup2);
                                View inflate3 = LayoutInflater.from(context).inflate(R.layout.pill_container_row, viewGroup, false);
                                C14360o3.A0C(inflate3, "null cannot be cast to non-null type android.widget.LinearLayout");
                                viewGroup2 = (ViewGroup) inflate3;
                            }
                        }
                        viewGroup2.addView(inflate2);
                        String name = interfaceC37273GbQ2.getName();
                        String B6s2 = interfaceC37273GbQ2.B6s();
                        if (name != null && B6s2 != null) {
                            C59072n8 A00 = C59062n7.A00(name, null, B6s2);
                            A00.A00(new C36308G0d(this.A0A));
                            this.A09.A05(inflate2, A00.A01());
                        }
                        i2++;
                        if (i2 == size) {
                            if (!this.A06) {
                                int i5 = this.A01;
                                viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), 0);
                                int measuredWidth4 = (i5 - viewGroup2.getMeasuredWidth()) / 2;
                                AbstractC13880nE.A0a(viewGroup2, measuredWidth4);
                                AbstractC13880nE.A0c(viewGroup2, measuredWidth4);
                            }
                            viewGroup.addView(viewGroup2);
                        }
                        z = false;
                    }
                }
                return;
            }
        }
        C14360o3.A0F("interestList");
        throw C00O.createAndThrow();
    }

    public E04(Context context, C57112jm c57112jm, C32269EJe c32269EJe) {
        this.A08 = context;
        this.A0A = c32269EJe;
        this.A09 = c57112jm;
        this.A02 = AbstractC166987dD.A1G();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-119868321);
        int i = this.A00;
        C0f9.A0A(710205326, A03);
        return i;
    }

    public E04() {
    }
}
