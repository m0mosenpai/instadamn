package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorSegmentation;

/* renamed from: X.16y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C224016y extends C0T6 implements InterfaceC224116z {
    public final CreatorSegmentation A00;
    public final Boolean A01;

    @Override // X.InterfaceC224116z
    public final C224016y Esk() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C224016y) {
                C224016y c224016y = (C224016y) obj;
                if (this.A00 != c224016y.A00 || !C14360o3.A0K(this.A01, c224016y.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CreatorSegmentation creatorSegmentation = this.A00;
        int hashCode = (creatorSegmentation == null ? 0 : creatorSegmentation.hashCode()) * 31;
        Boolean bool = this.A01;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC224116z
    public final CreatorSegmentation At2() {
        return this.A00;
    }

    @Override // X.InterfaceC224116z
    public final Boolean CRv() {
        return this.A01;
    }

    @Override // X.InterfaceC224116z
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreatorInfo", JRQ.A00(this));
    }

    public C224016y(CreatorSegmentation creatorSegmentation, Boolean bool) {
        this.A00 = creatorSegmentation;
        this.A01 = bool;
    }
}
