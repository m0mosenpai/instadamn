package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.7D9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7D9 extends AbstractC161727Mh implements InterfaceC159057Br {
    public final UserSession A00;
    public final C43703JUo A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.JUo, java.lang.Object] */
    public C7D9(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IM c7im, C7T5 c7t5) {
        super(c7t5.createViewHolder(layoutInflater, viewGroup), c7t5, c7zx);
        C14360o3.A0B(c7t5, 3);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void AI4() {
        AbstractC43676JTk.A04(this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ C74843Xy BLT() {
        return AbstractC43676JTk.A00(this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ C74843Xy C0D() {
        return AbstractC43676JTk.A01(this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void Ctd(float f) {
        AbstractC43676JTk.A06(this, f);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void EJl() {
        AbstractC43676JTk.A05(this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void Ec3(C74843Xy c74843Xy) {
        AbstractC43676JTk.A02(c74843Xy, this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void FCi(C74843Xy c74843Xy, float f) {
        AbstractC43676JTk.A03(c74843Xy, this, f);
    }

    @Override // X.InterfaceC159057Br
    public final C162247Oj BMM() {
        C7QD c7qd = ((C7SP) ((AbstractC161677Mc) this).A00).A0M;
        C14360o3.A0C(c7qd, "null cannot be cast to non-null type com.instagram.direct.messagethread.voice.VoiceContentViewHolder<*>");
        return (C162247Oj) C162247Oj.A06.get(((C43678JTm) c7qd).A0D.getValue());
    }
}
