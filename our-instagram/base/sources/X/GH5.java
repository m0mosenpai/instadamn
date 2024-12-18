package X;

import android.view.Window;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;

/* loaded from: classes6.dex */
public final class GH5 implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;

    public GH5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C189478aR A00(C189448aO c189448aO, Object obj, int i) {
        c189448aO.A0U = new GH5(obj, i);
        return c189448aO.A00();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C33226ElG c33226ElG;
        boolean z;
        String str;
        C7XS c7xs;
        Dz7 dz7;
        switch (this.A00) {
            case 0:
                EKX.A03((EKX) this.A01, false);
                return;
            case 1:
            case 2:
            case 3:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 4:
                UserSession userSession = (UserSession) this.A01;
                C2056398n A00 = AbstractC2056298m.A00(userSession);
                long A06 = AbstractC31177DnL.A06() + C18U.A01(C06090Tz.A05, userSession, 36600852311183412L);
                A00.A06.Egi(A00, Long.valueOf(A06), C2056398n.A0d[31]);
                return;
            case 5:
                dz7 = ((FOg) this.A01).A0D;
                dz7.A06.A06.Egh(null);
                return;
            case 6:
                dz7 = ((C34646FOd) this.A01).A0A;
                dz7.A06.A06.Egh(null);
                return;
            case 7:
                C32735Eb1 c32735Eb1 = (C32735Eb1) this.A01;
                C36298Fzs.A03(null, AbstractC31172DnG.A0e(c32735Eb1.A00), Integer.valueOf(((AbstractC32348EMv) c32735Eb1).A00), c32735Eb1.A06().A00, c32735Eb1.A06().A01, "challenge_duration_selected", "tap", "done_button", "duration_bottom_sheet", AbstractC167007dF.A0n("selected_duration_days", String.valueOf(((EnumC33421Eps) C31839Dyy.A00(c32735Eb1).A00).A00)));
                return;
            case 8:
                c7xs = (C7XS) this.A01;
                c7xs.D01();
                return;
            case 9:
                EME eme = (EME) this.A01;
                eme.A0B = false;
                BackInterceptEditText backInterceptEditText = eme.A08;
                if (backInterceptEditText == null) {
                    str = "collectionNameEditText";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AbstractC13880nE.A0R(backInterceptEditText);
                return;
            case 10:
                return;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c7xs = ((G4N) this.A01).A06;
                c7xs.D01();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Window window = ((C32855Ecx) this.A01).A02.A00.A0A.getWindow();
                if (window == null) {
                    return;
                }
                window.addFlags(512);
                return;
            case 14:
                G1e g1e = (G1e) this.A01;
                MessagingUser messagingUser = g1e.A00;
                if (messagingUser != null) {
                    g1e.A05.Cre(messagingUser, "collection_item_username");
                }
                g1e.A00 = null;
                return;
            case Process.SIGTERM /* 15 */:
                ((C31300DpM) this.A01).A02 = false;
                return;
            case 16:
                C32287EJz c32287EJz = (C32287EJz) this.A01;
                EQ2 eq2 = c32287EJz.A03;
                if (eq2 == null) {
                    str = "accountAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                eq2.A00(C32287EJz.A01(c32287EJz));
                return;
            case 17:
                c33226ElG = (C33226ElG) this.A01;
                c33226ElG.A08 = false;
                c33226ElG.A09 = false;
                z = true;
                C33226ElG.A04(c33226ElG, z);
                return;
            case 18:
                c33226ElG = (C33226ElG) this.A01;
                z = false;
                c33226ElG.A09 = false;
                C33226ElG.A04(c33226ElG, z);
                return;
            case Process.SIGSTOP /* 19 */:
                ((InterfaceC37213GaO) this.A01).DqX();
                return;
        }
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
        if (10 - this.A00 == 0) {
            ((C36405G4g) this.A01).A00.D01();
        }
    }
}
