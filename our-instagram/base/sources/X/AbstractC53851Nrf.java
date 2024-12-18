package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.bugreporter.BugReportComposerFragment;

/* renamed from: X.Nrf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53851Nrf {
    public static final BugReportComposerFragment A00(Parcelable parcelable, Parcelable parcelable2, InterfaceC58266PsA interfaceC58266PsA, String str) {
        AbstractC167007dF.A1E(str, 0, interfaceC58266PsA);
        Bundle A09 = AbstractC31176DnK.A09(str);
        A09.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", parcelable);
        A09.putParcelable("BugReportComposerFragment.ARGUMENT_VIEWMODEL", parcelable2);
        A09.putAll(interfaceC58266PsA.E4I());
        BugReportComposerFragment bugReportComposerFragment = new BugReportComposerFragment();
        bugReportComposerFragment.setArguments(A09);
        return bugReportComposerFragment;
    }
}
