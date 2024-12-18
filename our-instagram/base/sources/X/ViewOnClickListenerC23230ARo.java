package X;

import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.ARo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23230ARo implements View.OnClickListener {
    public final /* synthetic */ C189448aO A00;
    public final /* synthetic */ BottomSheetFragment A01;

    public ViewOnClickListenerC23230ARo(C189448aO c189448aO, BottomSheetFragment bottomSheetFragment) {
        this.A00 = c189448aO;
        this.A01 = bottomSheetFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-385202641);
        View.OnClickListener onClickListener = this.A00.A0K;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        AbstractC167007dF.A16(this.A01.A02);
        C0f9.A0C(1140320309, A05);
    }
}
