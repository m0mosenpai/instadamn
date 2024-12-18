package X;

import android.os.Handler;
import android.os.Looper;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7Ko, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Ko {
    public final Handler A00;
    public final HashMap A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C7Ko() {
        this(null, 0 == true ? 1 : 0, 1);
    }

    public final void A00(String str, InterfaceC16820sZ interfaceC16820sZ, long j) {
        C14360o3.A0B(str, 0);
        RunnableC24790AyC runnableC24790AyC = new RunnableC24790AyC(this, str, interfaceC16820sZ);
        HashMap hashMap = this.A01;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new HashSet();
            hashMap.put(str, obj);
        }
        ((AbstractCollection) obj).add(runnableC24790AyC);
        this.A00.postDelayed(runnableC24790AyC, j);
    }

    public /* synthetic */ C7Ko(Handler handler, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A00 = new Handler(Looper.getMainLooper());
        this.A01 = new HashMap();
    }
}
