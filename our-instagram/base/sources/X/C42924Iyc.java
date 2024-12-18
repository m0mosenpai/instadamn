package X;

import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Iyc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42924Iyc implements JID {
    public final /* synthetic */ JID A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    @Override // X.JID
    public final List Brm(String str) {
        C14360o3.A0B(str, 0);
        return (List) this.A01.invoke(str);
    }

    public C42924Iyc(JID jid, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = jid;
    }

    @Override // X.JID
    public final String BOz() {
        return this.A00.BOz();
    }

    @Override // X.JID
    public final User BSW() {
        return this.A00.BSW();
    }

    @Override // X.JID
    public final List BZu() {
        return this.A00.BZu();
    }

    @Override // X.JID
    public final Product Bgk() {
        return this.A00.Bgk();
    }

    @Override // X.JID
    public final boolean CLy() {
        return this.A00.CLy();
    }

    @Override // X.JID
    public final boolean CMA() {
        return this.A00.CMA();
    }

    @Override // X.JID
    public final String getNextMaxId() {
        return this.A00.getNextMaxId();
    }
}
