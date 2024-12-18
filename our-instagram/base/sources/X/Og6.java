package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class Og6 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Og6(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1ON A07;
        int i2;
        boolean z;
        HZ4 hz4;
        String str;
        int i3;
        C38819H7k c38819H7k;
        boolean z2;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A03;
                Object obj = this.A02;
                String str2 = this.A04;
                C57253Pbb c57253Pbb = new C57253Pbb(47, obj, userSession);
                C50368MLv c50368MLv = new C50368MLv(context, 4);
                Integer A02 = C151866sW.A02(userSession, false);
                if (A02 == C05F.A00) {
                    C2JM A0b = AbstractC25225BEi.A0b();
                    AbstractC25231BEo.A18(AbstractC50524MSc.A06(str2), A0b);
                    A07 = AbstractC31178DnM.A0H(new C907442n(A0b, C51519Mp5.class, "ContentSchedulingDeleteMutation", true), userSession);
                    i2 = 2;
                } else {
                    Integer num = C05F.A01;
                    if (A02 == num) {
                        C2JM A0b2 = AbstractC25225BEi.A0b();
                        AbstractC25231BEo.A18(AbstractC50524MSc.A06(str2), A0b2);
                        A07 = AbstractC50524MSc.A07(A0b2, userSession, C51517Mp3.class, num, "ContentSchedulingDeleteGenPopLinkedMutation");
                        i2 = 3;
                    } else {
                        c50368MLv.invoke("Scheduling not enabled");
                        C9GR.A07(context, 2131957732);
                        return;
                    }
                }
                A07.A00 = new NAD(i2, context, c50368MLv, c57253Pbb);
                C1GJ.A03(A07);
                C9GR.A07(context, 2131957732);
                return;
            case 1:
                z = true;
                ((C195918ld) this.A02).A05(true, "ig_story_composer");
                AbstractC55624On9.A01(EnumC201098ur.ACCEPT, (UserSession) this.A03, this.A04, null);
                break;
            case 2:
                UserSession userSession2 = (UserSession) this.A01;
                Context context2 = (Context) this.A02;
                String str3 = this.A04;
                C54796OJo c54796OJo = (C54796OJo) this.A03;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                C57092PUf c57092PUf = new C57092PUf(context2, userSession2, c54796OJo, str3, 0);
                C57091PUe c57091PUe = new C57091PUe(5, context2, c54796OJo);
                C40701ud A01 = AbstractC40691uc.A01(userSession2);
                C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, AbstractC166997dE.A0n(), "client_mutation_id");
                C2JM A0b3 = AbstractC25225BEi.A0b();
                C55661Onm.A00(new C58510Pwe(c57092PUf, 21), new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b3, "data"), "DeleteAll", A0b3.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59860Qpw.class, true, null, 12, "data", "xig_delete_all_from_user_id_iab_link_history_ig", AbstractC166987dD.A1E()), A01, c57091PUe, 8);
                return;
            case 3:
                AbstractC68641VYw.A00.A02((UserSession) this.A03, (C4I7) this.A02, ((VDJ) this.A01).name(), this.A04);
                dialogInterface.cancel();
                return;
            case 4:
                C196208mB c196208mB = (C196208mB) this.A02;
                UserSession userSession3 = (UserSession) this.A03;
                z = true;
                c196208mB.A01(userSession3, "upsell", true);
                C55627OnC.A03(EnumC201098ur.ACCEPT, userSession3, this.A04, null);
                break;
            case 5:
                hz4 = (HZ4) this.A03;
                str = this.A04;
                i3 = ((C45095JxP) this.A01).A00;
                c38819H7k = (C38819H7k) this.A02;
                z2 = true;
                HZ4.A01(c38819H7k, hz4, str, i3, z2);
                return;
            default:
                hz4 = (HZ4) this.A03;
                str = this.A04;
                i3 = ((C45095JxP) this.A01).A00;
                c38819H7k = (C38819H7k) this.A02;
                z2 = false;
                HZ4.A01(c38819H7k, hz4, str, i3, z2);
                return;
        }
        InterfaceC57990Pna interfaceC57990Pna = (InterfaceC57990Pna) this.A01;
        if (interfaceC57990Pna == null) {
            return;
        }
        interfaceC57990Pna.afterSelection(z);
    }
}
