package X;

/* renamed from: X.IoJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42295IoJ implements InterfaceC66482zP {
    public final C5QE A00;
    public final HH9 A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "product_collection_description";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42295IoJ c42295IoJ = (C42295IoJ) obj;
        C5QE c5qe = this.A00;
        C5QE c5qe2 = null;
        if (c42295IoJ != null) {
            c5qe2 = c42295IoJ.A00;
        }
        if (C14360o3.A0K(c5qe, c5qe2) && c42295IoJ != null && C14360o3.A0K(this.A01, c42295IoJ.A01)) {
            return true;
        }
        return false;
    }

    public C42295IoJ(C5QE c5qe, HH9 hh9) {
        this.A00 = c5qe;
        this.A01 = hh9;
    }
}
