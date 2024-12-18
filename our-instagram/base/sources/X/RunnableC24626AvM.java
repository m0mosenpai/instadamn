package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import java.util.List;

/* renamed from: X.AvM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24626AvM implements Runnable {
    public final /* synthetic */ MagicMediaRemixEditController A00;
    public final /* synthetic */ List A01;

    public RunnableC24626AvM(MagicMediaRemixEditController magicMediaRemixEditController, List list) {
        this.A01 = list;
        this.A00 = magicMediaRemixEditController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(this.A01);
        this.A00.A06.A05(viewModelListUpdate);
    }
}
