package X;

import android.view.View;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.FoF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35624FoF implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ EnumC33420Epr A02;
    public final /* synthetic */ E6W A03;
    public final /* synthetic */ FRX A04;
    public final /* synthetic */ DirectThreadKey A05;

    public ViewOnClickListenerC35624FoF(EnumC33420Epr enumC33420Epr, E6W e6w, FRX frx, DirectThreadKey directThreadKey, int i, int i2) {
        this.A04 = frx;
        this.A02 = enumC33420Epr;
        this.A05 = directThreadKey;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = e6w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-167985365);
        FRX frx = this.A04;
        EnumC33420Epr enumC33420Epr = this.A02;
        DirectThreadKey directThreadKey = this.A05;
        int i = this.A01;
        int i2 = this.A00;
        frx.A01(EnumC33364Eox.A03, enumC33420Epr, this.A03, directThreadKey, i, i2);
        C0f9.A0C(-1691820338, A05);
    }
}
