package X;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: X.JaI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43852JaI {
    public final /* synthetic */ GestureDetectorOnGestureListenerC43829JZs A00;

    public C43852JaI(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        this.A00 = gestureDetectorOnGestureListenerC43829JZs;
    }

    public final void A00(MOS mos) {
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A00;
        C47292Kv3 c47292Kv3 = gestureDetectorOnGestureListenerC43829JZs.A15;
        Context A0L = AbstractC166997dE.A0L(gestureDetectorOnGestureListenerC43829JZs);
        ViewGroup viewGroup = gestureDetectorOnGestureListenerC43829JZs.A0n;
        MHQ mhq = new MHQ(mos, 43);
        C14360o3.A0B(viewGroup, 1);
        if (c47292Kv3.A00 == null) {
            String A0K = AbstractC53242c7.A0K(A0L);
            C195838lR A0j = AbstractC43593JPy.A0j(viewGroup);
            A0j.A06(AbstractC06930Yk.A0E());
            A0j.A05(AbstractC167007dF.A0f(A0L, A0K, 2131974432));
            A0j.A04(AbstractC167007dF.A0f(A0L, A0K, 2131974431));
            A0j.A02(2131974430);
            A0j.A03(new ViewOnClickListenerC48068LPt(6, c47292Kv3, A0L, mhq));
            c47292Kv3.A00 = A0j;
        }
    }
}
