package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FoN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35632FoN implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public ViewOnClickListenerC35632FoN(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.A00 = i;
        this.A05 = obj4;
        this.A06 = z;
        this.A02 = obj2;
        this.A01 = obj;
        this.A04 = obj3;
        this.A03 = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int i2;
        Context context;
        int i3;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-112023888);
                C67649Uue c67649Uue = (C67649Uue) this.A05;
                InterfaceC16600sD interfaceC16600sD = c67649Uue.A08;
                boolean z = this.A06;
                if (z) {
                    i = 355;
                } else {
                    i = 353;
                }
                String A00 = AbstractC58317Pt9.A00(i);
                SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) this.A02;
                interfaceC16600sD.invoke(AbstractC58317Pt9.A00(54), A00, AbstractC25228BEl.A13(selectionPaymentMethodItem.A0F), selectionPaymentMethodItem.A09);
                Context context2 = (Context) this.A01;
                C14360o3.A0A(context2);
                BUO buo = new BUO(0, c67649Uue, selectionPaymentMethodItem, this.A04, this.A03, z);
                D8O d8o = new D8O(1, selectionPaymentMethodItem, c67649Uue, z);
                C14360o3.A0B(context2, 0);
                SNQ A0H = C2FP.A0H();
                int i4 = 2131961450;
                int i5 = 2131961449;
                if (z) {
                    i4 = 2131961454;
                    i5 = 2131961453;
                }
                C0fJ.A00(A0H.A00(context2, AbstractC69850Vwb.A00(DialogInterfaceOnClickListenerC35452Fk9.A00(buo, 1), DialogInterfaceOnClickListenerC35452Fk9.A00(d8o, 2), i4, i5, 2131961446, 2131961439, 0, 2)));
                i2 = 575144240;
                break;
            case 1:
                A05 = C0f9.A05(188311918);
                boolean z2 = this.A06;
                C31943E1x c31943E1x = (C31943E1x) this.A05;
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                if (z2) {
                    FPN fpn = c31943E1x.A00;
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = c31943E1x.A01.A0A;
                    Reel reel = (Reel) this.A02;
                    AbstractC167017dG.A1O(gradientSpinnerAvatarView, reel);
                    EOE eoe = fpn.A00;
                    C38E c38e = new C38E(eoe, AbstractC166987dD.A0r(eoe.A01), new C38C(eoe));
                    c38e.A0C = AbstractC166997dE.A0n();
                    c38e.A05 = new C31559Dtj(eoe.requireActivity(), gradientSpinnerAvatarView, new GF3(eoe, 5));
                    c38e.A09(reel, C3G2.A1t, gradientSpinnerAvatarView);
                } else {
                    FPN fpn2 = c31943E1x.A00;
                    User user = (User) this.A03;
                    UserSession userSession = (UserSession) this.A04;
                    ((Fragment) this.A01).requireActivity();
                    fpn2.A00(userSession, user);
                }
                i2 = 907004194;
                break;
            case 2:
                A05 = C0f9.A05(-334998636);
                if (view.isActivated()) {
                    C41222IMn c41222IMn = (C41222IMn) this.A03;
                    Boolean bool = c41222IMn.A00.A04;
                    if (bool != null && bool.booleanValue()) {
                        ((InterfaceC63932vE) this.A02).DHF(c41222IMn, this.A05);
                    }
                    if (!this.A06 && ((C41232IMx) this.A04).A02) {
                        ((InterfaceC63932vE) this.A02).DHH(c41222IMn, this.A05);
                    } else {
                        C41232IMx c41232IMx = (C41232IMx) this.A04;
                        if (c41232IMx.A01) {
                            IMQ imq = (IMQ) this.A05;
                            if (imq.A05) {
                                imq.A05 = false;
                                ((InterfaceC63932vE) this.A02).DHH(c41222IMn, imq);
                            }
                        } else {
                            InterfaceC09390do interfaceC09390do = c41232IMx.A04;
                            Object value = interfaceC09390do.getValue();
                            IMQ imq2 = (IMQ) this.A05;
                            int i7 = imq2.A01 + 1;
                            if (value != null) {
                                Iterator A1J = AbstractC25226BEj.A1J(interfaceC09390do.getValue());
                                while (true) {
                                    if (A1J.hasNext()) {
                                        C41009IEe c41009IEe = (C41009IEe) A1J.next();
                                        String BWt = c41009IEe.A01.BWt();
                                        if (BWt != null && BWt.length() != 0) {
                                            i7 = AbstractC41752IeR.A00(c41222IMn, c41009IEe, imq2.A01 + 1);
                                        }
                                    }
                                }
                            }
                            imq2.A00(i7);
                        }
                    }
                } else {
                    C41232IMx c41232IMx2 = (C41232IMx) this.A04;
                    if (c41232IMx2.A01) {
                        context = (Context) this.A01;
                        i3 = 2131961893;
                        str = AbstractC111324zv.A00(2318);
                    } else {
                        boolean A1X = AbstractC167007dF.A1X(c41232IMx2.A03.A00, INLINE_SURVEY_QUESTION_TYPES.A04);
                        context = (Context) this.A01;
                        if (A1X) {
                            i3 = 2131961892;
                            str = "error_message_awr_comment";
                        } else {
                            i3 = 2131961894;
                            str = "error_message_awr_multiple_question";
                        }
                    }
                    C9GR.A01(context, str, i3, 0);
                }
                i2 = -1249986613;
                break;
            case 3:
                A05 = C0f9.A05(1701426783);
                EO6 eo6 = (EO6) this.A03;
                List A0a = AbstractC001800i.A0a(eo6.A02);
                if ((!A0a.isEmpty()) || eo6.A01) {
                    UserSession userSession2 = (UserSession) this.A05;
                    FVL.A01(C35817Frt.A00, new C35830Fs6(1, eo6, userSession2), userSession2, A0a, eo6.A01);
                }
                ((GZ8) this.A04).Dar();
                C35121FeO c35121FeO = (C35121FeO) this.A01;
                int size = A0a.size();
                InterfaceC02590Ai A002 = C35121FeO.A00(c35121FeO);
                AbstractC31180DnO.A1G(EnumC33496ErV.BOTTOMSHEET, A002);
                A002.A9K("num_requests", AbstractC31171DnF.A0V(size));
                C35121FeO.A01(A002, c35121FeO);
                if (this.A06) {
                    boolean z3 = eo6.A01;
                    InterfaceC02590Ai A003 = C35121FeO.A00(c35121FeO);
                    EnumC33496ErV enumC33496ErV = EnumC33496ErV.SYSTEM_SETTING;
                    if (z3) {
                        A003.A8R(enumC33496ErV, "format");
                        A003.A8R(EnumC33497ErW.TOGGLE_ON, "action");
                        C35121FeO.A01(A003, c35121FeO);
                    } else {
                        A003.A8R(enumC33496ErV, "format");
                        A003.A8R(EnumC33497ErW.TOGGLE_OFF, "action");
                        C35121FeO.A01(A003, c35121FeO);
                    }
                }
                ((C14510oO) this.A02).A00 = true;
                i2 = 1647711798;
                break;
            case 4:
                A05 = C0f9.A05(-1167412501);
                ((BKA) this.A05).A02((C8JW) this.A02, (EffectPreviewIntf) this.A01, (C38321qM) this.A03, (C75113Zb) this.A04);
                i2 = -556785839;
                break;
            default:
                return;
        }
        C0f9.A0C(i2, A05);
    }
}
