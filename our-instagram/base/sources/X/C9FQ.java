package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Arrays;

/* renamed from: X.9FQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FQ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FQ(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v92, types: [X.3cT, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C38321qM c38321qM;
        C75113Zb c75113Zb;
        C25671My A00;
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                C691539b c691539b = (C691539b) this.A03;
                C38321qM c38321qM2 = (C38321qM) this.A01;
                return c691539b.A02(c38321qM2.A1S(), c38321qM2, (C75113Zb) this.A02, c38321qM2.getId());
            case 1:
                return ((C37465Gej) ((C691939f) this.A02).A0W.getValue()).A00(((C691539b) this.A03).A03.BR7(), (C38321qM) this.A01);
            case 2:
                C76543bz c76543bz = (C76543bz) ((C691939f) this.A02).A0j.getValue();
                C38321qM c38321qM3 = (C38321qM) this.A01;
                C691539b c691539b2 = (C691539b) this.A03;
                return c76543bz.A00(c38321qM3, new C76553c0(c691539b2.A00, c691539b2.A02));
            case 3:
                return ((C77263dC) ((C691939f) this.A03).A0M.getValue()).A00((C38321qM) this.A01, (C75113Zb) this.A02);
            case 4:
                return ((JZe) ((C691939f) this.A03).A0B.getValue()).A02((C38321qM) this.A01, (C75113Zb) this.A02);
            case 5:
                return ((AB7) ((C691939f) this.A03).A07.getValue()).A00((C38321qM) this.A01, (C75113Zb) this.A02);
            case 6:
                C41744IeI c41744IeI = (C41744IeI) ((C691939f) this.A02).A0G.getValue();
                C38321qM c38321qM4 = (C38321qM) this.A01;
                C691539b c691539b3 = (C691539b) this.A03;
                return c41744IeI.A04(c38321qM4, c691539b3.A03.Aot(), new IC7(c691539b3.A00));
            case 7:
                C85033qr c85033qr = (C85033qr) this.A03;
                c38321qM = (C38321qM) this.A01;
                c75113Zb = (C75113Zb) this.A02;
                A00 = AbstractC25651Mw.A00(c85033qr.A00);
                z = false;
                z2 = false;
                A00.E4s(new C72353Mi(c38321qM, c75113Zb, z, z2));
                return C0eB.A00;
            case 8:
                A00 = AbstractC25651Mw.A00(((C85033qr) this.A03).A00);
                c38321qM = (C38321qM) this.A01;
                c75113Zb = (C75113Zb) this.A02;
                z = false;
                z2 = true;
                A00.E4s(new C72353Mi(c38321qM, c75113Zb, z, z2));
                return C0eB.A00;
            case 9:
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A02;
                AnonymousClass398 anonymousClass398 = (AnonymousClass398) this.A03;
                return new C66712zo(context, anonymousClass398.A00, anonymousClass398.A01, userSession);
            case 10:
                return new C2S((Context) this.A01, ((AnonymousClass398) this.A03).A00, (UserSession) this.A02);
            case 11:
                return new C37504GfM((Context) this.A01, (UserSession) this.A03, ((InterfaceC688137s) this.A02).ApE());
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C25342BJl((Context) this.A01, ((AnonymousClass398) this.A03).A04, (UserSession) this.A02);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C4FY((Activity) this.A02, (C2d4) this.A01, (UserSession) this.A03);
            case 14:
                return new C2Q((Context) this.A01, ((AnonymousClass398) this.A03).A00, (UserSession) this.A02);
            case Process.SIGTERM /* 15 */:
                AnonymousClass398 anonymousClass3982 = (AnonymousClass398) this.A03;
                return new C2T((Context) this.A01, anonymousClass3982.A00, (UserSession) this.A02, anonymousClass3982.A04);
            case 16:
                Context context2 = (Context) this.A01;
                UserSession userSession2 = (UserSession) this.A02;
                InterfaceC60442pS interfaceC60442pS = ((AnonymousClass398) this.A03).A04;
                C14360o3.A0B(context2, 0);
                C14360o3.A0B(userSession2, 1);
                return new A8L(context2, interfaceC60442pS, userSession2);
            case 17:
                return new C105114oR((Context) this.A01, ((AnonymousClass398) this.A03).A00, (UserSession) this.A02);
            case 18:
                return new C37516GfY((Context) this.A01, ((InterfaceC686036x) this.A02).Abd(), (UserSession) this.A03);
            case Process.SIGSTOP /* 19 */:
                ((InterfaceC80023hr) this.A01).D3o((C38321qM) this.A02, (C75113Zb) this.A03);
                return C0eB.A00;
            case 20:
                ((InterfaceC80023hr) this.A01).DOZ((C38321qM) this.A02, (C75113Zb) this.A03);
                return C0eB.A00;
            case 21:
                return Boolean.valueOf(C76183bN.A00(((C76173bM) this.A03).A00, (C38321qM) this.A02, ((InterfaceC11380iw) this.A01).getModuleName()));
            case 22:
                ((IgProgressImageView) this.A01).setUrl(((C80143i3) this.A03).A02, (InterfaceC11380iw) this.A02);
                return C0eB.A00;
            case 23:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C692439k c692439k = (C692439k) this.A03;
                return Integer.valueOf(((C96464Vf) c692439k.A05.A0L.getValue()).A00((C38321qM) this.A01, c692439k.A06, (C75113Zb) this.A02));
            case 24:
            case 47:
                C692439k c692439k2 = (C692439k) this.A03;
                A90 a90 = (A90) c692439k2.A05.A0F.getValue();
                Context context3 = c692439k2.A00;
                C38321qM c38321qM5 = (C38321qM) this.A01;
                C75113Zb c75113Zb2 = (C75113Zb) this.A02;
                InterfaceC60442pS interfaceC60442pS2 = c692439k2.A06;
                C14360o3.A0B(c38321qM5, 1);
                C14360o3.A0B(c75113Zb2, 2);
                C75633aU c75633aU = a90.A02;
                UserSession userSession3 = a90.A00;
                return Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(c75633aU.A00(userSession3, c38321qM5, c75113Zb2)), Integer.valueOf(AbstractC76153bK.A00(userSession3, c38321qM5, interfaceC60442pS2, c75113Zb2)), Integer.valueOf(a90.A01.A00(context3, c38321qM5, c75113Zb2))}));
            case 25:
                C692439k c692439k3 = (C692439k) this.A03;
                C691939f c691939f = c692439k3.A05;
                C96464Vf c96464Vf = (C96464Vf) c691939f.A0L.getValue();
                Context context4 = c692439k3.A00;
                C38321qM c38321qM6 = (C38321qM) this.A01;
                C75113Zb c75113Zb3 = (C75113Zb) this.A02;
                InterfaceC60442pS interfaceC60442pS3 = c692439k3.A06;
                return c691939f.A01().A05(context4, c38321qM6, interfaceC60442pS3, c96464Vf.A02(context4, c38321qM6, interfaceC60442pS3, c75113Zb3, ((C97354Yu) c692439k3.A07.A0Y.getValue()).A02), c75113Zb3, c692439k3.A0B, true);
            case 26:
            case 49:
                C692439k c692439k4 = (C692439k) this.A03;
                return Integer.valueOf(((C75633aU) c692439k4.A05.A0E.getValue()).A00(c692439k4.A02, (C38321qM) this.A01, (C75113Zb) this.A02));
            case 27:
                C692439k c692439k5 = (C692439k) this.A03;
                return Integer.valueOf(((C89323yY) c692439k5.A05.A0D.getValue()).A00(c692439k5.A00, (C38321qM) this.A01, (C75113Zb) this.A02));
            case 28:
                C692439k c692439k6 = (C692439k) this.A03;
                C89323yY c89323yY = (C89323yY) c692439k6.A05.A0D.getValue();
                C38321qM c38321qM7 = (C38321qM) this.A01;
                C75113Zb c75113Zb4 = (C75113Zb) this.A02;
                InterfaceC60442pS interfaceC60442pS4 = c692439k6.A06;
                return c89323yY.A01(c692439k6.A00, c38321qM7, interfaceC60442pS4, c75113Zb4, c692439k6.A09, c692439k6.A0E);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C692439k c692439k7 = (C692439k) this.A03;
                C77133cz A002 = c692439k7.A05.A00();
                Context context5 = c692439k7.A00;
                C38321qM c38321qM8 = (C38321qM) this.A01;
                C75113Zb c75113Zb5 = (C75113Zb) this.A02;
                return A002.A02(context5, new C84953qj(context5), c38321qM8, c692439k7.A06, c75113Zb5);
            case 30:
            case 39:
                C692439k c692439k8 = (C692439k) this.A03;
                return ((C5LQ) c692439k8.A05.A0S.getValue()).A00(new Object(), (C38321qM) this.A01, c692439k8.A06, (C75113Zb) this.A02);
            case 31:
                ((C692439k) this.A03).A05.A0e.getValue();
                return Integer.valueOf(C76953ch.A00((C38321qM) this.A01, (C75113Zb) this.A02));
            case 32:
                C692439k c692439k9 = (C692439k) this.A03;
                return ((C76953ch) c692439k9.A05.A0e.getValue()).A01((C38321qM) this.A01, c692439k9.A06, (C75113Zb) this.A02);
            case 33:
            case 36:
            case 40:
            case 43:
            default:
                C692439k c692439k10 = (C692439k) this.A03;
                return Integer.valueOf(c692439k10.A05.A01().A02(c692439k10.A02, (C38321qM) this.A01, (C75113Zb) this.A02));
            case 34:
                ((C692439k) this.A03).A05.A0h.getValue();
                return Integer.valueOf(C3z2.A00((C38321qM) this.A01, (C75113Zb) this.A02));
            case 35:
                C692439k c692439k11 = (C692439k) this.A03;
                return ((C3z2) c692439k11.A05.A0h.getValue()).A01((C38321qM) this.A01, c692439k11.A06, (C75113Zb) this.A02);
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
                C692439k c692439k12 = (C692439k) this.A03;
                C75563aN A01 = c692439k12.A05.A01();
                C38321qM c38321qM9 = (C38321qM) this.A01;
                C75113Zb c75113Zb6 = (C75113Zb) this.A02;
                return A01.A04(c692439k12.A00, c38321qM9, c692439k12.A06, (C76293bZ) c692439k12.A0D.invoke(c38321qM9, c75113Zb6), c75113Zb6, c692439k12.A0B);
            case 38:
            case 45:
                C38321qM c38321qM10 = (C38321qM) this.A01;
                C75113Zb c75113Zb7 = (C75113Zb) this.A02;
                C692439k c692439k13 = (C692439k) this.A03;
                return Integer.valueOf(AbstractC76153bK.A00(c692439k13.A02, c38321qM10, c692439k13.A06, c75113Zb7));
            case 44:
                C692439k c692439k14 = (C692439k) this.A03;
                C96464Vf c96464Vf2 = (C96464Vf) c692439k14.A05.A0L.getValue();
                C38321qM c38321qM11 = (C38321qM) this.A01;
                C75113Zb c75113Zb8 = (C75113Zb) this.A02;
                return c96464Vf2.A01(c692439k14.A00, c38321qM11, c692439k14.A06, c75113Zb8, c692439k14.A08);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C692439k c692439k15 = (C692439k) this.A03;
                return ((C79293ga) c692439k15.A05.A0b.getValue()).A00(c692439k15.A00, (C38321qM) this.A01, c692439k15.A06, (C75113Zb) this.A02, c692439k15.A08);
            case 48:
                C692439k c692439k16 = (C692439k) this.A03;
                A90 a902 = (A90) c692439k16.A05.A0F.getValue();
                C38321qM c38321qM12 = (C38321qM) this.A01;
                C75113Zb c75113Zb9 = (C75113Zb) this.A02;
                C76293bZ c76293bZ = (C76293bZ) c692439k16.A0D.invoke(c38321qM12, c75113Zb9);
                C33P c33p = c692439k16.A08;
                Context context6 = c692439k16.A00;
                InterfaceC60442pS interfaceC60442pS5 = c692439k16.A06;
                Integer num = c692439k16.A0A;
                C65682y4 c65682y4 = c692439k16.A03;
                C19260xA c19260xA = c692439k16.A01;
                String str = c692439k16.A0B;
                boolean z3 = c692439k16.A0E;
                C1M1 c1m1 = c692439k16.A09;
                AbstractC167027dH.A12(c38321qM12, c75113Zb9, c76293bZ);
                return new C51760Mtj(39, a902.A01.A01(context6, c38321qM12, interfaceC60442pS5, c75113Zb9, c1m1, z3), a902.A02.A01(context6, c19260xA, c65682y4, c38321qM12, interfaceC60442pS5, c76293bZ, c75113Zb9, num, str), a902.A03.A00(context6, c38321qM12, interfaceC60442pS5, c75113Zb9, c33p));
        }
    }
}
