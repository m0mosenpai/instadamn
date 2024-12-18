package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gvc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38455Gvc extends C3OO {
    public final IgImageView A00;
    public final InterfaceC56392iX A01;
    public final C38515Gwb A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38455Gvc(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = new C38515Gwb(view, R.layout.question_response_item_media);
        this.A01 = AbstractC31179DnN.A0M(view, R.id.question_response_card_media_preview_stub);
        this.A00 = AbstractC167007dF.A0T(view, R.id.question_media_play_button);
    }
}
