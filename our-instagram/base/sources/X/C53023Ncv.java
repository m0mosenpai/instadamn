package X;

/* renamed from: X.Ncv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53023Ncv extends OFO implements InterfaceC66482zP {
    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_fundraiser";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        OFO ofo = (OFO) obj;
        if (ofo != null && this.A00 == ofo.A00 && this.A01 == ofo.A01 && this.A02 == ofo.A02 && AbstractC50102Ry.A00(this.A05, ofo.A05)) {
            return true;
        }
        return false;
    }
}
