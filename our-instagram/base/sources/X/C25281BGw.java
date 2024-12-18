package X;

import com.instagram.creatortools.api.schemas.CreatorToolsComponent;

/* renamed from: X.BGw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25281BGw extends C0T6 {
    public final int A00 = 2;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C25281BGw(MUP mup, AbstractC107294sa abstractC107294sa, java.util.Set set, C5Hc c5Hc, C5Hc c5Hc2, int i) {
        C14360o3.A0B(abstractC107294sa, 1);
        AbstractC167007dF.A1F(set, 2, c5Hc2);
        this.A04 = abstractC107294sa;
        this.A03 = set;
        this.A06 = c5Hc;
        this.A02 = c5Hc2;
        this.A01 = i;
        this.A05 = mup;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L50;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L8c
            r1 = 2
            boolean r0 = r3 instanceof X.C25281BGw
            if (r0 == 0) goto L4a
            X.BGw r3 = (X.C25281BGw) r3
            int r0 = r3.A00
            if (r0 != r1) goto L4a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r2.A06
            java.lang.Object r0 = r3.A06
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4a
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L4a
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
        L44:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L8c
        L4a:
            r0 = 0
            return r0
        L4c:
            if (r2 == r3) goto L8c
            r1 = 0
            goto L53
        L50:
            if (r2 == r3) goto L8c
            r1 = 1
        L53:
            boolean r0 = r3 instanceof X.C25281BGw
            if (r0 == 0) goto L4a
            X.BGw r3 = (X.C25281BGw) r3
            int r0 = r3.A00
            if (r0 != r1) goto L4a
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L4a
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4a
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L4a
            java.lang.Object r1 = r2.A06
            java.lang.Object r0 = r3.A06
            goto L44
        L8c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25281BGw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0G;
        int A0I;
        switch (this.A00) {
            case 0:
                A0G = (((((((AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + this.A01) * 31;
                A0I = AbstractC166997dE.A0I(this.A06);
                break;
            case 1:
                A0G = (((((((AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + this.A01) * 31;
                A0I = AbstractC166997dE.A0I(this.A06);
                break;
            default:
                A0G = (AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A04)) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A01) * 31;
                A0I = AbstractC166997dE.A0I(this.A05);
                break;
        }
        return A0G + A0I;
    }

    public C25281BGw(C50679MYx c50679MYx, C51746MtV c51746MtV, C51746MtV c51746MtV2, C51746MtV c51746MtV3, CreatorToolsComponent creatorToolsComponent, int i) {
        C14360o3.A0B(creatorToolsComponent, 1);
        this.A02 = creatorToolsComponent;
        this.A03 = c51746MtV;
        this.A04 = c51746MtV2;
        this.A05 = c51746MtV3;
        this.A01 = i;
        this.A06 = c50679MYx;
    }

    public C25281BGw(C51760Mtj c51760Mtj, MUD mud, MUD mud2, InterfaceC37239Gao interfaceC37239Gao, CreatorToolsComponent creatorToolsComponent, int i) {
        C14360o3.A0B(creatorToolsComponent, 1);
        this.A02 = creatorToolsComponent;
        this.A03 = mud;
        this.A04 = mud2;
        this.A05 = interfaceC37239Gao;
        this.A01 = i;
        this.A06 = c51760Mtj;
    }

    public C25281BGw() {
        this((MUP) null, C107284sZ.A00, C16910sj.A00, (C5Hc) null, C5HZ.A01, 0);
    }
}
