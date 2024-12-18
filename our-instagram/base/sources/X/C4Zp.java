package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4Zp, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Zp extends C3PD implements C3PB, InterfaceC97554Zq {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageView A03;
    public LinearLayout A04;
    public TextView A05;
    public C3PF A06;
    public C3PF A07;
    public C41181vS A08;
    public C84823qW A09;
    public InterfaceC97544Zo A0A;
    public C141596ac A0B;
    public final ViewStub A0E;
    public String A0D = null;
    public String A0C = null;

    @Override // X.C3PB
    public final void D0H(C3PF c3pf) {
    }

    @Override // X.C3PB
    public final void D0I(C3PF c3pf) {
    }

    @Override // X.C3PB
    public final void DgY(C3PF c3pf) {
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        float f;
        C220789p2 c220789p2;
        int i;
        C3PF c3pf = this.A06;
        if (c3pf != null) {
            c3pf.A01 = true;
        }
        C3PF c3pf2 = this.A07;
        if (c3pf2 != null) {
            c3pf2.A01 = true;
        }
        ImageView imageView = this.A03;
        if (imageView != null && (c220789p2 = (C220789p2) imageView.getDrawable()) != null) {
            if (view == this.A00) {
                i = 0;
            } else {
                i = 1;
            }
            c220789p2.A0E = i;
            c220789p2.invalidateSelf();
        }
        C141596ac c141596ac = this.A0B;
        if (c141596ac != null) {
            f = (c141596ac.A0A / 1000.0f) * c141596ac.A0B;
        } else {
            f = 0.0f;
        }
        C84823qW c84823qW = this.A09;
        InterfaceC97544Zo interfaceC97544Zo = this.A0A;
        if (interfaceC97544Zo != null && c84823qW != null) {
            C101394gx A0D = c84823qW.A0D();
            A0D.getClass();
            String str = this.A0D;
            String str2 = this.A0C;
            int i2 = 1;
            if (view == this.A00) {
                i2 = 0;
            }
            interfaceC97544Zo.DZY(this.A08, A0D, this, str, str2, f, i2);
        }
        return true;
    }

    public final C3PF A00(View view) {
        C3P9 c3p9 = new C3P9(view);
        List list = c3p9.A0F;
        list.clear();
        list.add(this);
        c3p9.A0D = true;
        c3p9.A07 = true;
        c3p9.A08 = false;
        c3p9.A02 = 0.85f;
        C55942hf c55942hf = AbstractC97584Zt.A00;
        C14360o3.A0B(c55942hf, 0);
        c3p9.A03 = c55942hf;
        c3p9.A04 = this;
        return c3p9.A00();
    }

    public final void A01() {
        ViewGroup viewGroup = this.A02;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // X.C3PB
    public final void D0J(C3PF c3pf) {
        C220789p2 c220789p2;
        float f = (float) c3pf.A07.A09.A00;
        ImageView imageView = this.A03;
        if (imageView != null && (c220789p2 = (C220789p2) imageView.getDrawable()) != null) {
            if (c3pf.A06 == this.A00) {
                c220789p2.A00 = f;
            } else {
                c220789p2.A01 = f;
            }
            c220789p2.invalidateSelf();
        }
    }

    @Override // X.InterfaceC97554Zq
    public final void EoG(UserSession userSession, Runnable runnable) {
        int[] iArr;
        C84823qW c84823qW = this.A09;
        if (c84823qW != null) {
            C101394gx A0D = c84823qW.A0D();
            A0D.getClass();
            iArr = AbstractC140306Wi.A04(userSession, A0D, true);
        } else {
            iArr = null;
        }
        ImageView imageView = this.A03;
        imageView.getClass();
        Drawable drawable = imageView.getDrawable();
        if (iArr != null) {
            drawable.getClass();
            ((C220789p2) drawable).A0C(iArr);
        }
        drawable.getClass();
        C220789p2 c220789p2 = (C220789p2) drawable;
        c220789p2.A0F = runnable;
        c220789p2.A0i.A03();
    }

    public C4Zp(ViewStub viewStub) {
        this.A0E = viewStub;
    }
}
