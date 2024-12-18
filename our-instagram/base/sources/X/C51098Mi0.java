package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.Mi0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51098Mi0 extends LinearLayoutManager {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51098Mi0(Context context, DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        super(context, 0, false);
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final boolean A1X() {
        return false;
    }
}
