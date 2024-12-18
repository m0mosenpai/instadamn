package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.7Sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163177Sc extends AbstractC129515tG implements InterfaceC129555tK {
    public final DirectMessageIdentifier A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C163177Sc(DirectMessageIdentifier directMessageIdentifier, List list) {
        super((InterfaceC129525tH) list.get(0));
        String str;
        C9CP c9cp;
        this.A00 = directMessageIdentifier;
        this.A05 = list;
        List list2 = ((K2U) list.get(0)).A00.A0b;
        if (list2 != null && (c9cp = (C9CP) AbstractC001800i.A0O(list2, 0)) != null) {
            str = c9cp.A06;
        } else {
            str = null;
        }
        this.A04 = str;
        this.A02 = ((K2U) list.get(0)).A01;
        this.A03 = ((K2U) list.get(0)).A02;
        this.A01 = ((K2U) list.get(0)).A00.A08.A00;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C163177Sc) {
                C163177Sc c163177Sc = (C163177Sc) obj;
                if (!C14360o3.A0K(this.A00, c163177Sc.A00) || !C14360o3.A0K(this.A05, c163177Sc.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A05.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
