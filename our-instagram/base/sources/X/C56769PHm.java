package X;

import android.app.Activity;
import android.view.Window;

/* renamed from: X.PHm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56769PHm implements C7XU {
    public final int A00;
    public final Object A01;

    public C56769PHm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C7XU
    public final void DAy() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                N7J n7j = (N7J) this.A01;
                if (n7j.A03) {
                    return;
                }
                OOJ.A00(AbstractC166987dD.A0r(n7j.A06), n7j.A01, "comment_hidden_nux_dismiss");
                C54592O9t c54592O9t = n7j.A00;
                if (c54592O9t == null) {
                    return;
                }
                C25814BbV c25814BbV = c54592O9t.A00;
                c25814BbV.A0A.A0M(c54592O9t.A01, c54592O9t.A02);
                return;
            case 2:
                InterfaceC149856oe interfaceC149856oe = ((C55907Ory) ((C56771PHo) this.A01).A01).A0E;
                if (interfaceC149856oe == null) {
                    return;
                }
                interfaceC149856oe.Dkc();
                return;
            case 3:
                InterfaceC24901Jp interfaceC24901Jp = (InterfaceC24901Jp) this.A01;
                if (!interfaceC24901Jp.isActive()) {
                    return;
                }
                interfaceC24901Jp.resumeWith(C0eB.A00);
                return;
            case 4:
                ((Activity) this.A01).finish();
                return;
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
        }
    }

    @Override // X.C7XU
    public final void DB3() {
        Activity activity;
        Window window;
        if (this.A00 == 0 && (activity = (Activity) this.A01) != null && (window = activity.getWindow()) != null) {
            C04L.A00(window, false);
        }
    }
}
