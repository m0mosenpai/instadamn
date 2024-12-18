package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.contentnotes.data.ContentNotesRepository$deleteNote$1;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.ClD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28665ClD implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewOnClickListenerC28665ClD(IgLinearLayout igLinearLayout, C26626BpN c26626BpN, User user, int i) {
        this.A00 = i;
        this.A01 = igLinearLayout;
        if (8 - i != 0) {
            this.A03 = c26626BpN;
            this.A02 = user;
        } else {
            this.A02 = user;
            this.A03 = c26626BpN;
        }
    }

    public static void A00(ViewOnClickListenerC28665ClD viewOnClickListenerC28665ClD) {
        C102884kP c102884kP = (C102884kP) viewOnClickListenerC28665ClD.A02;
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) viewOnClickListenerC28665ClD.A03;
        C6FX c6fx = new C6FX();
        c6fx.A01(c102884kP);
        C6FP.A03((C6FG) viewOnClickListenerC28665ClD.A01, c102884kP, c6fx.A00(), interfaceC103384lE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        ProductType productType;
        FragmentActivity fragmentActivity;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1791772677);
                A00(this);
                i = -674957853;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-85563542);
                A00(this);
                i = -1299374586;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-2140640105);
                A00(this);
                i = -1894128105;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-905258160);
                A00(this);
                i = -544180466;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(1947973580);
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A01(this.A01);
                C131845xK.A00((C6FQ) this.A02, A0s.A00(), interfaceC103384lE);
                i = 775704996;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(2143999474);
                Resources resources = ((View) this.A01).getResources();
                CQG cqg = (CQG) this.A03;
                ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = cqg.A00;
                String string = resources.getString(2131968719, contentNotesImmersiveReplyContent.A06, contentNotesImmersiveReplyContent.A08);
                C14360o3.A07(string);
                cqg.A01.A00(AbstractC167007dF.A0g((EditText) this.A02), string, false);
                i = -1708003636;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(515710753);
                C26863BtP c26863BtP = (C26863BtP) this.A03;
                C4F0 A00 = C4Ez.A00(AbstractC166987dD.A0r(c26863BtP.A09));
                String str2 = ((C51740MtP) this.A02).A00;
                InterfaceC09390do interfaceC09390do = c26863BtP.A03;
                String str3 = AbstractC25228BEl.A0v(interfaceC09390do).A0F;
                String str4 = AbstractC25228BEl.A0v(interfaceC09390do).A0C;
                String str5 = AbstractC25228BEl.A0v(interfaceC09390do).A0D;
                String str6 = AbstractC25228BEl.A0v(interfaceC09390do).A0I;
                String str7 = ((ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue()).A00.A05;
                Integer num = ((ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue()).A00.A02;
                String A0p = AbstractC166997dE.A0p(((View) this.A01).getContext(), 2131957687);
                AbstractC167027dH.A12(str3, str2, str4);
                AbstractC166987dD.A1Z(new ContentNotesRepository$deleteNote$1(A00, num, str3, str2, str4, str5, str6, str7, A0p, null), ((C4A7) A00).A01);
                AbstractC25233BEq.A14(c26863BtP);
                i = -982954356;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(677186623);
                ((InterfaceC16620sF) ((C26082BgB) ((C9BR) this.A03).A01).A01).invoke(this.A01, this.A02);
                i = 1494316584;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(1904220326);
                Context A0L = AbstractC166997dE.A0L((View) this.A01);
                User user = (User) this.A02;
                String username = user.getUsername();
                C26626BpN c26626BpN = (C26626BpN) this.A03;
                if (c26626BpN.A00.A01) {
                    productType = ProductType.CLIPS;
                } else {
                    productType = ProductType.FEED;
                }
                AbstractC35234FgS.A02(A0L, null, productType, username);
                AbstractC99684dl.A00(c26626BpN.A02).A00(Long.parseLong(user.getId()));
                i = 1543962453;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(968823689);
                Activity A002 = AbstractC13330mJ.A00(AbstractC166997dE.A0L((View) this.A01));
                if ((A002 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) A002) != null) {
                    C26626BpN c26626BpN2 = (C26626BpN) this.A03;
                    AbstractC35068Fcf.A02(fragmentActivity, c26626BpN2.A01, c26626BpN2.A02, (User) this.A02, null, false);
                }
                i = -1993539557;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(952062795);
                AbstractC166987dD.A1Y(this.A02);
                UserSession userSession = (UserSession) this.A03;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                C5Hb c5Hb = AbstractC28507Ci0.A00;
                AbstractC34277F9x.A00(interfaceC11380iw, userSession, "tap", AbstractC111324zv.A00(112), "opal_self_profile", userSession.userId, null);
                i = -1537855469;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(-2079127456);
                ((InterfaceC145486h7) this.A01).DTr(null, (C41181vS) this.A02, (C41551w4) this.A03, C05F.A15);
                i = 1917220324;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(1803128792);
                C2Z c2z = (C2Z) this.A03;
                C14360o3.A0A(view);
                String str8 = ((ClipsMidCardType) this.A02).A00;
                ClipsMidCardSubtype clipsMidCardSubtype = (ClipsMidCardSubtype) this.A01;
                if (clipsMidCardSubtype != null) {
                    str = clipsMidCardSubtype.A00;
                } else {
                    str = null;
                }
                if (AbstractC166987dD.A1a(AbstractC166987dD.A17(c2z.A03))) {
                    AbstractC166987dD.A1Z(new C50125MBz(c2z, view, str8, str, null, 22), AbstractC25229BEm.A0a(c2z));
                } else {
                    FragmentActivity requireActivity = c2z.requireActivity();
                    InterfaceC09390do interfaceC09390do2 = c2z.A04;
                    C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do2);
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                    C14360o3.A0B(A0r, 0);
                    Bundle A0b = AbstractC166987dD.A0b();
                    AbstractC60492pY.A04(A0b, A0r);
                    A0b.putString("midcard_type_args", str8);
                    A0b.putString("midcard_subtype_args", str);
                    C26764Brl c26764Brl = new C26764Brl();
                    c26764Brl.setArguments(A0b);
                    AbstractC25229BEm.A18(c26764Brl, A0c);
                }
                i = -1187842987;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-1666310188);
                C37675GiC c37675GiC = (C37675GiC) this.A03;
                C38321qM c38321qM = (C38321qM) this.A01;
                C75113Zb c75113Zb = (C75113Zb) this.A02;
                Venue A27 = c38321qM.A27();
                if (A27 != null) {
                    InterfaceC60442pS interfaceC60442pS = c37675GiC.A0D;
                    UserSession userSession2 = c37675GiC.A0C;
                    String A0j = AbstractC167017dG.A0j();
                    EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0E;
                    String A052 = A27.A05();
                    C14360o3.A07(A052);
                    AbstractC37670Gi3.A0O(enumC39652Hih, interfaceC60442pS, userSession2, c38321qM, A0j, A052, c75113Zb.getPosition());
                    AbstractC37834Gko.A05(c37675GiC.A07, userSession2, A27);
                    i = -425496715;
                    C0f9.A0C(i, A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 14:
                A05 = C0f9.A05(1044913597);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Map map = (Map) this.A01;
                if (elapsedRealtime - AbstractC25232BEp.A0t((Number) map.get(view)) > 1200) {
                    C25448BNn c25448BNn = (C25448BNn) this.A03;
                    c25448BNn.A07.E1L(c25448BNn.A03, (C38321qM) this.A02);
                    map.put(view, Long.valueOf(SystemClock.elapsedRealtime()));
                }
                i = 214809632;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(-639564051);
                BKA bka = (BKA) this.A03;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                AbstractC37834Gko.A02(bka.A01, bka.A05, bka.A04, (EnumC25546BRi) this.A01, c38321qM2, AbstractC41770Iem.A03(c38321qM2));
                i = 1248863620;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1197692524);
                AbstractC25227BEk.A1P(this.A01, ((C25898Bcz) this.A02).A0A, ((C3OO) this.A03).getPosition());
                i = 1031274220;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC28665ClD(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }
}
