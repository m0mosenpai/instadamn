package X;

import android.content.Context;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WkW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70927WkW implements InterfaceC63862v7 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ InterfaceC43428JGs A02;

    @Override // X.InterfaceC63862v7
    public final void DK9(AbstractC115105If abstractC115105If, Hashtag hashtag) {
    }

    @Override // X.InterfaceC63862v7
    public final void DKA(InterfaceC40821up interfaceC40821up, Hashtag hashtag) {
    }

    @Override // X.InterfaceC63862v7
    public final void DKC(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        C14360o3.A0B(hashtag, 0);
        C38321qM c38321qM = this.A01;
        C69730VuP c69730VuP = new C69730VuP(hashtag);
        c69730VuP.A08 = 1;
        c69730VuP.A09 = 1;
        c38321qM.A0C.EUh(c69730VuP.A00().F59());
        C9GR.A01(this.A00, "unfollow_hashtag_error", 2131976075, 0);
    }

    @Override // X.InterfaceC63862v7
    public final void DKD(InterfaceC40821up interfaceC40821up, Hashtag hashtag) {
        C14360o3.A0B(hashtag, 0);
        C38321qM c38321qM = this.A01;
        C69730VuP c69730VuP = new C69730VuP(hashtag);
        c69730VuP.A08 = 0;
        c69730VuP.A09 = 0;
        c38321qM.A0C.EUh(c69730VuP.A00().F59());
        this.A02.DKc(EnumC75193Zm.A0D);
    }

    public C70927WkW(Context context, C38321qM c38321qM, InterfaceC43428JGs interfaceC43428JGs) {
        this.A01 = c38321qM;
        this.A02 = interfaceC43428JGs;
        this.A00 = context;
    }
}
