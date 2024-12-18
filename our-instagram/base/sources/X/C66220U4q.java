package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.U4q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66220U4q extends AbstractC135366Al {
    public final /* synthetic */ InterfaceC72773Ny A00;
    public final /* synthetic */ C6FG A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66220U4q(InterfaceC72773Ny interfaceC72773Ny, C6FG c6fg, long j) {
        super(j);
        this.A00 = interfaceC72773Ny;
        this.A01 = c6fg;
    }

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        InterfaceC72773Ny interfaceC72773Ny;
        C102884kP A08 = ((C102884kP) obj).A08(36);
        WXf wXf = (WXf) obj2;
        if (A08 != null && (interfaceC72773Ny = this.A00) != null) {
            interfaceC72773Ny.DV2(wXf, this.A01, A08);
            return null;
        }
        return null;
    }

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        C102884kP A08 = ((C102884kP) obj).A08(36);
        if (A08 == ((C102884kP) obj2).A08(36)) {
            return false;
        }
        if (A08 != null) {
            return !A08.equals(r0);
        }
        return true;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
