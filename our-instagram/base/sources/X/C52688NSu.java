package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.NSu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52688NSu extends AbstractC32533EUj {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52688NSu(AbstractC10360h2 abstractC10360h2, Object obj, int i) {
        super(abstractC10360h2);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1521433596);
                C9GR.A0E(AbstractC31172DnG.A07(this.A01), "fetch_all_upcoming_events_failed");
                i = 1915274356;
                break;
            case 1:
                A03 = C0f9.A03(-732160983);
                i = 645801682;
                break;
            case 2:
                A03 = C0f9.A03(578571841);
                i = -1096201883;
                break;
            default:
                A03 = C0f9.A03(337084236);
                C9GR.A07(((C55037OZj) this.A01).A01, 2131972429);
                i = 548724152;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-115651977);
                C171937lO c171937lO = (C171937lO) obj;
                int A0N = AbstractC167017dG.A0N(c171937lO, -80160876);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator<E> it = AbstractC31173DnH.A0L(c171937lO.A01).iterator();
                while (it.hasNext()) {
                    UpcomingEvent upcomingEvent = (UpcomingEvent) it.next();
                    AbstractC146056i3.A00(AbstractC166987dD.A0r(((NMX) this.A01).A0W)).A01(upcomingEvent);
                    String id = upcomingEvent.getId();
                    if (id != null) {
                        A1E.add(id);
                    }
                }
                boolean isEmpty = A1E.isEmpty();
                NMX nmx = (NMX) this.A01;
                InterfaceC09390do interfaceC09390do = nmx.A0Y;
                if (!isEmpty) {
                    MSW.A0b(interfaceC09390do).A04(null, new C52550NMw(new PIU(nmx, 2), A1E));
                } else {
                    MSW.A0b(interfaceC09390do).A04(nmx, new C52549NMv(new PIU(nmx, 2), NNE.A00(nmx).A1p));
                }
                C0f9.A0A(-1782681804, A0N);
                i = -1809360727;
                break;
            case 1:
                A03 = C0f9.A03(638139215);
                int A032 = C0f9.A03(-2037210653);
                N7L.A00((N7L) this.A01);
                C0f9.A0A(-194679358, A032);
                i = -423982383;
                break;
            case 2:
                int A033 = C0f9.A03(231575592);
                int A034 = C0f9.A03(1078850360);
                C51639MrW c51639MrW = ((N7L) this.A01).A03;
                if (c51639MrW == null) {
                    C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                    throw C00O.createAndThrow();
                }
                MediaPromptPrefType mediaPromptPrefType = c51639MrW.A00;
                MediaPromptPrefType mediaPromptPrefType2 = MediaPromptPrefType.A06;
                if (mediaPromptPrefType == mediaPromptPrefType2) {
                    mediaPromptPrefType2 = MediaPromptPrefType.A05;
                }
                c51639MrW.A00 = mediaPromptPrefType2;
                C0f9.A0A(-1532619685, A034);
                C0f9.A0A(1510444649, A033);
                return;
            default:
                A03 = C0f9.A03(-2013708515);
                C171937lO c171937lO2 = (C171937lO) obj;
                int A0N2 = AbstractC167017dG.A0N(c171937lO2, 70531154);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator<E> it2 = AbstractC31173DnH.A0L(c171937lO2.A01).iterator();
                while (it2.hasNext()) {
                    UpcomingEvent upcomingEvent2 = (UpcomingEvent) it2.next();
                    AbstractC146056i3.A00(((C55037OZj) this.A01).A03).A01(upcomingEvent2);
                    A1E2.add(upcomingEvent2.getId());
                }
                boolean A1b = AbstractC25226BEj.A1b(A1E2);
                C55037OZj c55037OZj = (C55037OZj) this.A01;
                if (A1b) {
                    c55037OZj.A04.DWv(c55037OZj.A05, A1E2);
                } else {
                    c55037OZj.A04.DWu(c55037OZj.A05, null);
                }
                C0f9.A0A(1072766474, A0N2);
                i = 299978052;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
