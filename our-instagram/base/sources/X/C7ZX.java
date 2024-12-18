package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.7ZX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7ZX implements InterfaceC163877Vb, C7ZT, C7W5, C7ZY, C7ZZ, C7YI, InterfaceC164877Za, InterfaceC164887Zb, InterfaceC164897Zc, InterfaceC164907Zd, C7Ze, C7Zf, InterfaceC164917Zg, InterfaceC164927Zh, InterfaceC164937Zi, InterfaceC164947Zj, InterfaceC164957Zk, InterfaceC164967Zl, InterfaceC164977Zm, InterfaceC164987Zn, InterfaceC164997Zo, C7W6, InterfaceC165007Zp, InterfaceC165017Zq, InterfaceC165027Zr, InterfaceC165037Zs, InterfaceC165047Zt, InterfaceC165057Zu, InterfaceC165067Zv, C7Y8, InterfaceC165077Zw, InterfaceC165087Zx, InterfaceC165097Zy, InterfaceC165107Zz, InterfaceC165117a0, InterfaceC165147a3, InterfaceC165157a4, InterfaceC164347Wx, InterfaceC165167a5, InterfaceC165177a6, InterfaceC165187a7, InterfaceC165197a8, InterfaceC165207a9, InterfaceC165217aA, InterfaceC165227aB, InterfaceC165237aC, InterfaceC165247aD, InterfaceC165257aE, InterfaceC165267aF, InterfaceC165277aG, InterfaceC165287aH, InterfaceC165297aI, InterfaceC165307aJ, InterfaceC165317aK, InterfaceC165327aL, InterfaceC164587Xx, C7WC, InterfaceC13050lr, InterfaceC165337aM, InterfaceC165347aN, InterfaceC165357aO, InterfaceC165367aP, C7YK, C7YL, InterfaceC165377aQ, InterfaceC165387aR, InterfaceC165397aS, InterfaceC165407aT, InterfaceC165417aU, InterfaceC165427aV, InterfaceC165437aW, InterfaceC165447aX, InterfaceC165457aY, InterfaceC165467aZ, C7W7, InterfaceC165477aa, InterfaceC165487ab, InterfaceC165497ac, InterfaceC165517ae, InterfaceC165527af, InterfaceC165537ag, InterfaceC165547ah, InterfaceC165557ai, InterfaceC165567aj, InterfaceC165577ak, InterfaceC165587al, InterfaceC165597am, InterfaceC165607an, InterfaceC165617ao, InterfaceC165627ap, InterfaceC165637aq, InterfaceC165647ar, InterfaceC165657as, InterfaceC165667at, InterfaceC165677au, InterfaceC165687av, InterfaceC165697aw, InterfaceC165707ax, InterfaceC165717ay, InterfaceC165727az, InterfaceC165737b0, InterfaceC165747b1, InterfaceC165757b2, InterfaceC165767b3, InterfaceC165777b4, InterfaceC165787b5, InterfaceC165797b6, InterfaceC165807b7, InterfaceC165817b8, C7b9, C7XX, C7YA, InterfaceC165827bA, InterfaceC165837bB, C7YR, InterfaceC165847bC, InterfaceC165857bD, InterfaceC165867bE, C7VT {
    public final InterfaceC09390do A00;

    @Override // X.C7ZT
    public final void AFl(String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str2, 1);
        ((C7ZT) A00().A0Z.getValue()).AFl(str, str2, str3, str4, z);
    }

    @Override // X.InterfaceC164907Zd
    public final boolean AFt(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        return ((InterfaceC164907Zd) A00().A0G.getValue()).AFt(directMessageIdentifier);
    }

    @Override // X.InterfaceC165237aC
    public final void AIP(C31230DoD c31230DoD) {
        C14360o3.A0B(c31230DoD, 0);
        ((InterfaceC165237aC) A00().A0D.getValue()).AIP(c31230DoD);
    }

    @Override // X.InterfaceC165567aj
    public final void ANC(MessageIdentifier messageIdentifier) {
        C14360o3.A0B(messageIdentifier, 0);
        ((InterfaceC165567aj) A00().A07.getValue()).ANC(messageIdentifier);
    }

    @Override // X.InterfaceC165587al
    public final void ASs(boolean z) {
        ((InterfaceC165587al) A00().A0C.getValue()).ASs(true);
    }

    @Override // X.InterfaceC164937Zi
    public final void ATg(boolean z) {
        ((InterfaceC164937Zi) A00().A09.getValue()).ATg(true);
    }

    @Override // X.InterfaceC165237aC
    public final void ATq(C31230DoD c31230DoD, boolean z) {
        C14360o3.A0B(c31230DoD, 0);
        ((InterfaceC165237aC) A00().A0D.getValue()).ATq(c31230DoD, z);
    }

    @Override // X.InterfaceC164927Zh
    public final void AUy(C7QD c7qd, String str, boolean z) {
        C14360o3.A0B(str, 0);
        ((InterfaceC164927Zh) A00().A1T.getValue()).AUy(null, str, true);
    }

    @Override // X.InterfaceC165097Zy
    public final void AWb(C2EY c2ey, DirectMessageIdentifier directMessageIdentifier, int i, boolean z) {
        C14360o3.A0B(c2ey, 1);
        ((InterfaceC165097Zy) A00().A0F.getValue()).AWb(c2ey, directMessageIdentifier, i, z);
    }

    @Override // X.InterfaceC164907Zd
    public final boolean CIu(DirectMessageIdentifier directMessageIdentifier, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(directMessageIdentifier, 0);
        return ((InterfaceC164907Zd) A00().A0G.getValue()).CIu(directMessageIdentifier, interfaceC16820sZ);
    }

    @Override // X.InterfaceC164907Zd
    public final boolean CIv(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        return ((InterfaceC164907Zd) A00().A0G.getValue()).CIv(directMessageIdentifier);
    }

    @Override // X.InterfaceC165597am
    public final void CK4(String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165597am) A00().A0J.getValue()).CK4(str, str2, str3, str4, str5, z);
    }

    @Override // X.InterfaceC165617ao
    public final void CKR(String str) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165617ao) A00().A0L.getValue()).CKR(str);
    }

    @Override // X.C7Ze
    public final void CKa(RectF rectF, C2EY c2ey, DirectMessageIdentifier directMessageIdentifier, GradientSpinner gradientSpinner, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str6, 5);
        C14360o3.A0B(directMessageIdentifier, 6);
        C14360o3.A0B(c2ey, 9);
        ((C7Ze) A00().A0N.getValue()).CKa(rectF, c2ey, directMessageIdentifier, null, num, str, str2, str3, str4, str5, str6, str7, str8, str9, map);
    }

    @Override // X.C7YI
    public final void Cgg(ImageUrl imageUrl, MessagingUser messagingUser) {
        C14360o3.A0B(messagingUser, 0);
        ((C7YI) A00().A13.getValue()).Cgg(imageUrl, messagingUser);
    }

    @Override // X.InterfaceC165027Zr
    public final C47349Kvy ChN(InterfaceC50467MPv interfaceC50467MPv, String str) {
        C14360o3.A0B(str, 0);
        return ((InterfaceC165027Zr) A00().A0U.getValue()).ChN(interfaceC50467MPv, str);
    }

    @Override // X.InterfaceC165107Zz
    public final void CiK(InterfaceC83733oI interfaceC83733oI, String str, String str2, String str3, String str4, String str5, List list) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(list, 4);
        ((InterfaceC165107Zz) A00().A0W.getValue()).CiK(interfaceC83733oI, str, str2, str3, str4, null, list);
    }

    @Override // X.InterfaceC165107Zz
    public final void CiL(InterfaceC83733oI interfaceC83733oI, String str, String str2, String str3, int i) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str3, 3);
        ((InterfaceC165107Zz) A00().A0W.getValue()).CiL(interfaceC83733oI, str, str2, str3, i);
    }

    @Override // X.InterfaceC165197a8
    public final Spannable CoX(Context context, CharSequence charSequence, String str, int i, boolean z) {
        C14360o3.A0B(charSequence, 0);
        return ((InterfaceC165197a8) A00().A1Z.getValue()).CoX(context, charSequence, str, i, z);
    }

    @Override // X.InterfaceC165397aS
    public final void CqU(RectF rectF, C47777L8c c47777L8c, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(rectF, 1);
        ((InterfaceC165397aS) A00().A0a.getValue()).CqU(rectF, c47777L8c, str);
    }

    @Override // X.InterfaceC165407aT
    public final void CqX(String str) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165407aT) A00().A0c.getValue()).CqX(str);
    }

    @Override // X.C7Zf
    public final void Cqb(String str, String str2) {
        ((C7Zf) A00().A0j.getValue()).Cqb(str, null);
    }

    @Override // X.InterfaceC165417aU
    public final void Cqh(String str, String str2, List list) {
        C14360o3.A0B(list, 2);
        ((InterfaceC165417aU) A00().A0h.getValue()).Cqh(str, str2, list);
    }

    @Override // X.C7Zf
    public final void Cqj(RectF rectF, ImageUrl imageUrl, C47777L8c c47777L8c, MessageIdentifier messageIdentifier, C40971v4 c40971v4, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C14360o3.A0B(rectF, 6);
        ((C7Zf) A00().A0j.getValue()).Cqj(rectF, imageUrl, c47777L8c, messageIdentifier, c40971v4, false, bool2, str, str2, str3, str4, null, str6, z);
    }

    @Override // X.InterfaceC165427aV
    public final void Cqs(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        ((InterfaceC165427aV) A00().A0l.getValue()).Cqs(directMessageIdentifier);
    }

    @Override // X.InterfaceC165437aW
    public final void Cqu(RectF rectF, C22P c22p, CameraConfiguration cameraConfiguration, AnonymousClass442 anonymousClass442, String str, boolean z) {
        C14360o3.A0B(c22p, 1);
        ((InterfaceC165437aW) A00().A0n.getValue()).Cqu(rectF, c22p, cameraConfiguration, anonymousClass442, str, z);
    }

    @Override // X.InterfaceC165117a0
    public final void Cqv(RectF rectF, InterfaceC50477MQf interfaceC50477MQf, MessageIdentifier messageIdentifier, List list, List list2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(messageIdentifier, 0);
        ((InterfaceC165117a0) A00().A0o.getValue()).Cqv(rectF, interfaceC50477MQf, messageIdentifier, list, list2, z, z2, z3);
    }

    @Override // X.InterfaceC165047Zt
    public final void Cr0(String str) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165047Zt) A00().A14.getValue()).Cr0(str);
    }

    @Override // X.InterfaceC165287aH
    public final void Cr4(String str) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165287aH) A00().A0q.getValue()).Cr4(str);
    }

    @Override // X.InterfaceC165447aX
    public final void Cr6(RectF rectF, String str, String str2) {
        C14360o3.A0B(rectF, 2);
        ((InterfaceC165447aX) A00().A0s.getValue()).Cr6(rectF, str, str2);
    }

    @Override // X.InterfaceC165037Zs
    public final void CrA(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        ((InterfaceC165037Zs) A00().A0u.getValue()).CrA(str, str2);
    }

    @Override // X.InterfaceC165717ay
    public final void CrE(View view, C158797Aq c158797Aq) {
        C14360o3.A0B(view, 0);
        ((InterfaceC165717ay) A00().A0w.getValue()).CrE(view, c158797Aq);
    }

    @Override // X.InterfaceC165147a3
    public final void CrG(EnumC40111tc enumC40111tc, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC40111tc, 1);
        C14360o3.A0B(str4, 5);
        C14360o3.A0B(str5, 6);
        ((InterfaceC165147a3) A00().A0x.getValue()).CrG(enumC40111tc, str, str2, str3, str4, str5, i, z);
    }

    @Override // X.InterfaceC164957Zk
    public final void CrH(View view, E6B e6b, Integer num, List list, int i, boolean z, boolean z2) {
        C14360o3.A0B(num, 4);
        ((InterfaceC164957Zk) A00().A0v.getValue()).CrH(view, e6b, num, list, i, z, z2);
    }

    @Override // X.C7YI
    public final void CrK(View view, MessagingUser messagingUser) {
        C14360o3.A0B(messagingUser, 0);
        C14360o3.A0B(view, 1);
        ((C7YI) A00().A13.getValue()).CrK(view, messagingUser);
    }

    @Override // X.InterfaceC165867bE
    public final void CrM(RectF rectF, C22P c22p, CameraConfiguration cameraConfiguration, String str) {
        C14360o3.A0B(c22p, 1);
        ((InterfaceC165867bE) A00().A0y.getValue()).CrM(rectF, c22p, null, str);
    }

    @Override // X.InterfaceC165157a4
    public final void CrN(String str) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165157a4) A00().A0z.getValue()).CrN(str);
    }

    @Override // X.InterfaceC165157a4
    public final void CrO(View view, String str, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(view, 1);
        ((InterfaceC165157a4) A00().A0z.getValue()).CrO(view, str, z);
    }

    @Override // X.InterfaceC165037Zs
    public final void CrT(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165037Zs) A00().A0u.getValue()).CrT(str, str2, str3);
    }

    @Override // X.C7YI
    public final void Cre(MessagingUser messagingUser, String str) {
        C14360o3.A0B(messagingUser, 0);
        C14360o3.A0B(str, 1);
        ((C7YI) A00().A13.getValue()).Cre(messagingUser, str);
    }

    @Override // X.InterfaceC165047Zt
    @Deprecated(message = "")
    public final void Crm(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        ((InterfaceC165047Zt) A00().A14.getValue()).Crm(str, str2, str3, z, z2, z3);
    }

    @Override // X.InterfaceC165047Zt
    public final void Crn(C47777L8c c47777L8c, C1NB c1nb, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165047Zt) A00().A14.getValue()).Crn(c47777L8c, c1nb, str, str2, str3, z, z2, z3);
    }

    @Override // X.InterfaceC165057Zu
    public final void Crp(RectF rectF, C47777L8c c47777L8c, MessageIdentifier messageIdentifier, C1NB c1nb, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(c1nb, 2);
        C14360o3.A0B(messageIdentifier, 7);
        C14360o3.A0B(str5, 8);
        ((InterfaceC165057Zu) A00().A15.getValue()).Crp(rectF, c47777L8c, messageIdentifier, c1nb, str, str2, str3, str4, str5);
    }

    @Override // X.InterfaceC165067Zv
    public final void Cs3(String str, boolean z, String str2) {
        C14360o3.A0B(str, 0);
        ((InterfaceC165067Zv) A00().A17.getValue()).Cs3(str, z, str2);
    }

    @Override // X.C7Y8
    public final void Cs6(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        ((C7Y8) A00().A19.getValue()).Cs6(str, str2, str3);
    }

    @Override // X.InterfaceC164887Zb
    public final void Cs7(View view, ImageUrl imageUrl, E6B e6b, MessageIdentifier messageIdentifier, GradientSpinner gradientSpinner, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, List list5, Map map, int i, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(messageIdentifier, 2);
        ((InterfaceC164887Zb) A00().A1A.getValue()).Cs7(view, imageUrl, e6b, messageIdentifier, gradientSpinner, l, l2, str, str2, str3, str4, str5, str6, str7, list, list2, list3, list4, list5, map, i, z);
    }

    @Override // X.InterfaceC165367aP
    public final void DS3(MessageIdentifier messageIdentifier) {
        C14360o3.A0B(messageIdentifier, 0);
        ((InterfaceC165367aP) A00().A0I.getValue()).DS3(messageIdentifier);
    }

    @Override // X.InterfaceC165477aa
    public final void DfY(RectF rectF, C22P c22p, CameraConfiguration cameraConfiguration, String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c22p, 1);
        ((InterfaceC165477aa) A00().A1M.getValue()).DfY(rectF, c22p, null, str, null);
    }

    @Override // X.InterfaceC165217aA
    public final SpannableString Dm5(Context context, MessageIdentifier messageIdentifier, Integer num, int i) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(messageIdentifier, 1);
        C14360o3.A0B(num, 2);
        return ((InterfaceC165217aA) A00().A1m.getValue()).Dm5(context, messageIdentifier, num, i);
    }

    @Override // X.InterfaceC165217aA
    public final void DtZ(MessageIdentifier messageIdentifier, Integer num) {
        C14360o3.A0B(num, 1);
        ((InterfaceC165217aA) A00().A1m.getValue()).DtZ(messageIdentifier, num);
    }

    @Override // X.InterfaceC165487ab
    public final void EL2(MessageIdentifier messageIdentifier) {
        C14360o3.A0B(messageIdentifier, 0);
        ((InterfaceC165487ab) A00().A1P.getValue()).EL2(messageIdentifier);
    }

    @Override // X.C7b9
    public final void EMZ(String str, boolean z) {
        C14360o3.A0B(str, 0);
        ((C7b9) A00().A1U.getValue()).EMZ(str, z);
    }

    @Override // X.InterfaceC165497ac
    public final void EZ6(MessageIdentifier messageIdentifier, boolean z) {
        C14360o3.A0B(messageIdentifier, 0);
        ((InterfaceC165497ac) A00().A1V.getValue()).EZ6(messageIdentifier, z);
    }

    @Override // X.InterfaceC165177a6
    public final void Ehw(MessageIdentifier messageIdentifier, Integer num) {
        C14360o3.A0B(messageIdentifier, 0);
        C14360o3.A0B(num, 1);
        ((InterfaceC165177a6) A00().A1W.getValue()).Ehw(messageIdentifier, num);
    }

    @Override // X.InterfaceC165177a6
    public final void Ei0(C9CJ c9cj, MessageIdentifier messageIdentifier, Integer num) {
        C14360o3.A0B(num, 2);
        ((InterfaceC165177a6) A00().A1W.getValue()).Ei0(c9cj, messageIdentifier, num);
    }

    @Override // X.InterfaceC165347aN
    public final void EkI(C2EY c2ey, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
        C14360o3.A0B(c2ey, 2);
        ((InterfaceC165347aN) A00().A0E.getValue()).EkI(c2ey, messageIdentifier, str, j, z);
    }

    @Override // X.InterfaceC165257aE
    public final void Ekd(MessageIdentifier messageIdentifier, InterfaceC1119153d interfaceC1119153d, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(messageIdentifier, 0);
        ((InterfaceC165257aE) A00().A05.getValue()).Ekd(messageIdentifier, interfaceC1119153d, str, str2, str3, str4, str5);
    }

    @Override // X.InterfaceC164967Zl
    public final void Eku(MessageIdentifier messageIdentifier) {
        C14360o3.A0B(messageIdentifier, 0);
        ((InterfaceC164967Zl) A00().A1c.getValue()).Eku(messageIdentifier);
    }

    @Override // X.InterfaceC165307aJ
    public final void El9(PointF pointF, InterfaceC129525tH interfaceC129525tH, C7QV c7qv, long j, boolean z, boolean z2) {
        C14360o3.A0B(c7qv, 2);
        ((InterfaceC165307aJ) A00().A1d.getValue()).El9(pointF, interfaceC129525tH, c7qv, j, z, z2);
    }

    @Override // X.C7YA
    public final void ElC(Integer num, String str, String str2, String str3) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        ((C7YA) A00().A1f.getValue()).ElC(num, str, str2, str3);
    }

    @Override // X.InterfaceC164997Zo
    public final void F9q(View view, InterfaceC129525tH interfaceC129525tH, MessageIdentifier messageIdentifier, InterfaceC16820sZ interfaceC16820sZ, long j) {
        ((InterfaceC164997Zo) A00().A1o.getValue()).F9q(view, interfaceC129525tH, messageIdentifier, null, j);
    }

    @Override // X.C7YR
    public final void FBP(String str, String str2) {
        C14360o3.A0B(str2, 1);
        ((C7YR) A00().A1q.getValue()).FBP(str, str2);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    private final C159537Do A00() {
        return (C159537Do) this.A00.getValue();
    }

    @Override // X.InterfaceC165827bA
    public final boolean Cou(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        return ((InterfaceC165827bA) A00().A1i.getValue()).Cou(str, str2, str3, "tap");
    }

    @Override // X.InterfaceC164947Zj
    public final void Cqe(InterfaceC83733oI interfaceC83733oI, String str, int i) {
        ((InterfaceC164947Zj) A00().A16.getValue()).Cqe(interfaceC83733oI, "translation_nux", i);
    }

    @Override // X.InterfaceC165727az
    public final void Cqf(Activity activity, User user, String str, boolean z) {
        C14360o3.A0B(activity, 0);
        ((InterfaceC165727az) A00().A0g.getValue()).Cqf(activity, user, "creator_dm", false);
    }

    @Override // X.InterfaceC165697aw
    public final void Cr5(String str) {
        ((InterfaceC165697aw) A00().A0r.getValue()).Cr5("DirectMultipleReactionMessagePillsViewHolder");
    }

    @Override // X.InterfaceC165807b7
    public final void ELm(MessageIdentifier messageIdentifier, String str) {
        ((InterfaceC165807b7) A00().A1R.getValue()).ELm(messageIdentifier, AbstractC43591JPw.A00(1171));
    }

    public C7ZX(InterfaceC09390do interfaceC09390do) {
        this.A00 = interfaceC09390do;
    }

    @Override // X.InterfaceC164997Zo
    public final void AAx(MessageIdentifier messageIdentifier, long j) {
        ((InterfaceC164997Zo) A00().A1o.getValue()).AAx(messageIdentifier, j);
    }

    @Override // X.InterfaceC165697aw
    public final boolean AG2() {
        return ((InterfaceC165697aw) A00().A0r.getValue()).AG2();
    }

    @Override // X.C7ZY
    public final void AGr(String str) {
        ((C7ZY) A00().A0b.getValue()).AGr(str);
    }

    @Override // X.InterfaceC164987Zn
    public final void AGu(String str, int i) {
        ((InterfaceC164987Zn) A00().A03.getValue()).AGu(str, i);
    }

    @Override // X.InterfaceC165557ai
    public final void AKy(MessageIdentifier messageIdentifier) {
        ((InterfaceC165557ai) A00().A06.getValue()).AKy(messageIdentifier);
    }

    @Override // X.InterfaceC164937Zi
    public final void AOf() {
        ((InterfaceC164937Zi) A00().A09.getValue()).AOf();
    }

    @Override // X.InterfaceC165857bD
    public final void ARi() {
        ((InterfaceC165857bD) A00().A1s.getValue()).ARi();
    }

    @Override // X.C7W6
    public final void ARo(boolean z) {
        ((C7W6) A00().A0B.getValue()).ARo(z);
    }

    @Override // X.InterfaceC164937Zi
    public final void ASp(MessageIdentifier messageIdentifier) {
        ((InterfaceC164937Zi) A00().A09.getValue()).ASp(messageIdentifier);
    }

    @Override // X.InterfaceC164927Zh
    public final void AUz(C7QD c7qd, String str, boolean z) {
        ((InterfaceC164927Zh) A00().A1T.getValue()).AUz(c7qd, str, z);
    }

    @Override // X.InterfaceC164977Zm
    public final C19L Arw() {
        return ((InterfaceC164977Zm) A00().A00.getValue()).Arw();
    }

    @Override // X.InterfaceC165337aM
    public final C2056398n Axi() {
        C2056398n Axi = ((InterfaceC165337aM) A00().A01.getValue()).Axi();
        C14360o3.A07(Axi);
        return Axi;
    }

    @Override // X.InterfaceC165167a5
    public final String B2R() {
        return ((InterfaceC165167a5) A00().A1I.getValue()).B2R();
    }

    @Override // X.InterfaceC165327aL
    public final C51753Mtc BAd() {
        return ((InterfaceC165327aL) A00().A1p.getValue()).BAd();
    }

    @Override // X.InterfaceC165847bC
    public final InterfaceC37162GYz BXW(C206269Bj c206269Bj) {
        return ((InterfaceC165847bC) A00().A1r.getValue()).BXW(c206269Bj);
    }

    @Override // X.InterfaceC164897Zc
    public final C161367Kx BfG() {
        return ((InterfaceC164897Zc) A00().A1G.getValue()).BfG();
    }

    @Override // X.InterfaceC164917Zg
    public final String C7d() {
        return ((InterfaceC164917Zg) A00().A1J.getValue()).C7d();
    }

    @Override // X.InterfaceC165247aD
    public final C23031Ai CE0() {
        C23031Ai CE0 = ((InterfaceC165247aD) A00().A02.getValue()).CE0();
        C14360o3.A07(CE0);
        return CE0;
    }

    @Override // X.C7ZY
    public final void CJ2(String str) {
        ((C7ZY) A00().A0b.getValue()).CJ2(str);
    }

    @Override // X.C7ZY
    public final void CJ3(String str) {
        ((C7ZY) A00().A0b.getValue()).CJ3(str);
    }

    @Override // X.InterfaceC163877Vb
    public final void CMc() {
        ((InterfaceC163877Vb) A00().A1k.getValue()).CMc();
    }

    @Override // X.InterfaceC165627ap
    public final void CMk(String str) {
        ((InterfaceC165627ap) A00().A0O.getValue()).CMk(str);
    }

    @Override // X.C7YK
    public final void COT(EnumC46283KeF enumC46283KeF, C7T3 c7t3, boolean z, boolean z2) {
        ((C7YK) A00().A0P.getValue()).COT(enumC46283KeF, c7t3, z, z2);
    }

    @Override // X.InterfaceC165507ad
    public final boolean CQu() {
        return ((InterfaceC165507ad) A00().A1V.getValue()).CQu();
    }

    @Override // X.InterfaceC165087Zx
    public final boolean CSr() {
        return ((InterfaceC165087Zx) A00().A1e.getValue()).CSr();
    }

    @Override // X.InterfaceC163877Vb
    public final boolean CXB() {
        return ((InterfaceC163877Vb) A00().A1k.getValue()).CXB();
    }

    @Override // X.InterfaceC165007Zp
    public final boolean Cej() {
        return ((InterfaceC165007Zp) A00().A0M.getValue()).Cej();
    }

    @Override // X.InterfaceC165817b8
    public final void Cgl(C76C c76c) {
        ((InterfaceC165817b8) A00().A1S.getValue()).Cgl(c76c);
    }

    @Override // X.C7ZY
    public final void Cgp(String str) {
        ((C7ZY) A00().A0b.getValue()).Cgp(str);
    }

    @Override // X.InterfaceC165377aQ
    public final SpannableString ChE(String str) {
        return ((InterfaceC165377aQ) A00().A0S.getValue()).ChE(str);
    }

    @Override // X.C7ZZ
    public final L7B ChZ(InterfaceC50432MOm interfaceC50432MOm, String str) {
        return ((C7ZZ) A00().A0V.getValue()).ChZ(interfaceC50432MOm, str);
    }

    @Override // X.C7W5
    public final void CkQ(CharSequence charSequence, boolean z) {
        ((C7W5) A00().A0X.getValue()).CkQ(charSequence, z);
    }

    @Override // X.InterfaceC165387aR
    public final void CkV(InterfaceC16660sJ interfaceC16660sJ) {
        ((InterfaceC165387aR) A00().A0Y.getValue()).CkV(interfaceC16660sJ);
    }

    @Override // X.InterfaceC164587Xx
    public final void CnN(DirectMessageIdentifier directMessageIdentifier) {
        ((InterfaceC164587Xx) A00().A1t.getValue()).CnN(directMessageIdentifier);
    }

    @Override // X.InterfaceC164587Xx
    public final void CnO(DirectMessageIdentifier directMessageIdentifier) {
        ((InterfaceC164587Xx) A00().A1t.getValue()).CnO(directMessageIdentifier);
    }

    @Override // X.InterfaceC165187a7
    public final boolean Cog() {
        return ((InterfaceC165187a7) A00().A1Y.getValue()).Cog();
    }

    @Override // X.C7ZY
    public final void CqV(String str) {
        ((C7ZY) A00().A0b.getValue()).CqV(str);
    }

    @Override // X.InterfaceC165647ar
    public final void CqY(String str, long j) {
        ((InterfaceC165647ar) A00().A0d.getValue()).CqY(str, j);
    }

    @Override // X.InterfaceC165657as
    public final void CqZ() {
        ((InterfaceC165657as) A00().A0e.getValue()).CqZ();
    }

    @Override // X.InterfaceC165267aF
    public final void Cqd(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3) {
        ((InterfaceC165267aF) A00().A0f.getValue()).Cqd(str, str2, str3, str4, str5, str6, str7, list, list2, list3);
    }

    @Override // X.InterfaceC165667at
    public final void Cqi(String str, String str2, String str3, String str4, boolean z) {
        ((InterfaceC165667at) A00().A0i.getValue()).Cqi(str, str2, str3, str4, z);
    }

    @Override // X.InterfaceC165277aG
    public final void Cqp(String str) {
        ((InterfaceC165277aG) A00().A0k.getValue()).Cqp(str);
    }

    @Override // X.InterfaceC165677au
    public final boolean Cqt(String str) {
        return ((InterfaceC165677au) A00().A0m.getValue()).Cqt(str);
    }

    @Override // X.C7ZY
    public final void Cqx(String str) {
        ((C7ZY) A00().A0b.getValue()).Cqx(str);
    }

    @Override // X.InterfaceC165277aG
    @Deprecated(message = "")
    public final void Cr1() {
        ((InterfaceC165277aG) A00().A0k.getValue()).Cr1();
    }

    @Override // X.InterfaceC165687av
    public final void Cr2(ImageUrl imageUrl, C81543kP c81543kP, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ((InterfaceC165687av) A00().A0p.getValue()).Cr2(imageUrl, c81543kP, str, str2, str3, str4, str5, i, i2, i3, z, z2, z3, z4, z5);
    }

    @Override // X.InterfaceC164947Zj
    public final void Cr3(InterfaceC83733oI interfaceC83733oI, int i, boolean z) {
        ((InterfaceC164947Zj) A00().A16.getValue()).Cr3(interfaceC83733oI, i, z);
    }

    @Override // X.InterfaceC165707ax
    public final void Cr8(View view, ImageUrl imageUrl, Long l, String str, String str2) {
        ((InterfaceC165707ax) A00().A0t.getValue()).Cr8(view, imageUrl, l, str, str2);
    }

    @Override // X.InterfaceC165037Zs
    public final void Cr9(C47777L8c c47777L8c, String str) {
        ((InterfaceC165037Zs) A00().A0u.getValue()).Cr9(c47777L8c, str);
    }

    @Override // X.InterfaceC165457aY
    public final void CrP() {
        ((InterfaceC165457aY) A00().A10.getValue()).CrP();
    }

    @Override // X.InterfaceC165737b0
    public final void CrY() {
        ((InterfaceC165737b0) A00().A11.getValue()).CrY();
    }

    @Override // X.InterfaceC165747b1
    public final void Crc(String str, String str2) {
        ((InterfaceC165747b1) A00().A12.getValue()).Crc(str, str2);
    }

    @Override // X.InterfaceC165057Zu
    public final void Cro(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        ((InterfaceC165057Zu) A00().A15.getValue()).Cro(reel, gradientSpinnerAvatarView);
    }

    @Override // X.InterfaceC164947Zj
    public final void Crx(C2EC c2ec, boolean z) {
        ((InterfaceC164947Zj) A00().A16.getValue()).Crx(c2ec, z);
    }

    @Override // X.InterfaceC164947Zj
    public final void Cry(InterfaceC83733oI interfaceC83733oI, int i, boolean z) {
        ((InterfaceC164947Zj) A00().A16.getValue()).Cry(interfaceC83733oI, i, z);
    }

    @Override // X.C7ZY
    public final void Crz(String str) {
        ((C7ZY) A00().A0b.getValue()).Crz(str);
    }

    @Override // X.InterfaceC165757b2
    public final void Cs5() {
        ((InterfaceC165757b2) A00().A18.getValue()).Cs5();
    }

    @Override // X.InterfaceC165357aO
    public final void Cuh(String str) {
        ((InterfaceC165357aO) A00().A0H.getValue()).Cuh(str);
    }

    @Override // X.InterfaceC165547ah
    public final void CxY() {
        ((InterfaceC165547ah) A00().A04.getValue()).CxY();
    }

    @Override // X.C7WC
    public final void CzP(C1577676k c1577676k) {
        ((C7WC) A00().A1D.getValue()).CzP(c1577676k);
    }

    @Override // X.InterfaceC165087Zx
    public final void Czy(View view) {
        ((InterfaceC165087Zx) A00().A1e.getValue()).Czy(view);
    }

    @Override // X.InterfaceC164877Za
    public final void DBP() {
        ((InterfaceC164877Za) A00().A0A.getValue()).DBP();
    }

    @Override // X.InterfaceC165297aI
    public final void DDJ(MessageIdentifier messageIdentifier, boolean z) {
        ((InterfaceC165297aI) A00().A1b.getValue()).DDJ(messageIdentifier, z);
    }

    @Override // X.InterfaceC164897Zc
    public final void DJX() {
        ((InterfaceC164897Zc) A00().A1G.getValue()).DJX();
    }

    @Override // X.InterfaceC164877Za
    public final void DKW() {
        ((InterfaceC164877Za) A00().A0A.getValue()).DKW();
    }

    @Override // X.InterfaceC164877Za
    public final void DKX() {
        ((InterfaceC164877Za) A00().A0A.getValue()).DKX();
    }

    @Override // X.C7YL
    public final void DO9(String str, boolean z) {
        ((C7YL) A00().A0Q.getValue()).DO9(str, z);
    }

    @Override // X.InterfaceC164937Zi
    public final void DSy() {
        ((InterfaceC164937Zi) A00().A09.getValue()).DSy();
    }

    @Override // X.InterfaceC165017Zq
    public final void DT8(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        ((InterfaceC165017Zq) A00().A0R.getValue()).DT8(c2ey, messageIdentifier, str, str2, str3, j, z);
    }

    @Override // X.InterfaceC164877Za
    public final void DTC(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        ((InterfaceC164877Za) A00().A0A.getValue()).DTC(c2ey, messageIdentifier, str, str2, str3, str4, j, z, z2);
    }

    @Override // X.InterfaceC165227aB
    public final void DTM(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        ((InterfaceC165227aB) A00().A1n.getValue()).DTM(c2ey, messageIdentifier, str, str2, j);
    }

    @Override // X.InterfaceC164877Za
    public final void Dd3(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        ((InterfaceC164877Za) A00().A0A.getValue()).Dd3(c2ey, messageIdentifier, str, str2, j);
    }

    @Override // X.InterfaceC165607an
    public final void DkV(MessageIdentifier messageIdentifier) {
        ((InterfaceC165607an) A00().A0K.getValue()).DkV(messageIdentifier);
    }

    @Override // X.InterfaceC165637aq
    public final void Dse(String str) {
        ((InterfaceC165637aq) A00().A0T.getValue()).Dse(str);
    }

    @Override // X.C7WC
    public final void Dw6() {
        ((C7WC) A00().A1D.getValue()).Dw6();
    }

    @Override // X.InterfaceC165137a2
    public final void E2b(MessageIdentifier messageIdentifier, long j) {
        ((InterfaceC165137a2) A00().A0o.getValue()).E2b(messageIdentifier, j);
    }

    @Override // X.InterfaceC165467aZ
    public final void E2n(C7P3 c7p3, C160787Im c160787Im, MessageIdentifier messageIdentifier) {
        ((InterfaceC165467aZ) A00().A1B.getValue()).E2n(c7p3, c160787Im, messageIdentifier);
    }

    @Override // X.InterfaceC165767b3
    public final void E2q(String str) {
        ((InterfaceC165767b3) A00().A1C.getValue()).E2q(str);
    }

    @Override // X.InterfaceC164347Wx
    public final void E3k() {
        ((InterfaceC164347Wx) A00().A1E.getValue()).E3k();
    }

    @Override // X.C7W7
    public final void E3l(boolean z) {
        ((C7W7) A00().A1F.getValue()).E3l(z);
    }

    @Override // X.InterfaceC165537ag
    public final void ECw(String str, String str2) {
        ((InterfaceC165537ag) A00().A1K.getValue()).ECw(str, str2);
    }

    @Override // X.InterfaceC165127a1
    public final void EHN(MessageIdentifier messageIdentifier) {
        ((InterfaceC165127a1) A00().A0o.getValue()).EHN(messageIdentifier);
    }

    @Override // X.InterfaceC165777b4
    public final void EHs(MessageIdentifier messageIdentifier) {
        ((InterfaceC165777b4) A00().A1N.getValue()).EHs(messageIdentifier);
    }

    @Override // X.InterfaceC164347Wx
    public final void EKo() {
        ((InterfaceC164347Wx) A00().A1E.getValue()).EKo();
    }

    @Override // X.InterfaceC165787b5
    public final void EL0() {
        ((InterfaceC165787b5) A00().A1O.getValue()).EL0();
    }

    @Override // X.InterfaceC165797b6
    public final void ELa(MessageIdentifier messageIdentifier) {
        ((InterfaceC165797b6) A00().A1Q.getValue()).ELa(messageIdentifier);
    }

    @Override // X.InterfaceC164927Zh
    public final void EMC(String str) {
        ((InterfaceC164927Zh) A00().A1T.getValue()).EMC(str);
    }

    @Override // X.InterfaceC164927Zh
    public final void EMK(String str) {
        ((InterfaceC164927Zh) A00().A1T.getValue()).EMK(str);
    }

    @Override // X.InterfaceC165097Zy
    public final void Ehz(MessageIdentifier messageIdentifier) {
        ((InterfaceC165097Zy) A00().A0F.getValue()).Ehz(messageIdentifier);
    }

    @Override // X.InterfaceC165517ae
    public final void EkP(C7P3 c7p3, String str, boolean z) {
        ((InterfaceC165517ae) A00().A1X.getValue()).EkP(c7p3, str, z);
    }

    @Override // X.InterfaceC163877Vb
    public final void El2() {
        ((InterfaceC163877Vb) A00().A1k.getValue()).El2();
    }

    @Override // X.InterfaceC165087Zx
    public final void ElB(View view, C83403nh c83403nh, MessageIdentifier messageIdentifier, long j) {
        ((InterfaceC165087Zx) A00().A1e.getValue()).ElB(view, c83403nh, messageIdentifier, j);
    }

    @Override // X.InterfaceC165577ak
    public final void ElD(C44995Jvl c44995Jvl) {
        ((InterfaceC165577ak) A00().A08.getValue()).ElD(c44995Jvl);
        throw null;
    }

    @Override // X.InterfaceC165207a9
    public final void ElE(InterfaceC129525tH interfaceC129525tH, EnumC46202Kce enumC46202Kce, MessageIdentifier messageIdentifier) {
        ((InterfaceC165207a9) A00().A1g.getValue()).ElE(interfaceC129525tH, enumC46202Kce, messageIdentifier);
    }

    @Override // X.InterfaceC165207a9
    public final void ElF(C160787Im c160787Im, EnumC46202Kce enumC46202Kce) {
        ((InterfaceC165207a9) A00().A1g.getValue()).ElF(c160787Im, enumC46202Kce);
    }

    @Override // X.InterfaceC165317aK
    public final void Elc() {
        ((InterfaceC165317aK) A00().A1h.getValue()).Elc();
    }

    @Override // X.C7XX
    public final void EnH(C7S5 c7s5, MessageIdentifier messageIdentifier, String str) {
        ((C7XX) A00().A1a.getValue()).EnH(c7s5, messageIdentifier, str);
    }

    @Override // X.InterfaceC165007Zp
    public final void Eo4(L1V l1v, C38321qM c38321qM, DirectMessageIdentifier directMessageIdentifier, String str) {
        ((InterfaceC165007Zp) A00().A0M.getValue()).Eo4(l1v, c38321qM, directMessageIdentifier, str);
    }

    @Override // X.InterfaceC165527af
    public final void F7y(C161717Mg c161717Mg) {
        ((InterfaceC165527af) A00().A1l.getValue()).F7y(c161717Mg);
    }

    @Override // X.InterfaceC165347aN
    public final void F81(MessageIdentifier messageIdentifier, boolean z) {
        ((InterfaceC165347aN) A00().A0E.getValue()).F81(messageIdentifier, z);
    }

    @Override // X.InterfaceC164997Zo
    public final void F9s(MessageIdentifier messageIdentifier) {
        ((InterfaceC164997Zo) A00().A1o.getValue()).F9s(messageIdentifier);
    }

    @Override // X.InterfaceC165007Zp
    public final void FAT(C45117Jxm c45117Jxm, DirectMessageIdentifier directMessageIdentifier) {
        ((InterfaceC165007Zp) A00().A0M.getValue()).FAT(c45117Jxm, directMessageIdentifier);
    }

    @Override // X.InterfaceC165837bB
    public final void FCb(String str) {
        ((InterfaceC165837bB) A00().A1j.getValue()).FCb(str);
    }

    @Override // X.InterfaceC165327aL
    public final void FD7(Intent intent) {
        ((InterfaceC165327aL) A00().A1p.getValue()).FD7(intent);
    }

    @Override // X.InterfaceC165077Zw
    public final boolean isResumed() {
        return ((InterfaceC165077Zw) A00().A1H.getValue()).isResumed();
    }
}
