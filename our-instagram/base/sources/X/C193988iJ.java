package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8iJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193988iJ {
    public C51u A00;
    public boolean A01;
    public final UserSession A02;
    public final C1810981l A03;
    public final C193958iG A04;
    public final C8YY A05;
    public final GalleryMemoriesViewModel A06;
    public final ClipsCreationViewModel A07;
    public final C89P A08;
    public final InterfaceC16820sZ A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final AbstractC59962oe A0E;
    public final InterfaceC16820sZ A0F;
    public final boolean A0G;

    public C193988iJ(AbstractC59962oe abstractC59962oe, UserSession userSession, C1810981l c1810981l, C193958iG c193958iG, C8YY c8yy, GalleryMemoriesViewModel galleryMemoriesViewModel, ClipsCreationViewModel clipsCreationViewModel, C89P c89p, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(c193958iG, 15);
        this.A0E = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = c1810981l;
        this.A0G = z;
        this.A05 = c8yy;
        this.A0D = z2;
        this.A0C = z3;
        this.A08 = c89p;
        this.A07 = clipsCreationViewModel;
        this.A0B = z4;
        this.A0F = interfaceC16820sZ;
        this.A09 = interfaceC16820sZ2;
        this.A0A = z5;
        this.A06 = galleryMemoriesViewModel;
        this.A04 = c193958iG;
        this.A00 = new C51u(false, false, false);
    }

    public final boolean A00() {
        return ((Boolean) this.A00.A00).booleanValue();
    }

    public final boolean A01() {
        if ((this.A03.A08.A00 instanceof C208509Kk) && A04()) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36330823414203426L)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A02() {
        String string = this.A0E.requireArguments().getString("ARGS_CAMERA_TOOL_ID");
        if (string == null || C8GX.A03(string) != C81W.A0s) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        Object obj = this.A03.A08.A00;
        if (obj instanceof C81V) {
            if (!A04()) {
                return false;
            }
            userSession = this.A02;
            c06090Tz = C06090Tz.A05;
            j = 36328585736371865L;
        } else {
            if (obj instanceof C208509Kk) {
                if (!A04()) {
                    return false;
                }
                userSession = this.A02;
                c06090Tz = C06090Tz.A05;
                j = 36328413937548799L;
            }
            return true;
        }
        if (C18U.A06(c06090Tz, userSession, j)) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        Bundle bundle = this.A0E.mArguments;
        if (bundle != null && bundle.getBoolean("ARGS_HIDE_GALLERY_DESTINATION_BAR")) {
            return false;
        }
        Object obj = this.A03.A08.A00;
        if (obj instanceof C81U) {
            if (this.A01 && this.A04.A0K.getValue() == null && !this.A0D && !this.A0C && this.A08.A04 == null) {
                if (A00() || this.A05.A0Z.CLf() || !this.A07.A0s()) {
                    if (A00()) {
                        userSession = this.A02;
                        c06090Tz = C06090Tz.A05;
                        j = 36319961442295672L;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof C1811181n) && (obj instanceof C208509Kk) && this.A01 && this.A04.A0K.getValue() == null && !this.A0D && !this.A0C) {
            userSession = this.A02;
            c06090Tz = C06090Tz.A05;
            j = 36320219139940499L;
        } else {
            return false;
        }
        if (C18U.A06(c06090Tz, userSession, j)) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        if ((this.A03.A08.A00 instanceof C81V) && A06()) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36321868407383927L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06() {
        /*
            r5 = this;
            X.81l r0 = r5.A03
            X.81v r0 = r0.A08
            java.lang.Object r1 = r0.A00
            boolean r0 = r1 instanceof X.C81V
            r4 = 1
            if (r0 == 0) goto L31
            boolean r0 = r5.A04()
            if (r0 == 0) goto L57
            boolean r0 = r5.A0G
            if (r0 != 0) goto L57
            boolean r0 = r5.A02()
            if (r0 != 0) goto L57
            boolean r0 = r5.A00()
            if (r0 == 0) goto L30
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319961442295672(0x8108d000061f78, double:3.0322280926292145E-306)
        L2a:
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L57
        L30:
            return r4
        L31:
            boolean r0 = r1 instanceof X.C208509Kk
            if (r0 == 0) goto L57
            boolean r0 = r5.A0B
            if (r0 != 0) goto L57
            X.0sZ r0 = r5.A0F
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 > 0) goto L30
            boolean r0 = r5.A04()
            if (r0 == 0) goto L57
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329324470616333(0x8111540000410d, double:3.0381493094410894E-306)
            goto L2a
        L57:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193988iJ.A06():boolean");
    }

    public final boolean A07() {
        if (this.A03.A08.A00 instanceof C81V) {
            if (!A00()) {
                if (C18U.A06(C06090Tz.A05, this.A02, 36319961442099061L)) {
                    return true;
                }
            }
            if (A00()) {
                if (C18U.A06(C06090Tz.A05, this.A02, 36319961442295672L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean A08() {
        UserSession userSession = this.A02;
        Object obj = this.A03.A08.A00;
        C22P c22p = (C22P) this.A09.invoke();
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(c22p, 2);
        if (obj.equals(C208509Kk.A00) && C180457zZ.A00(c22p)) {
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            if (C6PX.A00(context)) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36327172692195686L)) {
                    if (CHW.A00(userSession).A01() && C18U.A06(c06090Tz, userSession, 36327172695341451L)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
