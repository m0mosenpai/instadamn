package X;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;

/* renamed from: X.TNr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64635TNr implements Runnable {
    public final /* synthetic */ ReactShadowNode A00;
    public final /* synthetic */ C63339Sht A01;

    public RunnableC64635TNr(ReactShadowNode reactShadowNode, C63339Sht c63339Sht) {
        this.A01 = c63339Sht;
        this.A00 = reactShadowNode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62668SLf c62668SLf = this.A01.A04;
        ReactShadowNode reactShadowNode = this.A00;
        c62668SLf.A02.A00();
        int i = ((ReactShadowNodeImpl) reactShadowNode).A00;
        c62668SLf.A00.put(i, reactShadowNode);
        c62668SLf.A01.put(i, true);
    }
}
