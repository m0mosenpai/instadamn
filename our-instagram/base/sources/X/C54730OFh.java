package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OFh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54730OFh {
    public AnonymousClass195 A00;
    public final Context A01;
    public final View A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C41181vS A05;
    public final C147696ku A06;
    public final C3DN A07;
    public final O65 A08;
    public final C47923LEs A09;
    public final C54989OTx A0A;
    public final InterfaceC143586dx A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.Khw] */
    public /* synthetic */ C54730OFh(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C41181vS c41181vS, C147696ku c147696ku, InterfaceC143586dx interfaceC143586dx) {
        C3DN A0m = AbstractC25230BEn.A0m(abstractC59962oe);
        Context requireContext = abstractC59962oe.requireContext();
        C14360o3.A0B(userSession, 3);
        this.A02 = view;
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A06 = c147696ku;
        this.A0B = interfaceC143586dx;
        this.A05 = c41181vS;
        this.A07 = A0m;
        this.A01 = requireContext;
        this.A0A = new C54989OTx(view);
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        Context requireContext2 = abstractC59962oe.requireContext();
        ViewGroup viewGroup = (ViewGroup) AbstractC166987dD.A0c(view, R.id.iglive_permissions_container);
        C14360o3.A0B(viewGroup, 1);
        ?? obj = new Object();
        obj.A00 = viewGroup;
        this.A09 = new C47923LEs(requireActivity, requireContext2, userSession, obj);
        this.A0C = AbstractC09440dt.A01(new C57542PgG(this, 44));
        C57542PgG c57542PgG = new C57542PgG(this, 48);
        InterfaceC09390do A01 = C57542PgG.A01(new C57542PgG(abstractC59962oe, 45), EnumC09460dv.A02, 46);
        this.A0D = AbstractC25225BEi.A0a(new C57542PgG(A01, 47), c57542PgG, C57530Pg4.A00(null, A01, 9), AbstractC25225BEi.A1D(C51005MgC.class));
        this.A08 = new O65(this);
    }
}
