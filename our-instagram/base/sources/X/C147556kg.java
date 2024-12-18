package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147556kg implements InterfaceC147566kh, InterfaceC149606oD {
    public int A00;
    public int A01;
    public final Map A02;
    public final Context A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C142796cf A06;
    public java.util.Set preparedMedias;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.30O, X.6cf] */
    public C147556kg(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A00 = -1;
        this.A01 = -1;
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) interfaceC11380iw;
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A06 = new C30O(userSession, interfaceC60442pS, null, false);
        this.preparedMedias = new LinkedHashSet();
        this.A02 = new ConcurrentHashMap();
    }

    @Override // X.InterfaceC147566kh
    public final void EEK(C41181vS c41181vS) {
        if (c41181vS.A0j != null) {
            EE5(false);
        }
    }

    @Override // X.InterfaceC149606oD
    public final void onProgressUpdate(int i, int i2, boolean z) {
        int i3;
        if (i > Math.min(i2, 0)) {
            if (this.A00 + 1 >= this.A02.size()) {
                i3 = 0;
            } else {
                i3 = this.A00 + 1;
            }
            this.A00 = i3;
            A00();
        }
    }

    private final void A00() {
        C38321qM c38321qM;
        C39440HbS c39440HbS;
        int i = this.A00;
        java.util.Set set = this.preparedMedias;
        Map map = this.A02;
        C39440HbS c39440HbS2 = (C39440HbS) map.get(Integer.valueOf(i));
        if (c39440HbS2 != null) {
            c38321qM = c39440HbS2.A00;
        } else {
            c38321qM = null;
        }
        if (!AbstractC001800i.A0u(set, c38321qM) && (c39440HbS = (C39440HbS) map.get(Integer.valueOf(this.A00))) != null) {
            this.preparedMedias.contains(c39440HbS.A00);
            this.A01 = this.A00;
        }
    }

    @Override // X.InterfaceC149606oD
    public final void DzY(C38321qM c38321qM) {
        C38321qM c38321qM2;
        if (c38321qM != null) {
            this.preparedMedias.add(c38321qM);
            if (this.A00 != -1) {
                int i = this.A01;
                java.util.Set set = this.preparedMedias;
                C39440HbS c39440HbS = (C39440HbS) this.A02.get(Integer.valueOf(i));
                if (c39440HbS != null) {
                    c38321qM2 = c39440HbS.A00;
                } else {
                    c38321qM2 = null;
                }
                if (AbstractC001800i.A0u(set, c38321qM2)) {
                    this.A00 = this.A01;
                    A00();
                    this.A01 = -1;
                }
            }
        }
    }

    @Override // X.InterfaceC147566kh
    public final void EE5(boolean z) {
        this.preparedMedias.clear();
        this.A02.clear();
        this.A00 = -1;
    }

    @Override // X.InterfaceC147566kh
    public final void EKd() {
        if (this.A00 == -1) {
            this.A00 = 0;
        }
        A00();
    }

    @Override // X.InterfaceC149606oD
    public final void onCompletion() {
        int i;
        if (this.A00 + 1 >= this.A02.size()) {
            i = 0;
        } else {
            i = this.A00 + 1;
        }
        this.A00 = i;
        A00();
    }

    @Override // X.InterfaceC147566kh
    public final void pause() {
    }
}
