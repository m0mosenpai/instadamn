package X;

import android.view.View;

/* renamed from: X.Cks, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28644Cks implements View.OnClickListener {
    public final /* synthetic */ C84823qW A00;
    public final /* synthetic */ InterfaceC145486h7 A01;
    public final /* synthetic */ C139476Tc A02;

    public ViewOnClickListenerC28644Cks(C84823qW c84823qW, InterfaceC145486h7 interfaceC145486h7, C139476Tc c139476Tc) {
        this.A02 = c139476Tc;
        this.A01 = interfaceC145486h7;
        this.A00 = c84823qW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(694197194);
        C139476Tc c139476Tc = this.A02;
        View view2 = c139476Tc.A01;
        if (view2 != null) {
            float A07 = AbstractC166987dD.A07(view2) * 0.5f;
            View view3 = c139476Tc.A01;
            if (view3 != null) {
                this.A01.Ddl(this.A00, (int) A07, (int) (AbstractC166987dD.A08(view3) * 0.5f));
                C0f9.A0C(-102757526, A05);
                return;
            }
        }
        C14360o3.A0F("productThumbnailContainer");
        throw C00O.createAndThrow();
    }
}
