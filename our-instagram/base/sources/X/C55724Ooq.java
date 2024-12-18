package X;

import com.facebook.papaya.client.ICallback;
import java.util.Map;

/* renamed from: X.Ooq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55724Ooq implements ICallback {
    public ICallback A00;

    @Override // com.facebook.papaya.client.ICallback
    public final synchronized void onExecutorComplete(String str, Map map) {
        ICallback iCallback = this.A00;
        if (iCallback != null) {
            iCallback.onExecutorComplete(str, map);
        }
    }
}
