package X;

/* renamed from: X.Mmq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51385Mmq extends AbstractC29571bY {
    public final /* synthetic */ C2PX A00;

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `audio_amplitudes` (`audio_asset_id`,`audio_amplitudes_list`,`last_used_time_ms`) VALUES (?,?,?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51385Mmq(C1YP c1yp, C2PX c2px) {
        super(c1yp);
        this.A00 = c2px;
    }

    @Override // X.AbstractC29571bY
    public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
        OA7 oa7 = (OA7) obj;
        interfaceC37561ot.ADp(1, oa7.A01);
        interfaceC37561ot.ADp(2, AbstractC31175DnJ.A0a("␞", oa7.A02));
        interfaceC37561ot.ADi(3, oa7.A00);
    }
}
