package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;
import java.io.Serializable;

/* renamed from: X.D5x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29655D5x extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Fragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29655D5x(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        Object A0m;
        if (Serializable.class.isAssignableFrom(ImageUrl.class)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0m = requireArguments.getSerializable("PREVIEW_URL_ARGUMENT", Object.class);
            } else {
                A0m = AbstractC25228BEl.A11(requireArguments, "PREVIEW_URL_ARGUMENT");
            }
        } else if (AbstractC25226BEj.A1a(ImageUrl.class)) {
            A0m = AbstractC25231BEo.A0m(this.A00, "PREVIEW_URL_ARGUMENT");
        } else {
            throw AbstractC25231BEo.A0i("PREVIEW_URL_ARGUMENT");
        }
        if (!(A0m instanceof ImageUrl)) {
            return null;
        }
        return A0m;
    }
}
