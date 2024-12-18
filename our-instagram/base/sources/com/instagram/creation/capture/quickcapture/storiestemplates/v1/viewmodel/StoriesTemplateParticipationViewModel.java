package com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel;

import X.AbstractC52922bZ;
import X.AbstractC58232lf;
import X.AnonymousClass191;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C142036bM;
import X.C14360o3;
import X.C149776oU;
import X.C2GT;
import X.C41551w4;
import X.C8FC;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* loaded from: classes3.dex */
public final class StoriesTemplateParticipationViewModel extends AbstractC52922bZ {
    public CreativeConfigIntf A00;
    public C41551w4 A01;
    public PromptStickerModel A02;
    public C8FC A03;
    public final C2GT A04;
    public final C05A A05;
    public final C0UO A06;
    public final UserSession A07;
    public final C149776oU A08;

    public StoriesTemplateParticipationViewModel(UserSession userSession, C149776oU c149776oU) {
        C14360o3.A0B(userSession, 1);
        this.A07 = userSession;
        this.A08 = c149776oU;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A00 = null;
        C008002u A00 = C10E.A00(C142036bM.A00);
        this.A05 = A00;
        this.A06 = A00;
        this.A04 = AbstractC58232lf.A00(AnonymousClass191.A00, A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((!r0.isEmpty()) != true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.feed.media.CreativeConfigIntf r10, com.instagram.reels.prompt.model.PromptStickerModel r11, X.C8FC r12, boolean r13) {
        /*
            r9 = this;
            r0 = 0
            r3 = r11
            X.C14360o3.A0B(r11, r0)
            r1 = 1
            r5 = r9
            r9.A02 = r11
            r4 = r12
            r9.A03 = r12
            r6 = r10
            r9.A00 = r10
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r11.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C2N()
            if (r0 == 0) goto L26
            java.util.List r0 = r0.C1C()
            if (r0 == 0) goto L26
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r2 = 1
            if (r0 == r1) goto L27
        L26:
            r2 = 0
        L27:
            X.6oU r0 = r9.A08
            com.instagram.avatars.store.AvatarStore r0 = r0.A01
            X.21d r0 = r0.A01
            X.21h r1 = r0.A00
            X.5lz r0 = X.C125535lz.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r2 == 0) goto L46
            if (r0 != 0) goto L53
            X.05A r2 = r9.A05
            if (r13 == 0) goto L43
            X.6dq r1 = X.C143516dq.A00
        L3f:
            r2.Egh(r1)
            return
        L43:
            X.6dn r1 = X.C143486dn.A00
            goto L3f
        L46:
            X.05A r2 = r9.A05
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            X.6do r1 = new X.6do
            r1.<init>(r10, r11, r12, r0)
            goto L3f
        L53:
            X.6aw r1 = X.AbstractC141776au.A00(r9)
            r7 = 0
            r8 = 44
            X.MCP r2 = new X.MCP
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.191 r0 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel.A01(com.instagram.feed.media.CreativeConfigIntf, com.instagram.reels.prompt.model.PromptStickerModel, X.8FC, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.feed.media.CreativeConfigIntf r19, com.instagram.reels.prompt.model.PromptStickerModel r20, X.C8FC r21, X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel.A00(com.instagram.feed.media.CreativeConfigIntf, com.instagram.reels.prompt.model.PromptStickerModel, X.8FC, X.1Ds):java.lang.Object");
    }
}
