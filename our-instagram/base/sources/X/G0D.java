package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G0D implements C11R {
    public Object A00;
    public Object A01 = AbstractC166987dD.A1E();
    public final /* synthetic */ C36689GFk A02;
    public final /* synthetic */ String A03;

    @Override // X.C11R
    public final int getRunnableId() {
        return 567;
    }

    public G0D(C36689GFk c36689GFk, String str) {
        this.A02 = c36689GFk;
        this.A03 = str;
    }

    @Override // X.C11R
    public final void onCancel() {
        C36689GFk c36689GFk = this.A02;
        c36689GFk.A0C.A02(2, 1, 0L);
        FPY fpy = c36689GFk.A00;
        if (fpy != null) {
            fpy.A00(true, 0);
        }
    }

    @Override // X.C11R
    public final void onFinish() {
        String str = this.A03;
        C36689GFk c36689GFk = this.A02;
        if (C14360o3.A0K(str, c36689GFk.A06)) {
            c36689GFk.A08 = false;
            c36689GFk.A04 = this.A00;
            c36689GFk.A05 = this.A01;
            InterfaceC169357h9 interfaceC169357h9 = c36689GFk.A0F;
            interfaceC169357h9.EYJ(null);
            interfaceC169357h9.Eby(str);
            interfaceC169357h9.EYJ(c36689GFk);
            InterfaceC169357h9 interfaceC169357h92 = c36689GFk.A0E;
            if (interfaceC169357h92 != null) {
                interfaceC169357h92.EYJ(null);
                interfaceC169357h92.Eby(str);
                interfaceC169357h92.EYJ(c36689GFk);
            }
        }
    }

    @Override // X.C11R
    public final void onStart() {
        C36689GFk c36689GFk = this.A02;
        C36687GFi c36687GFi = c36689GFk.A02;
        if (c36687GFi != null) {
            c36687GFi.Eby(this.A03);
            c36687GFi.EYJ(c36689GFk);
        }
        C36686GFh c36686GFh = c36689GFk.A01;
        if (c36686GFh != null) {
            c36686GFh.Eby(this.A03);
            c36686GFh.EYJ(c36689GFk);
        }
    }

    @Override // X.C11R
    public final void run() {
        C35040FcD c35040FcD;
        String str;
        Object obj;
        Object obj2;
        Integer num;
        C36689GFk c36689GFk = this.A02;
        C35035Fc8 c35035Fc8 = c36689GFk.A0C;
        String str2 = this.A03;
        String str3 = str2;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            c35040FcD = null;
        } else {
            UserSession userSession = c35035Fc8.A0F;
            Context context = c35035Fc8.A0E;
            C5e4 c5e4 = c35035Fc8.A03;
            C2DS A00 = AbstractC28761aE.A00(userSession);
            String str4 = c35035Fc8.A0H;
            c35040FcD = new C35040FcD(context, c5e4, userSession, A00);
            c35040FcD.A02(str2, c35035Fc8.A0I, str4);
            C121305eT c121305eT = c35040FcD.A01;
            if (c121305eT != null) {
                str = c121305eT.A01;
            } else {
                str = null;
            }
            c35035Fc8.A07 = str;
            c35035Fc8.A0G.A00(c35035Fc8.A00, 1, 0, c35040FcD.A00(true).size());
        }
        this.A00 = c35040FcD;
        Object Bov = c36689GFk.A0F.Bov();
        InterfaceC169357h9 interfaceC169357h9 = c36689GFk.A0E;
        Object obj3 = null;
        if (interfaceC169357h9 != null) {
            obj = interfaceC169357h9.Bov();
        } else {
            obj = null;
        }
        C36687GFi c36687GFi = c36689GFk.A02;
        if (c36687GFi != null) {
            obj2 = c36687GFi.A01;
        } else {
            obj2 = null;
        }
        C36686GFh c36686GFh = c36689GFk.A01;
        if (c36686GFh != null) {
            obj3 = c36686GFh.A01;
        }
        if (str3 == null) {
            str3 = "";
        }
        this.A01 = c35035Fc8.A01(c35040FcD, Bov, obj, obj2, obj3, str3);
        FPY fpy = c36689GFk.A00;
        if (fpy != null && (num = fpy.A00) != null) {
            fpy.A01.networkQueryStart(num.intValue(), "server_entities_named_dsq1");
        }
    }

    @Override // X.C11R
    public final String getName() {
        return "queryInterop";
    }
}
