package X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.List;

/* loaded from: classes4.dex */
public final class ABX {
    public String A00;
    public String A01;
    public String A02;
    public final ReelStore A03;

    public final Reel A00(C214479el c214479el) {
        C14360o3.A0B(c214479el, 0);
        this.A01 = c214479el.A00.A1V;
        this.A02 = c214479el.A01;
        List list = c214479el.A02;
        C14360o3.A07(list);
        this.A00 = (String) AbstractC001800i.A0J(list);
        return this.A03.A0I(c214479el.A00, true);
    }

    public ABX(ReelStore reelStore) {
        this.A03 = reelStore;
    }
}
