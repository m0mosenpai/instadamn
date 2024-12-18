package X;

import android.view.View;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.clips.intf.ClipsViewerConfig;
import java.util.List;

/* loaded from: classes9.dex */
public final class MVN extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MVN() {
        this((InterfaceC124555kH) null, (InterfaceC58232Prc) null, LimitedInteractionsVersions.A04, (Boolean) null, (Long) null, (Long) null, false, false);
        this.A00 = 1;
    }

    public static MVN A00(MVN mvn, InterfaceC124555kH interfaceC124555kH, InterfaceC58232Prc interfaceC58232Prc, Boolean bool, boolean z) {
        Long l = (Long) mvn.A04;
        Long l2 = (Long) mvn.A05;
        LimitedInteractionsVersions limitedInteractionsVersions = (LimitedInteractionsVersions) mvn.A06;
        boolean z2 = mvn.A07;
        C14360o3.A0B(limitedInteractionsVersions, 5);
        return new MVN(interfaceC124555kH, interfaceC58232Prc, limitedInteractionsVersions, bool, l, l2, z2, z);
    }

    public final void A01(View view, boolean z) {
        Number number = (Number) this.A05;
        float f = 0.0f;
        if (number != null) {
            float floatValue = number.floatValue();
            if (z) {
                floatValue = 0.0f;
            }
            view.setTranslationX(floatValue);
        }
        Number number2 = (Number) this.A06;
        if (number2 != null) {
            float floatValue2 = number2.floatValue();
            if (!z) {
                f = floatValue2;
            }
            view.setTranslationY(f);
        }
        Number number3 = (Number) this.A03;
        float f2 = 1.0f;
        if (number3 != null) {
            float floatValue3 = number3.floatValue();
            if (z) {
                floatValue3 = 1.0f;
            }
            view.setScaleX(floatValue3);
        }
        Number number4 = (Number) this.A04;
        if (number4 != null) {
            float floatValue4 = number4.floatValue();
            if (z) {
                floatValue4 = 1.0f;
            }
            view.setScaleY(floatValue4);
        }
        Number number5 = (Number) this.A01;
        if (number5 != null) {
            float floatValue5 = number5.floatValue();
            if (!z) {
                f2 = floatValue5;
            }
            view.setAlpha(f2);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof MVN)) {
                        return false;
                    }
                    MVN mvn = (MVN) obj;
                    if (mvn.A00 != 0 || !C14360o3.A0K(this.A05, mvn.A05) || !C14360o3.A0K(this.A06, mvn.A06) || !C14360o3.A0K(this.A03, mvn.A03) || !C14360o3.A0K(this.A04, mvn.A04) || !C14360o3.A0K(this.A01, mvn.A01) || !C14360o3.A0K(this.A02, mvn.A02) || this.A08 != mvn.A08) {
                        return false;
                    }
                    z = this.A07;
                    z2 = mvn.A07;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof MVN)) {
                        return false;
                    }
                    MVN mvn2 = (MVN) obj;
                    if (mvn2.A00 != 1 || !C14360o3.A0K(this.A01, mvn2.A01) || !C14360o3.A0K(this.A02, mvn2.A02) || !C14360o3.A0K(this.A03, mvn2.A03) || !C14360o3.A0K(this.A04, mvn2.A04) || !C14360o3.A0K(this.A05, mvn2.A05) || this.A06 != mvn2.A06 || this.A07 != mvn2.A07) {
                        return false;
                    }
                    z = this.A08;
                    z2 = mvn2.A08;
                    break;
                } else {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof MVN) {
                        MVN mvn3 = (MVN) obj;
                        if (mvn3.A00 != 2 || !C14360o3.A0K(this.A04, mvn3.A04) || !C14360o3.A0K(this.A05, mvn3.A05) || this.A07 != mvn3.A07 || !C14360o3.A0K(this.A01, mvn3.A01) || this.A02 != mvn3.A02 || this.A08 != mvn3.A08 || !C14360o3.A0K(this.A06, mvn3.A06) || !C14360o3.A0K(this.A03, mvn3.A03)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L8a;
                case 1: goto L4f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A04
            int r1 = X.AbstractC166987dD.A0G(r0)
            java.lang.Object r0 = r3.A05
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            boolean r0 = r3.A07
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
            int r2 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A02
            int r1 = X.AbstractC166987dD.A0H(r0)
            switch(r1) {
                case 1: goto L40;
                case 2: goto L43;
                case 3: goto L46;
                case 4: goto L49;
                case 5: goto L4c;
                default: goto L26;
            }
        L26:
            java.lang.String r0 = "ORGANIC_OR_AD_SINGLE_AUTHOR"
        L28:
            int r1 = X.AbstractC25231BEo.A0H(r0, r1, r2)
            boolean r0 = r3.A08
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A06
            int r2 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A03
            int r0 = r0.hashCode()
        L3e:
            int r2 = r2 + r0
            return r2
        L40:
            java.lang.String r0 = "ORGANIC_COLLAB"
            goto L28
        L43:
            java.lang.String r0 = "AD_DUAL_AUTHOR"
            goto L28
        L46:
            java.lang.String r0 = "POLITICAL_AD_SINGLE_AUTHOR"
            goto L28
        L49:
            java.lang.String r0 = "GROUP_PROFILE"
            goto L28
        L4c:
            java.lang.String r0 = "CLIPS_SPINS"
            goto L28
        L4f:
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A05
            int r0 = X.AbstractC166997dE.A0I(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A06
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            boolean r0 = r3.A07
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r1 = r3.A08
            goto Lc7
        L8a:
            java.lang.Object r0 = r3.A05
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A06
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC166997dE.A0I(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A08
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r1 = r3.A07
        Lc7:
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L3e
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVN.hashCode():int");
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridItemAnimation(translationX=");
        A1C.append(this.A05);
        A1C.append(", translationY=");
        A1C.append(this.A06);
        A1C.append(", scaleX=");
        A1C.append(this.A03);
        A1C.append(", scaleY=");
        A1C.append(this.A04);
        A1C.append(", alpha=");
        A1C.append(this.A01);
        A1C.append(", option=");
        A1C.append(this.A02);
        A1C.append(", existsBefore=");
        A1C.append(this.A08);
        A1C.append(", existsAfter=");
        return AbstractC25236BEt.A0a(A1C, this.A07);
    }

    public MVN(C26076Bg5 c26076Bg5, Float f, Float f2, Float f3, Float f4, Float f5, int i, boolean z, boolean z2) {
        this.A00 = 0;
        f = (i & 1) != 0 ? null : f;
        f2 = (i & 2) != 0 ? null : f2;
        f3 = (i & 4) != 0 ? null : f3;
        f4 = (i & 8) != 0 ? null : f4;
        f5 = (i & 16) != 0 ? null : f5;
        c26076Bg5 = (i & 32) != 0 ? null : c26076Bg5;
        this.A00 = 0;
        this.A05 = f;
        this.A06 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A01 = f5;
        this.A02 = c26076Bg5;
        this.A08 = z;
        this.A07 = z2;
    }

    public MVN(InterfaceC124555kH interfaceC124555kH, InterfaceC58232Prc interfaceC58232Prc, LimitedInteractionsVersions limitedInteractionsVersions, Boolean bool, Long l, Long l2, boolean z, boolean z2) {
        this.A00 = 1;
        this.A01 = bool;
        this.A02 = interfaceC124555kH;
        this.A03 = interfaceC58232Prc;
        this.A04 = l;
        this.A05 = l2;
        this.A06 = limitedInteractionsVersions;
        this.A07 = z;
        this.A08 = z2;
    }

    public MVN(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, Integer num, List list, boolean z, boolean z2) {
        this.A00 = 2;
        C14360o3.A0B(num, 5);
        this.A04 = c120985dq;
        this.A05 = c37644Ghd;
        this.A07 = z;
        this.A01 = list;
        this.A02 = num;
        this.A08 = z2;
        this.A06 = c38321qM;
        this.A03 = clipsViewerConfig;
    }
}
