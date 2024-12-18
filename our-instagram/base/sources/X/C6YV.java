package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.List;

/* renamed from: X.6YV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YV implements C3GT {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC140726Ya A03;
    public final boolean A04;
    public final int A05;

    @Override // X.C3GT
    public final int BUo() {
        return this.A05;
    }

    @Override // X.C3GT
    public final /* bridge */ /* synthetic */ void DNj(Object obj, int i) {
        EnumC140736Yb enumC140736Yb;
        IgShowreelNativeAnimationIntf Bx7;
        int i2;
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        UserSession userSession = this.A02;
        List A00 = C41551w4.A00(userSession, c41551w4);
        int size = A00.size();
        int i3 = this.A00;
        int i4 = size;
        if (size > i3) {
            i4 = i3;
        }
        int i5 = c41551w4.A0H.A00;
        if (!this.A04 && i5 != 0 && i4 > (i2 = i5 + 1)) {
            i4 = i2;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C38321qM c38321qM = ((C41181vS) A00.get(i6)).A0b;
            if (c38321qM != null) {
                if (size > 1) {
                    enumC140736Yb = EnumC140736Yb.A06;
                } else {
                    enumC140736Yb = EnumC140736Yb.A07;
                }
                if (c38321qM.A6E()) {
                    Bx7 = c38321qM.A0C.Bx7();
                    if (Bx7 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    C38321qM A1d = c38321qM.A1d();
                    if (A1d.A6E()) {
                        Bx7 = A1d.A0C.Bx7();
                        if (Bx7 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        continue;
                    }
                }
                C14120nc.A00().ATO(new C37412Gds(this.A01, userSession, new C139366Sr(AbstractC41071vF.A07(userSession, c38321qM), c38321qM.A33()), Bx7, this.A03, enumC140736Yb, i6, size, i5, i4));
            }
        }
    }

    public C6YV(Context context, UserSession userSession, InterfaceC140726Ya interfaceC140726Ya, int i, int i2, boolean z) {
        this.A02 = userSession;
        this.A01 = context;
        this.A05 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A03 = interfaceC140726Ya;
    }
}
