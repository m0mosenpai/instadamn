package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.ConnectFBPageFragment;
import com.instagram.nux.cal.model.ConnectContent;
import fxcache.model.FxCalAccount;

/* renamed from: X.GJg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36783GJg implements GZY {
    public final int A00;
    public final Object A01;

    public C36783GJg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZY
    public final void onAuthorizeFail() {
        switch (this.A00) {
            case 0:
                ConnectFBPageFragment.A01((ConnectFBPageFragment) this.A01);
                AbstractC31171DnF.A0z(2131965778);
                return;
            case 3:
                C9GR.A0B(((FLA) this.A01).A01.getContext(), "authorize_failed");
                return;
            case 7:
                ((GZR) this.A01).onAuthorizeFail();
                return;
            default:
                return;
        }
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        android.net.Uri uri;
        String str3;
        String str4;
        switch (this.A00) {
            case 0:
                ConnectFBPageFragment connectFBPageFragment = (ConnectFBPageFragment) this.A01;
                ConnectFBPageFragment.A00(connectFBPageFragment);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.CjL(new Y7A("facebook_connect", connectFBPageFragment.A06, null, null, null, null, null, null));
                }
                InterfaceC37222GaX interfaceC37222GaX = connectFBPageFragment.A01;
                if (interfaceC37222GaX == null) {
                    return;
                }
                interfaceC37222GaX.CnD(AbstractC31174DnI.A0F("fb_account_linked", null));
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                FLA fla = (FLA) this.A01;
                fla.A00 = new GSi(fla, 3);
                AbstractC35216Fg9.A02(fla.A02, fla, 19);
                return;
            case 4:
                C32287EJz c32287EJz = (C32287EJz) this.A01;
                C2Ne c2Ne = c32287EJz.A02;
                if (c2Ne == null) {
                    str4 = "fxIgMasterAccountCache";
                    break;
                } else {
                    FxCalAccount A01 = c2Ne.A01(CallerContext.A00(C32287EJz.class), "ig_to_fb_sharing_account");
                    if (A01 != null && (str3 = A01.A08) != null) {
                        uri = AbstractC08820cl.A03(str3);
                    } else {
                        uri = null;
                    }
                    View inflate = AbstractC31175DnJ.A06(c32287EJz).inflate(R.layout.layout_links_fb_dialog, (ViewGroup) null);
                    C14360o3.A07(inflate);
                    C193328hC A0O = AbstractC31175DnJ.A0O(c32287EJz);
                    A0O.A0A(2131970192);
                    A0O.A09(2131970185);
                    DialogInterfaceOnClickListenerC35454FkB.A02(A0O, c32287EJz, 47, 2131970191);
                    DialogInterfaceOnClickListenerC35454FkB.A01(A0O, c32287EJz, 48);
                    if (uri != null) {
                        AbstractC167007dF.A0T(inflate, R.id.profile_link_facebook_image).setUrl(AbstractC81033jX.A00(uri, -1, -1), c32287EJz);
                        A0O.A0l(inflate);
                    }
                    AbstractC166987dD.A1W(A0O);
                    return;
                }
                break;
            case 5:
                C32287EJz.A03((C32287EJz) this.A01);
                return;
            case 6:
                GEY gey = (GEY) this.A01;
                AbstractC25225BEi.A0r(gey.A00, gey.A01).A0G(null, 1);
                return;
            case 7:
                C14360o3.A0B(str2, 1);
                ((GZR) this.A01).onAuthorizeSuccess(str2);
                return;
            case 8:
                C06090Tz A0j = AbstractC25225BEi.A0j(str, 0);
                str4 = "calHelper";
                if (C1AD.A06(A0j, 18296131184230518L)) {
                    ELU elu = (ELU) this.A01;
                    CallerContext callerContext = ELU.A0B;
                    if (elu.A01 != null) {
                        InterfaceC09390do interfaceC09390do = elu.A06;
                        FWI.A00(true, AbstractC166987dD.A0r(interfaceC09390do));
                        C25621Ms A0M = AbstractC31173DnH.A0M(AbstractC166987dD.A0o(interfaceC09390do));
                        A0M.A0B("fb/nux_fb_content/");
                        A0M.A9s("access_token", str);
                        C14360o3.A0B("linking_entry_point", 0);
                        C1ON A0H = AbstractC31180DnO.A0H(A0M, ConnectContent.class, FWL.class);
                        A0H.A00 = new ET5(elu, str);
                        C1GJ.A03(A0H);
                        return;
                    }
                } else {
                    if (C1AD.A06(A0j, 18296131184296055L)) {
                        ELU elu2 = (ELU) this.A01;
                        CallerContext callerContext2 = ELU.A0B;
                        if (elu2.A01 != null) {
                            FWI.A00(false, AbstractC166987dD.A0r(elu2.A06));
                        }
                    }
                    ELU.A01((ELU) this.A01);
                    return;
                }
                break;
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }
}
