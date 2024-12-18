package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WMi implements View.OnClickListener {
    public final /* synthetic */ V5T A00;
    public final /* synthetic */ C68708Vak A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public WMi(V5T v5t, C68708Vak c68708Vak, String str, String str2, boolean z) {
        this.A01 = c68708Vak;
        this.A04 = z;
        this.A00 = v5t;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-998047882);
        C68708Vak c68708Vak = this.A01;
        boolean z = this.A04;
        c68708Vak.A00.A02(!z, false, false);
        this.A00.A04.invoke(Boolean.valueOf(z), this.A03, this.A02);
        C0f9.A0C(496940900, A05);
    }
}
