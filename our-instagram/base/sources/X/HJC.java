package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes7.dex */
public final class HJC extends C3PD {
    public final /* synthetic */ AlC A00;
    public final /* synthetic */ NXU A01;
    public final /* synthetic */ C38944HCt A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public HJC(AlC alC, NXU nxu, C38944HCt c38944HCt, String str, String str2) {
        this.A01 = nxu;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = c38944HCt;
        this.A00 = alC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.FLC, java.lang.Object] */
    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        String str;
        NXU nxu = this.A01;
        ImageView imageView = nxu.A01;
        boolean z = !imageView.isSelected();
        imageView.setSelected(z);
        TextView textView = nxu.A02;
        if (z) {
            str = this.A04;
        } else {
            str = this.A03;
        }
        textView.setText(str);
        C38944HCt c38944HCt = this.A02;
        AlC alC = this.A00;
        InterfaceC09390do interfaceC09390do = c38944HCt.A07;
        C57742kn A00 = C57742kn.A00(AbstractC166987dD.A0r(interfaceC09390do));
        String str2 = alC.A00.A06;
        if (str2 != null) {
            String str3 = c38944HCt.A03;
            Boolean valueOf = Boolean.valueOf(z);
            ?? obj = new Object();
            obj.A01 = str2;
            obj.A02 = str3;
            obj.A00 = valueOf;
            A00.A0H(str2, obj);
            C1ON A002 = FAY.A00(AbstractC166987dD.A0r(interfaceC09390do), obj);
            A002.A00 = new HGR(4, A00, obj, c38944HCt, z);
            c38944HCt.schedule(A002);
            IGA iga = c38944HCt.A02;
            if (iga != null) {
                AlC alC2 = iga.A00;
                URL url = alC2.A00;
                alC2.A00 = VP3.A00(url.A00, url.A01, url.A02, valueOf, url.A04, url.A05, url.A06, url.A07, url.A08, url.A09, url.A0A, url.A0B, url.A0C);
            }
            return true;
        }
        throw AbstractC166997dE.A0g();
    }
}
