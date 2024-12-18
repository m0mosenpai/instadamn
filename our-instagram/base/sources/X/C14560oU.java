package X;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;

/* renamed from: X.0oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14560oU implements C05O {
    public final /* synthetic */ View A00;

    public /* synthetic */ C14560oU(View view) {
        this.A00 = view;
    }

    @Override // X.C05O
    public final boolean D6Q(Bundle bundle, C05R c05r, int i) {
        View view = this.A00;
        if ((i & 1) != 0) {
            try {
                InputContentInfo inputContentInfo = ((C14550oT) c05r.A00).A00;
                inputContentInfo.requestPermission();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                android.util.Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        }
        InputContentInfo inputContentInfo2 = ((C14550oT) c05r.A00).A00;
        C006002a c006002a = new C006002a(new ClipData(inputContentInfo2.getDescription(), new ClipData.Item(inputContentInfo2.getContentUri())), 2);
        android.net.Uri linkUri = inputContentInfo2.getLinkUri();
        InterfaceC006102b interfaceC006102b = c006002a.A00;
        interfaceC006102b.EYD(linkUri);
        interfaceC006102b.setExtras(bundle);
        if (AbstractC010103p.A02(view, interfaceC006102b.AEN()) != null) {
            return false;
        }
        return true;
    }
}
