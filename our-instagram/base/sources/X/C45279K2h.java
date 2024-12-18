package X;

import com.facebook.msys.mci.AuthData;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.K2h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45279K2h extends C0T6 implements InterfaceC37093GWc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C26076Bg5 A06;
    public final E72 A07;
    public final C45125Jxu A08;
    public final C45120Jxp A09;
    public final AuthData A0A;
    public final C160847Is A0B;
    public final MessagingUser A0C;
    public final C47750L6u A0D;
    public final MsysThreadId A0E;
    public final C2056698q A0F;
    public final Long A0G;
    public final Long A0H;
    public final String A0I;
    public final java.util.Set A0J;

    public static final C45279K2h A00(C26076Bg5 c26076Bg5, E72 e72, C45125Jxu c45125Jxu, C45120Jxp c45120Jxp, AuthData authData, C160847Is c160847Is, MessagingUser messagingUser, C47750L6u c47750L6u, MsysThreadId msysThreadId, C2056698q c2056698q, Long l, Long l2, String str, java.util.Set set, int i, int i2, int i3, int i4, int i5, int i6) {
        C14360o3.A0B(messagingUser, 0);
        AbstractC167027dH.A13(msysThreadId, authData, c2056698q);
        AbstractC167017dG.A1U(c160847Is, c47750L6u);
        C14360o3.A0B(set, 15);
        return new C45279K2h(c26076Bg5, e72, c45125Jxu, c45120Jxp, authData, c160847Is, messagingUser, c47750L6u, msysThreadId, c2056698q, l, l2, str, set, i, i2, i3, i4, i5, i6);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45279K2h) {
                C45279K2h c45279K2h = (C45279K2h) obj;
                if (!C14360o3.A0K(this.A0C, c45279K2h.A0C) || !C14360o3.A0K(this.A0E, c45279K2h.A0E) || !C14360o3.A0K(this.A0A, c45279K2h.A0A) || !C14360o3.A0K(this.A0F, c45279K2h.A0F) || this.A05 != c45279K2h.A05 || !C14360o3.A0K(this.A08, c45279K2h.A08) || !C14360o3.A0K(this.A0B, c45279K2h.A0B) || !C14360o3.A0K(this.A0D, c45279K2h.A0D) || !C14360o3.A0K(this.A06, c45279K2h.A06) || !C14360o3.A0K(this.A0H, c45279K2h.A0H) || !C14360o3.A0K(this.A0G, c45279K2h.A0G) || this.A04 != c45279K2h.A04 || this.A03 != c45279K2h.A03 || this.A02 != c45279K2h.A02 || this.A01 != c45279K2h.A01 || !C14360o3.A0K(this.A0J, c45279K2h.A0J) || !C14360o3.A0K(this.A07, c45279K2h.A07) || !C14360o3.A0K(this.A09, c45279K2h.A09) || !C14360o3.A0K(this.A0I, c45279K2h.A0I) || this.A00 != c45279K2h.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A0J, (((((((((((((AbstractC166997dE.A0J(this.A0D, AbstractC166997dE.A0J(this.A0B, (((AbstractC166997dE.A0J(this.A0F, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A0E, AbstractC166987dD.A0G(this.A0C)))) + this.A05) * 31) + AbstractC167017dG.A0M(this.A08)) * 31)) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0H)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC25227BEk.A07(this.A0I)) * 31) + this.A00;
    }

    public C45279K2h(C26076Bg5 c26076Bg5, E72 e72, C45125Jxu c45125Jxu, C45120Jxp c45120Jxp, AuthData authData, C160847Is c160847Is, MessagingUser messagingUser, C47750L6u c47750L6u, MsysThreadId msysThreadId, C2056698q c2056698q, Long l, Long l2, String str, java.util.Set set, int i, int i2, int i3, int i4, int i5, int i6) {
        AbstractC167017dG.A1Q(messagingUser, authData);
        this.A0C = messagingUser;
        this.A0E = msysThreadId;
        this.A0A = authData;
        this.A0F = c2056698q;
        this.A05 = i;
        this.A08 = c45125Jxu;
        this.A0B = c160847Is;
        this.A0D = c47750L6u;
        this.A06 = c26076Bg5;
        this.A0H = l;
        this.A0G = l2;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A0J = set;
        this.A07 = e72;
        this.A09 = c45120Jxp;
        this.A0I = str;
        this.A00 = i6;
    }
}
