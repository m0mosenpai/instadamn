package X;

import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;

/* renamed from: X.OrE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55864OrE implements GXD {
    public final /* synthetic */ AbstractC52176N7l A00;
    public final /* synthetic */ BrandedContentDisclosureBaseViewModel A01;

    public C55864OrE(AbstractC52176N7l abstractC52176N7l, BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel) {
        this.A01 = brandedContentDisclosureBaseViewModel;
        this.A00 = abstractC52176N7l;
    }

    @Override // X.GXD
    public final void DyW() {
        BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel = this.A01;
        AbstractC52176N7l abstractC52176N7l = this.A00;
        String str = abstractC52176N7l.A00;
        if (str != null) {
            brandedContentDisclosureBaseViewModel.A07(abstractC52176N7l, str);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
