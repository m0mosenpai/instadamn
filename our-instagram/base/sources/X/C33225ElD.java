package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ElD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33225ElD extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AppUpdatesFragment";
    public SXA A00;
    public C23031Ai A01;
    public C34965Fap A02;
    public C36731GHa A03;
    public C36731GHa A04;
    public C36731GHa A05;
    public UserSession A06;
    public final List A07 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "app_updates_settings";
    }

    public static void A00(C33225ElD c33225ElD) {
        boolean A1y = c33225ElD.A01.A1y();
        List list = c33225ElD.A07;
        if (A1y) {
            list.remove(c33225ElD.A02);
        } else {
            list.add(1, c33225ElD.A02);
        }
        c33225ElD.setItems(list);
    }

    public static void A01(C33225ElD c33225ElD, C36731GHa c36731GHa, boolean z, boolean z2) {
        C1GJ.A03(new C60939Rbt(c33225ElD, c36731GHa, z, z2));
    }

    public static void A02(C33225ElD c33225ElD, boolean z) {
        if (c33225ElD.A00 != null) {
            boolean A1y = c33225ElD.A01.A1y();
            SXA sxa = c33225ElD.A00;
            if (A1y != sxa.A02) {
                sxa.A02 = A1y;
                A01(c33225ElD, null, A1y, false);
            }
            boolean z2 = c33225ElD.A01.A01.getBoolean(AbstractC58317Pt9.A00(331), true);
            SXA sxa2 = c33225ElD.A00;
            if (z2 != sxa2.A04) {
                sxa2.A04 = z2;
                A01(c33225ElD, null, z2, false);
            }
            boolean z3 = c33225ElD.A01.A01.getBoolean(AbstractC58317Pt9.A00(47), true);
            SXA sxa3 = c33225ElD.A00;
            if (z3 != sxa3.A05) {
                sxa3.A05 = z3;
                A01(c33225ElD, null, z3, false);
            }
        }
        C36731GHa A03 = C36731GHa.A03(new C35745Fqd(c33225ElD, 37), c33225ElD, 28, 2131953401, c33225ElD.A01.A1y());
        c33225ElD.A05 = A03;
        if (z) {
            A03.A0E = true;
            A03.A0D = false;
        }
        List list = c33225ElD.A07;
        list.add(A03);
        list.add(new C35246Fgf(c33225ElD.getString(2131953397)));
        C34965Fap c34965Fap = new C34965Fap(c33225ElD.getString(2131953405));
        c33225ElD.A02 = c34965Fap;
        c34965Fap.A01 = 16;
        c34965Fap.A05 = new C34626FNj(AbstractC166997dE.A0N(c33225ElD).getDimensionPixelSize(R.dimen.add_account_icon_circle_radius), AbstractC166997dE.A0N(c33225ElD).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), AbstractC31177DnL.A02(c33225ElD, R.dimen.add_account_icon_circle_radius), AbstractC31177DnL.A02(c33225ElD, R.dimen.abc_dialog_padding_top_material), AbstractC31177DnL.A02(c33225ElD, R.dimen.add_account_icon_circle_radius), AbstractC31177DnL.A02(c33225ElD, R.dimen.add_account_icon_circle_radius));
        c33225ElD.A02.A04 = new ColorDrawable(c33225ElD.getContext().getColor(R.color.row_warning_background));
        c33225ElD.A02.A03 = R.style.FullPriceSubtitleStyle;
        A00(c33225ElD);
        list.add(C31335Dq0.A00(2131953404));
        C36731GHa A032 = C36731GHa.A03(new C35745Fqd(c33225ElD, 39), c33225ElD, 29, 2131953394, c33225ElD.A01.A01.getBoolean(AbstractC58317Pt9.A00(331), true));
        c33225ElD.A03 = A032;
        if (z) {
            A032.A0E = true;
            A032.A0D = false;
        }
        list.add(A032);
        list.add(new C35246Fgf(c33225ElD.getString(2131953393)));
        if (!C1AD.A06(C06090Tz.A05, 18301276555054576L)) {
            C36731GHa c36731GHa = new C36731GHa(new C35745Fqd(c33225ElD, 38), c33225ElD.getString(2131953396), c33225ElD.A01.A01.getBoolean(AbstractC58317Pt9.A00(47), true));
            c33225ElD.A04 = c36731GHa;
            if (z) {
                c36731GHa.A0E = true;
                c36731GHa.A0D = false;
            }
            list.add(c36731GHa);
            list.add(new C35246Fgf(c33225ElD.getString(2131953395)));
        }
        if (z) {
            list.add(0, new Object());
            AbstractC31174DnI.A0G(c33225ElD).setPadding(0, 0, 0, AbstractC167017dG.A0E(c33225ElD.requireContext()));
        }
        c33225ElD.setItems(list);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952996);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A06;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1906209947);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A06 = A0S;
        this.A01 = AbstractC23021Ah.A00(A0S);
        C0f9.A09(639307350, A02);
    }

    @Override // X.AbstractC33235ElU, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1962246541);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.appupdate_settings_layout);
        C1GJ.A03(new C60940Rbu(this, 2));
        C0f9.A09(71232756, A02);
        return A0A;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(918940991);
        super.onResume();
        setItems(this.A07);
        C0f9.A09(1716995254, A02);
    }
}
