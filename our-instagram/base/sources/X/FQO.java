package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FQO {
    public View.OnClickListener A00;
    public List A01 = AbstractC166987dD.A1E();
    public final Context A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final FPU A05;

    public final ViewModelListUpdate A00(FMW fmw, List list) {
        Object c56120Ovf;
        C1571273r c1571273r;
        EnumC153216up enumC153216up;
        ArrayList A12 = AbstractC166997dE.A12(fmw, 1);
        InterfaceC223716s C45 = AbstractC31171DnF.A0T(this.A04, C17060sy.A01).C45();
        if (C45 != null && AbstractC166997dE.A1Z(C45.CQe(), true) && AbstractC166987dD.A1b(this.A01)) {
            Context context = this.A02;
            String A0t = AbstractC31174DnI.A0t(context, AbstractC31176DnK.A0t(this.A01, 0), context.getString(2131974970), 2131974969);
            C14360o3.A07(A0t);
            A12.add(new C32625EXz(new Em1(this, AbstractC31174DnI.A02(context)), A0t, AbstractC166997dE.A0p(context, 2131974970)));
        }
        if (list.isEmpty()) {
            if (fmw.A02) {
                Context context2 = this.A02;
                c1571273r = new C1571273r();
                c1571273r.A00 = AbstractC53242c7.A00(context2);
                enumC153216up = EnumC153216up.A06;
            } else if (fmw.A03) {
                Context context3 = this.A02;
                View.OnClickListener onClickListener = this.A00;
                if (onClickListener != null) {
                    c1571273r = new C1571273r();
                    c1571273r.A00 = AbstractC53242c7.A00(context3);
                    c1571273r.A02 = R.drawable.loadmore_icon_refresh_compound;
                    c1571273r.A05 = onClickListener;
                    enumC153216up = EnumC153216up.A04;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                boolean z = !fmw.A01;
                Context context4 = this.A02;
                if (z) {
                    c56120Ovf = new C32624EXy(context4.getString(2131974871), context4.getString(2131974870));
                } else {
                    c1571273r = new C1571273r();
                    c1571273r.A00 = AbstractC53242c7.A00(context4);
                    c1571273r.A07 = context4.getString(2131953928);
                    enumC153216up = EnumC153216up.A02;
                }
            }
            c56120Ovf = new C39094HIs(c1571273r, enumC153216up);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A12.add(this.A05.A00((EB0) it.next()));
            }
            if (!fmw.A01) {
                Context context5 = this.A02;
                A12.add(new C32624EXy(context5.getString(2131974871), context5.getString(2131974870)));
            }
            EnumC33419Epq enumC33419Epq = fmw.A00;
            if (enumC33419Epq == null) {
                if (!fmw.A01) {
                    enumC33419Epq = EnumC33419Epq.NONE;
                } else if (fmw.A03) {
                    enumC33419Epq = EnumC33419Epq.RETRY;
                } else if (fmw.A02) {
                    enumC33419Epq = EnumC33419Epq.LOADING;
                } else {
                    enumC33419Epq = EnumC33419Epq.LOAD_MORE;
                }
                fmw.A00 = enumC33419Epq;
            }
            c56120Ovf = new C56120Ovf(enumC33419Epq, MSV.A00(507));
        }
        A12.add(c56120Ovf);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        A0E.A01(A12);
        return A0E;
    }

    public FQO(Context context, FragmentActivity fragmentActivity, UserSession userSession, FPU fpu) {
        this.A02 = context;
        this.A03 = fragmentActivity;
        this.A04 = userSession;
        this.A05 = fpu;
    }
}
