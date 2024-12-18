package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Lmw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49070Lmw implements InterfaceC165397aS {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC165437aW A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final Fragment A07;
    public final C7WA A08;
    public final InterfaceC16820sZ A09;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (X.C14360o3.A0K(X.AbstractC166987dD.A10(r5).getUsername(), r2.A01()) == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    @Override // X.InterfaceC165397aS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CqU(android.graphics.RectF r27, X.C47777L8c r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49070Lmw.CqU(android.graphics.RectF, X.L8c, java.lang.String):void");
    }

    public static final void A00(RectF rectF, C49070Lmw c49070Lmw, Reel reel) {
        String str;
        UserSession userSession = c49070Lmw.A02;
        C38C c38c = new C38C(c49070Lmw.A07);
        InterfaceC11380iw interfaceC11380iw = c49070Lmw.A01;
        C38E c38e = new C38E(interfaceC11380iw, userSession, c38c);
        List A1J = AbstractC166987dD.A1J(reel);
        NS9 ns9 = new NS9(rectF, 2);
        C56553P8z c56553P8z = new C56553P8z(rectF, 3);
        c38e.A0C = ((C64012vM) c49070Lmw.A06.getValue()).A04;
        c38e.A05 = ns9;
        c38e.A07(reel, C3G2.A0D, c56553P8z, A1J, A1J, 0);
        String A0i = AbstractC37301Gc2.A0i(reel);
        C7U0 c7u0 = (C7U0) c49070Lmw.A09.invoke();
        if (c7u0 != null) {
            str = c7u0.C7r().C7I();
        } else {
            str = null;
        }
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, "direct_thread_tap_ar_effect");
        A00.A0C("effect_id", A0i);
        if (str != null) {
            A00.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        }
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public C49070Lmw(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7WA c7wa, InterfaceC165437aW interfaceC165437aW, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC37302Gc3.A1U(fragment, interfaceC11380iw);
        AbstractC167017dG.A1U(c7wa, interfaceC165437aW);
        this.A00 = context;
        this.A02 = userSession;
        this.A07 = fragment;
        this.A01 = interfaceC11380iw;
        this.A09 = interfaceC16820sZ;
        this.A08 = c7wa;
        this.A03 = interfaceC165437aW;
        this.A04 = C50249MHe.A01(this, 23);
        this.A05 = C50249MHe.A01(this, 24);
        this.A06 = C50249MHe.A01(this, 25);
    }
}
