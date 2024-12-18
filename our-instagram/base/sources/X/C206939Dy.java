package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.9Dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206939Dy extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206939Dy(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int A01;
        int A012;
        Context context;
        switch (this.A00) {
            case 0:
                context = ((C75923ax) this.A01).A00;
                A01 = AbstractC13880nE.A07(context);
                return Integer.valueOf(A01);
            case 1:
                C89323yY c89323yY = (C89323yY) this.A01;
                return new CU7(c89323yY.A00, c89323yY.A01);
            case 2:
                return new C89593yz(((C89323yY) this.A01).A02);
            case 3:
                return new AB8(((C89323yY) this.A01).A00);
            case 4:
                C89323yY c89323yY2 = (C89323yY) this.A01;
                return new C77293dF(c89323yY2.A00, c89323yY2.A02);
            case 5:
                return new C89583yy(((C89323yY) this.A01).A00);
            case 6:
                C89323yY c89323yY3 = (C89323yY) this.A01;
                return new C77263dC(c89323yY3.A00, c89323yY3.A01.B5k());
            case 7:
                C89323yY c89323yY4 = (C89323yY) this.A01;
                return new C77283dE(c89323yY4.A00, c89323yY4.A02, c89323yY4.A03);
            case 8:
                C89323yY c89323yY5 = (C89323yY) this.A01;
                return new C76953ch(c89323yY5.A00, c89323yY5.A04);
            case 9:
                C89323yY c89323yY6 = (C89323yY) this.A01;
                return new C3z2(c89323yY6.A00, c89323yY6.A04);
            case 10:
                return new C85033qr(((C89323yY) this.A01).A00);
            case 11:
                return FCM.A00(((C75623aT) this.A01).A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 17:
                return this.A01;
            case 14:
            case Process.SIGSTOP /* 19 */:
                A012 = AbstractC13890nF.A01((Context) this.A01);
                int i = AbstractC75953b0.A00;
                A01 = View.MeasureSpec.makeMeasureSpec(A012, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                return Integer.valueOf(A01);
            case Process.SIGTERM /* 15 */:
                C77233d9 c77233d9 = (C77233d9) this.A01;
                return new C87143uX(c77233d9.A01, c77233d9.A02);
            case 16:
                C81323k2 c81323k2 = (C81323k2) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C87143uX(c81323k2.A07, c81323k2.A0A);
            case 18:
                return ((InterfaceC16820sZ) ((C97404Za) this.A01).A03.A01).invoke();
            case 20:
                return new C77043cq((C75563aN) ((C96464Vf) this.A01).A04.getValue());
            case 21:
                C96464Vf c96464Vf = (C96464Vf) this.A01;
                return new C75563aN(c96464Vf.A00, c96464Vf.A01.BQw(), c96464Vf.A03, false);
            case 22:
                TextView textView = ((C81373k7) this.A01).A01;
                textView.setText(textView.getResources().getString(2131965660));
                return C0eB.A00;
            case 23:
                AbstractC115715Lh.A00().A01((C75113Zb) this.A01, 4000L);
                return C0eB.A00;
            case 24:
                return new C92494Cg((UserSession) this.A01);
            case 25:
                StringBuilder sb = new StringBuilder();
                sb.append("link_type: ");
                sb.append(this.A01);
                return sb.toString();
            case 26:
                A012 = AbstractC13880nE.A07(((C84903qe) this.A01).A00);
                int i3 = AbstractC75953b0.A00;
                A01 = View.MeasureSpec.makeMeasureSpec(A012, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                return Integer.valueOf(A01);
            case 27:
                Object obj = this.A01;
                int i4 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new ANV(obj, 12));
                return ofFloat;
            case 28:
                A01 = AbstractC13890nF.A01(((C105114oR) this.A01).A00);
                return Integer.valueOf(A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C100874fz c100874fz = (C100874fz) this.A01;
                if (c100874fz.A02) {
                    final C75113Zb c75113Zb = c100874fz.A01;
                    return new InterfaceC100894g1(c75113Zb) { // from class: X.4g0
                        public final C75113Zb A00;

                        {
                            C14360o3.A0B(c75113Zb, 1);
                            this.A00 = c75113Zb;
                        }

                        @Override // X.InterfaceC100894g1
                        public final void DVr() {
                            C75113Zb.A00(this.A00, 22);
                        }

                        @Override // X.InterfaceC100894g1
                        public final void Daw() {
                            C75113Zb.A00(this.A00, 23);
                        }
                    };
                }
                return null;
            case 30:
                ((Handler) this.A01).removeCallbacksAndMessages(null);
                return C0eB.A00;
            case 31:
            case 32:
            case 34:
            default:
                return new C116785Qh((View) this.A01);
            case 33:
                View view = (View) this.A01;
                C14360o3.A0A(view);
                return new C116785Qh(view);
            case 35:
                FragmentActivity activity = ((C46u) this.A01).A01.getActivity();
                if (activity != null) {
                    return activity.getWindow();
                }
                throw new IllegalStateException("Required value was null.");
            case 36:
                context = ((C84883qc) this.A01).A00;
                A01 = AbstractC13880nE.A07(context);
                return Integer.valueOf(A01);
            case 37:
                C77133cz.A00("onUfiVisible", new DGY(this.A01, 29));
                return C0eB.A00;
            case 38:
                C65672y3 c65672y3 = (C65672y3) this.A01;
                Context context2 = c65672y3.A06;
                C61142qc c61142qc = c65672y3.A0A;
                C62862tP c62862tP = c65672y3.A08;
                InterfaceC686036x interfaceC686036x = c65672y3.A00;
                if (interfaceC686036x == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                C57332k8 c57332k8 = c65672y3.A0D;
                UserSession userSession = c65672y3.A09;
                InterfaceC60442pS interfaceC60442pS = c65672y3.A0C;
                InterfaceC63362uJ interfaceC63362uJ = c65672y3.A0B;
                C1M1 c1m1 = c65672y3.A0F;
                boolean z = c65672y3.A0R;
                boolean z2 = c65672y3.A0S;
                C65502xm c65502xm = (C65502xm) c65672y3.A0N.getValue();
                C57462kL c57462kL = (C57462kL) c65672y3.A0P.getValue();
                String str = c65672y3.A0I;
                boolean z3 = c65672y3.A0T;
                Integer num = c65672y3.A0H;
                Boolean bool = c65672y3.A0G;
                return new C691539b(context2, c62862tP, userSession, interfaceC686036x, (C691439a) c65672y3.A0O.getValue(), c61142qc, interfaceC63362uJ, interfaceC60442pS, c57332k8, c65502xm, c57462kL, c65672y3.A0E, c1m1, bool, num, str, c65672y3.A0J, z, z2, z3);
            case 39:
                return AbstractC65492xl.A00(((C65672y3) this.A01).A09);
            case 40:
                C65672y3 c65672y32 = (C65672y3) this.A01;
                return new C691439a(c65672y32.A06, c65672y32.A07, c65672y32.A09);
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC65512xn.A00(((C65672y3) this.A01).A09);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((C692339j) ((C691539b) this.A01).A0J.getValue()).A03.getValue();
            case 43:
                C38321qM c38321qM = (C38321qM) this.A01;
                C14360o3.A0B(c38321qM, 0);
                return new C9BH(c38321qM, 14);
            case 44:
                return ((C692339j) ((C691539b) this.A01).A0J.getValue()).A04.getValue();
            case 45:
                String A2u = ((C38321qM) this.A01).A2u();
                if (A2u != null) {
                    return new C206329Bp(A2u, 3);
                }
                throw new IllegalStateException("Required value was null.");
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((C38321qM) this.A01).A08;
            case 47:
                return ((C692339j) ((C691539b) this.A01).A0J.getValue()).A02.getValue();
            case 48:
                C693939z c693939z = C693839y.A02;
                C691539b c691539b = (C691539b) this.A01;
                return c693939z.A00(c691539b.A02, c691539b.A09);
            case 49:
                C691539b c691539b2 = (C691539b) this.A01;
                return new C692339j(c691539b2.A06, (C691939f) c691539b2.A0K.getValue());
        }
    }
}
