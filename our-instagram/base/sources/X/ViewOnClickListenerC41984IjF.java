package X;

import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.regex.Pattern;

/* renamed from: X.IjF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41984IjF implements View.OnClickListener {
    public final /* synthetic */ InterfaceC88183wS A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C38525Gwl A03;
    public final /* synthetic */ C75113Zb A04;

    public ViewOnClickListenerC41984IjF(InterfaceC88183wS interfaceC88183wS, UserSession userSession, C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
        this.A03 = c38525Gwl;
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A04 = c75113Zb;
        this.A00 = interfaceC88183wS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1413778756);
        C38525Gwl c38525Gwl = this.A03;
        UserSession userSession = this.A01;
        C38321qM c38321qM = this.A02;
        C75113Zb c75113Zb = this.A04;
        InterfaceC88183wS interfaceC88183wS = this.A00;
        InterfaceC692739n interfaceC692739n = c38525Gwl.A02;
        if (interfaceC692739n != null) {
            EnumC39593He3 A00 = IQd.A00(interfaceC88183wS);
            if (A00 != null) {
                switch (A00.ordinal()) {
                    case 0:
                        String str = c75113Zb.A1U;
                        Pattern pattern = AbstractC13670mt.A00;
                        if (str == null) {
                            str = "";
                        }
                        interfaceC692739n.El8(c38321qM, c75113Zb, str);
                        break;
                    case 10:
                        String id = c38321qM.getId();
                        if (id != null) {
                            interfaceC692739n.ElV(c38321qM, c75113Zb, VG2.A0d, id);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    case 11:
                        interfaceC692739n.E2f(c38321qM, c38525Gwl, c75113Zb);
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        InterfaceC692739n interfaceC692739n2 = c38525Gwl.A02;
                        if (interfaceC692739n2 != null) {
                            interfaceC692739n2.Eke(c38321qM, c75113Zb);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        InterfaceC692739n interfaceC692739n3 = c38525Gwl.A02;
                        if (interfaceC692739n3 != null) {
                            interfaceC692739n3.Ekg(c38321qM, c75113Zb);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    case Process.SIGSTOP /* 19 */:
                        InterfaceC692739n interfaceC692739n4 = c38525Gwl.A02;
                        if (interfaceC692739n4 != null) {
                            interfaceC692739n4.E2W(C05F.A01);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    case 24:
                        InterfaceC692739n interfaceC692739n5 = c38525Gwl.A02;
                        if (interfaceC692739n5 != null) {
                            interfaceC692739n5.Cgq(c38321qM, "tombstone_view");
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    default:
                        String id2 = c38321qM.getId();
                        if (id2 != null) {
                            String CAR = c38321qM.CAR();
                            int position = c75113Zb.getPosition();
                            interfaceC692739n.Dth(c38321qM.B5n(), c38321qM, id2, CAR, interfaceC88183wS.getId(), interfaceC88183wS.getData(), null, c75113Zb.A1U, -1, position, !c38321qM.CdW(), AbstractC167007dF.A1X(c75113Zb.A0m, EnumC75193Zm.A05), false);
                            c75113Zb.A1G = interfaceC88183wS.getId();
                            c75113Zb.A1F = interfaceC88183wS.getData();
                            if (interfaceC88183wS.Awj() != null) {
                                InterfaceC84443pn Awj = interfaceC88183wS.Awj();
                                if (Awj != null) {
                                    C693539v.A04(Awj, userSession, c38321qM, c38525Gwl, c75113Zb);
                                    break;
                                } else {
                                    throw AbstractC166987dD.A12("Required value was null.");
                                }
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        break;
                }
                C693539v.A05(c38321qM, c38525Gwl, c75113Zb);
            }
            C0f9.A0C(1582608498, A05);
            return;
        }
        throw AbstractC166987dD.A12("TombstoneViewHolder.mDelegate should not be null");
    }
}
