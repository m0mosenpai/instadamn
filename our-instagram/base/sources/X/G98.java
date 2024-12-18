package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G98 implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public G98(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A01 = obj5;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, G98 g98) {
        interfaceC02590Ai.A8R((C8d) g98.A02, "project");
        interfaceC02590Ai.A8R((EnumC33488ErN) g98.A03, "screen");
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                C2ED c2ed = (C2ED) this.A04;
                if (c2ed.C7I() == null || c2ed.C7l() == null) {
                    return;
                }
                List list = (List) this.A03;
                AbstractC34339FCh.A00((Context) this.A02, (InterfaceC11380iw) this.A01, (UserSession) this.A05, "reply_modal", null, AbstractC166987dD.A1J(new DirectShareTarget(AbstractC31232DoF.A00(c2ed.C7I(), list), c2ed.C7l(), list, true)));
                return;
            case 1:
                C52231N9u c52231N9u = (C52231N9u) this.A05;
                Activity activity = c52231N9u.A01;
                if (activity == null) {
                    return;
                }
                Context context = c52231N9u.A02;
                int A01 = AbstractC13890nF.A01(context);
                float A00 = AbstractC13890nF.A00(context);
                RectF rectF = new RectF(0.0f, 0.0f, A01, A00);
                rectF.offsetTo(0.0f, A00);
                Object obj = this.A04;
                if (obj == ProductType.CLIPS) {
                    C77453dV.A02(activity, c52231N9u.A03, C22P.A1S, c52231N9u.A04, null, c52231N9u.A06, null, false);
                } else if (obj == ProductType.FEED) {
                    AbstractC35183Ffa.A02(activity, rectF, new RectF(0.0f, 0.0f, 0.0f, 0.0f), c52231N9u.A04, null, c52231N9u.A06, AbstractC111324zv.A00(3711), null, c52231N9u.A00, false);
                } else {
                    throw AbstractC166987dD.A12("Unsupported Media Type for the Creator Comment Reshare To Story");
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A01, "ig_creator_connections_events");
                AbstractC31171DnF.A1B(A0f, "click");
                A00(A0f, this);
                A0f.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "success");
                A0f.Cht();
                return;
            case 2:
                AbstractC35260Fgu.A06((Context) this.A03, (InterfaceC11380iw) this.A01, (UserSession) this.A05, (SavedCollection) this.A02, (List) this.A04);
                return;
            default:
                C18920wW c18920wW = (C18920wW) this.A04;
                EnumC33371Ep4 enumC33371Ep4 = EnumC33371Ep4.A0A;
                C75R.A0B(c18920wW, enumC33371Ep4, "restrict_plus", null, null, MSV.A00(275));
                UserSession userSession = (UserSession) this.A05;
                User user = (User) this.A01;
                Context context2 = (Context) this.A02;
                C32345EMr A002 = C35188Ffg.A00(userSession, user, enumC33371Ep4, new GJM(context2, (Fragment) this.A03, userSession, user), null, false);
                if (A002 != null) {
                    AbstractC31178DnM.A0l(context2, A002, userSession, null);
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        if (1 - this.A00 == 0) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A01, "ig_creator_connections_events");
            AbstractC31171DnF.A1B(A0f, "dismiss");
            A00(A0f, this);
            A0f.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "success");
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        String str;
        InterfaceC02590Ai A0f;
        String str2;
        switch (this.A00) {
            case 1:
                A0f = AbstractC166987dD.A0f((C18920wW) this.A01, "ig_creator_connections_events");
                AbstractC31171DnF.A1B(A0f, "impression");
                A00(A0f, this);
                str = "success";
                str2 = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS;
                break;
            case 2:
            default:
                return;
            case 3:
                C18920wW c18920wW = (C18920wW) this.A04;
                EnumC33371Ep4 enumC33371Ep4 = EnumC33371Ep4.A0A;
                String A00 = MSV.A00(275);
                str = "restrict_plus";
                A0f = AbstractC166987dD.A0f(c18920wW, MSV.A00(1318));
                if (!A0f.isSampled()) {
                    return;
                }
                Map A0n = AbstractC167007dF.A0n("nav_chain", AbstractC25225BEi.A14());
                AbstractC31171DnF.A1E(A0f, A00);
                A0f.AAP("entrypoint", C75R.A01(enumC33371Ep4));
                A0f.A9M("extra_values", A0n);
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_STEP;
                break;
        }
        A0f.AAP(str2, str);
        A0f.Cht();
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
