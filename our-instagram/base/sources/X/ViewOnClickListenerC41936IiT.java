package X;

import android.view.View;

/* renamed from: X.IiT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41936IiT implements View.OnClickListener {
    public final /* synthetic */ JI9 A00;
    public final /* synthetic */ C64452w4 A01;
    public final /* synthetic */ String A02;

    public ViewOnClickListenerC41936IiT(JI9 ji9, C64452w4 c64452w4, String str) {
        this.A01 = c64452w4;
        this.A02 = str;
        this.A00 = ji9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(781415553);
        this.A01.A01(this.A02);
        this.A00.Ciw();
        C0f9.A0C(-1409225229, A05);
    }
}
