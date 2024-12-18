package X;

import com.instagram.tagging.widget.TagsInteractiveLayout;

/* loaded from: classes9.dex */
public final class PHF implements InterfaceC43423JGn {
    public final /* synthetic */ TagsInteractiveLayout A00;

    public PHF(TagsInteractiveLayout tagsInteractiveLayout) {
        this.A00 = tagsInteractiveLayout;
    }

    @Override // X.InterfaceC43423JGn
    public final void EFL(C38321qM c38321qM, com.instagram.tagging.model.Tag tag) {
        if (tag != null) {
            this.A00.A09(tag);
        }
    }
}
