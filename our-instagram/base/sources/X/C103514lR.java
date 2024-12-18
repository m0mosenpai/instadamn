package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103514lR extends C0T6 implements InterfaceC103524lS {
    public final NoteCustomThemeImpl A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Long A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;

    @Override // X.InterfaceC103524lS
    public final InterfaceC103524lS E9C(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC103524lS
    public final C103514lR EwL(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C103514lR) {
                C103514lR c103514lR = (C103514lR) obj;
                if (!C14360o3.A0K(this.A04, c103514lR.A04) || !C14360o3.A0K(this.A05, c103514lR.A05) || !C14360o3.A0K(this.A00, c103514lR.A00) || !C14360o3.A0K(this.A0B, c103514lR.A0B) || !C14360o3.A0K(this.A06, c103514lR.A06) || !C14360o3.A0K(this.A02, c103514lR.A02) || !C14360o3.A0K(this.A07, c103514lR.A07) || !C14360o3.A0K(this.A08, c103514lR.A08) || !C14360o3.A0K(this.A0C, c103514lR.A0C) || !C14360o3.A0K(this.A09, c103514lR.A09) || !C14360o3.A0K(this.A01, c103514lR.A01) || !C14360o3.A0K(this.A0A, c103514lR.A0A) || !C14360o3.A0K(this.A03, c103514lR.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A04;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.A05;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        NoteCustomThemeImpl noteCustomThemeImpl = this.A00;
        int hashCode3 = (hashCode2 + (noteCustomThemeImpl == null ? 0 : noteCustomThemeImpl.hashCode())) * 31;
        List list = this.A0B;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.A06;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A07;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.A0C;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        User user = this.A01;
        int hashCode11 = (hashCode10 + (user == null ? 0 : user.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.A03;
        return hashCode12 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // X.InterfaceC103524lS
    public final /* bridge */ /* synthetic */ CUR AKP() {
        return new CUR(this);
    }

    @Override // X.InterfaceC103524lS
    public final Integer AdU() {
        return this.A04;
    }

    @Override // X.InterfaceC103524lS
    public final Long Asa() {
        return this.A05;
    }

    @Override // X.InterfaceC103524lS
    public final NoteCustomTheme AvO() {
        return this.A00;
    }

    @Override // X.InterfaceC103524lS
    public final List B07() {
        return this.A0B;
    }

    @Override // X.InterfaceC103524lS
    public final Long B3C() {
        return this.A06;
    }

    @Override // X.InterfaceC103524lS
    public final Boolean BCr() {
        return this.A02;
    }

    @Override // X.InterfaceC103524lS
    public final List Bkk() {
        return this.A0C;
    }

    @Override // X.InterfaceC103524lS
    public final User CDj() {
        return this.A01;
    }

    @Override // X.InterfaceC103524lS
    public final Boolean CG8() {
        return this.A03;
    }

    @Override // X.InterfaceC103524lS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaNoteResponse", CDL.A00(this));
    }

    @Override // X.InterfaceC103524lS
    public final String getId() {
        return this.A07;
    }

    @Override // X.InterfaceC103524lS
    public final String getMediaId() {
        return this.A08;
    }

    @Override // X.InterfaceC103524lS
    public final String getText() {
        return this.A09;
    }

    @Override // X.InterfaceC103524lS
    public final String getUserId() {
        return this.A0A;
    }

    public C103514lR(NoteCustomThemeImpl noteCustomThemeImpl, User user, Boolean bool, Boolean bool2, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, List list, List list2) {
        this.A04 = num;
        this.A05 = l;
        this.A00 = noteCustomThemeImpl;
        this.A0B = list;
        this.A06 = l2;
        this.A02 = bool;
        this.A07 = str;
        this.A08 = str2;
        this.A0C = list2;
        this.A09 = str3;
        this.A01 = user;
        this.A0A = str4;
        this.A03 = bool2;
    }
}
