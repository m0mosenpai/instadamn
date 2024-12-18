package X;

/* renamed from: X.UhG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67146UhG extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "video_id");
        C4OW c4ow2 = new C4OW(c94754Oe, "dash_manifest");
        C4OW c4ow3 = new C4OW(c94754Oe, AbstractC111324zv.A00(4564));
        C4OW c4ow4 = new C4OW(c94754Oe, AbstractC111324zv.A00(5253));
        C94894Ou c94894Ou = C94894Ou.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, new C4OW(c94894Ou, "duration_ms"), new C4OW(c94894Ou, "expiry")});
    }

    public C67146UhG(int i) {
        super(i);
    }

    public C67146UhG() {
        super(-1940125461);
    }
}
