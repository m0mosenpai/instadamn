package X;

import com.facebook.R;

/* loaded from: classes8.dex */
public final class LIF {
    public static final int A00(AbstractC46972Dl abstractC46972Dl) {
        C14360o3.A0B(abstractC46972Dl, 0);
        if (abstractC46972Dl.equals(C132705yt.A00)) {
            return 2131962592;
        }
        if (abstractC46972Dl.equals(C47032Dr.A00)) {
            return 2131962588;
        }
        if (abstractC46972Dl.equals(C47062Du.A00)) {
            return 2131962577;
        }
        if (abstractC46972Dl.equals(C46962Dk.A00)) {
            return 2131962584;
        }
        if (abstractC46972Dl.equals(C132695ys.A00)) {
            return 2131962579;
        }
        throw AbstractC37303Gc4.A0M(abstractC46972Dl, "Unrecognized inbox mode for viewMode filter title: ", AbstractC166987dD.A1C());
    }

    public static final Integer A01(AbstractC46972Dl abstractC46972Dl) {
        int i;
        C14360o3.A0B(abstractC46972Dl, 0);
        if (abstractC46972Dl.equals(C132705yt.A00)) {
            i = R.drawable.instagram_mail_arrow_right_pano_outline_24;
        } else if (abstractC46972Dl.equals(C47032Dr.A00)) {
            i = R.drawable.instagram_mail_check_pano_outline_24;
        } else if (abstractC46972Dl.equals(C47062Du.A00)) {
            i = R.drawable.instagram_channels_pano_outline_24;
        } else if (abstractC46972Dl.equals(C46962Dk.A00)) {
            i = R.drawable.instagram_folder_pano_outline_24;
        } else if (abstractC46972Dl.equals(C132695ys.A00)) {
            i = R.drawable.instagram_mail_pano_outline_24;
        } else {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (X.C14360o3.A0K(r8, X.C132695ys.A00) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09530e4 A02(com.instagram.common.session.UserSession r6, X.EnumC46214Kcq r7, X.AbstractC46972Dl r8) {
        /*
            r5 = this;
            r2 = 0
            boolean r0 = X.AbstractC167007dF.A1R(r2, r7, r6)
            int r1 = r7.ordinal()
            if (r1 == r2) goto L9b
            if (r1 == r0) goto L61
            r0 = 2
            if (r1 == r0) goto L43
            r0 = 3
            if (r1 == r0) goto L1c
            X.0sl r2 = X.C16930sl.A00
        L15:
            X.0sl r1 = X.C16930sl.A00
        L17:
            X.0e4 r0 = X.AbstractC166987dD.A1L(r2, r1)
            return r0
        L1c:
            X.JYm r0 = X.EnumC43799JYm.A0B
            X.JYm[] r0 = new X.EnumC43799JYm[]{r0}
            java.util.ArrayList r2 = X.AbstractC16960so.A1M(r0)
            boolean r0 = X.C2E9.A08(r6)
            if (r0 == 0) goto L15
            X.JYm r0 = X.EnumC43799JYm.A06
            r2.add(r0)
            X.JYm r0 = X.EnumC43799JYm.A0I
            r2.add(r0)
            X.JYm r0 = X.EnumC43799JYm.A0J
            r2.add(r0)
            X.JYm r0 = X.EnumC43799JYm.A0L
            r2.add(r0)
            X.JYm r0 = X.EnumC43799JYm.A0H
            goto L5d
        L43:
            X.JYm r4 = X.EnumC43799JYm.A0K
            X.JYm r3 = X.EnumC43799JYm.A0D
            X.JYm r2 = X.EnumC43799JYm.A07
            X.JYm r1 = X.EnumC43799JYm.A0P
            X.JYm r0 = X.EnumC43799JYm.A09
            X.JYm[] r0 = new X.EnumC43799JYm[]{r4, r3, r2, r1, r0}
            java.util.ArrayList r2 = X.AbstractC16960so.A1M(r0)
            boolean r0 = X.C2E9.A08(r6)
            if (r0 == 0) goto L15
            X.JYm r0 = X.EnumC43799JYm.A0M
        L5d:
            r2.add(r0)
            goto L15
        L61:
            boolean r0 = X.C2E9.A0A(r6)
            if (r0 == 0) goto L94
            X.JYm r2 = X.EnumC43799JYm.A0O
            X.JYm r1 = X.EnumC43799JYm.A0N
            X.JYm r0 = X.EnumC43799JYm.A0F
            X.JYm[] r0 = new X.EnumC43799JYm[]{r2, r1, r0}
            java.util.List r2 = X.AbstractC16960so.A1Q(r0)
        L75:
            X.2Dr r0 = X.C47032Dr.A00
            boolean r0 = X.C14360o3.A0K(r8, r0)
            if (r0 != 0) goto L8d
            X.2Du r0 = X.C47062Du.A00
            boolean r0 = X.C14360o3.A0K(r8, r0)
            if (r0 != 0) goto L8d
            X.5ys r0 = X.C132695ys.A00
            boolean r0 = X.C14360o3.A0K(r8, r0)
            if (r0 == 0) goto L15
        L8d:
            X.2Du r0 = X.C47062Du.A00
            java.util.List r1 = X.AbstractC166987dD.A1J(r0)
            goto L17
        L94:
            X.JYm r0 = X.EnumC43799JYm.A0O
            java.util.List r2 = X.AbstractC166987dD.A1J(r0)
            goto L75
        L9b:
            X.0sl r2 = X.C16930sl.A00
            X.5ys r1 = X.C132695ys.A00
            X.5yt r0 = X.C132705yt.A00
            X.2Dl[] r0 = new X.AbstractC46972Dl[]{r1, r0}
            java.util.ArrayList r1 = X.AbstractC16960so.A1M(r0)
            boolean r0 = X.C2E9.A08(r6)
            if (r0 == 0) goto L17
            X.2Dk r0 = X.C46962Dk.A00
            r1.add(r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LIF.A02(com.instagram.common.session.UserSession, X.Kcq, X.2Dl):X.0e4");
    }
}
