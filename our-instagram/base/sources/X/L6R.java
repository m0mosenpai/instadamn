package X;

import java.util.HashMap;

/* loaded from: classes8.dex */
public final class L6R {
    public final HashMap A00 = AbstractC166987dD.A1G();

    public final C42221xC A00(InterfaceC50440MOu interfaceC50440MOu) {
        C42221xC c42221xC;
        synchronized (interfaceC50440MOu) {
            HashMap hashMap = this.A00;
            synchronized (hashMap) {
                Object obj = hashMap.get(interfaceC50440MOu);
                if (obj == null) {
                    obj = interfaceC50440MOu.ALK(this);
                    hashMap.put(interfaceC50440MOu, obj);
                }
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.rx.Observable<T of com.instagram.direct.msys.observablelocator.ObservableLocator.getOrCreateScoped$lambda$2$lambda$1>");
                c42221xC = (C42221xC) obj;
            }
        }
        return c42221xC;
    }
}
