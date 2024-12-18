package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.List;

/* renamed from: X.Acb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23581Acb implements BDI {
    public final /* synthetic */ C128175qm A00;
    public final /* synthetic */ InterfaceC25188BCl A01;
    public final /* synthetic */ ClipsDraftRepository A02;
    public final /* synthetic */ boolean A03;

    @Override // X.BDI
    public final /* synthetic */ void DnM(List list) {
    }

    public C23581Acb(C128175qm c128175qm, InterfaceC25188BCl interfaceC25188BCl, ClipsDraftRepository clipsDraftRepository, boolean z) {
        this.A03 = z;
        this.A02 = clipsDraftRepository;
        this.A00 = c128175qm;
        this.A01 = interfaceC25188BCl;
    }

    @Override // X.BDI
    public final void onFailure() {
        InterfaceC25188BCl interfaceC25188BCl = this.A01;
        if (interfaceC25188BCl != null) {
            interfaceC25188BCl.onFailure();
        }
    }

    @Override // X.BDI
    public final void onSuccess() {
        if (this.A03) {
            C23031Ai c23031Ai = this.A02.A08;
            String str = this.A00.A0e;
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
            A0w.E7K("last_saved_draft_date_and_count", str);
            A0w.apply();
        }
        InterfaceC25188BCl interfaceC25188BCl = this.A01;
        if (interfaceC25188BCl != null) {
            interfaceC25188BCl.onSuccess();
        }
    }
}
