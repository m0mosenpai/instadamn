package X;

import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4F5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F5 extends C0T6 implements InterfaceC66482zP {
    public C59072n8 A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final NoteCustomTheme A06;
    public final NotePogImageDict A07;
    public final NotePogVideoDict A08;
    public final NoteAudience A09;
    public final User A0A;
    public final Boolean A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public C4F5(NoteCustomTheme noteCustomTheme, NotePogImageDict notePogImageDict, NotePogVideoDict notePogVideoDict, NoteAudience noteAudience, User user, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, List list6, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        C6C9 BXJ;
        String str5;
        C14360o3.A0B(user, 1);
        this.A0A = user;
        this.A0P = z;
        this.A0J = list;
        this.A02 = num;
        this.A03 = str;
        this.A01 = num2;
        this.A0W = z2;
        this.A04 = z3;
        this.A0S = z4;
        this.A0O = z5;
        this.A0T = z6;
        this.A0G = str2;
        this.A0D = num3;
        this.A0C = num4;
        this.A0M = list2;
        this.A0H = str3;
        this.A0R = z7;
        this.A05 = i;
        this.A08 = notePogVideoDict;
        this.A07 = notePogImageDict;
        this.A0E = str4;
        this.A09 = noteAudience;
        this.A0X = z8;
        this.A0Q = z9;
        this.A0L = list3;
        this.A0B = bool;
        this.A0N = list4;
        this.A0Y = z10;
        this.A0V = z11;
        this.A06 = noteCustomTheme;
        this.A0U = z12;
        this.A0I = list5;
        this.A0K = list6;
        InterfaceC50424MOe interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0J(list);
        this.A0F = z9 ? (interfaceC50424MOe == null || (BXJ = interfaceC50424MOe.BXJ()) == null || (str5 = BXJ.A0H) == null) ? "" : str5 : null;
    }

    public final boolean equals(Object obj) {
        C4F5 c4f5;
        if (this != obj) {
            Class<?> cls = getClass();
            Class<?> cls2 = null;
            if (obj != null) {
                cls2 = obj.getClass();
            }
            if (!C14360o3.A0K(cls, cls2) || !(obj instanceof C4F5) || (c4f5 = (C4F5) obj) == null || !C14360o3.A0K(this.A0A, c4f5.A0A) || this.A0P != c4f5.A0P || !C14360o3.A0K(this.A0J, c4f5.A0J) || !C14360o3.A0K(this.A02, c4f5.A02) || !C14360o3.A0K(this.A03, c4f5.A03) || !C14360o3.A0K(this.A01, c4f5.A01) || this.A04 != c4f5.A04 || this.A0S != c4f5.A0S || !C14360o3.A0K(this.A0G, c4f5.A0G) || !C14360o3.A0K(this.A0D, c4f5.A0D) || !C14360o3.A0K(this.A0C, c4f5.A0C) || !C14360o3.A0K(this.A0M, c4f5.A0M) || !C14360o3.A0K(this.A0H, c4f5.A0H) || !C14360o3.A0K(this.A08, c4f5.A08) || !C14360o3.A0K(this.A07, c4f5.A07) || !C14360o3.A0K(this.A0E, c4f5.A0E) || this.A09 != c4f5.A09 || this.A0X != c4f5.A0X || this.A0Q != c4f5.A0Q || !C14360o3.A0K(this.A0B, c4f5.A0B) || !C14360o3.A0K(this.A0L, c4f5.A0L) || !C14360o3.A0K(this.A0N, c4f5.A0N) || this.A0R != c4f5.A0R || this.A05 != c4f5.A05 || !C14360o3.A0K(this.A0F, c4f5.A0F) || this.A0Y != c4f5.A0Y || this.A0V != c4f5.A0V || !C14360o3.A0K(this.A06, c4f5.A06) || this.A0U != c4f5.A0U || !C14360o3.A0K(this.A0I, c4f5.A0I)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0g(this.A0A.getId(), this.A0G, this.A0F);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int hashCode = this.A0A.hashCode() * 31;
        int i18 = 1237;
        if (this.A0P) {
            i18 = 1231;
        }
        int hashCode2 = (((hashCode + i18) * 31) + this.A0J.hashCode()) * 31;
        Integer num = this.A02;
        int i19 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int i20 = (hashCode2 + i) * 31;
        String str = this.A03;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i21 = (i20 + i2) * 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = 0;
        }
        int i22 = (i21 + i3) * 31;
        String str2 = this.A0G;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i23 = (i22 + i4) * 31;
        int i24 = 1237;
        if (this.A0S) {
            i24 = 1231;
        }
        int i25 = (i23 + i24) * 31;
        Integer num3 = this.A0D;
        if (num3 != null) {
            i5 = num3.hashCode();
        } else {
            i5 = 0;
        }
        int i26 = (i25 + i5) * 31;
        Integer num4 = this.A0C;
        if (num4 != null) {
            i6 = num4.hashCode();
        } else {
            i6 = 0;
        }
        int i27 = (i26 + i6) * 31;
        List list = this.A0M;
        if (list != null) {
            i7 = list.hashCode();
        } else {
            i7 = 0;
        }
        int i28 = (i27 + i7) * 31;
        String str3 = this.A0H;
        if (str3 != null) {
            i8 = str3.hashCode();
        } else {
            i8 = 0;
        }
        int i29 = (i28 + i8) * 31;
        NotePogVideoDict notePogVideoDict = this.A08;
        if (notePogVideoDict != null) {
            i9 = notePogVideoDict.hashCode();
        } else {
            i9 = 0;
        }
        int i30 = (i29 + i9) * 31;
        NotePogImageDict notePogImageDict = this.A07;
        if (notePogImageDict != null) {
            i10 = notePogImageDict.hashCode();
        } else {
            i10 = 0;
        }
        int i31 = (i30 + i10) * 31;
        String str4 = this.A0E;
        if (str4 != null) {
            i11 = str4.hashCode();
        } else {
            i11 = 0;
        }
        int i32 = (i31 + i11) * 31;
        NoteAudience noteAudience = this.A09;
        if (noteAudience != null) {
            i12 = noteAudience.hashCode();
        } else {
            i12 = 0;
        }
        int i33 = (i32 + i12) * 31;
        int i34 = 1237;
        if (this.A0X) {
            i34 = 1231;
        }
        int i35 = (i33 + i34) * 31;
        int i36 = 1237;
        if (this.A0Q) {
            i36 = 1231;
        }
        int i37 = (i35 + i36) * 31;
        Boolean bool = this.A0B;
        if (bool != null) {
            i13 = bool.hashCode();
        } else {
            i13 = 0;
        }
        int i38 = (i37 + i13) * 31;
        List list2 = this.A0L;
        if (list2 != null) {
            i14 = list2.hashCode();
        } else {
            i14 = 0;
        }
        int i39 = (i38 + i14) * 31;
        List list3 = this.A0N;
        if (list3 != null) {
            i15 = list3.hashCode();
        } else {
            i15 = 0;
        }
        int i40 = (i39 + i15) * 31;
        int i41 = 1237;
        if (this.A0R) {
            i41 = 1231;
        }
        int i42 = (((i40 + i41) * 31) + this.A05) * 31;
        String str5 = this.A0F;
        if (str5 != null) {
            i16 = str5.hashCode();
        } else {
            i16 = 0;
        }
        int i43 = (i42 + i16) * 31;
        int i44 = 1237;
        if (this.A0Y) {
            i44 = 1231;
        }
        int i45 = (i43 + i44) * 31;
        int i46 = 1237;
        if (this.A0V) {
            i46 = 1231;
        }
        int i47 = (i45 + i46) * 31;
        NoteCustomTheme noteCustomTheme = this.A06;
        if (noteCustomTheme != null) {
            i17 = noteCustomTheme.hashCode();
        } else {
            i17 = 0;
        }
        int i48 = (i47 + i17) * 31;
        int i49 = 1237;
        if (this.A0U) {
            i49 = 1231;
        }
        int i50 = (i48 + i49) * 31;
        List list4 = this.A0I;
        if (list4 != null) {
            i19 = list4.hashCode();
        }
        return i50 + i19;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
