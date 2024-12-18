package X;

/* renamed from: X.Rro, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61674Rro {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6F7 c6f7;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            C6F3 A04 = AnonymousClass634.A04(c6fg, "media_store");
            if ((A04 instanceof C6F7) && (c6f7 = (C6F7) A04) != null) {
                String A0d = AbstractC31177DnL.A0d(c6fw);
                C14360o3.A0B(A0d, 1);
                c6f7.A02.execute(new TPY(c6f7, c6fg, A0d));
            } else {
                AbstractC25241Le.A02("bk.action.media.LoadAlbums", "Failed to load albums: MediaStore data module is not found.");
                return null;
            }
        }
        return null;
    }
}
