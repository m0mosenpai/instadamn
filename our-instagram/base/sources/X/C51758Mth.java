package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ProductTileTextColorType;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mth, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51758Mth extends C0T6 {
    public Object A00;
    public boolean A01;
    public final int A02;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51758Mth.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51758Mth.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String A00;
        switch (this.A02) {
            case 0:
                A1C = AbstractC166987dD.A1C();
                A1C.append("BwPStickyUTM(initialStickyUTM=");
                A1C.append(this.A00);
                A1C.append(", isStickyUTMEnabled=");
                A1C.append(this.A01);
                return AbstractC167017dG.A0p(A1C);
            case 1:
                A1C = AbstractC166987dD.A1C();
                A1C.append("LeafData(isVisible=");
                A1C.append(this.A01);
                A00 = ", boundsOnScreen=";
                A1C.append(A00);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            case 49:
                A1C = AbstractC166987dD.A1C();
                A1C.append("CtdMimicryBannerUiState(shouldShowBanner=");
                A1C.append(this.A01);
                A00 = AbstractC43591JPw.A00(23);
                A1C.append(A00);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(C50679MYx c50679MYx, int i, boolean z) {
        this(8, (i & 2) != 0 ? null : c50679MYx, MSX.A1T(i, z));
        this.A02 = 8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(C5QE c5qe, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this((C5QE) MVZ.A00(""), false);
        this.A02 = 7;
    }

    public C51758Mth(AbstractC130335ud abstractC130335ud, boolean z) {
        this.A02 = 28;
        C14360o3.A0B(abstractC130335ud, 1);
        this.A00 = abstractC130335ud;
        this.A01 = z;
    }

    public C51758Mth(C9t4 c9t4, boolean z) {
        this.A02 = 13;
        C14360o3.A0B(c9t4, 1);
        this.A00 = c9t4;
        this.A01 = z;
    }

    public C51758Mth(AbstractC53540Nm7 abstractC53540Nm7, boolean z) {
        this.A02 = 43;
        C14360o3.A0B(abstractC53540Nm7, 1);
        this.A00 = abstractC53540Nm7;
        this.A01 = z;
    }

    public C51758Mth(ProductTileTextColorType productTileTextColorType, boolean z) {
        this.A02 = 41;
        C14360o3.A0B(productTileTextColorType, 1);
        this.A00 = productTileTextColorType;
        this.A01 = z;
    }

    public C51758Mth(DirectThreadKey directThreadKey, boolean z) {
        this.A02 = 25;
        C14360o3.A0B(directThreadKey, 1);
        this.A00 = directThreadKey;
        this.A01 = z;
    }

    public C51758Mth(JWd jWd, boolean z) {
        this.A02 = 36;
        C14360o3.A0B(jWd, 2);
        this.A01 = z;
        this.A00 = jWd;
    }

    public C51758Mth(User user, boolean z, int i) {
        this.A02 = i;
        C14360o3.A0B(user, 1);
        this.A00 = user;
        this.A01 = z;
    }

    public C51758Mth(int i, boolean z, List list) {
        this.A02 = i;
        switch (i) {
            case 3:
            case 4:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(list, 1);
                break;
        }
        this.A00 = list;
        this.A01 = z;
    }

    public C51758Mth(Integer num, int i, boolean z) {
        this.A02 = i;
        switch (i) {
            case 14:
            case 44:
                C14360o3.A0B(num, 1);
                break;
        }
        this.A00 = num;
        this.A01 = z;
    }

    public C51758Mth(boolean z, User user, int i) {
        this.A02 = 6;
        C14360o3.A0B(user, 2);
        this.A01 = z;
        this.A00 = user;
    }

    public C51758Mth(boolean z, Integer num, int i) {
        this.A02 = i;
        switch (i) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 17:
            case 24:
                break;
            default:
                C14360o3.A0B(num, 2);
                break;
        }
        this.A01 = z;
        this.A00 = num;
    }

    public C51758Mth(boolean z, List list, int i) {
        this.A02 = i;
        switch (i) {
            case 2:
            case 5:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 26:
            case 31:
                C14360o3.A0B(list, 2);
                break;
        }
        this.A01 = z;
        this.A00 = list;
    }

    public C51758Mth(C5QE c5qe, boolean z) {
        this.A02 = 7;
        this.A01 = z;
        this.A00 = c5qe;
    }

    public C51758Mth(C45126Jxv c45126Jxv, boolean z) {
        this.A02 = 18;
        this.A01 = z;
        this.A00 = c45126Jxv;
    }

    public C51758Mth(InterfaceC37273GbQ interfaceC37273GbQ, boolean z) {
        this.A02 = 30;
        this.A01 = z;
        this.A00 = interfaceC37273GbQ;
    }

    public C51758Mth(C32110E9i c32110E9i, boolean z) {
        this.A02 = 40;
        this.A00 = c32110E9i;
        this.A01 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(EnumC76383bi enumC76383bi, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(15, (Object) null, true);
        this.A02 = 15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(PromoteAudiencePotentialReach promoteAudiencePotentialReach, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(11, (Object) null, true);
        this.A02 = 11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this((Integer) null, 16, false);
        this.A02 = 16;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(Long l, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(29, (Object) null, false);
        this.A02 = 29;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(C122995ha c122995ha) {
        this(34, (Object) c122995ha, false);
        this.A02 = 34;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(Object obj) {
        this(35, obj, false);
        this.A02 = 35;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth() {
        this(0, (Object) null, false);
        this.A02 = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51758Mth(JWd jWd, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(new JWd((String) null, (DefaultConstructorMarker) null, (C5Hc) null, 7, 15, false), true);
        this.A02 = 36;
    }

    public C51758Mth(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51758Mth(java.util.List r3, int r4, int r5) {
        /*
            r2 = this;
            r2.A02 = r5
            r1 = 0
            switch(r5) {
                case 2: goto L14;
                case 3: goto L6;
                case 4: goto L6;
                case 5: goto L12;
                default: goto L6;
            }
        L6:
            r0 = r4 & 2
            if (r0 == 0) goto Lc
            X.0sl r3 = X.C16930sl.A00
        Lc:
            r0 = 19
        Le:
            r2.<init>(r1, r3, r0)
            return
        L12:
            r0 = 5
            goto Le
        L14:
            r0 = r4 & 2
            if (r0 == 0) goto L1a
            X.0sl r3 = X.C16930sl.A00
        L1a:
            r0 = 2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51758Mth.<init>(java.util.List, int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51758Mth(boolean r4, java.lang.Integer r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8) {
        /*
            r3 = this;
            r3.A02 = r8
            switch(r8) {
                case 17: goto L14;
                case 22: goto Le;
                default: goto L5;
            }
        L5:
            r2 = 0
            java.lang.Integer r1 = X.C05F.A00
            r0 = 48
        La:
            r3.<init>(r2, r1, r0)
            return
        Le:
            r2 = 0
            java.lang.Integer r1 = X.C05F.A0C
            r0 = 22
            goto La
        L14:
            r2 = 1
            r1 = 0
            r0 = 17
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51758Mth.<init>(boolean, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51758Mth(java.util.List r2, int r3, int r4, boolean r5) {
        /*
            r1 = this;
            r1.A02 = r4
            r0 = r3 & 1
            switch(r4) {
                case 4: goto L2c;
                case 5: goto L7;
                case 6: goto L7;
                case 7: goto L7;
                case 8: goto L7;
                case 9: goto L21;
                case 10: goto L16;
                default: goto L7;
            }
        L7:
            if (r0 == 0) goto Lb
            X.0sl r2 = X.C16930sl.A00
        Lb:
            r0 = r3 & 2
            if (r0 == 0) goto L10
            r5 = 1
        L10:
            r0 = 46
        L12:
            r1.<init>(r0, r5, r2)
            return
        L16:
            if (r0 == 0) goto L19
            r2 = 0
        L19:
            r0 = r3 & 2
            if (r0 == 0) goto L1e
            r5 = 0
        L1e:
            r0 = 10
            goto L12
        L21:
            if (r0 == 0) goto L24
            r2 = 0
        L24:
            r0 = r3 & 2
            if (r0 == 0) goto L29
            r5 = 0
        L29:
            r0 = 9
            goto L12
        L2c:
            if (r0 == 0) goto L30
            X.0sl r2 = X.C16930sl.A00
        L30:
            r0 = r3 & 2
            if (r0 == 0) goto L35
            r5 = 0
        L35:
            r0 = 4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51758Mth.<init>(java.util.List, int, int, boolean):void");
    }
}
