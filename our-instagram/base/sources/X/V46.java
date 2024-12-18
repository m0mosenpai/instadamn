package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes11.dex */
public final class V46 extends AbstractC135366Al {
    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        Ut4 ut4 = (Ut4) obj;
        C14360o3.A0B(ut4, 2);
        C69502VpX c69502VpX = Ut4.A06;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<com.instagram.common.bloks.component.base.BloksModel>");
        c69502VpX.A00((U44) obj2, ut4);
        return null;
    }

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC167017dG.A1N((Ut4) obj, (Ut4) obj2);
        if (AbstractC103044kf.A00() != null) {
            if (obj3 != null && obj4 != null) {
                U44 u44 = (U44) obj3;
                U44 u442 = (U44) obj4;
                if (u44.A01 != u442.A01 || u44.A00 != u442.A00 || !C14360o3.A0K(u44.A02, u442.A02)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return !r4.A02.A0M().equals(r5.A02.A0M());
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
