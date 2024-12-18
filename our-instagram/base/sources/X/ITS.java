package X;

import android.os.Bundle;
import instagram.features.stories.fragment.ReelViewerFragment;

/* loaded from: classes7.dex */
public abstract class ITS {
    public static final ReelViewerFragment A01(Bundle bundle) {
        ReelViewerFragment reelViewerFragment = new ReelViewerFragment();
        reelViewerFragment.setArguments(bundle);
        return reelViewerFragment;
    }

    public static final HDE A00(String str, String str2, int i) {
        AbstractC167017dG.A1N(str, str2);
        HDE hde = new HDE();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("ReelQuizRespondersListFragment.REEL_ID", str);
        A0b.putString("ReelQuizRespondersListFragment.REEL_ITEM_ID", str2);
        A0b.putInt("ReelQuizRespondersListFragment.QUIZ_OPTION_INDEX", i);
        hde.setArguments(A0b);
        return hde;
    }
}
