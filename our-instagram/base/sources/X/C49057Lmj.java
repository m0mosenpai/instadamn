package X;

import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.Lmj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49057Lmj implements InterfaceC50467MPv {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C1579277b A01;
    public final /* synthetic */ C1579477e A02;
    public final /* synthetic */ C158737Aj A03;
    public final /* synthetic */ IgProgressImageView A04;
    public final /* synthetic */ DirectMessageIdentifier A05;
    public final /* synthetic */ boolean A06;

    public C49057Lmj(InterfaceC11380iw interfaceC11380iw, C1579277b c1579277b, C1579477e c1579477e, C158737Aj c158737Aj, IgProgressImageView igProgressImageView, DirectMessageIdentifier directMessageIdentifier, boolean z) {
        this.A01 = c1579277b;
        this.A02 = c1579477e;
        this.A05 = directMessageIdentifier;
        this.A04 = igProgressImageView;
        this.A03 = c158737Aj;
        this.A00 = interfaceC11380iw;
        this.A06 = z;
    }

    @Override // X.InterfaceC50467MPv
    public final void D6W(String str, boolean z) {
        this.A02.A00 = null;
        C1579277b c1579277b = this.A01;
        DirectMessageIdentifier directMessageIdentifier = this.A05;
        IgProgressImageView igProgressImageView = this.A04;
        C1579277b.A02(this.A00, AbstractC25225BEi.A0t(str), c1579277b, this.A03, igProgressImageView, directMessageIdentifier, true, this.A06, false);
    }

    @Override // X.InterfaceC50467MPv
    public final void onError(String str) {
        C0f5 AEp = C18950wb.A01.AEp("GenericXmaContentDefinition: Error while fetching avatar sticker from Instamadillo media store", 817892914);
        AEp.ABW("error_message", str);
        AEp.report();
    }
}
