package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ESB extends AbstractC65632xz {
    public InterfaceC11380iw A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final InterfaceC1570173f A05;
    public final Integer A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return AbstractC31171DnF.A0g(obj).hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        if (!this.A08) {
            return Integer.MIN_VALUE;
        }
        return ((User) obj).B7L().ordinal();
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Reel reel;
        int A03 = C0f9.A03(-2048352143);
        AbstractC167017dG.A1P(view, obj);
        User user = (User) obj;
        if (this.A02) {
            reel = C1OU.A01(this.A04, user);
        } else {
            reel = null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            UserSession userSession = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Int");
            boolean z = this.A0A;
            boolean z2 = this.A08;
            boolean z3 = this.A09;
            Integer num = this.A06;
            boolean z4 = this.A07;
            InterfaceC1570173f interfaceC1570173f = this.A05;
            boolean z5 = this.A01;
            FOT fot = new FOT(interfaceC11380iw, userSession, interfaceC1570173f);
            fot.A00 = reel;
            fot.A08 = z;
            fot.A06 = z2;
            fot.A07 = z3;
            fot.A01 = num;
            fot.A04 = z4;
            fot.A05 = z5;
            AbstractC35187Fff.A03(user, (FOZ) tag, fot, (Integer) obj2);
            C0f9.A0A(462718560, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(370311666, A03);
        throw A0g;
    }

    public ESB(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1570173f interfaceC1570173f, Integer num, boolean z, boolean z2) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A03 = context;
        this.A04 = userSession;
        this.A00 = interfaceC11380iw;
        this.A05 = interfaceC1570173f;
        this.A0A = A1V;
        this.A08 = A1V;
        this.A09 = z;
        this.A06 = num;
        this.A07 = z2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC25225BEi.A1R(obj2);
        AbstractC31176DnK.A1T(anonymousClass306);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -559539791);
        ViewGroup A01 = AbstractC35187Fff.A01(this.A03, viewGroup);
        C0f9.A0A(-1935236105, A0G);
        return A01;
    }
}
