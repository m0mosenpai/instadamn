package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Agu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23845Agu implements InterfaceC25182BCf {
    public C47Z A00;
    public final Context A01;
    public final UserSession A02;
    public final ACA A03;
    public final DirectCameraViewModel A04;
    public final C211689Zc A05;
    public final A8X A06;
    public final C183978Ee A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final Object A0B;
    public final java.util.Set A0C;

    public final void A00(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        synchronized (this.A0B) {
            this.A00 = c47z;
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                ((InterfaceC16660sJ) it.next()).invoke(c47z);
            }
        }
    }

    public final void A01(InterfaceC16660sJ interfaceC16660sJ) {
        synchronized (this.A0B) {
            this.A0C.add(interfaceC16660sJ);
            C47Z c47z = this.A00;
            if (c47z != null) {
                interfaceC16660sJ.invoke(c47z);
            }
        }
    }

    @Override // X.InterfaceC25182BCf
    public final String BOH() {
        return this.A08;
    }

    @Override // X.InterfaceC25182BCf
    public final A5Y ENf(C26086BgF c26086BgF, String str, boolean z) {
        C8M0.A00(this.A02).A00(this.A03.A00, this.A04, this.A05, Integer.valueOf(this.A07.A08), C05F.A1F, this.A08);
        A01(new MI7(this, c26086BgF, str, 22));
        return new A5Y("");
    }

    public C23845Agu(Context context, UserSession userSession, ACA aca, DirectCameraViewModel directCameraViewModel, C211689Zc c211689Zc, A8X a8x, C183978Ee c183978Ee, String str, String str2, boolean z) {
        AbstractC167017dG.A1P(context, userSession);
        C14360o3.A0B(aca, 5);
        AbstractC167007dF.A1J(str, 7, str2);
        this.A01 = context;
        this.A02 = userSession;
        this.A07 = c183978Ee;
        this.A06 = a8x;
        this.A03 = aca;
        this.A05 = c211689Zc;
        this.A09 = str;
        this.A0A = z;
        this.A08 = str2;
        this.A04 = directCameraViewModel;
        this.A0B = new Object();
        this.A0C = new LinkedHashSet();
    }
}
