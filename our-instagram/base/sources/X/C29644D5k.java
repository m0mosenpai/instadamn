package X;

import android.os.Build;
import android.os.Bundle;
import com.instagram.aistudio.model.UtmMetadata;

/* renamed from: X.D5k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29644D5k extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C26811BsZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29644D5k(C26811BsZ c26811BsZ) {
        super(0);
        this.A00 = c26811BsZ;
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
