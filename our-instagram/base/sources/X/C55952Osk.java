package X;

import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Osk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55952Osk implements C3WI {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ ExtendedImageUrl A01;

    public C55952Osk(C38321qM c38321qM, ExtendedImageUrl extendedImageUrl) {
        this.A01 = extendedImageUrl;
        this.A00 = c38321qM;
    }

    @Override // X.C3WI
    public final void DLK(C25821No c25821No) {
        C14360o3.A0B(c25821No, 0);
        C1OG A0J = c25821No.A0J(this.A01, "feed_timeline");
        A0J.A0I = false;
        A0J.A09 = this.A00.BU6();
        A0J.A01();
    }
}
