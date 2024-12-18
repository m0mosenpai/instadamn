package X;

import com.facebook.litho.ComponentTree;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.Map;

/* renamed from: X.55x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1124555x implements InterfaceC16660sJ {
    public final /* synthetic */ ComponentTree A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C1124555x(ComponentTree componentTree, String str, boolean z) {
        this.A00 = componentTree;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        String str;
        ComponentTree componentTree = this.A00;
        String str2 = this.A01;
        boolean z = this.A02;
        Map map = (Map) obj;
        AbstractC50812Vc abstractC50812Vc = componentTree.A03;
        if (abstractC50812Vc != null) {
            str = abstractC50812Vc.A0H();
        } else {
            str = "";
        }
        map.put("root", str);
        map.put("attribution", str2);
        map.put(BaseJavaModule.METHOD_TYPE_ASYNC, Boolean.valueOf(!z));
        map.put("stack", AbstractC62853SUa.A00());
        return C0eB.A00;
    }
}
