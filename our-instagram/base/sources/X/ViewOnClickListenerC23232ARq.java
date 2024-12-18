package X;

import android.view.View;

/* renamed from: X.ARq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23232ARq implements View.OnClickListener {
    public final /* synthetic */ C199928sw A00;
    public final /* synthetic */ C200488tr A01;

    public ViewOnClickListenerC23232ARq(C199928sw c199928sw, C200488tr c200488tr) {
        this.A00 = c199928sw;
        this.A01 = c200488tr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(865267751);
        this.A00.A06.onClick();
        this.A01.A01.dismiss();
        C0f9.A0C(-889731920, A05);
    }
}
