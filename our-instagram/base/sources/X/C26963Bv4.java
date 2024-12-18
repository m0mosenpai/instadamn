package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.Bv4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26963Bv4 extends C1P1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1ZE A02;
    public final /* synthetic */ C38321qM A03;

    public C26963Bv4(FragmentActivity fragmentActivity, UserSession userSession, C1ZE c1ze, C38321qM c38321qM) {
        this.A02 = c1ze;
        this.A03 = c38321qM;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(34022935);
        EAX eax = (EAX) obj;
        int A0N = AbstractC167017dG.A0N(eax, -610328636);
        C25980BeU c25980BeU = eax.A02;
        if (c25980BeU == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        C26120Bh5 c26120Bh5 = c25980BeU.A00;
        if (c26120Bh5 != null) {
            C1ZE c1ze = this.A02;
            C38321qM c38321qM = this.A03;
            UserSession userSession = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            if (AbstractC166987dD.A1b(c26120Bh5.A03)) {
                int i = 5000;
                if (C18U.A06(C06090Tz.A05, userSession, 36322993690061650L)) {
                    i = 10000;
                }
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A04();
                c146106i8.A01 = i;
                c146106i8.A0D = c26120Bh5.A02;
                c146106i8.A0I = c26120Bh5.A01;
                c146106i8.A0J = true;
                c146106i8.A0R = true;
                if (c38321qM.A1S() != null) {
                    c146106i8.A03();
                    ImageUrl A1S = c38321qM.A1S();
                    if (A1S != null) {
                        c146106i8.A09 = A1S;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                c146106i8.A0D(c26120Bh5.A00);
                c146106i8.A0A = new C29318CwD(fragmentActivity, c26120Bh5, userSession, c1ze, c38321qM, i);
                c146106i8.A01();
                C41451vu.A01.A01(new C3KD(c146106i8.A00()));
            } else {
                C28458ChA c28458ChA = C28458ChA.A00;
                ProductType A1z = c38321qM.A1z();
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    c28458ChA.A03(userSession, A1z, null, "toast_info_validation", null, A2u, "achievementIds is empty", null, null, null, null, null);
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0A(-272770162, A0N);
                    throw A0g;
                }
            }
        }
        C0f9.A0A(1439184645, A0N);
        C0f9.A0A(-1748222053, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -456153266);
        C28458ChA c28458ChA = C28458ChA.A00;
        UserSession userSession = this.A01;
        C38321qM c38321qM = this.A03;
        ProductType A1z = c38321qM.A1z();
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                str = A01.getMessage();
            } else {
                str = null;
            }
            c28458ChA.A03(userSession, A1z, null, "toast_info_fetch", null, A2u, str, null, null, null, null, null);
            C0f9.A0A(1560264083, A0N);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-55686020, A0N);
        throw A0g;
    }
}
