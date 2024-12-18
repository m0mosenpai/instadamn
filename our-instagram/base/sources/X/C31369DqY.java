package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.DqY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31369DqY extends AbstractC65632xz {
    public String A00;
    public String A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C38O A05;
    public final InterfaceC37216GaR A06;
    public final C57582kX A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C31369DqY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38O c38o, InterfaceC37216GaR interfaceC37216GaR, boolean z, boolean z2, boolean z3) {
        AbstractC25233BEq.A0w(2, userSession, interfaceC11380iw, interfaceC37216GaR);
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A06 = interfaceC37216GaR;
        this.A05 = c38o;
        this.A0B = true;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A07 = C57582kX.A00(userSession);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return AbstractC31173DnH.A0p((C47P) obj).hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return this.A07.A0N(((C47P) obj).CDj()).ordinal();
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(533290030);
        AbstractC167027dH.A13(view, obj, obj2);
        Context context = this.A02;
        UserSession userSession = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        Object tag = view.getTag();
        if (tag != null) {
            int A0H = AbstractC166987dD.A0H(obj2);
            boolean z = this.A0B;
            boolean z2 = this.A0A;
            boolean z3 = this.A08;
            InterfaceC37216GaR interfaceC37216GaR = this.A06;
            F7Z.A00(context, interfaceC11380iw, userSession, this.A05, (C34644FOb) tag, interfaceC37216GaR, (C47P) obj, this.A00, this.A01, A0H, z, z2, z3, false, false, this.A09);
            C0f9.A0A(-866389461, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(68397260, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC25225BEi.A1R(obj2);
        AbstractC31176DnK.A1T(anonymousClass306);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1412577948);
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A02), viewGroup, R.layout.row_recommended_user, false);
        A0C.setTag(new C34644FOb(A0C));
        A0C.setId(R.id.recommended_user_row_content_identifier);
        C0f9.A0A(476930172, A0G);
        return A0C;
    }
}
