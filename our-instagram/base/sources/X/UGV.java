package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class UGV extends C2UU {
    public final UEx A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        W4X w4x;
        UEx uEx = this.A00;
        int i2 = uEx.A04.A05.A04 + i;
        TextView textView = ((C66442UHs) c3oo).A00;
        String string = textView.getContext().getString(2131967847);
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", valueOf));
        textView.setContentDescription(String.format(string, valueOf));
        C69410Vmu c69410Vmu = uEx.A05;
        Calendar A00 = W8R.A00();
        if (A00.get(1) == i2) {
            w4x = c69410Vmu.A06;
        } else {
            w4x = c69410Vmu.A07;
        }
        Iterator it = uEx.A06.BsY().iterator();
        while (it.hasNext()) {
            A00.setTimeInMillis(MSY.A07(it));
            if (A00.get(1) == i2) {
                w4x = c69410Vmu.A04;
            }
        }
        w4x.A01(textView);
        C0fQ.A00(new WMR(this, i2, 0), textView);
    }

    public UGV(UEx uEx) {
        this.A00 = uEx;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1022486194);
        int i = this.A00.A04.A02;
        C0f9.A0A(-1298961347, A03);
        return i;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C66442UHs((TextView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.mtrl_calendar_year));
    }
}
