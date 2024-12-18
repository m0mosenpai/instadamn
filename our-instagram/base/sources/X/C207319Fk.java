package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9Fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207319Fk extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207319Fk(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A06 = obj6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass982 anonymousClass982 = (AnonymousClass982) this.A06;
                FragmentActivity requireActivity = anonymousClass982.A00.requireActivity();
                UserSession userSession = anonymousClass982.A01;
                return new C49070Lmw(requireActivity, (Fragment) this.A05, (InterfaceC11380iw) this.A01, userSession, (C7WA) this.A03, (InterfaceC165437aW) ((InterfaceC09390do) this.A04).getValue(), new C50249MHe(this.A02, 39));
            case 1:
                UserSession userSession2 = ((AnonymousClass982) this.A06).A01;
                return new C49095LnL((AbstractC59962oe) this.A03, (InterfaceC11380iw) this.A01, userSession2, (C163867Va) this.A05, (InterfaceC08830cm) this.A02, new C9GX((InterfaceC16820sZ) this.A04, 7));
            case 2:
                AnonymousClass982 anonymousClass9822 = (AnonymousClass982) this.A06;
                UserSession userSession3 = anonymousClass9822.A01;
                return new C49040LmS(anonymousClass9822.A00.requireActivity(), userSession3, (LEK) ((InterfaceC09390do) this.A02).getValue(), (InterfaceC60442pS) this.A03, (InterfaceC08830cm) this.A01, (InterfaceC08830cm) this.A05, (InterfaceC16820sZ) this.A04);
            case 3:
                AnonymousClass982 anonymousClass9823 = (AnonymousClass982) this.A06;
                FragmentActivity requireActivity2 = anonymousClass9823.A00.requireActivity();
                UserSession userSession4 = anonymousClass9823.A01;
                C9GQ c9gq = new C9GQ(this.A05, 9);
                C9GX c9gx = new C9GX(this.A01, 8);
                Object value = ((InterfaceC09390do) this.A04).getValue();
                C14360o3.A07(value);
                return new G4R(requireActivity2, (AbstractC59962oe) this.A03, userSession4, (G4N) value, (C2DS) this.A02, c9gx, c9gq);
            case 4:
                C79413go c79413go = C79413go.A00;
                Context context = (Context) this.A01;
                UserSession userSession5 = ((C906241x) this.A06).A00;
                C38321qM c38321qM = (C38321qM) this.A03;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                C3YE c3ye = C3YE.A02;
                return c79413go.A00(context, userSession5, c38321qM, c38321qM2, (InterfaceC60442pS) this.A04, (C75113Zb) this.A05, c3ye);
            case 5:
                final Context context2 = (Context) this.A01;
                C65122xA c65122xA = (C65122xA) this.A06;
                final UserSession userSession6 = c65122xA.A00;
                final C1M1 c1m1 = (C1M1) this.A05;
                final InterfaceC60442pS interfaceC60442pS = c65122xA.A01;
                final C64372vw c64372vw = (C64372vw) this.A03;
                final C64452w4 c64452w4 = (C64452w4) this.A02;
                final InterfaceC61432r6 interfaceC61432r6 = (InterfaceC61432r6) this.A04;
                return new AbstractC65632xz(context2, interfaceC60442pS, userSession6, c64372vw, interfaceC61432r6, c1m1, c64452w4) { // from class: X.2zg
                    public final Context A00;
                    public final InterfaceC11380iw A01;
                    public final UserSession A02;
                    public final C64372vw A03;
                    public final InterfaceC61432r6 A04;
                    public final C1M1 A05;
                    public final C64452w4 A06;
                    public final boolean A07;

                    {
                        C14360o3.A0B(context2, 1);
                        C14360o3.A0B(c1m1, 3);
                        C14360o3.A0B(c64372vw, 5);
                        C14360o3.A0B(c64452w4, 6);
                        C14360o3.A0B(interfaceC61432r6, 7);
                        this.A00 = context2;
                        this.A02 = userSession6;
                        this.A05 = c1m1;
                        this.A01 = interfaceC60442pS;
                        this.A03 = c64372vw;
                        this.A06 = c64452w4;
                        this.A04 = interfaceC61432r6;
                        this.A07 = C18U.A06(C06090Tz.A05, userSession6, 36320532672619155L);
                    }

                    @Override // X.InterfaceC65642y0
                    public final int getViewTypeCount() {
                        return 1;
                    }

                    @Override // X.InterfaceC65642y0
                    public final void bindView(int i, View view, Object obj, Object obj2) {
                        InterfaceC106374qr interfaceC106374qr;
                        IgImageView igImageView;
                        IgImageView igImageView2;
                        List Ac6;
                        IgLinearLayout igLinearLayout;
                        String C3E;
                        List list;
                        int A03 = C0f9.A03(2110356307);
                        C14360o3.A0B(view, 1);
                        C14360o3.A0B(obj, 2);
                        C42710Iv5 c42710Iv5 = (C42710Iv5) obj;
                        UserSession userSession7 = this.A02;
                        C42122IlW c42122IlW = new C42122IlW(this.A01, userSession7, c42710Iv5, this.A04, this.A05);
                        C64372vw c64372vw2 = this.A03;
                        C64392vy c64392vy = c64372vw2.A01;
                        c64392vy.A00 = c42122IlW;
                        C64402vz c64402vz = c64372vw2.A06;
                        c64402vz.A00 = c42122IlW;
                        Context context3 = this.A00;
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.afi.ui.AfiViewBinder.Holder");
                        C69446VnV c69446VnV = (C69446VnV) tag;
                        C64452w4 c64452w42 = this.A06;
                        boolean z = this.A07;
                        C14360o3.A0B(context3, 0);
                        C14360o3.A0B(userSession7, 1);
                        C14360o3.A0B(c69446VnV, 2);
                        C14360o3.A0B(c42710Iv5, 3);
                        C14360o3.A0B(c64452w42, 6);
                        View view2 = c69446VnV.A00;
                        Object obj3 = new Object();
                        String A00 = C64372vw.A00(c42710Iv5);
                        C59062n7 c59062n7 = C59062n7.A07;
                        C59072n8 c59072n8 = new C59072n8(c42710Iv5, obj3, A00);
                        c59072n8.A00(c64392vy);
                        c59072n8.A00(c64402vz);
                        c64372vw2.A00.A05(view2, c59072n8.A01());
                        C38621GyO c38621GyO = c42710Iv5.A06.A01;
                        if (c38621GyO != null && (list = c38621GyO.A04) != null) {
                            interfaceC106374qr = (InterfaceC106374qr) AbstractC001800i.A0J(list);
                        } else {
                            interfaceC106374qr = null;
                        }
                        C38321qM c38321qM3 = c42710Iv5.A02;
                        C75113Zb c75113Zb = c42710Iv5.A03;
                        Integer num = c42710Iv5.A04;
                        IgTextView igTextView = c69446VnV.A04;
                        String str = null;
                        if (interfaceC106374qr != null) {
                            str = interfaceC106374qr.getText();
                        }
                        igTextView.setText(str);
                        if (interfaceC106374qr != null && (C3E = interfaceC106374qr.C3E()) != null && C3E.length() != 0) {
                            IgTextView igTextView2 = c69446VnV.A05;
                            igTextView2.setVisibility(0);
                            igTextView2.setText(interfaceC106374qr.C3E());
                        } else {
                            c69446VnV.A05.setVisibility(8);
                        }
                        Drawable drawable = context3.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
                        if (drawable != null && interfaceC106374qr != null && (Ac6 = interfaceC106374qr.Ac6()) != null && Ac6.size() >= 2) {
                            InterfaceC106354qp interfaceC106354qp = (InterfaceC106354qp) AbstractC001800i.A0O(Ac6, 0);
                            InterfaceC106354qp interfaceC106354qp2 = (InterfaceC106354qp) AbstractC001800i.A0O(Ac6, 1);
                            IgLinearLayout igLinearLayout2 = c69446VnV.A02;
                            if (igLinearLayout2 != null && (igLinearLayout = c69446VnV.A03) != null) {
                                int A01 = (int) ((AbstractC13890nF.A01(context3) / 2) * 0.83d);
                                C41759Iea.A00(context3, drawable, c42122IlW, interfaceC106354qp, c38621GyO, userSession7, igLinearLayout2, c38321qM3, c75113Zb, c64452w42, num, "x_pano_outline_16", A01);
                                C41759Iea.A00(context3, drawable, c42122IlW, interfaceC106354qp2, c38621GyO, userSession7, igLinearLayout, c38321qM3, c75113Zb, c64452w42, num, "check_pano_outline_16", A01);
                            } else {
                                C41759Iea.A01(context3, drawable, c42122IlW, interfaceC106354qp, c38621GyO, userSession7, c38321qM3, c75113Zb, c69446VnV.A09, c64452w42, num, AbstractC111324zv.A00(5593), z);
                                C41759Iea.A01(context3, drawable, c42122IlW, interfaceC106354qp2, c38621GyO, userSession7, c38321qM3, c75113Zb, c69446VnV.A0A, c64452w42, num, AbstractC111324zv.A00(4085), z);
                            }
                        }
                        C0fQ.A00(new ViewOnClickListenerC41937IiU(c42122IlW, c75113Zb, c64452w42), c69446VnV.A08);
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession7, 36314652863105796L)) {
                            igImageView = c69446VnV.A07;
                            igImageView.setVisibility(0);
                            c69446VnV.A06.setVisibility(8);
                            ConstraintLayout constraintLayout = c69446VnV.A01;
                            Drawable drawable2 = context3.getDrawable(R.drawable.rounded_afi_ini_background_prism_fix);
                            RectF rectF = AbstractC13880nE.A01;
                            C14360o3.A0B(constraintLayout, 0);
                            constraintLayout.setBackground(drawable2);
                        } else {
                            igImageView = c69446VnV.A06;
                            if (igImageView != null && (igImageView2 = c69446VnV.A07) != null) {
                                igImageView.setVisibility(0);
                                igImageView2.setVisibility(8);
                            }
                        }
                        if (C18U.A06(c06090Tz, userSession7, 36314652863171333L)) {
                            int A0H = AbstractC53242c7.A0H(context3, R.attr.igds_color_stroke);
                            AbstractC13880nE.A0L(context3, c69446VnV.A01, A0H);
                            igImageView.setColorFilter(context3.getColor(A0H));
                        }
                        C0f9.A0A(-1401329030, A03);
                    }

                    @Override // X.InterfaceC65642y0
                    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
                        if (anonymousClass306 != null) {
                            anonymousClass306.A7a(0);
                        }
                    }

                    @Override // X.InterfaceC65642y0
                    public final View createView(int i, ViewGroup viewGroup) {
                        int A03 = C0f9.A03(-1665793026);
                        C14360o3.A0B(viewGroup, 1);
                        UserSession userSession7 = this.A02;
                        C14360o3.A0B(userSession7, 1);
                        Context context3 = viewGroup.getContext();
                        boolean A06 = C18U.A06(C06090Tz.A05, userSession7, 36314652863040259L);
                        int i2 = R.layout.afi_view_v2;
                        if (A06) {
                            i2 = R.layout.afi_view_prism_fix_segmented_pill;
                        }
                        View inflate = LayoutInflater.from(context3).inflate(i2, viewGroup, false);
                        C14360o3.A0A(inflate);
                        inflate.setTag(new C69446VnV(inflate, A06));
                        C0f9.A0A(-1084065916, A03);
                        return inflate;
                    }
                };
            case 6:
                Context context3 = (Context) this.A01;
                C65122xA c65122xA2 = (C65122xA) this.A06;
                UserSession userSession7 = c65122xA2.A00;
                InterfaceC60442pS interfaceC60442pS2 = c65122xA2.A01;
                C62812tK c62812tK = (C62812tK) this.A02;
                C62662t5 c62662t5 = (C62662t5) this.A03;
                return new C2y9(context3, (Fragment) this.A04, interfaceC60442pS2, userSession7, (InterfaceC61782rf) this.A05, c62812tK, c62662t5);
            case 7:
                Context context4 = (Context) this.A01;
                C65122xA c65122xA3 = (C65122xA) this.A06;
                UserSession userSession8 = c65122xA3.A00;
                InterfaceC60442pS interfaceC60442pS3 = c65122xA3.A01;
                C64062vR c64062vR = (C64062vR) this.A03;
                C60662pp c60662pp = (C60662pp) this.A02;
                return new C66632zf(context4, interfaceC60442pS3, userSession8, (C64312vq) this.A04, (C61762rd) this.A05, c64062vR, c60662pp);
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                Activity activity = (Activity) this.A01;
                AbstractC10360h2 abstractC10360h2 = (AbstractC10360h2) this.A02;
                User user = (User) this.A05;
                AbstractC31510Dsu.A04(activity, null, abstractC10360h2, (AbstractC018607g) this.A04, (InterfaceC11380iw) this.A03, (UserSession) this.A06, user, null, "expanded_profile_pic", null, null, null, true);
                return C0eB.A00;
            case 9:
            case 10:
                UserSession userSession9 = (UserSession) this.A05;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                Activity activity2 = (Activity) this.A01;
                User user2 = (User) this.A04;
                UserDetailFragment userDetailFragment = (UserDetailFragment) this.A03;
                interfaceC11380iw.getModuleName();
                userDetailFragment.A0o();
                if (AbstractC82073lT.A02(userSession9)) {
                    Bundle bundle = new Bundle();
                    bundle.putString(AbstractC111324zv.A00(902), user2.getId());
                    FAK.A00(activity2, bundle, userSession9, user2.getId(), false);
                } else {
                    EnumC33405Epc enumC33405Epc = EnumC33405Epc.A06;
                    String username = user2.getUsername();
                    String fullName = user2.getFullName();
                    String A03 = C3YV.A03(user2.getId());
                    Bundle A00 = AbstractC177607uu.A00(null, enumC33405Epc, false);
                    A00.putString(AbstractC43591JPw.A00(269), username);
                    A00.putString(AbstractC43591JPw.A00(268), fullName);
                    A00.putString(AbstractC43591JPw.A00(270), A03);
                    A00.putBoolean(AbstractC111324zv.A00(657), false);
                    C6XJ c6xj = new C6XJ(activity2, A00, userSession9, ModalActivity.class, "nametag");
                    c6xj.A07();
                    c6xj.A0C(activity2);
                }
                return C0eB.A00;
            case 11:
                UserSession userSession10 = (UserSession) this.A05;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A02;
                Activity activity3 = (Activity) this.A01;
                User user3 = (User) this.A04;
                ((UserDetailFragment) this.A03).A0o();
                if (AbstractC82073lT.A02(userSession10)) {
                    C14360o3.A0B(userSession10, 0);
                    if (!C18U.A06(C06090Tz.A05, userSession10, 36327335901870604L)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(AbstractC111324zv.A00(902), user3.getId());
                        FAK.A00(activity3, bundle2, userSession10, user3.getId(), false);
                        return C0eB.A00;
                    }
                }
                C34726FRp A07 = C28531Zo.A04.A02.A07(interfaceC11380iw2, userSession10, C2EY.A1Q);
                A07.A06(user3.getId());
                C3DN A002 = C3DN.A00.A00(activity3);
                A07.A01();
                if (A002 != null) {
                    A002.A0K(A07.A00());
                }
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C69703Be c69703Be = (C69703Be) this.A06;
                C69783Bm c69783Bm = c69703Be.A0Z;
                ShareType shareType = (ShareType) this.A05;
                if (c69783Bm.A01((C47Z) this.A04, shareType)) {
                    c69783Bm.A00((FragmentActivity) this.A01, (C38321qM) this.A03, shareType, c69703Be.A0Y.getSessionId());
                } else {
                    C1ZF A003 = F1A.A00();
                    FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                    UserSession userSession11 = c69703Be.A0T;
                    C38321qM c38321qM3 = (C38321qM) this.A03;
                    A003.A03(fragmentActivity, userSession11, c38321qM3);
                    AbstractC138316On.A03((Fragment) this.A02, fragmentActivity, c69703Be.A0W, userSession11, c38321qM3);
                }
                return C0eB.A00;
        }
    }
}
