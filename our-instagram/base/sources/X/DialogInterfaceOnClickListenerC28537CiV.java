package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.CiV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28537CiV implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnClickListenerC28537CiV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C141796aw A00;
        InterfaceC16620sF pYc;
        switch (this.A00) {
            case 5:
                return;
            case 6:
                C26778Brz.A01((C26778Brz) this.A01, C05F.A0C);
                return;
            case 7:
                C25866BcL A0x = AbstractC25226BEj.A0x(((C26778Brz) this.A01).A09);
                C28176CbO c28176CbO = A0x.A00;
                if (c28176CbO != null) {
                    String str = A0x.A03;
                    C28176CbO.A00(C8o.A06, c28176CbO, str);
                    ((CTZ) A0x.A04.getValue()).A00(C8W.MEMU_DISABLED, A0x.A01);
                    A00 = AbstractC141776au.A00(A0x);
                    pYc = new PYc(A0x, str, null, 5);
                    break;
                } else {
                    C14360o3.A0F("memuLogger");
                    throw C00O.createAndThrow();
                }
            case 8:
                C25866BcL A0x2 = AbstractC25226BEj.A0x(((C26778Brz) this.A01).A09);
                ((CTZ) A0x2.A04.getValue()).A00(C8W.EXPLICIT_TOGGLED, A0x2.A01);
                A00 = AbstractC141776au.A00(A0x2);
                pYc = new PZW((Object) A0x2, (InterfaceC23621Ds) null, 18, false);
                break;
            case 9:
                C26820Bsi.A01((C26820Bsi) this.A01);
                return;
            case 10:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 11:
                InterfaceC31039Dkd interfaceC31039Dkd = (InterfaceC31039Dkd) this.A01;
                C14360o3.A0A(dialogInterface);
                C14360o3.A0B(dialogInterface, 0);
                dialogInterface.dismiss();
                C0O.A02(((C29334CwT) interfaceC31039Dkd).A00);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                InterfaceC31039Dkd interfaceC31039Dkd2 = (InterfaceC31039Dkd) this.A01;
                C14360o3.A0A(dialogInterface);
                C14360o3.A0B(dialogInterface, 0);
                C0O c0o = ((C29334CwT) interfaceC31039Dkd2).A00;
                FragmentActivity activity = c0o.getActivity();
                if (activity == null) {
                    return;
                }
                C35043FcG A01 = AbstractC151756sL.A00().A01();
                InterfaceC09390do interfaceC09390do = ((AbstractC26782Bs6) c0o).A00;
                A01.A04(activity, AbstractC166987dD.A0r(interfaceC09390do), null, AbstractC166987dD.A0r(interfaceC09390do).userId, "opal_nux", false, false);
                dialogInterface.dismiss();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC26821Bsj abstractC26821Bsj = (AbstractC26821Bsj) this.A01;
                abstractC26821Bsj.A08();
                AbstractC25231BEo.A16(abstractC26821Bsj);
                return;
            case 14:
            case Process.SIGTERM /* 15 */:
                ((C26434BmH) this.A01).A00.A0F(C4P.A00);
                return;
            case 16:
                C25811BbS c25811BbS = ((C26434BmH) this.A01).A00;
                c25811BbS.A0F(C4P.A00);
                C28421CgT c28421CgT = c25811BbS.A0B;
                C28421CgT.A00(C8o.A09, C8Q.CANCEL, null, null, null, c28421CgT, null, null, null, null, false);
                return;
            case 17:
                C25859BcE c25859BcE = (C25859BcE) ((C26740BrL) this.A01).A05.getValue();
                KZA kza = c25859BcE.A00;
                String str2 = c25859BcE.A02;
                String str3 = c25859BcE.A01;
                String A002 = AbstractC43591JPw.A00(1138);
                AbstractC166987dD.A1Z(new C50116MAp(kza, str2, str3, A002, null, 0), ((C4A7) kza).A01);
                c25859BcE.A05.F8s(C29541Czt.A00);
                return;
            case 18:
                ((DialogInterface.OnClickListener) this.A01).onClick(dialogInterface, i);
                return;
        }
        AbstractC166987dD.A1Z(pYc, A00);
    }
}
