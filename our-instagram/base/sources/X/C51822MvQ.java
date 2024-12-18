package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MvQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51822MvQ extends C0T6 implements InterfaceC66482zP {
    public boolean A00;
    public final long A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final InterfaceC16660sJ A08;

    public C51822MvQ(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, InterfaceC16660sJ interfaceC16660sJ, long j) {
        C14360o3.A0B(str5, 9);
        this.A04 = str;
        this.A02 = imageUrl;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A08 = interfaceC16660sJ;
        this.A00 = true;
        this.A01 = j;
        this.A03 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51822MvQ) {
                C51822MvQ c51822MvQ = (C51822MvQ) obj;
                if (!C14360o3.A0K(this.A04, c51822MvQ.A04) || !C14360o3.A0K(this.A02, c51822MvQ.A02) || !C14360o3.A0K(this.A05, c51822MvQ.A05) || !C14360o3.A0K(this.A07, c51822MvQ.A07) || !C14360o3.A0K(this.A06, c51822MvQ.A06) || !C14360o3.A0K(this.A08, c51822MvQ.A08) || this.A00 != c51822MvQ.A00 || this.A01 != c51822MvQ.A01 || !C14360o3.A0K(this.A03, c51822MvQ.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC25236BEt.A01(this.A01, AbstractC167007dF.A0D(this.A00, AbstractC166997dE.A0J(this.A08, ((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31))));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IgLiveReactionItemUiModel(emojiUnicode=");
        A1C.append(this.A04);
        A1C.append(", stickerReactionUrl=");
        A1C.append(this.A02);
        A1C.append(", stickerId=");
        A1C.append(this.A05);
        A1C.append(", stickerTemplateId=");
        A1C.append(this.A07);
        A1C.append(", stickerMediaType=");
        A1C.append(this.A06);
        A1C.append(", onReactionSelected=");
        A1C.append(this.A08);
        A1C.append(", shouldAnimatePopIn=");
        A1C.append(this.A00);
        A1C.append(", delayMillis=");
        A1C.append(this.A01);
        A1C.append(", contentDescription=");
        return AbstractC25236BEt.A0Y(this.A03, A1C);
    }
}
