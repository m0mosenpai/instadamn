package X;

import android.location.Location;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.WlA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70963WlA implements InterfaceC127465pP {
    public final int A00;
    public final Object A01;

    public C70963WlA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
        String str;
        switch (this.A00) {
            case 0:
                C67876V0h c67876V0h = (C67876V0h) this.A01;
                C67876V0h.A04(c67876V0h, true);
                IgdsSwitch igdsSwitch = c67876V0h.A09;
                if (igdsSwitch == null) {
                    str = "useCurrentLocationSwitch";
                } else {
                    PromoteData promoteData = c67876V0h.A05;
                    if (promoteData == null) {
                        str = "promoteData";
                    } else {
                        igdsSwitch.setChecked(promoteData.A0o.A00());
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                ((C70684Wf5) this.A01).A07();
                return;
            default:
                C1VW c1vw = C1VW.A00;
                c1vw.getClass();
                if (c1vw.isAccurateEnough(location)) {
                    ((WlL) this.A01).A02.A0I.invalidate();
                }
                WlL wlL = (WlL) this.A01;
                if (wlL.A00) {
                    WlL.A00(wlL);
                    wlL.A00 = false;
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
    }
}
