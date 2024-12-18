package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160637Hx {
    public int A00;
    public C7IK A01;
    public boolean A02;
    public boolean A03;
    public final Activity A04;
    public final Context A05;
    public final View.OnClickListener A06;
    public final ViewStub A07;
    public final UserSession A08;
    public final C159817Et A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC16820sZ A0F;
    public final ViewGroup A0G;

    public C160637Hx(Activity activity, Context context, ViewGroup viewGroup, ViewStub viewStub, UserSession userSession, C159817Et c159817Et, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(viewStub, 1);
        C14360o3.A0B(interfaceC16820sZ, 5);
        C14360o3.A0B(viewGroup, 7);
        this.A07 = viewStub;
        this.A04 = activity;
        this.A05 = context;
        this.A08 = userSession;
        this.A0F = interfaceC16820sZ;
        this.A09 = c159817Et;
        this.A0G = viewGroup;
        this.A0B = C1XM.A00(new C9E1(this, 1));
        this.A0D = C1XM.A00(new C9E1(this, 3));
        this.A0C = C1XM.A00(new C9E1(this, 2));
        this.A0A = C1XM.A00(new C9E1(this, 0));
        this.A0E = AbstractC09440dt.A01(new C9E1(this, 4));
        this.A06 = new View.OnClickListener() { // from class: X.7Hy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                int A05 = C0f9.A05(-1226128110);
                C160637Hx c160637Hx = C160637Hx.this;
                DirectThreadKey directThreadKey = (DirectThreadKey) c160637Hx.A0F.invoke();
                if (directThreadKey == null) {
                    i = -1551754344;
                } else {
                    Activity activity2 = c160637Hx.A04;
                    AbstractC13880nE.A0K(activity2);
                    KDL kdl = new KDL();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(AbstractC43591JPw.A00(16), directThreadKey);
                    kdl.setArguments(bundle);
                    C189448aO c189448aO = new C189448aO(c160637Hx.A08);
                    c189448aO.A0d = c160637Hx.A05.getString(2131960399);
                    c189448aO.A1G = true;
                    c189448aO.A0T = kdl;
                    C7IK c7ik = c160637Hx.A01;
                    if (c7ik != null) {
                        int i2 = c7ik.A02;
                        c189448aO.A09 = i2;
                        c189448aO.A06 = i2;
                    }
                    c189448aO.A00().A02(activity2, kdl);
                    C7G0 c7g0 = (C7G0) c160637Hx.A0E.getValue();
                    C81663kb A03 = C2DU.A03((C2DU) C2JD.A00(c7g0.A01), directThreadKey);
                    C7FR c7fr = (C7FR) c7g0.A04.getValue();
                    InterfaceC83733oI A052 = JRE.A05(directThreadKey);
                    c7fr.A00(EnumC46270Ke2.TAP, AbstractC34774FTx.A00(A03), A052, null, "scheduled_tray", "composer", directThreadKey.A02, null);
                    i = 1406915994;
                }
                C0f9.A0C(i, A05);
            }
        };
    }

    private final boolean A00() {
        C12500ku c12500ku = new C12500ku(this.A0G);
        while (c12500ku.hasNext()) {
            View view = (View) c12500ku.next();
            if (view.getVisibility() == 0 && !view.equals(this.A0B.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void A01() {
        View view;
        if (this.A00 > 0 && !this.A03 && !A00()) {
            int i = this.A00;
            InterfaceC09390do interfaceC09390do = this.A0D;
            ((TextView) interfaceC09390do.getValue()).setText(this.A05.getResources().getQuantityString(R.plurals.direct_scheduled_message_bar_header, i, Integer.valueOf(i)));
            InterfaceC09390do interfaceC09390do2 = this.A0B;
            View view2 = (View) interfaceC09390do2.getValue();
            Context context = ((View) interfaceC09390do2.getValue()).getContext();
            C14360o3.A07(context);
            view2.measure(View.MeasureSpec.makeMeasureSpec(AbstractC13880nE.A0A(context), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (((View) interfaceC09390do2.getValue()).getVisibility() == 0) {
                view = (TextView) interfaceC09390do.getValue();
            } else {
                view = (ViewGroup) interfaceC09390do2.getValue();
            }
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            A01.A0G();
            AbstractC125325le A0F = A01.A0F(true);
            A0F.A0T(r1.getMeasuredHeight(), 0.0f);
            A0F.A04 = 0;
            A0F.A0H();
            C7IK c7ik = this.A01;
            if (c7ik != null) {
                A02(c7ik);
            }
            if (!this.A02) {
                C7G0 c7g0 = (C7G0) this.A0E.getValue();
                C18920wW c18920wW = c7g0.A00;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_schedule_tray_impression");
                if (A00.isSampled()) {
                    A00.AAP("open_thread_id", c7g0.A02);
                    A00.Cht();
                }
                this.A02 = true;
                return;
            }
            return;
        }
        InterfaceC09390do interfaceC09390do3 = this.A0B;
        if (!interfaceC09390do3.CWa() || ((View) interfaceC09390do3.getValue()).getVisibility() != 0) {
            return;
        }
        if (!A00()) {
            C159737El.A0h(this.A09.A00, 0);
        }
        ((View) interfaceC09390do3.getValue()).setVisibility(8);
    }

    public final void A02(C7IK c7ik) {
        int i;
        InterfaceC09390do interfaceC09390do = this.A0B;
        if (interfaceC09390do.CWa() && ((View) interfaceC09390do.getValue()).getVisibility() == 0) {
            ((View) interfaceC09390do.getValue()).setBackgroundColor(c7ik.A02);
            ((View) this.A0C.getValue()).setBackgroundColor(c7ik.A08);
            TextView textView = (TextView) this.A0D.getValue();
            int i2 = c7ik.A0D;
            textView.setTextColor(i2);
            ((ImageView) this.A0A.getValue()).setColorFilter(i2);
            C159737El c159737El = this.A09.A00;
            C7IK c7ik2 = c159737El.A0U;
            if (c7ik2 != null) {
                i = c7ik2.A02;
            } else {
                i = 0;
            }
            C159737El.A0h(c159737El, i);
        }
        this.A01 = c7ik;
    }
}
