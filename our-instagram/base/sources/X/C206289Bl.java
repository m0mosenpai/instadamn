package X;

import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9Bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206289Bl extends C0T6 {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C206289Bl(java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, int r13) {
        /*
            r8 = this;
            r7 = r12
            r6 = r11
            r5 = r10
            r4 = r9
            r2 = 0
            r0 = 0
            r1 = r8
            r8.A00 = r0
            r3 = r2
            r0 = r13 & 1
            if (r0 == 0) goto Lf
            r4 = r2
        Lf:
            r0 = r13 & 2
            if (r0 == 0) goto L14
            r5 = r2
        L14:
            r0 = r13 & 4
            if (r0 == 0) goto L19
            r6 = r2
        L19:
            r0 = r13 & 8
            if (r0 == 0) goto L1e
            r7 = r2
        L1e:
            r0 = r13 & 32
            if (r0 == 0) goto L24
            X.7Nc r3 = X.EnumC161927Nc.A08
        L24:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206289Bl.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206289Bl.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206289Bl.hashCode():int");
    }

    public final String toString() {
        if (4 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NewsfeedFollow(followUser=");
        sb.append(this.A02);
        sb.append(", following=");
        sb.append(this.A03);
        sb.append(", outgoing=");
        sb.append(this.A06);
        sb.append(", incomingRequest=");
        sb.append(this.A05);
        sb.append(", followBackEnabled=");
        sb.append(this.A01);
        sb.append(", friendingConfig=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C206289Bl(C161947Ne c161947Ne, EnumC161927Nc enumC161927Nc, Integer num, Integer num2, Integer num3, Integer num4) {
        C14360o3.A0B(enumC161927Nc, 6);
        this.A04 = num;
        this.A01 = num2;
        this.A03 = num3;
        this.A02 = num4;
        this.A05 = c161947Ne;
        this.A06 = enumC161927Nc;
    }

    public C206289Bl(C51755Mte c51755Mte, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        C14360o3.A0B(user, 1);
        this.A02 = user;
        this.A03 = bool;
        this.A06 = bool2;
        this.A05 = bool3;
        this.A01 = bool4;
        this.A04 = c51755Mte;
    }

    public C206289Bl(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16660sJ interfaceC16660sJ5) {
        this.A06 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
        this.A03 = interfaceC16660sJ3;
        this.A01 = interfaceC16820sZ;
        this.A04 = interfaceC16660sJ4;
        this.A05 = interfaceC16660sJ5;
    }

    public C206289Bl(C26084BgD c26084BgD, C4F3 c4f3, C4FL c4fl, Integer num, List list, List list2) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A04 = c4f3;
        this.A03 = c4fl;
        this.A02 = num;
        this.A06 = c26084BgD;
        this.A05 = list2;
    }

    public C206289Bl(C9C6 c9c6, C26082BgB c26082BgB, C6PT c6pt, C38321qM c38321qM, C75113Zb c75113Zb, IgShowreelComposition igShowreelComposition) {
        this.A06 = c6pt;
        this.A05 = igShowreelComposition;
        this.A02 = c38321qM;
        this.A04 = c75113Zb;
        this.A03 = c9c6;
        this.A01 = c26082BgB;
    }
}
