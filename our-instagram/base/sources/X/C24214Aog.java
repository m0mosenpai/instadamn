package X;

import android.os.Bundle;
import com.facebook.native_bridge.NativeDataPromise;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Aog, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24214Aog implements BCI {
    public final C9YD A00;
    public final C9YD A01;
    public final C9YD A02;
    public final C9YD A03;
    public final C9YD A04;
    public final List A05;

    public final C9YD A00(int i) {
        if (i == 0) {
            return this.A04;
        }
        if (i == 1) {
            return this.A03;
        }
        if (i == 2) {
            return this.A00;
        }
        if (i == 3) {
            return this.A01;
        }
        if (i == 4) {
            return this.A02;
        }
        return null;
    }

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        HashMap hashMap;
        AbstractList abstractList;
        HashMap hashMap2;
        AbstractList abstractList2;
        C14360o3.A0B(bundle, 0);
        if (!bundle.containsKey("commandType")) {
            return null;
        }
        if (bundle.containsKey("commandType") && bundle.containsKey("delegateScope") && bundle.containsKey("promiseCommandType") && bundle.containsKey("key") && bundle.containsKey("exceptionMessage")) {
            int i = bundle.getInt("commandType");
            int i2 = bundle.getInt("delegateScope");
            int i3 = bundle.getInt("promiseCommandType");
            String string = bundle.getString("key");
            String string2 = bundle.getString("exceptionMessage");
            if (i3 == 7) {
                if (bundle.containsKey("resultString") && string != null && (i == 2 || i == 3)) {
                    C9YD A00 = A00(i2);
                    String string3 = bundle.getString("resultString");
                    if (string3 != null && A00 != null) {
                        if (i == 3) {
                            hashMap2 = A00.A02;
                        } else {
                            hashMap2 = A00.A01;
                        }
                        if (hashMap2 != null && (abstractList2 = (AbstractList) hashMap2.get(string)) != null && (!abstractList2.isEmpty())) {
                            Object remove = abstractList2.remove(0);
                            C14360o3.A07(remove);
                            NativeDataPromise nativeDataPromise = (NativeDataPromise) remove;
                            if (string2 != null) {
                                nativeDataPromise.setException(string2);
                            } else {
                                nativeDataPromise.setValue(string3);
                            }
                        }
                    }
                }
            } else if (i3 == 6 && bundle.containsKey("resultBool") && string != null && (i == 0 || i == 1)) {
                C9YD A002 = A00(i2);
                boolean z = bundle.getBoolean("resultBool");
                if (A002 != null) {
                    if (i == 0) {
                        hashMap = A002.A04;
                    } else {
                        hashMap = A002.A03;
                    }
                    if (hashMap != null && (abstractList = (AbstractList) hashMap.get(string)) != null && (!abstractList.isEmpty())) {
                        Object remove2 = abstractList.remove(0);
                        C14360o3.A07(remove2);
                        NativeDataPromise nativeDataPromise2 = (NativeDataPromise) remove2;
                        if (string2 != null) {
                            nativeDataPromise2.setException(string2);
                        } else {
                            nativeDataPromise2.setValue(Boolean.valueOf(z));
                        }
                    }
                }
            }
        }
        List list = this.A05;
        ArrayList A0U = AbstractC001800i.A0U(list);
        list.clear();
        return A0U;
    }

    public C24214Aog() {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A05 = A1E;
        this.A04 = new C9YD(A1E, 0);
        this.A03 = new C9YD(A1E, 1);
        this.A00 = new C9YD(A1E, 2);
        this.A01 = new C9YD(A1E, 3);
        this.A02 = new C9YD(A1E, 4);
    }
}
