package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LfI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48640LfI implements InterfaceC58042PoS {
    public C189478aR A00;
    public String A01;
    public final Context A02;
    public final C49523Luc A03;
    public final UserSession A04;
    public final C8BK A05;
    public final MOX A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;
    public final Activity A09;
    public final AnonymousClass841 A0A;
    public final C47Z A0B;

    public C48640LfI(Activity activity, Context context, UserSession userSession, AnonymousClass841 anonymousClass841, C8BK c8bk, MOX mox, C47Z c47z, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        AbstractC167007dF.A1D(context, 1, userSession);
        this.A02 = context;
        this.A04 = userSession;
        this.A09 = activity;
        this.A0B = c47z;
        this.A0A = anonymousClass841;
        this.A08 = z;
        this.A05 = c8bk;
        this.A06 = mox;
        this.A07 = interfaceC16820sZ;
        this.A03 = new C49523Luc(this, 1);
        if (!C1H6.A03() && !AbstractC43840Ja3.A00(userSession)) {
            activity.getTheme().applyStyle(R.style.MusicCreationLightOverlayTheme, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r12, 36323483315154217L) != false) goto L28;
     */
    @Override // X.InterfaceC58042PoS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Eo2(X.EnumC46263Kdv r24, X.EnumC203578zI r25, com.instagram.music.common.model.AudioOverlayTrack r26, java.lang.Integer r27, java.lang.String r28, java.util.Map r29) {
        /*
            r23 = this;
            r3 = 1
            r0 = 9
            r1 = r27
            X.C14360o3.A0B(r1, r3)
            if (r26 != 0) goto La5
            r2 = r23
            com.instagram.common.session.UserSession r12 = r2.A04
            X.JQ1.A0k(r12, r1)
            int r1 = r1.intValue()
            if (r1 == r0) goto Lba
            r0 = 10
            if (r1 == r0) goto Lb6
            r0 = 0
            if (r1 == r0) goto Lb2
            r7 = 0
        L1f:
            X.8aR r0 = r2.A00
            if (r0 != 0) goto La5
            boolean r0 = A00(r2)
            if (r0 != 0) goto La5
            boolean r0 = X.C36A.A0D(r12)
            if (r0 == 0) goto La9
            com.instagram.music.common.constants.AudioTrackType r0 = com.instagram.music.common.constants.AudioTrackType.A04
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.of(r0)
        L35:
            X.81f r15 = X.EnumC1810381f.A02
            X.8BK r0 = r2.A05
            java.lang.String r16 = r0.BVY()
            com.instagram.api.schemas.MusicProduct r11 = com.instagram.api.schemas.MusicProduct.A0G
            X.C14360o3.A0A(r9)
            java.lang.String r5 = r2.A01
            boolean r0 = r2.A08
            if (r0 == 0) goto L50
            if (r5 == 0) goto L50
            boolean r0 = X.AbstractC001900j.A0T(r5)
            if (r0 == 0) goto L51
        L50:
            r5 = 0
        L51:
            boolean r0 = X.C1H6.A03()
            if (r0 != 0) goto L66
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36323483315154217(0x810c0400012d29, double:3.034455339206402E-306)
            boolean r0 = X.C18U.A06(r4, r12, r0)
            r21 = 1
            if (r0 == 0) goto L68
        L66:
            r21 = 0
        L68:
            r10 = 0
            r20 = 0
            r6 = r24
            r8 = r25
            r19 = r29
            r13 = r10
            r14 = r10
            r17 = r10
            r18 = r5
            r22 = r20
            X.N6v r5 = X.OPX.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.Luc r0 = r2.A03
            r5.A05 = r0
            r2.A01 = r10
            boolean r0 = X.AbstractC43840Ja3.A00(r12)
            if (r0 == 0) goto La6
            X.2q3 r4 = X.EnumC60792q3.A03
        L8b:
            X.8aO r1 = X.AbstractC31177DnL.A0X(r12, r3)
            r1.A0x = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03 = r0
            r1.A0O = r4
            r1.A0T = r5
            X.8aR r1 = r1.A00()
            android.content.Context r0 = r2.A02
            X.8aR r0 = r1.A03(r0, r5)
            r2.A00 = r0
        La5:
            return
        La6:
            X.2q3 r4 = X.EnumC60792q3.A02
            goto L8b
        La9:
            com.instagram.music.common.constants.AudioTrackType r1 = com.instagram.music.common.constants.AudioTrackType.A03
            com.instagram.music.common.constants.AudioTrackType r0 = com.instagram.music.common.constants.AudioTrackType.A04
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.of(r1, r0)
            goto L35
        Lb2:
            X.8BN r7 = X.C8BN.AUDIO_EDITOR_CHANGE_AUDIO
            goto L1f
        Lb6:
            X.8BN r7 = X.C8BN.POST_CAPTURE_AUDIO_BUTTON
            goto L1f
        Lba:
            X.8BN r7 = X.C8BN.POST_CAPTURE_AUDIO_BROWSE
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48640LfI.Eo2(X.Kdv, X.8zI, com.instagram.music.common.model.AudioOverlayTrack, java.lang.Integer, java.lang.String, java.util.Map):void");
    }

    public static final boolean A00(C48640LfI c48640LfI) {
        if (c48640LfI.A0B.A5i) {
            if (!C18U.A06(C06090Tz.A06, c48640LfI.A04, 36313974257551706L)) {
                C193328hC A0I = AbstractC31171DnF.A0I(c48640LfI.A02);
                A0I.A0A(2131952324);
                A0I.A09(2131952323);
                AbstractC31176DnK.A16(null, A0I, 2131968948);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC58042PoS
    public final void dismiss() {
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            c189478aR.A07();
        }
        this.A00 = null;
    }
}
