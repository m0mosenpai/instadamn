package X;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Deprecated;

/* renamed from: X.TnT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC65589TnT {
    @Deprecated(message = "")
    int addRootView(View view, InterfaceC65657Tqj interfaceC65657Tqj);

    void addUIManagerEventListener(InterfaceC65355Tij interfaceC65355Tij);

    void dispatchCommand(int i, int i2, ReadableArray readableArray);

    void dispatchCommand(int i, String str, ReadableArray readableArray);

    void removeUIManagerEventListener(InterfaceC65355Tij interfaceC65355Tij);

    View resolveView(int i);

    void sendAccessibilityEvent(int i, int i2);

    void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap);

    void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5);
}
