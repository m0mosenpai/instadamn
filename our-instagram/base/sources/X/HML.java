package X;

import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class HML extends NQK {
    public final C38061Goo A00;

    public HML(C38061Goo c38061Goo) {
        super(AbstractC37301Gc2.A0p("ITEM_ID_KEY.SEARCH_ITEM", c38061Goo.A01()));
        this.A00 = c38061Goo;
    }

    @Override // X.NQK
    public final boolean A00(JIN jin) {
        String str;
        MusicSearchPlaylist musicSearchPlaylist;
        String id = jin.getId();
        C38061Goo c38061Goo = this.A00;
        JIN A00 = c38061Goo.A00();
        if (A00 != null) {
            str = A00.getId();
        } else {
            str = null;
        }
        if (!C14360o3.A0K(id, str)) {
            if (c38061Goo.A0G != C05F.A0j || (musicSearchPlaylist = c38061Goo.A0E) == null) {
                return false;
            }
            List A0n = AbstractC31171DnF.A0n(musicSearchPlaylist.A01);
            int size = A0n.size();
            for (int i = 0; i < size; i++) {
                C38061Goo c38061Goo2 = (C38061Goo) A0n.get(i);
                if (c38061Goo2.A0G != C05F.A01 || !C14360o3.A0K(c38061Goo2.A00(), jin)) {
                }
            }
            return false;
        }
        return true;
    }
}
