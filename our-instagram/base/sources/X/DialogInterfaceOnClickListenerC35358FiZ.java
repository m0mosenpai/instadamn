package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.FiZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35358FiZ implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public DialogInterfaceOnClickListenerC35358FiZ(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A05 = z;
        this.A02 = obj2;
        this.A01 = obj;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        switch (this.A00) {
            case 0:
                C2ED c2ed = (C2ED) this.A02;
                String C7I = c2ed.C7I();
                if (this.A05 && C7I != null) {
                    AbstractC34146F4w.A00(((C31280Dp2) this.A04).A03, C7I, AbstractC31171DnF.A0g(this.A03));
                }
                C31280Dp2 c31280Dp2 = (C31280Dp2) this.A04;
                String moduleName = c31280Dp2.A02.getModuleName();
                User user = (User) this.A03;
                C35199Ffr c35199Ffr = new C35199Ffr(null, null, Boolean.valueOf(c2ed.isPending()), Boolean.valueOf(c2ed.CVQ()), moduleName, "direct_thread", user.B7L().name(), C7I, "DEFAULT", "DEFAULT", AbstractC166997dE.A0n(), user.BJ8());
                Context context = c31280Dp2.A00;
                UserSession userSession = c31280Dp2.A03;
                F7C.A00(context, c31280Dp2.A01, null, userSession, new FJ7(c2ed.Aa2().contains(userSession.userId), c2ed.C7g()), null, null, user, c35199Ffr, null, new C36765GIo(this.A01, 0));
                return;
            case 1:
                if (this.A05) {
                    C35244Fgd.A00((Activity) this.A01, (Context) this.A02, (UserSession) this.A04);
                    return;
                } else {
                    ((GZ5) this.A03).DWw(new C32071E6x(1));
                    return;
                }
            default:
                C54696ODy c54696ODy = (C54696ODy) this.A01;
                boolean z = this.A05;
                if (z) {
                    str = "deep_delete_click";
                } else {
                    str = "ig_delete_click";
                }
                AbstractC54123NwL.A00(c54696ODy, str, "dialog", null, z);
                C55908Orz c55908Orz = (C55908Orz) this.A04;
                UserSession userSession2 = c55908Orz.A07;
                AbstractC54126NwO.A00(userSession2).A01();
                InterfaceC145276gm interfaceC145276gm = (InterfaceC145276gm) this.A02;
                Reel reel = (Reel) this.A03;
                C41181vS c41181vS = c55908Orz.A0A;
                interfaceC145276gm.D9p(reel, c41181vS);
                if (c41181vS.CY4()) {
                    Activity activity = c55908Orz.A01;
                    new C55084Oag(activity, c55908Orz.A04, userSession2, c41181vS).A02(c55908Orz.A00, c54696ODy, z, true);
                    C38321qM c38321qM = c55908Orz.A08;
                    if (c38321qM != null) {
                        CreativeConfigIntf Asm = c38321qM.A0C.Asm();
                        if (Asm != null && AbstractC121575f6.A03(Asm) == EnumC138476Pd.A05) {
                            activity.setResult(9690);
                            return;
                        }
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                if (c41181vS.A1Z()) {
                    C105814ps c105814ps = c41181vS.A0d;
                    if (c105814ps != null) {
                        if (C18U.A06(C06090Tz.A05, userSession2, 36318913470077711L) && !c41181vS.A17() && c105814ps.A00.A0m()) {
                            C9GR.A0F(c55908Orz.A01, "cancel_story_upload_unable_to_cancel", 2131954764);
                            return;
                        }
                        Activity activity2 = c55908Orz.A01;
                        AbstractC54129NwR.A00(activity2, userSession2, c105814ps, reel);
                        C9GR.A0F(activity2, "cancel_story_upload_unable_to_cancel", 2131954765);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                AbstractC54126NwO.A00(userSession2).A03(TraceFieldType.FailureReason, "unknown_failure");
                AbstractC54126NwO.A00(userSession2).A04("unknown_failure", AnonymousClass001.A0R(AbstractC111324zv.A00(1726), c41181vS.A0e.name()));
                return;
        }
    }
}
