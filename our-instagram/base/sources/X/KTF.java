package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;

/* loaded from: classes8.dex */
public final class KTF extends AbstractC129515tG implements InterfaceC129555tK {
    public final ImageUrl A00;
    public final C7QL A01;
    public final MessagingUser A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final C7QX A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTF(ImageUrl imageUrl, C7QX c7qx, C7QL c7ql, MessagingUser messagingUser, String str, String str2, List list) {
        super(c7qx);
        C14360o3.A0B(str2, 5);
        this.A03 = str;
        this.A00 = imageUrl;
        this.A02 = messagingUser;
        this.A05 = list;
        this.A04 = str2;
        this.A01 = c7ql;
        this.A06 = c7qx;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTF) {
                KTF ktf = (KTF) obj;
                if (!C14360o3.A0K(this.A03, ktf.A03) || !C14360o3.A0K(this.A00, ktf.A00) || !C14360o3.A0K(this.A02, ktf.A02) || !C14360o3.A0K(this.A05, ktf.A05) || !C14360o3.A0K(this.A04, ktf.A04) || !C14360o3.A0K(this.A01, ktf.A01) || !C14360o3.A0K(this.A06, ktf.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0O(this.A03) * 31)) + AbstractC166997dE.A0I(this.A05)) * 31)));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
