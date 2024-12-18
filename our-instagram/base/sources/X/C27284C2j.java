package X;

import android.transition.Scene;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.C2j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27284C2j extends AbstractC155866zG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C27284C2j(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.fragment.app.Fragment] */
    @Override // X.AbstractC155866zG
    public final void A00(AppBarLayout appBarLayout, Integer num) {
        Object obj;
        EffectsPageModel effectsPageModel;
        String str;
        ImageView imageView;
        EffectsPageFragment effectsPageFragment;
        FragmentActivity requireActivity;
        int i;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (num == C05F.A01) {
                    obj = this.A03;
                } else {
                    if (num == C05F.A00) {
                        obj = this.A02;
                    }
                    EffectsPageFragment effectsPageFragment2 = (EffectsPageFragment) this.A01;
                    effectsPageModel = effectsPageFragment2.A03;
                    if (effectsPageModel != null || (str = effectsPageModel.A0C) == null || !str.equals("HORIZON")) {
                        return;
                    }
                    imageView = (ImageView) ((View) this.A04).requireViewById(R.id.use_in_camera_icon);
                    effectsPageFragment = effectsPageFragment2;
                    break;
                }
                AbstractC1566871q.A00((Scene) obj);
                EffectsPageFragment effectsPageFragment22 = (EffectsPageFragment) this.A01;
                effectsPageModel = effectsPageFragment22.A03;
                if (effectsPageModel != null) {
                    return;
                } else {
                    return;
                }
            case 1:
                C14360o3.A0B(num, 1);
                if (num == C05F.A01) {
                    obj2 = this.A02;
                } else {
                    if (num == C05F.A00) {
                        obj2 = this.A01;
                    }
                    imageView = (ImageView) AbstractC166997dE.A0R((View) this.A03, R.id.use_in_camera_icon);
                    effectsPageFragment = (Fragment) this.A04;
                    break;
                }
                AbstractC1566871q.A00((Scene) obj2);
                imageView = (ImageView) AbstractC166997dE.A0R((View) this.A03, R.id.use_in_camera_icon);
                effectsPageFragment = (Fragment) this.A04;
            default:
                C14360o3.A0B(num, 1);
                if (num == C05F.A01) {
                    obj3 = this.A02;
                } else {
                    if (num == C05F.A00) {
                        obj3 = this.A01;
                    }
                    imageView = (ImageView) AbstractC166997dE.A0R((View) this.A03, R.id.use_in_camera_icon);
                    requireActivity = ((Fragment) this.A04).requireActivity();
                    i = R.drawable.instagram_glasses_pano_outline_16;
                    AbstractC166997dE.A19(requireActivity, imageView, i);
                }
                AbstractC1566871q.A00((Scene) obj3);
                imageView = (ImageView) AbstractC166997dE.A0R((View) this.A03, R.id.use_in_camera_icon);
                requireActivity = ((Fragment) this.A04).requireActivity();
                i = R.drawable.instagram_glasses_pano_outline_16;
                AbstractC166997dE.A19(requireActivity, imageView, i);
        }
        requireActivity = effectsPageFragment.requireActivity();
        i = R.drawable.instagram_link_pano_filled_24;
        AbstractC166997dE.A19(requireActivity, imageView, i);
    }
}
