package X;

import android.content.Context;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mta, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51751Mta extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C51751Mta) && ((C51751Mta) obj).A04 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51751Mta.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0G;
        int A0I;
        String str;
        int A0D;
        int A0I2;
        String str2;
        switch (this.A04) {
            case 1:
                A0I = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00));
                str2 = this.A02;
                A0G = str2.hashCode();
                return AbstractC166987dD.A0K(this.A03, (A0G + A0I) * 31);
            case 2:
                A0G = (AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31;
                A0I = AbstractC166997dE.A0I(this.A00);
                return AbstractC166987dD.A0K(this.A03, (A0G + A0I) * 31);
            case 3:
                int A0H = AbstractC166987dD.A0H(this.A01);
                switch (A0H) {
                    case 1:
                        str = "FAVORITE";
                        break;
                    case 2:
                        str = "SEARCH";
                        break;
                    case 3:
                        str = "YOUR_STICKERS";
                        break;
                    case 4:
                        str = "GIPHY";
                        break;
                    case 5:
                        str = "FIRST_PARTY";
                        break;
                    default:
                        str = "RECENT";
                        break;
                }
                A0D = (AbstractC167007dF.A0D(this.A03, AbstractC25228BEl.A0F(str, A0H)) + AbstractC167017dG.A0O(this.A02)) * 31;
                A0I2 = AbstractC166997dE.A0I(this.A00);
                return A0D + A0I2;
            case 4:
                A0I = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00));
                str2 = this.A02;
                if (str2 == null) {
                    A0G = 0;
                    return AbstractC166987dD.A0K(this.A03, (A0G + A0I) * 31);
                }
                A0G = str2.hashCode();
                return AbstractC166987dD.A0K(this.A03, (A0G + A0I) * 31);
            case 5:
                A0I = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02));
                A0G = this.A00.hashCode();
                return AbstractC166987dD.A0K(this.A03, (A0G + A0I) * 31);
            case 6:
                A0D = (AbstractC166997dE.A0K(this.A02, AbstractC25225BEi.A08(this.A03)) + AbstractC167017dG.A0M(this.A00)) * 31;
                A0I2 = AbstractC166997dE.A0I(this.A01);
                return A0D + A0I2;
            case 7:
                A0I2 = AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0J(this.A02)));
                A0D = AbstractC167017dG.A0M(this.A01);
                return A0D + A0I2;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        if (5 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserCopresenceState(userId=");
        A1C.append(this.A02);
        A1C.append(", inThreadStates=");
        A1C.append(this.A01);
        A1C.append(", inClipsTogetherStates=");
        A1C.append(this.A00);
        A1C.append(", copresenceEnabled=");
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }

    public static final C51751Mta A00(C74 c74, String str, List list, boolean z) {
        AbstractC167017dG.A1N(list, c74);
        return new C51751Mta(c74, str, list, z);
    }

    public C51751Mta() {
        this.A04 = 6;
        this.A04 = 6;
        this.A04 = 6;
        this.A03 = false;
        this.A02 = "";
        this.A00 = null;
        this.A01 = null;
    }

    public C51751Mta(C20030yX c20030yX, C20030yX c20030yX2, String str, boolean z) {
        this.A04 = 5;
        this.A02 = str;
        this.A01 = c20030yX;
        this.A00 = c20030yX2;
        this.A03 = z;
    }

    public C51751Mta(User user, EnumC53187Nfj enumC53187Nfj, String str, boolean z) {
        this.A04 = 7;
        this.A02 = str;
        this.A03 = z;
        this.A00 = enumC53187Nfj;
        this.A01 = user;
    }

    public C51751Mta(C74 c74, String str, List list, boolean z) {
        this.A04 = 4;
        this.A00 = list;
        this.A01 = c74;
        this.A02 = str;
        this.A03 = z;
    }

    public C51751Mta(Venue venue, String str, List list, boolean z) {
        this.A04 = 2;
        this.A01 = list;
        this.A02 = str;
        this.A00 = venue;
        this.A03 = z;
    }

    public C51751Mta(Context context, C69406Vmq c69406Vmq, String str, boolean z) {
        this.A04 = 0;
        this.A00 = context;
        this.A02 = str;
        this.A01 = c69406Vmq;
        this.A03 = z;
    }

    public C51751Mta(C51756Mtf c51756Mtf, InterfaceC111084zP interfaceC111084zP, String str, boolean z) {
        this.A04 = 1;
        AbstractC25233BEq.A0v(1, c51756Mtf, interfaceC111084zP, str);
        this.A00 = c51756Mtf;
        this.A01 = interfaceC111084zP;
        this.A02 = str;
        this.A03 = z;
    }

    public C51751Mta(Boolean bool, Integer num, int i, boolean z) {
        this.A04 = 3;
        bool = (i & 8) != 0 ? null : bool;
        this.A04 = 3;
        this.A01 = num;
        this.A03 = z;
        this.A02 = null;
        this.A00 = bool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51751Mta(C74 c74, String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(C74.A07, (String) null, (List) C16930sl.A00, true);
        this.A04 = 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51751Mta(Venue venue, String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this((Venue) null, (String) null, (List) C16930sl.A00, false);
        this.A04 = 2;
    }
}
