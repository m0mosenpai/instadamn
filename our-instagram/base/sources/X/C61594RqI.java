package X;

import com.facebook.react.bridge.NativeArray;

/* renamed from: X.RqI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61594RqI {
    public NativeArray A00;
    public String A01;
    public String A02;

    public final String toString() {
        String obj;
        String str = this.A02;
        String str2 = this.A01;
        NativeArray nativeArray = this.A00;
        if (nativeArray == null) {
            obj = "";
        } else {
            obj = nativeArray.toString();
        }
        return AnonymousClass001.A13(str, ".", str2, "(", obj, ")");
    }
}
