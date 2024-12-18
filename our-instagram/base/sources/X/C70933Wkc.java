package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Wkc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70933Wkc implements XAs {
    public final /* synthetic */ V4E A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;

    public C70933Wkc(V4E v4e, C6FG c6fg, C102884kP c102884kP) {
        this.A00 = v4e;
        this.A01 = c6fg;
        this.A02 = c102884kP;
    }

    @Override // X.XAs
    public final void DKE(Hashtag hashtag) {
        Hashtag A00 = new C69730VuP(hashtag).A00();
        AnonymousClass630 A02 = AnonymousClass634.A02(this.A01);
        A02.A0G(new C70695WfI(this.A02.A04), new C67966V4f(0, this, A00));
        A02.A09();
    }
}
