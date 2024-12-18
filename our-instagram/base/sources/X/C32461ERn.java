package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.ERn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32461ERn extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final DirectPrivateStoryRecipientController A02;
    public final InterfaceC37209GaK A03;
    public final InterfaceC58010Pnu A04;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        if (r0 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10, 36318209095505946L) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ed, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10, 36318209095440409L) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f2, code lost:
    
        r2 = (int) java.util.concurrent.TimeUnit.MINUTES.toHours(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f9, code lost:
    
        if (r14 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01fb, code lost:
    
        if (r17 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0211, code lost:
    
        r0 = 2131960253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0205, code lost:
    
        r12.setPresenceBadgeDrawable(X.AbstractC31179DnN.A0S(r9, r4, r0));
        r12.setBottomBadgeDrawable(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01fd, code lost:
    
        r0 = 2131960252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0200, code lost:
    
        if (r14 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0202, code lost:
    
        if (r17 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0204, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f0, code lost:
    
        if (r17 != false) goto L89;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r26, android.view.View r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32461ERn.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C32461ERn(InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, InterfaceC37209GaK interfaceC37209GaK, InterfaceC58010Pnu interfaceC58010Pnu) {
        this.A03 = interfaceC37209GaK;
        this.A04 = interfaceC58010Pnu;
        this.A02 = directPrivateStoryRecipientController;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(729414285);
        UserSession userSession = this.A01;
        Integer num = C05F.A00;
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.selectable_user_row);
        A0A.setTag(new FOO(A0A, userSession, num));
        C0f9.A0A(-1699291883, A03);
        return A0A;
    }
}
