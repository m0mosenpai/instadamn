package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Bfg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26053Bfg extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C26053Bfg(User user, String str, String str2, String str3, List list, List list2, int i, boolean z) {
        this.A06 = str;
        this.A04 = user;
        this.A03 = list;
        this.A02 = list2;
        this.A08 = z;
        this.A01 = i;
        this.A05 = str2;
        this.A07 = str3;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26053Bfg) {
                    C26053Bfg c26053Bfg = (C26053Bfg) obj;
                    if (c26053Bfg.A00 == 1 && C14360o3.A0K(this.A06, c26053Bfg.A06) && C14360o3.A0K(this.A04, c26053Bfg.A04) && C14360o3.A0K(this.A03, c26053Bfg.A03) && C14360o3.A0K(this.A02, c26053Bfg.A02) && this.A08 == c26053Bfg.A08 && this.A01 == c26053Bfg.A01 && C14360o3.A0K(this.A05, c26053Bfg.A05)) {
                        obj2 = this.A07;
                        obj3 = c26053Bfg.A07;
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
            if (!(obj instanceof C26053Bfg)) {
                return false;
            }
            C26053Bfg c26053Bfg2 = (C26053Bfg) obj;
            if (c26053Bfg2.A00 != 0 || !C14360o3.A0K(this.A06, c26053Bfg2.A06) || this.A01 != c26053Bfg2.A01 || !C14360o3.A0K(this.A05, c26053Bfg2.A05) || !C14360o3.A0K(this.A07, c26053Bfg2.A07) || !C14360o3.A0K(this.A04, c26053Bfg2.A04) || this.A08 != c26053Bfg2.A08 || !C14360o3.A0K(this.A02, c26053Bfg2.A02)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = c26053Bfg2.A03;
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
        int hashCode;
        int i = this.A00;
        String str = this.A06;
        if (i != 0) {
            A0J = AbstractC166997dE.A0K(this.A05, (AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(str))))) + this.A01) * 31);
            hashCode = AbstractC167017dG.A0O(this.A07);
        } else {
            A0J = AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A04, (((((AbstractC166987dD.A0J(str) + this.A01) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A07)) * 31)));
            hashCode = this.A03.hashCode();
        }
        return A0J + hashCode;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NotesPogOverflowUiState(mediaId=");
        A1C.append(this.A06);
        A1C.append(", mediaPosition=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(280));
        A1C.append(this.A05);
        A1C.append(AbstractC111324zv.A00(576));
        A1C.append(this.A07);
        A1C.append(", notes=");
        A1C.append(this.A04);
        A1C.append(", isReelsViewer=");
        A1C.append(this.A08);
        A1C.append(", avatarsUiState=");
        A1C.append(this.A02);
        A1C.append(", avatarsUiStateForDragging=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }

    public C26053Bfg(C51756Mtf c51756Mtf, C51756Mtf c51756Mtf2, String str, String str2, String str3, List list, int i, boolean z) {
        this.A06 = str;
        this.A01 = i;
        this.A05 = str2;
        this.A07 = str3;
        this.A04 = list;
        this.A08 = z;
        this.A02 = c51756Mtf;
        this.A03 = c51756Mtf2;
    }
}
