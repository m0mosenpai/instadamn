package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Lh8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48740Lh8 implements InterfaceC50516MRt {
    public String A00;
    public final InterfaceC19630xq A01;
    public final java.util.Set A02;
    public final ConcurrentHashMap A03;

    @Override // X.InterfaceC50516MRt
    public final int Bn7(String str) {
        if (str == null) {
            return 0;
        }
        ConcurrentHashMap concurrentHashMap = this.A03;
        if (concurrentHashMap.containsKey(str)) {
            return AbstractC25227BEk.A06(AbstractC31171DnF.A0W(str, concurrentHashMap), 0);
        }
        InterfaceC19630xq interfaceC19630xq = this.A01;
        if (!interfaceC19630xq.contains(AnonymousClass001.A0R("inbox_visual_message_reply_button_impression", str))) {
            return 0;
        }
        int i = interfaceC19630xq.getInt(AnonymousClass001.A0R("inbox_visual_message_reply_button_impression", str), 0);
        AbstractC166997dE.A1U(str, concurrentHashMap, i);
        return i;
    }

    @Override // X.InterfaceC50516MRt
    public final void AAX(String str) {
        if (str != null && !CeM(str)) {
            this.A03.put(str, 0);
            InterfaceC19610xo ARD = this.A01.ARD();
            ARD.E7D(AnonymousClass001.A0R("inbox_visual_message_reply_button_impression", str), 0);
            ARD.apply();
        }
    }

    @Override // X.InterfaceC50516MRt
    public final String BHH() {
        return this.A00;
    }

    @Override // X.InterfaceC50516MRt
    public final boolean CeM(String str) {
        if (str != null) {
            if (this.A03.containsKey(str) || this.A01.contains(AnonymousClass001.A0R("inbox_visual_message_reply_button_impression", str))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC50516MRt
    public final boolean Cp7(String str, String str2) {
        if (str != null) {
            java.util.Set set = this.A02;
            if (!set.contains(str) && CeM(str)) {
                int Bn7 = Bn7(str) + 1;
                if (Bn7 > 3) {
                    EFM(str);
                    return true;
                }
                set.add(str);
                this.A03.put(str, Integer.valueOf(Bn7));
                InterfaceC19610xo ARD = this.A01.ARD();
                ARD.E7D(AnonymousClass001.A0R("inbox_visual_message_reply_button_impression", str), Bn7);
                ARD.apply();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC50516MRt
    public final void EFM(String str) {
        if (str != null) {
            this.A03.remove(str);
            InterfaceC19610xo ARD = this.A01.ARD();
            ARD.EEj(AnonymousClass001.A0R("inbox_visual_message_reply_button_impression", str));
            ARD.apply();
            this.A02.remove(str);
        }
    }

    @Override // X.InterfaceC50516MRt
    public final void EW6(String str) {
        this.A02.clear();
        this.A00 = str;
    }

    public /* synthetic */ C48740Lh8(UserSession userSession) {
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A3X, C23031Ai.class);
        C14360o3.A0B(A04, 2);
        this.A01 = A04;
        java.util.Set synchronizedSet = Collections.synchronizedSet(AbstractC166987dD.A1H());
        C14360o3.A07(synchronizedSet);
        this.A02 = synchronizedSet;
        this.A03 = new ConcurrentHashMap();
    }
}
