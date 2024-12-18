package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.Mif, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51136Mif extends C2UU {
    public boolean A00;
    public final C54396O2c A01;
    public final C54524O7b A02;
    public final ArrayList A03 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        View view;
        View.OnClickListener A01;
        C51314Mlb c51314Mlb = (C51314Mlb) c3oo;
        C14360o3.A0B(c51314Mlb, 0);
        ArrayList arrayList = this.A03;
        if (i < arrayList.size()) {
            C54523O7a c54523O7a = (C54523O7a) AbstractC31173DnH.A0i(arrayList, i);
            c51314Mlb.A02.setText(c54523O7a.A01);
            view = c51314Mlb.A00;
            A01 = c54523O7a.A00;
        } else {
            c51314Mlb.A02.setText(2131962969);
            c51314Mlb.A01.setImageResource(R.drawable.search_location_small);
            view = c51314Mlb.A00;
            A01 = ViewOnClickListenerC55466OkL.A01(this, 11);
        }
        C0fQ.A00(A01, view);
    }

    public C51136Mif(C54396O2c c54396O2c, C54524O7b c54524O7b) {
        this.A01 = c54396O2c;
        this.A02 = c54524O7b;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int i;
        int A03 = C0f9.A03(-2072208011);
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            size = 0;
            i = 1609468146;
        } else {
            boolean z = this.A00;
            size = arrayList.size();
            if (z) {
                size++;
            }
            i = -1806381611;
        }
        C0f9.A0A(i, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return OOz.A01(viewGroup);
    }
}
