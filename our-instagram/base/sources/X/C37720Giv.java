package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Giv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37720Giv extends MTJ {
    public C69613Av A00;
    public InterfaceC60222p5 A01;
    public boolean A02;
    public final C31374Dqe A03;

    @Override // X.AbstractC69603Au
    public final void A05() {
        InterfaceC60222p5 interfaceC60222p5 = this.A01;
        if (interfaceC60222p5 != null) {
            A0J(TraceFieldType.ContentType, interfaceC60222p5.BD9());
        }
    }

    public C37720Giv(UserSession userSession, InterfaceC60222p5 interfaceC60222p5) {
        super(userSession, "clips_fetch", 31795699);
        this.A01 = interfaceC60222p5;
        this.A03 = AbstractC37492GfA.A00(userSession);
        this.A00 = A02("first_media_load");
    }
}
