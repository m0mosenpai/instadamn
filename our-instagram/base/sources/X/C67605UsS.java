package X;

import android.view.View;
import android.widget.Spinner;
import com.facebook.fbreact.views.picker.ReactDropdownPickerManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.UsS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67605UsS extends AbstractC70462WWz {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AbstractC70462WWz, X.InterfaceC65496TlK
    public final void Ebq(View view, Object obj, String str) {
        Integer valueOf;
        String str2;
        boolean z = true;
        int i = 0;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    if (obj != null) {
                        z = ((Boolean) obj).booleanValue();
                    }
                    view.setEnabled(z);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case -979805852:
                if (str.equals("prompt")) {
                    if (obj == null) {
                        str2 = "";
                    } else {
                        str2 = (String) obj;
                    }
                    ((Spinner) view).setPrompt(str2);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case 94842723:
                if (str.equals("color")) {
                    if (obj == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(((Number) obj).intValue());
                    }
                    ((UDc) view).A02 = valueOf;
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case 100526016:
                if (str.equals(DialogModule.KEY_ITEMS)) {
                    ((ReactDropdownPickerManager) this.A00).setItems(view, (ReadableArray) obj);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case 1191572123:
                if (str.equals("selected")) {
                    if (obj != null) {
                        i = ((Number) obj).intValue();
                    }
                    ((UDc) view).setStagedSelection(i);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            default:
                super.Ebq(view, obj, str);
                return;
        }
    }
}
