package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.GSr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37012GSr extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Fragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37012GSr(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        Object A0m;
        if (Serializable.class.isAssignableFrom(EnumC33397EpU.class)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0m = requireArguments.getSerializable("entrypoint", Object.class);
            } else {
                A0m = requireArguments.getSerializable("entrypoint");
                if (A0m == null) {
                    A0m = null;
                }
            }
        } else if (Parcelable.class.isAssignableFrom(EnumC33397EpU.class)) {
            A0m = AbstractC25231BEo.A0m(this.A00, "entrypoint");
        } else {
            throw AbstractC25231BEo.A0i("entrypoint");
        }
        if (!(A0m instanceof EnumC33397EpU)) {
            return null;
        }
        return A0m;
    }
}
