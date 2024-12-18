package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Cpb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28927Cpb implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A02);
        C18C.A0E(this.A03);
        C18C.A0E(this.A04);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A05), "FetchBlockV5MetadataQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), QUK.class, false, null, 0, null, "ar_block_metadata", AbstractC166987dD.A1E());
    }
}
