package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.IwT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42791IwT implements InterfaceC147566kh, InterfaceC149606oD {
    public final UserSession A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final C142796cf A03;
    public final Map A04;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.30O, X.6cf] */
    public C42791IwT(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A00 = userSession;
        this.A02 = interfaceC11380iw;
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) interfaceC11380iw;
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A03 = new C30O(userSession, interfaceC60442pS, null, false);
        this.A04 = AbstractC166987dD.A1I();
    }

    @Override // X.InterfaceC147566kh
    public final synchronized void EE5(boolean z) {
    }

    @Override // X.InterfaceC147566kh
    public final synchronized void EEK(C41181vS c41181vS) {
    }

    @Override // X.InterfaceC147566kh
    public final synchronized void EKd() {
    }

    @Override // X.InterfaceC149606oD
    public final /* synthetic */ void onCompletion() {
    }

    @Override // X.InterfaceC149606oD
    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC147566kh
    public final synchronized void pause() {
    }

    @Override // X.InterfaceC149606oD
    public final void DzY(C38321qM c38321qM) {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (C14360o3.A0K(AbstractC37300Gc1.A0V(A1K.getKey()), AbstractC37301Gc2.A0h(c38321qM))) {
                J28.A00((J28) A1K.getValue());
                return;
            }
        }
        throw new NoSuchElementException(MSV.A00(1));
    }
}
