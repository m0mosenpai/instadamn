package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;

/* renamed from: X.LfJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48641LfJ implements InterfaceC58042PoS {
    public C189478aR A00;
    public final Context A01;
    public final Fragment A02;
    public final C49523Luc A03;
    public final UserSession A04;
    public final AnonymousClass840 A05;
    public final String A06;
    public final InterfaceC09390do A07;
    public final C47Z A08;

    public C48641LfJ(Context context, Fragment fragment, UserSession userSession, AnonymousClass840 anonymousClass840, C47Z c47z) {
        C14360o3.A0B(anonymousClass840, 3);
        this.A01 = context;
        this.A04 = userSession;
        this.A05 = anonymousClass840;
        this.A02 = fragment;
        this.A08 = c47z;
        this.A06 = AbstractC167017dG.A0j();
        this.A07 = AbstractC09440dt.A01(MF7.A00);
        this.A03 = new C49523Luc(this, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13, 36323483315154217L) != false) goto L19;
     */
    @Override // X.InterfaceC58042PoS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Eo2(X.EnumC46263Kdv r25, X.EnumC203578zI r26, com.instagram.music.common.model.AudioOverlayTrack r27, java.lang.Integer r28, java.lang.String r29, java.util.Map r30) {
        /*
            r24 = this;
            r7 = 0
            r2 = 1
            r1 = r28
            X.C14360o3.A0B(r1, r2)
            r3 = r24
            com.instagram.common.session.UserSession r13 = r3.A04
            com.instagram.api.schemas.SoundPlatformProduct r5 = com.instagram.api.schemas.SoundPlatformProduct.A0F
            boolean r0 = X.IRU.A01(r5, r13)
            if (r0 == 0) goto L25
            X.0do r0 = r3.A07
            java.lang.Object r4 = r0.getValue()
            X.30S r4 = (X.C30S) r4
            android.content.Context r1 = r3.A01
            java.lang.String r0 = X.IRU.A00(r5, r13)
            r4.A00(r1, r0, r2)
        L24:
            return
        L25:
            r6 = r27
            if (r27 != 0) goto La9
            X.JQ1.A0k(r13, r1)
            X.8aR r0 = r3.A00
            if (r0 != 0) goto L24
            boolean r0 = r3.A00()
            if (r0 != 0) goto L24
            boolean r0 = X.C36A.A0D(r13)
            if (r0 == 0) goto La0
            com.instagram.music.common.constants.AudioTrackType r0 = com.instagram.music.common.constants.AudioTrackType.A04
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of(r0)
        L42:
            X.81f r16 = X.EnumC1810381f.A02
            java.lang.String r5 = r3.A06
            com.instagram.api.schemas.MusicProduct r12 = com.instagram.api.schemas.MusicProduct.A0G
            X.C14360o3.A0A(r10)
            X.8BN r8 = X.C8BN.SHARE_SHEET
            boolean r0 = X.C1H6.A03()
            if (r0 != 0) goto L62
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36323483315154217(0x810c0400012d29, double:3.034455339206402E-306)
            boolean r0 = X.C18U.A06(r4, r13, r0)
            r22 = 1
            if (r0 == 0) goto L64
        L62:
            r22 = 0
        L64:
            r23 = 0
            r9 = r7
            r11 = r7
            r14 = r7
            r15 = r7
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r2
            r17 = r5
            X.N6v r5 = X.OPX.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.Luc r0 = r3.A03
            r5.A05 = r0
            boolean r0 = X.AbstractC43840Ja3.A00(r13)
            if (r0 == 0) goto L9d
            X.2q3 r4 = X.EnumC60792q3.A03
        L84:
            X.8aO r1 = X.AbstractC31177DnL.A0X(r13, r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03 = r0
            r1.A0O = r4
            r1.A0T = r5
            X.8aR r1 = r1.A00()
            android.content.Context r0 = r3.A01
            X.8aR r0 = r1.A03(r0, r5)
            r3.A00 = r0
            return
        L9d:
            X.2q3 r4 = X.EnumC60792q3.A02
            goto L84
        La0:
            com.instagram.music.common.constants.AudioTrackType r1 = com.instagram.music.common.constants.AudioTrackType.A03
            com.instagram.music.common.constants.AudioTrackType r0 = com.instagram.music.common.constants.AudioTrackType.A04
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of(r1, r0)
            goto L42
        La9:
            X.840 r5 = r3.A05
            android.os.Bundle r4 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = "args_audio_track"
            r4.putParcelable(r0, r6)
            com.instagram.creation.base.CreationSession r1 = X.AbstractC43593JPy.A0R(r5)
            java.lang.String r0 = "args_creation_session"
            r4.putParcelable(r0, r1)
            X.22P r0 = r5.A01
            int r1 = r0.ordinal()
            java.lang.String r0 = "args_creation_entry_point"
            r4.putInt(r0, r1)
            java.lang.String r0 = "args_has_existing_snippet_selection"
            r4.putBoolean(r0, r2)
            androidx.fragment.app.Fragment r3 = r3.A02
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 2171(0x87b, float:3.042E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.6XJ r1 = X.AbstractC31174DnI.A0a(r2, r4, r13, r1, r0)
            r0 = 1004(0x3ec, float:1.407E-42)
            r1.A0D(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48641LfJ.Eo2(X.Kdv, X.8zI, com.instagram.music.common.model.AudioOverlayTrack, java.lang.Integer, java.lang.String, java.util.Map):void");
    }

    private final boolean A00() {
        C193328hC A0I;
        int i;
        C47Z c47z = this.A08;
        if (c47z.A5i) {
            if (!C18U.A06(C06090Tz.A06, this.A04, 36313974257551706L)) {
                A0I = AbstractC31171DnF.A0I(this.A01);
                A0I.A0A(2131952324);
                i = 2131952323;
                A0I.A09(i);
                AbstractC31176DnK.A16(null, A0I, 2131968948);
                return true;
            }
        }
        if (c47z.A1F == EnumC76383bi.A07) {
            A0I = AbstractC31171DnF.A0I(this.A01);
            A0I.A0A(2131952324);
            i = 2131952325;
            A0I.A09(i);
            AbstractC31176DnK.A16(null, A0I, 2131968948);
            return true;
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

    public final void A01(JIN jin) {
        int i;
        if (!A00()) {
            if (jin.CBi() == AudioType.A04) {
                i = jin.CAB();
            } else {
                i = 30000;
            }
            AudioOverlayTrack A00 = AbstractC54060NvK.A00(jin, i);
            AnonymousClass840 anonymousClass840 = this.A05;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("args_audio_track", A00);
            A0b.putParcelable("args_creation_session", AbstractC43593JPy.A0R(anonymousClass840));
            A0b.putInt("args_creation_entry_point", anonymousClass840.A01.ordinal());
            A0b.putBoolean("args_has_existing_snippet_selection", false);
            Fragment fragment = this.A02;
            AbstractC31174DnI.A0a(fragment.requireActivity(), A0b, this.A04, ModalActivity.class, AbstractC111324zv.A00(2171)).A0D(fragment, 1004);
        }
    }
}
