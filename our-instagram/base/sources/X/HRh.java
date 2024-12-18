package X;

import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class HRh extends C17T implements JM8 {
    public List A00;

    @Override // X.JM8
    public final AudioBrowserPlaylistType Be7() {
        return (AudioBrowserPlaylistType) A0N(816650631, JAW.A00);
    }

    @Override // X.JM8
    public final List Bfr() {
        List list = this.A00;
        if (list == null) {
            return A08(696989833, C39249HRs.class);
        }
        return list;
    }

    @Override // X.JM8
    public final String getId() {
        return A0h(3355);
    }

    @Override // X.JM8
    public final String Aal() {
        return A0i(-757853179);
    }

    @Override // X.JM8
    public final ImageUrl BEx() {
        return A0A(-737588055);
    }

    @Override // X.JM8
    public final JM8 E9Z(C1DY c1dy) {
        ArrayList arrayList;
        List<JL3> Bfr = Bfr();
        if (Bfr != null) {
            arrayList = AbstractC167017dG.A0q(Bfr);
            for (JL3 jl3 : Bfr) {
                jl3.E9e(c1dy);
                arrayList.add(jl3);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.JM8
    public final String getSubtitle() {
        return A0U();
    }

    @Override // X.JM8
    public final String getTitle() {
        return A0S();
    }
}
