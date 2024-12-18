package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GSi extends C03E implements InterfaceC16620sF {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GSi(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                case 2: goto L1b;
                case 3: goto L1e;
                case 4: goto L1e;
                case 5: goto L21;
                case 6: goto L24;
                case 7: goto L24;
                case 8: goto L27;
                case 9: goto L27;
                case 10: goto L2f;
                case 11: goto L2f;
                case 12: goto L37;
                default: goto L6;
            }
        L6:
            java.lang.Class<com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity> r3 = com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity.class
        L8:
            r1 = 2
            java.lang.String r4 = "onSaveUserPreferenceCallback"
            java.lang.String r5 = "onSaveUserPreferenceCallback(ZLcom/instagram/user/model/User;)V"
        Ld:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<com.instagram.profile.edit.controller.EditProfileFieldsController> r3 = com.instagram.profile.edit.controller.EditProfileFieldsController.class
            r1 = 2
            java.lang.String r4 = "relatedAccountsCallback"
            java.lang.String r5 = "relatedAccountsCallback(Ljava/lang/Long;Ljava/lang/Boolean;)V"
            goto Ld
        L1b:
            java.lang.Class<X.EJq> r3 = X.C32279EJq.class
            goto L31
        L1e:
            java.lang.Class<X.FLA> r3 = X.FLA.class
            goto L8
        L21:
            java.lang.Class<X.EJH> r3 = X.EJH.class
            goto L29
        L24:
            java.lang.Class<X.EIP> r3 = X.EIP.class
            goto L31
        L27:
            java.lang.Class<X.EJz> r3 = X.C32287EJz.class
        L29:
            r1 = 2
            java.lang.String r4 = "onExternalLinkSavedCallback"
            java.lang.String r5 = "onExternalLinkSavedCallback(ZLcom/instagram/user/model/User;)V"
            goto Ld
        L2f:
            java.lang.Class<X.FMG> r3 = X.FMG.class
        L31:
            r1 = 2
            java.lang.String r4 = "saveUserCallback"
            java.lang.String r5 = "saveUserCallback(ZLcom/instagram/user/model/User;)V"
            goto Ld
        L37:
            java.lang.Class<X.GCm> r3 = X.C36614GCm.class
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSi.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        User user;
        C32279EJq c32279EJq;
        Context context;
        String A00;
        C146106i8 A0K;
        AbstractC59962oe abstractC59962oe;
        String str;
        C25671My c25671My;
        InterfaceC41141vN c36101Fwb;
        EJH ejh;
        EJH ejh2;
        switch (this.A00) {
            case 0:
                Number number = (Number) obj;
                UserSession userSession = ((EditProfileFieldsController) this.receiver).A0C;
                C25671My A002 = AbstractC25651Mw.A00(userSession);
                String str2 = userSession.userId;
                boolean A1b = AbstractC31177DnL.A1b(obj2);
                if (number != null) {
                    i = (int) number.longValue();
                } else {
                    i = 0;
                }
                A002.E4s(new C36109Fwj(str2, A1b, i));
                return C0eB.A00;
            case 1:
                boolean A1a = AbstractC166987dD.A1a(obj);
                user = (User) obj2;
                c32279EJq = (C32279EJq) this.receiver;
                if (A1a) {
                    if (user == null) {
                        throw AbstractC166987dD.A12("Reloading the view requires the new User not to be null");
                    }
                    c32279EJq.A01 = user;
                    C32279EJq.A02(c32279EJq);
                }
                return C0eB.A00;
            case 2:
                boolean A1a2 = AbstractC166987dD.A1a(obj);
                user = (User) obj2;
                c32279EJq = (C32279EJq) this.receiver;
                if (A1a2) {
                    if (user == null) {
                        throw AbstractC166987dD.A12("Reloading the view requires the new User not to be null");
                    }
                    c32279EJq.A01 = user;
                    C32279EJq.A02(c32279EJq);
                }
                return C0eB.A00;
            case 3:
            case 4:
                boolean A1a3 = AbstractC166987dD.A1a(obj);
                FLA fla = (FLA) this.receiver;
                if (A1a3) {
                    UserSession userSession2 = fla.A02;
                    AbstractC25651Mw.A00(userSession2).E4s(new C151736sJ(userSession2.userId));
                    A0K = AbstractC31171DnF.A0K();
                    abstractC59962oe = fla.A01;
                    AbstractC31171DnF.A18(abstractC59962oe, A0K, 2131970194);
                    A0K.A06();
                    AbstractC31178DnM.A1S(A0K);
                    return C0eB.A00;
                }
                context = fla.A01.getContext();
                A00 = AbstractC111324zv.A00(3039);
                C9GR.A0B(context, A00);
                return C0eB.A00;
            case 5:
                boolean A1a4 = AbstractC166987dD.A1a(obj);
                EJH ejh3 = (EJH) this.receiver;
                if (A1a4) {
                    c25671My = ejh3.A00;
                    if (c25671My != null) {
                        c36101Fwb = new C36101Fwb(AbstractC31173DnH.A0t(ejh3.A04), null);
                        ejh = ejh3;
                        c25671My.E4s(c36101Fwb);
                        ejh2 = ejh;
                        AbstractC25226BEj.A1Q(ejh2);
                        return C0eB.A00;
                    }
                    str = "eventBus";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                context = ejh3.getActivity();
                A00 = "save_external_link_failed";
                C9GR.A0B(context, A00);
                return C0eB.A00;
            case 6:
            case 7:
                boolean A1a5 = AbstractC166987dD.A1a(obj);
                EIP eip = (EIP) this.receiver;
                C6WQ c6wq = eip.A02;
                String str3 = null;
                if (c6wq != null) {
                    c6wq.dismiss();
                    if (!A1a5) {
                        C9GR.A0B(eip.getActivity(), "save_user_failed");
                        ejh2 = eip;
                        AbstractC25226BEj.A1Q(ejh2);
                        return C0eB.A00;
                    }
                    C25671My c25671My2 = eip.A00;
                    str = "eventBus";
                    if (c25671My2 != null) {
                        InterfaceC09390do interfaceC09390do = eip.A05;
                        String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
                        FragmentActivity activity = eip.getActivity();
                        if (activity != null) {
                            str3 = activity.getString(2131970209);
                        }
                        c25671My2.E4s(new C36101Fwb(A0t, str3));
                        c25671My = eip.A00;
                        if (c25671My != null) {
                            c36101Fwb = new C151736sJ(AbstractC31173DnH.A0t(interfaceC09390do));
                            ejh = eip;
                            c25671My.E4s(c36101Fwb);
                            ejh2 = ejh;
                            AbstractC25226BEj.A1Q(ejh2);
                            return C0eB.A00;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "dialog";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
            case 9:
                boolean A1a6 = AbstractC166987dD.A1a(obj);
                User user2 = (User) obj2;
                C32287EJz c32287EJz = (C32287EJz) this.receiver;
                EQ2 eq2 = c32287EJz.A03;
                String str4 = null;
                if (eq2 == null) {
                    str = "accountAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                eq2.A00(C32287EJz.A01(c32287EJz));
                AbstractC31178DnM.A0w(c32287EJz);
                C6WQ c6wq2 = c32287EJz.A04;
                if (c6wq2 != null) {
                    c6wq2.dismiss();
                    if (!A1a6) {
                        context = c32287EJz.getContext();
                        A00 = "save_external_links_failed";
                        C9GR.A0B(context, A00);
                        return C0eB.A00;
                    }
                    if (user2 != null) {
                        C25671My c25671My3 = c32287EJz.A01;
                        if (c25671My3 != null) {
                            C36115Fwp.A00(c25671My3, user2, AbstractC166987dD.A0r(c32287EJz.A0B).userId);
                        }
                        str = "eventBus";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    InterfaceC09390do interfaceC09390do2 = c32287EJz.A0B;
                    AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do2)).E4s(new C151736sJ(AbstractC166987dD.A0r(interfaceC09390do2).userId));
                    FragmentActivity activity2 = c32287EJz.getActivity();
                    Context context2 = c32287EJz.getContext();
                    if (context2 != null) {
                        str4 = context2.getString(2131970194);
                    }
                    AbstractC35083Fcu.A01(activity2, AbstractC166987dD.A0r(interfaceC09390do2), str4);
                    return C0eB.A00;
                }
                str = "dialog";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 10:
            case 11:
            default:
                boolean A1a7 = AbstractC166987dD.A1a(obj);
                FMG fmg = (FMG) this.receiver;
                if (!A1a7) {
                    context = fmg.A00;
                    A00 = "save_user_failed";
                    C9GR.A0B(context, A00);
                    return C0eB.A00;
                }
                fmg.A03.invoke();
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                boolean A1a8 = AbstractC166987dD.A1a(obj);
                User user3 = (User) obj2;
                C36614GCm c36614GCm = (C36614GCm) this.receiver;
                if (A1a8) {
                    if (user3 != null) {
                        UserSession userSession3 = c36614GCm.A01;
                        C36115Fwp.A00(AbstractC25651Mw.A00(userSession3), user3, userSession3.userId);
                    }
                    UserSession userSession4 = c36614GCm.A01;
                    AbstractC25651Mw.A00(userSession4).E4s(new C151736sJ(userSession4.userId));
                    A0K = AbstractC31171DnF.A0K();
                    abstractC59962oe = c36614GCm.A00;
                    AbstractC31171DnF.A18(abstractC59962oe, A0K, 2131970194);
                    A0K.A06();
                    AbstractC31178DnM.A1S(A0K);
                    return C0eB.A00;
                }
                context = c36614GCm.A00.getContext();
                A00 = MSV.A00(164);
                C9GR.A0B(context, A00);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return C0eB.A00;
        }
    }
}
