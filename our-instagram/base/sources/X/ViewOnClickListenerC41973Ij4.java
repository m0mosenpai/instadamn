package X;

import android.view.View;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Ij4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41973Ij4 implements View.OnClickListener {
    public final /* synthetic */ IJ3 A00;
    public final /* synthetic */ InterfaceC144816g1 A01;
    public final /* synthetic */ UpcomingEvent A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC41973Ij4(IJ3 ij3, InterfaceC144816g1 interfaceC144816g1, UpcomingEvent upcomingEvent, String str) {
        this.A01 = interfaceC144816g1;
        this.A02 = upcomingEvent;
        this.A03 = str;
        this.A00 = ij3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1591588030);
        this.A01.Dww(this.A00, this.A02, this.A03);
        C0f9.A0C(1071377522, A05);
    }
}
