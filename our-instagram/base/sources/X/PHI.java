package X;

import com.instagram.tagging.widget.TagsLayout;

/* loaded from: classes9.dex */
public final class PHI implements InterfaceC43424JGo {
    public final /* synthetic */ TagsLayout A00;
    public final /* synthetic */ C80223iB A01;

    public PHI(TagsLayout tagsLayout, C80223iB c80223iB) {
        this.A00 = tagsLayout;
        this.A01 = c80223iB;
    }

    @Override // X.InterfaceC43424JGo
    public final void EGN(com.instagram.tagging.model.Tag tag) {
        if (tag != null) {
            TagsLayout tagsLayout = this.A00;
            tagsLayout.removeView(tagsLayout.findViewWithTag(tag));
        }
        AbstractC25225BEi.A1U(this.A01.A00.A00, tag);
    }
}
