package X;

import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Iyb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42923Iyb implements JID {
    public final /* synthetic */ IKJ A00;

    public C42923Iyb(IKJ ikj) {
        this.A00 = ikj;
    }

    @Override // X.JID
    public final String BOz() {
        return this.A00.A05;
    }

    @Override // X.JID
    public final User BSW() {
        return this.A00.A04;
    }

    @Override // X.JID
    public final List BZu() {
        return this.A00.A07;
    }

    @Override // X.JID
    public final Product Bgk() {
        return this.A00.A03;
    }

    @Override // X.JID
    public final List Brm(String str) {
        return this.A00.A07;
    }

    @Override // X.JID
    public final boolean CLy() {
        return this.A00.A00;
    }

    @Override // X.JID
    public final boolean CMA() {
        return this.A00.A01;
    }

    @Override // X.JID
    public final String getNextMaxId() {
        return this.A00.A06;
    }
}
