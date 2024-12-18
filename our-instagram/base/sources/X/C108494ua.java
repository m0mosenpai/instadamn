package X;

/* renamed from: X.4ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108494ua implements C0L3, InterfaceC18130ux, InterfaceC18490vb {
    public C0TY A00;
    public C0TY A01;
    public boolean A02;
    public final C0TY A03;
    public final EnumC108504ub A04;
    public final EnumC108504ub A05;

    public C108494ua() {
        C0TY c0ty;
        EnumC108504ub enumC108504ub;
        EnumC108504ub enumC108504ub2;
        C0TY c0ty2 = C0TY.GREEN;
        this.A01 = c0ty2;
        this.A00 = c0ty2;
        this.A02 = false;
        this.A05 = C20150ym.A07(AbstractC20100yh.A00(36330299428717352L)) ? C20150ym.A07(AbstractC20100yh.A00(36330299428782889L)) ? EnumC108504ub.HIT_DANGER_ZONE : EnumC108504ub.IN_DANGER_ZONE : EnumC108504ub.DISABLED;
        if (C20150ym.A07(AbstractC20100yh.A00(36330299428848426L))) {
            this.A04 = C20150ym.A07(AbstractC20100yh.A00(36330299428913963L)) ? EnumC108504ub.HIT_DANGER_ZONE : EnumC108504ub.IN_DANGER_ZONE;
            if (((int) C20150ym.A01(AbstractC20100yh.A00(36611774405679443L))) == 2) {
                c0ty = C0TY.YELLOW;
                this.A03 = c0ty;
                enumC108504ub = this.A05;
                enumC108504ub2 = EnumC108504ub.DISABLED;
                if (enumC108504ub == enumC108504ub2 || this.A04 != enumC108504ub2) {
                    C0L6.A03(this, false);
                }
                return;
            }
        } else {
            this.A04 = EnumC108504ub.DISABLED;
        }
        c0ty = C0TY.RED;
        this.A03 = c0ty;
        enumC108504ub = this.A05;
        enumC108504ub2 = EnumC108504ub.DISABLED;
        if (enumC108504ub == enumC108504ub2) {
        }
        C0L6.A03(this, false);
    }

    @Override // X.C0L3
    public final void Cwx() {
    }

    @Override // X.InterfaceC18130ux
    public final void Cvs(C0TY c0ty) {
        this.A00 = c0ty;
        if (this.A04 == EnumC108504ub.HIT_DANGER_ZONE) {
            C0TY c0ty2 = C0TY.RED;
            if (c0ty == c0ty2) {
                C0TY c0ty3 = this.A03;
                if (c0ty3 != C0TY.YELLOW && c0ty3 != c0ty2) {
                    return;
                }
            } else {
                C0TY c0ty4 = C0TY.YELLOW;
                if (c0ty != c0ty4 || this.A03 != c0ty4) {
                    return;
                }
            }
            this.A02 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r6.A01 != X.C0TY.RED) goto L6;
     */
    @Override // X.C0L3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cx1() {
        /*
            r6 = this;
            X.4ub r5 = r6.A05
            X.4ub r2 = X.EnumC108504ub.IN_DANGER_ZONE
            if (r5 != r2) goto Ld
            X.0TY r1 = r6.A01
            X.0TY r0 = X.C0TY.RED
            r4 = 1
            if (r1 == r0) goto Le
        Ld:
            r4 = 0
        Le:
            X.4ub r3 = r6.A04
            if (r3 != r2) goto L46
            X.0TY r0 = r6.A00
            X.0TY r2 = X.C0TY.RED
            if (r0 != r2) goto L3d
            X.0TY r1 = r6.A03
            X.0TY r0 = X.C0TY.YELLOW
            if (r1 == r0) goto L20
            if (r1 != r2) goto L46
        L20:
            r1 = 1
        L21:
            boolean r0 = r6.A02
            if (r0 != 0) goto L29
            if (r4 != 0) goto L29
            if (r1 == 0) goto L3c
        L29:
            X.0TY r2 = r6.A01
            X.0TY r1 = r6.A00
            X.0TY r0 = r6.A03
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r3, r2, r1, r0}
            java.lang.String r0 = "Expected application restart due to Memory-Red. JavaMode: %s, SpaceMode: %s, JavaState: %s, SpaceState: %s, SpaceThreshold: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.C03850Ja.A00(r0)
        L3c:
            return
        L3d:
            X.0TY r1 = X.C0TY.YELLOW
            if (r0 != r1) goto L46
            X.0TY r0 = r6.A03
            if (r0 != r1) goto L46
            goto L20
        L46:
            r1 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108494ua.Cx1():void");
    }

    @Override // X.InterfaceC18490vb
    public final void DO4(C0TY c0ty) {
        this.A01 = c0ty;
        if (this.A05 == EnumC108504ub.HIT_DANGER_ZONE && c0ty == C0TY.RED) {
            this.A02 = true;
        }
    }
}
