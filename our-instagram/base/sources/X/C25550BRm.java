package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

@Deprecated(message = "Delete this after MVVM migration of ClipsUfiComponent is complete. ")
/* renamed from: X.BRm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25550BRm extends AbstractC51572Yf {
    public final ClipsViewerConfig A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC31159Dn3 A05;
    public final AbstractC25398BLp A06;
    public final InterfaceC31066Dl8 A07;
    public final BLE A08;
    public final WeakReference A09;
    public final InterfaceC16660sJ A0A;
    public final InterfaceC16660sJ A0B;
    public final InterfaceC16660sJ A0C;
    public final boolean A0D;
    public final C25377BKu A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C25550BRm(C25377BKu c25377BKu, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC31159Dn3 interfaceC31159Dn3, AbstractC25398BLp abstractC25398BLp, InterfaceC31066Dl8 interfaceC31066Dl8, BLE ble, WeakReference weakReference, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(interfaceC31066Dl8, 3);
        this.A01 = c120985dq;
        this.A08 = ble;
        this.A07 = interfaceC31066Dl8;
        this.A05 = interfaceC31159Dn3;
        this.A0E = c25377BKu;
        this.A02 = c37644Ghd;
        this.A00 = clipsViewerConfig;
        this.A09 = weakReference;
        this.A03 = userSession;
        this.A0F = z;
        this.A04 = interfaceC60442pS;
        this.A0D = z2;
        this.A0G = z3;
        this.A06 = abstractC25398BLp;
        this.A0B = DRX.A00(this, 8);
        this.A0A = DRX.A00(this, 7);
        this.A0C = DRX.A00(this, 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x04fc, code lost:
    
        if (X.C18U.A06(r0, r6, 36329032413429726L) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x04a4, code lost:
    
        if (X.C18U.A06(r2, r6, 36329032413429726L) == false) goto L130;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r90) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25550BRm.A0Y(X.3bS):X.2Vc");
    }

    private final C51682Yq A04(TextUtils.TruncateAt truncateAt, C2Z1 c2z1, C2Z3 c2z3, String str, String str2, String str3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, long j, long j2, boolean z) {
        long doubleToRawLongBits;
        long floatToRawIntBits;
        int A02;
        long j3;
        long j4 = j2;
        TypedValue typedValue = new TypedValue();
        C2XE ArD = c2z1.ArD();
        Context context = ArD.A0C;
        context.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        long A0D = AbstractC77623dm.A0D(c2z1, R.dimen.clips_viewer_media_info_ufi_button_side_margin);
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num = C05F.A00;
        C51722Yv c51722Yv = new C51722Yv(null, new C9CV(num, enumC77683ds, 3));
        Integer num2 = C05F.A0C;
        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CU(num2, 0, j));
        if (z) {
            doubleToRawLongBits = j4;
        } else {
            doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        }
        Integer num3 = C05F.A08;
        C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(c51722Yv2, new C9CU(num3, 0, A0D)), new C9CU(C05F.A0A, 0, doubleToRawLongBits));
        if (z) {
            j4 = Double.doubleToRawLongBits(0.0d);
        }
        C51722Yv c51722Yv4 = new C51722Yv(new C51722Yv(c51722Yv3, new C9CU(C05F.A1I, 0, j4)), new C9CV(C05F.A0N, str2, 0));
        Integer num4 = C05F.A01;
        C51722Yv c51722Yv5 = new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv4, new C9CV(num4, "android.widget.Button", 0)), new C9CV(C05F.A1F, interfaceC16660sJ, 4)), new C9CV(num3, str3, 4));
        if (interfaceC16660sJ2 != null) {
            c51722Yv5 = new C51722Yv(c51722Yv5, new C9CV(C05F.A03, interfaceC16660sJ2, 4));
        }
        if (interfaceC16660sJ3 != null) {
            c51722Yv5 = new C51722Yv(c51722Yv5, new C9CV(C05F.A04, interfaceC16660sJ3, 4));
        }
        if (c2z3 != null) {
            c51722Yv5 = new C51722Yv(c51722Yv5, new C9CU(num, 0, c2z3.A00));
        }
        UserSession userSession = this.A03;
        boolean A01 = BO8.A01(context, userSession);
        int A022 = c2z1.BoZ().A02(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        if (A01) {
            floatToRawIntBits = BO8.A00(context);
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(12.0f) | 9221683186994511872L;
        }
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329307291009277L)) {
            A02 = AbstractC25449BNo.A03(userSession, c2z1.BoZ().A02(R.color.black));
        } else {
            A02 = c2z1.BoZ().A02(AbstractC53242c7.A0H(context, R.attr.igds_color_shadow_on_media));
        }
        if (C18U.A06(c06090Tz, userSession, 36329307291009277L)) {
            j3 = Double.doubleToRawLongBits(AbstractC25449BNo.A01(userSession));
        } else {
            j3 = ((int) typedValue.getFloat()) | 9221401712017801216L;
        }
        Typeface create = Typeface.create("sans-serif-medium", 0);
        C14360o3.A07(create);
        Typeface A03 = AbstractC14710oj.A03(context, create, num4);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(AbstractC25449BNo.A00(userSession));
        Integer A07 = AbstractC25449BNo.A07(userSession, c2z1.BoZ().A02(R.color.black));
        long doubleToRawLongBits3 = Double.doubleToRawLongBits(0.0d);
        C77723dw A032 = C51682Yq.A03(ArD, 0);
        A032.A0W(str);
        A032.A0V(null);
        A032.A0Q(A022);
        A032.A0R(C2Z3.A00(c2z1.BoZ(), floatToRawIntBits));
        A032.A0S(0);
        A032.A0T(A03);
        A032.A0P(A02);
        A032.A0K(C2Z3.A00(c2z1.BoZ(), j3));
        A032.A0I(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits3));
        A032.A0J(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits3));
        A032.A0H(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits2));
        if (A07 != null) {
            A032.A0O(A07.intValue());
        }
        A032.A0X(num2);
        A032.A0C();
        A032.A0Y(num);
        A032.A0L(1.33f);
        A032.A0b(false);
        A032.A0N(0);
        A032.A0M(1);
        A032.A0c(true);
        A032.A0Z(false);
        A032.A0a(true);
        if (truncateAt != null) {
            A032.A0U(truncateAt);
        }
        A032.A06(null);
        AbstractC77743dy.A00(A032, c51722Yv5);
        return A032.A0A();
    }

    private final C51682Yq A05(C2Z1 c2z1, long j, long j2) {
        Integer num;
        UserSession userSession = this.A03;
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36324999438742157L);
        C38321qM c38321qM = this.A01.A02;
        if (c38321qM != null) {
            num = c38321qM.A0C.BqH();
        } else {
            num = null;
        }
        if (!CK3.A00(userSession, num, C05F.A01) || num == null) {
            return null;
        }
        String A00 = AbstractC43744JWe.A00(AbstractC25231BEo.A0M(c2z1), num, null, false);
        C14360o3.A07(A00);
        return A04(null, c2z1, null, A00, AbstractC77623dm.A0G(c2z1, num, 2131976885), "save_count", new DHP(42, this, A06), new DHP(43, this, A06), null, j, j2, false);
    }

    private final BNU A06(C2Z1 c2z1, C120985dq c120985dq, long j, long j2) {
        UserSession userSession = this.A03;
        if (C76493bt.A0M(c120985dq, userSession)) {
            long A0D = AbstractC77623dm.A0D(c2z1, R.dimen.clips_viewer_media_info_ufi_button_side_margin);
            C75933ay c75933ay = C51722Yv.A02;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && c38321qM.A12() > 0 && !C77153d1.A01(userSession, c38321qM) && C76493bt.A09(this.A00, this.A01, userSession) && !BPB.A01(userSession)) {
                A0D = AbstractC25229BEm.A0D();
            }
            if (!A08()) {
                j2 = AbstractC25229BEm.A0D();
            }
            Integer num = C05F.A08;
            C51722Yv A00 = C9CV.A00(AbstractC25234BEr.A0E(null, AbstractC25225BEi.A0n(num, 0, A0D), 0, j2), C05F.A0D, "clips_ufi_more_button_component", 4);
            Integer num2 = C05F.A00;
            C51722Yv A002 = C9CU.A00(A00, num2, 0, j);
            Integer num3 = C05F.A01;
            return new BNU(AbstractC77623dm.A0E(c2z1, R.drawable.instagram_more_vertical_outline_44), ImageView.ScaleType.FIT_CENTER, C9CV.A00(AbstractC25233BEq.A0U(C9CV.A00(AbstractC25234BEr.A0H(C9CU.A00(A002, num3, 0, j), AbstractC25231BEo.A0b(c2z1, 2131966888, 0), num2), num, "more_button", 4), AbstractC25225BEi.A0o(C05F.A1F, this.A0C, 4), num3, 0), C05F.A0B, Integer.valueOf(R.id.clips_ufi_more_button_component), 4), false);
        }
        return null;
    }

    private final BRP A07(long j, long j2) {
        Integer num;
        C120985dq c120985dq = this.A01;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            num = c38321qM.A0C.BqH();
        } else {
            num = null;
        }
        UserSession userSession = this.A03;
        C14360o3.A0B(userSession, 1);
        if (num == null || !C18U.A06(C06090Tz.A05, userSession, 36324999438611083L)) {
            return null;
        }
        return new BRP(c120985dq, this.A02, this.A08.A0F, this.A07, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A03, 36329706722705910L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.A0E.A00 == X.EnumC25466BOf.A0D) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A08() {
        /*
            r6 = this;
            X.5dq r2 = r6.A01
            boolean r0 = r2.CdW()
            r5 = 1
            if (r0 == 0) goto L19
            com.instagram.common.session.UserSession r4 = r6.A03
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36329706722705910(0x8111ad000041f6, double:3.0383910472017435E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            r4 = 1
            if (r0 != 0) goto L1a
        L19:
            r4 = 0
        L1a:
            boolean r0 = r6.A0F
            if (r0 != 0) goto L29
            if (r4 != 0) goto L29
            X.BKu r0 = r6.A0E
            X.BOf r1 = r0.A00
            X.BOf r0 = X.EnumC25466BOf.A0D
            r3 = 0
            if (r1 != r0) goto L2a
        L29:
            r3 = 1
        L2a:
            X.1qM r0 = r2.A02
            if (r4 == 0) goto L51
            if (r0 == 0) goto L85
            X.1rF r0 = r0.A0C
            com.instagram.user.model.User r0 = r0.CDj()
            if (r0 == 0) goto L85
            r0.Bhu()
        L3b:
            r1 = 1
        L3c:
            if (r3 == 0) goto L87
            X.BKu r0 = r6.A0E
            boolean r0 = r0.A0E
            if (r0 == 0) goto L87
            if (r1 == 0) goto L87
            X.1qM r1 = r2.A02
            com.instagram.common.session.UserSession r0 = r6.A03
            boolean r0 = X.AbstractC76643c9.A0H(r0, r1)
            if (r0 != 0) goto L87
            return r5
        L51:
            if (r0 == 0) goto L61
            X.1rF r0 = r0.A0C
            X.3x9 r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L61
            X.3xD r0 = X.AbstractC117245Sj.A01(r0)
            if (r0 != 0) goto L3b
        L61:
            X.1qM r0 = r2.A02
            if (r0 == 0) goto L85
            X.1rF r0 = r0.A0C
            X.3XR r0 = r0.getMusicMetadata()
            if (r0 == 0) goto L85
            com.instagram.api.schemas.MusicInfo r1 = r0.BVc()
            if (r1 == 0) goto L79
            X.3xC r0 = new X.3xC
            r0.<init>(r1)
            goto L3b
        L79:
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r0.BZw()
            if (r1 == 0) goto L85
            X.5Si r0 = new X.5Si
            r0.<init>(r1)
            goto L3b
        L85:
            r1 = 0
            goto L3c
        L87:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25550BRm.A08():boolean");
    }

    public static final long A03(C2Z1 c2z1, float f, long j, long j2) {
        C14360o3.A07(c2z1.ArD().A0D);
        int A00 = C2Z3.A00(c2z1.BoZ(), j) + C2Z3.A00(c2z1.BoZ(), C2Z3.A02(C2Z3.A01(f, j2)));
        return Double.doubleToRawLongBits(A00 / r4.A01.getDisplayMetrics().density);
    }
}
