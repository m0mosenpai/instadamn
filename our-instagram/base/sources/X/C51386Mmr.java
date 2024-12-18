package X;

/* renamed from: X.Mmr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51386Mmr extends AbstractC29571bY {
    public final /* synthetic */ C2PZ A00;

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `clips_remix_original_media` (`media_id`,`file_path`,`file_size`,`last_used_time_ms`) VALUES (?,?,?,?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51386Mmr(C1YP c1yp, C2PZ c2pz) {
        super(c1yp);
        this.A00 = c2pz;
    }

    @Override // X.AbstractC29571bY
    public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
        C51603Mqv c51603Mqv = (C51603Mqv) obj;
        interfaceC37561ot.ADp(1, c51603Mqv.A03);
        interfaceC37561ot.ADp(2, c51603Mqv.A02);
        interfaceC37561ot.ADi(3, c51603Mqv.A00);
        interfaceC37561ot.ADi(4, c51603Mqv.A01);
    }
}
