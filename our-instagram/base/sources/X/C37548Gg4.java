package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gg4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37548Gg4 extends AbstractC1337162c {
    public static int A03;
    public static IHZ A04;
    public static INO A05;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static boolean A0A;
    public static final C41761Iec A0B = new Object();
    public static final ArrayList A0C = AbstractC166987dD.A1E();
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.AbstractC1337262d
    public final boolean A02() {
        return false;
    }

    @Override // X.AbstractC1337162c
    public final /* bridge */ /* synthetic */ void A03(C3OO c3oo, C62a c62a) {
        InterfaceC43509JJv interfaceC43509JJv;
        JK1 C3s;
        List C3x;
        C39463Hbp c39463Hbp = (C39463Hbp) c3oo;
        AbstractC167017dG.A1N(c62a, c39463Hbp);
        C38661Gz2 A02 = c62a.A00.A02();
        if (A02 != null && (interfaceC43509JJv = A02.A00) != null && (C3s = interfaceC43509JJv.C3s()) != null && (C3x = C3s.C3x()) != null) {
            A0B.A06(this.A00, this.A01, this.A02, c39463Hbp, C3x);
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        C41761Iec.A03(this.A01, this.A02);
    }

    public static final void A00() {
        INO ino;
        J24 j24;
        if (A09 && (ino = A05) != null && (j24 = ino.A02) != null) {
            C5TA c5ta = j24.A01;
            if (c5ta != null) {
                c5ta.A09("user_paused_video");
            }
            J24.A01(j24, true);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39460Hbm.class;
    }

    public C37548Gg4(Activity activity, JPb jPb, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C25348BJr c25348BJr) {
        super(jPb, c25348BJr);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = activity;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C39463Hbp(AbstractC31176DnK.A0A(layoutInflater, viewGroup, R.layout.layout_clips_viewer_suggested_creators), this.A02);
    }
}
