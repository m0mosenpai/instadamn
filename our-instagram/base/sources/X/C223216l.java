package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.16l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C223216l extends C0T6 implements InterfaceC223316m {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final List A09;

    @Override // X.InterfaceC223316m
    public final C223216l EzP() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C223216l) {
                C223216l c223216l = (C223216l) obj;
                if (!C14360o3.A0K(this.A09, c223216l.A09) || !C14360o3.A0K(this.A00, c223216l.A00) || !C14360o3.A0K(this.A08, c223216l.A08) || !C14360o3.A0K(this.A03, c223216l.A03) || !C14360o3.A0K(this.A04, c223216l.A04) || !C14360o3.A0K(this.A02, c223216l.A02) || !C14360o3.A0K(this.A05, c223216l.A05) || !C14360o3.A0K(this.A06, c223216l.A06) || !C14360o3.A0K(this.A07, c223216l.A07) || !C14360o3.A0K(this.A01, c223216l.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A09;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ImageUrl imageUrl = this.A00;
        int hashCode2 = (hashCode + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        String str = this.A08;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A04;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.A05;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A06;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A07;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        ImageUrl imageUrl2 = this.A01;
        return hashCode9 + (imageUrl2 != null ? imageUrl2.hashCode() : 0);
    }

    @Override // X.InterfaceC223316m
    public final /* bridge */ /* synthetic */ L9E AKY() {
        return new L9E(this);
    }

    @Override // X.InterfaceC223316m
    public final List AeP() {
        return this.A09;
    }

    @Override // X.InterfaceC223316m
    public final ImageUrl Aez() {
        return this.A00;
    }

    @Override // X.InterfaceC223316m
    public final Integer B1G() {
        return this.A03;
    }

    @Override // X.InterfaceC223316m
    public final Integer BAD() {
        return this.A04;
    }

    @Override // X.InterfaceC223316m
    public final Integer BUH() {
        return this.A05;
    }

    @Override // X.InterfaceC223316m
    public final Integer Bsp() {
        return this.A06;
    }

    @Override // X.InterfaceC223316m
    public final Integer Bt1() {
        return this.A07;
    }

    @Override // X.InterfaceC223316m
    public final ImageUrl Bt2() {
        return this.A01;
    }

    @Override // X.InterfaceC223316m
    public final Boolean CQS() {
        return this.A02;
    }

    @Override // X.InterfaceC223316m
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSetiProfileConfig", JRJ.A00(this));
    }

    @Override // X.InterfaceC223316m
    public final String getEmoji() {
        return this.A08;
    }

    public C223216l(ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, List list) {
        this.A09 = list;
        this.A00 = imageUrl;
        this.A08 = str;
        this.A03 = num;
        this.A04 = num2;
        this.A02 = bool;
        this.A05 = num3;
        this.A06 = num4;
        this.A07 = num5;
        this.A01 = imageUrl2;
    }
}
