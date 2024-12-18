package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.KaH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46060KaH extends AnonymousClass772 {
    public final int A00 = 3;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46060KaH(Context context, C45487KCc c45487KCc, int i) {
        super(Integer.valueOf(i));
        this.A02 = c45487KCc;
        this.A01 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto Lce;
                case 1: goto L81;
                case 2: goto L6f;
                default: goto L5;
            }
        L5:
            android.os.Bundle r5 = X.AbstractC166987dD.A0b()
            java.lang.Object r6 = r10.A02
            X.KCc r6 = (X.C45487KCc) r6
            X.0do r4 = r6.A0i
            X.0ll r3 = X.AbstractC166987dD.A0o(r4)
            r2 = 0
            X.0Tz r7 = X.AbstractC25225BEi.A0j(r3, r2)
            r0 = 36329290111074549(0x81114c000340f5, double:3.0381275803285104E-306)
            boolean r0 = X.C18U.A06(r7, r3, r0)
            r3 = 1
            if (r0 == 0) goto L4e
            java.lang.Object r1 = r10.A01
            X.KQx r1 = (X.C45842KQx) r1
            X.Jwx r0 = r1.A07
            if (r0 == 0) goto L47
            java.lang.String r0 = "arg_launch_music_flow"
        L2e:
            r5.putBoolean(r0, r3)
        L31:
            java.lang.String r0 = "arg_is_from_try_it"
            r5.putBoolean(r0, r3)
            X.MRK r0 = r6.A0P
            if (r0 == 0) goto L3d
            r0.Dvw(r5)
        L3d:
            X.6Dc r1 = X.AbstractC43594JPz.A0V(r4)
            X.KeZ r0 = X.EnumC46303KeZ.A0U
            r1.A0D(r0)
        L46:
            return
        L47:
            com.instagram.api.schemas.NotePogVideoDict r0 = r1.A03
            if (r0 == 0) goto L31
            java.lang.String r0 = "arg_launch_video_flow"
            goto L2e
        L4e:
            X.0ll r2 = X.AbstractC25230BEn.A0k(r4, r2)
            r0 = 36329290111140086(0x81114c000440f6, double:3.038127580369956E-306)
            boolean r0 = X.C18U.A06(r7, r2, r0)
            if (r0 == 0) goto L31
            java.lang.Object r1 = r10.A01
            X.KQx r1 = (X.C45842KQx) r1
            X.Jwx r0 = r1.A07
            if (r0 == 0) goto L68
            java.lang.String r0 = "arg_show_music_tooltip"
            goto L2e
        L68:
            com.instagram.api.schemas.NotePogVideoDict r0 = r1.A03
            if (r0 == 0) goto L31
            java.lang.String r0 = "arg_show_video_tooltip"
            goto L2e
        L6f:
            java.lang.Object r0 = r10.A02
            X.KCc r0 = (X.C45487KCc) r0
            X.MRK r1 = r0.A0P
            if (r1 == 0) goto L46
            java.lang.Object r0 = r10.A01
            java.lang.String r0 = X.AbstractC31171DnF.A0g(r0)
            r1.Cs1(r0)
            return
        L81:
            java.lang.Object r1 = r10.A02
            X.KCc r1 = (X.C45487KCc) r1
            android.view.View r0 = r1.mView
            if (r0 == 0) goto Lcc
            int r4 = r0.getHeight()
            android.content.Context r2 = r1.requireContext()
            boolean r1 = X.C14640oc.A04()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r1 == 0) goto L9d
            r0 = 2131165200(0x7f070010, float:1.794461E38)
        L9d:
            int r1 = X.AbstractC167017dG.A0E(r2)
            int r0 = X.AbstractC166997dE.A04(r2, r0)
            int r1 = r1 + r0
            r0 = 2130968783(0x7f0400cf, float:1.754623E38)
            int r0 = X.AbstractC53242c7.A0G(r2, r0)
            int r1 = r1 + r0
            int r4 = r4 + r1
        Laf:
            X.1vu r3 = X.C41451vu.A01
            X.6i8 r2 = X.AbstractC31171DnF.A0K()
            java.lang.Object r0 = r10.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131965274(0x7f13355a, float:1.9567353E38)
            X.AbstractC31172DnG.A1H(r1, r2, r0)
            r2.A02 = r4
            r0 = 1
            r2.A0R = r0
            X.AbstractC31178DnM.A1N(r3, r2)
            return
        Lcc:
            r4 = 0
            goto Laf
        Lce:
            java.lang.Object r2 = r10.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.Object r1 = r10.A02
            X.KDK r1 = (X.KDK) r1
            X.0do r0 = r1.A0Q
            com.instagram.common.session.UserSession r5 = X.AbstractC166987dD.A0r(r0)
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            java.lang.String r7 = r1.A0N
            java.lang.String r8 = r2.getId()
            r4 = 0
            r9 = 0
            r6 = r4
            X.LKo.A01(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46060KaH.onClick(android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46060KaH(KDK kdk, User user, int i) {
        super(Integer.valueOf(i));
        this.A01 = user;
        this.A02 = kdk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46060KaH(C45487KCc c45487KCc, C45842KQx c45842KQx, int i) {
        super(Integer.valueOf(i));
        this.A02 = c45487KCc;
        this.A01 = c45842KQx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46060KaH(C45487KCc c45487KCc, User user, int i) {
        super(Integer.valueOf(i));
        this.A02 = c45487KCc;
        this.A01 = user;
    }
}
