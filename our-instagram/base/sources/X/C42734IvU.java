package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IvU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42734IvU implements InterfaceC43451JHp {
    public InterfaceC43529JKp A00;

    @Override // X.InterfaceC43451JHp
    public final AudioBrowserCategoryType Amc() {
        return this.A00.Amc();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.Goo] */
    @Override // X.InterfaceC43451JHp
    public final List Bfr() {
        List<JJV> Bfr = this.A00.Bfr();
        C14360o3.A0B(Bfr, 0);
        ArrayList A0q = AbstractC167017dG.A0q(Bfr);
        for (JJV jjv : Bfr) {
            C14360o3.A0B(jjv, 1);
            JM8 Be5 = jjv.Be5();
            C14360o3.A0B(Be5, 1);
            ?? obj = new Object();
            obj.A0E = new MusicSearchPlaylist(Be5);
            obj.A02();
            A0q.add(obj);
        }
        return A0q;
    }

    @Override // X.InterfaceC43451JHp
    public final String getId() {
        return this.A00.getId();
    }

    @Override // X.InterfaceC43451JHp
    public final String getTitle() {
        return this.A00.getTitle();
    }
}
