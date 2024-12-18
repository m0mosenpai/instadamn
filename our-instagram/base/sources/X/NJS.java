package X;

import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* loaded from: classes9.dex */
public final class NJS extends P0O {
    public PublishScreenCategoryType A00;
    public final AbstractC59962oe A01;
    public final C52468NJm A02;

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 8), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJS(AbstractC59962oe abstractC59962oe, C52468NJm c52468NJm, InterfaceC58310Pt2 interfaceC58310Pt2, PublishScreenCategoryType publishScreenCategoryType) {
        super(abstractC59962oe, interfaceC58310Pt2, publishScreenCategoryType);
        AbstractC167017dG.A1Q(abstractC59962oe, interfaceC58310Pt2);
        this.A01 = abstractC59962oe;
        this.A00 = publishScreenCategoryType;
        this.A02 = c52468NJm;
    }
}
