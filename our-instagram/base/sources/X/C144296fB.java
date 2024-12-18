package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.6fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144296fB implements InterfaceC144306fC {
    public View A00;
    public View A01;
    public IgProgressBar A02;
    public IgSimpleImageView A03;
    public C202488xS A04;
    public C24012Akq A05;
    public final InterfaceC56392iX A06;

    @Override // X.InterfaceC144306fC
    public final void FAS(UserSession userSession) {
        StoryJoinChatStatus storyJoinChatStatus;
        String str;
        C24012Akq c24012Akq = this.A05;
        if (c24012Akq == null) {
            str = "model";
        } else {
            String A02 = c24012Akq.A02();
            View view = this.A00;
            if (view == null) {
                str = "buttonView";
            } else {
                Context context = view.getContext();
                C36269FzM A00 = AbstractC34105F3h.A00(userSession);
                C14360o3.A0B(A02, 0);
                if (A00.A00.contains(A02)) {
                    storyJoinChatStatus = StoryJoinChatStatus.A04;
                } else {
                    storyJoinChatStatus = StoryJoinChatStatus.A07;
                }
                C202488xS c202488xS = this.A04;
                if (c202488xS == null) {
                    str = "stickerDrawable";
                } else {
                    C14360o3.A0A(context);
                    c202488xS.A0B(context, storyJoinChatStatus, userSession);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r1 == null) goto L7;
     */
    @Override // X.InterfaceC144306fC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EYT(boolean r5) {
        /*
            r4 = this;
            java.lang.String r3 = "loadingSpinner"
            java.lang.String r0 = "stickerDrawable"
            X.8xS r2 = r4.A04
            if (r5 == 0) goto L25
            if (r2 == 0) goto L40
            X.9oy r0 = r2.A02
            X.6RB r0 = r0.A04
            android.graphics.drawable.Drawable r1 = r0.mutate()
            r0 = 0
            r1.setAlpha(r0)
            r2.invalidateSelf()
            com.instagram.common.ui.base.IgProgressBar r1 = r4.A02
            if (r1 != 0) goto L3c
        L1d:
            X.C14360o3.A0F(r3)
        L20:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L25:
            if (r2 == 0) goto L40
            X.9oy r0 = r2.A02
            X.6RB r0 = r0.A04
            android.graphics.drawable.Drawable r1 = r0.mutate()
            r0 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r0)
            r2.invalidateSelf()
            com.instagram.common.ui.base.IgProgressBar r1 = r4.A02
            if (r1 == 0) goto L1d
            r0 = 4
        L3c:
            r1.setVisibility(r0)
            return
        L40:
            X.C14360o3.A0F(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144296fB.EYT(boolean):void");
    }

    public C144296fB(InterfaceC56392iX interfaceC56392iX) {
        this.A06 = interfaceC56392iX;
    }
}
