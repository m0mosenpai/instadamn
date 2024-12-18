package X;

import android.os.Build;
import android.os.Bundle;
import com.instagram.aistudio.model.UtmMetadata;

/* loaded from: classes5.dex */
public final class D5l extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C26814Bsc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5l(C26814Bsc c26814Bsc) {
        super(0);
        this.A00 = c26814Bsc;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.A00.mArguments;
        if (i >= 33) {
            if (bundle == null) {
                return null;
            }
            return bundle.getParcelable("utm_metadata", UtmMetadata.class);
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getParcelable("utm_metadata");
    }
}
