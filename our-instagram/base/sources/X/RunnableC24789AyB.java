package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.AyB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24789AyB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C81N A01;
    public final /* synthetic */ C50724MaP A02;

    public RunnableC24789AyB(C81N c81n, C50724MaP c50724MaP, int i) {
        this.A02 = c50724MaP;
        this.A01 = c81n;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50724MaP c50724MaP = this.A02;
        View requireViewById = c50724MaP.requireView().getRootView().requireViewById(R.id.root);
        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        AnonymousClass840 anonymousClass840 = c50724MaP.A0F;
        if (anonymousClass840 == null) {
            C14360o3.A0F("cameraSession");
            throw C00O.createAndThrow();
        }
        C22P c22p = anonymousClass840.A01;
        C60762q0 c60762q0 = new C60762q0();
        C81I c81i = new C81I();
        FragmentActivity requireActivity = c50724MaP.requireActivity();
        UserSession A0C = c50724MaP.A0C();
        C50725MaQ A01 = C50724MaP.A01(c50724MaP);
        C81N c81n = this.A01;
        int i = this.A00;
        AbstractC167007dF.A1I(viewGroup, 1, A0C);
        C14360o3.A0B(A01, 9);
        C81J A02 = C81J.A02(c81n, 10);
        C23764Afb c23764Afb = new C23764Afb(1);
        c23764Afb.getClass();
        A02.A0l = c23764Afb;
        A02.A0S = A0C;
        C81J.A03(requireActivity, c50724MaP, A02);
        C128535rM A00 = C81J.A00(viewGroup, c60762q0, A02, c81i);
        A02.A0B = c22p;
        A02.A0O = c50724MaP;
        A02.A0f = null;
        A02.A0g = null;
        A02.A3N = false;
        A02.A47 = false;
        A02.A3M = false;
        A02.A3Q = false;
        A02.A3k = false;
        A02.A22 = true;
        A02.A0V = C82R.A00(A00, new C81W[0]);
        A02.A1A = A01;
        A02.A0U = c81n;
        A02.A29 = Integer.valueOf(i);
        C81Y c81y = new C81Y(A02);
        if (c50724MaP.A0X.get()) {
            C50724MaP.A04(c81y, c50724MaP);
        }
        c50724MaP.A0I = c81y;
    }
}
