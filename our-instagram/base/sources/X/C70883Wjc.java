package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Wjc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70883Wjc implements InterfaceC71919XAd {
    public final /* synthetic */ C69359Vm5 A00;

    public C70883Wjc(C69359Vm5 c69359Vm5) {
        this.A00 = c69359Vm5;
    }

    @Override // X.InterfaceC71919XAd
    public final void ACz(C25531Mh c25531Mh) {
        String id;
        Hashtag hashtag = this.A00.A05;
        if (hashtag.getId() != null && ((id = hashtag.getId()) == null || id.length() == 0)) {
            c25531Mh.A0Q("hashtag_id", AbstractC25233BEq.A0n(hashtag.getId()));
        }
        c25531Mh.A0R("hashtag_name", hashtag.getName());
        c25531Mh.A0R("hashtag_follow_status", AbstractC1120253r.A02(hashtag));
    }
}
