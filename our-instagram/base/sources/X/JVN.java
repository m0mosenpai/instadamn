package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Map;

/* loaded from: classes8.dex */
public final class JVN extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    public static C160667Ia A01(Object obj, JVN jvn) {
        C14360o3.A0B(obj, 0);
        return (C160667Ia) jvn.A01;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVN(C160667Ia c160667Ia, int i) {
        super(1);
        this.A00 = i;
        this.A01 = c160667Ia;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C79S A00;
        AbstractC66422zJ A0L;
        LayoutInflater layoutInflater;
        C7IM A0T;
        UserSession userSession;
        C1584879i c1584879i;
        ViewGroup viewGroup = (ViewGroup) obj;
        switch (this.A00) {
            case 0:
                C160667Ia A01 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A01);
                A0L = JQ0.A0L(C160667Ia.A02(A01).A2t);
                layoutInflater = A01.A02.A00;
                A0T = JQ0.A0T(A01, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass795 = A00.A01;
                Lk2 lk2 = new Lk2();
                C76N A0R = JQ0.A0R(anonymousClass795);
                c1584879i = new C1584879i(anonymousClass795.A07, new LiZ(anonymousClass795), A0R, lk2);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 1:
                C160667Ia A012 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A012);
                A0L = JQ0.A0L(C160667Ia.A02(A012).A2s);
                layoutInflater = A012.A02.A00;
                A0T = JQ0.A0T(A012, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7952 = A00.A01;
                LkD lkD = new LkD();
                C76N A0R2 = JQ0.A0R(anonymousClass7952);
                c1584879i = new C1584879i(anonymousClass7952.A07, new C48832Lig(anonymousClass7952), A0R2, lkD);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 2:
                C160667Ia A013 = A01(viewGroup, this);
                UserSession userSession2 = A013.A07;
                KSY ksy = (KSY) C160667Ia.A02(A013).A1h.getValue();
                C7ZX c7zx = A013.A0C;
                LayoutInflater layoutInflater2 = A013.A02.A00;
                AnonymousClass988 anonymousClass988 = A013.A03;
                C7IM c7im = A013.A04;
                C98K c98k = A013.A0A;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new KRZ(userSession2, c98k, ksy.createViewHolder(layoutInflater2, viewGroup), c7zx, anonymousClass988, ksy, c7im);
            case 3:
                C160667Ia A014 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A014);
                A0L = JQ0.A0L(C160667Ia.A02(A014).A2r);
                layoutInflater = A014.A02.A00;
                A0T = JQ0.A0T(A014, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A10();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 4:
                C160667Ia A015 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A015);
                A0L = JQ0.A0L(C160667Ia.A02(A015).A2y);
                layoutInflater = A015.A02.A00;
                A0T = JQ0.A0T(A015, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A12();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 5:
                C160667Ia A016 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A016);
                A0L = JQ0.A0L(C160667Ia.A02(A016).A2w);
                layoutInflater = A016.A02.A00;
                A0T = JQ0.A0T(A016, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A11();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 6:
                C160667Ia A017 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A017);
                A0L = JQ0.A0L(C160667Ia.A02(A017).A2x);
                layoutInflater = A017.A02.A00;
                A0T = JQ0.A0T(A017, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7953 = A00.A01;
                C48907Ljy c48907Ljy = new C48907Ljy();
                C76N A0R3 = JQ0.A0R(anonymousClass7953);
                c1584879i = new C1584879i(anonymousClass7953.A07, new C48825LiY(anonymousClass7953), A0R3, c48907Ljy);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 7:
                C160667Ia A018 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A018);
                A0L = JQ0.A0L(C160667Ia.A02(A018).A1M);
                layoutInflater = A018.A02.A00;
                A0T = JQ0.A0T(A018, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0c();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 8:
                C160667Ia A019 = A01(viewGroup, this);
                C79S A002 = C160667Ia.A00(A019);
                AbstractC66422zJ A0L2 = JQ0.A0L(C160667Ia.A02(A019).A2F);
                LayoutInflater layoutInflater3 = A019.A02.A00;
                C7IM A0T2 = JQ0.A0T(A019, A0L2);
                AnonymousClass795 anonymousClass7954 = A002.A01;
                C48952Lky c48952Lky = new C48952Lky(0);
                C79L c79l = new C79L() { // from class: X.LjG
                    @Override // X.C79L
                    public final CharSequence AXg(Context context, UserSession userSession3, AnonymousClass988 anonymousClass9882, C160787Im c160787Im, C18A c18a) {
                        return AnonymousClass795.A0H(userSession3, c160787Im);
                    }
                };
                return C1584979j.A00(layoutInflater3, viewGroup, A0L2, A002.A00, new C1584879i(new C48804LiC(anonymousClass7954, 0), new C48862LjE(anonymousClass7954, 0), c79l, c48952Lky), A002.A02, A002.A03, A0T2);
            case 9:
                C160667Ia A0110 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0110);
                A0L = JQ0.A0L(C160667Ia.A02(A0110).A1L);
                layoutInflater = A0110.A02.A00;
                A0T = JQ0.A0T(A0110, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0b();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 10:
                C160667Ia A0111 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0111);
                A0L = JQ0.A0L(C160667Ia.A02(A0111).A1P);
                layoutInflater = A0111.A02.A00;
                A0T = JQ0.A0T(A0111, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0f();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 11:
                C160667Ia A0112 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0112);
                A0L = JQ0.A0L(C160667Ia.A02(A0112).A1N);
                layoutInflater = A0112.A02.A00;
                A0T = JQ0.A0T(A0112, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0d();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C160667Ia A0113 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0113);
                A0L = JQ0.A0L(C160667Ia.A02(A0113).A1O);
                layoutInflater = A0113.A02.A00;
                A0T = JQ0.A0T(A0113, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0e();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia = (C160667Ia) this.A01;
                UserSession userSession3 = c160667Ia.A07;
                KSF ksf = (KSF) C160667Ia.A02(c160667Ia).A0N.getValue();
                C7ZX c7zx2 = c160667Ia.A0C;
                LayoutInflater layoutInflater4 = c160667Ia.A02.A00;
                return new KRK(userSession3, ksf, c160667Ia.A0A, JQ0.A0S(layoutInflater4, viewGroup, ksf), c7zx2, c160667Ia.A03, c160667Ia.A04);
            case 14:
                C160667Ia A0114 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0114);
                A0L = JQ0.A0L(C160667Ia.A02(A0114).A1K);
                layoutInflater = A0114.A02.A00;
                A0T = JQ0.A0T(A0114, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0a();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case Process.SIGTERM /* 15 */:
                C160667Ia A0115 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0115);
                A0L = JQ0.A0L(C160667Ia.A02(A0115).A1J);
                layoutInflater = A0115.A02.A00;
                A0T = JQ0.A0T(A0115, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0Z();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 16:
                C160667Ia A0116 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0116);
                A0L = JQ0.A0L(C160667Ia.A02(A0116).A2e);
                layoutInflater = A0116.A02.A00;
                A0T = JQ0.A0T(A0116, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0p();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 17:
                C160667Ia A0117 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0117);
                A0L = JQ0.A0L(C160667Ia.A02(A0117).A2c);
                layoutInflater = A0117.A02.A00;
                A0T = JQ0.A0T(A0117, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0o();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 18:
                C160667Ia A0118 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0118);
                A0L = JQ0.A0L(C160667Ia.A02(A0118).A2h);
                layoutInflater = A0118.A02.A00;
                A0T = JQ0.A0T(A0118, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0s();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case Process.SIGSTOP /* 19 */:
                C160667Ia A0119 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0119);
                A0L = JQ0.A0L(C160667Ia.A02(A0119).A2b);
                layoutInflater = A0119.A02.A00;
                A0T = JQ0.A0T(A0119, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0n();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 20:
                C160667Ia A0120 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0120);
                A0L = JQ0.A0L(C160667Ia.A02(A0120).A2a);
                layoutInflater = A0120.A02.A00;
                A0T = JQ0.A0T(A0120, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0m();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 21:
                C160667Ia A0121 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0121);
                A0L = JQ0.A0L(C160667Ia.A02(A0121).A2m);
                layoutInflater = A0121.A02.A00;
                A0T = JQ0.A0T(A0121, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0w();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 22:
                C160667Ia A0122 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0122);
                A0L = JQ0.A0L(C160667Ia.A02(A0122).A2l);
                layoutInflater = A0122.A02.A00;
                A0T = JQ0.A0T(A0122, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0v();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 23:
                C160667Ia A0123 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0123);
                A0L = JQ0.A0L(C160667Ia.A02(A0123).A2p);
                layoutInflater = A0123.A02.A00;
                A0T = JQ0.A0T(A0123, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0z();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 24:
                C14360o3.A0B(viewGroup, 0);
                C43700JUl c43700JUl = C43702JUn.A05;
                C160667Ia c160667Ia2 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater5 = c160667Ia2.A02.A00;
                C7A5 c7a5 = (C7A5) C160667Ia.A02(c160667Ia2).A1I.getValue();
                C7ZX c7zx3 = c160667Ia2.A0C;
                return new C43702JUn(layoutInflater5, viewGroup, c160667Ia2.A07, c7zx3, c160667Ia2.A03, c7a5, c160667Ia2.A04);
            case 25:
                C160667Ia A0124 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0124);
                A0L = JQ0.A0L(C160667Ia.A02(A0124).A2k);
                layoutInflater = A0124.A02.A00;
                A0T = JQ0.A0T(A0124, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0u();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 26:
                C160667Ia A0125 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0125);
                A0L = JQ0.A0L(C160667Ia.A02(A0125).A2j);
                layoutInflater = A0125.A02.A00;
                A0T = JQ0.A0T(A0125, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0t();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 27:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia3 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater6 = c160667Ia3.A02.A00;
                C219959nh c219959nh = (C219959nh) C160667Ia.A02(c160667Ia3).A1Y.getValue();
                C7ZX c7zx4 = c160667Ia3.A0C;
                UserSession userSession4 = c160667Ia3.A07;
                C7IM c7im2 = c160667Ia3.A04;
                return new KRY(layoutInflater6, viewGroup, userSession4, c160667Ia3.A0A, c7zx4, c160667Ia3.A03, c219959nh, c7im2);
            case 28:
                boolean A1Y = AbstractC43592JPx.A1Y(viewGroup);
                C160667Ia c160667Ia4 = (C160667Ia) this.A01;
                AbstractC66422zJ A0L3 = JQ0.A0L(C160667Ia.A02(c160667Ia4).A1W);
                LayoutInflater layoutInflater7 = c160667Ia4.A02.A00;
                C14360o3.A0B(A0L3, A1Y ? 1 : 0);
                return new AbstractC161677Mc(new C44633Jpd(AbstractC31173DnH.A0C(layoutInflater7, viewGroup, R.layout.thread_message_action_log, A1Y)), A0L3);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C160667Ia A0126 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0126);
                A0L = JQ0.A0L(C160667Ia.A02(A0126).A2n);
                layoutInflater = A0126.A02.A00;
                A0T = JQ0.A0T(A0126, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0x();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 30:
                C160667Ia A0127 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0127);
                A0L = JQ0.A0L(C160667Ia.A02(A0127).A2o);
                layoutInflater = A0127.A02.A00;
                A0T = JQ0.A0T(A0127, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0y();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 31:
                C160667Ia A0128 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0128);
                A0L = JQ0.A0L(C160667Ia.A02(A0128).A2g);
                layoutInflater = A0128.A02.A00;
                A0T = JQ0.A0T(A0128, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0r();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 32:
                C160667Ia A0129 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0129);
                A0L = JQ0.A0L(C160667Ia.A02(A0129).A2f);
                layoutInflater = A0129.A02.A00;
                A0T = JQ0.A0T(A0129, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0q();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 33:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia5 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater8 = c160667Ia5.A02.A00;
                C45882KSl c45882KSl = (C45882KSl) C160667Ia.A02(c160667Ia5).A0O.getValue();
                C7ZX c7zx5 = c160667Ia5.A0C;
                UserSession userSession5 = c160667Ia5.A07;
                C7IM c7im3 = c160667Ia5.A04;
                return new C45852KRh(layoutInflater8, viewGroup, C62862tP.A03(c160667Ia5.A06, userSession5, null), userSession5, c45882KSl, c7zx5, c160667Ia5.A03, c7im3);
            case 34:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia6 = (C160667Ia) this.A01;
                C7TF c7tf = (C7TF) C160667Ia.A02(c160667Ia6).A17.getValue();
                LayoutInflater layoutInflater9 = c160667Ia6.A02.A00;
                C14360o3.A0B(c7tf, 1);
                return new AbstractC161677Mc(c7tf.createViewHolder(layoutInflater9, viewGroup), c7tf);
            case 35:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia7 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater10 = c160667Ia7.A02.A00;
                KSR ksr = (KSR) C160667Ia.A02(c160667Ia7).A1E.getValue();
                C7ZX c7zx6 = c160667Ia7.A0C;
                return new KRV(layoutInflater10, viewGroup, c160667Ia7.A07, c7zx6, c160667Ia7.A03, ksr, c160667Ia7.A04, c160667Ia7.A08.A00);
            case 36:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia8 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater11 = c160667Ia8.A02.A00;
                C45886KSp c45886KSp = (C45886KSp) C160667Ia.A02(c160667Ia8).A0k.getValue();
                C7ZX c7zx7 = c160667Ia8.A0C;
                return new C45861KRq(layoutInflater11, viewGroup, c160667Ia8.A07, c7zx7, c160667Ia8.A03, c45886KSp, c160667Ia8.A04);
            case 37:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia9 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater12 = c160667Ia9.A02.A00;
                C45872KSb c45872KSb = (C45872KSb) C160667Ia.A02(c160667Ia9).A0R.getValue();
                C7ZX c7zx8 = c160667Ia9.A0C;
                return new KRM(layoutInflater12, viewGroup, c160667Ia9.A07, c7zx8, c160667Ia9.A03, c45872KSb, c160667Ia9.A04);
            case 38:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia10 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater13 = c160667Ia10.A02.A00;
                C45878KSh c45878KSh = (C45878KSh) C160667Ia.A02(c160667Ia10).A2W.getValue();
                C7ZX c7zx9 = c160667Ia10.A0C;
                return new C45850KRf(layoutInflater13, viewGroup, c160667Ia10.A07, c7zx9, c160667Ia10.A03, c160667Ia10.A04, c45878KSh);
            case 39:
                C160667Ia A0130 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0130);
                A0L = JQ0.A0L(C160667Ia.A02(A0130).A2D);
                layoutInflater = A0130.A02.A00;
                A0T = JQ0.A0T(A0130, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7955 = A00.A01;
                C48902Ljt c48902Ljt = new C48902Ljt();
                C76N A0R4 = JQ0.A0R(anonymousClass7955);
                c1584879i = new C1584879i(anonymousClass7955.A03, new C48820LiS(anonymousClass7955), A0R4, c48902Ljt);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 40:
                boolean A1Y2 = AbstractC43592JPx.A1Y(viewGroup);
                C160667Ia c160667Ia11 = (C160667Ia) this.A01;
                C7TE c7te = (C7TE) C160667Ia.A02(c160667Ia11).A1X.getValue();
                LayoutInflater layoutInflater14 = c160667Ia11.A02.A00;
                C14360o3.A0B(c7te, A1Y2 ? 1 : 0);
                return new AbstractC161677Mc(c7te.createViewHolder(layoutInflater14, viewGroup), c7te);
            case Seq.NULL_REFNUM /* 41 */:
                JQ0.A1M(viewGroup);
                C160667Ia c160667Ia12 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater15 = c160667Ia12.A02.A00;
                KSV ksv = (KSV) C160667Ia.A02(c160667Ia12).A1T.getValue();
                C7ZX c7zx10 = c160667Ia12.A0C;
                return new KRX(layoutInflater15, viewGroup, c160667Ia12.A07, c7zx10, c160667Ia12.A03, ksv, c160667Ia12.A04);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C160667Ia A0131 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0131);
                A0L = JQ0.A0L(C160667Ia.A02(A0131).A25);
                layoutInflater = A0131.A02.A00;
                A0T = JQ0.A0T(A0131, A0L);
                userSession = A00.A00;
                c1584879i = A00.A01.A0g();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 43:
                C160667Ia A0132 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0132);
                A0L = (AbstractC66422zJ) C160667Ia.A02(A0132).A1F.getValue();
                layoutInflater = A0132.A02.A00;
                Map map = A0132.A08.A00;
                A0T = A0132.A04;
                AbstractC167007dF.A1E(A0L, 0, map);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7956 = A00.A01;
                C48922LkR c48922LkR = new C48922LkR();
                C48870LjM c48870LjM = new C48870LjM();
                c1584879i = new C1584879i(new C48797Li4(anonymousClass7956), new C48840Lio(map), c48870LjM, c48922LkR);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 44:
                C160667Ia A0133 = A01(viewGroup, this);
                return A00(A0133.A02.A00, viewGroup, A0133, C160667Ia.A02(A0133).A1e);
            case 45:
                C160667Ia A0134 = A01(viewGroup, this);
                return A00(A0134.A02.A00, viewGroup, A0134, C160667Ia.A02(A0134).A1A);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C161817Mq c161817Mq = (C161817Mq) C160667Ia.A02(A01(viewGroup, this)).A1G.getValue();
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new AbstractC161677Mc(c161817Mq.A00(viewGroup), c161817Mq);
            case 47:
                C160667Ia A0135 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0135);
                A0L = JQ0.A0L(C160667Ia.A02(A0135).A1q);
                layoutInflater = A0135.A02.A00;
                A0T = JQ0.A0T(A0135, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7957 = A00.A01;
                C48914LkH c48914LkH = new C48914LkH();
                C79L c79l2 = anonymousClass7957.A0B;
                c1584879i = new C1584879i(new C48796Li3(anonymousClass7957), new C48806LiE(), c79l2, c48914LkH);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            case 48:
                C160667Ia A0136 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0136);
                A0L = JQ0.A0L(C160667Ia.A02(A0136).A1f);
                layoutInflater = A0136.A02.A00;
                A0T = JQ0.A0T(A0136, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7958 = A00.A01;
                LkG lkG = new LkG();
                C48869LjL c48869LjL = new C48869LjL();
                c1584879i = new C1584879i(new C48794Li1(anonymousClass7958), new C48805LiD(), c48869LjL, lkG);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
            default:
                C160667Ia A0137 = A01(viewGroup, this);
                A00 = C160667Ia.A00(A0137);
                A0L = (AbstractC66422zJ) C160667Ia.A02(A0137).A1D.getValue();
                layoutInflater = A0137.A02.A00;
                Map map2 = A0137.A08.A00;
                A0T = A0137.A04;
                AbstractC167007dF.A1E(A0L, 0, map2);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7959 = A00.A01;
                C48905Ljw c48905Ljw = new C48905Ljw();
                C48866LjI c48866LjI = new C48866LjI();
                c1584879i = new C1584879i(new C48791Lhy(anonymousClass7959), new C48824LiW(map2), c48866LjI, c48905Ljw);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, c1584879i, A00.A02, A00.A03, A0T);
        }
    }

    public static AnonymousClass768 A00(LayoutInflater layoutInflater, ViewGroup viewGroup, C160667Ia c160667Ia, InterfaceC09390do interfaceC09390do) {
        AnonymousClass767 anonymousClass767 = (AnonymousClass767) interfaceC09390do.getValue();
        C7ZX c7zx = c160667Ia.A0C;
        UserSession userSession = c160667Ia.A07;
        C7IM c7im = c160667Ia.A04;
        AnonymousClass988 anonymousClass988 = c160667Ia.A03;
        Integer num = C05F.A00;
        Map map = c160667Ia.A08.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new AnonymousClass768(userSession, anonymousClass767.createViewHolder(layoutInflater, viewGroup), c7zx, anonymousClass988, anonymousClass767, c7im, AnonymousClass189.A00(userSession), num, map);
    }
}
