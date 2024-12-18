package X;

import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class T1v implements InterfaceC65374Tj6 {
    public final SmartCaptureLogger A00;
    public final Collection A01;

    public T1v(SmartCaptureLogger smartCaptureLogger, Collection collection) {
        C14360o3.A0B(collection, 1);
        this.A01 = collection;
        this.A00 = smartCaptureLogger;
    }

    @Override // X.InterfaceC65374Tj6
    public final void D3C() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                AbstractC166987dD.A11(AbstractC166987dD.A1B(it)).delete();
            } catch (Exception e) {
                this.A00.logError("Unable to delete temp file", e);
            }
        }
    }
}
