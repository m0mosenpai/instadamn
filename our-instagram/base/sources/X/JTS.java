package X;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class JTS implements InterfaceC69513Al {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass988 A01;
    public final /* synthetic */ C162957Rg A02;
    public final /* synthetic */ C25312BIh A03;
    public final /* synthetic */ String A04;

    public JTS(AnonymousClass988 anonymousClass988, C162957Rg c162957Rg, C25312BIh c25312BIh, String str, int i) {
        this.A02 = c162957Rg;
        this.A03 = c25312BIh;
        this.A00 = i;
        this.A04 = str;
        this.A01 = anonymousClass988;
    }

    @Override // X.InterfaceC69513Al
    public final /* bridge */ /* synthetic */ void DLu(View view) {
        TextView textView = (TextView) view;
        C14360o3.A0B(textView, 0);
        this.A02.A00(textView);
        C25312BIh c25312BIh = this.A03;
        int i = this.A00;
        JTQ.A03(textView, c25312BIh, i);
        String str = this.A04;
        if (AbstractC167007dF.A1Z(this.A01.A0Y)) {
            textView.setVisibility(0);
        }
        if (!AbstractC001900j.A0T(str)) {
            textView.setText(str);
            textView.setTextColor(i);
        }
    }
}
