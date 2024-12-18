package X;

import android.view.View;
import java.util.List;

/* renamed from: X.Oji, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55433Oji implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C23031Ai A02;
    public final /* synthetic */ C72973Oy A03;
    public final /* synthetic */ InterfaceC64002vL A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    public ViewOnClickListenerC55433Oji(C23031Ai c23031Ai, C72973Oy c72973Oy, InterfaceC64002vL interfaceC64002vL, String str, List list, int i, int i2, boolean z) {
        this.A07 = z;
        this.A02 = c23031Ai;
        this.A01 = i;
        this.A04 = interfaceC64002vL;
        this.A05 = str;
        this.A00 = i2;
        this.A06 = list;
        this.A03 = c72973Oy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(683452367);
        boolean z = this.A07;
        C23031Ai c23031Ai = this.A02;
        int i = this.A01 + 1;
        if (z) {
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
            A0w.E7D(AbstractC43591JPw.A00(224), i);
            A0w.apply();
        } else {
            c23031Ai.A0c(i);
        }
        InterfaceC64002vL interfaceC64002vL = this.A04;
        String str = this.A05;
        int i2 = this.A00;
        interfaceC64002vL.De7(this.A03, null, null, str, null, this.A06, i2, false);
        C0f9.A0C(1106163515, A05);
    }
}
