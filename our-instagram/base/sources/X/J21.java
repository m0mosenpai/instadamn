package X;

import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* loaded from: classes7.dex */
public final class J21 implements C4AF {
    public final /* synthetic */ C39443HbV A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ SimpleVideoLayout A02;
    public final /* synthetic */ C75363a3 A03;
    public final /* synthetic */ C4AD A04;

    @Override // X.C4AF
    public final /* synthetic */ void DzR() {
    }

    @Override // X.C4AF
    public final void DzS(boolean z) {
    }

    public J21(C39443HbV c39443HbV, C102884kP c102884kP, SimpleVideoLayout simpleVideoLayout, C75363a3 c75363a3, C4AD c4ad) {
        this.A02 = simpleVideoLayout;
        this.A04 = c4ad;
        this.A00 = c39443HbV;
        this.A03 = c75363a3;
        this.A01 = c102884kP;
    }

    @Override // X.C4AF
    public final void DzT(boolean z) {
        C4QW c4qw;
        SimpleVideoLayout simpleVideoLayout = this.A02;
        if (simpleVideoLayout.getTag() == this.A04 && (c4qw = this.A00.A00) != null) {
            C75363a3 c75363a3 = this.A03;
            C102884kP c102884kP = this.A01;
            C4S7 c4s7 = new C4S7(c75363a3, 0);
            float f = 0.0f;
            if (c102884kP.A0S(36, false)) {
                f = 1.0f;
            }
            c4qw.E5v(new C4SC(simpleVideoLayout, new C4QP(false, false, false, false), c75363a3, c4s7, null, "bloks_video_component_binder", f, -1, 0, true));
            c4qw.Ed6(EnumC95184Qe.A04);
            c4qw.EYb(true);
            ((C4QT) c4qw).A0X = true;
            c4qw.E4T("video_prefetched", false);
        }
    }
}
