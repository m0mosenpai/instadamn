package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9hE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215989hE extends C2AH {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C215989hE(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A05 = obj2;
        this.A04 = obj4;
        this.A03 = obj;
        this.A01 = i;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            C14360o3.A0B(exc, 0);
            String message = exc.getMessage();
            if (message != null) {
                AbstractC12120kG.A07(AbstractC43591JPw.A00(631), message, null);
            }
            C9GR.A01((Context) this.A03, "giphy_download_error_message", 2131963253, 0);
            C44549Jmt c44549Jmt = (C44549Jmt) this.A05;
            C05A c05a = c44549Jmt.A06;
            Collection collection = (Collection) ((AbstractC193598he) c05a.getValue()).A01;
            if (collection != null) {
                ArrayList A1F = AbstractC166987dD.A1F(collection);
                int i = this.A01;
                C45056Jwl c45056Jwl = (C45056Jwl) A1F.get(i);
                Integer num = C05F.A00;
                String str = c45056Jwl.A05;
                String str2 = c45056Jwl.A07;
                String str3 = c45056Jwl.A06;
                int i2 = c45056Jwl.A00;
                C47712L4t c47712L4t = c45056Jwl.A01;
                C47712L4t c47712L4t2 = c45056Jwl.A02;
                A91 a91 = c45056Jwl.A03;
                C14360o3.A0B(str, 0);
                AbstractC167017dG.A1P(str2, str3);
                AbstractC167017dG.A1S(c47712L4t, c47712L4t2);
                C14360o3.A0B(a91, 6);
                A1F.set(i, new C45056Jwl(c47712L4t, c47712L4t2, a91, num, str, str2, str3, i2));
                c05a.Egh(new C8ZT(A1F));
            }
            C47543KzB c47543KzB = c44549Jmt.A04;
            String str4 = ((JWd) c44549Jmt.A09.getValue()).A01;
            C14360o3.A0B(str4, 0);
            c47543KzB.A00.remove(str4);
            return;
        }
        AbstractC12120kG.A01("CanvasShoutoutController", "Unable to create medium for reel item");
        C218109ki.A03((C218109ki) this.A02, (User) this.A05, (List) this.A04, this.A01 + 1);
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        if (1 - this.A00 != 0) {
            super.onFinish();
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        if (1 - this.A00 != 0) {
            super.onStart();
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            C195868lW c195868lW = (C195868lW) obj;
            C14360o3.A0B(c195868lW, 0);
            if (c195868lW.A07 == 0) {
                onFail(new Exception("Video has duration of 0 ms"));
                return;
            }
            C45056Jwl c45056Jwl = (C45056Jwl) this.A02;
            c195868lW.A0w = AbstractC166987dD.A1J(new C51743MtS((Integer) null, "giphy_video", c45056Jwl.A05, c45056Jwl.A07, c45056Jwl.A06, c45056Jwl.A01.A05.getUrl()));
            C184108Ez c184108Ez = ((C44549Jmt) this.A05).A03;
            AbstractC166987dD.A1Z(new C57160PZe(c195868lW, this.A04, c184108Ez, (InterfaceC23621Ds) null, 28), AbstractC141776au.A00(c184108Ez));
            return;
        }
        File file = (File) obj;
        C38321qM c38321qM = (C38321qM) this.A03;
        int A0J = AbstractC167017dG.A0J(c38321qM);
        C14360o3.A0B(file, 0);
        Medium A03 = C8IU.A03(file, A0J, 0);
        C218109ki c218109ki = (C218109ki) this.A02;
        User user = (User) this.A05;
        List list = (List) this.A04;
        int i = this.A01;
        if (c38321qM.Cff()) {
            C88Y c88y = c218109ki.A0B;
            UserSession userSession = c218109ki.A09;
            Context context = c218109ki.A07;
            c88y.A0C(AbstractC23023ADf.A00(context, userSession, user, C218109ki.A00(c218109ki).A01), c218109ki.A0G, true);
            User A10 = AbstractC166987dD.A10(userSession);
            String A2u = c38321qM.A2u();
            C14360o3.A0B(context, 1);
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
            int A0A = AbstractC166997dE.A0A(resources);
            C202668xk c202668xk = new C202668xk(context, null, null, A10, null, A2u, A0A, A0A, dimensionPixelSize, dimensionPixelSize2, A0A, false);
            float A0m = c38321qM.A0m();
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c218109ki.A0A).A0K;
            C23108AGw A00 = A06.A00(A0m, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), 0.5f, false);
            A00.A04 = 0.5f;
            C88Y.A01(c202668xk, c88y, A00, false);
            C195868lW A05 = AMV.A05(context, A03, userSession);
            Bitmap bitmap = c218109ki.A01;
            bitmap.getClass();
            A05.A0N = bitmap;
            String id = c38321qM.getId();
            id.getClass();
            AA0 aa0 = new AA0(c88y.A03(A05, id), c38321qM.getId());
            aa0.A00 = c218109ki.A01;
            aa0.A04 = A05;
            c218109ki.A04.add(aa0);
            C218109ki.A03(c218109ki, user, list, i + 1);
            return;
        }
        Context context2 = c218109ki.A07;
        User A2E = c38321qM.A2E(c218109ki.A09);
        A2E.getClass();
        String A2u2 = c38321qM.A2u();
        InterfaceC1812882f interfaceC1812882f2 = ((NineSixteenLayoutConfigImpl) c218109ki.A0A).A0K;
        int width = interfaceC1812882f2.getWidth();
        int height = interfaceC1812882f2.getHeight();
        C14360o3.A0B(context2, 1);
        C216239hg c216239hg = new C216239hg(context2, A03, A2E, A2u2, width, height, true);
        c216239hg.A9I(new C23679AeE(i, 2, c218109ki, c216239hg, c38321qM, user, list));
    }
}
