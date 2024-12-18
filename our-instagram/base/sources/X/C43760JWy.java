package X;

import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* renamed from: X.JWy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43760JWy implements InterfaceC41501vz {
    public final String A00;
    public final WeakReference A01;

    public C43760JWy(String str, WeakReference weakReference) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = weakReference;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C51762Yz c51762Yz;
        int A03 = C0f9.A03(-2117355347);
        C42281xI c42281xI = (C42281xI) obj;
        int A0N = AbstractC167017dG.A0N(c42281xI, 1589496964);
        User user = c42281xI.A00;
        if (C14360o3.A0K(user.getId(), this.A00) && (c51762Yz = (C51762Yz) this.A01.get()) != null) {
            c51762Yz.A01(Boolean.valueOf(user.CQf()));
        }
        C0f9.A0A(1660736035, A0N);
        C0f9.A0A(1340062475, A03);
    }
}
