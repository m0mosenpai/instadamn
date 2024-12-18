package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.newsfeed.model.PillsFilterCategory;
import java.io.Serializable;

/* renamed from: X.BIr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25322BIr extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Fragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25322BIr(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        Object A0m;
        if (Serializable.class.isAssignableFrom(PillsFilterCategory.class)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0m = requireArguments.getSerializable("newsfeed_filter", Object.class);
            } else {
                A0m = AbstractC25228BEl.A11(requireArguments, "newsfeed_filter");
            }
        } else if (AbstractC25226BEj.A1a(PillsFilterCategory.class)) {
            A0m = AbstractC25231BEo.A0m(this.A00, "newsfeed_filter");
        } else {
            throw AbstractC25231BEo.A0i("newsfeed_filter");
        }
        if (!(A0m instanceof PillsFilterCategory)) {
            return null;
        }
        return A0m;
    }
}
