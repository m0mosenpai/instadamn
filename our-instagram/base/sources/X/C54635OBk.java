package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.OBk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54635OBk {
    public final ClipsDraftRepository A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16660sJ A02;
    public final UserSession A03;

    public C54635OBk(UserSession userSession, ClipsDraftRepository clipsDraftRepository, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = clipsDraftRepository;
        this.A03 = userSession;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16820sZ;
    }
}
