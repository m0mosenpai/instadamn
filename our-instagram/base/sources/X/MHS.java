package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MHS extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHS(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static MHS A00(Object obj, int i) {
        return new MHS(obj, i);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        float A04;
        String string;
        ImageView imageView;
        switch (this.A00) {
            case 0:
                return new C35999Fux((UserSession) this.A01);
            case 1:
                return new LE0((UserSession) this.A01);
            case 2:
                return new C43797JYk((UserSession) this.A01);
            case 3:
                return new C47301KvC((UserSession) this.A01);
            case 4:
                return new LXX((UserSession) this.A01);
            case 5:
                return new C48255LXe((UserSession) this.A01);
            case 6:
                return new C48256LXf((UserSession) this.A01);
            case 7:
                return new JV0((UserSession) this.A01);
            case 8:
                return new C27I((UserSession) this.A01);
            case 9:
                return new C27J((UserSession) this.A01);
            case 10:
                return new C27L((UserSession) this.A01);
            case 11:
                return new LX6((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((InterfaceC16660sJ) this.A01).invoke(null);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new JV6((UserSession) this.A01);
            case 14:
                return new L9R((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                return new C47743L6k((UserSession) this.A01);
            case 16:
                return new C7N2((UserSession) this.A01);
            case 17:
                return new C48517LdF((UserSession) this.A01);
            case 18:
                C48517LdF c48517LdF = (C48517LdF) this.A01;
                LJJ ljj = C48517LdF.A08;
                return new K57(c48517LdF.A03.getParentFile().getCanonicalPath());
            case Process.SIGSTOP /* 19 */:
                return new LKn((UserSession) this.A01);
            case 20:
                return C2JD.A00(((C47547KzH) this.A01).A00);
            case 21:
                return new C48516LdE((UserSession) this.A01);
            case 22:
                return AbstractC25651Mw.A00(((C48516LdE) this.A01).A00);
            case 23:
                C48516LdE c48516LdE = (C48516LdE) this.A01;
                if (AbstractC166987dD.A0y().A0c()) {
                    UserSession userSession = c48516LdE.A00;
                    return userSession.A01(L1A.class, A00(userSession, 26));
                }
                return null;
            case 24:
                return AbstractC28761aE.A00(((C48516LdE) this.A01).A00);
            case 25:
                return AbstractC23021Ah.A00(((C48516LdE) this.A01).A00);
            case 26:
                return new L1A();
            case 27:
                return AbstractC25230BEn.A0l(((C26856BtI) this.A01).A00);
            case 28:
                UserSession userSession2 = (UserSession) this.A01;
                C48521LdJ c48521LdJ = new C48521LdJ(userSession2);
                C6Ek.A00(userSession2).A02.add(c48521LdJ);
                return c48521LdJ;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new JV9((UserSession) this.A01);
            case 30:
                return new C47769L7q((UserSession) this.A01);
            case 31:
                return new L67(AbstractC43592JPx.A0N());
            case 32:
                C31699Dw4 c31699Dw4 = new C31699Dw4();
                Context context = ((EQ6) this.A01).A02;
                String string2 = context.getString(2131973064);
                int A03 = AbstractC31174DnI.A03(context);
                c31699Dw4.A01 = string2;
                c31699Dw4.A00 = A03;
                return c31699Dw4;
            case 33:
                return ((EEG) this.A01).A08.invoke();
            case 34:
                return new C36000Fuy(AbstractC166987dD.A0r(((AbstractC32247EIg) this.A01).A0E));
            case 35:
                try {
                    A04 = ((C45678KJp) this.A01).A00.getResources().getDimension(R.dimen.avatar_powerups_avatar_height);
                } catch (Resources.NotFoundException unused) {
                    A04 = AbstractC13880nE.A04(((C45678KJp) this.A01).A00, 130);
                }
                return Integer.valueOf((int) A04);
            case 36:
                View view = ((C47701L4i) this.A01).A01;
                if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
                    imageView.setImageDrawable(null);
                    break;
                }
                break;
            case 37:
                return new L7A(C006802i.A0p, (UserSession) this.A01);
            case 38:
                LES les = (LES) this.A01;
                les.A00 = null;
                LES.A00(les);
                break;
            case 39:
                return new C7UY(C006802i.A0p, (UserSession) this.A01);
            case 40:
                return new C77A((UserSession) this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                return new C77B((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C77H((C77G) this.A01);
            case 43:
                C09Y c09y = C023409i.A0A;
                Bundle A0A = AbstractC31173DnH.A0A((Activity) this.A01);
                if (A0A != null) {
                    return c09y.A06(A0A);
                }
                throw AbstractC166997dE.A0g();
            case 44:
                return ((EI1) this.A01).A00.invoke();
            case 45:
                AbstractC12990ll A0M = AbstractC31178DnM.A0M(((EI1) this.A01).A04);
                return A0M.A01(C77A.class, A00(A0M, 40));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((EI1) this.A01).A01.invoke();
            case 47:
                return new FFB(AbstractC12220kQ.A02(AbstractC166987dD.A0o(((EI1) this.A01).A04)));
            case 48:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null && (string = bundle.getString("arg_sticker_preview_url")) != null) {
                    return AbstractC25225BEi.A0t(string);
                }
                return null;
            default:
                UserSession userSession3 = (UserSession) this.A01;
                return new L2Z(AbstractC12220kQ.A02(userSession3), userSession3);
        }
        return C0eB.A00;
    }
}
