package X;

import com.facebook.common.dextricks.Constants;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Saj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63019Saj {
    public C2JO A00;
    public ImmutableList A01;
    public final C2JO A02;
    public final C2JO A03;
    public final OtcInput A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public C63019Saj(C2JO c2jo, C2JO c2jo2, C2JO c2jo3, OtcInput otcInput, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC167007dF.A1G(str2, 2, str4);
        this.A0F = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A01 = immutableList;
        this.A0B = str4;
        this.A06 = immutableList2;
        this.A05 = immutableList3;
        this.A02 = c2jo;
        this.A09 = str5;
        this.A07 = str6;
        this.A0D = str7;
        this.A08 = str8;
        this.A0A = str9;
        this.A04 = otcInput;
        this.A03 = c2jo2;
        this.A00 = c2jo3;
    }

    public final void A01(ImmutableList immutableList) {
        C14360o3.A0B(immutableList, 0);
        this.A01 = immutableList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63019Saj) {
                C63019Saj c63019Saj = (C63019Saj) obj;
                if (!C14360o3.A0K(this.A0F, c63019Saj.A0F) || !C14360o3.A0K(this.A0E, c63019Saj.A0E) || !C14360o3.A0K(this.A0C, c63019Saj.A0C) || !C14360o3.A0K(this.A01, c63019Saj.A01) || !C14360o3.A0K(this.A0B, c63019Saj.A0B) || !C14360o3.A0K(this.A06, c63019Saj.A06) || !C14360o3.A0K(this.A05, c63019Saj.A05) || !C14360o3.A0K(this.A02, c63019Saj.A02) || !C14360o3.A0K(this.A09, c63019Saj.A09) || !C14360o3.A0K(this.A07, c63019Saj.A07) || !C14360o3.A0K(this.A0D, c63019Saj.A0D) || !C14360o3.A0K(this.A08, c63019Saj.A08) || !C14360o3.A0K(this.A0A, c63019Saj.A0A) || !C14360o3.A0K(this.A04, c63019Saj.A04) || !C14360o3.A0K(this.A03, c63019Saj.A03) || !C14360o3.A0K(this.A00, c63019Saj.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C63019Saj A00(C63019Saj c63019Saj, OtcInput otcInput, ImmutableList immutableList, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        C2JO c2jo;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C2JO c2jo2;
        OtcInput otcInput2 = otcInput;
        ImmutableList immutableList4 = immutableList;
        C2JO c2jo3 = null;
        if ((i & 1) != 0) {
            str = c63019Saj.A0F;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c63019Saj.A0E;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = c63019Saj.A0C;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            immutableList4 = c63019Saj.A01;
        }
        if ((i & 16) != 0) {
            str4 = c63019Saj.A0B;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            immutableList2 = c63019Saj.A06;
        } else {
            immutableList2 = null;
        }
        if ((i & 64) != 0) {
            immutableList3 = c63019Saj.A05;
        } else {
            immutableList3 = null;
        }
        if ((i & 128) != 0) {
            c2jo = c63019Saj.A02;
        } else {
            c2jo = null;
        }
        if ((i & 256) != 0) {
            str5 = c63019Saj.A09;
        } else {
            str5 = null;
        }
        if ((i & 512) != 0) {
            str6 = c63019Saj.A07;
        } else {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            str7 = c63019Saj.A0D;
        } else {
            str7 = null;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            str8 = c63019Saj.A08;
        } else {
            str8 = null;
        }
        if ((i & 4096) != 0) {
            str9 = c63019Saj.A0A;
        } else {
            str9 = null;
        }
        if ((i & 8192) != 0) {
            otcInput2 = c63019Saj.A04;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            c2jo2 = c63019Saj.A03;
        } else {
            c2jo2 = null;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            c2jo3 = c63019Saj.A00;
        }
        C14360o3.A0B(str, 0);
        JQ0.A1O(str2, str3, immutableList4, str4, immutableList2);
        C14360o3.A0B(immutableList3, 6);
        C14360o3.A0B(str5, 8);
        return new C63019Saj(c2jo, c2jo2, c2jo3, otcInput2, immutableList4, immutableList2, immutableList3, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final int hashCode() {
        return ((((((((((((AbstractC166997dE.A0K(this.A09, (AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0K(this.A0B, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A0C, AbstractC166997dE.A0K(this.A0E, AbstractC166987dD.A0J(this.A0F))))))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ComponentDataQueryInput(sessionId=");
        A1C.append(this.A0F);
        A1C.append(MSV.A00(69));
        A1C.append(this.A0E);
        A1C.append(", paymentProductId=");
        A1C.append(this.A0C);
        A1C.append(", componentTypes=");
        A1C.append(this.A01);
        A1C.append(", paymentContainerMode=");
        A1C.append(this.A0B);
        A1C.append(", supportedContainerTypes=");
        A1C.append(this.A06);
        A1C.append(", paymentActionTypes=");
        A1C.append(this.A05);
        A1C.append(", chargeAmount=");
        A1C.append(this.A02);
        A1C.append(", fetchType=");
        A1C.append(this.A09);
        A1C.append(", clientReceiverId=");
        A1C.append(this.A07);
        A1C.append(", receiverId=");
        A1C.append(this.A0D);
        A1C.append(", ecpUserExperienceType=");
        A1C.append(this.A08);
        A1C.append(", orderId=");
        A1C.append(this.A0A);
        A1C.append(", otcInput=");
        A1C.append(this.A04);
        A1C.append(", otcComponentInput=");
        A1C.append(this.A03);
        A1C.append(", bloksParams=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
