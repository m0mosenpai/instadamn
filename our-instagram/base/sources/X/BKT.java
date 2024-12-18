package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BKT implements JIH, C38Y {
    public C25567BSe A00;
    public final C25671My A01;
    public final UserSession A02;
    public final C37563GgJ A03;
    public final C37560GgG A04;
    public final C37556GgC A05;
    public final C37624GhJ A06;
    public final String A07;
    public final Map A08;
    public final Map A09;
    public final InterfaceC09390do A0A;
    public final Context A0B;

    public BKT(Context context, C25671My c25671My, UserSession userSession, C37563GgJ c37563GgJ, C37560GgG c37560GgG, C37556GgC c37556GgC, C37624GhJ c37624GhJ, String str) {
        AbstractC25233BEq.A0w(2, userSession, c37560GgG, c37624GhJ);
        AbstractC167017dG.A1U(c25671My, str);
        this.A0B = context;
        this.A02 = userSession;
        this.A04 = c37560GgG;
        this.A06 = c37624GhJ;
        this.A05 = c37556GgC;
        this.A01 = c25671My;
        this.A07 = str;
        this.A03 = c37563GgJ;
        this.A09 = AbstractC166987dD.A1I();
        this.A08 = AbstractC166987dD.A1I();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321258522354946L)) {
            this.A00 = new C25567BSe(C1TU.A01());
            if (C18U.A06(c06090Tz, this.A02, 36321258522682628L)) {
                this.A04.A99(this);
            }
            if (C18U.A06(c06090Tz, this.A02, 2342164267736179971L)) {
                this.A05.A0G(this);
            }
        }
        this.A0A = BQP.A00(this, 9);
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (X.C18U.A06(r4, r5, 2342164267736179971L) != false) goto L10;
     */
    @Override // X.JIH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dby(X.C120985dq r13, int r14, int r15, boolean r16) {
        /*
            r12 = this;
            r6 = 0
            X.C14360o3.A0B(r13, r6)
            X.GhJ r0 = r12.A06
            X.5dq r0 = r0.A02()
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lf7
            if (r16 != 0) goto Lf7
            java.util.Map r1 = r12.A08
            java.lang.String r0 = r13.getId()
            boolean r1 = r1.containsKey(r0)
            java.util.Map r3 = r12.A09
            java.lang.String r0 = r13.getId()
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto La8
            if (r1 != 0) goto Lcf
            com.instagram.common.session.UserSession r5 = r12.A02
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 2342164267736179971(0x208109fe00072503, double:4.066653000548059E-152)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto Lcf
        L39:
            X.GgC r0 = r12.A05
            java.lang.Integer r1 = r0.A0A()
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto Lf7
            boolean r0 = r13.CdW()
            if (r0 != 0) goto Lf4
            boolean r0 = r12.A06(r13)
            if (r0 != 0) goto Lf4
            boolean r0 = r12.A05()
            if (r0 != 0) goto Lf4
            X.GgJ r1 = r12.A03
            int r0 = r1.A00()
            X.BKn r0 = r1.A02(r0)
            if (r0 == 0) goto Lef
            android.view.View r1 = r0.A08
            r0 = 0
            r12.A03(r13, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r7 = r12.A00(r1)
            android.view.TextureView r7 = (android.view.TextureView) r7
            if (r7 == 0) goto Lef
            r2 = 37165683453460880(0x8409fe00140190, double:3.56706609793929E-306)
            double r10 = X.C18U.A00(r4, r5, r2)
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 > 0) goto L87
            android.graphics.Bitmap r1 = r7.getBitmap()
        L84:
            if (r1 == 0) goto Lef
            goto Le3
        L87:
            int r0 = r7.getWidth()
            double r0 = (double) r0
            double r8 = X.C18U.A00(r4, r5, r2)
            double r0 = r0 / r8
            int r8 = X.C1H4.A00(r0)
            int r0 = r7.getHeight()
            double r0 = (double) r0
            double r2 = X.C18U.A00(r4, r5, r2)
            double r0 = r0 / r2
            int r0 = X.C1H4.A00(r0)
            android.graphics.Bitmap r1 = r7.getBitmap(r8, r0)
            goto L84
        La8:
            com.instagram.common.session.UserSession r5 = r12.A02
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36602733498995464(0x8209fe00041308, double:3.211054279917842E-306)
            long r9 = X.C18U.A01(r4, r5, r0)
            r7 = 0
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto Lf7
            java.lang.String r2 = r13.getId()
            java.lang.Object r2 = r3.get(r2)
            X.CAQ r2 = (X.CAQ) r2
            if (r2 == 0) goto Lf7
            long r7 = r2.A00
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r7
            goto Ld9
        Lcf:
            long r2 = (long) r14
            com.instagram.common.session.UserSession r5 = r12.A02
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36602733499323145(0x8209fe00091309, double:3.211054280125069E-306)
        Ld9:
            long r7 = X.C18U.A01(r4, r5, r0)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto Lf7
            goto L39
        Le3:
            r12.A01(r1, r13, r6)     // Catch: java.lang.Throwable -> Lea
            r1.recycle()
            return
        Lea:
            r0 = move-exception
            r1.recycle()
            throw r0
        Lef:
            r0 = 1
            r12.A04(r13, r6, r0)
            return
        Lf4:
            r12.A04(r13, r6, r6)
        Lf7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKT.Dby(X.5dq, int, int, boolean):void");
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void E1V() {
    }

    private final View A00(ViewGroup viewGroup) {
        View A00;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (ScalingTextureView.class.isInstance(childAt)) {
                C14360o3.A0C(childAt, "null cannot be cast to non-null type T of instagram.features.clips.viewer.background.ClipsGradientBackgroundHelper.findChildOfType");
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (A00 = A00((ViewGroup) childAt)) != null) {
                return A00;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x006e, code lost:
    
        if (r0.A05 == (-16758784)) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(android.graphics.Bitmap r19, X.C120985dq r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKT.A01(android.graphics.Bitmap, X.5dq, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.CAQ, java.lang.Object] */
    private final void A02(C120985dq c120985dq, Boolean bool) {
        Map map = this.A08;
        String id = c120985dq.getId();
        long currentTimeMillis = System.currentTimeMillis();
        ?? obj = new Object();
        obj.A01 = bool;
        obj.A00 = currentTimeMillis;
        map.put(id, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.CAQ, java.lang.Object] */
    private final void A03(C120985dq c120985dq, Boolean bool) {
        Map map = this.A09;
        String id = c120985dq.getId();
        long currentTimeMillis = System.currentTimeMillis();
        ?? obj = new Object();
        obj.A01 = bool;
        obj.A00 = currentTimeMillis;
        map.put(id, obj);
    }

    private final void A04(C120985dq c120985dq, boolean z, boolean z2) {
        if (!z2) {
            Boolean A0a = AbstractC166997dE.A0a();
            if (z) {
                A02(c120985dq, A0a);
            } else {
                A03(c120985dq, A0a);
            }
        }
        this.A01.E4s(new C25571BSi(c120985dq, 0.0f, true));
        c120985dq.getId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r1 != X.C0TY.YELLOW) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A05() {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r4 = r5.A02
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36321258523206919(0x8109fe00122507, double:3.033048371820413E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            r2 = 1
            if (r0 == 0) goto L1b
            X.BSe r0 = r5.A00
            if (r0 == 0) goto L31
            X.0TY r1 = r0.A00
        L16:
            X.0TY r0 = X.C0TY.RED
            if (r1 != r0) goto L31
        L1a:
            return r2
        L1b:
            r0 = 36321258523272456(0x8109fe00132508, double:3.0330483718618586E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto L31
            X.BSe r0 = r5.A00
            if (r0 == 0) goto L31
            X.0TY r1 = r0.A00
            X.0TY r0 = X.C0TY.YELLOW
            if (r1 == r0) goto L1a
            goto L16
        L31:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKT.A05():boolean");
    }

    private final boolean A06(C120985dq c120985dq) {
        UserSession userSession = this.A02;
        List list = null;
        C75363a3 A0A = c120985dq.A0A(userSession, null);
        if (A0A != null) {
            if (!C18U.A06(C06090Tz.A05, userSession, 36321932831893401L)) {
                String A04 = A0A.A04();
                if (A04 != null) {
                    list = AbstractC166987dD.A1J(A04);
                }
            } else {
                list = A0A.A01(this.A0B);
            }
        }
        return new C37712Gin(userSession, "clips_viewer_clips_tab", list).A04();
    }

    @Override // X.C38Y
    public final void DXc(int i, int i2) {
        boolean z;
        C120985dq A02 = this.A06.A02();
        if (A02 != null) {
            String id = A02.getId();
            if (!this.A08.containsKey(id) && !this.A09.containsKey(id)) {
                if (!A02.CdW() && !A06(A02) && !A05()) {
                    C37563GgJ c37563GgJ = this.A03;
                    C25370BKn A022 = c37563GgJ.A02(c37563GgJ.A00());
                    if (A022 != null) {
                        IgImageView A023 = A022.A02();
                        if (!A023.A0N) {
                            z = true;
                        } else {
                            A02(A02, null);
                            Bitmap bitmap = A023.A06;
                            z = true;
                            if (bitmap != null) {
                                A01(bitmap, A02, true);
                                return;
                            }
                        }
                        A04(A02, z, z);
                        return;
                    }
                    return;
                }
                A04(A02, true, false);
            }
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
