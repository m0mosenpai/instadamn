package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.FQh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34696FQh {
    public float A00;
    public int A01;
    public MediaViewerReplyBarEligibilityChecker A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public List A06;
    public InterfaceC16820sZ A07;
    public InterfaceC16660sJ A08;
    public InterfaceC16660sJ A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public FIW A0D;
    public E6B A0E;
    public final View A0F;
    public final Context A0G;
    public final UserSession A0H;
    public final DirectAggregatedMediaViewerController A0I;
    public final C2EC A0J;
    public final DirectShareTarget A0K;
    public final C3o9 A0L;

    public C34696FQh(Context context, View view, UserSession userSession, DirectAggregatedMediaViewerController directAggregatedMediaViewerController, DirectShareTarget directShareTarget, C3o9 c3o9) {
        C81663kb c81663kb;
        boolean z;
        AbstractC167007dF.A1G(userSession, 2, view);
        this.A0G = context;
        this.A0H = userSession;
        this.A0L = c3o9;
        this.A0K = directShareTarget;
        this.A0F = view;
        this.A0I = directAggregatedMediaViewerController;
        this.A06 = C16930sl.A00;
        this.A0C = true;
        Integer num = C05F.A01;
        this.A03 = num;
        this.A04 = num;
        this.A0E = new E6B(AbstractC31174DnI.A0A(view), view.getRotation());
        this.A02 = new MediaViewerReplyBarEligibilityCheckerImpl(false, false, false);
        this.A0D = new FIW(new C36343G1v(this, 1));
        if (JRE.A02(c3o9) != null) {
            c81663kb = AbstractC28761aE.A00(userSession).B3U(JRE.A01(c3o9));
        } else {
            c81663kb = null;
        }
        this.A0J = c81663kb;
        if (c81663kb != null) {
            z = c81663kb.CWO();
        } else {
            z = false;
        }
        this.A0A = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r37.A0B != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36319377327660340L) == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34696FQh.A00():void");
    }
}
