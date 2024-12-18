package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.OpO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55755OpO implements X9O {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LocationPluginImpl A02;
    public final /* synthetic */ InterfaceC127465pP A03;
    public final /* synthetic */ MQC A04;
    public final /* synthetic */ VDJ A05;
    public final /* synthetic */ Boolean A06;
    public final /* synthetic */ String A07;

    public C55755OpO(Activity activity, UserSession userSession, LocationPluginImpl locationPluginImpl, InterfaceC127465pP interfaceC127465pP, MQC mqc, VDJ vdj, Boolean bool, String str) {
        this.A02 = locationPluginImpl;
        this.A01 = userSession;
        this.A03 = interfaceC127465pP;
        this.A07 = str;
        this.A04 = mqc;
        this.A06 = bool;
        this.A00 = activity;
        this.A05 = vdj;
    }

    @Override // X.X9O
    public final void DYF(C4IC c4ic, Integer num) {
        EnumC172127lh enumC172127lh;
        if (c4ic != C4IC.A06 && c4ic != C4IC.A07) {
            if (c4ic == C4IC.A08) {
                enumC172127lh = EnumC172127lh.A04;
            } else {
                enumC172127lh = EnumC172127lh.A03;
            }
            this.A04.DYD(enumC172127lh);
            LocationPluginImpl locationPluginImpl = this.A02;
            UserSession userSession = this.A01;
            Boolean bool = this.A06;
            if (locationPluginImpl.shouldUseNewNativeReconsiderDialog(userSession) && enumC172127lh == EnumC172127lh.A04 && !bool.booleanValue()) {
                Activity activity = this.A00;
                VDJ vdj = this.A05;
                C14360o3.A0B(userSession, 1);
                Resources resources = activity.getResources();
                String A0q = AbstractC166997dE.A0q(resources, 2131971622);
                String A0q2 = AbstractC166997dE.A0q(resources, 2131971621);
                String A0p = AbstractC25231BEo.A0p();
                C4I7 c4i7 = new C4I7(new C55894Ori(), userSession);
                AbstractC68641VYw.A00.A03(userSession, c4i7, vdj.name(), A0p);
                C193328hC A0H = AbstractC31171DnF.A0H(activity);
                A0H.A05 = A0q;
                A0H.A0r(A0q2);
                A0H.A0J(new DialogInterfaceOnClickListenerC35362Fid(activity, vdj, c4i7, userSession, A0p, 4), 2131975120);
                AbstractC31176DnK.A14(new Og6(vdj, userSession, c4i7, A0p, 3), A0H);
                return;
            }
            return;
        }
        LocationPluginImpl.A02(this.A01, this.A02, this.A03, this.A07, false);
    }
}
