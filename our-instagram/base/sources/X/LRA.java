package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* loaded from: classes8.dex */
public final class LRA implements Animation.AnimationListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AlphaAnimation A01;
    public final /* synthetic */ C6C9 A02;
    public final /* synthetic */ InterfaceC50424MOe A03;
    public final /* synthetic */ C48572Le9 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C14510oO A06;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public LRA(AlphaAnimation alphaAnimation, C6C9 c6c9, InterfaceC50424MOe interfaceC50424MOe, C48572Le9 c48572Le9, String str, C14510oO c14510oO, int i) {
        this.A06 = c14510oO;
        this.A04 = c48572Le9;
        this.A05 = str;
        this.A03 = interfaceC50424MOe;
        this.A00 = i;
        this.A02 = c6c9;
        this.A01 = alphaAnimation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (X.AbstractC13670mt.A00(r0) > 3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // android.view.animation.Animation.AnimationListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationEnd(android.view.animation.Animation r12) {
        /*
            r11 = this;
            X.0oO r0 = r11.A06
            boolean r0 = r0.A00
            r4 = 3
            if (r0 != 0) goto L49
            X.Le9 r2 = r11.A04
            java.lang.ref.WeakReference r0 = r2.A03
            java.lang.Object r1 = r0.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r1 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r1
            if (r1 == 0) goto L33
            java.lang.String r0 = r11.A05
        L15:
            com.instagram.common.session.UserSession r2 = r2.A01
            java.lang.CharSequence r5 = X.JX9.A04(r2, r0)
            X.MOe r2 = r11.A03
            X.6C9 r2 = r2.BXJ()
            boolean r2 = r2.A0Q
            if (r2 == 0) goto L2c
            int r0 = X.AbstractC13670mt.A00(r0)
            r3 = 1
            if (r0 <= r4) goto L2d
        L2c:
            r3 = 0
        L2d:
            r2 = 0
            java.lang.String r0 = ""
            r1.setPromptBubbleContent(r5, r3, r0, r2)
        L33:
            X.Le9 r0 = r11.A04
            java.lang.ref.WeakReference r0 = r0.A03
            java.lang.Object r0 = r0.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r0 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r0
            if (r0 == 0) goto L48
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r1 = r0.getNoteBubbleView()
            android.view.animation.AlphaAnimation r0 = r11.A01
            r1.startAnimation(r0)
        L48:
            return
        L49:
            int r1 = r11.A00
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.A0A
            int r0 = r0.A00
            if (r1 != r0) goto L98
            X.6C9 r4 = r11.A02
            X.67s r0 = r4.A0A
            if (r0 == 0) goto L33
            com.instagram.api.schemas.MusicNoteResponseInfo r0 = r0.A07
            if (r0 == 0) goto L33
            com.instagram.api.schemas.MusicInfo r3 = r0.A00
            if (r3 == 0) goto L33
            X.Le9 r2 = r11.A04
            java.lang.ref.WeakReference r0 = r2.A03
            java.lang.Object r5 = r0.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r5 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r5
            if (r5 == 0) goto L33
            com.instagram.api.schemas.TrackData r0 = r3.BVV()
            java.lang.String r6 = r0.getDisplayArtist()
            java.lang.String r1 = ""
            if (r6 != 0) goto L78
            r6 = r1
        L78:
            com.instagram.api.schemas.TrackData r0 = r3.BVV()
            java.lang.String r7 = r0.getTitle()
            if (r7 != 0) goto L83
            r7 = r1
        L83:
            java.lang.String r1 = r4.A0J
            com.instagram.common.session.UserSession r0 = r2.A01
            java.lang.CharSequence r8 = X.JX9.A04(r0, r1)
            com.instagram.api.schemas.TrackData r0 = r3.BVV()
            boolean r9 = r0.isExplicit()
            r10 = 0
            r5.setMusicBubbleContent(r6, r7, r8, r9, r10)
            goto L33
        L98:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.A0D
            int r0 = r0.A00
            if (r1 != r0) goto L33
            X.Le9 r2 = r11.A04
            java.lang.ref.WeakReference r0 = r2.A03
            java.lang.Object r1 = r0.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r1 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r1
            if (r1 == 0) goto L33
            X.6C9 r0 = r11.A02
            java.lang.String r0 = r0.A0J
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LRA.onAnimationEnd(android.view.animation.Animation):void");
    }
}
