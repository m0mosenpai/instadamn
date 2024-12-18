package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes9.dex */
public final class NX7 extends AbstractC41193ILh {
    public IgImageView A00;
    public TagsInteractiveLayout A01;
    public MediaFrameLayout A02;

    public NX7(View view) {
        super(view);
        this.A02 = (MediaFrameLayout) view.requireViewById(R.id.image_container);
        IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.tag_image_view);
        this.A00 = A0Z;
        AbstractC010103p.A0B(A0Z, new C50827MdK(this, 2));
        this.A01 = (TagsInteractiveLayout) view.requireViewById(R.id.combined_tagging_layout);
    }
}
