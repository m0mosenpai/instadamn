package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.Q7k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58756Q7k extends C0SG {
    public BrowserLiteFragment A00;

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        return new AlertDialog.Builder(requireActivity()).setTitle(R.string.res_0x7f130014_name_removed).setMessage(R.string.res_0x7f130012_name_removed).setPositiveButton(R.string.res_0x7f130013_name_removed, new DialogInterfaceOnClickListenerC63420Sjy(this, 2)).create();
    }
}
