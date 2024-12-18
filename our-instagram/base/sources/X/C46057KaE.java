package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.KaE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46057KaE extends AnonymousClass772 {
    public final /* synthetic */ C7S8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46057KaE(C7S8 c7s8) {
        super(null);
        this.A00 = c7s8;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("magic_media_remix_template_position", 0);
        A0b.putString("magic_media_remix_template_layout_name", "POLAROID_2X");
        A0b.putStringArrayList("magic_media_remix_template_bitmap_paths", AbstractC166987dD.A1E());
        C7S8 c7s8 = this.A00;
        UserSession userSession = c7s8.A02;
        Activity activity = c7s8.A01;
        C6XJ c6xj = new C6XJ(activity, A0b, userSession, ModalActivity.class, "MAGIC_MEDIA_REMIX_TEMPLATE");
        c6xj.A0H = false;
        c6xj.A07();
        c6xj.A0C(activity);
    }
}
