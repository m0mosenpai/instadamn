package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.OGz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54750OGz {
    public final /* synthetic */ ClipsSharingDraftViewModel A00;

    public C54750OGz(ClipsSharingDraftViewModel clipsSharingDraftViewModel) {
        this.A00 = clipsSharingDraftViewModel;
    }

    public final Object A00(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        Object A0A;
        C54635OBk c54635OBk = this.A00.A06;
        ClipsDraftRepository clipsDraftRepository = c54635OBk.A00;
        if (c128175qm.A0G == EnumC50651MXr.A03) {
            A0A = clipsDraftRepository.A0B(c128175qm, new C56312OzZ(c54635OBk, c128175qm), interfaceC23621Ds, false);
        } else {
            A0A = clipsDraftRepository.A0A(null, c128175qm, interfaceC23621Ds);
        }
        C1JX c1jx = C1JX.A02;
        if (A0A != c1jx) {
            A0A = C0eB.A00;
        }
        if (A0A != c1jx) {
            return C0eB.A00;
        }
        return A0A;
    }
}
