package X;

import com.instagram.common.gallery.Medium;

/* loaded from: classes8.dex */
public final class KM7 extends AbstractRunnableC14200nk {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ CallableC209819Pr A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM7(Medium medium, CallableC209819Pr callableC209819Pr) {
        super(457, 3, false, false);
        this.A01 = callableC209819Pr;
        this.A00 = medium;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String Avl;
        try {
            InterfaceC197178nn interfaceC197178nn = this.A01.call().A02;
            if (interfaceC197178nn != null && (Avl = interfaceC197178nn.Avl()) != null) {
                this.A00.A0X = Avl;
            }
        } catch (Exception e) {
            C0f5 AEp = C18950wb.A01.AEp("Failed to load image in FeedExternalShareImageLoader", 817892914);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            AEp.ABW("error_message", message);
        }
    }
}
