package X;

import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Text;

/* loaded from: classes8.dex */
public final class KLH extends AbstractRunnableC14200nk {
    public KLH() {
        super(2005773668, 4, false, false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45376K6j A00 = AddMessageContent.A00();
        AbstractC60877RXa A0I = Text.DEFAULT_INSTANCE.A0I();
        Text text = (Text) AbstractC43592JPx.A0K(A0I);
        text.bitField0_ |= 1;
        text.text_ = "empty";
        JQ1.A0B(A00, A0I).addMessageContentCase_ = 1;
        A00.A02();
    }
}
