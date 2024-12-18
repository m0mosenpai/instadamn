package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.model.reels.Reel;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.User;

/* renamed from: X.Dtt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31567Dtt extends AbstractC65632xz {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final EnumC31556Dtg A07;
    public final InterfaceC37297Gby A08;
    public final C31538DtO A09;
    public final String A0A;
    public final boolean A0B;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Reel reel;
        int intValue;
        int A03 = C0f9.A03(-1603948404);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        User user = (User) obj;
        boolean z = this.A00;
        if (z && user.A2O()) {
            if (C18U.A06(C06090Tz.A05, this.A06, 36325600734229701L)) {
                Integer Bkb = user.Bkb();
                z = false;
                if (Bkb == null || (intValue = Bkb.intValue()) == 0 || intValue == 6) {
                    z = true;
                }
            }
        }
        if (this.A01) {
            reel = C1OU.A01(this.A06, user);
        } else {
            reel = null;
        }
        UserSession userSession = this.A06;
        if (C18U.A06(C06090Tz.A05, userSession, 36326605756315630L)) {
            Context context = this.A04;
            IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) view;
            InterfaceC11380iw interfaceC11380iw = this.A05;
            InterfaceC37297Gby interfaceC37297Gby = this.A08;
            C14360o3.A0B(context, 0);
            C14360o3.A0B(igdsPeopleCell, 1);
            C14360o3.A0B(userSession, 2);
            C14360o3.A0B(user, 3);
            C14360o3.A0B(interfaceC11380iw, 4);
            C14360o3.A0B(interfaceC37297Gby, 5);
            View inflate = LayoutInflater.from(context).inflate(R.layout.follow_button_large, (ViewGroup) igdsPeopleCell, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
            FollowButtonBase followButtonBase = (FollowButtonBase) inflate;
            followButtonBase.setBaseStyle(EnumC77553df.A0C);
            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButtonBase.A0J;
            viewOnAttachStateChangeListenerC110564yT.A0Q = false;
            viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
            EZM ezm = new EZM(context, new ViewOnClickListenerC35672Fp7(19, interfaceC37297Gby, user, z), C05F.A01, C05F.A0C, AbstractC53242c7.A08(context));
            igdsPeopleCell.A02(null, user);
            igdsPeopleCell.A05(followButtonBase, ezm);
            C0fQ.A00(new ViewOnClickListenerC35670Fp5(4, interfaceC37297Gby, user), igdsPeopleCell);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                InterfaceC37297Gby interfaceC37297Gby2 = this.A08;
                Activity activity = this.A03;
                Context context2 = this.A04;
                InterfaceC11380iw interfaceC11380iw2 = this.A05;
                boolean z2 = this.A02;
                AbstractC31578Du6.A01(activity, context2, interfaceC11380iw2, userSession, reel, user, this.A07, (C34958Fai) obj2, interfaceC37297Gby2, (C31579Du7) tag, this.A09, z, false, z2, this.A0B);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
                C0f9.A0A(1997112206, A03);
                throw illegalStateException;
            }
        }
        C0f9.A0A(-1905463056, A03);
    }

    public C31567Dtt(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC31556Dtg enumC31556Dtg, InterfaceC37297Gby interfaceC37297Gby, C31538DtO c31538DtO, String str, boolean z) {
        this.A03 = activity;
        this.A04 = context;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A08 = interfaceC37297Gby;
        this.A07 = enumC31556Dtg;
        this.A0A = str;
        this.A09 = c31538DtO;
        this.A0B = z;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A00;
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1082575206);
        if (C18U.A06(C06090Tz.A05, this.A06, 36326605756315630L)) {
            A00 = new IgdsPeopleCell(AbstractC166997dE.A0L(viewGroup), false);
        } else {
            A00 = AbstractC31578Du6.A00(this.A04, viewGroup);
        }
        C0f9.A0A(-2085453976, A0G);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
