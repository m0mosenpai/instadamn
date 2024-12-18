package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.6sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152036sn implements C07W {
    public final C07T A00;
    public final /* synthetic */ AbstractC31469DsD A01;

    public C152036sn(C07T c07t, AbstractC31469DsD abstractC31469DsD) {
        C14360o3.A0B(c07t, 2);
        this.A01 = abstractC31469DsD;
        this.A00 = c07t;
    }

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public final void onDestroy() {
        AbstractC31469DsD abstractC31469DsD = this.A01;
        ((C32550EVa) abstractC31469DsD).A00 = null;
        this.A00.A0A(this);
        abstractC31469DsD.A03();
    }
}
