package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G2z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36373G2z implements InterfaceC37156GYt {
    public final Context A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final E70 A04;

    public C36373G2z(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 3);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = e70;
        this.A02 = interfaceC11380iw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0196, code lost:
    
        if (r1 >= r2) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.GHY] */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36373G2z.getItems():java.util.List");
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return FUC.A01(this.A03, this.A04);
    }
}
