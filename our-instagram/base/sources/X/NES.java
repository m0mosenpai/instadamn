package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes9.dex */
public final class NES extends AbstractC66412zI {
    public final Activity A00;
    public final C52251NAq A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_toggle_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56103OvN c56103OvN = (C56103OvN) interfaceC66482zP;
        boolean A1R = AbstractC167007dF.A1R(0, c56103OvN, c3oo);
        C52251NAq c52251NAq = this.A01;
        View A06 = AbstractC31171DnF.A06(c3oo);
        VG4 vg4 = VG4.A1V;
        ViewGroup A0F = AbstractC31173DnH.A0F(A06, R.id.promote_toggle_row_container);
        c52251NAq.A02 = A0F;
        if (A0F != null) {
            c52251NAq.A06 = MSX.A0I(A0F, R.id.promote_row_icon);
            ViewGroup viewGroup = c52251NAq.A02;
            if (viewGroup != null) {
                c52251NAq.A04 = AbstractC166997dE.A0T(viewGroup, R.id.toggle_row_title);
                ViewGroup viewGroup2 = c52251NAq.A02;
                if (viewGroup2 != null) {
                    c52251NAq.A03 = AbstractC166997dE.A0T(viewGroup2, R.id.toggle_row_subtitle);
                    ViewGroup viewGroup3 = c52251NAq.A02;
                    if (viewGroup3 != null) {
                        IgdsSwitch igdsSwitch = (IgdsSwitch) viewGroup3.requireViewById(R.id.toggle_row_switch);
                        c52251NAq.A07 = igdsSwitch;
                        if (igdsSwitch != null) {
                            igdsSwitch.A07 = new P3X(0, vg4, c52251NAq);
                            TextView textView = c52251NAq.A04;
                            if (textView != null) {
                                textView.setText(2131970738);
                                TextView textView2 = c52251NAq.A03;
                                if (textView2 != null) {
                                    textView2.setText(2131970737);
                                    boolean A00 = c52251NAq.A00();
                                    TextView textView3 = c52251NAq.A03;
                                    if (textView3 != null) {
                                        textView3.setVisibility(AbstractC167007dF.A05(A00 ? 1 : 0));
                                    }
                                    if (c56103OvN.A02) {
                                        UserSession userSession = c56103OvN.A00;
                                        IgdsSwitch igdsSwitch2 = c52251NAq.A07;
                                        if (igdsSwitch2 != null) {
                                            Activity activity = this.A00;
                                            C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131964211));
                                            View rootView = igdsSwitch2.getRootView();
                                            C14360o3.A07(rootView);
                                            A0f.A03(rootView);
                                            A0f.A02();
                                            A0f.A0F = A1R;
                                            igdsSwitch2.post(new RunnableC57035PSa(userSession, A0f.A00(), this));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56103OvN.class;
    }

    public NES(Activity activity, C52251NAq c52251NAq) {
        this.A00 = activity;
        this.A01 = c52251NAq;
    }
}
