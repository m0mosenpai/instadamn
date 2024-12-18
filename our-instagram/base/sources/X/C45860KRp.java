package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Map;

/* renamed from: X.KRp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45860KRp extends AbstractC161727Mh implements C7AX, InterfaceC159057Br {
    public final UserSession A00;
    public final C48985LlZ A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;
    public final C7AX A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45860KRp(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, C45889KSs c45889KSs, C7IM c7im, Map map) {
        super(c45889KSs.createViewHolder(layoutInflater, viewGroup), c45889KSs, c7zx);
        AbstractC167007dF.A1I(c45889KSs, 3, map);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new C48985LlZ(map);
        this.A05 = c45889KSs;
    }

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48985LlZ c48985LlZ = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48985LlZ.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
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
        AnonymousClass791 anonymousClass791;
        InterfaceC59152nG interfaceC59152nG = ((C49154LoX) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).A08.getIgImageView().A0I;
        if (!(interfaceC59152nG instanceof AnonymousClass791) || (anonymousClass791 = (AnonymousClass791) interfaceC59152nG) == null) {
            return null;
        }
        return anonymousClass791.A04;
    }

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        return this.A05.CFg(directMessageIdentifier);
    }
}
