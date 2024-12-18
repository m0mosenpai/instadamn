package X;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.58p, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C58p extends C03E implements InterfaceC16610sE {
    public C58p(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C5YC) obj2).A00;
        Resources resources = ((View) this.receiver).getContext().getResources();
        new C25730BYq(new AnonymousClass582(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), (InterfaceC16660sJ) obj3, j);
        throw new NullPointerException("getClipData");
    }
}
