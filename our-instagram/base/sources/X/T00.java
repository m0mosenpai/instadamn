package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.permissions.PermissionsModule;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class T00 implements Callback {
    public final /* synthetic */ InterfaceC65622ToD A00;
    public final /* synthetic */ WritableNativeMap A01;
    public final /* synthetic */ PermissionsModule A02;
    public final /* synthetic */ ArrayList A03;

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        WritableNativeMap writableNativeMap;
        String str;
        C14360o3.A0B(objArr, 0);
        Object obj = objArr[0];
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        Object obj2 = objArr[1];
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        InterfaceC65494TlI interfaceC65494TlI = (InterfaceC65494TlI) obj2;
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = arrayList.get(i);
            C14360o3.A07(obj3);
            String str2 = (String) obj3;
            if (iArr.length > 0 && iArr[i] == 0) {
                writableNativeMap = this.A01;
                str = this.A02.GRANTED;
            } else {
                boolean shouldShowRequestPermissionRationale = interfaceC65494TlI.shouldShowRequestPermissionRationale(str2);
                writableNativeMap = this.A01;
                PermissionsModule permissionsModule = this.A02;
                if (shouldShowRequestPermissionRationale) {
                    str = permissionsModule.DENIED;
                } else {
                    str = permissionsModule.NEVER_ASK_AGAIN;
                }
            }
            writableNativeMap.putString(str2, str);
        }
        this.A00.resolve(this.A01);
    }

    public T00(InterfaceC65622ToD interfaceC65622ToD, WritableNativeMap writableNativeMap, PermissionsModule permissionsModule, ArrayList arrayList) {
        this.A03 = arrayList;
        this.A01 = writableNativeMap;
        this.A02 = permissionsModule;
        this.A00 = interfaceC65622ToD;
    }
}
