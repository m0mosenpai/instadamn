package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.D6v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29679D6v extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29679D6v(Fragment fragment, String str) {
        super(0);
        this.A00 = fragment;
        this.A01 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        Object A0m;
        if (Serializable.class.isAssignableFrom(EnumC27380C6j.class)) {
            Fragment fragment = this.A00;
            String str = this.A01;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0m = requireArguments.getSerializable(str, Object.class);
            } else {
                A0m = AbstractC25228BEl.A11(requireArguments, str);
            }
        } else if (AbstractC25226BEj.A1a(EnumC27380C6j.class)) {
            A0m = AbstractC25231BEo.A0m(this.A00, this.A01);
        } else {
            throw AbstractC25231BEo.A0i(this.A01);
        }
        if (!(A0m instanceof EnumC27380C6j)) {
            return null;
        }
        return A0m;
    }
}
