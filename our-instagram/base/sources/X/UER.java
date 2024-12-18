package X;

import android.content.Context;
import android.view.ActionProvider;

/* loaded from: classes11.dex */
public final class UER extends C02Y implements ActionProvider.VisibilityListener {
    public C02X A00;
    public final ActionProvider A01;
    public final /* synthetic */ UDH A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UER(Context context, ActionProvider actionProvider, UDH udh) {
        super(context);
        this.A02 = udh;
        this.A01 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C02X c02x = this.A00;
        if (c02x != null) {
            WQH wqh = ((WQN) c02x).A00.A0A;
            wqh.A0B = true;
            wqh.A0D(true);
        }
    }
}
