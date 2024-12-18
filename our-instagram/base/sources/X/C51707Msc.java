package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Msc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51707Msc extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public C51707Msc(Bundle bundle, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, EnumC61217RhH enumC61217RhH, SCY scy, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14360o3.A0B(scy, 12);
        this.A04 = userSession;
        this.A0B = str;
        this.A09 = str2;
        this.A02 = fragmentActivity;
        this.A05 = interfaceC11380iw;
        this.A0D = str3;
        this.A08 = str4;
        this.A0E = str5;
        this.A03 = c38321qM;
        this.A0C = str6;
        this.A0A = str7;
        this.A06 = scy;
        this.A07 = enumC61217RhH;
        this.A01 = bundle;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51707Msc) {
                    C51707Msc c51707Msc = (C51707Msc) obj;
                    if (c51707Msc.A00 == 1 && C14360o3.A0K(this.A05, c51707Msc.A05) && C14360o3.A0K(this.A06, c51707Msc.A06) && C14360o3.A0K(this.A07, c51707Msc.A07) && C14360o3.A0K(this.A08, c51707Msc.A08) && C14360o3.A0K(this.A09, c51707Msc.A09) && C14360o3.A0K(this.A0A, c51707Msc.A0A) && C14360o3.A0K(this.A0B, c51707Msc.A0B) && C14360o3.A0K(this.A01, c51707Msc.A01) && C14360o3.A0K(this.A02, c51707Msc.A02) && C14360o3.A0K(this.A03, c51707Msc.A03) && C14360o3.A0K(this.A0C, c51707Msc.A0C) && C14360o3.A0K(this.A0D, c51707Msc.A0D) && C14360o3.A0K(this.A0E, c51707Msc.A0E)) {
                        obj2 = this.A04;
                        obj3 = c51707Msc.A04;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C51707Msc)) {
                return false;
            }
            C51707Msc c51707Msc2 = (C51707Msc) obj;
            if (c51707Msc2.A00 != 0 || !C14360o3.A0K(this.A04, c51707Msc2.A04) || !C14360o3.A0K(this.A0B, c51707Msc2.A0B) || !C14360o3.A0K(this.A09, c51707Msc2.A09) || !C14360o3.A0K(this.A02, c51707Msc2.A02) || !C14360o3.A0K(this.A05, c51707Msc2.A05) || !C14360o3.A0K(this.A0D, c51707Msc2.A0D) || !C14360o3.A0K(this.A08, c51707Msc2.A08) || !C14360o3.A0K(this.A0E, c51707Msc2.A0E) || !C14360o3.A0K(this.A03, c51707Msc2.A03) || !C14360o3.A0K(this.A0C, c51707Msc2.A0C) || !C14360o3.A0K(this.A0A, c51707Msc2.A0A) || !C14360o3.A0K(this.A06, c51707Msc2.A06) || this.A07 != c51707Msc2.A07) {
                return false;
            }
            obj2 = this.A01;
            obj3 = c51707Msc2.A01;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        Object obj;
        if (this.A00 != 0) {
            A0J = ((((((((((((((((((((((((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31;
            obj = this.A04;
        } else {
            A0J = AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A0C, (((((AbstractC166997dE.A0K(this.A0D, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A0B, AbstractC166987dD.A0G(this.A04)))))) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31))));
            obj = this.A01;
        }
        return A0J + AbstractC166997dE.A0I(obj);
    }

    public C51707Msc(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4) {
        this.A05 = list;
        this.A06 = list2;
        this.A07 = list3;
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A0C = str5;
        this.A0D = str6;
        this.A0E = str7;
        this.A04 = list4;
    }
}
