package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Vt8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69667Vt8 {
    public int A00;
    public int A01;
    public XDF A02;
    public PromoteLaunchOrigin A03;
    public AudioOverlayTrack A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final FragmentActivity A0G;
    public final InterfaceC11380iw A0H;
    public final UserSession A0I;
    public final C38321qM A0J;
    public final String A0K;

    public final String A00() {
        String id = this.A0J.getId();
        if (id != null) {
            return AbstractC69888VxF.A01(id);
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r7.A0C.BZW() != com.instagram.api.schemas.OrganicCTAType.A06) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C69667Vt8(androidx.fragment.app.FragmentActivity r4, X.InterfaceC11380iw r5, com.instagram.common.session.UserSession r6, X.C38321qM r7, java.lang.String r8) {
        /*
            r3 = this;
            X.JQ0.A1O(r7, r8, r6, r4, r5)
            r3.<init>()
            r3.A0J = r7
            r3.A0K = r8
            r3.A0I = r6
            r3.A0G = r4
            r3.A0H = r5
            boolean r0 = r7.A5P()
            if (r0 != 0) goto L21
            X.1rF r0 = r7.A0C
            com.instagram.api.schemas.OrganicCTAType r2 = r0.BZW()
            com.instagram.api.schemas.OrganicCTAType r1 = com.instagram.api.schemas.OrganicCTAType.A06
            r0 = 1
            if (r2 == r1) goto L22
        L21:
            r0 = 0
        L22:
            r3.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69667Vt8.<init>(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.1qM, java.lang.String):void");
    }
}
