package X;

import com.instagram.api.schemas.MusicStatusStyleResponseInfoImpl;
import com.instagram.api.schemas.StatusStyleResponseInfoImpl;
import java.io.IOException;

/* renamed from: X.HtR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40261HtR {
    public static StatusStyleResponseInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MusicStatusStyleResponseInfoImpl musicStatusStyleResponseInfoImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC43591JPw.A00(1184).equals(AbstractC166997dE.A0s(c16l))) {
                    musicStatusStyleResponseInfoImpl = AbstractC40102HqU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new StatusStyleResponseInfoImpl(musicStatusStyleResponseInfoImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
