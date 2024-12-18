package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.permissions.PermissionsModule;

/* renamed from: X.Szz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64136Szz implements Callback {
    public final /* synthetic */ InterfaceC65622ToD A00;
    public final /* synthetic */ PermissionsModule A01;
    public final /* synthetic */ String A02;

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        InterfaceC65622ToD interfaceC65622ToD;
        String str;
        C14360o3.A0B(objArr, 0);
        Object obj = objArr[0];
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        if (iArr.length > 0 && iArr[0] == 0) {
            interfaceC65622ToD = this.A00;
            str = this.A01.GRANTED;
        } else {
            Object obj2 = objArr[1];
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            boolean shouldShowRequestPermissionRationale = ((InterfaceC65494TlI) obj2).shouldShowRequestPermissionRationale(this.A02);
            interfaceC65622ToD = this.A00;
            PermissionsModule permissionsModule = this.A01;
            if (shouldShowRequestPermissionRationale) {
                str = permissionsModule.DENIED;
            } else {
                str = permissionsModule.NEVER_ASK_AGAIN;
            }
        }
        interfaceC65622ToD.resolve(str);
    }

    public C64136Szz(InterfaceC65622ToD interfaceC65622ToD, PermissionsModule permissionsModule, String str) {
        this.A00 = interfaceC65622ToD;
        this.A01 = permissionsModule;
        this.A02 = str;
    }
}
