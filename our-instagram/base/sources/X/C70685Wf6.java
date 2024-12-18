package X;

import com.facebook.pando.TreeJNI;
import java.util.Map;

/* renamed from: X.Wf6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70685Wf6 implements InterfaceC131615wx {
    public final /* synthetic */ C6F2 A00;
    public final /* synthetic */ String A01;

    public C70685Wf6(C6F2 c6f2, String str) {
        this.A00 = c6f2;
        this.A01 = str;
    }

    @Override // X.InterfaceC131615wx
    public final void D6P(Map map, int i) {
        Object obj = map.get(this.A01);
        if (obj instanceof TreeJNI) {
            ((TreeJNI) obj).maybeUpdateActiveFields();
        }
    }
}
