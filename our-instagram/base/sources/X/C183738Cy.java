package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.8Cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183738Cy implements InterfaceC183728Cx {
    public final C8D0 A00 = new C183748Cz(0.5f, 0.5f);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0011 A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC183728Cx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFX(X.C5NL r6) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            java.lang.Integer r0 = r6.CBq()
            int r0 = r0.intValue()
            r2 = 0
            r3 = 1
            switch(r0) {
                case 2: goto L9a;
                case 3: goto L9a;
                case 8: goto Ld1;
                case 11: goto Lbf;
                case 13: goto L70;
                case 20: goto L7d;
                case 23: goto L63;
                case 26: goto L33;
                case 28: goto L3f;
                case 29: goto L3f;
                case 33: goto Lca;
                case 34: goto L56;
                case 58: goto L20;
                case 65: goto L13;
                default: goto L11;
            }
        L11:
            r2 = 1
        L12:
            return r2
        L13:
            com.instagram.reels.musicpick.model.MusicPickStickerModel r6 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r6
            com.instagram.api.schemas.StoryMusicPickTappableData r1 = r6.A00
            com.instagram.api.schemas.TrackData r0 = r1.A04
            if (r0 != 0) goto L11
            com.instagram.api.schemas.OriginalSoundData r0 = r1.A01
            if (r0 == 0) goto Lbd
            goto L11
        L20:
            X.9kI r6 = (X.C217859kI) r6
            java.util.List r0 = r6.A06
            int r1 = r0.size()
            java.util.List r0 = r6.A05
            int r0 = r0.size()
            int r1 = r1 + r0
            r2 = 1
            if (r1 <= r3) goto Lbd
            return r2
        L33:
            X.Wm4 r6 = (X.Wm4) r6
            java.util.List r0 = r6.A06
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto Lbd
            goto L11
        L3f:
            com.instagram.reels.prompt.model.PromptStickerModel r6 = (com.instagram.reels.prompt.model.PromptStickerModel) r6
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r6.A00
            java.lang.String r0 = r0.getText()
            if (r0 == 0) goto L4f
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 == 0) goto L11
        L4f:
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L12
            goto L11
        L56:
            X.Akv r6 = (X.C24017Akv) r6
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L12
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 == 0) goto L11
            return r2
        L63:
            X.Aku r6 = (X.C24016Aku) r6
            com.instagram.common.gallery.Medium r0 = r6.A00
            if (r0 == 0) goto L12
            boolean r0 = r0.A06()
            if (r0 != r3) goto L12
            goto L11
        L70:
            X.9kK r6 = (X.C217879kK) r6
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L12
            int r0 = r0.length()
            if (r0 != 0) goto L11
            return r2
        L7d:
            X.9kL r6 = (X.C217889kL) r6
            java.lang.String r1 = r6.A04
            int[] r0 = X.AbstractC202818xz.A02
            X.C14360o3.A0B(r1, r4)
            int r0 = r1.length()
            r2 = 1
            if (r0 <= r3) goto Lbd
            java.util.regex.Pattern r0 = X.AbstractC202818xz.A01
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Lbd
            return r2
        L9a:
            X.Akq r6 = (X.C24012Akq) r6
            X.URj r0 = r6.A00
            java.lang.String r0 = r0.A0M
            if (r0 != 0) goto La4
            java.lang.String r0 = ""
        La4:
            boolean r0 = X.AbstractC001900j.A0T(r0)
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto Lbd
            X.URj r0 = r6.A00
            java.lang.String r0 = r0.A0M
            if (r0 != 0) goto Lb5
            java.lang.String r0 = ""
        Lb5:
            int r1 = r0.length()
            r0 = 100
            if (r1 <= r0) goto L12
        Lbd:
            r2 = 0
            return r2
        Lbf:
            X.9kM r6 = (X.C217899kM) r6
            com.instagram.common.gallery.Medium r0 = r6.A00()
            boolean r2 = r0.A06()
            return r2
        Lca:
            X.Wm1 r6 = (X.Wm1) r6
            boolean r2 = X.AbstractC97594Zu.A03(r6)
            return r2
        Ld1:
            X.AlC r6 = (X.AlC) r6
            boolean r2 = X.AbstractC141456aO.A02(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183738Cy.AFX(X.5NL):boolean");
    }

    @Override // X.InterfaceC183728Cx
    public final String Az0(Context context) {
        C14360o3.A0B(context, 0);
        String string = context.getString(2131961124);
        C14360o3.A07(string);
        return string;
    }

    @Override // X.InterfaceC183728Cx
    public final C8D0 AzT() {
        return this.A00;
    }

    @Override // X.InterfaceC183728Cx
    public final boolean CSl() {
        return true;
    }

    @Override // X.InterfaceC183728Cx
    public final C8D0 AzU(View view, int i) {
        RectF A0G = AbstractC13880nE.A0G(view);
        return new C221619qQ(new Rect((int) A0G.left, ((int) A0G.top) - i, (int) A0G.right, ((int) A0G.bottom) - i));
    }
}
