package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fiw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35381Fiw implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DialogInterface.OnDismissListener A01;
    public final /* synthetic */ AbstractC10360h2 A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ Reel A05;
    public final /* synthetic */ C41181vS A06;
    public final /* synthetic */ C54696ODy A07;
    public final /* synthetic */ InterfaceC145276gm A08;
    public final /* synthetic */ boolean A09;

    public DialogInterfaceOnClickListenerC35381Fiw(Activity activity, DialogInterface.OnDismissListener onDismissListener, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Reel reel, C41181vS c41181vS, C54696ODy c54696ODy, InterfaceC145276gm interfaceC145276gm, boolean z) {
        this.A07 = c54696ODy;
        this.A09 = z;
        this.A04 = userSession;
        this.A08 = interfaceC145276gm;
        this.A05 = reel;
        this.A06 = c41181vS;
        this.A00 = activity;
        this.A02 = abstractC10360h2;
        this.A01 = onDismissListener;
        this.A03 = interfaceC11380iw;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C54696ODy c54696ODy = this.A07;
        boolean z = this.A09;
        if (z) {
            str = "deep_delete_click";
        } else {
            str = "ig_delete_click";
        }
        AbstractC54123NwL.A00(c54696ODy, str, "dialog", null, z);
        UserSession userSession = this.A04;
        AbstractC54126NwO.A00(userSession).A01();
        InterfaceC145276gm interfaceC145276gm = this.A08;
        Reel reel = this.A05;
        C41181vS c41181vS = this.A06;
        interfaceC145276gm.D9p(reel, c41181vS);
        if (c41181vS.CY4()) {
            Activity activity = this.A00;
            new C55084Oag(activity, this.A02, userSession, c41181vS).A02(this.A01, c54696ODy, z, true);
            C38321qM c38321qM = c41181vS.A0b;
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
                if (C18U.A06(C06090Tz.A05, userSession, 36318913470077711L) && !c41181vS.A17() && c105814ps.A00.A0m()) {
                    C9GR.A0F(this.A00, "cancel_story_upload_unable_to_cancel", 2131954764);
                    return;
                }
                Activity activity2 = this.A00;
                AbstractC54129NwR.A00(activity2, userSession, c105814ps, reel);
                C9GR.A07(activity2, 2131954765);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        AbstractC54126NwO.A00(userSession).A03(TraceFieldType.FailureReason, "unknown_failure");
        AbstractC54126NwO.A00(userSession).A04("unknown_failure", AnonymousClass001.A0R(AbstractC111324zv.A00(1726), c41181vS.A0e.name()));
    }
}
