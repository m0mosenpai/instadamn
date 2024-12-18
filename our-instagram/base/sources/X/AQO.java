package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AQO implements View.OnClickListener {
    public final /* synthetic */ ViewOnFocusChangeListenerC23261ASw A00;

    public AQO(ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw) {
        this.A00 = viewOnFocusChangeListenerC23261ASw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UserSession userSession;
        InterfaceC111194zh Bxv;
        SMBPartnerType sMBPartnerType;
        Bundle A0b;
        Class<ModalActivity> cls;
        String A00;
        int A05 = C0f9.A05(-1223349489);
        ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw = this.A00;
        Object A002 = AbstractC13320mI.A00(viewOnFocusChangeListenerC23261ASw.A0N, Activity.class);
        if (A002 != null) {
            Activity activity = (Activity) A002;
            Integer num = viewOnFocusChangeListenerC23261ASw.A0G;
            Integer num2 = C05F.A00;
            if (num == num2) {
                C08730cb c08730cb = C17060sy.A01;
                userSession = viewOnFocusChangeListenerC23261ASw.A0Q;
                Bxv = c08730cb.A01(userSession).A03.Bxy();
                sMBPartnerType = SMBPartnerType.A09;
            } else {
                if (num == C05F.A01) {
                    C08730cb c08730cb2 = C17060sy.A01;
                    userSession = viewOnFocusChangeListenerC23261ASw.A0Q;
                    Bxv = c08730cb2.A01(userSession).A03.Bxv();
                    sMBPartnerType = SMBPartnerType.A06;
                }
                C0f9.A0C(1710375274, A05);
                return;
            }
            if (Bxv != null) {
                if (ActionButtonPartnerType.A04 == Bxv.Bbb()) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("entrypoint", "sticker");
                    A1G.put(AbstractC111324zv.A00(863), SMBPartnerType.A06.toString());
                    C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2137), A1G);
                    IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                    cls = ModalActivity.class;
                    C14360o3.A0A(A01);
                    A0b = W6d.A00(igBloksScreenConfig, A01);
                    A00 = "bloks";
                } else {
                    A0b = AbstractC166987dD.A0b();
                    A0b.putSerializable(AbstractC111324zv.A00(3952), sMBPartnerType);
                    A0b.putString("APP_ID", Bxv.AcH());
                    A0b.putString(AbstractC111324zv.A00(3700), Bxv.Bba());
                    A0b.putString(AbstractC111324zv.A00(3703), Bxv.getUrl());
                    A0b.putString(AbstractC111324zv.A00(3496), Bxv.getUrl());
                    cls = ModalActivity.class;
                    A00 = AbstractC111324zv.A00(5382);
                }
                new C6XJ(activity, A0b, userSession, cls, A00).A0C(activity);
                C8NW c8nw = viewOnFocusChangeListenerC23261ASw.A0R;
                Integer num3 = viewOnFocusChangeListenerC23261ASw.A0G;
                num3.getClass();
                if (num3 == num2) {
                    c8nw.A0a = true;
                } else if (num3 == C05F.A01) {
                    c8nw.A0Y = true;
                } else if (num3 == C05F.A0C) {
                    c8nw.A0Z = true;
                }
            }
            C0f9.A0C(1710375274, A05);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0C(-1192351542, A05);
        throw A0g;
    }
}
