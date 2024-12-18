package X;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import java.util.LinkedHashSet;

/* renamed from: X.9UI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9UI extends C2UU {
    public final Handler A00;
    public final LayoutInflater A01;
    public final LinearLayoutManager A02;
    public final Runnable A03;
    public final java.util.Set A04;
    public final boolean A05;
    public final A7C[] A06;
    public final /* synthetic */ C214739fB A07;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        boolean z = this.A05;
        int i2 = R.layout.spinner_dropdown_switch_row;
        if (z) {
            i2 = R.layout.spinner_dropdown_radio_row;
        }
        View inflate = this.A01.inflate(i2, viewGroup, false);
        int i3 = R.id.row_switch;
        if (z) {
            i3 = R.id.row_radio_button;
        }
        View findViewById = inflate.findViewById(i3);
        C14360o3.A0A(findViewById);
        return new C210859Ui(inflate, (CompoundButton) findViewById);
    }

    public C9UI(LinearLayoutManager linearLayoutManager, C214739fB c214739fB, java.util.Set set, A7C[] a7cArr, boolean z) {
        this.A07 = c214739fB;
        this.A06 = a7cArr;
        this.A05 = z;
        this.A02 = linearLayoutManager;
        LayoutInflater from = LayoutInflater.from(c214739fB.requireContext());
        C14360o3.A07(from);
        this.A01 = from;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A04 = linkedHashSet;
        this.A00 = AbstractC167007dF.A0J();
        this.A03 = new RunnableC24672AwD(this, c214739fB);
        linkedHashSet.addAll(set);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C210859Ui c210859Ui = (C210859Ui) c3oo;
        C14360o3.A0B(c210859Ui, 0);
        A7C a7c = this.A06[i];
        TextView textView = c210859Ui.A01;
        textView.setText(a7c.A00);
        View view = c210859Ui.itemView;
        boolean z = a7c.A01;
        view.setEnabled(z);
        Context context = textView.getContext();
        Context context2 = this.A07.getContext();
        int i2 = R.attr.igds_color_secondary_text;
        if (z) {
            i2 = R.attr.igds_color_primary_text;
        }
        AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A0H(context2, i2));
        C0fQ.A00(new OkD(i, 2, c210859Ui, this), c210859Ui.itemView);
        CompoundButton compoundButton = c210859Ui.A00;
        compoundButton.setChecked(this.A04.contains(Integer.valueOf(i)));
        compoundButton.setEnabled(z);
        compoundButton.setOnCheckedChangeListener(new C35732FqF(this, i, 0));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-652934322);
        int length = this.A06.length;
        C0f9.A0A(-110269666, A03);
        return length;
    }
}
