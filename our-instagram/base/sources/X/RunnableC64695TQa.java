package X;

import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.ultralight.UL;

/* renamed from: X.TQa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64695TQa implements Runnable {
    public final /* synthetic */ AbstractC10360h2 A00;
    public final /* synthetic */ DatePickerDialogModule A01;
    public final /* synthetic */ InterfaceC65622ToD A02;
    public final /* synthetic */ ReadableMap A03;

    public RunnableC64695TQa(AbstractC10360h2 abstractC10360h2, DatePickerDialogModule datePickerDialogModule, InterfaceC65622ToD interfaceC65622ToD, ReadableMap readableMap) {
        this.A01 = datePickerDialogModule;
        this.A03 = readableMap;
        this.A02 = interfaceC65622ToD;
        this.A00 = abstractC10360h2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0SG, androidx.fragment.app.Fragment, X.Q7l] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle createFragmentArguments;
        ?? c0sg = new C0SG();
        ReadableMap readableMap = this.A03;
        if (readableMap != null) {
            createFragmentArguments = this.A01.createFragmentArguments(readableMap);
            c0sg.setArguments(createFragmentArguments);
        }
        try {
            DialogInterfaceOnDismissListenerC63427Sk6 dialogInterfaceOnDismissListenerC63427Sk6 = new DialogInterfaceOnDismissListenerC63427Sk6(this.A01, this.A02);
            c0sg.A01 = dialogInterfaceOnDismissListenerC63427Sk6;
            c0sg.A00 = dialogInterfaceOnDismissListenerC63427Sk6;
            c0sg.A0B(this.A00, "DatePickerAndroid");
        } catch (IllegalStateException e) {
            ((C0Gd) Y4b.A00(UL.id._UL__ULSEP_com_facebook_common_errorreporting_FbErrorReporter_ULSEP_BINDING_ID)).EmN("DatePickerAndroid", AbstractC166997dE.A0y("Error trying to show dialog: ", e));
        }
    }
}
