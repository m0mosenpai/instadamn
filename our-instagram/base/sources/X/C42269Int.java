package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.Int, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42269Int implements InterfaceC41501vz {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C3K0 A01;
    public final /* synthetic */ C65192xH A02;

    public C42269Int(UserSession userSession, C3K0 c3k0, C65192xH c65192xH) {
        this.A00 = userSession;
        this.A02 = c65192xH;
        this.A01 = c3k0;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-794623491);
        int A032 = C0f9.A03(294268002);
        try {
            throw AbstractC166987dD.A15("getResponseType");
        } catch (IOException e) {
            C0K8.A0F("EndToEndDebug", AbstractC111324zv.A00(665), e);
            C0f9.A0A(271328804, A032);
            C0f9.A0A(-2111236209, A03);
        }
    }
}
