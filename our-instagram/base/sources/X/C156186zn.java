package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoryHighlights$1;

/* renamed from: X.6zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156186zn extends C4A7 {
    public final InterfaceC06180Ui A00;
    public final InterfaceC15070pN A01;

    public C156186zn() {
        this(3, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C156186zn(int r4, boolean r5) {
        /*
            r3 = this;
            r1 = 0
            r0 = r4 & 1
            if (r0 == 0) goto L6
            r5 = 0
        L6:
            r0 = r4 & 2
            if (r0 == 0) goto L12
            r1 = 1392808555(0x5304926b, float:5.693922E11)
            r0 = 3
            X.19K r1 = X.C4A8.A01(r1, r0)
        L12:
            r0 = 2
            X.C14360o3.A0B(r1, r0)
            java.lang.String r0 = "Profile"
            r3.<init>(r0, r1)
            r1 = 0
            java.lang.Integer r0 = X.C05F.A00
            X.057 r2 = X.C10M.A00(r0, r5, r1)
            r3.A00 = r2
            r1 = 0
            X.0Ug r0 = new X.0Ug
            r0.<init>(r1, r2)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156186zn.<init>(int, boolean):void");
    }

    public final void A00(Context context, UserSession userSession, AbstractC151076r9 abstractC151076r9, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C19L c19l = super.A01;
        StoryHighlightsRepository$fetchStoryHighlights$1 storyHighlightsRepository$fetchStoryHighlights$1 = new StoryHighlightsRepository$fetchStoryHighlights$1(context, userSession, abstractC151076r9, this, bool, bool2, bool3, num, str, null, z);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, storyHighlightsRepository$fetchStoryHighlights$1, c19l);
    }
}
