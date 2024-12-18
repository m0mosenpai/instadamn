package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.MiR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51122MiR extends C2UU {
    public List A00 = C16930sl.A00;
    public final InterfaceC58144Pq9 A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        C51314Mlb c51314Mlb = (C51314Mlb) c3oo;
        C14360o3.A0B(c51314Mlb, 0);
        c51314Mlb.A03.setVisibility(8);
        TextView textView = c51314Mlb.A02;
        textView.setVisibility(0);
        textView.setText(((C51757Mtg) this.A00.get(i)).A02);
        Number number = (Number) ((C51757Mtg) this.A00.get(i)).A00;
        View view = c51314Mlb.A00;
        if (number != null) {
            Context context = view.getContext();
            int A06 = AbstractC167017dG.A06(context);
            view.setPadding(A06, A06, A06, A06);
            ImageView imageView = c51314Mlb.A01;
            AbstractC166997dE.A19(context, imageView, number.intValue());
            imageView.setVisibility(0);
        } else {
            Context context2 = view.getContext();
            int A03 = AbstractC167017dG.A03(context2);
            int A05 = AbstractC167017dG.A05(context2);
            view.setPadding(A03, A05, A03, A05);
            c51314Mlb.A01.setVisibility(8);
        }
        Object obj = ((C51757Mtg) this.A00.get(i)).A01;
        if (C14360o3.A0K(obj, NHK.A00)) {
            AbstractC166987dD.A1P(textView.getContext(), textView, 2131969724);
            i2 = 10;
        } else if (C14360o3.A0K(obj, NHJ.A00)) {
            i2 = 11;
        } else if (C14360o3.A0K(obj, NHI.A00)) {
            i2 = 12;
        } else if (C14360o3.A0K(obj, NHL.A00)) {
            i2 = 13;
        } else {
            throw B4Z.A00();
        }
        ViewOnClickListenerC55457OkB.A01(view, i2, this);
    }

    public C51122MiR(InterfaceC58144Pq9 interfaceC58144Pq9) {
        this.A01 = interfaceC58144Pq9;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1861111966);
        int size = this.A00.size();
        C0f9.A0A(806518096, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return OOz.A01(viewGroup);
    }
}
