package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.AOa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC23161AOa implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DialogInterfaceOnClickListenerC23161AOa(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A04, 36328139059969243L)) {
                    AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                    Object obj = this.A02;
                    Object obj2 = this.A03;
                    AbstractC166987dD.A1Z(new C57160PZe(obj2, obj, abstractC52922bZ, (InterfaceC23621Ds) null, 29), AbstractC141776au.A00(abstractC52922bZ));
                    return;
                }
                return;
            case 1:
                C159497Dk c159497Dk = (C159497Dk) this.A04;
                MessageIdentifier messageIdentifier = (MessageIdentifier) this.A03;
                C83693oE c83693oE = (C83693oE) this.A01;
                C159497Dk.A00(c159497Dk, c83693oE, messageIdentifier);
                C48256LXf A00 = AbstractC46705KlO.A00(c159497Dk.A01);
                C2EY c2ey = null;
                String valueOf = String.valueOf(c83693oE.A00);
                C83403nh c83403nh = (C83403nh) this.A02;
                if (c83403nh != null) {
                    c2ey = c83403nh.A10;
                }
                A00.A01(valueOf, String.valueOf(c2ey), "continue");
                return;
            default:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01((AbstractC59962oe) this.A02, abstractC12990ll), "ig_cg_click_create_story_profile_dialog_prompt");
                String A002 = AbstractC111324zv.A00(1710);
                A0f.AAP("source_name", A002);
                A0f.Cht();
                C22P c22p = C22P.A2u;
                User user = (User) this.A03;
                Context context = (Context) this.A01;
                Bundle A0b = AbstractC166987dD.A0b();
                C88X c88x = new C88X(new C189128Zd(null, null, C88Z.A0K, null, null, AbstractC209909Qc.A01(context, user, A002).A00, "", null));
                try {
                    A0b.putString("create_mode_attribution", ADL.A00(c88x));
                    C82R.A01(A0b, c22p);
                    C6XJ A02 = C6XJ.A02((Activity) context, A0b, abstractC12990ll, TransparentModalActivity.class, "attribution_quick_camera_fragment");
                    A02.A07();
                    A02.A0C(context);
                    return;
                } catch (IOException e) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append(AbstractC111324zv.A00(635));
                    C88Z c88z = c88x.A04;
                    if (c88z == null) {
                        c88z = C88Z.A0G;
                    }
                    C0w9.A06(AbstractC111324zv.A00(1258), AbstractC166997dE.A0v(c88z, A1C), e);
                    return;
                }
        }
    }
}
