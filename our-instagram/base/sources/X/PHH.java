package X;

import com.instagram.tagging.widget.TagsInteractiveLayout;

/* loaded from: classes9.dex */
public final class PHH implements InterfaceC43424JGo {
    public final /* synthetic */ TagsInteractiveLayout A00;

    public PHH(TagsInteractiveLayout tagsInteractiveLayout) {
        this.A00 = tagsInteractiveLayout;
    }

    @Override // X.InterfaceC43424JGo
    public final void EGN(com.instagram.tagging.model.Tag tag) {
        if (tag != null) {
            this.A00.A09(tag);
        }
    }
}
