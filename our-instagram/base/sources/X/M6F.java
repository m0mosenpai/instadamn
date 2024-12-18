package X;

import android.content.Context;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class M6F implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C45505KCu A02;
    public final /* synthetic */ String A03;

    public M6F(Context context, TextView textView, C45505KCu c45505KCu, String str) {
        this.A01 = textView;
        this.A02 = c45505KCu;
        this.A00 = context;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder A1C;
        StringBuilder A11;
        TextView textView = this.A01;
        int i = 1;
        if (!textView.isLaidOut()) {
            C45505KCu c45505KCu = this.A02;
            Context context = this.A00;
            String str = this.A03;
            textView.setVisibility(0);
            textView.post(new M6F(context, textView, c45505KCu, str));
            return;
        }
        int width = textView.getWidth();
        Context context2 = this.A00;
        String str2 = this.A03;
        String A0b = AbstractC31177DnL.A0b(context2, str2, 2131959449);
        float f = width;
        if (textView.getPaint().measureText(A0b) > f) {
            String A0p = AbstractC166997dE.A0p(context2, 2131959452);
            String A0p2 = AbstractC166997dE.A0p(context2, 2131959451);
            String A0p3 = AbstractC166997dE.A0p(context2, 2131959450);
            float measureText = textView.getPaint().measureText(A0p) + textView.getPaint().measureText(A0p2) + textView.getPaint().measureText(A0p3);
            while (true) {
                if (i > AbstractC167007dF.A0A(str2)) {
                    break;
                }
                if (textView.getPaint().measureText(str2, 0, i) > f - measureText) {
                    i--;
                    break;
                }
                i++;
            }
            if (AbstractC13620mo.A01() && !AbstractC13620mo.A03(str2)) {
                A1C = AbstractC166997dE.A11(A0p3);
                A1C.append(C00Q.A03(str2, i));
            } else {
                A1C = AbstractC166987dD.A1C();
                A1C.append(C00Q.A03(str2, i));
                A1C.append(A0p3);
            }
            String obj = A1C.toString();
            if (AbstractC13620mo.A01()) {
                A11 = AbstractC166997dE.A11(A0p2);
                A11.append(obj);
                A11.append(A0p);
            } else {
                A11 = AbstractC166997dE.A11(A0p);
                A11.append(obj);
                A11.append(A0p2);
            }
            A0b = A11.toString();
        }
        textView.setText(A0b);
    }
}
