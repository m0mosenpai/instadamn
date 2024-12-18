package X;

import instagram.features.stories.fragment.ReelMoreOptionsFragment;

/* loaded from: classes9.dex */
public final class PI1 implements GYP {
    public final /* synthetic */ ReelMoreOptionsFragment A00;

    public PI1(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        this.A00 = reelMoreOptionsFragment;
    }

    @Override // X.GYP
    public final void onTextChanged(String str) {
        ReelMoreOptionsFragment reelMoreOptionsFragment = this.A00;
        String str2 = reelMoreOptionsFragment.A03.A0C;
        if (str2 == null) {
            str2 = "";
        }
        if (!str.equals(str2)) {
            ReelMoreOptionsFragment.A0A(reelMoreOptionsFragment);
        }
    }
}
