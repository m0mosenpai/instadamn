package X;

import com.instagram.mainactivity.InstagramMainActivity;

/* loaded from: classes9.dex */
public final class N9K extends C1P1 {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public N9K(C38321qM c38321qM, InstagramMainActivity instagramMainActivity) {
        this.A01 = instagramMainActivity;
        this.A00 = c38321qM;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-417305040);
        C52081N2h c52081N2h = (C52081N2h) obj;
        int A032 = C0f9.A03(720551621);
        C14360o3.A0B(c52081N2h, 0);
        if (c52081N2h.A00) {
            InstagramMainActivity instagramMainActivity = this.A01;
            if (instagramMainActivity.A0Q) {
                instagramMainActivity.A0Q = false;
                InstagramMainActivity.A0Q(this.A00, instagramMainActivity, false);
                C0f9.A0A(-225230467, A032);
                C0f9.A0A(-1321027826, A03);
            }
        }
        InstagramMainActivity.A0O(this.A00, this.A01);
        C0f9.A0A(-225230467, A032);
        C0f9.A0A(-1321027826, A03);
    }
}
