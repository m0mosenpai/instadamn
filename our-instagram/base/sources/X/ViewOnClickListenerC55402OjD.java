package X;

import android.view.View;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.OjD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55402OjD implements View.OnClickListener {
    public final /* synthetic */ C31824Dyi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public ViewOnClickListenerC55402OjD(C31824Dyi c31824Dyi, String str, boolean z) {
        this.A00 = c31824Dyi;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1215921617);
        C31824Dyi c31824Dyi = this.A00;
        UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.A0J;
        String str = this.A01;
        boolean z = this.A02;
        AbstractC166987dD.A1Z(new MBa(c31824Dyi, userMonetizationProductType, str, null, 6, z), MSX.A0B(c31824Dyi, str, 1));
        C0f9.A0C(-898055359, A05);
    }
}
