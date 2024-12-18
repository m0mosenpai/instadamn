package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.LzE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49807LzE implements Comparable {
    public final long A00;
    public final C148286ly A01;
    public final C148286ly A02;
    public final EnumC46173KcB A03;
    public final C45026JwH A04;
    public final DirectStoreSticker A05;

    public C49807LzE(C148286ly c148286ly, C148286ly c148286ly2, EnumC46173KcB enumC46173KcB, C45026JwH c45026JwH, DirectStoreSticker directStoreSticker, long j) {
        C14360o3.A0B(enumC46173KcB, 1);
        this.A03 = enumC46173KcB;
        this.A04 = c45026JwH;
        this.A01 = c148286ly;
        this.A02 = c148286ly2;
        this.A05 = directStoreSticker;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.hashCode() == hashCode();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C49807LzE c49807LzE = (C49807LzE) obj;
        C14360o3.A0B(c49807LzE, 0);
        return (int) (c49807LzE.A00 - this.A00);
    }

    public final int hashCode() {
        DirectAnimatedMedia directAnimatedMedia;
        String str;
        C148286ly c148286ly;
        EnumC46173KcB enumC46173KcB = this.A03;
        AbstractC46757KmE abstractC46757KmE = AbstractC46757KmE.$redex_init_class;
        int ordinal = enumC46173KcB.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return super.hashCode();
                        }
                        throw B4Z.A00();
                    }
                    DirectStoreSticker directStoreSticker = this.A05;
                    if (directStoreSticker != null) {
                        str = directStoreSticker.A04;
                    } else {
                        return 0;
                    }
                } else {
                    c148286ly = this.A02;
                }
            } else {
                c148286ly = this.A01;
            }
            if (c148286ly != null) {
                str = c148286ly.A0S;
            } else {
                return 0;
            }
        } else {
            C45026JwH c45026JwH = this.A04;
            if (c45026JwH != null && (directAnimatedMedia = c45026JwH.A00) != null) {
                str = directAnimatedMedia.A05;
            } else {
                return 0;
            }
        }
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
