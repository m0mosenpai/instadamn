package X;

import com.instagram.tagging.widget.TagsLayout;

/* loaded from: classes9.dex */
public final class PHJ implements InterfaceC125355lh {
    public final /* synthetic */ AbstractC50789Mc6 A00;
    public final /* synthetic */ TagsLayout A01;

    public PHJ(AbstractC50789Mc6 abstractC50789Mc6, TagsLayout tagsLayout) {
        this.A01 = tagsLayout;
        this.A00 = abstractC50789Mc6;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        this.A01.removeView(this.A00);
    }
}
