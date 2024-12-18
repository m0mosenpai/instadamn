package X;

import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mvs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51850Mvs extends C0T6 implements InterfaceC58257Ps1 {
    public final C51849Mvr A00;
    public final MediaKitSectionType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;

    public C51850Mvs(C51849Mvr c51849Mvr, MediaKitSectionType mediaKitSectionType, String str, String str2, String str3, List list, List list2) {
        C14360o3.A0B(str2, 3);
        AbstractC167017dG.A1U(str3, mediaKitSectionType);
        this.A05 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A06 = list2;
        this.A00 = c51849Mvr;
        this.A04 = str3;
        this.A01 = mediaKitSectionType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51850Mvs) {
                C51850Mvs c51850Mvs = (C51850Mvs) obj;
                if (!C14360o3.A0K(this.A05, c51850Mvs.A05) || !C14360o3.A0K(this.A02, c51850Mvs.A02) || !C14360o3.A0K(this.A03, c51850Mvs.A03) || !C14360o3.A0K(this.A06, c51850Mvs.A06) || !C14360o3.A0K(this.A00, c51850Mvs.A00) || !C14360o3.A0K(this.A04, c51850Mvs.A04) || this.A01 != c51850Mvs.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0K(this.A04, (((AbstractC166997dE.A0K(this.A03, ((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31));
    }

    public static boolean A00(Object obj, Iterator it) {
        return C14360o3.A0K(((C51850Mvs) it.next()).A03, obj);
    }
}
