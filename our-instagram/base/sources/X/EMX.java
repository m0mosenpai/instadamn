package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import java.text.NumberFormat;

/* loaded from: classes6.dex */
public final class EMX extends AbstractC59962oe implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "CreateOrderFragment";
    public UserSession A00;
    public FGJ A01;
    public String A02;
    public String A03;
    public C34541FKb A04;
    public String A05;

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_create_order_fragment";
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1471926848);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A05 = requireArguments.getString("consumer_id");
        this.A04 = new C34541FKb(this.A00, "direct_create_order_fragment");
        C0f9.A09(705145339, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1616452257);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.create_order_view);
        C0f9.A09(368108460, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgFormField A0k = AbstractC31172DnG.A0k(view, R.id.total_price);
        A0k.setInputType(2);
        UserSession userSession = this.A00;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36315864043163288L)) {
            A0k.A0G();
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(C1Q2.A02());
        A0k.setMaxLength(AbstractC167007dF.A0A(currencyInstance.format(Double.parseDouble("2147483647") / Math.pow(10.0d, currencyInstance.getCurrency().getDefaultFractionDigits()))) - 1);
        A0k.A0H(new C35468Fl3(4, A0k, this));
        AbstractC31172DnG.A0k(view, R.id.notes).A0H(new C35469Fl4(this, 17));
        String str = this.A05;
        if (str != null) {
            C34541FKb c34541FKb = this.A04;
            String str2 = this.A00.userId;
            C14360o3.A0B(str2, 0);
            AbstractC31181DnP.A0v(c34541FKb.A01, "biig_order_management_create_order_form_impression", str2, str);
        }
    }
}
