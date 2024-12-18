package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;

/* renamed from: X.7k3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171127k3 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ C1815283f A03;
    public final /* synthetic */ InterfaceC11380iw A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C1810981l A06;
    public final /* synthetic */ C8GG A07;
    public final /* synthetic */ InterfaceC25214BDm A08;
    public final /* synthetic */ C8JI A09;
    public final /* synthetic */ FundraiserSharedToLive A0A;
    public final /* synthetic */ C3PO A0B;
    public final /* synthetic */ Boolean A0C;
    public final /* synthetic */ Long A0D;
    public final /* synthetic */ String A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171127k3(ViewGroup viewGroup, AbstractC59962oe abstractC59962oe, C1815283f c1815283f, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8GG c8gg, InterfaceC25214BDm interfaceC25214BDm, C8JI c8ji, FundraiserSharedToLive fundraiserSharedToLive, C3PO c3po, Boolean bool, Long l, String str, int i) {
        super(0);
        this.A05 = userSession;
        this.A02 = abstractC59962oe;
        this.A07 = c8gg;
        this.A06 = c1810981l;
        this.A08 = interfaceC25214BDm;
        this.A01 = viewGroup;
        this.A00 = i;
        this.A09 = c8ji;
        this.A04 = interfaceC11380iw;
        this.A03 = c1815283f;
        this.A0A = fundraiserSharedToLive;
        this.A0B = c3po;
        this.A0E = str;
        this.A0C = bool;
        this.A0D = l;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession = this.A05;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322757465614817L);
        AbstractC59962oe abstractC59962oe = this.A02;
        if (A06) {
            C8GH A00 = this.A07.A00();
            C1810981l c1810981l = this.A06;
            InterfaceC25214BDm interfaceC25214BDm = this.A08;
            ViewGroup viewGroup = this.A01;
            int i = this.A00;
            C8JI c8ji = this.A09;
            return new C56049OuO(viewGroup, abstractC59962oe, this.A03, this.A04, userSession, c1810981l, A00, interfaceC25214BDm, c8ji, i);
        }
        C8GG c8gg = this.A07;
        C1810981l c1810981l2 = this.A06;
        InterfaceC25214BDm interfaceC25214BDm2 = this.A08;
        ViewGroup viewGroup2 = this.A01;
        int i2 = this.A00;
        C8JI c8ji2 = this.A09;
        InterfaceC11380iw interfaceC11380iw = this.A04;
        FundraiserSharedToLive fundraiserSharedToLive = this.A0A;
        C3PO c3po = this.A0B;
        String str = this.A0E;
        return new C171177k9(viewGroup2, abstractC59962oe, this.A03, interfaceC11380iw, userSession, c1810981l2, c8gg, interfaceC25214BDm2, c8ji2, fundraiserSharedToLive, c3po, this.A0C, this.A0D, str, i2);
    }
}
