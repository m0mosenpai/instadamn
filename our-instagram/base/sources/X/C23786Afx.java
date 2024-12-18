package X;

/* renamed from: X.Afx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23786Afx implements BBw, InterfaceC25179BCc, InterfaceC25175BBx {
    public C55U A00;
    public A57 A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    @Override // X.InterfaceC25179BCc
    public final void Dx6(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        if (this.A00 != c55u) {
            this.A00 = c55u;
            A00(this);
        }
    }

    public static final void A00(C23786Afx c23786Afx) {
        String str;
        C55U c55u = c23786Afx.A00;
        if (c55u == C208509Kk.A00) {
            if (c23786Afx.A03) {
                str = "stories_gallery";
            } else {
                str = "stories_precapture_camera";
            }
        } else if (c55u instanceof C81V) {
            if (c23786Afx.A03) {
                str = "clips_gallery";
            } else {
                str = "clips_precapture_camera";
            }
        } else if (c55u == C81S.A00) {
            str = "live_precapture_camera";
        } else if (c55u != C128535rM.A00 || c23786Afx.A03) {
            return;
        } else {
            str = "feed_precapture_camera";
        }
        c23786Afx.A02 = str;
        A57 a57 = c23786Afx.A01;
        if (a57 != null) {
            a57.A00.updateModuleNameV2_USE_WITH_CAUTION(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // X.BBw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D2U(boolean r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L26
            r0 = 1
            r3.A04 = r0
            X.55U r1 = r3.A00
            boolean r0 = r1 instanceof X.C208509Kk
            if (r0 == 0) goto L1f
            java.lang.String r0 = "stories_postcapture_camera"
        Ld:
            r3.A02 = r0
        Lf:
            X.A57 r2 = r3.A01
            if (r2 == 0) goto L1e
            java.lang.String r1 = r3.A02
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.9fO r0 = r2.A00
            r0.updateModuleNameV2_USE_WITH_CAUTION(r1)
        L1e:
            return
        L1f:
            boolean r0 = r1 instanceof X.C81V
            if (r0 == 0) goto Lf
            java.lang.String r0 = "clips_postcapture_camera"
            goto Ld
        L26:
            boolean r0 = r3.A04
            if (r0 == 0) goto L1e
            java.lang.String r0 = "clips_precapture_camera"
            r3.A02 = r0
            A00(r3)
            r0 = 0
            r3.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23786Afx.D2U(boolean):void");
    }

    @Override // X.InterfaceC25175BBx
    public final void DJ3(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            A00(this);
        }
    }

    @Override // X.InterfaceC25179BCc
    public final void DV4() {
        A00(this);
    }
}
