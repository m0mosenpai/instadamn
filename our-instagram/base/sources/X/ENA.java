package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ENA extends AbstractC59962oe implements InterfaceC62602sz, InterfaceC37197Ga8, InterfaceC37157GYu, InterfaceC37214GaP, InterfaceC60122ou, InterfaceC37204GaF, C7ZH {
    public static final String __redex_internal_original_name = "ThreadDetailsPeopleFragment";
    public int A00;
    public C142846ck A01;
    public FKL A02;
    public InterfaceC37169GZg A03;
    public EQN A04;
    public FKX A05;
    public C35010Fbh A06;
    public C34641FNy A07;
    public C31539DtP A08;
    public C32056E6i A09;
    public E70 A0A;
    public boolean A0B;
    public RecyclerView A0C;
    public C56352iT A0D;
    public C18920wW A0E;
    public Capabilities A0F;
    public C36267FzK A0G;
    public C7MJ A0H;
    public InterfaceC83733oI A0I;
    public boolean A0J;
    public final C41761wQ A0O = AbstractC31173DnH.A0S();
    public final C31728DwZ A0M = C31728DwZ.A00(this, 4);
    public final InterfaceC42271xH A0N = C31728DwZ.A00(this, 5);
    public final InterfaceC190658cN A0P = new G9H(this, 14);
    public final C34429FFt A0K = new C34429FFt(this);
    public final InterfaceC09390do A0L = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37157GYu
    public final void AHL() {
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Caq(User user) {
        return false;
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Ccd(User user) {
        return true;
    }

    @Override // X.InterfaceC37204GaF
    public final void Cub(User user) {
        C14360o3.A0B(user, 0);
        C35010Fbh c35010Fbh = this.A06;
        if (c35010Fbh == null) {
            C14360o3.A0F("groupRequestsController");
            throw C00O.createAndThrow();
        }
        E70 e70 = c35010Fbh.A00;
        if (e70 != null && (e70.A08() instanceof DirectThreadKey)) {
            String str = E70.A01(e70).A00;
            if (str != null) {
                Context context = c35010Fbh.A03;
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                A0I.A05 = user.getUsername();
                A0I.A09(2131972291);
                A0I.A0t(true);
                A0I.A0Z(new DialogInterfaceOnClickListenerC35451Fk8(user, c35010Fbh, str, 5), EnumC193348hE.A05, AbstractC166997dE.A0p(context, 2131972236), true);
                AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35403FjM.A00, A0I);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC37214GaP
    public final void CxJ(C32107E9f c32107E9f) {
    }

    @Override // X.InterfaceC37214GaP
    public final void DT0(C32107E9f c32107E9f) {
        C81543kP c81543kP;
        if (isResumed()) {
            FragmentActivity requireActivity = requireActivity();
            User user = c32107E9f.A00;
            InterfaceC09390do interfaceC09390do = this.A0L;
            String str = null;
            AbstractC34829FWk.A00(requireActivity, this, this, AbstractC166987dD.A0r(interfaceC09390do), user, __redex_internal_original_name, null, false);
            E70 e70 = this.A0A;
            if (e70 != null && e70.A09 == 29 && (c81543kP = e70.A0E) != null) {
                String str2 = null;
                InterfaceC83733oI interfaceC83733oI = e70.A0L;
                if (interfaceC83733oI != null) {
                    str = AbstractC1345466e.A07(interfaceC83733oI);
                }
                E70 e702 = this.A0A;
                if (e702 != null) {
                    str2 = e702.A0Q;
                }
                C142846ck c142846ck = this.A01;
                if (c142846ck == null) {
                    C14360o3.A0F("broadcastChatLogger");
                    throw C00O.createAndThrow();
                }
                C142846ck.A07(c142846ck, str, str2, user.getId(), DialogModule.KEY_MESSAGE, C160857It.A00(c81543kP, AbstractC31173DnH.A0t(interfaceC09390do), e70.A09), e70.A06());
            }
        }
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Dxg(User user, boolean z) {
        C14360o3.A0B(user, 0);
        C35010Fbh c35010Fbh = this.A06;
        if (c35010Fbh == null) {
            C14360o3.A0F("groupRequestsController");
            throw C00O.createAndThrow();
        }
        E70 e70 = c35010Fbh.A00;
        if (e70 != null) {
            java.util.Set set = c35010Fbh.A07;
            int size = set.size();
            int i = -1;
            if (z) {
                i = 1;
            }
            if (AbstractC31172DnG.A02(AbstractC001800i.A0a(e70.A0T), size + i) > c35010Fbh.A02) {
                return false;
            }
            if (z) {
                set.add(user);
            } else {
                set.remove(user);
            }
            c35010Fbh.A01();
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC37214GaP
    public final void Dy7(C32107E9f c32107E9f) {
        UserSession A0r = AbstractC166987dD.A0r(this.A0L);
        FragmentActivity requireActivity = requireActivity();
        Capabilities capabilities = this.A0F;
        Long l = null;
        if (capabilities == null) {
            C14360o3.A0F("threadCapabilities");
            throw C00O.createAndThrow();
        }
        MessagingUser A00 = MessagingUser.A00(c32107E9f.A00);
        E70 e70 = this.A0A;
        if (e70 != null) {
            l = e70.A0M;
        }
        C7KH.A06(requireActivity, this, A0r, capabilities, A00, l);
    }

    @Override // X.C7ZH
    public final boolean EkL(InterfaceC83733oI interfaceC83733oI, String str, int i) {
        E70 e70 = this.A0A;
        if (e70 != null && interfaceC83733oI.equals(e70.A0L)) {
            Context requireContext = requireContext();
            UserSession A0r = AbstractC166987dD.A0r(this.A0L);
            String str2 = e70.A0P;
            C14360o3.A0B(A0r, 1);
            C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
            A0I.A0A(2131961880);
            A0I.A0r(C7MK.A00(requireContext, A0r, str, str2, i));
            AbstractC31176DnK.A1W(A0I);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        int i = 2131959126;
        if (this.A0J) {
            i = 2131972368;
        }
        interfaceC56362iU.Efu(i);
        E70 e70 = this.A0A;
        C32056E6i c32056E6i = this.A09;
        if (e70 != null && c32056E6i != null && !this.A0J) {
            UserSession A0r = AbstractC166987dD.A0r(this.A0L);
            Capabilities capabilities = this.A0F;
            if (capabilities == null) {
                C14360o3.A0F("threadCapabilities");
                throw C00O.createAndThrow();
            }
            boolean z = this.A0B;
            C14360o3.A0B(A0r, 0);
            if (c32056E6i.A01 != 29 && AbstractC35172FfP.A02(A0r, capabilities, c32056E6i, z)) {
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A06 = R.drawable.instagram_user_follow_pano_outline_24;
                A0B.A05 = 2131958680;
                AbstractC31176DnK.A1B(new FpQ(22, this, c32056E6i), A0B, interfaceC56362iU);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0C = AbstractC31180DnO.A08(view);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0L;
        this.A04 = new EQN(requireContext, this, AbstractC166987dD.A0r(interfaceC09390do), this, new C36732GHb(this), new C36734GHd(this), this, this, this.A0J, false);
        if (this.A0C == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "ThreadDetailsPeopleFragment - recycler view is null", 20134884);
        }
        RecyclerView recyclerView = this.A0C;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A04);
            RecyclerView recyclerView2 = this.A0C;
            if (recyclerView2 != null) {
                AbstractC31174DnI.A16(getContext(), recyclerView2, 1, false);
                this.A02 = new FKL(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
                C41761wQ c41761wQ = this.A0O;
                InterfaceC37169GZg interfaceC37169GZg = this.A03;
                if (interfaceC37169GZg == null) {
                    str = "clientInfra";
                } else {
                    GKK.A00(interfaceC37169GZg.BOE().APK().A0M(new C36264FzH(1, GVY.A00)), c41761wQ, this, 9);
                    A01(this);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(ENA ena) {
        InterfaceC37169GZg interfaceC37169GZg = ena.A03;
        if (interfaceC37169GZg == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        InterfaceC37279GbW.A00(interfaceC37169GZg);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    @Override // X.InterfaceC37197Ga8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void APy() {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENA.APy():void");
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C34641FNy c34641FNy = this.A07;
        if (c34641FNy == null) {
            C14360o3.A0F("pendingChannelMembersController");
            throw C00O.createAndThrow();
        }
        return AbstractC31171DnF.A1b(c34641FNy.A07);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C34641FNy c34641FNy = this.A07;
        if (c34641FNy == null) {
            C14360o3.A0F("pendingChannelMembersController");
            throw C00O.createAndThrow();
        }
        return c34641FNy.A03;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C34641FNy c34641FNy = this.A07;
        if (c34641FNy == null) {
            C14360o3.A0F("pendingChannelMembersController");
            throw C00O.createAndThrow();
        }
        return c34641FNy.A02;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        C34641FNy c34641FNy = this.A07;
        if (c34641FNy == null) {
            C14360o3.A0F("pendingChannelMembersController");
            throw C00O.createAndThrow();
        }
        c34641FNy.A02 = false;
        E70 e70 = c34641FNy.A00;
        if (e70 != null) {
            AbstractC1345466e.A06(e70.A0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // X.C7ZH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cvu(int r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r6 = r20
            r7 = r19
            r5 = r17
            X.E70 r4 = r5.A0A
            if (r4 == 0) goto L5c
            int r1 = r4.A09
            r0 = 29
            if (r1 != r0) goto L5c
            java.lang.String r9 = X.E70.A03(r4)
            java.lang.String r10 = r4.A0Q
            r0 = 2
            java.lang.String r2 = "broadcastChatLogger"
            r3 = r18
            if (r3 == r0) goto L68
            r0 = 3
            java.lang.String r1 = "moderatorRoleCreatorBroadcastChannelLogger"
            if (r3 == r0) goto L5d
            r0 = 6
            if (r3 == r0) goto L73
            r0 = 7
            if (r3 != r0) goto L5c
            X.FzK r3 = r5.A0G
            if (r3 == 0) goto Lbf
            int r16 = r4.A06()
            java.lang.Integer r2 = X.C05F.A01
        L32:
            java.util.HashMap r15 = X.AbstractC166987dD.A1G()
            java.lang.String r1 = ""
            if (r19 != 0) goto L3b
            r7 = r1
        L3b:
            java.lang.String r0 = "error_message"
            r15.put(r0, r7)
            if (r20 == 0) goto L43
            r1 = r6
        L43:
            X.AbstractC31171DnF.A1U(r1, r15)
            java.lang.String r1 = X.AbstractC31180DnO.A0j(r2)
            java.lang.String r0 = "invite_status"
            r15.put(r0, r1)
            com.instagram.common.session.UserSession r8 = r3.A00
            java.lang.String r11 = "remove_moderator_error"
            java.lang.String r12 = "view"
            java.lang.String r13 = "remove_moderator"
            java.lang.String r14 = "thread_details_people"
            X.AbstractC34065F1s.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L5c:
            return
        L5d:
            X.FzK r3 = r5.A0G
            if (r3 == 0) goto Lbf
            int r16 = r4.A06()
            java.lang.Integer r2 = X.C05F.A00
            goto L32
        L68:
            X.6ck r8 = r5.A01
            if (r8 == 0) goto Lbb
            int r5 = r4.A06()
            java.lang.Integer r4 = X.C05F.A00
            goto L7d
        L73:
            X.6ck r8 = r5.A01
            if (r8 == 0) goto Lbb
            int r5 = r4.A06()
            java.lang.Integer r4 = X.C05F.A01
        L7d:
            X.1Mh r3 = X.AbstractC31172DnG.A0I(r8)
            boolean r0 = X.AbstractC25226BEj.A1Z(r3)
            if (r0 == 0) goto L5c
            java.util.HashMap r2 = X.AbstractC166987dD.A1G()
            java.lang.String r1 = ""
            if (r19 != 0) goto L90
            r7 = r1
        L90:
            java.lang.String r0 = "error_message"
            r2.put(r0, r7)
            if (r20 != 0) goto L98
            r6 = r1
        L98:
            X.AbstractC31171DnF.A1U(r6, r2)
            java.lang.String r1 = X.AbstractC31180DnO.A0j(r4)
            java.lang.String r0 = "invite_status"
            r2.put(r0, r1)
            X.AbstractC31175DnJ.A1B(r3, r8)
            java.lang.String r0 = "remove_collaborator_error"
            X.AbstractC31174DnI.A1J(r3, r0)
            java.lang.String r0 = "remove_collaborator"
            r3.A0o(r0)
            java.lang.String r0 = "thread_details_people"
            java.lang.Long r0 = X.AbstractC31179DnN.A0a(r3, r0, r9, r10, r5)
            X.AbstractC31175DnJ.A1C(r3, r0, r2)
            return
        Lbb:
            X.C14360o3.A0F(r2)
            goto Lc2
        Lbf:
            X.C14360o3.A0F(r1)
        Lc2:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENA.Cvu(int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // X.C7ZH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cvv(int r14) {
        /*
            r13 = this;
            X.E70 r3 = r13.A0A
            if (r3 == 0) goto L41
            int r1 = r3.A09
            r0 = 29
            if (r1 != r0) goto L41
            java.lang.String r5 = X.E70.A03(r3)
            java.lang.String r6 = r3.A0Q
            r0 = 2
            java.lang.String r1 = "broadcastChatLogger"
            if (r14 == r0) goto L4d
            r0 = 3
            java.lang.String r2 = "moderatorRoleCreatorBroadcastChannelLogger"
            if (r14 == r0) goto L42
            r0 = 6
            if (r14 == r0) goto L58
            r0 = 7
            if (r14 != r0) goto L41
            X.FzK r1 = r13.A0G
            if (r1 == 0) goto L90
            int r12 = r3.A06()
            java.lang.Integer r0 = X.C05F.A01
        L2a:
            com.instagram.common.session.UserSession r4 = r1.A00
            java.lang.String r1 = X.AbstractC31180DnO.A0j(r0)
            java.lang.String r0 = "invite_status"
            java.util.HashMap r11 = X.AbstractC167017dG.A0r(r0, r1)
            java.lang.String r7 = "remove_moderator_success"
            java.lang.String r8 = "view"
            java.lang.String r9 = "remove_moderator"
            java.lang.String r10 = "thread_details_people"
            X.AbstractC34065F1s.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L41:
            return
        L42:
            X.FzK r1 = r13.A0G
            if (r1 == 0) goto L90
            int r12 = r3.A06()
            java.lang.Integer r0 = X.C05F.A00
            goto L2a
        L4d:
            X.6ck r4 = r13.A01
            if (r4 == 0) goto L8c
            int r3 = r3.A06()
            java.lang.Integer r1 = X.C05F.A00
            goto L62
        L58:
            X.6ck r4 = r13.A01
            if (r4 == 0) goto L8c
            int r3 = r3.A06()
            java.lang.Integer r1 = X.C05F.A01
        L62:
            X.1Mh r2 = X.AbstractC31172DnG.A0I(r4)
            boolean r0 = X.AbstractC25226BEj.A1Z(r2)
            if (r0 == 0) goto L41
            X.AbstractC31175DnJ.A1B(r2, r4)
            java.lang.String r0 = "remove_collaborator_success"
            X.AbstractC31174DnI.A1J(r2, r0)
            java.lang.String r0 = "remove_collaborator"
            r2.A0o(r0)
            java.lang.String r0 = "thread_details_people"
            java.lang.Long r0 = X.AbstractC31179DnN.A0a(r2, r0, r5, r6, r3)
            r2.A0h(r0)
            java.lang.String r1 = X.AbstractC31180DnO.A0j(r1)
            java.lang.String r0 = "invite_status"
            X.AbstractC31178DnM.A1G(r2, r0, r1)
            return
        L8c:
            X.C14360o3.A0F(r1)
            goto L93
        L90:
            X.C14360o3.A0F(r2)
        L93:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENA.Cvv(int):void");
    }

    @Override // X.InterfaceC37214GaP
    public final void Dev(C32107E9f c32107E9f) {
        if (isResumed()) {
            E70 e70 = this.A0A;
            if (e70 != null) {
                String str = "directAdminToolSessionManager";
                if (c32107E9f.A08) {
                    C142846ck c142846ck = this.A01;
                    if (c142846ck == null) {
                        str = "broadcastChatLogger";
                    } else {
                        int A06 = e70.A06();
                        String A03 = E70.A03(e70);
                        String str2 = e70.A0Q;
                        C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
                        if (AbstractC25226BEj.A1Z(A0I)) {
                            AbstractC31175DnJ.A1B(A0I, c142846ck);
                            AbstractC31174DnI.A1I(A0I, AbstractC111324zv.A00(5213));
                            A0I.A0o("remove_button");
                            A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details_people", A03, str2, A06));
                            A0I.Cht();
                        }
                        Context requireContext = requireContext();
                        UserSession A0r = AbstractC166987dD.A0r(this.A0L);
                        C7MJ c7mj = this.A0H;
                        if (c7mj != null) {
                            AbstractC35213Fg6.A00(requireContext, A0r, this, c7mj, e70, c32107E9f);
                            return;
                        }
                    }
                } else if (c32107E9f.A0C) {
                    C36267FzK c36267FzK = this.A0G;
                    if (c36267FzK == null) {
                        str = "moderatorRoleCreatorBroadcastChannelLogger";
                    } else {
                        int A062 = e70.A06();
                        AbstractC34065F1s.A00(c36267FzK.A00, E70.A03(e70), e70.A0Q, "remove_moderator_dialog_rendered", "tap", "remove_button", "thread_details_people", null, A062);
                        Context requireContext2 = requireContext();
                        UserSession A0r2 = AbstractC166987dD.A0r(this.A0L);
                        C7MJ c7mj2 = this.A0H;
                        if (c7mj2 != null) {
                            AbstractC35213Fg6.A01(requireContext2, A0r2, this, c7mj2, e70, c32107E9f);
                            return;
                        }
                    }
                } else {
                    throw AbstractC166987dD.A14("User is neither Moderator nor Collaborator");
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r0.contains(r1) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        if (r1 != 61) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r1 == 29) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        r1 = 2131959547;
        r0 = new X.ViewOnClickListenerC35642Foc(r39, r13, r38, r5, r4, r3, r38, 1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        r2.A01(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
    
        if (X.C98Q.A00(r4).A00(r12, 33) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        if (X.AbstractC31171DnF.A0n(r3.A0Z).contains(r39) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
    
        if (X.AbstractC31171DnF.A0n(r3.A0Y).contains(r39) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
    
        if (X.AbstractC31171DnF.A0n(r3.A0b).contains(r39) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        r1 = 2131959546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
    
        if (r9.contains(r7) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
    
        r1 = 2131959545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0131, code lost:
    
        r2.A03(new X.ViewOnClickListenerC35647Foh(r5, r38, r4, r38, r13, r3, r39, r12, r7, r35, r36), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ef, code lost:
    
        if (r39.A08 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f1, code lost:
    
        r1 = 2131959058;
        r26 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f6, code lost:
    
        r0 = new X.ViewOnClickListenerC35633FoO(r26, r3, r39, r4, r38, r13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020d, code lost:
    
        if (r39.A0C == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x020f, code lost:
    
        r1 = 2131959059;
        r26 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0217, code lost:
    
        if (r39.A0A == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0219, code lost:
    
        r1 = 2131959043;
        r26 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0221, code lost:
    
        if (r39.A0B == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0223, code lost:
    
        r1 = 2131959043;
        r26 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01eb, code lost:
    
        if (X.AbstractC167007dF.A1Z(r39.A02) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0231, code lost:
    
        if (r7.equals(X.E70.A02(r3)) == false) goto L50;
     */
    @Override // X.InterfaceC37214GaP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dy2(X.C32107E9f r39) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENA.Dy2(X.E9f):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0L);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        FKX fkx;
        C34641FNy c34641FNy = this.A07;
        if (c34641FNy == null) {
            C14360o3.A0F("pendingChannelMembersController");
            throw C00O.createAndThrow();
        }
        if (!c34641FNy.A04 && ((fkx = this.A05) == null || !fkx.A01)) {
            return false;
        }
        return true;
    }

    private final List A00(Context context, E70 e70, EnumC31337Dq2 enumC31337Dq2, Map map) {
        List list = (List) map.get(enumC31337Dq2);
        if (list != null && !list.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(new G33(context, AbstractC166987dD.A0r(this.A0L), e70, enumC31337Dq2));
            A1E.add(new C36358G2k(enumC31337Dq2, list));
            return A1E;
        }
        return C16930sl.A00;
    }

    public final void A02() {
        if (isResumed()) {
            APy();
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        FKX fkx;
        if (!CL7() && ((fkx = this.A05) == null || !fkx.A01)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37197Ga8
    public final void Ch3() {
        FragmentActivity activity = getActivity();
        if (activity != null && !AbstractC46763KmK.A00(activity)) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC37197Ga8
    public final void ChP() {
        A01(this);
    }

    @Override // X.InterfaceC37214GaP
    public final void Djm(C32107E9f c32107E9f) {
        String str;
        if (isResumed()) {
            InterfaceC09390do interfaceC09390do = this.A0L;
            G4S g4s = new G4S(AbstractC166987dD.A0r(interfaceC09390do));
            FragmentActivity requireActivity = requireActivity();
            User user = c32107E9f.A00;
            g4s.Cqf(requireActivity, user, AbstractC111324zv.A00(4302), true);
            E70 e70 = this.A0A;
            if (e70 != null) {
                C81543kP c81543kP = e70.A0E;
                if (e70.A09 == 29 && c81543kP != null) {
                    String str2 = null;
                    InterfaceC83733oI interfaceC83733oI = e70.A0L;
                    if (interfaceC83733oI != null) {
                        str = AbstractC1345466e.A07(interfaceC83733oI);
                    } else {
                        str = null;
                    }
                    E70 e702 = this.A0A;
                    if (e702 != null) {
                        str2 = e702.A0Q;
                    }
                    C142846ck c142846ck = this.A01;
                    if (c142846ck == null) {
                        C14360o3.A0F("broadcastChatLogger");
                        throw C00O.createAndThrow();
                    }
                    C142846ck.A07(c142846ck, str, str2, user.getId(), "see_channels", C160857It.A00(c81543kP, AbstractC31173DnH.A0t(interfaceC09390do), e70.A09), e70.A06());
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A12;
        int i;
        FKX fkx;
        int A02 = C0f9.A02(-544842024);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A0F = capabilities;
            InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A00 != null) {
                this.A0I = A00;
                this.A00 = requireArguments.getInt(AbstractC43591JPw.A00(26));
                requireArguments.getBoolean("DirectThreadDetailFragment.SHOULD_ALLOW_LEAVE_CONVERSATION", true);
                this.A0J = requireArguments.getBoolean("DirectThreadDetailFragment.SHOULD_SHOW_PRIVACY_SETTINGS_ONLY", true);
                Context requireContext = requireContext();
                InterfaceC09390do interfaceC09390do = this.A0L;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                FragmentActivity requireActivity = requireActivity();
                InterfaceC83733oI interfaceC83733oI = this.A0I;
                String str = "threadId";
                if (interfaceC83733oI != null) {
                    this.A06 = new C35010Fbh(requireContext, requireActivity, this, A0r, this, interfaceC83733oI instanceof MsysThreadId);
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                    Context A0O = AbstractC166987dD.A0O(requireContext());
                    C14360o3.A0B(A0o, 0);
                    this.A0H = (C7MJ) A0o.A01(C7MJ.class, new C9F6(6, A0o, A0O));
                    Context requireContext2 = requireContext();
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    InterfaceC83733oI interfaceC83733oI2 = this.A0I;
                    if (interfaceC83733oI2 != null) {
                        Capabilities capabilities2 = this.A0F;
                        if (capabilities2 == null) {
                            str = "threadCapabilities";
                        } else {
                            this.A03 = C7KH.A01(requireContext2, A0r2, capabilities2, interfaceC83733oI2);
                            this.A0E = AbstractC31176DnK.A0O(AbstractC166987dD.A0o(interfaceC09390do), __redex_internal_original_name);
                            this.A0D = AbstractC31177DnL.A0L(this);
                            this.A08 = new C31539DtP(AbstractC166987dD.A0r(interfaceC09390do), this, null);
                            this.A01 = AbstractC31176DnK.A0V(interfaceC09390do);
                            this.A0G = AbstractC34061F1o.A00(AbstractC166987dD.A0r(interfaceC09390do));
                            this.A07 = new C34641FNy(AbstractC166987dD.A0r(interfaceC09390do), this);
                            if (this.A00 == 29) {
                                fkx = new FKX(AbstractC166987dD.A0r(interfaceC09390do));
                            } else {
                                fkx = null;
                            }
                            this.A05 = fkx;
                            C31539DtP c31539DtP = this.A08;
                            if (c31539DtP == null) {
                                str = "restrictController";
                            } else {
                                registerLifecycleListener(c31539DtP);
                                InterfaceC37169GZg interfaceC37169GZg = this.A03;
                                if (interfaceC37169GZg == null) {
                                    str = "clientInfra";
                                } else {
                                    InterfaceC37279GbW.A01(interfaceC37169GZg);
                                    C0f9.A09(825699321, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A12 = AbstractC31172DnG.A0t();
            i = -1329856178;
        } else {
            A12 = AbstractC166987dD.A12("threadCapabilities can't be null");
            i = -1482394080;
        }
        C0f9.A09(i, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(772286995);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_people_fragment, viewGroup, false);
        C0f9.A09(1527071884, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1293098996);
        super.onDestroy();
        C31539DtP c31539DtP = this.A08;
        if (c31539DtP == null) {
            C14360o3.A0F("restrictController");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(c31539DtP);
        C0f9.A09(1327905715, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-830407842);
        super.onDestroyView();
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(null);
        this.A04 = null;
        this.A0O.A01();
        C0f9.A09(347914924, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(420844138);
        super.onPause();
        InterfaceC37169GZg interfaceC37169GZg = this.A03;
        String str = "clientInfra";
        if (interfaceC37169GZg != null) {
            interfaceC37169GZg.BOE().stop();
            InterfaceC37169GZg interfaceC37169GZg2 = this.A03;
            if (interfaceC37169GZg2 != null) {
                InterfaceC50513MRq B5I = interfaceC37169GZg2.B5I();
                if (B5I != null) {
                    B5I.stop();
                }
                C25671My A0Q = AbstractC31176DnK.A0Q(this.A0L);
                A0Q.A02(this.A0M, C2Io.class);
                A0Q.A02(this.A0N, C42281xI.class);
                C31539DtP c31539DtP = this.A08;
                if (c31539DtP == null) {
                    str = "restrictController";
                } else {
                    registerLifecycleListener(c31539DtP);
                    C7MJ c7mj = this.A0H;
                    if (c7mj == null) {
                        str = "directAdminToolSessionManager";
                    } else {
                        c7mj.A03.remove(this);
                        C0f9.A09(1354359665, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(1566087394);
        super.onResume();
        InterfaceC37169GZg interfaceC37169GZg = this.A03;
        if (interfaceC37169GZg != null) {
            InterfaceC37279GbW.A01(interfaceC37169GZg);
            InterfaceC37169GZg interfaceC37169GZg2 = this.A03;
            if (interfaceC37169GZg2 != null) {
                InterfaceC50513MRq B5I = interfaceC37169GZg2.B5I();
                InterfaceC09390do interfaceC09390do = this.A0L;
                if (C7KH.A07(AbstractC166987dD.A0r(interfaceC09390do)) && B5I != null) {
                    GSS.A02(B5I, this, C07Y.A00(this), 29);
                    B5I.start();
                }
                C25671My A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
                A0Q.A01(this.A0M, C2Io.class);
                A0Q.A01(this.A0N, C42281xI.class);
                C7MJ c7mj = this.A0H;
                if (c7mj == null) {
                    str = "directAdminToolSessionManager";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c7mj.A03.add(this);
                A01(this);
                C0f9.A09(-54275185, A02);
                return;
            }
        }
        str = "clientInfra";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
