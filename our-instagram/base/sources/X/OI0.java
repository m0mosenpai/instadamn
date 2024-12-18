package X;

import com.instagram.newsfeed.fragment.NewsfeedFragment;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OI0 {
    public final /* synthetic */ NewsfeedFragment A00;
    public final /* synthetic */ MUR A01;

    public final void A00(C51757Mtg c51757Mtg, BJF bjf, boolean z) {
        MUR mur = this.A01;
        Map map = mur.A02;
        Object obj = map.get(c51757Mtg);
        if (obj == null) {
            obj = AbstractC166987dD.A1E();
            map.put(c51757Mtg, obj);
        }
        List list = (List) obj;
        if (c51757Mtg.A01 == C05F.A00) {
            list.clear();
        }
        if (z) {
            list.add(bjf);
        } else {
            list.remove(bjf);
        }
        boolean A1O = AbstractC167007dF.A1O(mur.A03().size());
        NewsfeedFragment newsfeedFragment = this.A00;
        C189478aR c189478aR = newsfeedFragment.A03;
        if (c189478aR != null) {
            c189478aR.A0K(NewsfeedFragment.A00(newsfeedFragment, mur, A1O), true);
        }
    }

    public OI0(NewsfeedFragment newsfeedFragment, MUR mur) {
        this.A01 = mur;
        this.A00 = newsfeedFragment;
    }
}
