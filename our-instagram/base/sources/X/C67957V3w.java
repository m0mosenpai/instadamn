package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.V3w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67957V3w extends C1P1 {
    public final int A00;
    public final /* synthetic */ V1R A01;

    public C67957V3w(V1R v1r, int i) {
        this.A01 = v1r;
        this.A00 = i;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1286135897);
        W31 A01 = V1R.A01(this.A01);
        A01.A05 = true;
        A01.A06.A04 = null;
        W31.A00(A01);
        C0f9.A0A(414525538, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1163301947);
        V1R v1r = this.A01;
        v1r.A0Y.post(new RunnableC71510WvF(this, v1r));
        C0f9.A0A(-1301454702, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-358330757);
        WG5.A04(this.A01.A0c, "INFO_REQUEST_START", this.A00);
        C0f9.A0A(-402148847, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1034783966);
        C38898HAu c38898HAu = (C38898HAu) obj;
        int A032 = C0f9.A03(514840922);
        C14360o3.A0B(c38898HAu, 0);
        V1R v1r = this.A01;
        W31 A01 = V1R.A01(v1r);
        C69730VuP c69730VuP = new C69730VuP(A01.A01);
        c69730VuP.A0C = c38898HAu.A07;
        c69730VuP.A01 = Boolean.valueOf(c38898HAu.A0B);
        c69730VuP.A0A = Integer.valueOf(c38898HAu.A01);
        c69730VuP.A0B = c38898HAu.A06;
        c69730VuP.A08 = Integer.valueOf(c38898HAu.A00);
        c69730VuP.A02 = Boolean.valueOf(c38898HAu.A0C);
        c69730VuP.A06 = Boolean.valueOf(c38898HAu.A0F);
        c69730VuP.A04 = Boolean.valueOf(c38898HAu.A0E);
        Hashtag A00 = c69730VuP.A00();
        A01.A01 = A00;
        C68247VJj c68247VJj = A01.A06;
        C14360o3.A0B(A00, 0);
        c68247VJj.A01 = A00;
        c68247VJj.A04 = c38898HAu.A0A;
        c68247VJj.A03 = c38898HAu.A05;
        c68247VJj.A05 = c38898HAu.A0G;
        A01.A02 = c38898HAu.A03;
        A01.A03 = c38898HAu.A04;
        A01.A04 = c38898HAu.A0D;
        A01.A05 = true;
        W31.A00(A01);
        FOB fob = v1r.A0H;
        if (fob == null) {
            C14360o3.A0F("actionBarHelper");
            throw C00O.createAndThrow();
        }
        Hashtag hashtag = V1R.A01(v1r).A01;
        C14360o3.A0B(hashtag, 0);
        fob.A00 = hashtag;
        C0f9.A0A(2130376823, A032);
        C0f9.A0A(1191623403, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(320744312);
        int A032 = C0f9.A03(1736168976);
        V1R v1r = this.A01;
        v1r.A0Y.post(new RunnableC71511WvG(this, v1r));
        C0f9.A0A(1434773005, A032);
        C0f9.A0A(1339894054, A03);
    }
}
