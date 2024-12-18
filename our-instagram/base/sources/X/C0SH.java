package X;

import android.view.View;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.0SH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SH extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Collection A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SH(Collection collection) {
        super(1);
        this.A00 = collection;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C14360o3.A0B(entry, 0);
        return Boolean.valueOf(AbstractC001800i.A0u(this.A00, ((View) entry.getValue()).getTransitionName()));
    }
}
