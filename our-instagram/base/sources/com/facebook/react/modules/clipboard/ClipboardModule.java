package com.facebook.react.modules.clipboard;

import X.AbstractC111324zv;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C62161S0i;
import X.InterfaceC65622ToD;
import X.R3M;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.fbreact.specs.NativeClipboardSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Clipboard")
/* loaded from: classes10.dex */
public final class ClipboardModule extends NativeClipboardSpec {
    public static final C62161S0i Companion = new Object();
    public static final String NAME = "Clipboard";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardModule(R3M r3m) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
    }

    @Override // com.facebook.fbreact.specs.NativeClipboardSpec
    public void getString(InterfaceC65622ToD interfaceC65622ToD) {
        String str;
        C14360o3.A0B(interfaceC65622ToD, 0);
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() >= 1) {
                str = String.valueOf(primaryClip.getItemAt(0).getText());
            } else {
                str = "";
            }
            interfaceC65622ToD.resolve(str);
        } catch (Exception e) {
            interfaceC65622ToD.reject(e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeClipboardSpec
    public void setString(String str) {
        ClipData newPlainText = ClipData.newPlainText(null, str);
        C14360o3.A07(newPlainText);
        getClipboardService().setPrimaryClip(newPlainText);
    }

    private final ClipboardManager getClipboardService() {
        Object systemService = AbstractC58321PtD.A0b(this).getBaseContext().getSystemService("clipboard");
        C14360o3.A0C(systemService, AbstractC111324zv.A00(68));
        return (ClipboardManager) systemService;
    }
}
