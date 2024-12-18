package X;

import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.4FM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FM extends C4F4 {
    public C59062n7 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final NoteCustomThemeImpl A05;
    public final User A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final Map A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C4FM(NoteCustomThemeImpl noteCustomThemeImpl, User user, Boolean bool, String str, String str2, String str3, String str4, String str5, List list, Map map, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(user, 2);
        C14360o3.A0B(map, 4);
        this.A0A = str;
        this.A06 = user;
        this.A0G = z;
        this.A0E = map;
        this.A02 = i;
        this.A0F = z2;
        this.A0D = list;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A0C = str2;
        this.A0B = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A07 = bool;
        this.A05 = noteCustomThemeImpl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4FM) {
                C4FM c4fm = (C4FM) obj;
                if (!C14360o3.A0K(this.A0A, c4fm.A0A) || !C14360o3.A0K(this.A06, c4fm.A06) || this.A0G != c4fm.A0G || !C14360o3.A0K(this.A0E, c4fm.A0E) || this.A02 != c4fm.A02 || this.A0F != c4fm.A0F || !C14360o3.A0K(this.A0D, c4fm.A0D) || this.A01 != c4fm.A01 || this.A03 != c4fm.A03 || this.A04 != c4fm.A04 || !C14360o3.A0K(this.A0C, c4fm.A0C) || !C14360o3.A0K(this.A0B, c4fm.A0B) || !C14360o3.A0K(this.A08, c4fm.A08) || !C14360o3.A0K(this.A09, c4fm.A09) || !C14360o3.A0K(this.A07, c4fm.A07) || !C14360o3.A0K(this.A05, c4fm.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = ((this.A0A.hashCode() * 31) + this.A06.hashCode()) * 31;
        int i = 1237;
        if (this.A0G) {
            i = 1231;
        }
        int hashCode8 = (((((hashCode7 + i) * 31) + this.A0E.hashCode()) * 31) + this.A02) * 31;
        int i2 = 1237;
        if (this.A0F) {
            i2 = 1231;
        }
        int i3 = (hashCode8 + i2) * 31;
        List list = this.A0D;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (((((((i3 + hashCode) * 31) + this.A01) * 31) + this.A03) * 31) + this.A04) * 31;
        String str = this.A0C;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str2 = this.A0B;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        String str3 = this.A08;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        String str4 = this.A09;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        Boolean bool = this.A07;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        NoteCustomThemeImpl noteCustomThemeImpl = this.A05;
        if (noteCustomThemeImpl != null) {
            i4 = noteCustomThemeImpl.hashCode();
        }
        return i10 + i4;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
