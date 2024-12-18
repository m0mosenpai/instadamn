package X;

import android.content.Context;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController;

/* renamed from: X.GgQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37569GgQ {
    public boolean A00;
    public final C37641Gha A01;
    public final C37566GgM A02;
    public final ClipsMidcardVirtualVideoPlayerController A03;
    public final C37560GgG A04;
    public final C37556GgC A05;
    public final Context A06;
    public final C07T A07;
    public final UserSession A08;
    public final InterfaceC60442pS A09;
    public final InterfaceC43589JPu A0A;
    public final IG5 A0B;

    public C37569GgQ(Context context, C07T c07t, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, C37641Gha c37641Gha, IG5 ig5, C37566GgM c37566GgM, ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController, C37560GgG c37560GgG, C37556GgC c37556GgC) {
        AbstractC167007dF.A1F(c07t, 2, c37560GgG);
        AbstractC25233BEq.A0y(7, c37641Gha, ig5, interfaceC43589JPu);
        C14360o3.A0B(interfaceC60442pS, 10);
        C14360o3.A0B(userSession, 11);
        this.A06 = context;
        this.A07 = c07t;
        this.A05 = c37556GgC;
        this.A04 = c37560GgG;
        this.A02 = c37566GgM;
        this.A03 = clipsMidcardVirtualVideoPlayerController;
        this.A01 = c37641Gha;
        this.A0B = ig5;
        this.A0A = interfaceC43589JPu;
        this.A09 = interfaceC60442pS;
        this.A08 = userSession;
        c37560GgG.A04 = new C43203J8a(this, 11);
    }

    public static final boolean A01(C120985dq c120985dq) {
        MidCardLayoutType midCardLayoutType;
        C26136BhN c26136BhN = c120985dq.A01().A06;
        if (c26136BhN != null) {
            midCardLayoutType = c26136BhN.A07;
        } else {
            midCardLayoutType = null;
        }
        return AbstractC167007dF.A1X(midCardLayoutType, MidCardLayoutType.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r5 == com.instagram.api.schemas.InstagramMidcardType.A0F) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r20.A01().A05 == com.instagram.api.schemas.InstagramMidcardType.A0C) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0514 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C120985dq r20, X.C37658Ghr r21, X.C37569GgQ r22, int r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37569GgQ.A00(X.5dq, X.Ghr, X.GgQ, int, int, boolean):void");
    }
}
