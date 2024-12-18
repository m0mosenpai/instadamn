package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Jh4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44259Jh4 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new IgdsSwitch(context, null, 0);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        IgdsSwitch igdsSwitch = (IgdsSwitch) view;
        boolean A1b = AbstractC25233BEq.A1b(igdsSwitch, c6fg, c102884kP);
        String A0G = c102884kP.A0G();
        boolean z = true;
        boolean A0U = c102884kP.A0U(A1b);
        if (A0G == null || !A0G.equals("on")) {
            z = false;
        }
        igdsSwitch.setOnCheckedChangeListener(null);
        igdsSwitch.setChecked(z);
        InterfaceC103384lE A0B = c102884kP.A0B(40);
        if (A0B != null) {
            igdsSwitch.A07 = new C49503LuG(c6fg, c102884kP, A0B, A0G);
        }
        igdsSwitch.setOnCheckedChangeListener(new LRF(0, c102884kP, c6fg));
        igdsSwitch.setEnabled(A0U);
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        IgdsSwitch igdsSwitch = (IgdsSwitch) view;
        C14360o3.A0B(igdsSwitch, 0);
        igdsSwitch.setOnCheckedChangeListener(null);
        igdsSwitch.A07 = null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public C44259Jh4(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
