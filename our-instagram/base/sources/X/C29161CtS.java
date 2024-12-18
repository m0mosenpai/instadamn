package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CtS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29161CtS implements InterfaceC66482zP {
    public int A00;
    public final C111034zF A01;

    public C29161CtS(C111034zF c111034zF) {
        C14360o3.A0B(c111034zF, 1);
        this.A01 = c111034zF;
        this.A00 = -1;
    }

    public final ImageUrl A00() {
        ImageUrl A1S = this.A01.A00.A1S();
        if (A1S != null) {
            return A1S;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A01.A00.getId();
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C29161CtS c29161CtS = (C29161CtS) obj;
        String id = this.A01.A00.getId();
        if (id != null) {
            ImageUrl imageUrl = null;
            if (c29161CtS != null) {
                str = c29161CtS.A01.A00.getId();
                if (str == null) {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                str = null;
            }
            if (id.equals(str)) {
                ImageUrl A00 = A00();
                if (c29161CtS != null) {
                    imageUrl = c29161CtS.A00();
                }
                if (C14360o3.A0K(A00, imageUrl) && c29161CtS != null && this.A00 == c29161CtS.A00) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }
}
