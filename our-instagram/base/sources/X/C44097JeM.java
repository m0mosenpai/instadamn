package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.JeM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44097JeM extends AbstractRunnableC14200nk {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ GestureDetectorOnGestureListenerC43829JZs A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44097JeM(Medium medium, GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        super(488422629, 3, false, false);
        this.A00 = medium;
        this.A01 = gestureDetectorOnGestureListenerC43829JZs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Medium medium = this.A00;
        C11T.A02(new RunnableC44260Jh6(medium, C9L8.A03(this.A01.A0z, medium.A0X)));
    }
}
