package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1K implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C218259kx A02;

    public B1K(UserSession userSession, C218259kx c218259kx, int i) {
        this.A02 = c218259kx;
        this.A00 = i;
        this.A01 = userSession;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C218259kx c218259kx = this.A02;
        C8C0 c8c0 = ((C8J9) c218259kx).A01;
        c8c0.A08(this.A00);
        UserSession userSession = this.A01;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = c8c0.A0P;
        C14360o3.A07(nestableSnapPickerRecyclerView);
        nestableSnapPickerRecyclerView.post(new RunnableC24800AyM(nestableSnapPickerRecyclerView, userSession, c218259kx));
        return AbstractC166997dE.A0b();
    }
}
