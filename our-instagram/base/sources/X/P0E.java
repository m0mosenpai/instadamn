package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class P0E implements InterfaceC50452MPg {
    public final /* synthetic */ C128175qm A00;
    public final /* synthetic */ ClipsDraftRepository A01;
    public final /* synthetic */ OVo A02;
    public final /* synthetic */ C47Z A03;
    public final /* synthetic */ InterfaceC23621Ds A04;

    public P0E(C128175qm c128175qm, ClipsDraftRepository clipsDraftRepository, OVo oVo, C47Z c47z, InterfaceC23621Ds interfaceC23621Ds) {
        this.A01 = clipsDraftRepository;
        this.A03 = c47z;
        this.A02 = oVo;
        this.A04 = interfaceC23621Ds;
        this.A00 = c128175qm;
    }

    @Override // X.InterfaceC50452MPg
    public final void D8I(String str) {
        this.A04.resumeWith(AbstractC43592JPx.A0p(new O7P(this.A00, C05F.A0N)));
        AbstractC183338Bg.A00(this.A01.A03).A0O("clipsDraftRepository onCreatePendingMediaFromDraftFailed", "failed to generate PendingMedia from ClipsDraft");
    }

    @Override // X.InterfaceC50452MPg
    public final void D8J(C47Z c47z) {
        Object A0z;
        int i;
        ClipsDraftRepository clipsDraftRepository = this.A01;
        clipsDraftRepository.A06.A0D(c47z, c47z.A35);
        C128175qm c128175qm = (C128175qm) C2ST.A00(AnonymousClass191.A00, new C57160PZe(c47z, this.A00, clipsDraftRepository, (InterfaceC23621Ds) null, 36));
        ClipsDraftRepository.A07(clipsDraftRepository.A03, c128175qm, clipsDraftRepository, this.A03);
        OVo oVo = this.A02;
        boolean z = oVo.A01;
        InterfaceC23621Ds interfaceC23621Ds = this.A04;
        if (z) {
            String str = oVo.A00;
            if (str != null) {
                try {
                } catch (NoSuchElementException unused) {
                    r1 = C05F.A0Y;
                }
                for (Integer num : C05F.A00(5)) {
                    if (C14360o3.A0K(AbstractC54868OOd.A01(num), str)) {
                        A0z = AbstractC43592JPx.A0p(new O7P(c128175qm, num));
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } else {
                C14360o3.A0F("musicDownloadError");
                throw C00O.createAndThrow();
            }
        } else {
            A0z = AbstractC25225BEi.A0z(c128175qm);
        }
        interfaceC23621Ds.resumeWith(A0z);
    }
}
