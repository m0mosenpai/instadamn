package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.Bok, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26587Bok extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final C57 A03;
    public final Integer A04;
    public final String A05;

    public C26587Bok(UserSession userSession, C57 c57, Integer num, String str, int i, int i2) {
        AbstractC167007dF.A1F(userSession, 3, str);
        this.A01 = i;
        this.A03 = c57;
        this.A02 = userSession;
        this.A05 = str;
        this.A04 = num;
        this.A00 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04a0  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r60) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26587Bok.A0Y(X.3bS):X.2Vc");
    }

    public static final float A04(C2Z1 c2z1, C26587Bok c26587Bok) {
        int i;
        Integer num = c26587Bok.A04;
        if (num != null) {
            i = num.intValue();
        } else {
            i = AbstractC167007dF.A0K(c2z1.ArD().A0C).heightPixels;
        }
        return i;
    }

    public static final void A05(C76223bS c76223bS, C26587Bok c26587Bok) {
        String A38;
        C38321qM c38321qM;
        List AoX;
        InterfaceC43531JKr interfaceC43531JKr;
        String B0s;
        C120985dq c120985dq = c26587Bok.A03.A06;
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && (A38 = c38321qM2.A38()) != null && (c38321qM = c120985dq.A02) != null && (AoX = c38321qM.A0C.AoX()) != null && (interfaceC43531JKr = (InterfaceC43531JKr) AbstractC001800i.A0J(AoX)) != null && (B0s = interfaceC43531JKr.B0s()) != null) {
            Activity A0J = AbstractC25228BEl.A0J(c76223bS);
            Context A00 = AbstractC77363dM.A00(c76223bS);
            UserSession userSession = c26587Bok.A02;
            C14360o3.A0B(userSession, 2);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("stripped_media_id", A38);
            A0b.putString("element_id", B0s);
            C26861BtN c26861BtN = new C26861BtN();
            c26861BtN.setArguments(A0b);
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A0T = c26861BtN;
            AbstractC25225BEi.A1Q(A0y, false);
            A0y.A06 = A00.getColor(AbstractC53242c7.A02(A00));
            A0y.A0U = new C56759PHb(A38, c26861BtN, 2);
            C189478aR A002 = A0y.A00();
            c26861BtN.A00 = A002;
            A002.A02(A0J, c26861BtN);
            C28179CbR c28179CbR = (C28179CbR) c26861BtN.A03.getValue();
            String str = (String) AbstractC166987dD.A17(c26861BtN.A01);
            C14360o3.A0B(str, 1);
            C43822JZk A003 = AbstractC208269Jl.A00(c28179CbR.A01);
            C22P c22p = C22P.A1a;
            EnumC114925Hg enumC114925Hg = EnumC114925Hg.CLIPS_SPIN;
            A003.A06(enumC114925Hg, c22p);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c28179CbR.A00, MSV.A00(1258));
            if (A0f.isSampled()) {
                A0f.A9K("media_id", AbstractC166997dE.A0j(A38));
                AbstractC25225BEi.A1N(A0f, AbstractC25225BEi.A14());
                A0f.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0f.A8R(enumC114925Hg, "camera_destination");
                AbstractC25234BEr.A11(A0f, "camera_session_id", str);
                A0f.AAP(AbstractC111324zv.A00(205), AbstractC82663mU.A00);
                A0f.Cht();
            }
        }
    }

    public static final float A03(C2Z1 c2z1) {
        return AbstractC167007dF.A0K(c2z1.ArD().A0C).widthPixels;
    }
}
