package X;

import android.view.View;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* loaded from: classes8.dex */
public final class JYG implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C106144qU A00;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public JYG(C106144qU c106144qU) {
        this.A00 = c106144qU;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C106144qU c106144qU = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        NoteAvatarView noteAvatarView = c106144qU.A08;
        noteAvatarView.A0C.setVisibility(0);
        noteAvatarView.A06.setVisibility(4);
    }
}
