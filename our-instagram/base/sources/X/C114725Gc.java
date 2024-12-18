package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114725Gc implements InterfaceC671731i {
    public C62232sO A00;
    public W5F A01;
    public C671831j A02;
    public C32S A03;
    public final C3Z9 A04 = new C3Z9();
    public final UserSession A05;

    @Override // X.InterfaceC671731i
    public final void EF4() {
        this.A01 = null;
        this.A04.A00 = null;
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ void A9u(Object obj) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        C3XG c3xg = c82373m0.A01;
        if (C3XH.A02(c3xg.A05) != null) {
            if (this.A00 != null) {
                String str = c3xg.A09;
                if (str != null) {
                    this.A04.A04.put(str, str);
                    W5F w5f = this.A01;
                    if (w5f != null) {
                        w5f.A01();
                        return;
                    }
                    return;
                }
                return;
            }
            C14360o3.A0F("modelIdentifier");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC671731i
    public final void AHa() {
        C32S c32s = this.A03;
        if (c32s != null) {
            C32S.A06(c32s, true);
        }
        C3Z9 c3z9 = this.A04;
        c3z9.A04.clear();
        W5F w5f = c3z9.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.InterfaceC671731i
    public final void AVD(Context context) {
        C32S c32s = this.A03;
        if (c32s != null) {
            c32s.A0T.Co5();
        }
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ Object AuJ() {
        return this.A02;
    }

    @Override // X.InterfaceC671731i
    public final Map Aut() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A04.A02);
        C14360o3.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    @Override // X.InterfaceC671731i
    public final Map B9T() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A04.A03);
        C14360o3.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    @Override // X.InterfaceC671731i
    public final List BIF() {
        List unmodifiableList = Collections.unmodifiableList(this.A04.A01);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    @Override // X.InterfaceC671731i
    public final Map BeQ() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A04.A04);
        C14360o3.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    @Override // X.InterfaceC671731i
    public final C3Z9 BuQ() {
        return this.A04;
    }

    @Override // X.InterfaceC671731i
    public final void EQn(W5F w5f) {
        this.A01 = w5f;
        this.A04.A00 = w5f;
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ void ESa(Object obj) {
        C671831j c671831j = (C671831j) obj;
        C14360o3.A0B(c671831j, 0);
        this.A02 = c671831j;
        C3Z9 c3z9 = this.A04;
        c3z9.A01(-1.0d, -1, -1, -1, -1);
        c3z9.A03.put("min_gap_ad_ad", String.valueOf(c671831j.A05()));
    }

    @Override // X.InterfaceC671731i
    public final void EUv(int i, int i2) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public C114725Gc(UserSession userSession) {
        this.A05 = userSession;
    }

    @Override // X.InterfaceC671731i
    public final void EPG(C32S c32s) {
        this.A03 = c32s;
    }
}
