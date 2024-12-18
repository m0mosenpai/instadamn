package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Wuz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71495Wuz implements Runnable {
    public final /* synthetic */ VBH A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public RunnableC71495Wuz(VBH vbh, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = vbh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.invoke();
        VBH vbh = this.A00;
        vbh.setVisibility(8);
        IgSimpleImageView igSimpleImageView = vbh.A00;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(8);
        }
    }
}
