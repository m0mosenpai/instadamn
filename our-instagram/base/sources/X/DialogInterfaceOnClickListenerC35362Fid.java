package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fid, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35362Fid implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public DialogInterfaceOnClickListenerC35362Fid(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A05 = str;
        this.A02 = obj2;
        this.A04 = obj4;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                Object obj = this.A04;
                String str = this.A05;
                Object obj2 = this.A03;
                Object obj3 = this.A02;
                C69797Vvh c69797Vvh = new C69797Vvh((Context) this.A01);
                c69797Vvh.A08(MSV.A00(848));
                int length = C05F.A00(5).length;
                boolean[] zArr = new boolean[length];
                CharSequence[] charSequenceArr = new CharSequence[length];
                for (int i2 = 0; i2 < length; i2++) {
                    charSequenceArr[i2] = AbstractC53725NpE.A00(C05F.A00(5)[i2]);
                }
                DialogInterfaceOnMultiChoiceClickListenerC35464FkL dialogInterfaceOnMultiChoiceClickListenerC35464FkL = new DialogInterfaceOnMultiChoiceClickListenerC35464FkL(zArr);
                C69487VoA c69487VoA = c69797Vvh.A01;
                c69487VoA.A0J = charSequenceArr;
                c69487VoA.A07 = dialogInterfaceOnMultiChoiceClickListenerC35464FkL;
                c69487VoA.A0K = new boolean[length];
                c69487VoA.A0H = true;
                DialogInterfaceOnClickListenerC35352FiT dialogInterfaceOnClickListenerC35352FiT = new DialogInterfaceOnClickListenerC35352FiT(obj3, obj2, obj, str, 0);
                c69487VoA.A0E = "Reset All";
                c69487VoA.A02 = dialogInterfaceOnClickListenerC35352FiT;
                c69797Vvh.A06(new DialogInterfaceOnClickListenerC35360Fib(obj3, obj2, zArr, str, length, 0), "GO!");
                C0fJ.A00(c69797Vvh.A00());
                return;
            case 1:
                C38321qM c38321qM = (C38321qM) this.A03;
                User A2D = c38321qM.A2D();
                if (A2D == null) {
                    return;
                }
                UserSession userSession = (UserSession) this.A04;
                AbstractC172137li.A03((Activity) this.A01, userSession, c38321qM, A2D, (Class) this.A02, this.A05);
                return;
            case 2:
                UserSession userSession2 = (UserSession) this.A04;
                Object obj4 = this.A02;
                Object obj5 = this.A03;
                String str2 = this.A05;
                FVL.A01(C35817Frt.A00, new C28913CpN(obj5, obj4, userSession2, str2, 1), userSession2, C16930sl.A00, true);
                C35121FeO c35121FeO = (C35121FeO) this.A01;
                InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
                AbstractC31180DnO.A1G(EnumC33496ErV.SYSTEM_DIALOG, A00);
                A00.AAP("target_user_id", str2);
                C35121FeO.A01(A00, c35121FeO);
                return;
            case 3:
                ((EnumC33316EoB) this.A01).A00((C07270a1) this.A04);
                dialogInterface.dismiss();
                InterfaceC37227Gac interfaceC37227Gac = (InterfaceC37227Gac) this.A03;
                if (interfaceC37227Gac == null) {
                    return;
                }
                interfaceC37227Gac.Cut(this.A05, ((FM6) this.A02).A03);
                return;
            case 4:
                AbstractC68641VYw.A00.A04((UserSession) this.A04, (C4I7) this.A03, ((VDJ) this.A02).name(), this.A05);
                WGH.A06((Activity) this.A01, null);
                dialogInterface.cancel();
                return;
            case 5:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                C83743oJ A01 = C83743oJ.A01(abstractC12990ll);
                String str3 = this.A05;
                A01.A09((Context) this.A01, (InterfaceC11380iw) this.A02, abstractC12990ll, (Integer) this.A04, str3, true);
                return;
            default:
                Object obj6 = this.A01;
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A03;
                UserSession userSession3 = (UserSession) this.A04;
                String str4 = this.A05;
                Object obj7 = this.A02;
                C1ON A02 = AbstractC55151OdE.A02(userSession3, str4);
                A02.A00 = new C39028HGe(obj6, userSession3, obj7, str4, 7);
                abstractC59962oe.schedule(A02);
                return;
        }
    }
}
