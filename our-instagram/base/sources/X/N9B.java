package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

/* loaded from: classes9.dex */
public final class N9B extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final PG1 A04;
    public final C195918ld A05;
    public final InterfaceC58010Pnu A06;
    public final boolean A07;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r9.A06() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006e, code lost:
    
        if (r13 == false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0Zx, X.MnJ] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r26, android.view.View r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N9B.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public N9B(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IngestSessionShim ingestSessionShim, PG1 pg1, C195918ld c195918ld, InterfaceC58010Pnu interfaceC58010Pnu, boolean z) {
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = pg1;
        this.A05 = c195918ld;
        this.A06 = interfaceC58010Pnu;
        this.A07 = z;
        this.A03 = ingestSessionShim;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(538026181);
        UserSession userSession = this.A02;
        View A0C = AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.recipient_picker_add_to_story, false);
        A0C.setTag(new C54684ODk(A0C, userSession));
        C0f9.A0A(-954390692, A03);
        return A0C;
    }
}
