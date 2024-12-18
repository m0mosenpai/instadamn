package X;

import android.view.View;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.9i9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216529i9 extends C3PD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C216529i9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            InterfaceC186168Nk interfaceC186168Nk = (InterfaceC186168Nk) obj;
            UJK ujk = (UJK) this.A02;
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            UpcomingEvent upcomingEvent = ujk.A00;
            if (upcomingEvent != null) {
                interfaceC186168Nk.Dwv(upcomingEvent);
                return true;
            }
            throw AbstractC166997dE.A0g();
        }
        C210919Uo c210919Uo = (C210919Uo) this.A02;
        ((InterfaceC25174BBv) obj).DK5(c210919Uo.A00, c210919Uo.getBindingAdapterPosition());
        return true;
    }
}
