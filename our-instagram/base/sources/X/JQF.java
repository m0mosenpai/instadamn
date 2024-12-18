package X;

import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* loaded from: classes8.dex */
public final class JQF implements InterfaceC19390xP {
    public final /* synthetic */ ClipsDraftPreviewItemRepository A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public JQF(ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, InterfaceC19390xP interfaceC19390xP) {
        this.A01 = interfaceC19390xP;
        this.A00 = clipsDraftPreviewItemRepository;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A01, new JWH(35, interfaceC19960yQ, this.A00));
    }
}
