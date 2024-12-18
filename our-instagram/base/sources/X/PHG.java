package X;

import com.instagram.tagging.widget.TagsLayout;

/* loaded from: classes9.dex */
public final class PHG implements InterfaceC43423JGn {
    public final /* synthetic */ TagsLayout A00;

    public PHG(TagsLayout tagsLayout) {
        this.A00 = tagsLayout;
    }

    @Override // X.InterfaceC43423JGn
    public final void EFL(C38321qM c38321qM, com.instagram.tagging.model.Tag tag) {
        if (tag != null) {
            TagsLayout tagsLayout = this.A00;
            tagsLayout.removeView(tagsLayout.findViewWithTag(tag));
        }
    }
}
