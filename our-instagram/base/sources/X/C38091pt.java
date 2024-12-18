package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38091pt extends C0T6 implements InterfaceC38101pu {
    public final C130565v1 A00;
    public final C130565v1 A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C38091pt(C130565v1 c130565v1, C130565v1 c130565v12, String str, String str2, List list) {
        C14360o3.A0B(c130565v1, 2);
        this.A04 = list;
        this.A00 = c130565v1;
        this.A01 = c130565v12;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.InterfaceC38101pu
    public final C38091pt F5P() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38091pt) {
                C38091pt c38091pt = (C38091pt) obj;
                if (!C14360o3.A0K(this.A04, c38091pt.A04) || !C14360o3.A0K(this.A00, c38091pt.A00) || !C14360o3.A0K(this.A01, c38091pt.A01) || !C14360o3.A0K(this.A02, c38091pt.A02) || !C14360o3.A0K(this.A03, c38091pt.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A04;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.A00.hashCode()) * 31;
        C130565v1 c130565v1 = this.A01;
        int hashCode2 = (hashCode + (c130565v1 == null ? 0 : c130565v1.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC38101pu
    public final List AtH() {
        return this.A04;
    }

    @Override // X.InterfaceC38101pu
    public final /* bridge */ /* synthetic */ InterfaceC130575v2 AtL() {
        return this.A00;
    }

    @Override // X.InterfaceC38101pu
    public final /* bridge */ /* synthetic */ InterfaceC130575v2 B8t() {
        return this.A01;
    }

    @Override // X.InterfaceC38101pu
    public final String CDG() {
        return this.A03;
    }

    @Override // X.InterfaceC38101pu
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelCoverMediaClientDict", AbstractC40702I2i.A00(this));
    }

    @Override // X.InterfaceC38101pu
    public final String getMediaId() {
        return this.A02;
    }
}
