package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class GF8 implements GZN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C22P A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ InterfaceC1119353f A05;
    public final /* synthetic */ GYE A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GZN
    public final void DlA(List list) {
        OUQ ouq;
        C121275eQ c121275eQ;
        C14360o3.A0B(list, 0);
        Context context = this.A00;
        UserSession userSession = this.A03;
        String str = this.A0A;
        C38321qM c38321qM = this.A04;
        boolean z = this.A0B;
        String str2 = this.A08;
        InterfaceC1119353f interfaceC1119353f = this.A05;
        Fragment fragment = this.A01;
        String str3 = this.A07;
        String str4 = this.A09;
        GYE gye = this.A06;
        boolean A1a = AbstractC166987dD.A1a(list.get(0));
        C8J0 A00 = AbstractC185088Iz.A00(userSession, null);
        if (AbstractC34290FAk.A00(fragment)) {
            A00.A01("activity_destroyed-start_share_story");
            AbstractC208269Jl.A00(userSession).A08("no fragment");
            return;
        }
        C6WQ AxL = gye.AxL(fragment.requireActivity());
        GV0 gv0 = new GV0(context, fragment, userSession, interfaceC1119353f, AxL, str3, str);
        if (str2 == null) {
            if (c38321qM == null) {
                if (str4 == null) {
                    return;
                }
                C1ON A002 = C1OU.A00(userSession, str4);
                A002.A00 = new C32502ETc(context, fragment, userSession, A00, AxL, str, gv0, A1a);
                c121275eQ = A002;
                C1GJ.A03(c121275eQ);
            }
        } else if (c38321qM == null) {
            ouq = new OUQ(str2, str, z, false, !A1a);
            C121275eQ A03 = AbstractC50633MWu.A03(context, userSession, ouq);
            A03.A00 = new EZ8(context, fragment, A00, AxL, gv0);
            c121275eQ = A03;
            C1GJ.A03(c121275eQ);
        }
        ouq = AbstractC50633MWu.A05(context, c38321qM, str, A1a, false);
        C121275eQ A032 = AbstractC50633MWu.A03(context, userSession, ouq);
        A032.A00 = new EZ8(context, fragment, A00, AxL, gv0);
        c121275eQ = A032;
        C1GJ.A03(c121275eQ);
    }

    @Override // X.GZN
    public final void onCancel() {
        throw C00O.createAndThrow();
    }

    public GF8(Context context, Fragment fragment, C22P c22p, UserSession userSession, C38321qM c38321qM, InterfaceC1119353f interfaceC1119353f, GYE gye, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = context;
        this.A03 = userSession;
        this.A0A = str;
        this.A04 = c38321qM;
        this.A0B = z;
        this.A08 = str2;
        this.A05 = interfaceC1119353f;
        this.A01 = fragment;
        this.A07 = str3;
        this.A09 = str4;
        this.A06 = gye;
        this.A02 = c22p;
    }
}
