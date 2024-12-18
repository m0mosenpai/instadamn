package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Oww, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56189Oww implements InterfaceC69513Al {
    public final int A00;
    public final Object A01;

    public C56189Oww(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        switch (this.A00) {
            case 0:
                ViewOnClickListenerC55467OkM.A00(view, 16, this.A01);
                return;
            case 1:
                C54697ODz c54697ODz = (C54697ODz) this.A01;
                C14360o3.A0A(view);
                c54697ODz.A03 = AbstractC166997dE.A0T(view, R.id.story_interstitial_reel_item_title);
                c54697ODz.A02 = AbstractC166997dE.A0T(view, R.id.story_interstitial_reel_item_subtitle);
                c54697ODz.A04 = AbstractC31172DnG.A0Z(view, R.id.story_interstitial_reel_item_facepile);
                c54697ODz.A01 = AbstractC166997dE.A0T(view, R.id.story_interstitial_reel_item_button);
                return;
            default:
                if (view != null) {
                    ODH odh = (ODH) this.A01;
                    odh.A02 = AbstractC166997dE.A0T(view, R.id.pog_garden_chaining_title);
                    odh.A01 = AbstractC166997dE.A0T(view, R.id.pog_garden_chaining_subtitle);
                    GradientSpinnerAvatarView[] gradientSpinnerAvatarViewArr = odh.A03;
                    gradientSpinnerAvatarViewArr[0] = view.requireViewById(R.id.pog_garden_item_1);
                    gradientSpinnerAvatarViewArr[1] = view.requireViewById(R.id.pog_garden_item_2);
                    gradientSpinnerAvatarViewArr[2] = view.requireViewById(R.id.pog_garden_item_3);
                    gradientSpinnerAvatarViewArr[3] = view.requireViewById(R.id.pog_garden_item_4);
                    gradientSpinnerAvatarViewArr[4] = view.requireViewById(R.id.pog_garden_item_5);
                    gradientSpinnerAvatarViewArr[5] = view.requireViewById(R.id.pog_garden_item_6);
                    gradientSpinnerAvatarViewArr[6] = view.requireViewById(R.id.pog_garden_item_7);
                    gradientSpinnerAvatarViewArr[7] = view.requireViewById(R.id.pog_garden_item_8);
                    gradientSpinnerAvatarViewArr[8] = view.requireViewById(R.id.pog_garden_item_9);
                    return;
                }
                return;
        }
    }
}
