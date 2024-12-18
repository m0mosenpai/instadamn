package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.41q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C905541q {
    public final ViewStub A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C905541q(View view) {
        View requireViewById = view.requireViewById(R.id.open_carousel_self_pending_post_overlay_stub);
        C14360o3.A07(requireViewById);
        this.A00 = (ViewStub) requireViewById;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 36));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 40));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 37));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 38));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 41));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 39));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 35));
    }
}
