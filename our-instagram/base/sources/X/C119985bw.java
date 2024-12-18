package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119985bw implements InterfaceC452826l {
    public Handler A00;
    public final Context A01;
    public final UserSession A02;

    public C119985bw(Context context, UserSession userSession) {
        this.A01 = context.getApplicationContext();
        this.A02 = userSession;
    }

    @Override // X.InterfaceC452826l
    public final void D1t(C1OW c1ow) {
    }

    @Override // X.InterfaceC452826l
    public final void DB8(C1OW c1ow, String str, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final void DCa(C1OW c1ow) {
    }

    @Override // X.InterfaceC452826l
    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void Da4(String str, String str2, String str3) {
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
    }

    @Override // X.InterfaceC452826l
    public final void DhF(C1OW c1ow, String str, boolean z) {
    }

    private void A00(C1OW c1ow) {
        String str;
        String str2;
        Handler handler;
        Runnable go7;
        String str3;
        DirectPendingLayeredXma directPendingLayeredXma;
        String A02 = c1ow.A02();
        boolean z = true;
        switch (A02.hashCode()) {
            case -1698180071:
                if (!A02.equals("send_link_message")) {
                    return;
                }
                C29481bP c29481bP = (C29481bP) c1ow;
                List C7R = c29481bP.C7R();
                if (C7R.size() != 1) {
                    z = false;
                }
                C18C.A0E(z);
                str = ((DirectThreadKey) C7R.get(0)).A00;
                str2 = c29481bP.A04;
                break;
            case -62852893:
                if (!A02.equals("send_collection_item_response")) {
                    return;
                }
                List C7R2 = ((AbstractC29011ae) c1ow).C7R();
                if (C7R2.size() != 1) {
                    z = false;
                }
                C18C.A0E(z);
                str = ((DirectThreadKey) C7R2.get(0)).A00;
                str2 = "toast";
                break;
            case 1174963788:
                if (!A02.equals("send_text_message")) {
                    return;
                }
                C29271b4 c29271b4 = (C29271b4) c1ow;
                List C7R3 = c29271b4.C7R();
                if (C7R3.size() != 1) {
                    z = false;
                }
                C18C.A0E(z);
                str = ((DirectThreadKey) C7R3.get(0)).A00;
                str2 = c29271b4.A0F;
                if (str2 == null) {
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                }
                break;
            case 2046682813:
                if (!A02.equals("send_comment_reshare_message") || !(c1ow instanceof C30631dS) || (directPendingLayeredXma = ((C30631dS) c1ow).A00) == null || !directPendingLayeredXma.A06) {
                    return;
                }
                String string = this.A01.getString(2131973315);
                Handler handler2 = this.A00;
                if (handler2 == null) {
                    handler2 = new Handler(Looper.getMainLooper());
                    this.A00 = handler2;
                }
                handler2.post(new GO7(this, string));
                return;
            default:
                return;
        }
        if (str2 == null) {
            C0w9.A04("DirectSendTextToVisualMessageMutationObserver_nullPostAction", "postAction null.", 1);
            return;
        }
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -155349541) {
            if (hashCode != 3387192) {
                if (hashCode == 110532135 && str2.equals("toast")) {
                    c = 0;
                }
            } else if (str2.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                c = 2;
            }
        } else if (str2.equals("snackbar_individual_message")) {
            c = 1;
        }
        if (c != 0) {
            if (c != 1) {
                return;
            }
            UserSession userSession = this.A02;
            C2DU c2du = (C2DU) AbstractC28761aE.A00(userSession);
            C14360o3.A0B(str, 0);
            final C81663kb A0N = c2du.A0N(str);
            if (A0N == null) {
                str3 = "thread null for SHOW_IN_APP_NOTIFICATION_CONFIRMATION when using AfterPostAction.SNACKBAR_INDIVIDUAL_MESSAGE";
                C0w9.A04("DirectSendTextToVisualMessageMutationObserver_nullThreadSummary", str3, 1);
                return;
            }
            List BSH = A0N.BSH();
            BSH.remove(C17060sy.A01.A01(userSession));
            if (BSH.size() != 1) {
                return;
            }
            User user = (User) BSH.get(0);
            final String fullName = user.getFullName();
            if (fullName == null) {
                fullName = user.getUsername();
            }
            final ImageUrl Bhu = user.Bhu();
            handler = this.A00;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.A00 = handler;
            }
            go7 = new Runnable() { // from class: X.GQF
                @Override // java.lang.Runnable
                public final void run() {
                    C119985bw c119985bw = this;
                    String str4 = fullName;
                    ImageUrl imageUrl = Bhu;
                    C2EC c2ec = A0N;
                    C146106i8 A0K = AbstractC31171DnF.A0K();
                    Context context = c119985bw.A01;
                    A0K.A0D = AbstractC167007dF.A0f(context, str4, 2131960481);
                    A0K.A09 = imageUrl;
                    A0K.A0B(EnumC142006bJ.A03);
                    A0K.A0D(context.getString(2131960480));
                    G9A.A00(A0K, c119985bw, c2ec, 11);
                    A0K.A0L = true;
                    AbstractC25233BEq.A1F(A0K);
                }
            };
            handler.post(go7);
        }
        C2DU c2du2 = (C2DU) AbstractC28761aE.A00(this.A02);
        C14360o3.A0B(str, 0);
        C81663kb A0N2 = c2du2.A0N(str);
        if (A0N2 == null) {
            str3 = "thread null for SHOW_IN_APP_NOTIFICATION_CONFIRMATION";
            C0w9.A04("DirectSendTextToVisualMessageMutationObserver_nullThreadSummary", str3, 1);
            return;
        }
        ArrayList A01 = C4GO.A01(A0N2.BSH());
        DirectShareTarget directShareTarget = new DirectShareTarget(AbstractC31232DoF.A00(A0N2.C7I(), A01), A0N2.C7l(), A01, true);
        Context context = this.A01;
        String str4 = directShareTarget.A0I;
        if (str4 == null) {
            str4 = "";
        }
        String string2 = context.getString(2131960438, str4);
        handler = this.A00;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.A00 = handler;
        }
        go7 = new GO7(this, string2);
        handler.post(go7);
    }

    @Override // X.InterfaceC452826l
    public final void D6x(C1OW c1ow) {
        A00(c1ow);
    }

    @Override // X.InterfaceC452826l
    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
        A00(c1ow);
    }
}
