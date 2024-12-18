package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G4N implements C7ZY, C7Zf, InterfaceC164957Zk, InterfaceC165047Zt, InterfaceC165057Zu, InterfaceC165067Zv, InterfaceC165117a0, InterfaceC165147a3, InterfaceC165157a4, InterfaceC165267aF, InterfaceC165277aG, InterfaceC165287aH, InterfaceC165407aT, InterfaceC165417aU, InterfaceC165427aV, InterfaceC165447aX, InterfaceC165457aY, InterfaceC165647ar, InterfaceC165657as, InterfaceC165667at, InterfaceC165677au, InterfaceC165707ax, InterfaceC165737b0, InterfaceC165747b1, InterfaceC165757b2 {
    public final FragmentActivity A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C163867Va A04;
    public final LEK A05;
    public final C7XS A06;
    public final InterfaceC1119353f A07;
    public final InterfaceC08830cm A08;
    public final InterfaceC08830cm A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final InterfaceC08830cm A0C;
    public final InterfaceC08830cm A0D;
    public final InterfaceC08830cm A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final C7WA A0K;
    public final InterfaceC164877Za A0L;
    public final InterfaceC165017Zq A0M;
    public final InterfaceC165297aI A0N;
    public final InterfaceC163877Vb A0O;
    public final InterfaceC165227aB A0P;
    public final LnQ A0Q;
    public final InterfaceC60442pS A0R;

    @Override // X.C7Zf
    public final void Cqb(String str, String str2) {
        ((C49072Lmy) this.A0G.getValue()).Cqb(str, null);
    }

    @Override // X.InterfaceC165417aU
    public final void Cqh(String str, String str2, List list) {
        Bundle A0E = AbstractC31174DnI.A0E(list, 2);
        A0E.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A0E.putString("client_context", str2);
        A0E.putStringArrayList(AbstractC43591JPw.A00(1170), AbstractC166987dD.A1F(list));
        AbstractC43826JZo.A01(A0E, (C3o9) AbstractC31172DnG.A0y(this.A0C), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        UserSession userSession = this.A03;
        C45518KDj c45518KDj = new C45518KDj();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putAll(A0E);
        AbstractC31173DnH.A1C(A0b, userSession);
        c45518KDj.setArguments(A0b);
        InterfaceC08830cm interfaceC08830cm = this.A08;
        C14360o3.A0B(interfaceC08830cm, 0);
        c45518KDj.A09 = interfaceC08830cm;
        c45518KDj.A07 = this.A0Q;
        c45518KDj.A04 = this.A0N;
        c45518KDj.A05 = this.A0P;
        c45518KDj.A02 = this.A0L;
        c45518KDj.A03 = this.A0M;
        AbstractC25229BEm.A18(c45518KDj, AbstractC25225BEi.A0r(this.A00, userSession));
    }

    @Override // X.C7Zf
    public final void Cqj(RectF rectF, ImageUrl imageUrl, C47777L8c c47777L8c, MessageIdentifier messageIdentifier, C40971v4 c40971v4, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C14360o3.A0B(rectF, 6);
        ((C49072Lmy) this.A0G.getValue()).Cqj(rectF, imageUrl, c47777L8c, messageIdentifier, c40971v4, bool, bool2, str, str2, str3, str4, str5, str6, z);
    }

    @Override // X.InterfaceC165427aV
    public final void Cqs(DirectMessageIdentifier directMessageIdentifier) {
        C83403nh c83403nh;
        Object obj;
        String str;
        C14360o3.A0B(directMessageIdentifier, 0);
        InterfaceC08830cm interfaceC08830cm = this.A08;
        C7U0 c7u0 = (C7U0) interfaceC08830cm.get();
        InterfaceC163557Ts BT6 = c7u0.BT6();
        String Arm = BT6.Arm(directMessageIdentifier);
        String AaT = BT6.AaT(directMessageIdentifier);
        C160787Im BT7 = ((C7U0) interfaceC08830cm.get()).Avk().BT7(((MessageIdentifier) directMessageIdentifier).A01);
        String str2 = null;
        if (BT7 != null && (c83403nh = BT7.A0e) != null) {
            Iterator it = c7u0.C7r().BSH().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(AbstractC31171DnF.A0g(obj), c83403nh.A1u)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                if (BT6.CYV(directMessageIdentifier)) {
                    UserSession userSession = this.A03;
                    new BP5(userSession, null).A03(C8p.A0S);
                    C7BW c7bw = c83403nh.A0Q;
                    if (c7bw != null && (str = c7bw.A05) != null && str.length() != 0) {
                        User A10 = AbstractC166987dD.A10(userSession);
                        InterfaceC37261oP A00 = C37321oV.A00();
                        FragmentActivity fragmentActivity = this.A00;
                        C09530e4 A1L = AbstractC166987dD.A1L(AbstractC111324zv.A00(199), AaT);
                        C09530e4 A1L2 = AbstractC166987dD.A1L(AbstractC111324zv.A00(380), Arm);
                        C09530e4 A1L3 = AbstractC166987dD.A1L(AbstractC111324zv.A00(858), str);
                        C09530e4 A1L4 = AbstractC166987dD.A1L(AbstractC111324zv.A00(198), c83403nh.A0h());
                        C09530e4 A1L5 = AbstractC166987dD.A1L(AbstractC111324zv.A00(381), c83403nh.A0g());
                        C83693oE A0U = c83403nh.A0U();
                        if (A0U != null) {
                            str2 = A0U.A00;
                        }
                        C09530e4 A1L6 = AbstractC166987dD.A1L(AbstractC111324zv.A00(382), str2);
                        String Aaa = user.A03.Aaa();
                        if (Aaa == null) {
                            Aaa = A10.A03.getFbidV2();
                        }
                        A00.Cgn(fragmentActivity, AbstractC61636Rr0.A00(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, AbstractC166987dD.A1L(MSV.A00(425), Aaa)), userSession);
                        return;
                    }
                    return;
                }
                String Aae = user.A03.Aae();
                if (Aae == null) {
                    return;
                }
                UserSession userSession2 = this.A03;
                C25531Mh A002 = C28484Chc.A00(new C28484Chc(userSession2));
                if (AbstractC25226BEj.A1Z(A002)) {
                    A002.A0k("thread_view_edit_ai_icon_clicked");
                    A002.A0i(AbstractC166997dE.A0j(Aae));
                    A002.Cht();
                }
                boolean A1X = AbstractC167007dF.A1X(user.A03.Aai(), IGAIAgentVisibilityStatus.A05);
                C189448aO A0y = AbstractC25225BEi.A0y(userSession2);
                FragmentActivity fragmentActivity2 = this.A00;
                A0y.A0d = AbstractC166997dE.A0p(fragmentActivity2, 2131952773);
                C189478aR A003 = GH5.A00(A0y, this, 11);
                C27927CSm c27927CSm = new C27927CSm(this, A003, Aae, AaT, Arm, A1X);
                C26728Br9 c26728Br9 = new C26728Br9();
                c26728Br9.A01 = Aae;
                c26728Br9.A00 = c27927CSm;
                this.A0O.CMc();
                A003.A02(fragmentActivity2, c26728Br9);
                this.A06.D0E();
            }
        }
    }

    @Override // X.InterfaceC165677au
    public final boolean Cqt(String str) {
        String str2;
        List list;
        C81663kb A0h;
        boolean A1P = AbstractC167007dF.A1P(AbstractC31172DnG.A00(AbstractC31176DnK.A0X(this.A08)), 29);
        InterfaceC08830cm interfaceC08830cm = this.A0C;
        DirectThreadKey A02 = JRE.A02((C3o9) interfaceC08830cm.get());
        Boolean bool = null;
        if (A02 != null) {
            str2 = A02.A00;
        } else {
            str2 = null;
        }
        DirectThreadKey A022 = JRE.A02((C3o9) interfaceC08830cm.get());
        if (A022 != null) {
            list = A022.A02;
        } else {
            list = null;
        }
        UserSession userSession = this.A03;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        if (str2 != null && (A0h = AbstractC31172DnG.A0h(A00, str2)) != null) {
            bool = Boolean.valueOf(AbstractC31224Do7.A01(A0h));
        }
        if (A1P || str2 == null || list == null || AbstractC166997dE.A1Z(bool, true) || !C18U.A06(C06090Tz.A05, userSession, 36323242796919903L)) {
            return false;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(2255), str);
        A0b.putString(AbstractC43591JPw.A00(918), str2);
        A0b.putStringArray(AbstractC43591JPw.A00(917), AbstractC31173DnH.A1b(list, 0));
        AbstractC25228BEl.A1G(this.A00, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(4275));
        return true;
    }

    @Override // X.InterfaceC165117a0
    public final void Cqv(RectF rectF, InterfaceC50477MQf interfaceC50477MQf, MessageIdentifier messageIdentifier, List list, List list2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(messageIdentifier, 0);
        ((C49074Ln0) this.A0I.getValue()).Cqv(rectF, interfaceC50477MQf, messageIdentifier, list, list2, z, z2, z3);
    }

    @Override // X.C7ZY
    public final void Cqx(String str) {
        if (AbstractC34109F3l.A00(str)) {
            String A0c = AbstractC31175DnJ.A0c(AbstractC25227BEk.A0B(str).getPathSegments(), 0);
            AbstractC35105Fe7.A00(this.A00, this.A02, this.A03, AbstractC25231BEo.A0j(0, A0c), "ig_direct");
            return;
        }
        throw AbstractC166987dD.A12("Uri is not a valid Facebook profile uri");
    }

    @Override // X.InterfaceC165047Zt
    public final void Cr0(String str) {
        C14360o3.A0B(str, 0);
        ((G4V) this.A0J.getValue()).Cr0(str);
    }

    @Override // X.InterfaceC165287aH
    public final void Cr4(String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C3o9 c3o9 = (C3o9) this.A0C.get();
        boolean A09 = JRE.A09(AbstractC31176DnK.A0X(this.A08).B90());
        FragmentActivity fragmentActivity = this.A00;
        C25531Mh A00 = C162337Ov.A00(interfaceC11380iw, userSession, c3o9, A09, AbstractC14490oL.A0A(fragmentActivity), AbstractC151386rg.A06(str));
        A00.A0R("hashtag", str);
        A00.Cht();
        AbstractC25229BEm.A18(WE2.A02(userSession, AbstractC1120253r.A00(str), interfaceC11380iw.getModuleName(), "DEFAULT"), AbstractC25225BEi.A0r(fragmentActivity, userSession));
    }

    @Override // X.InterfaceC165147a3
    public final void CrG(EnumC40111tc enumC40111tc, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C3o9 Afi;
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1T(str4, str5);
        InterfaceC163837Ux A0X = AbstractC31176DnK.A0X(this.A08);
        C83693oE BNh = A0X.BNh();
        if (BNh == null || (Afi = AbstractC1345466e.A05(BNh)) == null) {
            Afi = A0X.Afi();
        }
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        boolean A09 = JRE.A09(A0X.B90());
        AbstractC59962oe abstractC59962oe = this.A01;
        C25531Mh A00 = C162337Ov.A00(interfaceC11380iw, userSession, Afi, A09, AbstractC14490oL.A0A(abstractC59962oe.requireContext()), false);
        A00.A0R("media_id", str);
        A00.Cht();
        C35028Fc1 A002 = C35028Fc1.A00(str);
        A002.A0C = str4;
        A002.A0D = str5;
        A002.A0K = true;
        A002.A0J = true;
        if (z) {
            A002.A0L = true;
        }
        if (i != -1) {
            A002.A00 = i;
        }
        AbstractC25229BEm.A18(A002.A02(), AbstractC31175DnJ.A0C(abstractC59962oe, userSession));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ce, code lost:
    
        if (((X.C910143t) r13.get(0)).A02 != 10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x022f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1, 36319377327660340L) == false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC164957Zk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CrH(android.view.View r86, X.E6B r87, java.lang.Integer r88, java.util.List r89, int r90, boolean r91, boolean r92) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4N.CrH(android.view.View, X.E6B, java.lang.Integer, java.util.List, int, boolean, boolean):void");
    }

    @Override // X.InterfaceC165157a4
    public final void CrN(String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C3o9 c3o9 = (C3o9) this.A0C.get();
        boolean A09 = JRE.A09(AbstractC31176DnK.A0X(this.A08).B90());
        FragmentActivity fragmentActivity = this.A00;
        C25531Mh A00 = C162337Ov.A00(interfaceC11380iw, userSession, c3o9, A09, AbstractC14490oL.A0A(fragmentActivity), AbstractC151386rg.A06(str));
        A00.A0R("destination", "phone");
        A00.Cht();
        Intent A08 = AbstractC31177DnL.A08("android.intent.action.DIAL");
        A08.setData(AbstractC08820cl.A01((InterfaceC08100bW) this.A0F.getValue(), AnonymousClass001.A0R("tel:", str)));
        C12260kU.A0E(fragmentActivity, A08);
    }

    @Override // X.InterfaceC165157a4
    public final void CrO(View view, String str, boolean z) {
        C199928sw c199928sw;
        int i;
        boolean A1R = AbstractC167007dF.A1R(0, str, view);
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C3o9 c3o9 = (C3o9) this.A0C.get();
        InterfaceC08830cm interfaceC08830cm = this.A08;
        C25531Mh A00 = C162337Ov.A00(interfaceC11380iw, userSession, c3o9, JRE.A09(AbstractC31176DnK.A0X(interfaceC08830cm).B90()), AbstractC14490oL.A0A(this.A00), AbstractC151386rg.A06(str));
        A00.A0R("destination", "phone");
        A00.Cht();
        InterfaceC83713oG C7i = AbstractC31176DnK.A0X(interfaceC08830cm).C7i();
        C14360o3.A07(C7i);
        Context A0L = AbstractC166997dE.A0L(view);
        FPK fpk = new FPK(interfaceC11380iw, userSession);
        InterfaceC08100bW A0B = AbstractC31175DnJ.A0B();
        C199928sw c199928sw2 = new C199928sw(null, A0L.getDrawable(R.drawable.instagram_call_pano_outline_24), null, new G8E(A0L, A0B, fpk, C7i, str), null, AbstractC166997dE.A0p(A0L, 2131960131), 0, 0, 0, false, false, false, A1R, false, false, false);
        if (C18U.A06(C06090Tz.A05, userSession, 36322461112936703L)) {
            c199928sw = new C199928sw(null, A0L.getDrawable(R.drawable.instagram_app_imessage_pano_outline_24), null, new G8D(A0L, fpk, C7i, str, A1R ? 1 : 0), null, AbstractC166997dE.A0p(A0L, 2131960133), 0, 0, 0, false, false, false, A1R, false, false, false);
        } else {
            c199928sw = null;
        }
        C199928sw[] c199928swArr = {c199928sw2, c199928sw, new C199928sw(null, A0L.getDrawable(R.drawable.instagram_copy_pano_outline_24), null, new G8D(A0L, fpk, C7i, str, 0), null, AbstractC166997dE.A0p(A0L, 2131960132), 0, 0, 0, false, false, false, A1R, false, false, false)};
        C14360o3.A0B(c199928swArr, 0);
        C8QJ A0X = AbstractC31174DnI.A0X(A0L, userSession, AbstractC009903n.A0I(c199928swArr), false);
        int i2 = 8388611;
        if (z) {
            i2 = 8388613;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        C09530e4 A002 = A0X.A00();
        int i3 = AbstractC13880nE.A0E(A0L).y - C30D.A00;
        int height = iArr[A1R ? 1 : 0] + view.getHeight();
        Number number = (Number) A002.A01;
        if (height + number.intValue() > i3) {
            i = (-number.intValue()) - view.getMeasuredHeight();
        } else {
            i = 0;
        }
        A0X.showAsDropDown(view, 0, i, i2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fpk.A00, "direct_phone_number_menu_impression");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1H(A0f, AbstractC92784Dr.A02(C7i));
            AbstractC31175DnJ.A1A(A0f, AbstractC140946Yw.A07(C7i));
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC165047Zt
    public final void Crm(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1N(str, str2);
        ((G4V) this.A0J.getValue()).Crm(str, str2, str3, z, z2, z3);
    }

    @Override // X.InterfaceC165047Zt
    public final void Crn(C47777L8c c47777L8c, C1NB c1nb, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 0);
        ((G4V) this.A0J.getValue()).Crn(c47777L8c, c1nb, str, str2, str3, z, z2, z3);
    }

    @Override // X.InterfaceC165057Zu
    public final void Crp(RectF rectF, C47777L8c c47777L8c, MessageIdentifier messageIdentifier, C1NB c1nb, String str, String str2, String str3, String str4, String str5) {
        AbstractC167027dH.A12(str, str2, c1nb);
        AbstractC167007dF.A1I(messageIdentifier, 7, str5);
        ((G4V) this.A0J.getValue()).Crp(rectF, c47777L8c, messageIdentifier, c1nb, str, str2, str3, str4, str5);
    }

    @Override // X.InterfaceC165067Zv
    public final void Cs3(String str, boolean z, String str2) {
        String str3;
        C14360o3.A0B(str, 0);
        InterfaceC08830cm interfaceC08830cm = this.A08;
        InterfaceC163557Ts BT6 = ((C7U0) interfaceC08830cm.get()).BT6();
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        Map BOu = BT6.BOu(new MessageIdentifier(str3, null));
        if (BOu != null) {
            C25531Mh A00 = C162337Ov.A00(this.A02, this.A03, (C3o9) this.A0C.get(), JRE.A09(AbstractC31176DnK.A0X(interfaceC08830cm).B90()), AbstractC14490oL.A0A(this.A00), AbstractC151386rg.A06(str));
            A00.A0R("destination", "profile");
            A00.A0R("message_id", str2);
            A00.A0v(BOu);
            A00.Cht();
        }
        C28431Ze A02 = AbstractC31364DqT.A02();
        UserSession userSession = this.A03;
        Fragment A002 = C31368DqX.A00(userSession, A02, AbstractC31402Dr6.A02(userSession, str, AbstractC43591JPw.A00(933), this.A02.getModuleName()));
        if (z && C18U.A06(C06090Tz.A05, userSession, 36326120425076385L)) {
            Bundle bundle = A002.mArguments;
            FragmentActivity fragmentActivity = this.A00;
            C6XJ A0L = AbstractC31171DnF.A0L(fragmentActivity, bundle, userSession, ModalActivity.class, "profile");
            A0L.A05 = "ds_message_mention";
            A0L.A08();
            A0L.A0C(fragmentActivity);
            return;
        }
        C140966Yy A0O = AbstractC31173DnH.A0O(null, A002, this.A00, userSession);
        A0O.A0B = "ds_message_mention";
        A0O.A0F = true;
        A0O.A04();
    }

    public static InterfaceC09390do A00(UserSession userSession, Object obj, EnumC09460dv enumC09460dv, int i) {
        C37059GUt c37059GUt = new C37059GUt(obj, i);
        if (C7W0.A00(userSession)) {
            return AbstractC09440dt.A00(enumC09460dv, c37059GUt);
        }
        return new C28111Xp(c37059GUt.invoke());
    }

    @Override // X.C7ZY
    public final void AGr(String str) {
        InterfaceC08830cm interfaceC08830cm = this.A08;
        DirectThreadThemeInfo C7j = AbstractC31176DnK.A0X(interfaceC08830cm).C7j();
        C3o9 B6l = AbstractC31176DnK.A0X(interfaceC08830cm).B6l();
        if (C7j != null && B6l != null) {
            this.A0O.CMc();
            UserSession userSession = this.A03;
            Context requireContext = this.A01.requireContext();
            FragmentActivity fragmentActivity = this.A00;
            C7XS c7xs = this.A06;
            int A00 = AbstractC31172DnG.A00(AbstractC31176DnK.A0X(interfaceC08830cm));
            F3C.A00(requireContext, fragmentActivity, userSession, c7xs, AbstractC34894FZg.A00(C7j), B6l, str, A00, AbstractC31176DnK.A0X(interfaceC08830cm).C7W().A07, AbstractC31176DnK.A0X(interfaceC08830cm).CX1(), AbstractC31176DnK.A0X(interfaceC08830cm).CWO(), C161867Mw.A02(AbstractC31176DnK.A0X(interfaceC08830cm).C7W().A0G));
        }
    }

    @Override // X.C7ZY
    public final void CJ2(String str) {
        C35133Fea c35133Fea = SimpleWebViewActivity.A02;
        FragmentActivity fragmentActivity = this.A00;
        c35133Fea.A02(fragmentActivity, this.A03, new SimpleWebViewConfig(AbstractC31171DnF.A0R(AbstractC63260SgI.A01(fragmentActivity, str))));
    }

    @Override // X.C7ZY
    public final void CqV(String str) {
        String queryParameter;
        Long A0j;
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36325119697629933L) && (queryParameter = AbstractC25227BEk.A0B(str).getQueryParameter("ad_id")) != null && (A0j = AbstractC166997dE.A0j(queryParameter)) != null) {
            C66277U6x A01 = C66277U6x.A01("com.bloks.www.instagram.ctx.adcontext", AbstractC167017dG.A0r("ad_id", String.valueOf(A0j.longValue())));
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0U = fragmentActivity.getResources().getString(2131952239);
            AbstractC31173DnH.A14(fragmentActivity, A0C, A01);
        }
    }

    @Override // X.InterfaceC165407aT
    public final void CqX(String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C3o9 c3o9 = (C3o9) this.A0C.get();
        boolean A09 = JRE.A09(AbstractC31176DnK.A0X(this.A08).B90());
        FragmentActivity fragmentActivity = this.A00;
        C25531Mh A00 = C162337Ov.A00(interfaceC11380iw, userSession, c3o9, A09, AbstractC14490oL.A0A(fragmentActivity), AbstractC151386rg.A06(str));
        A00.A0R("destination", "address");
        A00.Cht();
        AbstractC35180FfX.A03(fragmentActivity, str, null, null);
    }

    @Override // X.InterfaceC165647ar
    public final void CqY(String str, long j) {
        C189448aO A0y = AbstractC25225BEi.A0y(this.A03);
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A03 = 0.5f;
        C189478aR A00 = A0y.A00();
        long A0L = AbstractC166987dD.A0L(Long.valueOf(j).longValue());
        EIK eik = new EIK();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("THREAD_ID_ARG", str);
        A0b.putLong("FIRST_MSG_TIMESTAMP_MS_ARG", A0L);
        eik.setArguments(A0b);
        FragmentActivity fragmentActivity = this.A00;
        C14360o3.A0A(eik);
        A00.A02(fragmentActivity, eik);
        this.A0O.CMc();
    }

    @Override // X.InterfaceC165657as
    public final void CqZ() {
        AbstractC25229BEm.A18(new ArchiveHomeFragment(), AbstractC25225BEi.A0r(this.A00, this.A03));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        if (X.C18U.A06(r9, r2, 36316430981009797L) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
    
        if (r31 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f6, code lost:
    
        r10 = X.AbstractC166987dD.A1E();
        r15 = r31.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        if (r15.hasNext() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0104, code lost:
    
        r1 = r15.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        if (X.OQE.A00(r2, (com.instagram.user.model.User) r1) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        r10.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        r1 = X.AbstractC166987dD.A1F(X.AbstractC001800i.A0d(r10, X.AbstractC25225BEi.A07(r9, r2, 36597905957850181L)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        if (r1.size() == r10.size()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0136, code lost:
    
        r3.putBoolean("removed_clips_collaborators_from_chat", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013d, code lost:
    
        r3.putParcelableArrayList("card_gallery_recipients", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (X.C18U.A06(r9, r2, 36316430981075334L) != false) goto L31;
     */
    @Override // X.InterfaceC165267aF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cqd(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.List r29, java.util.List r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4N.Cqd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List):void");
    }

    @Override // X.InterfaceC165277aG
    public final void Cqp(String str) {
        float f;
        Float A0n;
        DirectThreadKey A02 = JRE.A02((C3o9) this.A0C.get());
        if (A02 != null) {
            UserSession userSession = this.A03;
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0U = "Composer";
            A0C.A0R = "com.bloks.www.p2p.payment.androidcomposer";
            ArrayList A1F = AbstractC166987dD.A1F(A02.A02);
            FragmentActivity fragmentActivity = this.A00;
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            HashMap A1G3 = AbstractC166987dD.A1G();
            BitSet A0j = AbstractC31171DnF.A0j(3);
            boolean A1Y = AbstractC31180DnO.A1Y(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ig_currency_underline", A1G, A0j);
            if (str != null && (A0n = AnonymousClass010.A0n(str)) != null) {
                f = A0n.floatValue();
            } else {
                f = 0.0f;
            }
            A1G.put(AbstractC111324zv.A00(5077), Float.valueOf(f));
            A1G.put("prefill_memo", "");
            if (!A1F.isEmpty()) {
                A1G.put("recipients", A1F);
                A0j.set(1);
            }
            A1G.put(AbstractC34875FYk.A00(20, 10, 116), userSession.userId);
            A0j.set(2);
            if (A0j.nextClearBit(A1Y ? 1 : 0) >= 3) {
                C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.p2p.payment.androidcomposer", A1G, A1G2);
                A0H.A03 = null;
                A0H.A02 = null;
                AbstractC31174DnI.A18(fragmentActivity, A0C, A0H, A1G3);
                return;
            }
            throw AbstractC31173DnH.A0f();
        }
    }

    @Override // X.InterfaceC165277aG
    public final void Cr1() {
        C2UY.A01.A03();
        C35135Fec.A00(this.A00, this.A03);
    }

    @Override // X.InterfaceC165447aX
    public final void Cr6(RectF rectF, String str, String str2) {
        UserSession userSession = this.A03;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0s, userSession);
        if (str == null) {
            if (str2 != null) {
                str = AbstractC47024Kqh.A00(str2);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        c116875Qr.A1S = true;
        c116875Qr.A1D = str;
        AbstractC86593tX.A0Y(this.A00, c116875Qr.A00(), userSession);
        this.A0O.CMc();
    }

    @Override // X.InterfaceC165707ax
    public final void Cr8(View view, ImageUrl imageUrl, Long l, String str, String str2) {
        String C7I;
        C159737El A06 = AnonymousClass983.A06(((C163907Ve) this.A0H.getValue()).A00);
        if (imageUrl != null) {
            C7FV c7fv = A06.A1r;
            Context context = A06.A1R;
            C2EE c2ee = A06.A0W;
            String url = imageUrl.getUrl();
            C14360o3.A0B(context, 0);
            if (c2ee != null && (C7I = c2ee.C7I()) != null) {
                UserSession userSession = c7fv.A02;
                C006802i.A0p.markerStart(619714951, 0);
                String A04 = C18U.A04(C06090Tz.A05, userSession, 36884942914912860L);
                HashMap A02 = AbstractC06930Yk.A02(AbstractC166987dD.A1L(AbstractC111324zv.A00(2513), C7I), AbstractC166987dD.A1L("entrypoint", "ig_direct_from_generated_image"), AbstractC166987dD.A1L(AbstractC111324zv.A00(2203), c7fv.A00), AbstractC166987dD.A1L(AbstractC111324zv.A00(2489), url), AbstractC166987dD.A1L("generated_image_media_id", str), AbstractC166987dD.A1L("generated_image_message_id", str2), AbstractC166987dD.A1L("generated_image_send_timestamp", String.valueOf(l)));
                if (A04.length() > 0) {
                    A02.put("qe_variant", A04);
                }
                C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(190), A02);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
                A0C.A0P = C05F.A01;
                A0C.A00 = 16;
                A01.A05(context, A0C);
            }
        }
    }

    @Override // X.InterfaceC165457aY
    public final void CrP() {
        AbstractC14490oL.A07(this.A01.requireContext(), "com.instagram.android", null);
    }

    @Override // X.InterfaceC165747b1
    public final void Crc(String str, String str2) {
        String str3;
        InterfaceC08830cm interfaceC08830cm = this.A08;
        if (AbstractC31176DnK.A0X(interfaceC08830cm).CeQ()) {
            Capabilities AlV = AbstractC31176DnK.A0X(interfaceC08830cm).AlV();
            EnumC2054697t enumC2054697t = EnumC2054697t.A0b;
            if (AlV.A00(enumC2054697t)) {
                InterfaceC163857Uz Avk = ((C7U0) interfaceC08830cm.get()).Avk();
                C14360o3.A0C(Avk, AbstractC111324zv.A00(485));
                C163827Uw c163827Uw = (C163827Uw) Avk;
                C83403nh BSh = c163827Uw.A0O.BSh(c163827Uw.B90(), str2);
                if (BSh != null) {
                    str3 = BSh.A1u;
                } else {
                    str3 = "";
                }
                C14360o3.A07(str3);
                if (str3.length() > 0) {
                    C25531Mh A00 = C162337Ov.A00(this.A02, this.A03, (C3o9) this.A0C.get(), JRE.A09(AbstractC31176DnK.A0X(interfaceC08830cm).B90()), AbstractC14490oL.A0A(this.A00), AbstractC151386rg.A06(str));
                    A00.A0R("destination", "Product");
                    A00.A0R("message_id", str2);
                    A00.A0Q("sender_id", AbstractC166997dE.A0j(str3));
                    A00.Cht();
                }
            } else {
                AbstractC34074F2c.A00(enumC2054697t);
            }
        }
        Product product = (Product) this.A0K.A04.get(str);
        if (product != null) {
            C42130Ile.A01(C1XJ.A00.A0L(this.A00, this.A03, this.A0R, product, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, null));
        }
    }

    @Override // X.InterfaceC165057Zu
    public final void Cro(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        ((G4V) this.A0J.getValue()).Cro(reel, gradientSpinnerAvatarView);
    }

    @Override // X.C7ZY
    public final void Crz(String str) {
        User A02;
        String str2;
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A00;
        InterfaceC08830cm interfaceC08830cm = this.A08;
        InterfaceC83733oI CCa = AbstractC31176DnK.A0X(interfaceC08830cm).CCa();
        Map map = AbstractC31176DnK.A0X(interfaceC08830cm).C7W().A0g;
        int i = AbstractC31176DnK.A0X(interfaceC08830cm).C7W().A07;
        if (CCa != null && i != 8) {
            List<String> pathSegments = AbstractC25227BEk.A0B(str).getPathSegments();
            if (pathSegments.size() >= 4 && (A02 = AnonymousClass189.A00(userSession).A02(AbstractC25226BEj.A1I(pathSegments, 3))) != null) {
                if (map != null) {
                    str2 = AbstractC166987dD.A1A(A02.getId(), map);
                } else {
                    str2 = null;
                }
                String B8y = A02.B8y();
                String id = A02.getId();
                C32329EMa c32329EMa = new C32329EMa();
                Bundle A0D = AbstractC31174DnI.A0D(userSession);
                A0D.putString("username_hint", B8y);
                A0D.putString(AbstractC31670Dva.A01(0, 8, 22), str2);
                AbstractC35077Fco.A02(A0D, CCa, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                A0D.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, id);
                A0D.putString("nickname_change_entry_point", "admin_text");
                A0D.putParcelable("thread_capabilities", null);
                c32329EMa.setArguments(A0D);
                C189478aR A00 = AbstractC34089F2r.A00(fragmentActivity, userSession, new ME7(45, fragmentActivity, userSession, CCa, A02), new ME4(10, fragmentActivity, userSession, A02));
                C14360o3.A0A(c32329EMa);
                A00.A02(fragmentActivity, c32329EMa);
            }
        }
    }

    @Override // X.InterfaceC165137a2
    public final void E2b(MessageIdentifier messageIdentifier, long j) {
        ((C49074Ln0) this.A0I.getValue()).E2b(messageIdentifier, j);
    }

    @Override // X.InterfaceC165127a1
    public final void EHN(MessageIdentifier messageIdentifier) {
        ((C49074Ln0) this.A0I.getValue()).EHN(messageIdentifier);
    }

    public G4N(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C163867Va c163867Va, LEK lek, C7WA c7wa, InterfaceC164877Za interfaceC164877Za, InterfaceC165017Zq interfaceC165017Zq, C7XS c7xs, InterfaceC165297aI interfaceC165297aI, InterfaceC163877Vb interfaceC163877Vb, InterfaceC165227aB interfaceC165227aB, LnQ lnQ, InterfaceC60442pS interfaceC60442pS, InterfaceC1119353f interfaceC1119353f, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6, InterfaceC08830cm interfaceC08830cm7) {
        InterfaceC09390do c28111Xp;
        this.A00 = fragmentActivity;
        this.A01 = abstractC59962oe;
        this.A03 = userSession;
        this.A0C = interfaceC08830cm;
        this.A02 = interfaceC11380iw;
        this.A07 = interfaceC1119353f;
        this.A0R = interfaceC60442pS;
        this.A08 = interfaceC08830cm2;
        this.A0O = interfaceC163877Vb;
        this.A06 = c7xs;
        this.A0K = c7wa;
        this.A0D = interfaceC08830cm3;
        this.A09 = interfaceC08830cm4;
        this.A04 = c163867Va;
        this.A0B = interfaceC08830cm5;
        this.A0A = interfaceC08830cm6;
        this.A0E = interfaceC08830cm7;
        this.A05 = lek;
        this.A0N = interfaceC165297aI;
        this.A0Q = lnQ;
        this.A0P = interfaceC165227aB;
        this.A0L = interfaceC164877Za;
        this.A0M = interfaceC165017Zq;
        C37036GTs c37036GTs = C37036GTs.A00;
        EnumC09460dv enumC09460dv = EnumC09460dv.A03;
        if (C7W0.A00(userSession)) {
            c28111Xp = AbstractC09440dt.A00(enumC09460dv, c37036GTs);
        } else {
            c28111Xp = new C28111Xp(AbstractC31175DnJ.A0B());
        }
        this.A0F = c28111Xp;
        this.A0H = C37059GUt.A01(this, 37);
        this.A0G = A00(userSession, this, enumC09460dv, 36);
        this.A0J = A00(userSession, this, enumC09460dv, 43);
        this.A0I = A00(userSession, this, enumC09460dv, 39);
    }

    @Override // X.C7ZY
    public final void CJ3(String str) {
        C14H A0l = AbstractC31172DnG.A0l();
        FragmentActivity fragmentActivity = this.A00;
        Intent A04 = A0l.A04(fragmentActivity, AbstractC25227BEk.A0B(str));
        A04.putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", true);
        C12260kU.A0C(fragmentActivity, A04);
    }

    @Override // X.C7ZY
    public final void Cgp(String str) {
        HashMap hashMap;
        InterfaceC163837Ux A0X;
        String C7I;
        if (AbstractC34077F2f.A00(str)) {
            android.net.Uri A0B = AbstractC25227BEk.A0B(str);
            java.util.Set<String> queryParameterNames = A0B.getQueryParameterNames();
            hashMap = AbstractC166987dD.A1G();
            Iterator<String> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                AbstractC31180DnO.A15(A0B, AbstractC166987dD.A1B(it), hashMap);
            }
        } else {
            hashMap = null;
        }
        this.A0O.CMc();
        if (hashMap != null && (C7I = (A0X = AbstractC31176DnK.A0X(this.A08)).C7I()) != null) {
            String BYt = A0X.BYt();
            InterfaceC83733oI CCa = A0X.CCa();
            if (BYt != null && CCa != null) {
                UserSession userSession = this.A03;
                FragmentActivity fragmentActivity = this.A00;
                Capabilities AlV = A0X.AlV();
                C14360o3.A07(AlV);
                String str2 = (String) hashMap.get("user_action_type");
                String str3 = (String) hashMap.get("token_ent_id_string");
                C18A A00 = AnonymousClass189.A00(userSession);
                if (str2 != null && str3 != null) {
                    Bundle A0D = AbstractC31174DnI.A0D(userSession);
                    A0D.putString("DirectFragment.DIRECT_FRAGMENT_TOKEN_ENT_ID", str3);
                    A0D.putString("DirectFragment.DIRECT_FRAGMENT_USER_ACTION_TYPE", str2);
                    AbstractC35077Fco.A01(A0D, AlV, CCa);
                    C32346EMs c32346EMs = new C32346EMs();
                    C189448aO A0W = AbstractC31174DnI.A0W(A0D, c32346EMs, userSession);
                    A0W.A0T = c32346EMs;
                    AbstractC25225BEi.A1Q(A0W, true);
                    A0W.A05(fragmentActivity, R.dimen.ig_notification_messages_admin_text_initial_bottom_sheet_height);
                    C189478aR A002 = A0W.A00();
                    c32346EMs.A01 = new C34631FNo(fragmentActivity, userSession, c32346EMs, A002, A00, C7I, BYt);
                    A002.A02(AbstractC13110lx.A00(fragmentActivity), c32346EMs);
                }
            }
        }
    }

    @Override // X.InterfaceC165667at
    public final void Cqi(String str, String str2, String str3, String str4, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC43591JPw.A00(913), str);
        A0b.putString(AbstractC43591JPw.A00(912), str2);
        A0b.putString(AbstractC43591JPw.A00(911), str3);
        A0b.putString(AbstractC43591JPw.A00(914), str4);
        A0b.putBoolean(AbstractC43591JPw.A00(915), z);
        AbstractC31177DnL.A0n(this.A00, A0b, this.A03, ModalActivity.class, AbstractC111324zv.A00(4271));
    }

    @Override // X.InterfaceC165737b0
    public final void CrY() {
        C66277U6x A01 = C66277U6x.A01("com.bloks.www.ig.direct.pro.p2b.privacy.disclosure", AbstractC166987dD.A1G());
        UserSession userSession = this.A03;
        U60 A012 = W6d.A01(AbstractC31171DnF.A0C(userSession), A01);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A03 = 0.7f;
        GH5.A00(A0y, this, 12).A02(this.A00, A012);
        this.A06.D0E();
    }

    @Override // X.InterfaceC165757b2
    public final void Cs5() {
        F8K.A00().A00(this.A00, this.A03, VEB.A08, null, null, null);
    }
}
