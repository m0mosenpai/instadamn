package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.2yG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65782yG {
    public int A00 = 4;
    public boolean A01;
    public final C13270mD A02;
    public final Queue A03;

    public C65782yG(Context context) {
        C13270mD c13270mD = new C13270mD(context, 0);
        this.A02 = c13270mD;
        this.A03 = new LinkedList();
        boolean z = RecyclerReelAvatarView.A05;
        C14360o3.A0B(c13270mD.A00, 0);
    }

    public final void A00() {
        if (!this.A01) {
            this.A01 = true;
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                this.A02.A00(new InterfaceC13250mB() { // from class: X.5IW
                    @Override // X.InterfaceC13250mB
                    public final void DLv(ViewGroup viewGroup, View view, int i3) {
                        C14360o3.A0B(view, 0);
                        C65782yG.this.A03.offer(view);
                    }
                }, R.layout.reel_item_with_background);
            }
        }
    }
}
