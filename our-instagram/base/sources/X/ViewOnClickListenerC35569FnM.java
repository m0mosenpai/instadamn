package X;

import android.view.View;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.FnM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35569FnM implements View.OnClickListener {
    public final /* synthetic */ FRk A00;
    public final /* synthetic */ C189478aR A01;
    public final /* synthetic */ DirectThreadKey A02;

    public ViewOnClickListenerC35569FnM(FRk fRk, C189478aR c189478aR, DirectThreadKey directThreadKey) {
        this.A00 = fRk;
        this.A02 = directThreadKey;
        this.A01 = c189478aR;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-116542717);
        this.A00.A01(EnumC33511Erk.NOT_NOW_TAPPED, this.A02.A00);
        this.A01.A0L(null);
        C0f9.A0C(486868451, A05);
    }
}
