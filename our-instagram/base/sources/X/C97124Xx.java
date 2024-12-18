package X;

/* renamed from: X.4Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97124Xx implements InterfaceC97134Xy {
    public final /* synthetic */ C3BJ A00;

    @Override // X.InterfaceC97134Xy
    public final void DzI(C38321qM c38321qM, String str) {
        C3BJ c3bj = this.A00;
        String A38 = c38321qM.A38();
        if (A38 != null) {
            C3BJ.A00(null, c3bj, A38, null, str, false);
            C61442r7 c61442r7 = c3bj.A02;
            C61442r7.A02(c61442r7, "FIRST_MEDIA_LOAD_FAILED");
            if (c61442r7.A06) {
                c61442r7.A0B.removeCallbacks(c61442r7.A0K);
                Integer num = C05F.A0u;
                c61442r7.A0O = num;
                c61442r7.A0P = num;
                C61442r7.A01(c61442r7);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC97134Xy
    public final void E09(EnumC92424Bx enumC92424Bx, C38321qM c38321qM) {
        C3BJ c3bj = this.A00;
        String A38 = c38321qM.A38();
        if (A38 != null) {
            C3BJ.A00(enumC92424Bx, c3bj, A38, null, null, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C97124Xx(C3BJ c3bj) {
        this.A00 = c3bj;
    }

    @Override // X.InterfaceC97134Xy
    public final void Dzo(C38321qM c38321qM) {
        C226418s c226418s = this.A00.A02.A0I;
        c226418s.A0P(c226418s.A02, "IG_FIRST_VIDEO_REQUESTED_PLAYING");
    }
}
