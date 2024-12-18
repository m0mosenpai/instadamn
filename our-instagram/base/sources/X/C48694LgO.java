package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LgO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48694LgO implements InterfaceC50514MRr {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r3 <= 0) goto L6;
     */
    @Override // X.InterfaceC50514MRr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09530e4 Brh(X.C45104JxY r24) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48694LgO.Brh(X.JxY):X.0e4");
    }

    @Override // X.InterfaceC50514MRr
    public final boolean Ei7(C45104JxY c45104JxY) {
        C14360o3.A0B(c45104JxY, 0);
        if (this.A05 && AbstractC166987dD.A1b(c45104JxY.A04)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50514MRr
    public final C51753Mtc BEM(int i) {
        String string = this.A01.getString(2131960415);
        Integer num = C05F.A01;
        return new C51753Mtc(new KQB(new MUW(num, num, "sticker", (String) null, 4), string, R.drawable.instagram_star_pano_outline_24), i, 9);
    }

    public C48694LgO(Context context, UserSession userSession, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A06 = z4;
        this.A00 = i;
    }
}
