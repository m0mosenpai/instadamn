package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.9LQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9LQ extends C0T6 {
    public final EnumC33503Erc A00;
    public final C24H A01;
    public final ClipsCameraCommandAction A02;
    public final EnumC185548Kw A03;
    public final InterfaceC110214xq A04;
    public final ImageUrl A05;
    public final C5JK A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9LQ) {
                C9LQ c9lq = (C9LQ) obj;
                if (!C14360o3.A0K(this.A09, c9lq.A09) || this.A06 != c9lq.A06 || this.A03 != c9lq.A03 || this.A07 != c9lq.A07 || !C14360o3.A0K(this.A0B, c9lq.A0B) || !C14360o3.A0K(this.A0A, c9lq.A0A) || !C14360o3.A0K(this.A05, c9lq.A05) || !C14360o3.A0K(this.A0F, c9lq.A0F) || !C14360o3.A0K(this.A0C, c9lq.A0C) || !C14360o3.A0K(this.A0D, c9lq.A0D) || !C14360o3.A0K(this.A0E, c9lq.A0E) || !C14360o3.A0K(this.A04, c9lq.A04) || this.A0H != c9lq.A0H || this.A0I != c9lq.A0I || this.A01 != c9lq.A01 || this.A00 != c9lq.A00 || !C14360o3.A0K(this.A08, c9lq.A08) || this.A02 != c9lq.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A06, AbstractC167017dG.A0O(this.A09) * 31));
        int intValue = this.A07.intValue();
        switch (intValue) {
            case 1:
                str = "EFFECT_BROWSER";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = MSV.A00(680);
                break;
        }
        return ((((((AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0H, (((((((((((((((((A0J + str.hashCode() + intValue) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r11.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9LQ(X.EnumC33503Erc r3, X.C24H r4, com.instagram.api.schemas.ClipsCameraCommandAction r5, X.EnumC185548Kw r6, X.InterfaceC110214xq r7, com.instagram.common.typedurl.ImageUrl r8, X.C5JK r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            r2 = this;
            X.AbstractC167017dG.A1R(r9, r6)
            r0 = 4
            X.C14360o3.A0B(r10, r0)
            r2.<init>()
            r2.A09 = r11
            r2.A06 = r9
            r2.A03 = r6
            r2.A07 = r10
            r2.A0B = r12
            r2.A0A = r13
            r2.A05 = r8
            r0 = r18
            r2.A0F = r0
            r2.A0C = r14
            r2.A0D = r15
            r0 = r16
            r2.A0E = r0
            r2.A04 = r7
            r0 = r19
            r2.A0H = r0
            r0 = r20
            r2.A0I = r0
            r2.A01 = r4
            r2.A00 = r3
            r0 = r17
            r2.A08 = r0
            r2.A02 = r5
            if (r11 == 0) goto L41
            int r1 = r11.length()
            r0 = 0
            if (r1 != 0) goto L42
        L41:
            r0 = 1
        L42:
            r0 = r0 ^ 1
            r2.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LQ.<init>(X.Erc, X.24H, com.instagram.api.schemas.ClipsCameraCommandAction, X.8Kw, X.4xq, com.instagram.common.typedurl.ImageUrl, X.5JK, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean):void");
    }
}
