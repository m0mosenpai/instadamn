package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3cG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76683cG {
    public final UserSession A00;
    public final InterfaceC75453aC A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9EE(this, 21));

    public static final MUG A00(Context context, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(context, 1);
        ArrayList A0U = AbstractC001800i.A0U(c38321qM.A3Z());
        List coauthorProducers = c38321qM.A0C.getCoauthorProducers();
        if (coauthorProducers != null) {
            A0U.removeAll(coauthorProducers);
        }
        return new MUG(new C76733cL(c38321qM), AbstractC55199Oe9.A01(context, A0U, c38321qM.A5t()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r21.A03 == r19.getColor(com.facebook.R.color.audio_bar_action_color_enabled)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r0 = r20.A1Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r6 = X.AbstractC76643c9.A05(r1, r20.A1K());
        r0 = r20.A1Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r7 = X.AbstractC76643c9.A04(r1, r20.A1K());
        X.C14360o3.A07(r7);
        r0 = r20.A1Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r0 = r20.A1K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r10 = r1.BVV().isExplicit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        return new X.C51761Mtk(32, new X.C92584Cs(X.AbstractC76643c9.A00(r20.A1K()), null, r6, r7, com.facebook.R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, r10, false, false, r13, r14, X.AbstractC76643c9.A0H(r3, r20), X.AbstractC92574Cr.A03(r20.A0C.getClipsMetadata()), false), new X.C76733cL(r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        r10 = r0.isExplicit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0022, code lost:
    
        if (r21 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r21.A0A != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C51761Mtk A01(android.content.Context r19, X.C38321qM r20, X.C77143d0 r21) {
        /*
            r18 = this;
            r9 = 0
            r2 = r20
            X.C14360o3.A0B(r2, r9)
            r1 = 1
            r5 = r19
            X.C14360o3.A0B(r5, r1)
            r0 = r18
            com.instagram.common.session.UserSession r3 = r0.A00
            boolean r0 = r2.A4z()
            if (r0 != 0) goto L18
            r2 = 0
            return r2
        L18:
            r4 = r21
            if (r21 == 0) goto L21
            boolean r0 = r4.A0A
            r13 = 1
            if (r0 == r1) goto L24
        L21:
            r13 = 0
            if (r21 == 0) goto L30
        L24:
            int r1 = r4.A03
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r0 = r5.getColor(r0)
            r14 = 1
            if (r1 == r0) goto L31
        L30:
            r14 = 0
        L31:
            X.3xC r0 = r2.A1Q()
            if (r0 == 0) goto La7
            com.instagram.api.schemas.MusicInfo r1 = r0.A00
        L39:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.A1K()
            java.lang.String r6 = X.AbstractC76643c9.A05(r1, r0)
            X.3xC r0 = r2.A1Q()
            if (r0 == 0) goto La5
            com.instagram.api.schemas.MusicInfo r1 = r0.A00
        L49:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.A1K()
            java.lang.String r7 = X.AbstractC76643c9.A04(r1, r0)
            X.C14360o3.A07(r7)
            X.3xC r0 = r2.A1Q()
            if (r0 == 0) goto La3
            com.instagram.api.schemas.MusicInfo r1 = r0.A00
        L5c:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.A1K()
            if (r1 == 0) goto L9a
            com.instagram.api.schemas.TrackData r0 = r1.BVV()
            boolean r10 = r0.isExplicit()
        L6a:
            r5 = 0
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.A1K()
            X.9Bg r4 = X.AbstractC76643c9.A00(r0)
            boolean r15 = X.AbstractC76643c9.A0H(r3, r2)
            X.1rF r0 = r2.A0C
            X.3x9 r0 = r0.getClipsMetadata()
            boolean r16 = X.AbstractC92574Cr.A03(r0)
            r8 = 2131165249(0x7f070041, float:1.794471E38)
            X.4Cs r3 = new X.4Cs
            r11 = r9
            r12 = r9
            r17 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.3cL r1 = new X.3cL
            r1.<init>(r2)
            r0 = 32
            X.Mtk r2 = new X.Mtk
            r2.<init>(r0, r3, r1)
            return r2
        L9a:
            if (r0 == 0) goto La1
            boolean r10 = r0.isExplicit()
            goto L6a
        La1:
            r10 = 0
            goto L6a
        La3:
            r1 = 0
            goto L5c
        La5:
            r1 = 0
            goto L49
        La7:
            r1 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76683cG.A01(android.content.Context, X.1qM, X.3d0):X.Mtk");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r23.A03 != r21.getColor(com.facebook.R.color.audio_bar_action_color_enabled)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (X.AbstractC76643c9.A0D(r0) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C51761Mtk A02(android.content.Context r21, final X.C38321qM r22, X.C77143d0 r23, final X.C75113Zb r24) {
        /*
            r20 = this;
            r0 = 0
            r3 = r22
            X.C14360o3.A0B(r3, r0)
            r0 = 1
            r2 = r24
            X.C14360o3.A0B(r2, r0)
            r0 = 2
            r7 = r21
            X.C14360o3.A0B(r7, r0)
            r0 = r20
            com.instagram.common.session.UserSession r5 = r0.A00
            X.3aC r1 = r0.A01
            r11 = 0
            X.1rF r0 = r3.A0C
            X.3x9 r0 = r0.getClipsMetadata()
            if (r0 == 0) goto La3
            com.instagram.api.schemas.MusicInfo r4 = r0.BVc()
            if (r4 != 0) goto L2d
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZw()
            if (r4 == 0) goto La3
        L2d:
            r4 = r23
            if (r23 == 0) goto L3e
            int r6 = r4.A03
            r4 = 2131099690(0x7f06002a, float:1.781174E38)
            int r4 = r7.getColor(r4)
            r16 = 1
            if (r6 == r4) goto L40
        L3e:
            r16 = 0
        L40:
            java.lang.String r8 = X.AbstractC76643c9.A07(r0)
            java.lang.String r9 = X.AbstractC76643c9.A06(r0)
            X.C14360o3.A07(r9)
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZw()
            if (r4 == 0) goto L6a
            com.instagram.api.schemas.OriginalAudioSubtype r4 = r4.BZj()
            if (r4 == 0) goto L6a
            int r6 = r4.ordinal()
            r4 = 3
            if (r6 != r4) goto L6a
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZw()
            if (r4 == 0) goto L6a
            boolean r4 = r4.isExplicit()
            if (r4 != 0) goto L71
        L6a:
            boolean r4 = X.AbstractC76643c9.A0D(r0)
            r12 = 0
            if (r4 == 0) goto L72
        L71:
            r12 = 1
        L72:
            boolean r13 = X.AbstractC76643c9.A0E(r0)
            X.3on r7 = r0.AZi()
            com.instagram.api.schemas.OriginalSoundDataIntf r4 = r0.BZw()
            X.9Bg r6 = X.AbstractC76643c9.A00(r4)
            boolean r17 = X.AbstractC76643c9.A0H(r5, r3)
            boolean r18 = X.AbstractC92574Cr.A03(r0)
            r10 = 2131165249(0x7f070041, float:1.794471E38)
            X.4Cs r5 = new X.4Cs
            r14 = r11
            r15 = r11
            r19 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.5Sk r4 = new X.5Sk
            r4.<init>()
            r1 = 31
            X.Mtk r0 = new X.Mtk
            r0.<init>(r1, r5, r4)
            return r0
        La3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76683cG.A02(android.content.Context, X.1qM, X.3d0, X.3Zb):X.Mtk");
    }

    public final void A03(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 1);
        User A2E = c38321qM.A2E(this.A00);
        InterfaceC75453aC interfaceC75453aC = this.A01;
        if (A2E != null) {
            interfaceC75453aC.D4g(c38321qM, c75113Zb, A2E.getId(), i, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C76683cG(UserSession userSession, InterfaceC75453aC interfaceC75453aC) {
        this.A00 = userSession;
        this.A01 = interfaceC75453aC;
    }
}
