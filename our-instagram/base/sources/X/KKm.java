package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import java.io.ByteArrayOutputStream;

/* loaded from: classes8.dex */
public final class KKm extends C3PD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public KKm(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj5;
        this.A04 = obj4;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    @Override // X.C3PD, X.C3PE
    public final void DQY(View view) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                LF3 lf3 = (LF3) this.A05;
                InterfaceC148316m1 interfaceC148316m1 = lf3.A02;
                if (interfaceC148316m1 == null) {
                    return;
                }
                UserSession userSession = (UserSession) this.A04;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                Resources resources = (Resources) this.A03;
                Context context = (Context) this.A02;
                InterfaceC150196pR interfaceC150196pR = lf3.A01;
                if (interfaceC150196pR != null) {
                    interfaceC150196pR.CxL(view, interfaceC148316m1);
                }
                C148336m3 B1F = interfaceC148316m1.B1F();
                if (!interfaceC148316m1.CLn() || B1F == null) {
                    return;
                }
                new ViewOnTouchListenerC48079LQe(interfaceC11380iw, userSession, lf3.A0A, B1F, new C49650Lwh(context, view, lf3), resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen), false);
                return;
            case 1:
                C14360o3.A0B(view, 0);
                ((InterfaceC16620sF) this.A02).invoke(view, this.A01);
                return;
            default:
                super.DQY(view);
                return;
        }
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        C148276lx C0S;
        Drawable drawable;
        C8OT c8ot;
        String str;
        C194808jg c194808jg;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                LF3 lf3 = (LF3) this.A05;
                ConstrainedImageView constrainedImageView = lf3.A0A;
                Context context = constrainedImageView.getContext();
                InterfaceC148316m1 interfaceC148316m1 = lf3.A02;
                if (interfaceC148316m1 != null) {
                    UserSession userSession = (UserSession) this.A04;
                    EnumC148326m2 CBc = interfaceC148316m1.CBc();
                    Drawable drawable2 = null;
                    drawable2 = null;
                    drawable2 = null;
                    drawable2 = null;
                    if (CBc == EnumC148326m2.A04) {
                        C148336m3 B1F = interfaceC148316m1.B1F();
                        if (B1F != null) {
                            C14360o3.A0A(context);
                            int A07 = AbstractC43594JPz.A07(context);
                            C6RB c6rb = new C6RB(context, AbstractC188878Yd.A01(context));
                            c6rb.A0M(B1F.A02);
                            c6rb.A0A(A07);
                            c6rb.A09();
                            drawable2 = c6rb;
                        }
                    } else if (CBc == EnumC148326m2.A06 && (C0S = interfaceC148316m1.C0S()) != null) {
                        if (C0S.A00() == EnumC150226pU.A0M) {
                            Drawable drawable3 = constrainedImageView.getDrawable();
                            if ((drawable3 instanceof C194808jg) && (c194808jg = (C194808jg) drawable3) != null) {
                                drawable = (Drawable) AbstractC001800i.A0A(c194808jg.A05());
                            } else {
                                drawable = null;
                            }
                            if ((drawable instanceof C8OT) && (c8ot = (C8OT) drawable) != null && (((str = c8ot.A0D) == null && (str = c8ot.A0F) == null) || !AbstractC166987dD.A11(str).exists())) {
                                if (c8ot.isLoading() || !C18U.A06(C06090Tz.A06, userSession, 36323741013782086L)) {
                                    return true;
                                }
                                C2n4 E3L = C2n4.A09.E3L(c8ot.A0l);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                InterfaceC27191Tt interfaceC27191Tt = lf3.A00;
                                if (interfaceC27191Tt != null) {
                                    interfaceC27191Tt.cancel();
                                }
                                lf3.A00 = C14M.A03().A06(new C48267LXq(view, lf3, c8ot, interfaceC148316m1, byteArrayOutputStream), LF3.A0C, E3L, null);
                                return true;
                            }
                            drawable2 = constrainedImageView.getDrawable();
                        } else {
                            InterfaceC150196pR interfaceC150196pR = lf3.A01;
                            if (interfaceC150196pR != null) {
                                C14360o3.A0A(context);
                                drawable2 = AbstractC209799Pp.A00(context, userSession, interfaceC150196pR, C0S);
                            }
                        }
                    }
                    InterfaceC150196pR interfaceC150196pR2 = lf3.A01;
                    if (interfaceC150196pR2 != null) {
                        interfaceC150196pR2.CxM(drawable2, view, interfaceC148316m1);
                        return true;
                    }
                    return true;
                }
                return true;
            case 1:
                C14360o3.A0B(view, 0);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A03;
                C45026JwH c45026JwH = (C45026JwH) this.A01;
                EnumC46295KeR enumC46295KeR = EnumC46295KeR.REGULAR;
                C44688JqX c44688JqX = (C44688JqX) this.A05;
                int bindingAdapterPosition = c44688JqX.getBindingAdapterPosition();
                C51751Mta c51751Mta = (C51751Mta) this.A04;
                interfaceC16620sF.invoke(c45026JwH, new C45058Jwn(enumC46295KeR, AbstractC166997dE.A0b(), (Boolean) c51751Mta.A00, null, c51751Mta.A02, AbstractC46707KlQ.A00((Integer) c51751Mta.A01), bindingAdapterPosition, c51751Mta.A03));
                UserSession userSession2 = c44688JqX.A00;
                LBp.A01(userSession2, new C49807LzE(null, null, EnumC46173KcB.A05, c45026JwH, null, System.currentTimeMillis()), AbstractC25225BEi.A07(C06090Tz.A05, userSession2, 36609704232359889L));
                return true;
            case 2:
                C41628IbJ c41628IbJ = (C41628IbJ) this.A02;
                if (c41628IbJ.A00.BRR() != null) {
                    Integer BRq = c41628IbJ.A00.BRR().BRq();
                    BRq.getClass();
                    if (BRq.intValue() == EnumC40111tc.A0a.A00) {
                        Object obj = this.A01;
                        C75363a3 c75363a3 = (C75363a3) this.A05;
                        c75363a3.getClass();
                        Context context2 = ((NXU) this.A03).A00.getContext();
                        UserSession userSession3 = (UserSession) this.A04;
                        QuestionMediaResponseModelIntf BRR = c41628IbJ.A00.BRR();
                        BRR.getClass();
                        ImageInfo BGx = BRR.BGx();
                        BGx.getClass();
                        Integer Ba2 = BRR.Ba2();
                        Ba2.getClass();
                        int intValue = Ba2.intValue();
                        Integer BZo = BRR.BZo();
                        BZo.getClass();
                        ExtendedImageUrl A00 = AbstractC41341IRm.A00(context2, BGx, intValue, BZo.intValue());
                        A00.getClass();
                        C121275eQ A03 = AbstractC50633MWu.A03(context2, userSession3, AbstractC50633MWu.A06(A00, null, c75363a3, "QuestionVideoResponse", false, false, false, true));
                        A03.A00 = new HJ2(1, obj, BRR, c41628IbJ);
                        C1GJ.A03(A03);
                        return true;
                    }
                }
                ((C38930HCd) this.A01).A04.A03(c41628IbJ);
                return true;
            default:
                return super.DsE(view);
        }
    }
}
