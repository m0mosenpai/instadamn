package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9E5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9E5 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9E5(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
            case 3:
            case Process.SIGSTOP /* 19 */:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 1:
            case 4:
            case 20:
            default:
                return ((InterfaceC018407e) ((InterfaceC09390do) this.A01).getValue()).getViewModelStore();
            case 2:
            case 18:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return this.A01;
            case 5:
                return C70013Cl.A00((UserSession) this.A01);
            case 6:
                return ((C64622wL) this.A01).A02.A0J();
            case 7:
                C64622wL c64622wL = (C64622wL) this.A01;
                return new C34949FaZ(c64622wL.A01.A00, AbstractC60942qI.A00, c64622wL.A00);
            case 8:
                C3CC c3cc = (C3CC) this.A01;
                return C3MI.A00(c3cc.A02.requireContext(), c3cc.A01);
            case 9:
                return Integer.valueOf(((C61222qk) this.A01).A0J().getItemCount());
            case 10:
            case 14:
                ((C61222qk) this.A01).A22.A0G();
                break;
            case 11:
            case Process.SIGTERM /* 15 */:
                ((C61222qk) this.A01).A22.A0F();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C61222qk c61222qk = (C61222qk) this.A01;
                C60662pp c60662pp = c61222qk.A22;
                InterfaceC53892dT A07 = c60662pp.A07();
                UserSession userSession = c61222qk.A1u;
                C06090Tz c06090Tz = C06090Tz.A06;
                InterfaceC53772dG interfaceC53772dG = null;
                if (C18U.A06(c06090Tz, userSession, 36311560486191708L) && C18U.A06(c06090Tz, userSession, 36311560487240300L)) {
                    C1UC requireActivity = c60662pp.requireActivity();
                    if (requireActivity instanceof InterfaceC53772dG) {
                        interfaceC53772dG = (InterfaceC53772dG) requireActivity;
                    }
                }
                return new C61572rK(interfaceC53772dG, A07);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return Boolean.valueOf(((C61222qk) this.A01).A22.A0O);
            case 16:
                return new C31214Dnx((C3CX) this.A01);
            case 17:
                C3CX c3cx = (C3CX) this.A01;
                return new C215729go(c3cx.A02.requireActivity(), c3cx.A04);
            case 21:
                Context context = ((C143316dW) this.A01).A0W;
                Drawable drawable = context.getDrawable(R.drawable.green_dot);
                if (drawable != null) {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    return drawable;
                }
                throw new IllegalStateException("Required value was null.");
            case 22:
                return OQ9.A01(((C146836jL) this.A01).A07, null);
            case 23:
                ((C145176gc) this.A01).A18.EJz();
                break;
            case 24:
                ((C145406gz) this.A01).A0B.EJJ();
                break;
            case 25:
                UserSession userSession2 = ((C145356gu) this.A01).A01;
                if (userSession2 == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession2, 36322285019211882L));
            case 26:
                Object systemService = ((C149226nW) this.A01).A05.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                C14360o3.A0C(systemService, MSV.A00(7));
                return systemService;
            case 27:
                C147596kk c147596kk = (C147596kk) this.A01;
                return new LEX(c147596kk.A01, c147596kk.A02);
            case 28:
                Context context2 = (Context) this.A01;
                boolean A02 = AbstractC13620mo.A02(context2);
                int i = R.drawable.instagram_chevron_right_pano_outline_12;
                if (A02) {
                    i = R.drawable.instagram_chevron_left_outline_12;
                }
                Drawable drawable2 = context2.getDrawable(i);
                C14360o3.A0A(drawable2);
                Drawable mutate = drawable2.mutate();
                mutate.setColorFilter(context2.getColor(R.color.audio_bar_action_color_enabled), PorterDuff.Mode.SRC_IN);
                return mutate;
        }
        return C0eB.A00;
    }
}
