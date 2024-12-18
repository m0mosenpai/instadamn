package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.io.Closeable;

/* renamed from: X.Tr8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC65678Tr8 extends Closeable, C07W {
    @OnLifecycleEvent(C07R.ON_DESTROY)
    void close();
}
