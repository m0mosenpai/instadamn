package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* renamed from: X.TFu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64484TFu implements InterfaceC23471Cj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C64484TFu(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A03 = obj3;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        switch (this.A00) {
            case 0:
                Activity activity = (Activity) this.A01;
                if (AbstractC93174Ft.A03(activity)) {
                    C58713Q4i.A00((C58713Q4i) this.A02, this.A04);
                    return;
                } else {
                    WGH.A01(activity);
                    ((Fragment) this.A03).onActivityResult(101, 0, null);
                    return;
                }
            case 1:
                ((C35231FgO) this.A01).A04((Activity) this.A03, (AbstractC12990ll) this.A02, this.A04, map);
                return;
            case 2:
                Activity activity2 = (Activity) this.A01;
                if (AbstractC93174Ft.A03(activity2)) {
                    C58713Q4i.A00((C58713Q4i) this.A02, this.A04);
                    return;
                }
                Rb0 rb0 = (Rb0) this.A03;
                java.util.Set set = Rb0.A07;
                AbstractC18680vv abstractC18680vv = rb0.A03;
                if (abstractC18680vv == null || AbstractC31178DnM.A1X(C06090Tz.A05, abstractC18680vv, 2342160724387698170L)) {
                    WGH.A01(activity2);
                }
                rb0.onActivityResult(101, 0, null);
                return;
            default:
                return;
        }
    }
}
