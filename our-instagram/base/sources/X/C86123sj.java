package X;

import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.3sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86123sj {
    public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass019(C86123sj.class, "thumbnail", "getThumbnail()Lcom/instagram/common/ui/widget/imageview/IgImageView;", 0), new AnonymousClass019(C86123sj.class, "dismissButton", "getDismissButton()Landroid/view/View;", 0)};
    public J19 A00;
    public final C57012jc A01;
    public final InterfaceC09390do A02;
    public final InterfaceC16130rD A03;
    public final InterfaceC16130rD A04;

    public C86123sj(ViewStub viewStub) {
        C57012jc c57012jc = new C57012jc(viewStub);
        this.A01 = c57012jc;
        this.A02 = C1XM.A00(new C207019Eg(this, 44));
        this.A04 = new C86133sk(c57012jc, R.id.feed_preview_thumbnail);
        this.A03 = new C86133sk(c57012jc, R.id.dismiss_button);
    }
}
