package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.NAq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52251NAq extends AbstractC60592pi {
    public Activity A00;
    public Context A01;
    public ViewGroup A02;
    public TextView A03;
    public TextView A04;
    public C1GL A05;
    public IgSimpleImageView A06;
    public IgdsSwitch A07;
    public O3I A08;
    public String A09;
    public boolean A0A;
    public final C70399WUb A0B;
    public final C1P1 A0C;
    public final UserSession A0D;
    public final String A0E;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A01 = null;
        this.A00 = null;
        this.A09 = null;
        this.A08 = null;
        this.A05 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A02 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A07 = null;
    }

    public C52251NAq(Activity activity, Context context, UserSession userSession, C1GL c1gl, O3I o3i, String str) {
        C14360o3.A0B(userSession, 1);
        this.A0D = userSession;
        this.A01 = context;
        this.A00 = activity;
        this.A05 = c1gl;
        this.A09 = str;
        this.A08 = o3i;
        C70399WUb A00 = C70399WUb.A00(userSession);
        C14360o3.A07(A00);
        this.A0B = A00;
        this.A0E = "videox_sharesheet";
        this.A0C = new C50689MZh(this, 5);
    }

    public final boolean A00() {
        IgdsSwitch igdsSwitch = this.A07;
        if (igdsSwitch != null && igdsSwitch.isChecked()) {
            return true;
        }
        return false;
    }
}
