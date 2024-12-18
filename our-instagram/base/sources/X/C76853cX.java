package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.3cX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76853cX extends C0T6 implements InterfaceC76863cY {
    public final C9BR A00;
    public final C9BR A01;
    public final C9BU A02;
    public final C206189Bb A03;
    public final C206189Bb A04;
    public final C206249Bh A05;
    public final C51688MsJ A06;
    public final C50526MSf A07;
    public final C38681GzM A08;
    public final C76623c7 A09;
    public final C38321qM A0A;
    public final C76293bZ A0B;
    public final C76743cM A0C;
    public final InterfaceC76583c3 A0D;
    public final C75113Zb A0E;
    public final Reel A0F;
    public final User A0G;
    public final User A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76853cX) {
                C76853cX c76853cX = (C76853cX) obj;
                if (!C14360o3.A0K(this.A0A, c76853cX.A0A) || !C14360o3.A0K(this.A0E, c76853cX.A0E) || !C14360o3.A0K(this.A09, c76853cX.A09) || this.A0L != c76853cX.A0L || !C14360o3.A0K(this.A04, c76853cX.A04) || !C14360o3.A0K(this.A00, c76853cX.A00) || !C14360o3.A0K(this.A08, c76853cX.A08) || !C14360o3.A0K(this.A0F, c76853cX.A0F) || !C14360o3.A0K(this.A0D, c76853cX.A0D) || !C14360o3.A0K(this.A0G, c76853cX.A0G) || !C14360o3.A0K(this.A0H, c76853cX.A0H) || !C14360o3.A0K(this.A07, c76853cX.A07) || !C14360o3.A0K(this.A06, c76853cX.A06) || !C14360o3.A0K(this.A01, c76853cX.A01) || this.A0N != c76853cX.A0N || this.A0O != c76853cX.A0O || this.A0P != c76853cX.A0P || !C14360o3.A0K(this.A0C, c76853cX.A0C) || this.A0Q != c76853cX.A0Q || !C14360o3.A0K(this.A0B, c76853cX.A0B) || !C14360o3.A0K(this.A02, c76853cX.A02) || !C14360o3.A0K(this.A05, c76853cX.A05) || !C14360o3.A0K(this.A03, c76853cX.A03) || !C14360o3.A0K(this.A0I, c76853cX.A0I) || this.A0R != c76853cX.A0R || this.A0K != c76853cX.A0K || !C14360o3.A0K(this.A0J, c76853cX.A0J) || this.A0M != c76853cX.A0M) {
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
        int hashCode5 = ((((this.A0A.hashCode() * 31) + this.A0E.hashCode()) * 31) + this.A09.hashCode()) * 31;
        int i = 1237;
        if (this.A0L) {
            i = 1231;
        }
        int hashCode6 = (((((hashCode5 + i) * 31) + this.A04.hashCode()) * 31) + this.A00.hashCode()) * 31;
        C38681GzM c38681GzM = this.A08;
        int i2 = 0;
        if (c38681GzM == null) {
            hashCode = 0;
        } else {
            hashCode = c38681GzM.hashCode();
        }
        int i3 = (hashCode6 + hashCode) * 31;
        Reel reel = this.A0F;
        if (reel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = reel.hashCode();
        }
        int hashCode7 = (((((i3 + hashCode2) * 31) + this.A0D.hashCode()) * 31) + this.A0G.hashCode()) * 31;
        User user = this.A0H;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int hashCode8 = (((((((hashCode7 + hashCode3) * 31) + this.A07.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A01.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0N) {
            i4 = 1231;
        }
        int i5 = (hashCode8 + i4) * 31;
        int i6 = 1237;
        if (this.A0O) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0P) {
            i8 = 1231;
        }
        int hashCode9 = (((i7 + i8) * 31) + this.A0C.hashCode()) * 31;
        int i9 = 1237;
        if (this.A0Q) {
            i9 = 1231;
        }
        int hashCode10 = (((((((((hashCode9 + i9) * 31) + this.A0B.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31;
        String str = this.A0I;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i10 = (hashCode10 + hashCode4) * 31;
        int i11 = 1237;
        if (this.A0R) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0K) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        String str2 = this.A0J;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i15 = (i14 + i2) * 31;
        int i16 = 1237;
        if (this.A0M) {
            i16 = 1231;
        }
        return i15 + i16;
    }

    public C76853cX(C9BR c9br, C9BR c9br2, C9BU c9bu, C206189Bb c206189Bb, C206189Bb c206189Bb2, C206249Bh c206249Bh, C51688MsJ c51688MsJ, C50526MSf c50526MSf, C38681GzM c38681GzM, C76623c7 c76623c7, C38321qM c38321qM, C76293bZ c76293bZ, C76743cM c76743cM, InterfaceC76583c3 interfaceC76583c3, C75113Zb c75113Zb, Reel reel, User user, User user2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0A = c38321qM;
        this.A0E = c75113Zb;
        this.A09 = c76623c7;
        this.A0L = z;
        this.A04 = c206189Bb;
        this.A00 = c9br;
        this.A08 = c38681GzM;
        this.A0F = reel;
        this.A0D = interfaceC76583c3;
        this.A0G = user;
        this.A0H = user2;
        this.A07 = c50526MSf;
        this.A06 = c51688MsJ;
        this.A01 = c9br2;
        this.A0N = z2;
        this.A0O = z3;
        this.A0P = z4;
        this.A0C = c76743cM;
        this.A0Q = z5;
        this.A0B = c76293bZ;
        this.A02 = c9bu;
        this.A05 = c206249Bh;
        this.A03 = c206189Bb2;
        this.A0I = str;
        this.A0R = z6;
        this.A0K = z7;
        this.A0J = str2;
        this.A0M = z8;
    }
}
