package X;

import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.J1w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43056J1w implements InterfaceC43456JHu {
    public IgImageView A00;
    public SimpleVideoLayout A01;

    @Override // X.InterfaceC43456JHu
    public final IgImageView BGm() {
        IgImageView igImageView = this.A00;
        if (igImageView != null) {
            return igImageView;
        }
        C14360o3.A0F("imagePlaceholder");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43456JHu
    public final SimpleVideoLayout CF1() {
        SimpleVideoLayout simpleVideoLayout = this.A01;
        if (simpleVideoLayout != null) {
            return simpleVideoLayout;
        }
        C14360o3.A0F("videoContainer");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43456JHu
    public final void CMZ() {
        BGm().setVisibility(8);
    }

    @Override // X.InterfaceC43456JHu
    public final void Ekw() {
        BGm().setVisibility(0);
    }
}
