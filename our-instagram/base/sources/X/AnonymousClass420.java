package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.420, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass420 implements AnonymousClass421 {
    public InterfaceC41501vz A00;
    public C48277LYa A01;
    public final C25671My A02;
    public final UserSession A03;
    public final Fragment A04;
    public final InterfaceC60442pS A05;

    public AnonymousClass420(Fragment fragment, C25671My c25671My, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(c25671My, 3);
        this.A03 = userSession;
        this.A04 = fragment;
        this.A02 = c25671My;
        this.A05 = interfaceC60442pS;
    }

    @Override // X.AnonymousClass421
    public final void Cvi(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, String str, boolean z, boolean z2) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        Context context = this.A04.getContext();
        if (context != null) {
            C35131FeY.A01(context, this.A03, new C42741Ivb(this, c38321qM, c75113Zb, num, str, z2, z), false, false, z2, !C41D.A00.A01(r9, c38321qM));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r6 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0271  */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.KxY, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.AnonymousClass420 r25, X.C38321qM r26, java.lang.Integer r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass420.A00(X.420, X.1qM, java.lang.Integer, java.lang.String, boolean):void");
    }

    @Override // X.AnonymousClass421
    public final void CyL(C38321qM c38321qM) {
        ArrayList arrayList = new ArrayList();
        User CDj = c38321qM.A0C.CDj();
        if (CDj != null) {
            arrayList.add(CDj);
        }
        List Ab8 = c38321qM.A0C.Ab8();
        if (Ab8 != null) {
            arrayList.addAll(Ab8);
        }
        Fragment fragment = this.A04;
        InterfaceC60442pS interfaceC60442pS = this.A05;
        UserSession userSession = this.A03;
        String string = fragment.getString(2131975630);
        C14360o3.A07(string);
        AbstractC55229Oez.A0C(fragment, userSession, c38321qM, interfaceC60442pS, string, arrayList);
    }
}
