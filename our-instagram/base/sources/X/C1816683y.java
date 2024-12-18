package X;

import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.83y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1816683y {
    public final C8GD A00;
    public final PromptStickerModel A01;
    public final C8FC A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.5NL, java.lang.Object, X.AhC] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.5NL, java.lang.Object, X.9kH] */
    /* JADX WARN: Type inference failed for: r12v12, types: [X.5NL, java.lang.Object, X.9kH] */
    /* JADX WARN: Type inference failed for: r12v4, types: [X.5NL, java.lang.Object, X.9kH] */
    /* JADX WARN: Type inference failed for: r21v3, types: [com.instagram.api.schemas.StoryTemplateDictIntf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1816683y(com.instagram.api.schemas.StoryTemplateDict r21, com.instagram.reels.prompt.model.PromptStickerModel r22, X.C8FC r23, java.util.HashMap r24, int r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1816683y.<init>(com.instagram.api.schemas.StoryTemplateDict, com.instagram.reels.prompt.model.PromptStickerModel, X.8FC, java.util.HashMap, int, boolean, boolean):void");
    }

    public final boolean A00() {
        Al6 al6;
        List list = this.A03;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5NL c5nl = ((AA2) it.next()).A06;
            if ((c5nl instanceof Al6) && (al6 = (Al6) c5nl) != null && al6.A04 != null) {
                return true;
            }
        }
        return false;
    }
}
